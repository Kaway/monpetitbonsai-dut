package fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai;

import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.model.Bonsai;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.exposition.dto.BonsaiDTO;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.commons.persistence.BonsaiEntity;

import java.util.Collections;
import java.util.List;

// TODO: complete all the methods !
public class BonsaiMapper {

    public static BonsaiDTO mapModelToDto(Bonsai bonsai) {
        return new BonsaiDTO();
    }

    public static List<BonsaiDTO> mapModels(List<Bonsai> bonsais) {
        return Collections.emptyList();
    }

    public static Bonsai mapDtoToModel(BonsaiDTO bonsaiDTO) {
        return new Bonsai(null, null, null);
    }

    public static List<Bonsai> mapDtos(List<BonsaiDTO> bonsaiDTOS) {
        return Collections.emptyList();
    }

    public static BonsaiEntity mapModelToEntity(Bonsai bonsai) {
        return new BonsaiEntity();
    }

    public static List<BonsaiEntity> mapModelToDtos(List<Bonsai> bonsais) {
        return Collections.emptyList();
    }

    public static Bonsai mapEntityToModel(BonsaiEntity bonsaiEntity) {
        return new Bonsai(null, null, null);
    }

    public static List<Bonsai> mapEntities(List<BonsaiEntity> bonsaiEntities) {
        return Collections.emptyList();
    }
}
