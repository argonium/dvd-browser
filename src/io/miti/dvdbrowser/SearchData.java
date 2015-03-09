package io.miti.dvdbrowser;

import java.util.List;
import java.util.regex.Pattern;

/**
 * This class stores data used to search for object matches.
 * 
 * @author mwallace
 * @version 1.0
 */
public final class SearchData
{
  /**
   * List of strings.  Used for wildcard searches.
   */
  private List<String> listStrings = null;
  
  /**
   * Compiled regex pattern.
   */
  private Pattern pattern = null;
  
  /**
   * Search term. Used for soundex searches.
   */
  private String term = null;
  
  
  /**
   * Default constructor.
   */
  private SearchData()
  {
    super();
  }
  
  
  /**
   * Construct an object using the list of strings.
   * 
   * @param listData list of wildcard strings
   */
  public SearchData(final List<String> listData)
  {
    listStrings = listData;
  }
  
  
  /**
   * Construct an object using the regex pattern.
   * 
   * @param patternData compiled regex pattern
   */
  public SearchData(final Pattern patternData)
  {
    pattern = patternData;
  }
  
  
  /**
   * Construct an object using a string.
   * 
   * @param stringData the new search term
   */
  public SearchData(final String stringData)
  {
    term = stringData;
  }
  
  
  /**
   * Returns the list of strings.
   * 
   * @return the listStrings
   */
  public List<String> getListStrings()
  {
    return listStrings;
  }
  
  
  /**
   * Returns the pattern.
   * 
   * @return the pattern
   */
  public Pattern getPattern()
  {
    return pattern;
  }
  
  
  /**
   * Returns the search term.
   * 
   * @return the term
   */
  public String getTerm()
  {
    return term;
  }
}
