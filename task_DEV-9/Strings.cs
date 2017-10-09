using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WorkWithStrings
{
  /// <summary>
  ///The class implemented a random selection of a substring from 
  ///the first line and inserting this substring in the second line 
  ///to the place of the substring from the second line.
  /// </summary>
  class Strings
  {
    private Random random = new Random();

    /// <summary>
    /// The method randomly selects a substring from the string.
    /// </summary>
    /// <param name="line">The string from which the substring is selected.</param>
    /// <returns>Returns a substring.</returns>
    public string RandomlySelectASubstring(string line)
    {
      int substringStart = random.Next(0, line.Length - 1);
      int substringLength = random.Next(1, line.Length - substringStart);
      return line.Substring(substringStart, substringLength);
    }

    /// <summary>
    /// A random substring from the first line is inserted 
    /// into the place of the random substring in the second line.
    /// </summary>
    /// <param name="firstLine">The first line from which the substring is randomly selected.</param>
    /// <param name="secondLine">The second line in which a substring is inserted.</param>
    /// <returns>Returns the resulting line. </returns>
    public string InsertASubstringInAString(string firstLine, string secondLine)
    {
      if (firstLine.Length == 0 || secondLine.Length == 0)
      {
        throw new ArgumentException("You entered an empty line or lines.");
      }

      string substring = RandomlySelectASubstring(firstLine);
      int substringStart = random.Next(0, secondLine.Length - 1);
      int substringLength = random.Next(1, secondLine.Length - substringStart);

      StringBuilder builder = new StringBuilder();
      builder.Append(secondLine.Substring(0, substringStart));
      builder.Append(substring);
      builder.Append(secondLine.Substring(substringStart + substringLength, secondLine.Length - (substringStart + substringLength)));
      return builder.ToString();
    }
  }
}
