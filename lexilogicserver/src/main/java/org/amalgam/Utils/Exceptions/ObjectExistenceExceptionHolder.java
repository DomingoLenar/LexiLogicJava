package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/ObjectExistenceExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:08 PM SGT
*/

public final class ObjectExistenceExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public ObjectExistenceException value = null;

  public ObjectExistenceExceptionHolder ()
  {
  }

  public ObjectExistenceExceptionHolder (ObjectExistenceException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ObjectExistenceExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ObjectExistenceExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ObjectExistenceExceptionHelper.type ();
  }

}
