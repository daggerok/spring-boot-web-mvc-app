package daggerok.web;

import daggerok.data.Profile;
import daggerok.data.ProfileRestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexPage {

    final ProfileRestRepository profileRestRepository;

    @GetMapping("/")
    String index(final Model model) {

        model.addAttribute(Profile.MODEL_LIST_NAME, profileRestRepository.findAll());
        return "index";
    }
}
