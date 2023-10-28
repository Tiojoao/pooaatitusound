package br.edu.atitus.pooavancado.atitusound.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.MusicDTO;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.PlaylistDTO;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO> {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        super();
        this.playlistService = playlistService;
    }

    @Override
    GenericService<PlaylistEntity> getService() {
        return playlistService;
    }

    @PostMapping
    public ResponseEntity<PlaylistDTO> createPlaylist(@RequestBody PlaylistDTO playlistDTO) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<PlaylistDTO> getPlaylistById(@PathVariable UUID uuid) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<PlaylistDTO> updatePlaylist(@PathVariable UUID uuid, @RequestBody PlaylistDTO playlistDTO) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> deletePlaylist(@PathVariable UUID uuid) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{uuid}/musics")
    public ResponseEntity<List<MusicDTO>> getAllMusicsFromPlaylist(@PathVariable UUID uuid) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

	@Override
	PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
