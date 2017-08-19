package io.github.halcyon_daze.WebScraper;

import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    /*
     * 
     * Prints all links to media and links found on a web page
     * Reference to https://jsoup.org/cookbook/extracting-data/example-list-links
     * 
     * @param url a URL to a web page
     * August 19, 2017
     * 
     */
    public static void showLinks(String url) {
        System.out.println("Fetching " + url + "...");
        
        Document webPage;
        try {
        webPage = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.out.println("Unable to connect to " + url);
            return;
        } 
        
        Elements links = webPage.select("a[href]");
        Elements media = webPage.select("[src]");
        
        System.out.println("\nMedia: " + media.size() + " found");
        for (Element img : media) {
            if (img.tagName().equals("img")) {
                System.out.println(img.tagName() + " " + img.attr("abs:src") + " " + img.attr("width") + "x" + img.attr("height") + " " + trim(img.attr("alth"), 20));
            } else {
                System.out.println(img.tagName() + ": " + img.attr("abs:src"));
            }
        }
        
        System.out.println("\nLinks: " + links.size() + " found");
        for (Element link : links) {
            System.out.println(link.attr("abs:href") + trim(link.text(), 35));
        }
    }
    
    /*
     * 
     * Returns all links to media and links found on a web page
     * Reference to https://jsoup.org/cookbook/extracting-data/example-list-links
     * 
     * @param url a URL to a web page
     * @return a HashMap that maps the tag names of elements to a list of the elements found with that tag name
     * August 19, 2017
     * 
     */
    public static HashMap<String, Elements> getLinks(String url) {
        System.out.println("Fetching " + url + "...");
        
        Document webPage;
        HashMap<String, Elements> linkList = new HashMap<String, Elements>();
        
        try {
            webPage = Jsoup.connect(url).get();
            
            for (Element img : webPage.select("[src]")) {
                if ( linkList.containsKey(img.tagName()) ) {
                    linkList.get(img.tagName()).add(img);
                } else {
                    linkList.put(img.tagName(), new Elements(img));
                }
            }
            
        } catch (IOException e) {
            System.out.println("Unable to connect to " + url);
        }

        return linkList;
    }
    
    /*
     * 
     * Prints the keys and all elements of the list with that key from a HashMap
     * 
     * @param list a hashMap that maps strings to lists of elements
     * August 19, 2017
     * 
     */
    public static void printHashList (HashMap<String, Elements> list) {
        for (String key: list.keySet()) {
            System.out.println("\n" + list.get(key).size() + " " + key + " elements" );
                for (Element element : list.get(key)) {
                    System.out.println(element.attr("abs:src"));
                }
        }
    }
    private static String trim(String s, int width) {
        if (s.length() > width) {
            return s.substring(0, width - 1) + ".";
        } else {
            return s;
        }
    }
}

