package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;
import ru.netology.repository.PosterRepository;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
  PosterRepository repository = new PosterRepository();

  Movies first = new Movies(1, "Rambo", "Action", 1);
  Movies second = new Movies(2, "Terminator", "Sci-fi", 1);
  Movies third = new Movies(3, "Mad Max", "Action", 1);
  Movies fourth = new Movies(4, "Alien", "Horror", 1);
  Movies fifth = new Movies(5, "8 Mile", "Drama", 1);
  Movies sixth = new Movies(6, "Avatar", "Sci-fi", 1);
  Movies seventh = new Movies(7, "Insidious", "Horror", 1);
  Movies eighth = new Movies(8, "Sin City", "Action", 1);
  Movies ninth = new Movies(9, "Leon", "Action", 1);
  Movies tenth = new Movies(10, "Sinister", "Horror", 1);
  Movies eleventh = new Movies(11, "Revolver", "Crime", 1);

  @BeforeEach
  public void setUp() {
//    manager.add(first);
//    manager.add(second);
//    manager.add(third);
//    manager.add(fourth);
//    manager.add(fifth);
//    manager.add(sixth);
//    manager.add(seventh);
//    manager.add(eighth);
//    manager.add(ninth);
//    manager.add(tenth);
//    manager.add(eleventh);
    repository.save(first);
    repository.save(second);
    repository.save(third);
    repository.save(fourth);
    repository.save(fifth);
    repository.save(sixth);
    repository.save(seventh);
    repository.save(eighth);
    repository.save(ninth);
    repository.save(tenth);
    repository.save(eleventh);
  }

//  @Test
//  public void shouldAddMovie() {
//
//    Movies[] actual = manager.getAll();
//    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//
//    assertArrayEquals(expected, actual);
//  }
//
//  @Test
//  public void shouldAddLastTenMovies() {
//
//    Movies[] actual = manager.getLastTenMovies(10);
//    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
//
//    assertArrayEquals(expected, actual);
//  }
//
//  @Test
//  public void shouldAddUnderTenMovies() {
//
//    Movies[] actual = manager.getLastTenMovies(5);
//    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh};
//
//    assertArrayEquals(expected, actual);
//  }
//
//  @Test
//  public void shouldAddOverTenMovies() {
//
//    Movies[] actual = manager.getLastTenMovies(11);
//    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
//
//    assertArrayEquals(expected, actual);
//  }
//
//  @Test
//  public void shouldSaveMovie() {
//
//    Movies[] actual = manager.getAll();
//    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//
//    assertArrayEquals(expected, actual);
//  }

  @Test
  public void shouldFindAll() {

    Movies[] actual = repository.findAll();
    Movies[] expected = new Movies[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldFindById() {

    int idToFind = 6;

    Movies[] actual = repository.findById(idToFind);
    Movies[] expected = new Movies[]{sixth};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldRemoveById() {

    int idToRemove = 5;

    Movies[] actual = repository.removeById(idToRemove);
    Movies[] expected = new Movies[]{first, second, third, fourth, sixth, seventh, eighth, ninth, tenth, eleventh};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldRemoveAll() {

    Movies[] actual = repository.removeAll();
    Movies[] expected = new Movies[]{};

    assertArrayEquals(expected, actual);
  }

}