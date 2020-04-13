package koneksidatabase;

//import static java.awt.SystemColor.window;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewPraktikum extends JFrame {
    JLabel title = new JLabel("Database Mahasiswa");
    JLabel title2 = new JLabel("Insert Data");
    JLabel title3 = new JLabel("Update Data");

    JLabel lNim = new JLabel("Nim: ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel ("Nama: ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel ("Alamat: ");
    JTextField tfAlamatMhs = new JTextField();

    JLabel lNim2 = new JLabel("Nim: ");
    JTextField tfnim2 = new JTextField();
    JLabel lNamaMhs2 = new JLabel ("Nama: ");
    JTextField tfNamaMhs2 = new JTextField();
    JLabel lAlamatMhs2 = new JLabel ("Alamat: ");
    JTextField tfAlamatMhs2 = new JTextField();

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnUpdatePanel = new JButton("Update");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnBatal2Panel = new JButton("Batal");


    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dalam array

    Color bg = new Color(211, 248, 226);
    Color red = new Color(255,22,84);
    Color green = new Color(112,255,179);
    Color in = new Color(169,222,249);
    Color up = new Color(228,193,249);
    Color tbl  = new Color(237,231,177);

    public ViewPraktikum(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        getContentPane().setBackground(bg);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(300,250,600,600);
        tabel.setBackground(tbl);

        add(title);
        title.setBounds(250,15,200,30);
        add(title2);
        title2.setBounds(142,45,100,20);
        add(title3);
        title3.setBounds(400,45,100,20);

        add(scrollPane);
        scrollPane.setBounds(25, 240, 530, 280);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lNim);
        lNim.setBounds(35, 80, 60, 20);
        add(tfnim);
        tfnim.setBounds(110, 80, 120, 20);
        tfnim.setBackground(in);
        add(lNamaMhs);
        lNamaMhs.setBounds(35, 110, 60, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(110, 110, 120, 20);
        tfNamaMhs.setBackground(in);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(35, 140, 60, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(110, 140, 120, 20);
        tfAlamatMhs.setBackground(in);

        add(lNim2);
        lNim2.setBounds(310, 80, 60, 20);
        add(tfnim2);
        tfnim2.setBounds(385, 80, 120, 20);
        tfnim2.setBackground(up);
        add(lNamaMhs2);
        lNamaMhs2.setBounds(310, 110, 60, 20);
        add(tfNamaMhs2);
        tfNamaMhs2.setBounds(385, 110, 120, 20);
        tfNamaMhs2.setBackground(up);
        add(lAlamatMhs2);
        lAlamatMhs2.setBounds(310, 140, 60, 20);
        add(tfAlamatMhs2);
        tfAlamatMhs2.setBounds(385, 140, 120, 20);
        tfAlamatMhs2.setBackground(up);


        add(btnTambahPanel);
        btnTambahPanel.setBounds(110, 180, 80, 20);
        btnTambahPanel.setBackground(green);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(110, 210, 80, 20);
        btnBatalPanel.setBackground(red);
        add(btnUpdatePanel);
        btnUpdatePanel.setBounds(385, 180, 80, 20);
        btnUpdatePanel.setBackground(green);
        add(btnBatal2Panel);
        btnBatal2Panel.setBounds(385, 210, 80, 20);
        btnBatal2Panel.setBackground(red);

    }
    public String getNim(){
        return tfnim.getText();
    }

    public String getNamaMhs(){
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs(){
        return tfAlamatMhs.getText();
    }
    public String getNim2(){
        return tfnim2.getText();
    }

    public String getNamaMhs2(){
        return tfNamaMhs2.getText();
    }

    public String getAlamatMhs2(){
        return tfAlamatMhs2.getText();
    }
}

