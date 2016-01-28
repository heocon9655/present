/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author HuanPMSE61860
 */
public class ItemDBAccess extends DBAccess {
    
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url = "jdbc:sqlserver://127.0.0.1\\HUANPMSE61860:1433;databaseName=ItemDB;user=sa;password=@huanvip@";

    public ItemDBAccess() {
        super();
        connectDB(driver, url);
    }
}
