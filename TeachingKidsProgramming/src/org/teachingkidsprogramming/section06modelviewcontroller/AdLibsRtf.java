package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adVerb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    Words word = new Words();
    word.adVerb = MessageBox.askForTextInput("Enter an adverb");
    word.edVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    word.bodyPart = MessageBox.askForTextInput("Enter a body part.");
    String currentstory = Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentstory);
  }
}