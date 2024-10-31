package org.example.demo2.Controller;

import org.example.demo2.DTO.Lop;
import org.example.demo2.DTO.Lop;
import org.example.demo2.Service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Lop")
public class LopController {
    @Autowired
    private LopService LopService;

    @GetMapping
    public List<Lop> getAllLop() {
        return LopService.getAllLop();
    }
}
