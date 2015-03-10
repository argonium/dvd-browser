# dvd-browser
Search released DVDs

DvdBrowser is a standalone Java GUI application (using Swing) that allows a user to search the data provided by the Home Theater Info site. The data is a list of all region 1 DVDs released so far. The list is updated every week; the download includes the file released on 09 March 2015. The data consists of the DVD's title, UPC code, release date (movie and DVD), rating, genre, aspect ratio and some other data. DvdBrowser is available for free. The application offers the following options for searching for a match on a DVD's title:

* Wildcard searches (using '*' and '%')
* Soundex (words that sound similar)
* Contains
* Regular expression

The first two search modes reuse the code featured elsewhere on this web site. A wildcard search means the '\*' and '%' characters have a special meaning: '\*' means to match any string of consecutive characters (zero or more), and '%' means to match any one character. A Soundex search means to match on words that sound similar.

A Contains search means to search for DVDs whose title contains the search term. A regular expression search means to allow the use of regular expressions in the search term. If you don't know what a regular expression is, don't use this option.

There is currently no help file, but there is tooltip text for most of the controls, so the interface should be easy to understand.

To run the application, build it using 'ant clean dist' and then either double-click the file (from an Explorer window) or enter the command "java -jar dvdbrowser.jar" (from a command prompt). The data file is embedded in the jar file.

Part of the code is copyright JGoodies Karsten Lentzsch. This is limited to portions of the GUI.

The source code is released under the MIT license (other than the JGoodies code).
