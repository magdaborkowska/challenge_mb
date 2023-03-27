package sentenceModifierTests;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import modules.SentenceModifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SentenceModifierParametrizedTest {

    private static Logger logger = LoggerFactory.getLogger(SentenceModifierParametrizedTest.class);


    @ParameterizedTest(name = "Origin sentence: {0}")
    @CsvFileSource(resources = "/sentenceModifierInputFile.csv", numLinesToSkip = 1)
    @Description("Test Description : DDT Reverse sentence by iteration loop")
    @Story("STORY_2")
    void checkMethod1Test(String originSentence, String expectedSentence) {
        String modifiedSentence = SentenceModifier.reverseSentenceUsingForLoop(originSentence);

        logger.info("ORIGIN SENTENCE: " + originSentence);
        logger.info("MODIFIED SENTENCE: " + modifiedSentence);

        Assertions.assertEquals(expectedSentence, modifiedSentence);
    }

    @ParameterizedTest(name = "Origin sentence: {0}")
    @CsvFileSource(resources = "/sentenceModifierInputFile.csv", numLinesToSkip = 1)
    @Description("Test Description : DDT Reverse sentence by stream")
    @Story("STORY_1")
    void checkMethod2Test(String originSentence, String expectedSentence) {
        String modifiedSentence = SentenceModifier.reverseSentenceUsingStream(originSentence);

        logger.info("ORIGIN SENTENCE: " + originSentence);
        logger.info("MODIFIED SENTENCE: " + modifiedSentence);

        Assertions.assertEquals(expectedSentence, modifiedSentence);
    }
}
