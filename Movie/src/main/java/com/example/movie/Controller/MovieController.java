package com.example.movie.Controller;

import com.example.movie.Service.MovieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("api/v1/movie")
@RequiredArgsConstructor
@Service
public class MovieController {

    private final MovieService movieService;


    @GetMapping("/get")
    public ResponseEntity<List<Movie>> getAllmovie(){
        List<Movie> MovieList = movieService.getAllMovie();
        return ResponseEntity.status(200).body(movieList);

    }

    @PostMapping("/add")
    public ResponseEntity addMovie(@Valid @RequestBody Movie movie){
        {
            String message=movie.getFieldMovie().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
        movieService.addMovie(movie);
        return ResponseEntity.status(200).body("Movie added");
    }
    @PutMapping("update/{id}")
    public ResponseEntity uptadeMovie(@Valid @RequestBody Movie movie,@PathVariable Integer id) {


            String message = movie.getFieldMovie().getDefaultMessage();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
        boolean isUpdate = movieService.uptadeMovie(id, movie);
        if (isUpdate) {
            return ResponseEntity.status(200).body("Movie update");


        }

        public ResponseEntity deleteMovie(@Valid @PathVariable Movie movie){
            ResponseEntity.deleteMovie(id ,Movie);
            return new ResponseEntity<>(HttpStatusCode.OK);
        }

    }
}
