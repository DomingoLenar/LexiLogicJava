package org.amalgam.Service.GameServiceModule.GameServicePackage;


/**
* org/amalgam/Service/GameServiceModule/GameServicePackage/leaderboardsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Wednesday, May 8, 2024 12:45:18 AM SGT
*/

public final class leaderboardsHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Utils.Objects.Leaderboard value[] = null;

  public leaderboardsHolder ()
  {
  }

  public leaderboardsHolder (org.amalgam.Utils.Objects.Leaderboard[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = leaderboardsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    leaderboardsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return leaderboardsHelper.type ();
  }

}
