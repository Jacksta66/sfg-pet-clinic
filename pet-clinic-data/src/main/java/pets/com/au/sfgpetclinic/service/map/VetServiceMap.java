package pets.com.au.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;
import pets.com.au.sfgpetclinic.model.Vet;
import pets.com.au.sfgpetclinic.service.CrudService;
import pets.com.au.sfgpetclinic.service.VetService;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
