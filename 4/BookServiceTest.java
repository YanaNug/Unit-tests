import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);  // Инициализируем мок-объекты

        bookService = new BookService(bookRepository);
    }

    @Test // при вызове bookRepository.getAllBooks() должен возвращаться список ожидаемых книг
    // вызываем метод bookService.getAllBooks() и сравниваем возвращенный результат с ожидаемым списком
    public void testGetAllBooks() {
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");

        List<Book> expectedBooks = Arrays.asList(book1, book2);

        Mockito.when(bookRepository.getAllBooks()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.getAllBooks();

        Assertions.assertEquals(expectedBooks, actualBooks);
    }

    @Test // вызываем метод bookService.getBookById и сравниваем полученную книгу с ожидаемой
    public void testGetBookById() {
        Book book = new Book("Book 1", "Author 1");
        int bookId = 1;

        Mockito.when(bookRepository.getBookById(bookId)).thenReturn(book);

        Book actualBook = bookService.getBookById(bookId);

        Assertions.assertEquals(book, actualBook);
    }
}