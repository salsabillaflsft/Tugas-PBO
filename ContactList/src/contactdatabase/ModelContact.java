package contactdatabase;

import javax.swing.*;
import java.sql.*;

public class ModelContact {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbcontact";
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;

    public ModelContact() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public void insertContact(String nama, String no_hp, String umur, String email){
        try {
            String query = "INSERT INTO `contact`(`nama`, `no_hp`, `umur`, `email`) VALUES ('"+nama+"','"+no_hp+"','"+umur+"','"+email+"')";//value 1 (id diskip)
            //String '"+String+"' kalau Int "+int+"
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public int getBanyakData(){//menghitung jumlah baris
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from `contact`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    public String[][] readContact(){
        try{
            int jmlData = 0;

            String data[][] = new String[getBanyakData()][4]; //baris, kolom nya ada 4

            String query = "Select * from`contact`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("no_hp");
                data[jmlData][2] = resultSet.getString("umur");
                data[jmlData][3] = resultSet.getString("email");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public void updateContact (String nama, String no_hp, String umur, String email) {
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from `contact` WHERE `nama` = '"+nama+"'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                jmlData++;
            }
            if(jmlData==1) {
                query = "UPDATE `contact` SET  `nama` = '" + nama + "',`no_hp` = '" + no_hp + "', `umur` = '" + umur + "', `email` = '" + email + "' WHERE `nama` = '" + nama + "'";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diperbarui");
                JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data tidak Ditemukan");

            }
        }catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null,  sql.getMessage());
        }
    }

    public void deleteContact (String nama) {
        try{
            String query = "DELETE FROM `contact` WHERE `nama` = '"+nama+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

}
