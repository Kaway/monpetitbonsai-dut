package fr.iutmontreuil.csid.monpetitbonsaiprivate.commons.persistence;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity(name = "Bonsai")
@Table(name = "bonsai")
public class BonsaiEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @OneToMany(targetEntity = CareEventEntity.class, mappedBy = "id.bonsaiId")
    private List<CareEventEntity> careEvents;

    public BonsaiEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
