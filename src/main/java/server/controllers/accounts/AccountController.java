package server.controllers.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static server.constants.ServerConstant.API_ROUTE;

@RestController
@RequestMapping(path = API_ROUTE + "/user")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){this.accountService = accountService;}

    @GetMapping
    public List<Account> getUsers() {
        return accountService.getAccounts();
    }

    @PostMapping("/register")//url = api/user/register
    public void registerNewAccount(@RequestBody Account account) {
        accountService.addNewStudent(account);
        //account Cant get account to Map to Account Obj
        System.out.println(account);
    }
}
