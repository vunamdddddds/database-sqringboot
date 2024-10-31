package org.example.demo2.Service;

import org.example.demo2.DTO.Diem;
import org.example.demo2.Repository.DiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemService {
    @Autowired
    private DiemRepository DiemRepository;

    public List<Diem> getAllDiem() {
        List<Diem> diemList = DiemRepository.findAll();
        if (diemList == null) {
            throw new RuntimeException("No records found");
        }
        return diemList;
    }

}
