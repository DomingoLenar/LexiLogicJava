package org.amalgam.Service.GameServiceModule;


/**
* org/amalgam/Service/GameServiceModule/GameServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Monday, May 20, 2024 3:01:13 PM PST
*/

public interface GameServiceOperations 
{
  String matchMake (org.amalgam.UIControllers.PlayerCallback player_callback) throws org.amalgam.Utils.Exceptions.MatchCreationFailedException;
  char[][] fetchWordBox (int roomID) throws org.amalgam.Utils.Exceptions.WordFetchFailedException, org.amalgam.Utils.Exceptions.InvalidRoomIDException;
  String getLeaderboards () throws org.amalgam.Utils.Exceptions.EmptyLeaderBoardException;
  void verifyWord (String word, String username, int gameRoomID) throws org.amalgam.Utils.Exceptions.InvalidWordFormatException, org.amalgam.Utils.Exceptions.DuplicateWordException;
  int validateTotalPoints () throws org.amalgam.Utils.Exceptions.InsufficientWordPointsException, org.amalgam.Utils.Exceptions.InvalidTotalPointsException;
  String fetchWinner (int lobbyId) throws org.amalgam.Utils.Exceptions.LobbyDoesNotExistException, org.amalgam.Utils.Exceptions.WinnerDoesNotExistException;
  String playerReady (String username, int gameRoomID);
} // interface GameServiceOperations
