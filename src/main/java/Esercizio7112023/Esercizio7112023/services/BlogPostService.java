package Esercizio7112023.Esercizio7112023.services;

import Esercizio7112023.Esercizio7112023.entities.Autore;
import Esercizio7112023.Esercizio7112023.entities.BlogPost;

import Esercizio7112023.Esercizio7112023.entities.Post;
import Esercizio7112023.Esercizio7112023.exceptions.NotFoundException;
import Esercizio7112023.Esercizio7112023.repositories.AutoreRepository;
import Esercizio7112023.Esercizio7112023.repositories.BlogPostRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BlogPostService {

@Autowired
private BlogPostRepository blogPostRepository;
@Autowired
private AutoreRepository autoreRepository;

    public List<BlogPost> getAllBlogPosts(){
        return blogPostRepository.findAll();
    }


    public BlogPost getSingleBlogPost(int id) {
        return blogPostRepository.findById(id).orElseThrow(()->new NotFoundException("Elemento non trovato"));
    }

    public BlogPost saveNewPost(Post p){
        Autore a=autoreRepository.findById(p.getAutore_id()).orElseThrow(()->new NotFoundException("Autore inesistente"));
        p.setCover("https://picsum.photos/200/300");
        BlogPost app= BlogPost.builder().categoria(p.getCategoria()).Titolo(p.getTitolo()).contenuto(p.getContenuto()).tempoDiLettura(p.getTempoDiLettura()).autore(a).cover(p.getCover()).build();
        return blogPostRepository.save(app);

    }

    public BlogPost modifyBlogPost(BlogPost p,int id) throws IOException {
      BlogPost current=this.getSingleBlogPost(id);
        current.setCategoria(p.getCategoria());
        current.setTitolo(p.getTitolo());
        current.setCover("https://picsum.photos/200/300");
        current.setContenuto(p.getContenuto());
        current.setTempoDiLettura(p.getTempoDiLettura());
        current.setAutore(p.getAutore());
        return blogPostRepository.save(current);
    }

    public void deleteSingleBlogPost(int id) throws IOException {
       BlogPost current=this.getSingleBlogPost(id);
        blogPostRepository.delete(current);
    }
}






