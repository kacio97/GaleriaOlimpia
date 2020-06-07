package com.mainactivity.galeriaolimpia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterMovie extends ArrayAdapter<Movie> {

    private Activity activity;
    private ArrayList<Movie> movies;
    private LayoutInflater inflater = null; //static

    public AdapterMovie(Activity activity, int resourceId, ArrayList<Movie> movies) {
        super(activity, resourceId, movies);

        try {
            this.activity = activity;
            this.movies = movies;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        } catch (Exception e) {

        }
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public int getPosition(@Nullable Movie item) {
        return super.getPosition(item);
    }

    @Nullable
    @Override
    public Movie getItem(int position) {
        return super.getItem(position);
    }

    public static class ViewHolderMovie {
        //TODO: Implementacja pol layouta

        public ImageView logo;
        public TextView title;
        public TextView year;
        public TextView category;
        public TextView desc;
        public TextView days;
    }

    @NonNull
    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View view = convertView;
        final ViewHolderMovie holderMovie;

        if(convertView == null){
            view = inflater.inflate(R.layout.movie_list_view_single_element, null);
            holderMovie = new ViewHolderMovie();

            holderMovie.logo = view.findViewById(R.id.ivMovieLogo);
            holderMovie.title = view.findViewById(R.id.tvTitle);
            holderMovie.year = view.findViewById(R.id.tvYear);
            holderMovie.category = view.findViewById(R.id.tvCategory);
            holderMovie.desc = view.findViewById(R.id.tvDescription);
            holderMovie.days = view.findViewById(R.id.tvDays);

            view.setTag(holderMovie);

        }else {
            holderMovie = (ViewHolderMovie) view.getTag();
        }

        holderMovie.title.setText(movies.get(position).getTitle());
        holderMovie.category.setText(movies.get(position).getCategory());
        holderMovie.logo.setImageResource(movies.get(position).getCover());
        holderMovie.days.setText(movies.get(position).getPlayDay().toString());
        holderMovie.year.setText(movies.get(position).getYear());
        holderMovie.desc.setText(movies.get(position).getDescription());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ShowingDetailsActivity.class);
                intent.putExtra("logo", movies.get(position).getCover());
                intent.putExtra("title", movies.get(position).getTitle());
                intent.putExtra("year", movies.get(position).getYear());
                intent.putExtra("desc", movies.get(position).getDescription());
                intent.putExtra("category", movies.get(position).getCategory());
                intent.putExtra("days", movies.get(position).getPlayDay().toString());
                intent.putExtra("hours", movies.get(position).getPlayHour().toString());
                intent.putExtra("room", movies.get(position).getRoom());
                activity.startActivity(intent);
            }
        });

        return view;
    }
}
