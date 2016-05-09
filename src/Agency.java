/**
 * Created by Bilal on 08/05/2016.
 */

import java.sql.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Agency {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Agency(int id, String name, String url, String time, String language, int phone) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.time = time;
        this.language = language;
        this.phone = phone;
    }

    public Agency() {
    }

    int id ;
    String name ;
    String url ;
    String time;
    String language;
    int phone;


}


