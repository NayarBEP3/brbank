package com.brbank.application.handler;

import com.brbank.domain.enums.CreditCardStatusEnum;
import com.brbank.domain.model.CreditCardModel;
import com.brbank.domain.service.CreditCardService;
import com.brbank.infrastructure.dto.request.ChangeCreditCardStatusRequest;
import com.brbank.infrastructure.dto.request.CreateCreditCardRequest;
import com.brbank.infrastructure.dto.request.ValidateCreditCardRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.*;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CreditCardHandlerTest {

    @Mock
    private CreditCardService creditCardService;
    @InjectMocks
    private CreditCardHandler creditCardHandler;

    @BeforeAll
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createCreditCardOK() {
        final var createCreditCardRequest = new CreateCreditCardRequest();
        createCreditCardRequest.setCreditCardCvc("123");
        createCreditCardRequest.setCreditCardNumber("123321");
        createCreditCardRequest.setHolderName("Brayan Estrada");
        createCreditCardRequest.setMonthValidThru("12");
        createCreditCardRequest.setYearValidThru("27");
        final var creditCardModel = new CreditCardModel();
        creditCardModel.setCreditCardId(1L);
        creditCardModel.setCreditCardCvc("123");
        creditCardModel.setCreditCardNumber("123321");
        creditCardModel.setHolderName("Brayan Estrada");
        creditCardModel.setMonthValidThru("12");
        creditCardModel.setYearValidThru("27");
        Mockito.when(this.creditCardService.createCreditCard(ArgumentMatchers.any(CreditCardModel.class))).thenReturn(creditCardModel);

        final var response = this.creditCardHandler.createCreditCard(createCreditCardRequest);

        Assertions.assertEquals(1L, response.getCreditCardId());
        Assertions.assertEquals("123", response.getCreditCardCvc());
        Assertions.assertEquals("123321", response.getCreditCardNumber());
        Assertions.assertEquals("Brayan Estrada", response.getHolderName());
        Assertions.assertEquals("12", response.getMonthValidThru());
        Assertions.assertEquals("27", response.getYearValidThru());
    }

    @Test
    void getAllCreditCardsOK() {
        final var creditCardModel = new CreditCardModel();
        creditCardModel.setCreditCardId(1L);
        creditCardModel.setCreditCardCvc("123");
        creditCardModel.setCreditCardNumber("123321");
        creditCardModel.setHolderName("Brayan Estrada");
        creditCardModel.setMonthValidThru("12");
        creditCardModel.setYearValidThru("27");
        Mockito.when(this.creditCardService.getAllCreditCards()).thenReturn(List.of(creditCardModel));

        final var response = this.creditCardHandler.getAllCreditCards();

        Assertions.assertEquals(1L, response.getFirst().getCreditCardId());
        Assertions.assertEquals("123", response.getFirst().getCreditCardCvc());
        Assertions.assertEquals("123321", response.getFirst().getCreditCardNumber());
        Assertions.assertEquals("Brayan Estrada", response.getFirst().getHolderName());
        Assertions.assertEquals("12", response.getFirst().getMonthValidThru());
        Assertions.assertEquals("27", response.getFirst().getYearValidThru());
    }

    @Test
    void changeCreditCardStatusOK() {
        final var request = new ChangeCreditCardStatusRequest();
        request.setCreditCardNumber("123321");
        request.setCreditCardStatus("ALLOWED");
        final var creditCardModel = new CreditCardModel();
        creditCardModel.setCreditCardId(1L);
        creditCardModel.setCreditCardCvc("123");
        creditCardModel.setCreditCardNumber("123321");
        creditCardModel.setHolderName("Brayan Estrada");
        creditCardModel.setMonthValidThru("12");
        creditCardModel.setYearValidThru("27");
        creditCardModel.setCreditCardStatus(CreditCardStatusEnum.ALLOWED);
        Mockito.when(this.creditCardService.changeCreditCardStatus(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(creditCardModel);

        final var response = this.creditCardHandler.changeCreditCardStatus(request);

        Assertions.assertEquals(1L, response.getCreditCardId());
        Assertions.assertEquals("123", response.getCreditCardCvc());
        Assertions.assertEquals("123321", response.getCreditCardNumber());
        Assertions.assertEquals("Brayan Estrada", response.getHolderName());
        Assertions.assertEquals("12", response.getMonthValidThru());
        Assertions.assertEquals("27", response.getYearValidThru());
        Assertions.assertEquals(CreditCardStatusEnum.ALLOWED, response.getCreditCardStatus());
    }

    @Test
    void validateCreditCard() {
        final var validateCreditCardRequest = new ValidateCreditCardRequest();
        Mockito.when(this.creditCardService.validateCreditCard(ArgumentMatchers.any())).thenReturn(true);

        final var response = this.creditCardHandler.validateCreditCard(validateCreditCardRequest);

        Assertions.assertTrue(response);
    }

}
