package com.example.banksampah.controller;


import com.example.banksampah.model.JenisSampah;
import com.example.banksampah.repository.JenisSampahRepository;
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
@RequestMapping("/jenissampah")
public class JenisSampahController {
    private JenisSampahRepository jenissampahRepository;

    @Autowired
    public JenisSampahController(JenisSampahRepository jenissampahRepository) {
        this.jenissampahRepository = jenissampahRepository;
    }

    @PostMapping("/save")
    JenisSampah save(@RequestBody JenisSampah jenissampah){
        return jenissampahRepository.save(jenissampah);
    }

    
    @GetMapping("/all")
    Iterable<JenisSampah> all() {
        return jenissampahRepository.findAll();
    }

    @GetMapping("/data/{id}")
    JenisSampah getById(@PathVariable Long id){
        return jenissampahRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
   
    @DeleteMapping("/{id}")
    public void deleteJenisSampah(@PathVariable Long id){
        jenissampahRepository.deleteById(id);
         
    }

    @PutMapping("/update/{id}")
    JenisSampah update(@RequestBody JenisSampah newUser, @PathVariable Long id) {
        return jenissampahRepository.findById(id)
        .map(jenissampah -> {
        jenissampah.setKarton(newUser.getKarton());
        jenissampah.setBotol_plastik(newUser.getBotol_plastik());
        jenissampah.setBotol_kaca(newUser.getBotol_kaca());
        jenissampah.setBarang_bekas(newUser.getBarang_bekas());
        return jenissampahRepository.save(jenissampah);
    })
    .orElseGet(() -> {
        newUser.setId(id);
        return jenissampahRepository.save(newUser);
    });
} 
}