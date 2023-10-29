package com.banking;

public enum AcctType {
SAVING(10000),CURRENT(10000),FD(10000),DMAT(10000),LOAN(10000);
	private double minbal;


public double getMinbal() {
		return minbal;
	}


private AcctType(double minbal) {
	this.minbal=minbal;
}


}
