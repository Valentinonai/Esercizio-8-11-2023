package Esercizio7112023.Esercizio7112023.services;

import Esercizio7112023.Esercizio7112023.entities.Autore;
import Esercizio7112023.Esercizio7112023.entities.BlogPost;

import Esercizio7112023.Esercizio7112023.repositories.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {

@Autowired
private AutoreRepository autoreRepository;

    public List<Autore> getAllAuthors() {
            return autoreRepository.findAll();
    }

    public Autore getSingleAuthor(int id) {
        return autoreRepository.findById(id).orElse(()->new Exception(""));
    }


    public int saveNewAuthor(Autore a) throws IOException {

    }

    public Autore modifyAuthor(Autore a,int id) throws IOException {

    }

    public void deleteSingleAuthor(int id) throws IOException {
    }
}
