package server.controllers.accounts;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    public static List<Accounts> getAccounts() {
        return List.of(new Accounts("atn95", "asdf1234", "test@test.com"));
    }

}
