package com.drafael.professional.clientfuninterfaces.models;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Owner{
    public int id;
    public String node_id;
    public String name;
    public String full_name;
    public boolean myprivate;
    public String html_url;
    public String description;
    public boolean fork;
    public String url;
    public String forks_url;
    public String keys_url;
    public String collaborators_url;
    public String teams_url;


}