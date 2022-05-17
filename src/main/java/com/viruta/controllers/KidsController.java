package com.viruta.controllers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class KidsController {
    private List<String> kids;
    private Map<String, List<RequestDonor>> donors;

    public KidsController() {

        kids = new ArrayList<>();

        kids.add("Marlon");
        kids.add("Jessi");
        kids.add("Rosa");
        kids.add("Javier");

        donors = new HashMap<>();
    }

    @GetMapping("/kids")
    public List<String> findAll() {
        return kids;
    }

    @GetMapping("/kids/{id}")
    public String findById(@PathVariable("id") String id) {
        for(String kid: kids) {
            if(kid.equals(id)) {
                return kid;
            }
        }
        return null;
    }

    @PostMapping("/kids")
    public String createNewKid(@RequestBody String kidName) {
        kids.add(kidName);
        return kidName;
    }

    @PostMapping("/kids/{name}/donors")
    public String addDonorsToKids(@PathVariable("name") String id, @RequestBody List<RequestDonor> donors ) {

        this.donors.put(id,donors);
        return "OK";
    }

    @GetMapping("/kids/{name}/donors")
    public List<RequestDonor> getDonorsFromKid(@PathVariable("name") String name) {
        return this.donors.get(name);
    }

    static class RequestDonor {
        public String name;
        public String lastName;
    }

    @DeleteMapping("/kids/{id}")
    public String deleteKid(@PathVariable("id") String id) {
        kids.remove(id);
        return id;
    }

    @GetMapping("/kids/startingWith/{character}")
    public String findByLetter(@PathVariable("character") String character) {
        for(String kid: kids) {
            if (kid.startsWith(character)) {
                return kid;
            }
        }
        return null;
    }
}
