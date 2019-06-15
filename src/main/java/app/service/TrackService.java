package app.service;

import app.domain.Track;

import java.util.List;

/**
 * @author Alvin
 **/

public interface TrackService {

    Track save(Track track);

    Track findByName(String name);

    List<Track> findAll();
}
