package com.brbank.infrastructure.dto.response;

import com.brbank.domain.enums.CreditCardStatusEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreditCardResponse {
    private long creditCardId;
    private String creditCardNumber;
    private String monthValidThru;
    private String yearValidThru;
    private String creditCardCvc;
    private String holderName;
    private CreditCardStatusEnum creditCardStatus;
}
