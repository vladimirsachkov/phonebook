package ru.mtusi.phonebook.conrroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mtusi.phonebook.dao.PhonebookTableDAO;
import ru.mtusi.phonebook.entity.PhonebookTableEntity;
import ru.mtusi.phonebook.model.InfoView;

import java.util.List;

@Controller
@ComponentScan("ru.mtusi.phonebook.dao")
public class index {

    @Autowired
    private PhonebookTableDAO phonebookTableDAO;

    @RequestMapping("/PhonebookTable")
    public String mainPage(Model model){
        List<PhonebookTableEntity> phonebookTableEntities = phonebookTableDAO.getAll();
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
        phonebookTableDAO.savePhonebookTable(phonebookTableEntity);
        return "redirect:/PhonebookTable";
    }
}
