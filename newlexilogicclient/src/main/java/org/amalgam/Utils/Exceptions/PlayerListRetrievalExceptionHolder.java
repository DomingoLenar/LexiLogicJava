package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/PlayerListRetrievalExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 12:45:43 AM SGT
*/

public final class PlayerListRetrievalExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public PlayerListRetrievalException value = null;

  public PlayerListRetrievalExceptionHolder ()
  {
  }

  public PlayerListRetrievalExceptionHolder (PlayerListRetrievalException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerListRetrievalExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerListRetrievalExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerListRetrievalExceptionHelper.type ();
  }

}
