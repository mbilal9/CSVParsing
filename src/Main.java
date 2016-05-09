/**
 * Created by Bilal on 5/9/16.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;


public class Main {

    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost/gtfs";

    //  Database credentials
    final String USER = "root";
    final String PASS = "";


    public static void main(String[] args) {
        Main main=new Main();
        main.handleAgency("GTFS/agency.txt");
       // main.handleTrips("GTFS/trips.txt");
    }


    public void handleAgency(String filePath) {
        // parse data
        ArrayList<Agency> agencies = new ArrayList<>();
        try {

            BufferedReader bfr = new BufferedReader(new FileReader(filePath));
            String line;
            // ignore first line bcoz it contains names only
            bfr.readLine();
            while ((line = bfr.readLine()) != null) {
                String[] columns = line.split(",");
                try {
                    //agency_id,agency_name,agency_url,agency_timezone,agency_lang,agency_phone
                    Agency agency=new Agency();
                    if(columns.length>0)
                        agency.setId(Integer.parseInt(columns[0].trim()));
                    if(columns.length>1)
                        agency.setName(columns[1].trim());
                    if(columns.length>2)
                        agency.setUrl(columns[2]);
                    if(columns.length>3)
                        agency.setTime(columns[3]);
                    if(columns.length>4)
                        agency.setLanguage(columns[4]);
                    if(columns.length>5)
                        agency.setPhone(Integer.parseInt(columns[5].trim()));

                    agencies.add(agency);
                } catch (Exception ek) {
                    ek.printStackTrace();
                }

            }
            bfr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // store data in tables
        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();

            for(int i=0; i<agencies.size(); i++) {
                Agency agency=agencies.get(i);

                String sql = "INSERT INTO agency " +
                        "VALUES ("+agency.getId()+",'"+
                        agency.getName()+"','"+
                        agency.getUrl()+"','"+
                        agency.getTime()+"','"+
                        agency.getLanguage()+"',"+
                        agency.getPhone()+")";

                try{stmt.executeUpdate(sql);}catch (Exception e){ }
            }

            stmt.close();
            conn.close();
        }catch(Exception se) {
            se.printStackTrace();
        }
        finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(Exception se2){
                se2.printStackTrace();
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(Exception se){
                se.printStackTrace();
            }
        }
    }


}
