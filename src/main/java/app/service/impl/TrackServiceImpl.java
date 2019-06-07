package app.service.impl;

import app.model.Track;
import app.repos.TrackRepos;
import app.service.TrackService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author Alvin
 **/
@Service
public class TrackServiceImpl implements TrackService {

    private final TrackRepos trackRepos;

    @Autowired
    public TrackServiceImpl(TrackRepos trackRepos) {
        this.trackRepos = trackRepos;
    }

    @Override
    public Track save(@NonNull Track track) {
        return trackRepos.save(track);
    }

    @Override
    public Track findByName(@NonNull String name) {
        return trackRepos.findByName(name);
    }

    @Override
    public List<Track> findAll() {
        return trackRepos.findAll();
    }
}
