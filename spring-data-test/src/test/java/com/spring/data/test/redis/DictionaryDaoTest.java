package com.spring.data.test.redis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.data.redis.DictionaryDao;
import com.spring.data.redis.LocalRedisConfig;
import com.spring.data.redis.WordMeaningPair;

@ContextConfiguration(classes=LocalRedisConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DictionaryDaoTest {

	@Autowired
	private DictionaryDao dictionaryDao;

	@Autowired
	private StringRedisTemplate redisTemplate;

	@After
	public void tearDown() {
		redisTemplate.getConnectionFactory().getConnection().flushDb();
	}

	@Test
	public void testAddWordWithItsMeaningToDictionary() {
		String meaning = "To move forward with a bounding, drooping motion.";
		Long index = dictionaryDao.addWordWithItsMeaningToDictionary("lollop",
				meaning);
		assertThat(index, is(notNullValue()));
		assertThat(index, is(equalTo(1L)));
		List<String> allMeanings = dictionaryDao.getAllTheMeaningsForAWord("lollop");
		assertEquals(meaning, allMeanings.get(0));
	}

	//@Test
	public void shouldAddMeaningToAWordIfItExists() {
		Long index = dictionaryDao.addWordWithItsMeaningToDictionary("lollop",
				"To move forward with a bounding, drooping motion.");
		assertThat(index, is(notNullValue()));
		assertThat(index, is(equalTo(1L)));
		index = dictionaryDao.addWordWithItsMeaningToDictionary("lollop",
				"To hang loosely; droop; dangle.");
		assertThat(index, is(equalTo(2L)));
	}

	//@Test
	public void shouldGetAllTheMeaningForAWord() {
		setupOneWord();
		List<String> allMeanings = dictionaryDao
				.getAllTheMeaningsForAWord("lollop");
		assertThat(allMeanings.size(), is(equalTo(2)));
		assertThat(
				allMeanings,
				hasItems("To move forward with a bounding, drooping motion.",
						"To hang loosely; droop; dangle."));
	}

	//@Test
	public void shouldDeleteAWordFromDictionary() throws Exception {
		setupOneWord();
		dictionaryDao.removeWord("lollop");
		List<String> allMeanings = dictionaryDao.getAllTheMeaningsForAWord("lollop");
		assertThat(allMeanings.size(), is(equalTo(0)));
	}

	//@Test
	public void shouldDeleteMultipleWordsFromDictionary() {
		setupTwoWords();
		dictionaryDao.removeWords("fain", "lollop");
		List<String> allMeaningsForLollop = dictionaryDao
				.getAllTheMeaningsForAWord("lollop");
		List<String> allMeaningsForFain = dictionaryDao
				.getAllTheMeaningsForAWord("fain");
		assertThat(allMeaningsForLollop.size(), is(equalTo(0)));
		assertThat(allMeaningsForFain.size(), is(equalTo(0)));
	}

	//@Test
	public void shouldGetAllUniqueWordsInTheDictionary() throws Exception {
		setupTwoWords();
		Set<String> allUniqueWords = dictionaryDao.allUniqueWordsInDictionary();
		assertThat(allUniqueWords.size(), is(equalTo(2)));
		assertThat(allUniqueWords, hasItems("lollop", "fain"));
	}

	//@Test
	public void shouldGetCountOfAllUniqueWordsInTheDictionary()
			throws Exception {
		setupTwoWords();
		int countOfAllUniqueWords = dictionaryDao.countOfAllUniqueWords();
		assertThat(countOfAllUniqueWords, is(equalTo(2)));
	}

	//@Ignore
	public void shouldGiveMeARandomWord() throws Exception {
		setupTwoWords();
		WordMeaningPair wordMeaningPair = dictionaryDao.randomWord();
		assertThat(wordMeaningPair, is(notNullValue()));
		assertThat(wordMeaningPair.getWord(), is(notNullValue()));
		assertThat(!wordMeaningPair.getMeanings().isEmpty(), is(true));
	}

	private void setupTwoWords() {
		setupOneWord();
		dictionaryDao.addWordWithItsMeaningToDictionary("fain",
				"Content; willing.");
		dictionaryDao.addWordWithItsMeaningToDictionary("fain",
				"Archaic: Constrained; obliged.");
	}

	private void setupOneWord() {
		dictionaryDao.addWordWithItsMeaningToDictionary("lollop",
				"To move forward with a bounding, drooping motion.");
		dictionaryDao.addWordWithItsMeaningToDictionary("lollop",
				"To hang loosely; droop; dangle.");
	}
}
