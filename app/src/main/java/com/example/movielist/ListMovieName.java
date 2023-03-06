package com.example.movielist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ListMovieName extends AppCompatActivity {
    RecyclerView rvMovieItem;
    ArrayList<MovieModel> movieListname;
    private MovieAdapter adapterMovieList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieListname = new ArrayList<>();
        rvMovieItem = findViewById(R.id.rvMovieItem);

        MovieModel movieOne = new MovieModel();
        movieOne.setMovieName("The Godfather trilogy");
        movieOne.setMovieYear("1972, 1974, 1990");
        movieOne.setMovieGenre("Crime, Drama");
        movieOne.setMovieDuration("2 jam 55 menit");
        movieOne.setImage(R.mipmap.godftaher);
        movieListname.add(movieOne);

        MovieModel movieTwo = new MovieModel();
        movieTwo.setMovieName("Silence of the Lamb");
        movieTwo.setMovieYear("1971");
        movieTwo.setMovieGenre("Mystery & thriller/Crime");
        movieTwo.setMovieDuration("1 jam 58 menit");
        movieTwo.setImage(R.mipmap.goat);
        movieListname.add(movieTwo);

        MovieModel movieThree = new MovieModel();
        movieThree.setMovieName("The Invisible Guest");
        movieThree.setMovieYear("2016");
        movieThree.setMovieGenre("Thriller");
        movieThree.setMovieDuration("1 Jam 46 Menit");
        movieThree.setImage(R.mipmap.hitam);
        movieListname.add(movieThree);

        MovieModel movieFour = new MovieModel();
        movieFour.setMovieName("Black Panther");
        movieFour.setMovieYear("2018");
        movieFour.setMovieGenre("Superhero");
        movieFour.setMovieDuration("2 Jam 15 Menit");
        movieFour.setImage(R.mipmap.iteng);
        movieListname.add(movieFour);

        MovieModel movieFive = new MovieModel();
        movieFive.setMovieName("Parasite");
        movieFive.setMovieYear("2019");
        movieFive.setMovieGenre("Thriller");
        movieFive.setMovieDuration("2 Jam 12 Menit");
        movieFive.setImage(R.mipmap.patong);
        movieListname.add(movieFive);

        MovieModel movieSix = new MovieModel();
        movieSix.setMovieName("Avengers: Endgame ");
        movieSix.setMovieYear("2019");
        movieSix.setMovieGenre("Superhero");
        movieSix.setMovieDuration("3 Jam 1 Menit");
        movieSix.setImage(R.mipmap.avengers);
        movieListname.add(movieSix);

        MovieModel movieSeven = new MovieModel();
        movieSeven.setMovieName("Toy Story 4");
        movieSeven.setMovieYear("2019");
        movieSeven.setMovieGenre("Family");
        movieSeven.setMovieDuration("1 Jam 40 Menit");
        movieSeven.setImage(R.mipmap.toy);
        movieListname.add(movieSeven);

        MovieModel movieEight = new MovieModel();
        movieEight.setMovieName("Kung Fu Hustle");
        movieEight.setMovieYear("2004");
        movieEight.setMovieGenre("Action, Comedy, Fantasy");
        movieEight.setMovieDuration("1 jam 39 menit");
        movieEight.setImage(R.mipmap.kung);
        movieListname.add(movieEight);

        MovieModel movieNine = new MovieModel();
        movieNine.setMovieName("Shaolin Soccer");
        movieNine.setMovieYear("2001");
        movieNine.setMovieGenre("Comedy, Action");
        movieNine.setMovieDuration("1 jam 53 menit");
        movieNine.setImage(R.mipmap.shaolin);
        movieListname.add(movieNine);

        MovieModel movieTen = new MovieModel();
        movieTen.setMovieName("Rush Hour");
        movieTen.setMovieYear("1999");
        movieTen.setMovieGenre("Action, Crime, Comedy");
        movieTen.setMovieDuration("1 jam 38 menit");
        movieTen.setImage(R.mipmap.rush);
        movieListname.add(movieTen);

        adapterMovieList = new MovieAdapter( this, movieListname);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvMovieItem.setHasFixedSize(true);
        rvMovieItem.setLayoutManager(mLayoutManager);
        rvMovieItem.setAdapter(adapterMovieList);

    }
}