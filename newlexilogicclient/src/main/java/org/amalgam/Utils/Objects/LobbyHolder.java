package org.amalgam.Utils.Objects;

/**
* org/amalgam/Utils/Objects/LobbyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 12:45:43 AM SGT
*/

public final class LobbyHolder implements org.omg.CORBA.portable.Streamable
{
  public Lobby value = null;

  public LobbyHolder ()
  {
  }

  public LobbyHolder (Lobby initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LobbyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LobbyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LobbyHelper.type ();
  }

}
