package org.amalgam.Service.GameServiceModule;

/**
* org/amalgam/Service/GameServiceModule/GameServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Monday, May 20, 2024 2:19:19 PM SGT
*/

public final class GameServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public GameService value = null;

  public GameServiceHolder ()
  {
  }

  public GameServiceHolder (GameService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GameServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GameServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GameServiceHelper.type ();
  }

}
