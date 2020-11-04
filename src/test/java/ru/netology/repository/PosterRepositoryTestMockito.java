package ru.netology.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Movies;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PosterRepositoryTestMockito {

    @Mock
    private PosterRepository repository;
    @InjectMocks
    private PosterManager manager;

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

    @Test
    public void shouldRemoveById() {

        int idToRemove = 5;

        Movies[] returned = new Movies[]{first, second, third, fourth, sixth, seventh, eighth, ninth, tenth, eleventh};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);

        Movies[] actual = manager.getAll();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fourth, third, second, first};

        assertArrayEquals(expected, actual);

        verify(repository).removeById(idToRemove);
    }

    @Test
    public void shouldRemoveByIdNotExist() {

        int idToRemove = 25;

        Movies[] returned = new Movies[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        doReturn(returned).when(repository).findAll();
        doNothing().when(repository).removeById(idToRemove);

        manager.removeById(idToRemove);

        Movies[] actual = manager.getAll();
        Movies[] expected = new Movies[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);

        verify(repository).removeById(idToRemove);
    }
}
