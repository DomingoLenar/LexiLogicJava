package org.amalgam.DAL.DALLobby.LobbyDALPackage;

/**
* org/amalgam/DAL/DALLobby/LobbyDALPackage/LobbyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:43 PM SGT
*/

public final class LobbyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.DAL.DALLobby.LobbyDALPackage.Lobby value = null;

  public LobbyHolder ()
  {
  }

  public LobbyHolder (org.amalgam.DAL.DALLobby.LobbyDALPackage.Lobby initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.DAL.DALLobby.LobbyDALPackage.LobbyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.DAL.DALLobby.LobbyDALPackage.LobbyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.DAL.DALLobby.LobbyDALPackage.LobbyHelper.type ();
  }

}
