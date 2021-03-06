package io.miti.dvdbrowser.filter;

/**
 * Provide a filter for search terms that only
 * accepts matches where the parameter to accept()
 * contains the source term (passed in the
 * constructor).
 * 
 * @author mwallace
 * @version 1.0
 */
public final class ContainsFilter implements TermFilter
{
  /**
   * The source term.
   */
  private String term = null;
  
  /**
   * Whether to ignore the case.
   */
  private boolean ignoreCase = false;
  
  
  /**
   * Default constructor.
   */
  private ContainsFilter()
  {
    super();
  }
  
  
  /**
   * Initializes the filter with the source term and
   * whether to ignore case on searches.
   * 
   * @param word the source term
   * @param bIgnoreCase whether to ignore the case of string comparisons
   */
  public ContainsFilter(final String word, final boolean bIgnoreCase)
  {
    term = word;
    ignoreCase = bIgnoreCase;
  }
  
  
  /**
   * Determines if the term matches the source term.
   * 
   * @param word the term to compare to the source term
   * @return whether the terms match
   */
  public boolean accept(final String word)
  {
    // Check the two terms for nullness
    if ((word == null) && (term == null))
    {
      // They're both null
      return true;
    }
    else if ((word == null) || (term == null))
    {
      // One is null, the other is not
      return false;
    }
    
    // Neither is null, so check how to compare the strings
    if (ignoreCase)
    {
      // Ignore the case
      return (word.toUpperCase().indexOf(term.toUpperCase()) >= 0);
    }
    else
    {
      // Consider the case
      return (word.indexOf(term) >= 0);
    }
  }
}
