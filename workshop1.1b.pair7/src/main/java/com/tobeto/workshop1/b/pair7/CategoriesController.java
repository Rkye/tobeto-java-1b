package com.tobeto.workshop1.b.pair7;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @GetMapping
    public String getCatgeories(){
        return "Kategoriler getirildi.";
    }

    @GetMapping("id")
    public String getCatgeoriesById(){
        return "Kategoriler id ye göre getirildi.";
    }

    @PostMapping
    public String postCategories(){
        return "Kategoriler Eklendi";
    }

    @PutMapping
    public String putCategories(){
        return "Kategoriler güncellendi.";
    }

    @DeleteMapping
    public String deleteCategories(){
        return "Kategori silindi.";
    }
}
