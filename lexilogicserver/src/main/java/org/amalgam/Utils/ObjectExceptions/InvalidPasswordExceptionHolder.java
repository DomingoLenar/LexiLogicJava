package org.amalgam.Utils.ObjectExceptions;

/**
* org/amalgam/Utils/ObjectExceptions/InvalidPasswordExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:32:16 PM SGT
*/

public final class InvalidPasswordExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidPasswordException value = null;

  public InvalidPasswordExceptionHolder ()
  {
  }

  public InvalidPasswordExceptionHolder (InvalidPasswordException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidPasswordExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidPasswordExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidPasswordExceptionHelper.type ();
  }

}
