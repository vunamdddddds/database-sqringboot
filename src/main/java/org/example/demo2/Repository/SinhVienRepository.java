package org.example.demo2.Repository;

import org.example.demo2.DTO.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {
    @Procedure(name = "LayDanhSachSinhVien")
    List<SinhVien> layDanhSachSinhVien();
}
