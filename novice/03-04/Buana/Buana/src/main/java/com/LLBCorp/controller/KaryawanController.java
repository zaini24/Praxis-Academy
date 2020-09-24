package com.LLBCorp.controller;


import com.LLBCorp.model.Karyawan;
import com.LLBCorp.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import java.util.Optional;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/karyawan")
public class KaryawanController {
    @Autowired
    public KaryawanRepository karyawanRepository;

    @PostMapping("/add")
    public @ResponseBody Karyawan addNewKaryawan (@RequestBody Karyawan karyawan){
        return karyawanRepository.save(karyawan);
    }
    
    @GetMapping("/all")
    public @ResponseBody List<Karyawan> getAllKaryawan() {
        return karyawanRepository.findAll();
    }

    @GetMapping("/data/{id}")
    public @ResponseBody Karyawan getId(@PathVariable Long id){
        return karyawanRepository.findById(id).get();
    }
   
    @DeleteMapping("/delete/{id}")
    public String deleteKaryawan(@PathVariable Long id){
        Karyawan karyawan = karyawanRepository.findById(id).get();
        karyawanRepository.delete(karyawan);
        return "mantap";
    }

    @PutMapping("/update/{id}")
    public Karyawan update(@PathVariable Long id, @RequestBody Karyawan newKaryawan) {
        Karyawan karyawan = karyawanRepository.findById(id).get();
        karyawan.setNama(newKaryawan.getNama());
        karyawan.setJabatan(newKaryawan.getJabatan());
        karyawan.setGaji(newKaryawan.getGaji());
        karyawan.setMulaiKerja(newKaryawan.getMulaiKerja());

        return karyawanRepository.save(karyawan);
    }
}