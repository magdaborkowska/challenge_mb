package sentenceModifierTests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import modules.SentenceModifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SentenceModifierBasicTests {

    private static final Logger logger = LoggerFactory.getLogger(SentenceModifierBasicTests.class);
    final String originalSentence = "I am John Doe";

    @Test
    @Description("Test Description : Reverse sentence by iteration loop")
    @Story("STORY_1")
    void checkMethod1Test() {
        String modifiedSentence = SentenceModifier.reverseSentenceUsingForLoop(originalSentence);

        logger.info("ORIGIN SENTENCE: " + originalSentence);
        logger.info("MODIFIED SENTENCE: " + modifiedSentence);

        Assertions.assertNotEquals(originalSentence, modifiedSentence);
        Assertions.assertEquals(originalSentence, SentenceModifier.reverseSentenceUsingForLoop(modifiedSentence));
    }

    @Test
    @Description("Test Description : Reverse sentence by stream")
    @Story("STORY_1")
    void checkMethod2Test() {
        String modifiedSentence = SentenceModifier.reverseSentenceUsingStream(originalSentence);

        logger.info("ORIGIN SENTENCE: " + originalSentence);
        logger.info("MODIFIED SENTENCE: " + modifiedSentence);

        Assertions.assertNotEquals(originalSentence, modifiedSentence);
        Assertions.assertEquals(originalSentence, SentenceModifier.reverseSentenceUsingStream(modifiedSentence));
    }
}
