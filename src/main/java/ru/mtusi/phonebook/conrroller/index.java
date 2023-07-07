package ru.mtusi.phonebook.conrroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mtusi.phonebook.dao.PhonebookTableDAO;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;

import java.util.List;

@Controller
@ComponentScan("ru.mtusi.phonebook.dao")
public class index {

    @Autowired
    private PhonebookTableDAO phonebookTableDAO;

    @RequestMapping("/q")
    public String sayHello(Model model){
        List<PhonebookTableEntity> phonebookTableEntities = phonebookTableDAO.getAll();
        model.addAttribute("AllPhonebookTableEntities", phonebookTableEntities);
        return "index";
    }
}
