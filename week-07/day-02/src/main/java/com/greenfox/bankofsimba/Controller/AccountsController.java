package com.greenfox.bankofsimba.Controller;


import com.greenfox.bankofsimba.Model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountsController {


    @RequestMapping(value = "/Accounts")
    public String account (Model model) {
        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("Simba", "2000", "lion", true, true));
        accountList.add(new BankAccount("Timon", "10", "meercat", false, true));
        accountList.add(new BankAccount("Pumbaa", "10", "hog", false, true));
        accountList.add(new BankAccount("Scar", "5000", "lion", true, false));
        accountList.add(new BankAccount("Zazu", "100", "bird", false, true));
        accountList.add(new BankAccount("Rafiki", "500", "mandrill", false, true));
        model.addAttribute("accounts", accountList);
        return "Accounts";
    }
}
