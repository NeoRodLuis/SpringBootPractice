package com.practicerestapi.restapi.repositories;

import com.practicerestapi.restapi.models.Item;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodriguez.luis
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNombreContaining(String nombre);
}

