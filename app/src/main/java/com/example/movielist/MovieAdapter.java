package com.example.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private Context context;
    private List<MovieModel> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView Movie, Year, Duration, Genre;
        public ImageView movieImage;

        public MyViewHolder(View view){
            super(view);
            Movie = view.findViewById(R.id.tvMovieName);
            Year = view.findViewById(R.id.tvMovieYear);
            Duration = view.findViewById(R.id.tvMovieDuration);
            Genre = view.findViewById(R.id.tvMovieGenre);
            movieImage = view.findViewById(R.id.movieImage);

        }
    }
    public MovieAdapter(Context context, List<MovieModel> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    final MovieModel movie = this.movieList.get(position);
    holder.Movie.setText(movie.getMovieName());
    holder.Year.setText(movie.getMovieYear());
    holder.Duration.setText(movie.getMovieDuration());
    holder.Genre.setText(movie.getMovieGenre());
    holder.movieImage.setImageResource(movie.getImage());
    }

    @Override
    public int getItemCount() {
        return this.movieList.size();
    }
}
