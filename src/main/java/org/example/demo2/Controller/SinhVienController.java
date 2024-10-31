package org.example.demo2.Controller;

import org.example.demo2.DTO.SinhVien;
import org.example.demo2.Service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping
    public List<SinhVien> layDanhSachSinhVien() {
        return sinhVienService.layDanhSachSinhVien();
    }
}
