//package oop.tema.classesandinterfaces.task2.moviecreatorclass;
//
///**
// * Movie class
// * Create the Movie class which will cover elds: title, director, year of release,
// * genre, distributor. This class should contain a default constructor and getter
// * and setter methods. Please consider creating toString method which will be
// * responsible for returning info about a specic object.
// * MovieCreator class
// * Create the static nested MovieCreateor class. It should contain:
// * class elds similar to Movie class
// * methods which will be responsible for setting movie values. Each method
// * should return an object instance of the object for which the method is being
// * called
// * the createMovie method will create the instance of the Movie class. It will
// * return it as a method results
// */
//
//public class Movie {
//    private String title;
//    private String director;
//    private int yearOfRelease;
//    private String genre;
//    private String publisher;
//
//    public Movie(String title, String director, int yearOfRelease, String genre, String publisher) {
//        this.title = title;
//        this.director = director;
//        this.yearOfRelease = yearOfRelease;
//        this.genre = genre;
//        this.publisher = publisher;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDirector() {
//        return director;
//    }
//
//    public void setDirector(String director) {
//        this.director = director;
//    }
//
//    public int getYearOfRelease() {
//        return yearOfRelease;
//    }
//
//    public void setYearOfRelease(int yearOfRelease) {
//        this.yearOfRelease = yearOfRelease;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPubliser(String publisher) {
//        this.publisher = publisher;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "title='" + title + '\'' +
//                ", director='" + director + '\'' +
//                ", yearOfRelease=" + yearOfRelease +
//                ", genre='" + genre + '\'' +
//                ", publisher='" + publisher + '\'' +
//                '}';
//    }
//}
