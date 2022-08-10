package server.controllers.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccounts() {
//        return List.of(new Account("atn95", "asdf1234", "test@test.com"));
        return accountRepository.getAllAccounts();
    }

    public Optional<Account> updateEmail(String email, Long id) {
        accountRepository.updateEmail(email, id);
        return accountRepository.findById(id);
    }

    public void addNewStudent(@RequestBody Account account) {
        System.out.println(account);
    }
}
