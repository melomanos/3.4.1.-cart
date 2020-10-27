//package ru.netology.manager;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ru.netology.domain.Movies;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//public class PosterManagerTestNonEmptyWithSetup {
//  private PosterManager manager = new PosterManager();
//  private Movies first = new Movies(1, 1, "first", 1, 1);
//  private Movies second = new Movies(2, 2, "second", 1, 1);
//  private Movies third = new Movies(3, 3, "third", 1, 1);
//
//  @BeforeEach
//  public void setUp() {
//    manager.add(first);
//    manager.add(second);
//    manager.add(third);
//  }
//
//  @Test
//  public void shouldRemoveIfExists() {
//    int idToRemove = 1;
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
//    int idToRemove = 4;
//
//    manager.removeById(idToRemove);
//
//    Movies[] actual = manager.getAll();
//    Movies[] expected = new Movies[]{third, second, first};
//
//    assertArrayEquals(expected, actual);
//  }
//}