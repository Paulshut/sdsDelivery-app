package org.sds.delivery.dto.requests.orderRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    @NotBlank
    private String senderName;

    @NotBlank
    private String receiverName;

    @Valid
    @NotNull
    private AddressDto senderAddress;

    @Valid
    @NotNull
    private AddressDto receiverAddress;
}