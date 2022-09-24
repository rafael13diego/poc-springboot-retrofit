package com.drafael.professional.clientfuninterfaces.controllers;

import com.drafael.professional.clientfuninterfaces.models.Character;
import com.drafael.professional.clientfuninterfaces.models.ComicResult;
import com.drafael.professional.clientfuninterfaces.models.Principal;
import com.drafael.professional.clientfuninterfaces.services.GitHubBasicService;
import com.drafael.professional.clientfuninterfaces.services.GitHubService;

import com.drafael.professional.clientfuninterfaces.services.MarvelServiceImpl;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/api/")
public class GitHubController {

    @Autowired
    private GitHubService service;

    @Autowired
    private GitHubBasicService service2;

    @Autowired
    private MarvelServiceImpl service3;

    @ResponseBody
    @GetMapping(produces = "application/json;charset=UTF-8")/*("{repo}")*/
    public Single<?> getUser(/*@PathVariable String repo*/) throws IOException {

        //return service2.repositorioDetallado();
        //return service.repoFull();
        // - return service.getRepoDetail().subscribeOn(Schedulers.io());
        String name = "rafael1diego";
        //return service.getRepoInfo(name);
        return service3.getComic1();
    }

    @ResponseBody
    @GetMapping("comics")
    public Single<List<ComicResult>> getComics() throws IOException {

        //Clases Genericas! - Polimorfismo
        // TODO: GraphQL
        return service3.getComic1();
    }
    @ResponseBody
    @GetMapping("characters")
    public Single<List<Character>> getCharacters2() throws IOException {

        //Clases Genericas! - Polimorfismo
        // TODO: GraphQL
        return service3.getCharacter();
    }
    @ResponseBody
    @GetMapping("creators")
    public Single<?> getCreators() throws IOException {

        //Clases Genericas! - Polimorfismo
        // TODO: GraphQL
        return service3.getCreator();
    }

    @ResponseBody
    @GetMapping("cha2")
    public Single<?> getB() throws IOException {

        //Clases Genericas! - Polimorfismo
        // TODO: GraphQL
        return service3.uniqueComic();
    }

    @ResponseBody
    @GetMapping("exists")
    public Single<Boolean> getExistsComic(){

        //Clases Genericas! - Polimorfismo
        // TODO: GraphQL
        return service3.existComic();
    }

}