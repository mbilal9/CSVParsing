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

    /*public void handleTrips(String filePath) {
        // parse data
        ArrayList<Trips> trips = new ArrayList<>();
        try {

            BufferedReader bfr = new BufferedReader(new FileReader(filePath));
            String line;
            // ignore first line bcoz it contains names only
            bfr.readLine();
            while ((line = bfr.readLine()) != null) {
                String[] columns = line.split(",");
                try {
                    //route_id,service_id,trip_id,trip_headsign,trip_short_name,direction_id,block_id,shape_id,bikes_allowed,attributes_ch
                    Trips trip =new Trips();
                    if(columns.length>0)
                        trip.setRoute_id(Double.parseDouble(columns[0].trim()));
                    if(columns.length>1)
                        trip.setService_id(Integer.parseInt(columns[1].trim()));
                    if(columns.length>2)
                        trip.setTrip_id(Integer.parseInt(columns[2].trim()));
                    if(columns.length>3)
                        trip.setHeadsign(columns[3]);
                    if(columns.length>4)
                        trip.setShortname(Integer.parseInt(columns[4].trim()));
                    if(columns.length>5)
                        trip.setDirection(Integer.parseInt(columns[5].trim()));
                    if(columns.length>6)
                        trip.setBlock(Integer.parseInt(columns[6].trim()));
                    if(columns.length>7)
                        trip.setShape(Integer.parseInt(columns[7].trim()));
                    if(columns.length>8)
                        trip.setBikes(Integer.parseInt(columns[8].trim()));
                    if(columns.length>9)
                        trip.setAttributes(Integer.parseInt(columns[9].trim()));

                    trips.add(trip);
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

            for(int i=0; i<trips.size(); i++) {
                Trips trip =trips.get(i);

                String sql = "INSERT INTO trips " +
                        "VALUES ("+trip.getRoute_id()+","+
                        trip.getService_id()+","+
                        trip.getTrip_id()+",'"+
                        trip.getHeadsign()+"',"+
                        trip.getShortname()+","+
                        trip.getDirection()+","+
                        trip.getBlock()+","+
                        trip.getShape()+","+
                        trip.getBikes()+","+
                        trip.getAttributes()+")";

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
    }*/

}
