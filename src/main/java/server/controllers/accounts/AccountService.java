package server.controllers.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccounts() {
//        return List.of(new Account("atn95", "asdf1234", "test@test.com"));
        return accountRepository.findAll();
    }

    public void addNewStudent(@RequestBody Account account) {
        System.out.println(account);
    }
}
