package com.drafael.professional.clientfuninterfaces.services;

import com.drafael.professional.clientfuninterfaces.models.Principal;
import com.drafael.professional.clientfuninterfaces.models.RepoDetail;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class GitHubBasicService{

    private GitHubBasicApi gitHubApi;

    GitHubBasicService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        gitHubApi = retrofit.create(GitHubBasicApi.class);
    }

    public RepoDetail traerdata() throws IOException {
         var a = gitHubApi.contDetail1().execute().body();
         return a.get(0);
    }
    public RepoDetail repositorioDetallado() throws IOException {
         return gitHubApi.repositorioDetallado().execute().body();

    }

}