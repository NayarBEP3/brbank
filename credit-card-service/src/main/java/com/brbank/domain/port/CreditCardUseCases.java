package com.brbank.domain.port;

import com.brbank.domain.enums.CreditCardStatusEnum;
import com.brbank.domain.model.CreditCardModel;

import java.util.List;

public interface CreditCardUseCases {

    CreditCardModel createCreditCard(final CreditCardModel creditCardModel);
    List<CreditCardModel> getAllCreditCards();
    CreditCardModel changeCreditCardStatus(final String creditCardNumber, final CreditCardStatusEnum creditCardStatus);
    CreditCardModel validateCreditCard(final String creditCardNumber);

}
