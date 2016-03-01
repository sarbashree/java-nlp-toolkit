package justhalf.nlp.sentencesplitter;

import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import justhalf.nlp.NLPInterface;

public interface SentenceSplitter extends NLPInterface{
	/**
	 * Split a text into a list of sentences as string.
	 * @param input
	 * @return
	 */
	public String[] splitToString(String input);
	
	/**
	 * Split a text into a list of sentences.<br>
	 * Each CoreLabel corresponds to one sentence.
	 * @param input
	 * @return
	 */
	public List<CoreLabel> split(String input);
}
