package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/LeaderboardIDRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:16:59 PM SGT
*/

public final class LeaderboardIDRetrievalException extends org.omg.CORBA.UserException
{
  public String message = null;

  public LeaderboardIDRetrievalException ()
  {
    super(LeaderboardIDRetrievalExceptionHelper.id());
  } // ctor

  public LeaderboardIDRetrievalException (String _message)
  {
    super(LeaderboardIDRetrievalExceptionHelper.id());
    message = _message;
  } // ctor


  public LeaderboardIDRetrievalException (String $reason, String _message)
  {
    super(LeaderboardIDRetrievalExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class LeaderboardIDRetrievalException
