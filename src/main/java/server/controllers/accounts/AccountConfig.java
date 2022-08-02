package server.controllers.accounts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository repository) {
        return args-> {
            Account atn = new Account("atn95", "asdf1234", "test@test.com");
            Account jon = new Account("jtran30", "asdf1234", "jontest@test.com");
            repository.saveAll(List.of(atn,jon));
        };
    }
}
