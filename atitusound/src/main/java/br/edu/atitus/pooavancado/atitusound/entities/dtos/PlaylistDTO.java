package br.edu.atitus.pooavancado.atitusound.entities.dtos;

import java.util.List;
import java.util.UUID;

public class PlaylistDTO {

    private UUID uuid;
    private String name;
    private boolean public_share;
    private List<DTOOnlyUuid> musics;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublicShare() {
        return public_share;
    }

    public void setPublicShare(boolean public_share) {
        this.public_share = public_share;
    }

    public List<DTOOnlyUuid> getMusics() {
        return musics;
    }

    public void setMusics(List<DTOOnlyUuid> musics) {
        this.musics = musics;
    }
}
