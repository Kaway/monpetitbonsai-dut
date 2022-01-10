package fr.iutmontreuil.csid.monpetitbonsaiprivate.bonsai.domain.model;

import java.util.UUID;

public class Bonsai {

    private final UUID id;
    private String name;
    private String species;

    // Add the missing fields

    public Bonsai(UUID id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

}
