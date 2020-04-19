package contactdatabase;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerContact {
    ModelContact modelcontact;
    ViewContact viewcontact;

    public ControllerContact(ModelContact modelcontact, ViewContact viewcontact) {
        this.modelcontact = modelcontact;
        this.viewcontact = viewcontact;

        if (modelcontact.getBanyakData() != 0) {
            String dataContact[][] = modelcontact.readContact();
            viewcontact.tabel.setModel((new JTable(dataContact, viewcontact.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        viewcontact.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewcontact.getNama();
                String nohp = viewcontact.getNohp();
                String umur = viewcontact.getUmur();
                String email = viewcontact.getEmail();
                modelcontact.insertContact(nama, nohp, umur,email);

                String dataContact[][] = modelcontact.readContact();
                viewcontact.tabel.setModel(new JTable(dataContact, viewcontact.namaKolom).getModel());
            }
        });

        viewcontact.btnUpdatePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewcontact.getNama2();
                String nohp = viewcontact.getNohp2();
                String umur = viewcontact.getUmur2();
                String email = viewcontact.getEmail2();
                modelcontact.updateContact(nama, nohp, umur, email);

                String dataContact[][] = modelcontact.readContact();
                viewcontact.tabel.setModel(new JTable(dataContact, viewcontact.namaKolom).getModel());
            }
        });

        viewcontact.btnBatalPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewcontact.tfNama.setText("");
                viewcontact.tfNohp.setText("");
                viewcontact.tfUmur.setText("");
                viewcontact.tfEmail.setText("");
            }
        });
        viewcontact.btnBatal2Panel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewcontact.tfNama2.setText("");
                viewcontact.tfNohp2.setText("");
                viewcontact.tfUmur2.setText("");
                viewcontact.tfEmail2.setText("");
            }
        });

        viewcontact.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewcontact.tabel.getSelectedRow();
                int kolom = viewcontact.tabel.getSelectedColumn();

                String dataterpilih = viewcontact.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus contact dengan nama " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelcontact.deleteContact(dataterpilih);
                    String dataContact[][] = modelcontact.readContact();
                    viewcontact.tabel.setModel(new JTable(dataContact, viewcontact.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });

    }
}
