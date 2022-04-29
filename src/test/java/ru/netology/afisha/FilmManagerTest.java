package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test           // добавление нового фильма
    void add() {
        FilmManager manager = new FilmManager();
        String[] moviesLislTestData = new String[]  {"Zolushka", "Avatar", "1912"}; //исходный массив фильмов
        manager.setMoviesList(moviesLislTestData); // передаем массив менеджеру
        String[] expected = new String[] {"Zolushka", "Avatar", "1912", "Teremok"}; // новый массив

        String addMovie = "Teremok";
        manager.add(addMovie); // вызываем метод
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test  // добавление обратного массива в менеджер по умолчанию (с лимитом 10)
    void shouldReverseOrder() {
        FilmManager manager = new FilmManager();

        String[] moviesListTestData = new String[] {"Zolushka", "Avatar", "1912", "Teremok"};
        manager.setMoviesList(moviesListTestData);
        String[] expected = new String[] {"Teremok", "1912", "Avatar", "Zolushka"};

        manager.findLast();
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test  // добавление обратного массива в менеджер по умолчанию (с лимитом 2)
    void shouldReverseOrder2() {
        FilmManager manager = new FilmManager(2);

        String[] moviesListTestData = new String[] {"Zolushka", "Avatar", "1912", "Teremok"};
        manager.setMoviesList(moviesListTestData);
        String[] expected = new String[] {"Teremok", "1912"};
        manager.findLast();
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

}