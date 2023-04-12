package com.samsung.spring.controller;

import com.samsung.spring.domain.Membership;
import com.samsung.spring.service.MembershipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MembershipController {
    private final MembershipService membershipService;
    @PostMapping("/membership")
    public Membership add(@RequestBody Membership membership) {return membershipService.add(membership);}
    @GetMapping("/membership")
    public List<Membership> getAll(){return  membershipService.getAll();}
    @GetMapping("/membership/{id}")
    public Membership getById(@PathVariable long id){return membershipService.getById(id);}
    @PutMapping("/membership")
    public Membership update(@RequestBody Membership membership){return membershipService.update(membership);}
    @DeleteMapping("/membership/{id}")
    public void deleteById(@PathVariable long id){membershipService.deleteById(id);}
}
