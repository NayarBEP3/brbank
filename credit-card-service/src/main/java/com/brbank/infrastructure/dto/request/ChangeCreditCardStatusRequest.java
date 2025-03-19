package com.brbank.infrastructure.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChangeCreditCardStatusRequest {
    private String creditCardNumber;
    private String creditCardStatus;
}
