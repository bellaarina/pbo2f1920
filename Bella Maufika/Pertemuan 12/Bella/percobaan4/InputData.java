/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bella.percobaan4;

/**
 *
 * @author bella
 */
import java.util.ArrayList;
public class InputData {
    ArrayList<Mahasiswa> ListMahasiswa;
    
    public InputData(){
        ListMahasiswa = new ArrayList();
        
    }
    public void isisData (String Nim, String Nama, String Alamat){
        Mahasiswa mhs = new Mahasiswa(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa> getData(){
        return ListMahasiswa;
    }

    void isiData(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
