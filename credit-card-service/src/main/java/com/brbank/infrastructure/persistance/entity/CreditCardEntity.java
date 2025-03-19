package com.brbank.infrastructure.persistance.entity;

import com.brbank.domain.enums.CreditCardStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "credit_cards")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditCardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long creditCardId;
    private String creditCardNumber;
    private String monthValidThru;
    private String yearValidThru;
    private String creditCardCvc;
    private String holderName;
    private CreditCardStatusEnum creditCardStatus;
}
