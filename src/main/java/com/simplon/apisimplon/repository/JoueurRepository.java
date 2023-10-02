package com.simplon.apisimplon.repository;

public class JoueurRepository {




    public boolean deleteJoueur(long id) {
        RestTemplate r = new RestTemplate();
        ResponseEntity<boolean> response = r.exchange(
            baseUrlApi + "/player/" + id,
            HttpMethod.DELETE,
            null,
            Boolean.class
        );
        return response.getBody();
    }
    
}