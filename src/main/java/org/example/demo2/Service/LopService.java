package org.example.demo2.Service;

import org.example.demo2.DTO.Lop;
import org.example.demo2.Repository.LopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopService {
    @Autowired
    private LopRepository LopRepository;

    public List<Lop> getAllLop() {
        return LopRepository.findAll();
    }
}
