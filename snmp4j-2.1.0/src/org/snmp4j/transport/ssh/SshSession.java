/*_############################################################################
  _##
  _##  SNMP4J 2 - SshSession.java
  _##
  _##  Copyright (C) 2003-2011  Frank Fock and Jochen Katz (SNMP4J.org)
  _##
  _##  Licensed under the Apache License, Version 2.0 (the "License");
  _##  you may not use this file except in compliance with the License.
  _##  You may obtain a copy of the License at
  _##
  _##      http://www.apache.org/licenses/LICENSE-2.0
  _##
  _##  Unless required by applicable law or agreed to in writing, software
  _##  distributed under the License is distributed on an "AS IS" BASIS,
  _##  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  _##  See the License for the specific language governing permissions and
  _##  limitations under the License.
  _##
  _##########################################################################*/

package org.snmp4j.transport.ssh;

import org.snmp4j.TransportStateReference;
import org.snmp4j.transport.TransportListener;

/**
 * The <code>SshSession</code> interface provides access to a SSH session
 * provided by a {@link SshTransportAdapter}.
 *
 * @author Frank Fock
 * @version 2.0
 * @since 2.0
 */
public interface SshSession<I> {

  Long getID();

  TransportStateReference getTransportStateReference();

  void setTransportStateReference(TransportStateReference tmStateReference);

  I getImplementation();

  void addTransportListener(TransportListener transportListener);
  void removeTransportListener(TransportListener transportListener);
}
