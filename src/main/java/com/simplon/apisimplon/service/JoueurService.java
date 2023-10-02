package com.simplon.apisimplon.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.simplon.apisimplon.repository.JoueurRepository;

public class JoueurService {
    @Autowired
    JoueurRepository joueurRepository;

    public Iterable<Joueur> getJoueurs() {
        return joueurRepository.getAllJoueurs();
    }

    public Joueur getJoueur(long id){
        return joueurRepository.getJoueurById(id);
    }

    public Joueur saveJoueur(Joueur joueur) {
        return joueurRepository.addJoueur(joueur);
    }

    public boolean removeJoueur(long id) {
        return joueurRepository.deleteJoueur(id);
    }
    
}