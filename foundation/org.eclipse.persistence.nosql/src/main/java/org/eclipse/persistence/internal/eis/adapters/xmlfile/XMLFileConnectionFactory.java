/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.internal.eis.adapters.xmlfile;

import javax.naming.Reference;
import jakarta.resource.cci.*;

/**
 * Connection factory for XML file JCA adapter.
 *
 * @author James
 * @since OracleAS TopLink 10<i>g</i> (10.0.3)
 */
public class XMLFileConnectionFactory implements ConnectionFactory {

    /**
     * Default constructor.
     */
    public XMLFileConnectionFactory() {
    }

    @Override
    public Connection getConnection() {
        return new XMLFileConnection(new XMLFileConnectionSpec());
    }

    @Override
    public Connection getConnection(ConnectionSpec spec) {
        return new XMLFileConnection((XMLFileConnectionSpec)spec);
    }

    @Override
    public ResourceAdapterMetaData getMetaData() {
        return new XMLFileAdapterMetaData();
    }

    @Override
    public RecordFactory getRecordFactory() {
        return new XMLFileRecordFactory();
    }

    @Override
    public Reference getReference() {
        return new Reference(getClass().getName());
    }

    @Override
    public void setReference(Reference reference) {
    }
}
