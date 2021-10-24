package com.example.rabbit.publish.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/24/21
 */

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Item.class)
@Data
@NoArgsConstructor
public class Item {

    private String itemName;
    private String category;
    private String description;
}
