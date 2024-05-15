package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/AccountCreationFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:20:50 PM SGT
*/

public final class AccountCreationFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public AccountCreationFailedException ()
  {
    super(AccountCreationFailedExceptionHelper.id());
  } // ctor

  public AccountCreationFailedException (String _message)
  {
    super(AccountCreationFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public AccountCreationFailedException (String $reason, String _message)
  {
    super(AccountCreationFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class AccountCreationFailedException
