package resources;

import java.util.Random;

public class HashIdGenerator {

    // Static Variables

    private final static String dictionary = "thequickbrownfoxjumpsoverthelazydog" +
            "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG" + "1234567890";


    // Public

    public static String generateHashId(int length) {
        StringBuffer hashBuffer = new StringBuffer("");
        Random random = new Random();
        for(int i = 0; i < length; i++)
            hashBuffer.append(dictionary
                    .charAt(random.nextInt(dictionary.length())));

        return hashBuffer.toString();
    }


}
