package Esercizio7112023.Esercizio7112023.controllers;

import Esercizio7112023.Esercizio7112023.entities.Autore;
import Esercizio7112023.Esercizio7112023.entities.BlogPost;
import Esercizio7112023.Esercizio7112023.services.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    @Autowired
    AutoreService autoreService;
    @GetMapping()
    public List<Autore> getAllAuthors(){

    }
    @GetMapping("/{id}")
    public Autore getSingleAuthor(@PathVariable int id){

    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public int saveNewAuthor(@RequestBody Autore a) throws IOException {

    }

    @PutMapping("/{id}")
    public Autore modifyAuthor(@RequestBody Autore a,@PathVariable int id) throws IOException {

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSingleAuthor(@PathVariable int id) throws IOException {

    }
}
