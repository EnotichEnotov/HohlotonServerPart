package com.samsung.spring.controller;

import com.samsung.spring.domain.Clubs;
import com.samsung.spring.domain.User;
import com.samsung.spring.service.ClubsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClubsController {
    private final ClubsService clubsService;

    @PostMapping("/clubs")
    public Clubs add(@RequestBody Clubs club){
        return clubsService.add(club);
    }

    @GetMapping("/clubs")
    public List<Clubs> getAll() {
        return clubsService.getAll();
    }

    @GetMapping("/clubs/{id}")
    public Clubs getById(@PathVariable long id) {
        return clubsService.getById(id);
    }

    @PutMapping("/clubs")
    public Clubs update(@RequestBody Clubs club){
        return clubsService.update(club);
    }

    @DeleteMapping("/clubs/{id}")
    public void deleteById(@PathVariable long id){
        clubsService.deleteById(id);
    }
}
