import java.util.HashMap;
import java.util.Map;

public class Assignment210 {


        public static void main(String[] args) {

            String input = "apple";

            Map<Character, Integer> frequencyMap = countCharacterFrequencies(input);

            System.out.println("Character frequencies:");
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public static Map<Character, Integer> countCharacterFrequencies(String str) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : str.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            return frequencyMap;
        }

}
