package sectioneight.polymorphism.basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Movie theMovie =Movie.getMovie("C","Star wars");
//    theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type(A for Adventure, C for Comedy, " +
                    "S for Science Friction, or Q for quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter the movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
