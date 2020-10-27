package ru.netology.manager;

import ru.netology.domain.Movies;

import java.util.Arrays;

public class PosterManager {
  private Movies[] movies = new Movies[0];

  public void add(Movies item) {
    // создаём новый массив размером на единицу больше
    int length = movies.length + 1;
    Movies[] tmp = new Movies[length];
    // itar + tab
    // копируем поэлементно
    // for (int i = 0; i < movies.length; i++) {
    //   tmp[i] = movies[i];
    // }
    System.arraycopy(movies, 0, tmp, 0, movies.length);
    // кладём последним наш элемент
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    movies = tmp;
  }

  public Movies[] getAll() {
    Movies[] result = new Movies[movies.length];
    // перебираем массив в прямом порядке
    // но кладём в результаты в обратном
    for (int i = 0; i < result.length; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }

  public Movies[] getLastTenMovies(int moviesQuantity) {
    Movies[] result = getAll();
    int moviesMax = 10;

    if (moviesQuantity < moviesMax) {
      moviesMax = moviesQuantity;
    }

    return Arrays.copyOfRange(result, 0, moviesMax);
  }
}
