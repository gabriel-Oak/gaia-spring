package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.ChangeOrderForm;
import com.example.gaiaapi.Dto.ChangeOrderDto;
import com.example.gaiaapi.Models.ChangeOrder;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Models.Notification;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.ChangeOrderRepository;
import com.example.gaiaapi.Repositories.MenuRepository;
import com.example.gaiaapi.Repositories.NotificationRepository;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class ChangeOrderController {

    @Autowired
    ChangeOrderRepository changeOrderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @GetMapping
    public List<ChangeOrderDto> listAll() {
        List<ChangeOrder> orders =  changeOrderRepository.findAll();
        return ChangeOrderDto.convert(orders);
    }

    @PostMapping
    public  String create(@RequestBody ChangeOrderForm form) {
        Optional<User> u = userRepository.findById(form.getUser_id());
        User user = u.get();

        Optional<Menu> m = menuRepository.findById((form.getMenu_id()));
        Menu menu = m.get();

        changeOrderRepository.save(new ChangeOrder(form, user, menu));
        notificationRepository.save(new Notification(user, "Troca realizada em" + form.getUpdatedAt()));
        return "Troca realizada em " + LocalDateTime.now();
    }

    @PutMapping
    public String update(@RequestBody ChangeOrderForm form) {
        return this.create(form);
    }

    @DeleteMapping
    public String removeAll() {
        changeOrderRepository.deleteAll();
        return "Todas as trocas foram deletadas";
    }

}
