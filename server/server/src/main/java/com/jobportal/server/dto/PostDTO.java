package com.jobportal.server.dto;

import lombok.Data;

@Data   //it will generate everything getters, setters, constructors
public class PostDTO {

    private String profile;
    private String type;
    private String description;
    private String experience;
    private String[] technology;
    private String salary;


}
