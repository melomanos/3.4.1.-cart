package ru.netology.repository;

import ru.netology.domain.Movies;

public class PosterRepository {
    private Movies[] movies = new Movies[0];

    public Movies[] findAll() {
        Movies[] tmp = new Movies[movies.length];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[i];
        }

        tmp = movies;
        return movies;
    }

    public void save(Movies item) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public Movies findById(int id) {
        Movies[] tmp = new Movies[movies.length];
        Movies[] result = new Movies[1];
        int idResult = id - 1;
        for (int i = 0; i < tmp.length; i++) {
            if (i == idResult) {
                result[0] = movies[i];
            }
        }

        movies = result;
        return movies[0];
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        Movies[] tmp = new Movies[length];
        int index = 0;
        for (Movies item : movies) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }

        movies = tmp;
    }

    public void removeAll() {
        this.movies = new Movies[0];
    }
}
