package com.drafael.professional.clientfuninterfaces.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RepoDetail {

    public String login;
    public int id;
    public String node_id;
    public String avatar_url;
    public String gravatar_id;
    @Getter@Setter
    public String url;
    public String html_url;
    public String followers_url;
    public String following_url;
    public String gists_url;
    public String starred_url;
    public String subscriptions_url;
    public String organizations_url;
    public String repos_url;
    public String events_url;
    public String received_events_url;
    public String type;
    public boolean site_admin;
    public int contributions;
}