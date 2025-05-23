package com.example.modernecommerce.modernecommerce.repository;

import com.example.modernecommerce.modernecommerce.model.Cart;
import com.example.modernecommerce.modernecommerce.model.CartItem;
import com.example.modernecommerce.modernecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    @Query("SELECT ci From CartItem ci Where ci.cart=:cart AND ci.product=:product AND ci.size=:size AND ci.userId=:userId")
    public CartItem isCartItemExist(@Param("cart") Cart cart,
                                    @Param("product") Product product,
                                    @Param("size") String size,
                                    @Param("userId") Long userId);
}
