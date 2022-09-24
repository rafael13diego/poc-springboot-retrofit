package com.drafael.professional.clientfuninterfaces.services;

import com.drafael.professional.clientfuninterfaces.models.*;
import com.drafael.professional.clientfuninterfaces.models.Character;
import io.reactivex.Single;
import retrofit2.http.GET;


public interface MarvelService {
    

    //TODO: Update apikey value
    @GET("comics?apikey=a720caf23803001e????")
    Single<Principal<ComicResult>> r3();

    @GET("creators?apikey=a720caf23803001e????")
    Single<Principal<Creator>> getCreators();

    @GET("characters?apikey=a720caf23803001e????")
    Single<Principal<Character>> getCharacters();

    @GET("characters/1009146?apikey=a720caf23803001e????")
    Single<Principal<Character>> uniqueComic();

    @GET("characters/1009146?apikey=a720caf23803001e????")
    Single<Principal<Character>> existComic();




}