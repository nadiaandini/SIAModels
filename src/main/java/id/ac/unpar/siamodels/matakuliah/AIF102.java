package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasPraktikum;
import id.ac.unpar.siamodels.matakuliah.interfaces.HasResponsi;
import id.ac.unpar.siamodels.matakuliah.interfaces.Wajib;

import java.util.List;

@MataKuliah(kode = "AIF102", nama = "Algoritma dan Struktur Data", sks = 4)
public class AIF102 implements HasPrasyarat, Wajib, HasPraktikum {

    /**
     * @author Husnul Hakim
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi(){
        return "Mata kuliah ini memperkenalkan berbagai algoritma dan teknik-"
                + "teknik penyelesaian masalah komputasi seperti rekursif, "
                + "sorting, teknik divide dan conquer, serta exhaustive search. "
                + "Selain itu, pada kuliah ini juga dikenalkan berbagai struktur"
                + " data yang dapat digunakan untuk mendukung penyelesaian "
                + "masalah komputasi seperti ADT List, Stack dan Queue. Baik "
                + "algoritma maupun struktur data yang dikenalkan harus dapat "
                + "diimplementasikan dan digunakan oleh mahasiswa untuk "
                + "menyelesaikan masalah dengan menggunakan suatu bahasa "
                + "pemrograman berorientasi objek.";
    }
	@Override
	public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
		boolean ok = true;
		if (!mahasiswa.hasLulusKuliah("AIF101") && !mahasiswa.hasLulusKuliah("AIF191")) {
			reasonsContainer.add("Tidak memenuhi prasyarat lulus AIF101 atau AIF191");
			ok = false;
		}
		if (!mahasiswa.hasTempuhKuliah("AIF103")) {
			reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF103");			
			ok = false;
		}
		return ok;
	}

}
