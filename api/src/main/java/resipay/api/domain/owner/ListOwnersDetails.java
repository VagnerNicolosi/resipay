package resipay.api.domain.owner;

import java.time.LocalDateTime;


public record ListOwnersDetails(
       // java.util.UUID uuid,
        String firstName,
        String lastName,
       // LocalDateTime birthDate,
        String cpf,
        String rg,
        String rne,
        String passport,
        String nationality,
        String naturalness,
        String mothersFullName,
        String fathersFullName,
        String maritalStatus,
        String occupation,
        String schooling) {
         public ListOwnersDetails(Owner owner){
             this(
                     //owner.getUuid(),
                     owner.getFirstName(),
                     owner.getLastName(),
                    //owner.getBirthDate(),
                     owner.getCpf(),
                     owner.getRg(),
                     owner.getRne(),
                     owner.getPassport(),
                     owner.getNationality(),
                     owner.getNaturalness(),
                     owner.getMothersFullName(),
                     owner.getFathersFullName(),
                     owner.getMaritalStatus().toString(),
                     owner.getOccupation(),
                     owner.getSchooling());
    }
}
