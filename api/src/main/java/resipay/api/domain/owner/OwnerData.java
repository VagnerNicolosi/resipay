package resipay.api.domain.owner;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import resipay.api.domain.shared.MaritalStatus;
import java.time.LocalDateTime;


public record OwnerData(
  long idTbOwner,
  // String uuid,
  String firstName,
  String lastName,
  // @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
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
  LocalDateTime createdAt,
  LocalDateTime updatedAt) {

}