package Datadriventesting;

import GenericScript.generic_fetchdata;

public class mainmthd_fetchdatageneric {
public static void main(String[] args) {
	String val=generic_fetchdata.getdata("./Excel1/Seleniumtestdata.xlsx", "Sheet1", 1, 0);
	System.out.println(val);
	String val1=generic_fetchdata.getdata("./Excel1/Seleniumtestdata.xlsx", "Sheet1", 1, 1);
	System.out.println(val1);
	
}
}
