package com.drafael.professional.clientfuninterfaces.services;

import com.drafael.professional.clientfuninterfaces.models.Owner;
import com.drafael.professional.clientfuninterfaces.models.Repo;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubAPI {

    @GET("users/{user}/repos")
    Single<List<Repo>> listRepos(@Path("user") String user);

    @GET("repos/rafael1diego/AlmacenApp")
    Observable<Owner> contDetail(/*@Path("repo") String repo*/);

    @GET("repos/rafael1diego/AlmacenApp")
    Single<Owner> repoFull(/*@Path("repo") String repo*/);
}