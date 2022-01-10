package fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain;

import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.model.Bonsai;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.repository.BonsaiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BonsaiService {

    private final BonsaiRepository bonsaiRepository;

    public BonsaiService(BonsaiRepository bonsaiRepository) {
        this.bonsaiRepository = bonsaiRepository;
    }

    public Optional<Bonsai> findById(UUID uuid) {
        return bonsaiRepository.findById(uuid);
    }

    public List<Bonsai> findAll() {
        return bonsaiRepository.findAll();
    }

    public Bonsai create(Bonsai bonsai) {
        throw new UnsupportedOperationException();
    }

}
