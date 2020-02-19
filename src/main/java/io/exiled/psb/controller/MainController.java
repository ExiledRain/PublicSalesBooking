package io.exiled.psb.controller;

import io.exiled.psb.dao.DealRecordDao;
import io.exiled.psb.entity.DealRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    private DealRecordDao dealRecordDao;

    public MainController(DealRecordDao dealRecordDao) {
        this.dealRecordDao = dealRecordDao;
    }

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<DealRecord> messages = dealRecordDao.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping("/main")
    public String add(
            @RequestParam String text,
            @RequestParam String email,
            @RequestParam String customerContact,
            @RequestParam String description,
            @RequestParam Double cost,
            Map<String, Object> model
    ) {
        DealRecord message = new DealRecord(text, email, customerContact, description, cost);
        dealRecordDao.save(message);
        model.put("messages", dealRecordDao.findAll());
        return "main";
    }
}
