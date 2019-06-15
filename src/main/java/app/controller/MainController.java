package app.controller;

import app.domain.User;
import app.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alvin
 **/
@Controller
@RequestMapping("/")
public class MainController {

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${spring.application.name}")
    private String title;

    private final TrackService trackService;

    @Autowired
    public MainController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping
    public String main(Model model, @AuthenticationPrincipal User user){
        Map<Object, Object> data = new HashMap<>();
        data.put("profile", user);
        data.put("tracks", trackService.findAll());

        model.addAttribute("frontData", data);
        model.addAttribute("isDevMode", "dev".equals(profile));
        return "index";
    }
}
