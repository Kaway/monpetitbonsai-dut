package fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.repository;

import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.BonsaiMapper;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.model.Bonsai;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.commons.persistence.BonsaiDao;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.commons.persistence.BonsaiEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class BonsaiRepository {

    private final BonsaiDao bonsaiDao;

    public BonsaiRepository(BonsaiDao bonsaiDao) {
        this.bonsaiDao = bonsaiDao;
    }

    public Optional<Bonsai> findById(UUID uuid) {
        Optional<BonsaiEntity> entity = bonsaiDao.findById(uuid);
        return entity.map(BonsaiMapper::mapEntityToModel);
    }

    public List<Bonsai> findAll() {
        List<BonsaiEntity> entities = bonsaiDao.findAll();
        return BonsaiMapper.mapEntities(entities);
    }

    public Bonsai create(Bonsai bonsai) {
        BonsaiEntity bonsaiToCreate = BonsaiMapper.mapModelToEntity(bonsai);
        BonsaiEntity savedBonsai = bonsaiDao.save(bonsaiToCreate);
        return BonsaiMapper.mapEntityToModel(savedBonsai);
    }

}
