package com.example.movie.Service;

import com.example.movie.Repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;


    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie) {
        MovieRepository.save(movie);
    }

    public Boolean uptadeMovie(Integer id, Movie movie) {
        Movie oldMovie = movieRepository.getById(id);
        if (oldMovie == null) {
            return false;
        }
        oldMovie.setName(movie.getgenry());
        oldMovie.setgenry(movie.getrating());
        oldMovie.setrating(movie.getname());


        movieRepository.save(oldMovie);
        return true;

    }

    public Boolean deleteMovie(Integer id) {
        Movie oldUser = movieRepository.getById(id);
        if (oldMovie == null) {
            return false;
        }
        movieRepository.delete(oldMovie);
        return true;
    }

    public  GetUserByMovienameAndPassword(String Moviename, String password) {
        Users user = movieRepository.findUsersByMovienameAndPassword(Moviename, password);
        if (Movie == null) {
            throw new ApiExeception("not found");

        }

        return Movie;
    }
}
