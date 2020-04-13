package koneksidatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerPraktikum {
    ModelPraktikum modelpraktikum;
    ViewPraktikum viewpraktikum;

    public ControllerPraktikum(ModelPraktikum modelpraktikum, ViewPraktikum viewpraktikum) {
        this.modelpraktikum = modelpraktikum;
        this.viewpraktikum = viewpraktikum;

        if (modelpraktikum.getBanyakData() != 0) {
            String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
            viewpraktikum.tabel.setModel((new JTable(dataMahasiswa, viewpraktikum.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        viewpraktikum.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim();
                String nama = viewpraktikum.getNamaMhs();
                String alamat = viewpraktikum.getAlamatMhs();
                modelpraktikum.insertMahasiswa(nim, nama, alamat);

                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
            }
        });

        viewpraktikum.btnUpdatePanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = viewpraktikum.getNim2();
                String nama = viewpraktikum.getNamaMhs2();
                String alamat = viewpraktikum.getAlamatMhs2();
                modelpraktikum.updateMahasiswa(nim, nama, alamat);

                String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
            }
        });

        viewpraktikum.btnBatalPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpraktikum.tfnim.setText("");
                viewpraktikum.tfNamaMhs.setText("");
                viewpraktikum.tfAlamatMhs.setText("");
            }
        });
        viewpraktikum.btnBatal2Panel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpraktikum.tfnim2.setText("");
                viewpraktikum.tfNamaMhs2.setText("");
                viewpraktikum.tfAlamatMhs2.setText("");
            }
        });

        viewpraktikum.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewpraktikum.tabel.getSelectedRow();
                int kolom = viewpraktikum.tabel.getSelectedColumn();

                String dataterpilih = viewpraktikum.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus data mahasiswa NIM " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelpraktikum.deleteMahasiswa(dataterpilih);
                    String dataMahasiswa[][] = modelpraktikum.readMahasiswa();
                    viewpraktikum.tabel.setModel(new JTable(dataMahasiswa, viewpraktikum.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }

            }
        });
        //);
    }
}

