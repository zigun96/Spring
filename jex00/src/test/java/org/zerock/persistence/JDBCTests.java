package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_ex",
				"book_ex", "book_ex")) {

			log.info(con);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT CURRENT_TIMESTAMP()");
			if( rs.next()) {
				Date date = rs.getDate(1);
				log.info(date);
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}