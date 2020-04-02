/*
 * MIT License
 *
 * Copyright (c) 2020 CharlieCondorcet
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.charlie.p2pchat.entities;

/**
 * The Conversation class to join 2 entities ChatUser.
 *
 * @author Charlie Condorcet.
 */
public class Conversation {

  private int IdConversation;
  private int IdFirstUser;
  private int IdSecondUser;

  /**
   * The Constructor.
   *
   * @param IdConversation
   * @param IdFirstUser
   * @param IdSecondUser
   */
  public Conversation(int IdConversation, int IdFirstUser, int IdSecondUser) {
    IdConversation = IdConversation;
    IdFirstUser = IdFirstUser;
    IdSecondUser = IdSecondUser;
  }

  /**
   * @return The IdConversation.
   */
  public int getIdConversation() {
    return IdConversation;
  }

  /**
   * @return The IdFirstUser.
   */
  public int getIdFirstUser() {
    return IdFirstUser;
  }

  /**
   * @return The IdSecondUser.
   */
  public int getIdSecondUser() {
    return IdSecondUser;
  }

  /**
   * @param idConversation
   */
  public void setIdConversation(int idConversation) {
    IdConversation = idConversation;
  }

  /**
   * @param idFirstUser
   */
  public void setIdFirstUser(int idFirstUser) {
    IdFirstUser = idFirstUser;
  }

  /**
   * @param idSecondUser
   */
  public void setIdSecondUser(int idSecondUser) {
    IdSecondUser = idSecondUser;
  }
}