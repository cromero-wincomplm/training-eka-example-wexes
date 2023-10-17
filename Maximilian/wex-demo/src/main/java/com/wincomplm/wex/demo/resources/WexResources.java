/*
 * Copyright (c) 2021 Wincom Consulting S.L.
 * All Rights Reserved.
 * This source is subject to the terms of a software license agreement.
 * You shall not disclose such confidential information and shall use it only in accordance with the terms and conditions of the license agreement.
 */
package com.wincomplm.wex.demo.resources;

import com.wincomplm.wex.kernel.impl.annotations.WexComponent;
import wt.util.resource.RBEntry;
import wt.util.resource.RBNameException;
import wt.util.resource.RBUUID;
import wt.util.resource.WTListResourceBundle;

@WexComponent(uid = "com.wincomplm.wex.demo.resources.WexResources", description = "Resource bundle")
@RBUUID("com.wincomplm.wex.demo.resources.WexResources")
@RBNameException
public class WexResources extends WTListResourceBundle {

    @RBEntry("Hello World")
    public static final String PRIVATE_CONSTANT_0 = "com.wincomplm.wex.demo.demoHelloWorld.description";
    @RBEntry("Hello World")
    public static final String PRIVATE_CONSTANT_1 = "com.wincomplm.wex.demo.demoHelloWorld.tooltip";
    @RBEntry("Hello World")
    public static final String PRIVATE_CONSTANT_2 = "com.wincomplm.wex.demo.demoHelloWorld.activetooltip";

    @RBEntry("Hello World No PopUp")
    public static final String PRIVATE_CONSTANT_3 = "com.wincomplm.wex.demo.demoHelloWorldNonPop.description";
    @RBEntry("Hello World No PopUp")
    public static final String PRIVATE_CONSTANT_4 = "com.wincomplm.wex.demo.demoHelloWorldNonPop.tooltip";
    @RBEntry("Hello World No PopUp")
    public static final String PRIVATE_CONSTANT_5 = "com.wincomplm.wex.demo.demoHelloWorldNonPop.activetooltip";

}
