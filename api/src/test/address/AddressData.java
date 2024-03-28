package resipay.api.domain.address;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

public record AddressData(
                    String uuid,
                    @NotBlank Category category,
                    @NotBlank String publicPlace,
                    @NotBlank String numberHouse,
                    String complement,
                    @NotBlank String district,
                    @NotBlank @Pattern(regexp = "\\d{8}") String cep,
                    @NotBlank String city,
                    @NotBlank String state,
                    long tbAddressOwnerId,
                    long tbAddressTenantId,
                    long tbPropertieId,
                    Data createdAt,
                    Data updatedAt) {
}