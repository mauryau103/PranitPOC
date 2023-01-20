package com.mapstruct.validator;

public class productValidator{

    public int validate(int id) throws ProductValidationException{
        if(id==1){
                throw new ProductValidationException("Invalid id value");
        }
        return id;
    }

}
