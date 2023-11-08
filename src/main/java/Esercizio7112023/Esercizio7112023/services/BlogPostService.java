package Esercizio7112023.Esercizio7112023.services;

import Esercizio7112023.Esercizio7112023.entities.BlogPost;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

    List<BlogPost> blogPosts=new ArrayList<>();

  /*  public List<BlogPost> getAllBlogPosts(){


    public BlogPost getSingleBlogPost(int id) {

    }

    public int saveNewPost(BlogPost p) throws IOException {
        Random rnd=new Random();
        p.setId(rnd.nextInt(1,10000));
        blogPosts.add(p);
        String obj=p.getId()+"@"+p.getCategoria()+"@"+p.getTitolo()+"@"+"https://picsum.photos/200/300"+"@"+p.getContenuto()+"@"+p.getTempoDiLettura()+"#";
        FileUtils.writeStringToFile(blogPostFile,obj, StandardCharsets.UTF_8,true);
        return p.getId();
    }

    public BlogPost modifyBlogPost(BlogPost p,int id) throws IOException {

    }

    public void deleteSingleBlogPost(int id) throws IOException {

    }*/
}
