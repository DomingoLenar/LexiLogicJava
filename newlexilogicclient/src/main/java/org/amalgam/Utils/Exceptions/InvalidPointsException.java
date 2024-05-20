package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidPointsException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:20 PM SGT
*/

public final class InvalidPointsException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidPointsException ()
  {
    super(InvalidPointsExceptionHelper.id());
  } // ctor

  public InvalidPointsException (String _message)
  {
    super(InvalidPointsExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidPointsException (String $reason, String _message)
  {
    super(InvalidPointsExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidPointsException
