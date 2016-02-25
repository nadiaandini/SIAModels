package id.ac.unpar.siamodels.matakuliah;

import id.ac.unpar.siamodels.matakuliah.interfaces.HasPrasyarat;
import id.ac.unpar.siamodels.matakuliah.interfaces.Projek;

import java.util.List;

@MataKuliah(kode = "AIF306", nama = "Proyek Informatika", sks = 6)
public class AIF306 implements HasPrasyarat, Projek {

    /**
     * @author Pascal
     * @return deskripsi mata kuliah
     */
    public String getDeskripsi() {
        return "Mata kuliah ini bertujuan untuk memberikan pengalaman bagi mahasiswa dalam mengerjakan proyek dengan teknologi-teknologi terkini, secara berkelompok.\n"
                + "Teknologi-teknologi yang digunakan pada kuliah ini tidak spesifik dan dapat berubah seiring perkembangan teknologi maupun disesuaikan dengan kompetensi dosen pengajar. "
                + "Beberapa teknologi yang dapat dimanfaatkan antara lain: DVCS tool menggunakan Git + Github, Mobile native app (Android, iOS, dll), dan responsive web design.";
    }

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        if (!mahasiswa.hasTempuhKuliah("AIF208")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF208");
            return false;
        }
        return true;
    }

}
