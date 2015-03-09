package io.miti.dvdbrowser;

/**
 * This class encapsulates DVD objects.
 * 
 * @author Mike Wallace
 * @version 1.0
 */
public final class Dvd
{
  /**
   * Whether to use the UPC as the ID.
   */
  private static final boolean bUseUpcAsId = true;
  
  /*
  private static final String[] fieldNames = {
    "Title",
    "Studio",
    "Released",
    "Status",
    "Sound",
    "Versions",
    "Price",
    "Rating",
    "Year",
    "Genre",
    "Aspect",
    "UPC",
    "ReleaseDate",
    "ID",
    "Timestamp"
  };
  */
  
  // 01 "DVD_Title"
  // 02 "Studio"
  // 03 "Released"
  // 04 "Status"
  // 05 "Sound"
  // 06 "Versions"
  // 07 "Price"
  // 08 "Rating"
  // 09 "Year"
  // 10 "Genre"
  // 11 "Aspect"
  // 12 "UPC"
  // 13 "DVD_ReleaseDate"
  // 14 "ID"
  // 15 "Timestamp"
  
  /**
   * The DVD title.
   */
  private String title = null;
  
  /**
   * The studio name.
   */
  private String studio = null;
  
  /**
   * Whether it's been released.
   */
  private String released = null;
  
  /**
   * DVD status.
   */
  private String status = null;
  
  /**
   * Sound information.
   */
  private String sound = null;
  
  /**
   * The version.
   */
  private String versions = null;
  
  /**
   * The price.
   */
  private String price = null;
  
  /**
   * The rating.
   */
  private String rating = null;
  
  /**
   * The year it was released.
   */
  private String year = null;
  
  /**
   * The genre.
   */
  private String genre = null;
  
  /**
   * The aspect ratio.
   */
  private String aspect = null;
  
  /**
   * The UPC code.
   */
  private String upc = null;
  
  /**
   * The release date.
   */
  private String releaseDate = null;
  
  /**
   * ID.
   */
  private int id = 0;
  
