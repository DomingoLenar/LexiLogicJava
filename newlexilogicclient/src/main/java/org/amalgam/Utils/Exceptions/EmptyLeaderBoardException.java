package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/EmptyLeaderBoardException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:20 PM SGT
*/

public final class EmptyLeaderBoardException extends org.omg.CORBA.UserException
{
  public String message = null;

  public EmptyLeaderBoardException ()
  {
    super(EmptyLeaderBoardExceptionHelper.id());
  } // ctor

  public EmptyLeaderBoardException (String _message)
  {
    super(EmptyLeaderBoardExceptionHelper.id());
    message = _message;
  } // ctor


  public EmptyLeaderBoardException (String $reason, String _message)
  {
    super(EmptyLeaderBoardExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class EmptyLeaderBoardException
