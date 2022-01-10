package fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.exposition;

import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.BonsaiMapper;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.BonsaiService;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.model.Bonsai;
import fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.exposition.dto.BonsaiDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bonsais")
public class BonsaiController {

    private final BonsaiService bonsaiService;

    public BonsaiController(BonsaiService bonsaiService) {
        this.bonsaiService = bonsaiService;
    }

    @GetMapping
    public List<BonsaiDTO> findAllBonsais() {
        List<Bonsai> bonsais = bonsaiService.findAll();
        return BonsaiMapper.mapModels(bonsais);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<BonsaiDTO> findBonsaiById(@PathVariable("uuid") UUID uuid) {
        throw new UnsupportedOperationException();
    }

    // TODO: annotation
    public ResponseEntity<BonsaiDTO> createBonsai(@RequestBody BonsaiDTO bonsaiDTO) {
        throw new UnsupportedOperationException();
    }

    // TODO: annotation
    public ResponseEntity<BonsaiDTO> updateBonsai(/* TODO: parameters */) {
        throw new UnsupportedOperationException();
    }

    // TODO: annotation
    public ResponseEntity<Void> deleteBonsai(/* TODO: parameters */) {
        throw new UnsupportedOperationException();
    }

    // TODO: annotation
    public ResponseEntity<Void> changeStatus(/* TODO: parameters */) {
        throw new UnsupportedOperationException();
    }

}
