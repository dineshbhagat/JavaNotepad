package com.dkb;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonRootName(value = "payment_token")
public class PaymentToken {
    private String clientId;
    private String currencyCode;
}