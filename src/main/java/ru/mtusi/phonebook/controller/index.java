package ru.mtusi.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;
import ru.mtusi.phonebook.model.InfoView;
import ru.mtusi.phonebook.service.PhonebookTableService;

import java.util.List;

@Controller
@ComponentScan("ru.mtusi.phonebook.service")
public class index {

    @Autowired
    private PhonebookTableService phonebookTableService;

    @RequestMapping("/PhonebookTable")
    public String mainPage(Model model){
        List<PhonebookTableEntity> phonebookTableEntities = phonebookTableService.getAll();
        model.addAttribute("AllPhonebookTableEntities", phonebookTableEntities);
        return "index";
    }

    @RequestMapping("/addNewNumber")
    public String add(Model model) {
        InfoView infoView = new InfoView("Добавление номера", "Добавить");
        PhonebookTableEntity phonebookTableEntity = new PhonebookTableEntity();

        model.addAttribute("InfoView", infoView);
        model.addAttribute("PhonebookTableEntity", phonebookTableEntity);

        return "phonebook-info";
    }

    @RequestMapping("/saveNumber")
    public String saveNumber(@ModelAttribute("PhonebookTableEntity") PhonebookTableEntity phonebookTableEntity) {
        phonebookTableService.savePhonebookTable(phonebookTableEntity);
        return "redirect:/PhonebookTable";
    }

    @RequestMapping("/updateNumber")
    public String updateEmployee(@RequestParam("phoneBookId") long id, Model model) {
        InfoView infoView = new InfoView("Редактирование номера","Редактировать");
        PhonebookTableEntity phonebookTableEntity = phonebookTableService.getPhonebookTableEntity(id);

        model.addAttribute("InfoView", infoView);
        model.addAttribute("PhonebookTableEntity", phonebookTableEntity);

        return "phonebook-info";
    }

    @RequestMapping("/deleteNumber")
    public String deleteEmployee(@RequestParam("phoneBookId") long id) {
        phonebookTableService.deletePhonebookTableEntity(id);
        return "redirect:/PhonebookTable";
    }
}
