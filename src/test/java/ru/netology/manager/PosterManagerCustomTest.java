package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerCustomTest {
  PosterManager manager = new PosterManager(5);

  Movies first = new Movies(1, "Rambo", "Action", 1);
  Movies second = new Movies(2, "Terminator", "Sci-fi", 1);
  Movies third = new Movies(3, "Mad Max", "Action", 1);
  Movies fourth = new Movies(4, "Alien", "Horror", 1);
  Movies fifth = new Movies(5, "8 Mile", "Drama", 1);
  Movies sixth = new Movies(6, "Avatar", "Sci-fi", 1);

  @BeforeEach
  public void setUp() {
      manager.add(first);
      manager.add(second);
      manager.add(third);
      manager.add(fourth);
  }

  @Test
  public void shouldAddLastFourMovies() {

      Movies[] actual = manager.getAll();
      Movies[] expected = new Movies[]{fourth, third, second, first};

      assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldAddLastFiveMovies() {
      manager.add(fifth);

      Movies[] actual = manager.getAll();
      Movies[] expected = new Movies[]{fifth, fourth, third, second, first};

      assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldAddLastSixMovies() {
      manager.add(fifth);
      manager.add(sixth);

      Movies[] actual = manager.getAll();
      Movies[] expected = new Movies[]{sixth, fifth, fourth, third, second};

      assertArrayEquals(expected, actual);
  }
}