package server.controllers.accounts;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static server.constants.ServerConstant.API_ROUTE;

@RestController
@RequestMapping(path = API_ROUTE + "/user")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getUsers() {
        return accountService.getAccounts();
    }

    @PutMapping(value="/account/{accountId}")
    public @ResponseStatus Optional<Account> updateEmail(@RequestBody String email, @PathVariable("accountId") Long id){
        try {
            HashMap result = new ObjectMapper().readValue(email, HashMap.class);
            return accountService.updateEmail((String) result.get("email"),id);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    @PostMapping(value = "/register")//url = api/user/register
    public void registerNewAccount(@RequestBody Account account) {
        accountService.addNewStudent(account);
        //account Cant get account to Map to Account Obj
        System.out.println(account);
    }
}
