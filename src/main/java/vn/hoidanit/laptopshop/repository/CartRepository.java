package vn.hoidanit.laptopshop.repository;

import vn.hoidanit.laptopshop.domain.Cart;
import vn.hoidanit.laptopshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);

}
