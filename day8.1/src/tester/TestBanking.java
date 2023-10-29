package tester;

import static utils.BankUtils.populateMap;
import static utils.BankValidations.parseAndValidateType;
import static utils.BankValidations.validateAllInputs;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.banking.AcctType;
import com.banking.BankAccount;

import custom_exceptions.BankingException;

public class TestBanking {

	public static void main(String[] args) throws BankingException {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map from utils
			Map<Integer, BankAccount> acctMap = populateMap();

			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2. Display all accounts 3. Transfer Funds "
						+ "4.Close A/c 5. Fetch A/c Summary 6.Display Account by type 7.Freeze A/cs 0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter acct details :  acctNo,  customerName,  type,  balance,  createdOn(yr-mon-day)");
						BankAccount account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), acctMap);
						acctMap.put(account.getAcctNo(), account);
						System.out.println("new a/c created....");
						break;

					case 2:// display acct details (admin)
						System.out.println("Accts in the bank : ");
						for (BankAccount a : acctMap.values())
							System.out.println(a);
						break;
					case 3: // fund transfer (customer)
						System.out.println("Enter src a/c no , dest a/c no n transfer amount");
						// get src a/c
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid src acct no!!!!!!!!!!!");
						BankAccount dest = acctMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid dest acct no!!!!!!!!!!!");
						// transfer the funds
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("funds transferred.....");
						break;
					case 4:
						System.out.println("Enter a/c no , to close the a/c");
						account = acctMap.remove(sc.nextInt());
						if (account == null)
							throw new BankingException("Invalid  acct no, Can't close A/c !!!!!!");
						System.out.println("Closed " + account);
						break;
					case 5:
						System.out.println("Enter Acct no");
						BankAccount acc1 = acctMap.get(sc.nextInt());
						if (acc1 == null)
							throw new BankingException("Invalid acct id");
						if (acc1.isActive() == false)
							throw new BankingException("Acount Deactivated ");
						System.out.println(acc1);

						break;
					case 6:
						System.out.println("Enter Account Type");
						AcctType ac = parseAndValidateType(sc.next());
						for (BankAccount a : acctMap.values())
							if (a.getType().equals(ac))
								System.out.println(a.getCustomerName());

						break;
					case 7:
						System.out.println("--Simple Intrest--");
//						Iterator<BankAccount> itr= acctMap.values().iterator();
//						while(itr.hasNext())
//							System.out.println(itr.next());					
						System.out.println("Enter Account Type");
						AcctType ac1 = parseAndValidateType(sc.next());
						System.out.println("Enter rate of Intrest");
						double ra = sc.nextDouble();
						for (BankAccount a : acctMap.values())
							if (a.getType().equals(ac1)) 
								a.simpleinterest(ra);

							
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} // sc.close();

	}

}
