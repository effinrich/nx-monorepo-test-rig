package com.acmehealth.company.api.dto;

import com.acmehealth.company.api.entity.Person;

public record BuyerAndSellerChattingDto(
    Person buyer, Person seller, String roomId, String ipMarketplaceName) {}
