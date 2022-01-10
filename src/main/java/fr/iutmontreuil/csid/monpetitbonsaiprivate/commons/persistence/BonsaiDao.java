package fr.iutmontreuil.csid.monpetitbonsaiprivate.commons.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface BonsaiDao extends JpaRepository<BonsaiEntity, UUID> {

}
