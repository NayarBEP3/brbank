package com.brbank.application.handler;

import com.brbank.application.mapper.CreditCardMapper;
import com.brbank.domain.service.CreditCardService;
import com.brbank.infrastructure.dto.request.ChangeCreditCardStatusRequest;
import com.brbank.infrastructure.dto.request.CreateCreditCardRequest;
import com.brbank.infrastructure.dto.request.ValidateCreditCardRequest;
import com.brbank.infrastructure.dto.response.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreditCardHandler {

    private final CreditCardService creditCardService;

    public CreditCardResponse createCreditCard(final CreateCreditCardRequest createCreditCardRequest) {
        final var creditCardModel = CreditCardMapper.INSTANCE.fromCreateRequestToModel(createCreditCardRequest);
        final var creditCardModelResp = this.creditCardService.createCreditCard(creditCardModel);
        return CreditCardMapper.INSTANCE.fromModelToResponse(creditCardModelResp);
    }

    public List<CreditCardResponse> getAllCreditCards() {
        final var creditCardModelList = this.creditCardService.getAllCreditCards();
        return CreditCardMapper.INSTANCE.fromModelListToResponseList(creditCardModelList);
    }

    public CreditCardResponse changeCreditCardStatus(final ChangeCreditCardStatusRequest changeCreditCardStatusRequest) {
        final var response = this.creditCardService.changeCreditCardStatus(changeCreditCardStatusRequest.getCreditCardNumber(),
                changeCreditCardStatusRequest.getCreditCardStatus());
        return CreditCardMapper.INSTANCE.fromModelToResponse(response);
    }

    public boolean validateCreditCard(final ValidateCreditCardRequest validateCreditCardRequest) {
        final var creditCardModel = CreditCardMapper.INSTANCE.fromValidateRequestToModel(validateCreditCardRequest);
        return this.creditCardService.validateCreditCard(creditCardModel);
    }
}
