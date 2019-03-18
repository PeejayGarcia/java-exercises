package exercises;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args){
        String AliceParagraph = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("What is the term you are searching for? ");
        // Add functionality that makes search case-insensitive using SearchTerm.isUpperCase(SearchTerm)
        searchTerm = in.nextLine();

        System.out.println(AliceParagraph.contains(searchTerm));

    }


}
