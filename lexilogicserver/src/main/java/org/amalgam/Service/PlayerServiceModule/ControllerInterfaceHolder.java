package org.amalgam.Service.PlayerServiceModule;

/**
* org/amalgam/Service/PlayerServiceModule/ControllerInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Friday, May 3, 2024 11:29:23 PM SGT
*/

public final class ControllerInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public ControllerInterface value = null;

  public ControllerInterfaceHolder ()
  {
  }

  public ControllerInterfaceHolder (ControllerInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ControllerInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ControllerInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ControllerInterfaceHelper.type ();
  }

}
