package com.drafael.professional.clientfuninterfaces.services;

import com.drafael.professional.clientfuninterfaces.models.Character;
import com.drafael.professional.clientfuninterfaces.models.ComicResult;
import com.drafael.professional.clientfuninterfaces.models.Principal;
import io.reactivex.Single;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

@Service
public class MarvelServiceImpl {

    private MarvelService marvelService;

    MarvelServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gateway.marvel.com/v1/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        marvelService = retrofit.create(MarvelService.class);
    }

    public Single<List<ComicResult>> getComic1(){

        return marvelService.r3().map( principal -> principal.getData())
                .map(data -> data.getResults());
    }

    public Single<List<Character>> getCharacter(){

        return marvelService.getCharacters()
                .map( principal -> principal.getData())
                .map( data -> data.getResults());
    }
    public Single<?> getCreator(){
        return marvelService.getCreators()
                .map( principal -> principal.getData())
                .map( data -> data.getResults());
    }

    public Single<?> uniqueComic(){
        return marvelService.uniqueComic()
                .map(Principal::getData)
                .map( results -> results.getResults().get(0));
    }
    public Single<Boolean> existComic(){
        return marvelService.uniqueComic()
                .map(Principal::getData)
                .map( results -> results.getResults().size()>0);
    }


}