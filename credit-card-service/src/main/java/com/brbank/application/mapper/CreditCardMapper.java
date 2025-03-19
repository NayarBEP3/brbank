package com.brbank.application.mapper;

import com.brbank.domain.model.CreditCardModel;
import com.brbank.infrastructure.dto.request.CreateCreditCardRequest;
import com.brbank.infrastructure.dto.request.ValidateCreditCardRequest;
import com.brbank.infrastructure.dto.response.CreditCardResponse;
import com.brbank.infrastructure.persistance.entity.CreditCardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CreditCardMapper {
    CreditCardMapper INSTANCE = Mappers.getMapper(CreditCardMapper.class);

    /* Objects. */
    CreditCardModel fromCreateRequestToModel(CreateCreditCardRequest createCreditCardRequest);
    CreditCardModel fromValidateRequestToModel(ValidateCreditCardRequest validateCreditCardRequest);
    CreditCardEntity fromModelToEntity(CreditCardModel creditCardModel);
    CreditCardModel fromEntityToModel(CreditCardEntity creditCardEntity);
    CreditCardResponse fromModelToResponse(CreditCardModel creditCardModel);

    /* Lists. */
    List<CreditCardResponse> fromModelListToResponseList(List<CreditCardModel> creditCardModelList);
    List<CreditCardModel> fromEntityListToModelList(List<CreditCardEntity> creditCardEntityList);
}
