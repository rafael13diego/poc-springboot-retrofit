package com.drafael.professional.clientfuninterfaces.services;

import com.drafael.professional.clientfuninterfaces.models.Owner;
import com.drafael.professional.clientfuninterfaces.models.Repo;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;

@Service
public class GitHubService {


    private GitHubAPI gitHubApi;

    GitHubService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        gitHubApi = retrofit.create(GitHubAPI.class);
    }

    public Single<Owner> repoFull(){

        return gitHubApi.repoFull().map( owner -> owner);
    }

    public Single<List<Repo>> getRepoInfo(String userName) {
        return gitHubApi.listRepos(userName);
    }

    public Observable<Owner> getRepoDetail(/*String repo*/){
        return gitHubApi.contDetail(/*repo*/)
                .map( owner -> owner);
    }
}