package com.javalearn.register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )    {

        Scanner sc = new Scanner(System.in);
        Movie movie = null;
        List<Movie> MovieList = new ArrayList<Movie>();
        int option = 0;

        do {
            System.out.println("----------| Menu |----------");
            System.out.println("1 - Insert a new movie");
            System.out.println("2 - List all movies");
            System.out.println("0 - Exit");
            System.out.println("____________________________");

            System.out.print("Enter your option: ");
            option = Integer.parseInt(sc.nextLine());

            if(option == 1){
                movie = new Movie();

                System.out.print("Enter the code: ");
                movie.setId(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter movie name: ");
                movie.setName(sc.nextLine());

                System.out.println();

                MovieList.add(movie);

            }else if(option == 2){

                if(MovieList.isEmpty()){

                    System.out.println("Empty List");
                    sc.nextLine();

                }else{

                    for(Movie movies:MovieList){
                        System.out.println("Id: " + movies.getId() + " - Name: " + movies.getName());
                    }
                    System.out.println();
                    System.out.println("Press any key to continue.");
                    sc.nextLine();
                }
            }
        } while (option != 0);

        sc.close();
    }
}

