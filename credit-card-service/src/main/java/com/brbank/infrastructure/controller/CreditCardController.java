package com.brbank.infrastructure.controller;

import com.brbank.application.handler.CreditCardHandler;
import com.brbank.infrastructure.dto.request.ChangeCreditCardStatusRequest;
import com.brbank.infrastructure.dto.request.CreateCreditCardRequest;
import com.brbank.infrastructure.dto.request.ValidateCreditCardRequest;
import com.brbank.infrastructure.dto.response.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class CreditCardController {

    private final CreditCardHandler creditCardHandler;

    @PostMapping("/credit-card")
    public CreditCardResponse createCreditCard(@RequestBody final CreateCreditCardRequest request) {
        return creditCardHandler.createCreditCard(request);
    }

    @GetMapping("/credit-card")
    public List<CreditCardResponse> getAllCreditCards() {
        return creditCardHandler.getAllCreditCards();
    }

    @PutMapping("/credit-card/status")
    public CreditCardResponse changeCreditCardStatus(@RequestBody final ChangeCreditCardStatusRequest changeCreditCardStatusRequest) {
        return creditCardHandler.changeCreditCardStatus(changeCreditCardStatusRequest);
    }

    @PostMapping("/credit-card/validate")
    public boolean validateCreditCard(@RequestBody final ValidateCreditCardRequest request) {
        return creditCardHandler.validateCreditCard(request);
    }
}
