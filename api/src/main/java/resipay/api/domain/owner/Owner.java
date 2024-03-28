package resipay.api.domain.owner;

import lombok.*;
import jakarta.persistence.*;
import resipay.api.domain.shared.MaritalStatus;
import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "tbOwners")
@Entity(name = "Owner")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbOwner")

public class Owner {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long idTbOwner;
    @Column(columnDefinition = "BINARY(16)") private UUID uuid;
    private String firstName;
    private String lastName;
   // private LocalDateTime birthDate;
    private String cpf;
    private String rg;
    private String rne;
    private String passport;
    private String nationality;
    private String naturalness;
    private String mothersFullName;
    private String fathersFullName;
    @Enumerated(EnumType.STRING) private MaritalStatus maritalStatus;
    private String occupation;
    private String schooling;
    private boolean activie;
    private boolean manager;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Owner (OwnerData data){
        this.idTbOwner = data.idTbOwner();
       // this.uuid = data.uuid();
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        //this.birthDate = data.birthDate();
        this.cpf = data.cpf();
        this.rg = data.rg();
        this.rne = data.rne();
        this.passport = data.passport();
        this.nationality = data.nationality();
        this.naturalness = data.naturalness();
        this.mothersFullName = data.mothersFullName();
        this.fathersFullName = data.fathersFullName();
        this.activie = true;
        this.manager = true;
        this.createdAt = data.createdAt();
        this.updatedAt = data.updatedAt();
    }

    public void updateData(OwnerUpdateData data) {
        if (data.firstName() != null) {
            this.firstName = data.firstName();
        }
        if (data.lastName() != null) {
            this.lastName = data.lastName();
        }
       // if (data.birthDate() != null) {
        //    this.birthDate = data.birthDate();
        //}
        if (data.cpf() != null) {
            this.cpf = data.cpf();
        }
        if (data.rg() != null) {
            this.rg = data.rg();
        }
        if (data.rne() != null) {
            this.rne = data.rne();
        }
        if (data.passport() != null) {
            this.passport = data.passport();
        }
        if (data.nationality() != null) {
            this.nationality = data.nationality();
        }
        if (data.naturalness() != null) {
            this.naturalness = data.naturalness();
        }
        if (data.mothersFullName() != null) {
            this.mothersFullName = data.mothersFullName();
        }
        if (data.fathersFullName() != null) {
            this.fathersFullName = data.fathersFullName();
        }
    }

    public void delete() {
        this.activie = false;
    }

}
