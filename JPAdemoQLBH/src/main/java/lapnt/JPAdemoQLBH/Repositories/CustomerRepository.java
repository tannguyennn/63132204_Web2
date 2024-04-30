package lapnt.JPAdemoQLBH.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lapnt.JPAdemoQLBH.Models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>  {
 
}

