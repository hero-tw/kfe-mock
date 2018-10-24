package kfe.service;

import kfe.model.Identity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class KfeController {

    @RequestMapping("/")
    public int index() {
        return 50;
    }

    @PostMapping("/score")
    public int score(@RequestBody Identity value){
        LocalDate birthdate = value.getDateOfBirth();
        LocalDate validDate = LocalDate.now();
        if (birthdate.isAfter(validDate.minusYears(18))) {
            return 0;
        }
        return 100;
    }

}