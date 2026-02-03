/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib.owner = "Imposter";
    MediaLib myLib = new MediaLib();
    String bookTitle = "Lord of the Rings";
    MediaLib myLib2 = new MediaLib();
    String movieTitle = "The Dark Knight";

    Book myBook = new Book(bookTitle, "Tolkien");
    myLib.addBook(myBook);
    int bookRating = 8;
    myBook.adjustRating(bookRating);
    System.out.println(myBook);

    Movie myMovie = new Movie(movieTitle, 2.5);
    myLib2.addMovie(myMovie);
    int movieRating = 9;
    myMovie.adjustRating(movieRating);
    System.out.println(myMovie);

  }
}
