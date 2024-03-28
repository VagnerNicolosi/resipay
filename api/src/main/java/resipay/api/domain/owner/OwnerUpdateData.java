package resipay.api.domain.owner;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import resipay.api.domain.shared.MaritalStatus;
import java.time.LocalDateTime;

public record OwnerUpdateData(
        long idTbOwner,
        //String uuid,
        String firstName,
        String lastName,
        //LocalDateTime birthDate,
        @NotBlank @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}") String cpf,
        String rg,
        String rne,
        String passport,
        String nationality,
        String naturalness,
        String mothersFullName,
        String fathersFullName,
        MaritalStatus maritalStatus,
        String occupation,
        String schooling,
        boolean activie,
        LocalDateTime updatedAt)  {
}
