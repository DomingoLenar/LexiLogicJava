package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/NotLoggedInException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:08 PM SGT
*/

public final class NotLoggedInException extends org.omg.CORBA.UserException
{
  public String message = null;

  public NotLoggedInException ()
  {
    super(NotLoggedInExceptionHelper.id());
  } // ctor

  public NotLoggedInException (String _message)
  {
    super(NotLoggedInExceptionHelper.id());
    message = _message;
  } // ctor


  public NotLoggedInException (String $reason, String _message)
  {
    super(NotLoggedInExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class NotLoggedInException
