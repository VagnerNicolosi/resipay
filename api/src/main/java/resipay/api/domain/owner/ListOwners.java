package resipay.api.domain.owner;

public record ListOwners(
       // java.util.UUID uuid,
        String firstName,
        String lastName,
        String cpf,
        String mothersFullName) {
    public ListOwners(Owner owner){
        this(
                //owner.getUuid(),
                owner.getFirstName(),
                owner.getLastName(),
                owner.getCpf(),
                owner.getMothersFullName());
    }
}
