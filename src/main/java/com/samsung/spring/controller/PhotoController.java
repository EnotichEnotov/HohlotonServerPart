package com.samsung.spring.controller;

import com.samsung.spring.domain.Photo;
import com.samsung.spring.service.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhotoController {
    private final PhotoService photoService;
    @PostMapping("/photo")
    public Photo add(@RequestBody Photo photo){
        return photoService.add(photo);
    }
    @GetMapping("/photo")
    public List<Photo> getAll(){
        return photoService.getAll();
    }
    @GetMapping("/photo/{id}")
    public Photo getById(@PathVariable long id){
        return photoService.getById(id);
    }
    @PutMapping("/photo")
    public Photo update(@RequestBody Photo photo){
        return photoService.update(photo);
    }
    @DeleteMapping("/photo/{id}")
    public void deleteById(@PathVariable long id){
        photoService.deleteById(id);
    }
}
