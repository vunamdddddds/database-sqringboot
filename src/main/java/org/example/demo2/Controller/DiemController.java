package org.example.demo2.Controller;

import org.example.demo2.DTO.Diem;
import org.example.demo2.DTO.Diem;
import org.example.demo2.Service.DiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Diem")
public class DiemController {
    @Autowired
    private DiemService DiemService;

    @GetMapping
    public List<Diem> getAllDiem() {
        return DiemService.getAllDiem();
    }

}
