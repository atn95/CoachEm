package server.controllers.accounts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
//    @Query("SELECT a FROM Account a")
    @Query(value = "SELECT * FROM account", nativeQuery = true)
    List<Account> getAllAccounts();

//    @Modifying
//    @Query("update User u set u.status = :status where u.name = :name")
//    int updateUserSetStatusForName(@Param("status") Integer status,
//                                   @Param("name") String name);

    //Native
    @Modifying
    @Transactional
    @Query(value = "UPDATE account SET email = ? WHERE id = ?",
            nativeQuery = true)
    int updateEmail(String email, Long id);
}
