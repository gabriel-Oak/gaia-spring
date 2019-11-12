package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.MenuForm;
import com.example.gaiaapi.Dto.MenuDto;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @GetMapping
    public List<MenuDto> list() {
        List<Menu> menus = menuRepository.findAll();
        return MenuDto.convert(menus);
    }

    @PutMapping
    public Menu create(@RequestBody MenuForm form) {
        return menuRepository.save(form.convert());
    }
}
