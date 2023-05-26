package com.callor.memo.config;

public class DBContract {
	
	// DB 연결 정보를 변수로 선언
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "memo";
	public static final String PASSWORD = "12341234";
	
	public static class TABLE {
		public static final String MEMO = " tbl_memo ";
	}

	public static class COLUMN {
		public static class MEMO {
			
			public static final String M_SEQ = "m_seq";
			public static final String M_WRITER = "m_writer";
			public static final String M_DATE = "m_date";
			public static final String M_SUBJECT = "m_subject";
			public static final String M_CONTETN = "m_content";

		}
	}
}
