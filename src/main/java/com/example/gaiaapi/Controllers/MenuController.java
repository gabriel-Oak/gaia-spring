package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.MenuForm;
import com.example.gaiaapi.Dto.MenuDto;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Models.Notification;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.MenuRepository;
import com.example.gaiaapi.Repositories.NotificationRepository;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<MenuDto> list() {
        List<Menu> menus = menuRepository.findAll();
        return MenuDto.convert(menus);
    }

    @PutMapping
    public Menu create(@RequestBody MenuForm form) {
        List<User> users = userRepository.findAll();
        users.forEach(user -> notificationRepository.save(new Notification(
                user,
                "Cardapio do dia " + form.getDate() + " alterado"
        )));
        return menuRepository.save(form.convert());
    }
}
