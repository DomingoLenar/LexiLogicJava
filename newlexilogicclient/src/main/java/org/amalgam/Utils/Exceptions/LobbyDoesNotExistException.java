package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/LobbyDoesNotExistException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:16:59 PM SGT
*/

public final class LobbyDoesNotExistException extends org.omg.CORBA.UserException
{
  public String message = null;

  public LobbyDoesNotExistException ()
  {
    super(LobbyDoesNotExistExceptionHelper.id());
  } // ctor

  public LobbyDoesNotExistException (String _message)
  {
    super(LobbyDoesNotExistExceptionHelper.id());
    message = _message;
  } // ctor


  public LobbyDoesNotExistException (String $reason, String _message)
  {
    super(LobbyDoesNotExistExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class LobbyDoesNotExistException
