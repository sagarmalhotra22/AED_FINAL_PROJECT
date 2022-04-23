/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 *  
 */
public class DBConnection {
       public Connection getDbcon(){
		Connection con=null;
		OracleDataSource ods;
		try{
			ods=new OracleDataSource();
			ods.setURL("");
                        
			con=ods.getConnection("");
		}
		catch(SQLException e){
                    System.out.println("Service.DBConnection.getDbcon()");
			e.printStackTrace();
		}
		return con;
       }
}
