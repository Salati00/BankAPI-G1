package nl.inholland.first.BankingAPI.Dao;
import org.springframework.data.repository.CrudRepository;
import nl.inholland.first.BankingAPI.Model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {


}
