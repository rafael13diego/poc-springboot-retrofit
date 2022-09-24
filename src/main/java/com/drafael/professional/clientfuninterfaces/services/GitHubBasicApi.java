package com.drafael.professional.clientfuninterfaces.services;


import com.drafael.professional.clientfuninterfaces.models.Principal;
import com.drafael.professional.clientfuninterfaces.models.RepoDetail;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface GitHubBasicApi {

    @GET("repos/rafael1diego/AlmacenApp/contributors")
    Call<List<RepoDetail>> contDetail1(/*@Path("repo") String repo*/);

    @GET("repos/rafael1diego/AlmacenApp")
    Call<RepoDetail> repositorioDetallado(/*@Path("repo") String repo*/);

}