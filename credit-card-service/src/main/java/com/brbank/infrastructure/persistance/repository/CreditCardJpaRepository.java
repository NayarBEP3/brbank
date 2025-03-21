package com.brbank.infrastructure.persistance.repository;

import com.brbank.infrastructure.persistance.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditCardJpaRepository extends JpaRepository<CreditCardEntity, Long> {

    Optional<CreditCardEntity> findByCreditCardNumber(String creditCardNumber);
}
