package modules;

import org.apache.commons.lang3.StringUtils;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentenceModifier {

    public static String reverseSentenceUsingForLoop(String originalSentence) {
        String[] parts = originalSentence.split(" ");
        String reversedSentence = "";
        for (int i = parts.length - 1; i >= 0; i--) {
            reversedSentence += (i != 0) ? parts[i] + " " : parts[i];
        }
        return reversedSentence;
    }

    public static String reverseSentenceUsingStream(String originSentence) {
        List<String> list = Stream.of(originSentence.split(" "))
                .collect(Collectors.toList());
        Collections.reverse(list);
        return StringUtils.join(list, " ");
    }
}
