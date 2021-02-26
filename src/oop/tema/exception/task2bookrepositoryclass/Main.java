package oop.tema.exception.task2bookrepositoryclass;

import java.util.List;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.add(new Book("Cele 12 reguli de viata", "Jordan Peterson", "hdgsfue56-jhvfg"));
        bookRepository.add(new Book("you are what you think", "Louise Hay", "jhgufref45-rtgtfgkh7"));
        List<Book>book = bookRepository.findByName("Cele 12 reguli de viata");
        Book book1 = bookRepository.findByIsbn("hdgsfue56-jhvfg");
        bookRepository.delete("hdgsfue56-jhvfg");
    }
}
