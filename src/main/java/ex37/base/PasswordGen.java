/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Harding
 */

// Helper Class

package ex37.base;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("ClassCanBeRecord")
public class PasswordGen {
  private final int length;
  private final int special;
  private final int num;

  public PasswordGen(int length, int special, int num) {
    this.length = length;
    this.special = special;
    this.num = num;
  }

  public String getPass() {
    ArrayList<Character> pwdList = new ArrayList<>();
    while (pwdList.size() < special) {
      int random = (int) (Math.random() * (126 - 32) + 33);
      if ((random > 47 && random < 58) || (random > 64 && random < 91) || (random > 96 && random < 123)) {
        continue;
      }
      pwdList.add((char) random);
    }
    while (pwdList.size() < (special + num)) {
      int random = (int) (Math.random() * (57 - 47) + 48);
      pwdList.add((char) random);
    }
    while (true) {
      int random = (int) (Math.random() * (122 - 64) + 65);
      if (random > 90 && random < 97) {
        continue;
      }
      pwdList.add((char) random);
      if (pwdList.size() < length) {
        continue;
      }
      if ((pwdList.size() - (special + num)) < (special + num)) {
        continue;
      }
      random = (int) (Math.random() * 2);
      if (random == 0) {
        continue;
      }
      break;
    }
    Collections.shuffle(pwdList);
    return getString(pwdList);
  }

  public String getString(ArrayList<Character> charList) {
    StringBuilder output = new StringBuilder();
    int i;
    for (i = 0; i < charList.size(); i++) {
      output.append(charList.get(i));
    }
    return output.toString();
  }

}
