package collection_framework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExampleMain2 {

    public static void main(String[] args) {

        Comparator<SocialMedia> comp =
                new PopularityAscendingComparator();

        SortedSet<SocialMedia> socialMedia =
                new TreeSet<>(comp);

        SocialMedia insta = new SocialMedia();
        SocialMedia fb = new SocialMedia("Facebook", 7);
        SocialMedia wa = new SocialMedia("Whatsapp", 9);
        SocialMedia t1 = new SocialMedia("Telegram", 5);

        socialMedia.add(insta);
        socialMedia.add(fb);
        socialMedia.add(wa);
        socialMedia.add(t1);

        for (SocialMedia media : socialMedia) {
            System.out.println(media);
        }
    }
}