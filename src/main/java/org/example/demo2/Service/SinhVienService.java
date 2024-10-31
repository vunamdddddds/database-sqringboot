package org.example.demo2.Service;

import org.example.demo2.DTO.SinhVien;
import org.example.demo2.Repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SinhVienService {




    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Transactional(readOnly = true)
    public List<SinhVien> layDanhSachSinhVien() {
        return sinhVienRepository.layDanhSachSinhVien();
    }
}
