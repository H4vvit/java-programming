import java.io.*;
import java.util.Scanner;
class Book{
    private String book_name;
    private String isbn_number;
    private String author_name;
    private String publisher;
    
    public Book(){}
    public Book(String book_name,String isbn_number,String author_name,String publisher){
        this.book_name=book_name;
        this.isbn_number=isbn_number;
        this.author_name=author_name;
        this.publisher=publisher;
    }
    public void setName(String book_name){
        this.book_name=book_name;
    }
    
    public void setNumber(String isbn_number){
        this.isbn_number=isbn_number;
    }
    
    public void setAuthor(String author_name){
        this.author_name=author_name;
    }
    
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    
    public String getName(){
        return(book_name);
    }
    
    public String getNumber(){
        return(isbn_number);
    }
    
    public String getAuthor(){
        return(author_name);
    }
    
    public String getPublisher(){
        return(publisher);
    }
    
    public String getBookInfo(){
        String book_info = " ";
        String arr[]={book_name,isbn_number,author_name,publisher};
        for(int i=0;i<arr.length;i++){
            book_info=book_info.concat(arr[i]);
        }
        return(book_info);
    }
}
public class ArrayBooks{
    public static void main(String[] args){
        Book[] ar;
        
        ar = new Book[30];
        
        ar[0]= new Book("A Reveolutionary Life","123-456-789","Laxmi Sehgal","nope");
        ar[1]= new Book("Ain - i - Akbari","456-436-456","Abul Fazal","sdsddfs");
        ar[2]= new Book("Ajatshatru","34-34-346","Jai Shankar Prasad","hbb");
        ar[3]= new Book("Philosopher's Stone (1997)","456-456-456","JK ROWLING","dfdf");
        ar[4]= new Book("Chamber of Secrets (1998)","34-43-456","JK ROWLING","dfvfe");
        ar[5]= new Book("Prisoner of Azkaban (1999)","34-34-45","JK ROWLING","sdg");
        ar[6]= new Book("Goblet of Fire (2000)","456-456-346-346","JK ROWLING","ffd");
        ar[7]= new Book("Order of the Phoenix (2003)","324-35-34","JK ROWLING","David");
        ar[8]= new Book("Half-Blood Prince (2005)","34-346-346","JK ROWLING","dfvfe");
        ar[9]= new Book("Deathly Hallows (2007)","13-34-45","JK ROWLING","dfh");
        ar[10]= new Book("Pride and Prejudice","978-3-16-148410-0","Jane Austen","red book");
        ar[11]= new Book("Hamlet","945-68-976","william shakesphere","abc");
        ar[12]= new Book("David Copperfield","123-456-789","Charles Dickens","def");
        ar[13]= new Book("The History of Tom Jones, a Foundling","234-567-908","Henry Fielding","ghi");
        ar[14]= new Book("The Red and the Black","890-765-987","Stendhal","kjuo");
        ar[15]= new Book("Le Père Goriot","908-775-987","Honoré de Balzac","koiy");
        ar[16]= new Book("Madame Bovary","908-98-9765","Gustave Flaubert","njhu");
        ar[17]= new Book("Moby-Dick","98-87-975","Herman Melville","njui");
        ar[18]= new Book("Wuthering Heights","98-654-987","Emily Brontë","garden");
        ar[19]= new Book("The Brothers Karamazov","325-56-547","Dostoevsky","ploy");
        ar[20]= new Book("War and Peace","456-436-456","Tolstoy","banh");
        ar[21]= new Book("Order of the Phoenix (2003)","324-35-34","JK ROWLING","David");
        ar[22]= new Book("Half-Blood Prince (2005)","34-346-346","JK ROWLING","dfvfe");
        ar[23]= new Book("Deathly Hallows (2007)","13-34-45","JK ROWLING","dfh");
        ar[24]= new Book("Pride and Prejudice","978-3-16-148410-0","Jane Austen","red book");
        ar[25]= new Book("Hamlet","945-68-976","william shakesphere","abc");
        ar[26]= new Book("David Copperfield","123-456-789","Charles Dickens","def");
        ar[27]= new Book("The History of Tom Jones, a Foundling","234-567-908","Henry Fielding","ghi");
        ar[28]= new Book("The Red and the Black","890-765-987","Stendhal","kjuo");
        ar[29]= new Book("Le Père Goriot","908-775-987","Honoré de Balzac","koiy");
        
        System.out.println("Name of the book"+" "+"ISBN Number"+" "+"Author Name"+" "+"Publisher");
        for(int j=0;j<ar.length;j++){
            System.out.println(ar[j].getBookInfo());
        }
       
    }
}


