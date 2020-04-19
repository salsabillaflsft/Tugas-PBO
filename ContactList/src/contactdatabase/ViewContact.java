package contactdatabase;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewContact extends JFrame {
    JLabel title = new JLabel("Contact List");
    JLabel title2 = new JLabel("Insert Contact");
    JLabel title3 = new JLabel("Update Contact");

    JLabel lNama = new JLabel("Nama: ");
    JTextField tfNama = new JTextField();
    JLabel lNohp = new JLabel ("No HP: ");
    JTextField tfNohp = new JTextField();
    JLabel lUmur = new JLabel ("Umur: ");
    JTextField tfUmur = new JTextField();
    JLabel lEmail = new JLabel ("Email: ");
    JTextField tfEmail = new JTextField();

    JLabel lNama2 = new JLabel("Nama: ");
    JTextField tfNama2 = new JTextField();
    JLabel lNohp2 = new JLabel ("No HP: ");
    JTextField tfNohp2 = new JTextField();
    JLabel lUmur2 = new JLabel ("Umur: ");
    JTextField tfUmur2 = new JTextField();
    JLabel lEmail2 = new JLabel ("Email: ");
    JTextField tfEmail2 = new JTextField();
    
    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnUpdatePanel = new JButton("Update");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnBatal2Panel = new JButton("Batal");
    JLabel image = new JLabel();
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nama","No HP","Umur","Email"};

    Color bg = new Color(255, 182, 185);
    Color red = new Color(246,65,108);
    Color green = new Color(0,184,169);
    Color in = new Color(187,222,214);
    Color up = new Color(250,227,217);
    Color tbl  = new Color(248,243,212);

    ImageIcon icon = new ImageIcon("pink.gif");
    JLabel img = new JLabel(icon);
    ImageIcon icon2 = new ImageIcon("sponge.gif");
    JLabel img2 = new JLabel(icon2);
    ImageIcon icon3 = new ImageIcon("update.gif");
    JLabel img3 = new JLabel(icon3);

    public ViewContact(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        getContentPane().setBackground(bg);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(900,80,600,900);
        tabel.setBackground(tbl);

        add(img);
        img.setBounds(70,35,92,192);
        add(img2);
        img2.setBounds(410,85,128,96);
        add(img3);
        img3.setBounds(250,630,192,94);

        add(title);
        title.setBounds(250,12,200,30);
        add(title2);
        title2.setBounds(245,50,100,20);
        add(title3);
        title3.setBounds(35,600,100,20);

        add(scrollPane);
        scrollPane.setBounds(25, 300, 530, 280);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lNama);
        lNama.setBounds(200, 80, 60, 20);
        add(tfNama);
        tfNama.setBounds(250, 80, 120, 20);
        tfNama.setBackground(in);
        add(lNohp);
        lNohp.setBounds(200, 110, 60, 20);
        add(tfNohp);
        tfNohp.setBounds(250, 110, 120, 20);
        tfNohp.setBackground(in);
        add(lUmur);
        lUmur.setBounds(200, 140, 60, 20);
        add(tfUmur);
        tfUmur.setBounds(250, 140, 120, 20);
        tfUmur.setBackground(in);
        add(lEmail);
        lEmail.setBounds(200, 170, 60, 20);
        add(tfEmail);
        tfEmail.setBounds(250, 170, 120, 20);
        tfEmail.setBackground(in);


        add(lNama2);
        lNama2.setBounds(35, 630, 60, 20);
        add(tfNama2);
        tfNama2.setBounds(85, 630, 120, 20);
        tfNama2.setBackground(up);
        add(lNohp2);
        lNohp2.setBounds(35, 660, 60, 20);
        add(tfNohp2);
        tfNohp2.setBounds(85, 660, 120, 20);
        tfNohp2.setBackground(up);
        add(lUmur2);
        lUmur2.setBounds(35, 690, 60, 20);
        add(tfUmur2);
        tfUmur2.setBounds(85, 690, 120, 20);
        tfUmur2.setBackground(up);
        add(lEmail2);
        lEmail2.setBounds(35, 720, 60, 20);
        add(tfEmail2);
        tfEmail2.setBounds(85, 720, 120, 20);
        tfEmail2.setBackground(up);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(250, 210, 80, 20);
        btnTambahPanel.setBackground(green);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(250, 240, 80, 20);
        btnBatalPanel.setBackground(red);
        add(btnUpdatePanel);
        btnUpdatePanel.setBounds(85, 750, 80, 20);
        btnUpdatePanel.setBackground(green);
        add(btnBatal2Panel);
        btnBatal2Panel.setBounds(85, 780, 80, 20);
        btnBatal2Panel.setBackground(red);
    }
    public String getNama(){
        return tfNama.getText();
    }
    public String getNohp(){
        return tfNohp.getText();
    }
    public String getUmur(){
        return tfUmur.getText();
    }
    public String getEmail(){
        return tfEmail.getText();
    }

    public String getNama2(){
        return tfNama2.getText();
    }
    public String getNohp2(){
        return tfNohp2.getText();
    }
    public String getUmur2(){
        return tfUmur2.getText();
    }
    public String getEmail2(){
        return tfEmail2.getText();
    }
}
