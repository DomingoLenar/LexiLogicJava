package org.amalgam.Service.GameExceptions;

/**
* org/amalgam/Service/GameExceptions/InvalidTotalPointsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Friday, May 3, 2024 11:29:37 PM SGT
*/

public final class InvalidTotalPointsHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidTotalPoints value = null;

  public InvalidTotalPointsHolder ()
  {
  }

  public InvalidTotalPointsHolder (InvalidTotalPoints initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidTotalPointsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidTotalPointsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidTotalPointsHelper.type ();
  }

}
