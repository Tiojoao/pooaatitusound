package br.edu.atitus.pooavancado.atitusound.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.atitusound.entities.MusicEntity;
import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.repositories.GenericRepository;
import br.edu.atitus.pooavancado.atitusound.repositories.PlaylistRepository;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepository repository;

    public PlaylistServiceImpl(PlaylistRepository repository) {
        this.repository = repository;
    }

    @Override
    public GenericRepository<PlaylistEntity> getRepository() {
        return repository;
    }


}
