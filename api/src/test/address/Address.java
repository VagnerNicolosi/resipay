package resipay.api.domain.address;

import jakarta.persistence.*;
import lombok.*;
import resipay.api.domain.address.Category;
import java.util.UUID;

@Table(name = "tbAddresses")
@Entity(name = "Address")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTbAddress")

public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long idTbAddress;
    @Column(columnDefinition = "BINARY(16)") private UUID uuid;
    private Category category;
    private String publicPlace;
    private String numberHouse;
    private String complement;
    private String district;
    private String cep;
    private String city;
    private String state;
    private long tbAddressOwnerId;
    private long tbAddressTenantId;
    private long tbPropertieId;
    private Data createdAt;
    private Data updatedAt;

    public Address(AddressData data) {
        this.uuid = UUID.randomUUID();
        this.category = data.category();
        this.publicPlace = data.publicPlace();
        this.numberHouse = data.numberHouse();
        this.complement = data.complement();
        this.district = data.district();
        this.cep = data.cep();
        this.state = data.state();
        this.city = data.city();
        this.tbAddressOwnerId = data.tbAddressOwnerId();
        this.tbAddressTenantId = data.tbAddressTenantId();
        this.tbPropertieId = data.tbPropertieId();
        this.createdAt = data.createdAt();
        this.updatedAt = data.updatedAt();
    }

    public void UpdateAddress(AddressData data) {
        if (data.category() != null) {
            this.category = data.category();
        }
        if (data.publicPlace() != null) {
            this.publicPlace = data.publicPlace();
        }
        if (data.numberHouse() != null) {
            this.numberHouse = data.numberHouse();
        }
        if (data.complement() != null) {
            this.complement = data.complement();
        }
        if (data.district() != null) {
            this.district = data.district();
        }
        if (data.cep() != null) {
            this.cep = data.cep();
        }
        if (data.state() != null) {
            this.state = data.state();
        }
        if (data.city() != null) {
            this.city = data.city();
        }
    }
}
