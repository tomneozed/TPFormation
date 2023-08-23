package com.formation.TPFormation.controllers;

import com.formation.TPFormation.dtos.TimeResponse;
import com.formation.TPFormation.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

@RestController
@RequestMapping(path = "/api/test")
public class TP1Controller {
    @GetMapping(path = "/greeting")
    public String maMethode(@RequestParam(name = "n", required = false, defaultValue = "John Doe") String nom) {
        return "Bonjour " + nom + " !";
    }

    @GetMapping(path = "/time/{z}")
    public TimeResponse getCurrentTime(@PathVariable(name = "z") String zone) {
        Date date = new Date();

        if (Arrays.stream(TimeZone.getAvailableIDs()).noneMatch(bidule -> bidule.equals(zone))) {
            throw new NotFoundException("La zone n'existe pas");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");

        TimeZone tz = TimeZone.getTimeZone(zone);

        stf.setTimeZone(tz);

        return new TimeResponse(sdf.format(date), stf.format(date), tz.getDisplayName());
    }
}
