package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
  PosterManager manager = new PosterManager();

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
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(ninth);
    manager.add(tenth);
    manager.add(eleventh);
  }

  @Test
  public void shouldAddMovie() {

    Movies[] actual = manager.getAll();
    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldAddLastTenMovies() {

    Movies[] actual = manager.getLastTenMovies(10);
    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldAddUnderTenMovies() {

    Movies[] actual = manager.getLastTenMovies(5);
    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh};

    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldAddOverTenMovies() {

    Movies[] actual = manager.getLastTenMovies(11);
    Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

    assertArrayEquals(expected, actual);
  }

//  @Test
//  public void shouldRemoveIfExists() {
//    PosterManager manager = new PosterManager();
//    int idToRemove = 1;
//    Movies first = new Movies(1, 1, "first", 1, 1);
//    Movies second = new Movies(2, 2, "second", 1, 1);
//    Movies third = new Movies(3, 3, "third", 1, 1);
//    manager.add(first);
//    manager.add(second);
//    manager.add(third);
//
//    manager.removeById(idToRemove);
//
//    Movies[] actual = manager.getAll();
//    Movies[] expected = new Movies[]{third, second};
//
////    assertEquals(expected, actual);
//    assertArrayEquals(expected, actual);
//  }
//
//  @Test
//  public void shouldNotRemoveIfNotExists() {
//    PosterManager manager = new PosterManager();
//    int idToRemove = 4;
//    Movies first = new Movies(1, 1, "first", 1, 1);
//    Movies second = new Movies(2, 2, "second", 1, 1);
//    Movies third = new Movies(3, 3, "third", 1, 1);
//    manager.add(first);
//    manager.add(second);
//    manager.add(third);
//
//    manager.removeById(idToRemove);
//
//    Movies[] actual = manager.getAll();
//    Movies[] expected = new Movies[]{third, second, first};
//
//    assertArrayEquals(expected, actual);
//  }
}