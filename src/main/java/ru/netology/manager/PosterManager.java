package ru.netology.manager;

import ru.netology.domain.Movies;
import ru.netology.repository.PosterRepository;

public class PosterManager {

  private PosterRepository repository;

  private PosterManager(PosterRepository repository) {
    this.repository = repository;
  }

  public Movies[] getAll() {
    Movies[] movies = repository.findAll();
    Movies[] result = new Movies[movies.length];
    // перебираем массив в прямом порядке
    // но кладём в результаты в обратном
    for (int i = 0; i < result.length; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }

  public void removeById(int id) {
    repository.removeById(id);
  }
}
