package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/StartGameFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:22 PM SGT
*/

public final class StartGameFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public StartGameFailedException value = null;

  public StartGameFailedExceptionHolder ()
  {
  }

  public StartGameFailedExceptionHolder (StartGameFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = StartGameFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    StartGameFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return StartGameFailedExceptionHelper.type ();
  }

}
