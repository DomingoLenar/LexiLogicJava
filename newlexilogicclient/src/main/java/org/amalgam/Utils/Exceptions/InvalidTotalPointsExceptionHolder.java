package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidTotalPointsExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:20 PM SGT
*/

public final class InvalidTotalPointsExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidTotalPointsException value = null;

  public InvalidTotalPointsExceptionHolder ()
  {
  }

  public InvalidTotalPointsExceptionHolder (InvalidTotalPointsException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidTotalPointsExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidTotalPointsExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidTotalPointsExceptionHelper.type ();
  }

}
