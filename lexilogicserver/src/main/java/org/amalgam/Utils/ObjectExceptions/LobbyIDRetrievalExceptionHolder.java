package org.amalgam.Utils.ObjectExceptions;

/**
* org/amalgam/Utils/ObjectExceptions/LobbyIDRetrievalExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:32:16 PM SGT
*/

public final class LobbyIDRetrievalExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public LobbyIDRetrievalException value = null;

  public LobbyIDRetrievalExceptionHolder ()
  {
  }

  public LobbyIDRetrievalExceptionHolder (LobbyIDRetrievalException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LobbyIDRetrievalExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LobbyIDRetrievalExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LobbyIDRetrievalExceptionHelper.type ();
  }

}
