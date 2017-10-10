using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WorkWithStrings
{
  class EntryPoint
  {
    static void Main(string[] args)
    {
      Console.WriteLine("Enter the first line: ");
      string firstLine = Console.ReadLine();
      Console.WriteLine("Enter the second string: ");
      string secondLine = Console.ReadLine();

      try
      {
        Strings strings = new Strings();
        Console.WriteLine("The first line: " + firstLine);
        Console.WriteLine("The second line: " + secondLine);
        Console.WriteLine("Result of replacement: " + strings.InsertASubstringInAString(firstLine, secondLine));
      }
      catch (ArgumentException ex)
      {
        Console.WriteLine(ex.Message);
      }
      Console.ReadKey();
    }
  }
}
