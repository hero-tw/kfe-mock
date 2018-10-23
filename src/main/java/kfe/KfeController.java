package kfe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KfeController {

    @RequestMapping("/")
    public int index() {
        return 50;
    }

}