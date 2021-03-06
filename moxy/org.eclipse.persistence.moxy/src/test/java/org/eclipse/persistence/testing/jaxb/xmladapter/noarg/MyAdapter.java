/*
 * Copyright (c) 2012, 2020 Oracle and/or its affiliates. All rights reserved.
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
//  - Denise Smith - September 2013
package org.eclipse.persistence.testing.jaxb.xmladapter.noarg;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class MyAdapter extends XmlAdapter<String, Something> {
    public MyAdapter() {
    }

    @Override
    public Something unmarshal(String v) throws Exception {
        return new Something(v);
    }

    @Override
    public String marshal(Something v) throws Exception {
        return v.value;
    }
}
