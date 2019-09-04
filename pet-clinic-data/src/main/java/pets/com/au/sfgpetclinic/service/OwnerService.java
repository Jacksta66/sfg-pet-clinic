package pets.com.au.sfgpetclinic.service;
import pets.com.au.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
