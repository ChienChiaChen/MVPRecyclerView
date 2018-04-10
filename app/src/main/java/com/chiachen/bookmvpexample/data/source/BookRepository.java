package com.chiachen.bookmvpexample.data.source;

import com.chiachen.bookmvpexample.data.Book;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public class BookRepository {

    public List<Book> fetchBookList() {
        return generateFakeData();
    }

    private List<Book> generateFakeData() {
        // Book chineseBook = Book("Chinese", 200.0, 5);
        Book chineseBook = new Book("Chinese", 200.0, 5);
        Book englishBook = new Book("English", 100.0, 1);
        Book frenchBook = new Book("French", 80.0, 2);
        Book germanBook = new Book("German", 150.0, 3);
        Book russianBook = new Book("Russian", 80.0, 2);
        return Arrays.asList(chineseBook, englishBook, frenchBook, germanBook, russianBook);
    }
}
