package org.amalgam.Utils.Objects;

/**
* org/amalgam/Utils/Objects/PlayerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:33:44 PM SGT
*/

public final class PlayerHolder implements org.omg.CORBA.portable.Streamable
{
  public Player value = null;

  public PlayerHolder ()
  {
  }

  public PlayerHolder (Player initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerHelper.type ();
  }

}
