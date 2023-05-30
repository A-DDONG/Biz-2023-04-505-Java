package com.callor.shop.config;

public class DBContract {
	
	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "shopping";
	public static final String PASSWORD = "12341234";
	
	public static class PRODUCT {
		public static final int PCODE = 1;
		public static final int PNAME = 2;
		public static final int PITEM = 3;
		public static final int PIPRICE = 4;
		public static final int POPRICE = 5;
	}
	public static class BUYER {
		public static final int BUID = 1;
		public static final int BUNAME = 2;
		public static final int BUTEL = 3;
		public static final int BUADDR = 4;
	}
	public static class IOLIST {
		public static final int IOSEQ = 1;
		public static final int IODATE = 2;
		public static final int IOTIME = 3;
		public static final int IOBUID = 4;
		public static final int IOPCODE = 5;
		public static final int IOQUAN = 6;
		public static final int IOPRICE = 7;
	}
}
