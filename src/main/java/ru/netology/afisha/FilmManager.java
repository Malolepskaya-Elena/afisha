package ru.netology.afisha;

public class FilmManager {
    private String[] moviesList = new String[0];
    private int limitLength = 10;

    // конструкторы
    public FilmManager() {

    }

    public FilmManager(int limitLength) {
        this.limitLength = limitLength;
    }
     // геттеры и сеттеры

    public String[] getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(String[] moviesList) {
        this.moviesList = moviesList;
    }

    public int getLimitLength() {
        return limitLength;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }
    // метод добавления нового фильма в конец массива

    public void add(String movieAdd) {
        int length = moviesList.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = moviesList[i];
        }
        tmp[length - 1] = movieAdd;
        moviesList = tmp;
    }
     // метод вывода всех фильмов в порядке добавления

    public void findAll() {
        getMoviesList();
    }
    // метод ывода максимум лимит последних добавленных фильмов в обратном от добавления порядке

    public void findLast() {
        int resultLength = moviesList.length;
        if (resultLength > limitLength) {
            resultLength = limitLength;
        }
        String[] tmp = new String[resultLength];
        int index = moviesList.length - 1;
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = moviesList[index - i];
        }
        moviesList = tmp;
    }
}
