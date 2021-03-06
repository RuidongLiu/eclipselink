/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
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
// dmccann - 2.2 - Initial implementation
package org.eclipse.persistence.testing.jaxb.xmltype;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(factoryMethod="buildEmployee")
public class Employee {
    @XmlElement
    private String name;

    private Employee(String name) {
        super();
        this.name = name;
    }

    public static Employee buildEmployee() {
        return new Employee("John");
    }

    public boolean equals(Object o) {
        Employee e;
        try {
            e = (Employee) o;
        } catch (ClassCastException cce) {
            return false;
        }
        return this.name.equals(e.name);
    }
}
