/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.winrun4j.test;

import org.boris.winrun4j.impl.NativeDdeServer;

public class NativeDdeServerTest
{
    public static void main(String[] args) throws Exception {
        NativeDdeServer server = new NativeDdeServer();
        server.initialize("WinRun4J");
        System.in.read();
        server.uninitialize();
    }
}
