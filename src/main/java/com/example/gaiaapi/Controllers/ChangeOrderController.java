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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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
    public ResponseEntity<ChangeOrderDto> create(@RequestBody @Valid ChangeOrderForm form, UriComponentsBuilder uriBuilder) {
        Optional<User> u = userRepository.findById(form.getUser_id());
        User user = u.get();

        Optional<Menu> m = menuRepository.findById((form.getMenu_id()));
        Menu menu = m.get();

        ChangeOrder order = changeOrderRepository.save(new ChangeOrder(form, user, menu));
        notificationRepository.save(new Notification(user, "Troca realizada em" + form.getUpdatedAt()));

        URI uri = uriBuilder.path("/order/{id}").buildAndExpand(order.getId()).toUri();
        return ResponseEntity.created(uri).body(new ChangeOrderDto(order));
    }

    @PutMapping
    public ResponseEntity<ChangeOrderDto> update(@RequestBody ChangeOrderForm form, UriComponentsBuilder uriBuilder) {
        return this.create(form, uriBuilder);
    }

    @DeleteMapping
    public String removeAll() {
        changeOrderRepository.deleteAll();
        return "Todas as trocas foram deletadas";
    }

}
