package org.amalgam.Service.PlayerServiceModule;

/**
* org/amalgam/Service/PlayerServiceModule/PlayerCallbackHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Friday, May 3, 2024 11:34:02 PM SGT
*/

public final class PlayerCallbackHolder implements org.omg.CORBA.portable.Streamable
{
  public PlayerCallback value = null;

  public PlayerCallbackHolder ()
  {
  }

  public PlayerCallbackHolder (PlayerCallback initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerCallbackHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerCallbackHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerCallbackHelper.type ();
  }

}
