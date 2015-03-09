package io.miti.dvdbrowser;

import java.util.Iterator;
import java.util.List;

/**
 * This class encapsulates parsing a line of DVD info
 * into a DVD object.
 * 
 * @author Mike Wallace
 * @version 1.0
 */
public final class DvdListParser
{
  /**
   * Default constructor.
   */
  private DvdListParser()
  {
    super();
  }
  
  
  /**
   * Parse a line of DVD fields and return an iterator over the array.
   * 
   * @param sInput the line of text from the DVD data file
   * @return an Iterator over the list of fields
   */
  public static Iterator<String> parse(final String sInput)
  {
    // Check the input string
    if ((sInput == null) || (sInput.length() < 1))
    {
      return null;
    }
    
    // Allocate an array to hold the items
    List<String> list = new java.util.ArrayList<String>(20);
    
    // Build the list
    final int nLen = sInput.length();
    int i = 0;
    while (i < nLen)
    {
      // Remove all leading spaces
      while ((i < nLen) && (sInput.charAt(i) == ' '))
      {
        ++i;
      }
      
      if (i == nLen)
      {
        break;
      }
      
      // Check for a leading quote
      if (sInput.charAt(i) == '"')
      {
        // Read until closing quote
        ++i;
        boolean bInQuote = true;
        StringBuffer buf = new StringBuffer(20);
        while (i < nLen) // && (sInput.charAt(i) != ','))
        {
          if (sInput.charAt(i) == '"')
          {
            if (i >= (nLen - 1))
            {
              break;
            }
            else if (sInput.charAt(i + 1) == '"')
            {
              buf.append("'");
              ++i;
            }
            else
            {
              bInQuote = !bInQuote;
            }
          }
          else if ((sInput.charAt(i) == ',') && (!bInQuote))
          {
            break;
          }
          else
          {
            buf.append(sInput.charAt(i));
          }
          
          ++i;
        }
        list.add(buf.toString());
        ++i;
      }
      else if (sInput.charAt(i) == ',')
      {
        // Empty field
        list.add("");
        ++i;
      }
      else
      {
        // Build the string until we hit another comma
        StringBuffer buf = new StringBuffer(20);
        while ((i < nLen) && (sInput.charAt(i) != ','))
        {
          buf.append(sInput.charAt(i++));
        }
        list.add(buf.toString());
        ++i;
      }
    }
    
    // Check for a trailing comma
    if (sInput.charAt(nLen - 1) == ',')
    {
      list.add("");
    }
    
    // Return the list as an iterator
    return list.iterator();
  }
}
