package org.example.demo2.Service;

import org.example.demo2.DTO.MonHoc;
import org.example.demo2.Repository.MonHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocService {
    @Autowired
    private MonHocRepository MonHocRepository;

    public List<MonHoc> getAllMonHoc() {
        return MonHocRepository.findAll();
    }
}
