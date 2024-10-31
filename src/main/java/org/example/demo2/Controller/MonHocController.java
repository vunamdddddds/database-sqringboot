package org.example.demo2.Controller;

import org.example.demo2.DTO.MonHoc;
import org.example.demo2.DTO.MonHoc;
import org.example.demo2.Service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MonHoc")
public class MonHocController {
    @Autowired
    private MonHocService MonHocService;

    @GetMapping
    public List<MonHoc> getAllMonHoc() {
        return MonHocService.getAllMonHoc();
    }
}