  /**
   * Timestamp.
   */
  private String timestamp = null;
  
  
  /**
   * Default constructor.
   */
  public Dvd()
  {
    super();
  }
  
  
  /**
   * Constructor taking the name of the input file.
   * 
   * @param sInput the name of the input file
   */
  public Dvd(final String sInput)
  {
    java.util.Iterator<String> iter = DvdListParser.parse(sInput);
    int i = 0;
    while (iter.hasNext())
    {
      String val = (String) iter.next();
      
      switch (i)
      {
        case 0:
          setTitle(val);
          break;
        
        case 1:
          setStudio(val);
          break;
        
        case 2:
          setReleased(val);
          break;
        
        case 3:
          setStatus(val);
          break;
        
        case 4:
          setSound(val);
          break;
        
        case 5:
          setVersions(val);
          break;
        
        case 6:
          setPrice(val);
          break;
        
        case 7:
          setRating(val);
          break;
        
        case 8:
          setYear(val);
          break;
        
        case 9:
          setGenre(val);
          break;
        
        case 10:
          setAspect(val);
          break;
        
        case 11:
          setUpc(val);
          break;
        
        case 12:
          setReleaseDate(val);
          break;
        
        case 13:
          setId(val);
          break;
        
        case 14:
          setTimestamp(val);
          break;
        
        default:
          throw new RuntimeException("Exception while parsing!!!");
          // break;
      }
      ++i;
    }
  }
  
  
  /**
   * Returns the aspect ratio.
   * 
   * @return Returns the aspect
   */
  public String getAspect()
  {
    return aspect;
  }
  
  
  /**
   * Sets the aspect ratio.
   * 
   * @param sAspect The aspect to set
   */
  public void setAspect(final String sAspect)
  {
    aspect = sAspect;
  }
  
  
  /**
   * Returns the genre.
   * 
   * @return Returns the genre
   */
  public String getGenre()
  {
    return genre;
  }
  
  
  /**
   * Sets the genre.
   * 
   * @param sGenre The genre to set.
   */
  public void setGenre(final String sGenre)
  {
    genre = sGenre;
  }
  
  
  /**
   * Returns the unique ID.
   * 
   * @return Returns the id
   */
  public int getId()
  {
    return id;
  }
  
  
  /**
   * @param nId The id to set.
   */
  public void setId(final int nId)
  {
    id = nId;
  }
  
  
  /**
   * @param nId The unique ID as a string.
   */
  public void setId(final String nId)
  {
    int i = 0;
    try
    {
      i = Integer.parseInt(nId);
    }
    catch (NumberFormatException nfe)
    {
      i = 0;
    }
    
    id = i;
  }
  
  
  /**
   * @return Returns the price.
   */
  public String getPrice()
  {
    return price;
  }
  
  
  /**
   * @param sPrice The price to set.
   */
  public void setPrice(final String sPrice)
  {
    price = sPrice;
  }
  
  
  /**
   * @return Returns the rating.
   */
  public String getRating()
  {
    return rating;
  }
  
  
  /**
   * @param sRating The rating to set.
   */
  public void setRating(final String sRating)
  {
    rating = sRating;
  }
  
  
  /**
   * @return Returns the released.
   */
  public String getReleased()
  {
    return released;
  }
  
  
  /**
   * @param sReleased The released to set.
   */
  public void setReleased(final String sReleased)
  {
    released = sReleased;
  }
  
  
  /**
   * @return Returns the releaseDate.
   */
  public String getReleaseDate()
  {
    return releaseDate;
  }
  
  
  /**
   * @param sReleaseDate The releaseDate to set.
   */
  public void setReleaseDate(final String sReleaseDate)
  {
    releaseDate = sReleaseDate;
  }
  
  
  /**
   * @return Returns the sound.
   */
  public String getSound()
  {
    return sound;
  }
  
  
  /**
   * @param sSound The sound to set.
   */
  public void setSound(final String sSound)
  {
    sound = sSound;
  }
  
  
  /**
   * @return Returns the status.
   */
  public String getStatus()
  {
    return status;
  }
  
  
  /**
   * @param sStatus The status to set.
   */
  public void setStatus(final String sStatus)
  {
    status = sStatus;
  }
  
  
  /**
   * @return Returns the studio.
   */
  public String getStudio()
  {
    return studio;
  }
  
  
  /**
   * @param sStudio The studio to set.
   */
  public void setStudio(final String sStudio)
  {
    studio = sStudio;
  }
  
  
  /**
   * @return Returns the timestamp.
   */
  public String getTimestamp()
  {
    return timestamp;
  }
  
  
  /**
   * @param sTimestamp The timestamp to set.
   */
  public void setTimestamp(final String sTimestamp)
  {
    timestamp = sTimestamp;
  }
  
  
  /**
   * @return Returns the title.
   */
  public String getTitle()
  {
    return title;
  }
  
  
  /**
   * @param sTitle The title to set.
   */
  public void setTitle(final String sTitle)
  {
    title = sTitle;
  }
  
  
  /**
   * @return Returns the upc.
   */
  public String getUpc()
  {
    return upc;
  }
  
  
  /**
   * @param sUpc The upc to set.
   */
  public void setUpc(final String sUpc)
  {
    upc = sUpc;
  }
  
  
  /**
   * Returns the version string.
   * 
   * @return Returns the versions.
   */
  public String getVersions()
  {
    return versions;
  }
  
  
  /**
   * Sets the version string.
   * 
   * @param sVersions The versions to set.
   */
  public void setVersions(final String sVersions)
  {
    versions = sVersions;
  }
  
  
  /**
   * @return Returns the year.
   */
  public String getYear()
  {
    return year;
  }
  
  
  /**
   * @param sYear The year to set.
   */
  public void setYear(final String sYear)
  {
    year = sYear;
  }
  
  
  /**
   * Get the object as an XML string.
   * 
   * @return an XML string
   */
  public String toXmlString()
  {
    // Declare our string
    StringBuffer buf = new StringBuffer(500);
    
    // Build the string
    if (bUseUpcAsId)
    {
      buf.append("<dvd upc=\"").append(upc).append("\">\n");
    }
    else
    {
      buf.append("<dvd id=\"").append(Integer.toString(id)).append("\">\n");
    }
    
    // Start adding fields
    buf.append("<title>").append(title).append("</title>\n")
       .append("<studio>").append(studio).append("</studio>\n")
       .append("<rel>").append(released).append("</rel>\n")
       .append("<status>").append(status).append("</status>\n")
       .append("<sound>").append(sound).append("</sound>\n")
       .append("<ver>").append(versions).append("</ver>\n")
       .append("<price>").append(price).append("</price>\n")
       .append("<rating>").append(rating).append("</rating>\n")
       .append("<year>").append(year).append("</year>\n")
       .append("<genre>").append(genre).append("</genre>\n")
       .append("<aspect>").append(aspect).append("</aspect>\n");
    
    // Only write the UPC if we used the ID as the identifier
    if (!bUseUpcAsId)
    {
      buf.append("<upc>").append(upc).append("</upc>\n");
    }
    
    // Append the release date
    buf.append("<reldate>").append(releaseDate).append("</reldate>\n");
    
    // Only write the ID if we used the UPC as the identifier
    if (bUseUpcAsId)
    {
      buf.append("<id>").append(Integer.toString(id)).append("</id>\n");
    }
    
    // Finish the string
    buf.append("<ts>").append(timestamp).append("</ts>\n")
       .append("</dvd>\n");
    
    // Return the string
    return buf.toString();
  }
  
  
  /**
   * Returns the object as a string.
   * 
   * @return a string representation of the object
   */
  public String toString()
  {
    // Declare our string
    StringBuffer buf = new StringBuffer(300);
    
    // Build the string
    buf.append("Title: ").append(title)
       .append("\nStudio: ").append(studio)
       .append("\nReleased: ").append(released)
       .append("\nStatus: ").append(status)
       .append("\nSound: ").append(sound)
       .append("\nVersions: ").append(versions)
       .append("\nPrice: ").append(price)
       .append("\nRating: ").append(rating)
       .append("\nYear: ").append(year)
       .append("\nGenre: ").append(genre)
       .append("\nAspect: ").append(aspect)
       .append("\nUPC: ").append(upc)
       .append("\nRelease Date: ").append(releaseDate)
       .append("\nID: ").append(Integer.toString(id))
       .append("\nTimestamp: ").append(timestamp);
    
    // Return the string
    return buf.toString();
  }
  
  
  /**
   * Build the string for this object.
   *
   * @param label the tag label
   * @param value the tag value
   * @return the generated HTML string
   */
  private static String buildHtmlSnippet(final String label,
                                         final String value)
  {
    return buildHtmlSnippet(label, value, false);
  }
  
  
  /**
   * Build the string for this object.
   *
   * @param label the tag label
   * @param value the tag value
   * @param lookupValue whether to perform a lookup on the value
   * @return the generated HTML string
   */
  private static String buildHtmlSnippet(final String label,
                                         final String value,
                                         final boolean lookupValue)
  {
    // Declare our string builder
    StringBuilder sb = new StringBuilder(200);
    
    // Append the label, in bold
    sb.append("<b>").append(label).append(":</b> ");
    
    // See if we need to look up a replacement
    if (lookupValue)
    {
      // We do, so get the replacement value
      sb.append(lookupReplacement(value));
    }
    else
    {
      // Add the original value
      sb.append(value);
    }
    
    // Add a line break
    sb.append("<br>\n");
    
    // Return the generated String
    return (sb.toString());
  }
  
  
  /**
   * Look up a replacement value.
   *
   * @param lookupValue the value to look up a replacement for
   * @return the replacement value, or the original value if a replacement
   *         was not found
   */
  public static String lookupReplacement(final String lookupValue)
  {
    // Check for a null or empty value
    if ((lookupValue == null) || (lookupValue.length() < 1))
    {
      return "";
    }
    
    // This is the string we will return.  It defaults to the input value.
    String returnString = lookupValue;
    
    // Find a match on values we know how to replace
    if (lookupValue.equals("LBX"))
    {
      returnString = "Letterbox";
    }
    else if (lookupValue.equals("16:9"))
    {
      returnString = "Anamorphic";
    }
    else if (lookupValue.equals("P&S"))
    {
      returnString = "Pan and Scan";
    }
    else if (lookupValue.equals("4:3 P&S"))
    {
      returnString = "4:3, Pan and Scan";
    }
    else if (lookupValue.equals("VAR"))
    {
      returnString = "Various";
    }
    else if (lookupValue.equals("UNK"))
    {
      returnString = "Unknown";
    }
    else if (lookupValue.equals("1.0"))
    {
      returnString = "Mono";
    }
    else if (lookupValue.equals("1.1"))
    {
      returnString = "Mono Plus Subwoofer";
    }
    else if (lookupValue.equals("2.0 (mono)"))
    {
      returnString = "Two Channel Mono";
    }
    else if (lookupValue.equals("2.0"))
    {
      returnString = "Stereo";
    }
    else if (lookupValue.equals("3.0"))
    {
      returnString = "Three Channel";
    }
    else if (lookupValue.equals("4.0"))
    {
      returnString = "Four Channel Surround";
    }
    else if (lookupValue.equals("DTS 4.0"))
    {
      returnString = "DTS Four Channel";
    }
    else if (lookupValue.equals("4.1"))
    {
      returnString = "Five Channel Surround";
    }
    else if (lookupValue.equals("DTS 4.1"))
    {
      returnString = "DTS Five Channel";
    }
    else if (lookupValue.equals("5.0"))
    {
      returnString = "Five Channel Surround";
    }
    else if (lookupValue.equals("5.1"))
    {
      returnString = "Dolby 6 Channel";
    }
    else if (lookupValue.equals("DTS 5.0"))
    {
      returnString = "DTS 5 Channel";
    }
    else if (lookupValue.equals("DTS"))
    {
      returnString = "Digital Theater Sound";
    }
    else if (lookupValue.equals("6.1 ES"))
    {
      returnString = "Seven Channel DTS";
    }
    else if (lookupValue.equals("6.0 ES"))
    {
      returnString = "DTS Six Channel";
    }
    else if (lookupValue.equals("5.1 EX"))
    {
      returnString = "Seven Channel Matrixed";
    }
    else if (lookupValue.equals("5.1/EX"))
    {
      returnString = "Seven Channel Matrixed";
    }
    else if (lookupValue.equals("6.1 EX"))
    {
      returnString = "Seven Channel Dolby";
    }
    else if (lookupValue.equals("SUR"))
    {
      returnString = "Prologic Surround";
    }
    else if (lookupValue.equals("PCM"))
    {
      returnString = "PCM Audio";
    }
    else if (lookupValue.equals("DUB"))
    {
      returnString = "Dubbed in English";
    }
    else if (lookupValue.equals("SUB"))
    {
      returnString = "Subtitles";
    }
    else if (lookupValue.equals("SIL"))
    {
      returnString = "Silent Film";
    }
    
    // Return the new value
    return returnString;
  }
  
  
  /**
   * Convert the released date string into something more readable.
   * 
   * @param date the date to convert
   * @return the converted date
   */
  private static String parseReleasedDate(final String date)
  {
    // Check the input
    if (date == null)
    {
      return "";
    }
    else if (date.length() != 19)
    {
      // Unknown format, so just return it as-is
      return date;
    }
    
    // Check that it ends with the expected string
    if (!date.endsWith(" 00:00:00"))
    {
      return date;
    }
    
    // Parse the date
    String year = date.substring(0, 4);
    String month = date.substring(5, 7);
    String day = date.substring(8, 10);
    
    String dateString = Utility.getDateAsString(year, month, day);
    if (dateString == null)
    {
      return (month + "-" + day + "-" + year);
    }
    
    return dateString;
  }
  
  
  /**
   * Builds an HTML string representation of this object.
   * 
   * @return an HTML string representation of this object
   */
  public String toHtmlString()
  {
    // Declare the string builder, used to build the output string
    StringBuilder sb = new StringBuilder(1000);
    
    // Build the output string
    sb.append("<html><body>");
    sb.append(buildHtmlSnippet("Title", getTitle()));
    sb.append(buildHtmlSnippet("UPC", getUpc()));
    sb.append(buildHtmlSnippet("Movie Released", getYear(), true));
    sb.append(buildHtmlSnippet("DVD Released", parseReleasedDate(getReleaseDate())));
    sb.append(buildHtmlSnippet("Studio", getStudio()));
    sb.append(buildHtmlSnippet("Status", getStatus()));
    sb.append(buildHtmlSnippet("Sound", getSound(), true));
    sb.append(buildHtmlSnippet("Version", getVersions(), true));
    sb.append(buildHtmlSnippet("Price", getPrice()));
    sb.append(buildHtmlSnippet("Rating", getRating()));
    sb.append(buildHtmlSnippet("Genre", getGenre()));
    sb.append(buildHtmlSnippet("Aspect", getAspect(), true));
    sb.append("</body></html>");
    
    return sb.toString();
  }
}
