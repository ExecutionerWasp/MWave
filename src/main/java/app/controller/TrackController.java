package app.controller;

import app.domain.Track;
import app.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alvin
 **/
@RestController
@RequestMapping("/track")
public class TrackController {

    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/list")
    public List<Track> list(){
        return trackService.findAll();
    }

    @PostMapping("/add")
    public Track add(@RequestBody Track track){
        return trackService.save(track);
    }

    @PostMapping("/find/{name}")
    public Track getByName(@PathVariable String name){
        return trackService.findByName(name);
    }
}
