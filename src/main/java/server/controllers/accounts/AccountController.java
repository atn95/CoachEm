package server.controllers.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static server.constants.ServerConstant.API_ROUTE;

@RestController
@RequestMapping(path = API_ROUTE + "/user")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){this.accountService = accountService;}

    @GetMapping
    public List<Accounts> getUsers() {
        return AccountService.getAccounts();
    }
}
