package com.luan.swapi.dao;

import com.google.gson.Gson;
import com.luan.swapi.pojo.Characters;
import com.luan.swapi.pojo.Films;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class SwapiDao {

    private final String url = "https://swapi.co/";

    public String jdTest(String filmId, String characterId) {

        Gson gson = new Gson();

        if (filmId == null || characterId == null) {
            return "You must to inform: filmId and characterId.";
        }
        
        // Load the films.
        JSONObject resp = restRequest(url + "/api/films/" + filmId);
        Films films = gson.fromJson(resp.toString(), Films.class);

        // Separate the Persons from the loaded film.
        List<String> characteresFromFilm = films.getCharacters();

        // Get Character.
        JSONObject characterResp = restRequest(url + "/api/people/" + characterId);
        Characters character = gson.fromJson(characterResp.toString(), Characters.class);

        String specie = character.getSpecies().get(0);
        List<String> resultChars = new ArrayList<String>();

        for (String c : characteresFromFilm) {

            // Load specie from string c.
            JSONObject ch = restRequest(c);
            Characters cObject = gson.fromJson(ch.toString(), Characters.class);

            if (cObject.getSpecies().get(0).equals(specie)) {
                // add on the new JSON list
                resultChars.add(cObject.getName());
            }
        }
        
        return resultChars.toString();
    }

    public JSONObject restRequest(String url) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(
            url, HttpMethod.GET, entity, String.class);

        return new JSONObject(result.getBody());
    }
}
