package com.qa.JDBCproject;


import java.sql.Connection;
import java.sql.Statement;

public class Cafe {
	
	Statement stmmt =null;
	Connection conn = null;
	JDBCpro db = new JDBCpro();
	private java.sql.Statement stmt;
	
	public void addDrink(Drink drink) {
		
		try {
            conn = db.connect();
            stmt = conn.createStatement(); 
            String query =    "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('"+ drink.getType() + "', '"+ drink.getSize() +"', " + drink.isDairyfree()+ ", "+ drink.getCost()+");";
            System.out.println(query);
            stmt.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
