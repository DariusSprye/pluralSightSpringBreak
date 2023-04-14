package pluralSight;


import java.util.ArrayList;
import java.util.List;


//QUESTION 1
        //Create an Array list, add to the list, and print the list

public class WebsiteClass {


    public static void main(String[] args) {


        //create an Arraylist
        ArrayList<String> urlList = new ArrayList<>(); //initializing urlList as an Arraylist


        //adding urls
            urlList.add("https://pluralsight.com/search?q=java");
            urlList.add("https://medium.com/search?q=java");
            urlList.add("https://stackoverflow.com/questions/tagged/java");
            urlList.add("https://stackoverflow.com/search?q=java+list");
            urlList.add("https://reddit.com/r/java");
            urlList.add("https://reddit.com/r/javahelp");//creating method for adding urls in string


        //printing Arraylist
//            System.out.println(urlList); //print Arraylist


        //QUESTION 2
        //only print out urls that contain stackoverflow.com


//            for (String url : urlList){
//                if (url.contains("https://stackoverflow.com"))
//                    System.out.println(url);
//            } //used a for each loop to do it


        //QUESTION 3
        //Remove the medium.com url

        boolean removeURL;

            boolean removeMedium = urlList.remove("https://medium.com/search?q=java"); //saving .remove method as a boolean variable to check if the medium.com link have been removed
//            System.out.println(urlList);
//            System.out.println(removeMedium);

        //QUESTION 4
        //sort list of urls in alphabetical order


//        urlList.sort(null);
//        System.out.println(urlList);

        //QUESTION 5
        //print out the first 2 links, followed by the text and 4 more

        List<String> firstTwo = urlList.subList(0,2);
        int remaining = urlList.size()-2;
        System.out.println(firstTwo);
        System.out.println("And " + remaining + " more");

        List<String> remainingUrls = urlList.subList(2, urlList.size());
        System.out.println(remainingUrls);

    }


}
