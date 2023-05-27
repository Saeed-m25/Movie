package com.example.movie.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class MovieModel {
//    ID, name , genre , rating , duration , directorID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Cannot be null")
    @Column(columnDefinition = "Length more than 2")
    private String name;
   @NotEmpty(message = "Cannot be null")
   @Column
    private String genre;
   @NotEmpty(message = "Cannot be null")
   @Column
    private String rating;
    @NotNull(message ="Cannot be null" )
    @Column
   private double duration;
    @NotEmpty(message = "Cannot be null")
    @Column
    private String directorID;


}
