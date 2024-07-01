package org.amalgam.Service.PlayerServiceModule;


/**
* org/amalgam/Service/PlayerServiceModule/_PlayerServiceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, July 1, 2024 10:33:06 PM SGT
*/

public class _PlayerServiceStub extends org.omg.CORBA.portable.ObjectImpl implements PlayerService
{

  public void login (org.amalgam.UIControllers.PlayerCallback player_callback, String password) throws org.amalgam.Utils.Exceptions.AlreadyLoggedInException, org.amalgam.Utils.Exceptions.InvalidCredentialsException, org.amalgam.Utils.Exceptions.UserExistenceException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("login", true);
                org.amalgam.Service.PlayerServiceModule.PlayerServicePackage.PlayerCallbackHelper.write ($out, player_callback);
                $out.write_string (password);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/AlreadyLoggedInException:1.0"))
                    throw org.amalgam.Utils.Exceptions.AlreadyLoggedInExceptionHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/InvalidCredentialsException:1.0"))
                    throw org.amalgam.Utils.Exceptions.InvalidCredentialsExceptionHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/UserExistenceException:1.0"))
                    throw org.amalgam.Utils.Exceptions.UserExistenceExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                login (player_callback, password        );
            } finally {
                _releaseReply ($in);
            }
  } // login

  public void logout (String username) throws org.amalgam.Utils.Exceptions.NotLoggedInException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("logout", true);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/NotLoggedInException:1.0"))
                    throw org.amalgam.Utils.Exceptions.NotLoggedInExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                logout (username        );
            } finally {
                _releaseReply ($in);
            }
  } // logout

  public void createAccount (String username, String password) throws org.amalgam.Utils.Exceptions.AccountCreationFailedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createAccount", true);
                $out.write_string (username);
                $out.write_string (password);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/AccountCreationFailedException:1.0"))
                    throw org.amalgam.Utils.Exceptions.AccountCreationFailedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                createAccount (username, password        );
            } finally {
                _releaseReply ($in);
            }
  } // createAccount

  public void changeUsername (String username, String newUsername) throws org.amalgam.Utils.Exceptions.ChangeUsernameFailedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changeUsername", true);
                $out.write_string (username);
                $out.write_string (newUsername);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/ChangeUsernameFailedException:1.0"))
                    throw org.amalgam.Utils.Exceptions.ChangeUsernameFailedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                changeUsername (username, newUsername        );
            } finally {
                _releaseReply ($in);
            }
  } // changeUsername

  public void changePassword (String username, String newPassword) throws org.amalgam.Utils.Exceptions.ChangePasswordFailedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("changePassword", true);
                $out.write_string (username);
                $out.write_string (newPassword);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/ChangePasswordFailedException:1.0"))
                    throw org.amalgam.Utils.Exceptions.ChangePasswordFailedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                changePassword (username, newPassword        );
            } finally {
                _releaseReply ($in);
            }
  } // changePassword

  public void accountDeletionRequest (String username) throws org.amalgam.Utils.Exceptions.DeleteAccountFailedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("accountDeletionRequest", true);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/DeleteAccountFailedException:1.0"))
                    throw org.amalgam.Utils.Exceptions.DeleteAccountFailedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                accountDeletionRequest (username        );
            } finally {
                _releaseReply ($in);
            }
  } // accountDeletionRequest

  public String getGameHistory (String username) throws org.amalgam.Utils.Exceptions.GameHistoryUnavailableException, org.amalgam.Utils.Exceptions.InGameException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getGameHistory", true);
                $out.write_string (username);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/GameHistoryUnavailableException:1.0"))
                    throw org.amalgam.Utils.Exceptions.GameHistoryUnavailableExceptionHelper.read ($in);
                else if (_id.equals ("IDL:org/amalgam/Utils/Exceptions/InGameException:1.0"))
                    throw org.amalgam.Utils.Exceptions.InGameExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getGameHistory (username        );
            } finally {
                _releaseReply ($in);
            }
  } // getGameHistory

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/Service/PlayerServiceModule/PlayerService:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     com.sun.corba.se.impl.orbutil.IORCheckImpl.check(str, "org.amalgam.Service.PlayerServiceModule._PlayerServiceStub");
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PlayerServiceStub
