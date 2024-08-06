package request;

import dto.Dto;

public class RequestDTO {

    public Dto insertUser(){
        Dto user = new Dto();

        user.setName("Breno");
        user.setJob("Analista");

        return user;

    }

}
