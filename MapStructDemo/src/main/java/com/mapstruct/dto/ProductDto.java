package com.mapstruct.dto;

import com.mapstruct.model.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.util.List;

@Setter
@Getter
public class ProductDto {

    @Id
    private int id;
    private String name;

    private String description;

    private String quantity;
    private long price;
  //  private String itemId;

  //  private List<Item> itemList;

}


//what is the difference between Entity class and DTO class.
//1.Entity class is mapped with the Table.
//2.And the DTO class is mapped with the View layer (front end).
//whatever data we are going to present to the front end is stored in  the view layer.

//now here after this we need to map the model class with Dto Model class
//for this we have done modeling manually
//but there is Map struct for all this thing to save our time