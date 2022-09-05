/*
 * Copyright (c) 2022. PortSwigger Ltd. All rights reserved.
 *
 * This code may be used to extend the functionality of Burp Suite Community Edition
 * and Burp Suite Professional, provided that this usage does not violate the
 * license terms for those products.
 */

package burp.api.montoya.repeater;

import burp.api.montoya.http.message.requests.HttpRequest;

/**
 * This interface provides access to the functionality of the Repeater tool.
 */
public interface Repeater
{
    /**
     * This method can be used to send an HTTP request to the Burp Repeater
     * tool. The request will be displayed in the user interface using a
     * default tab index, but will not be issued until the user initiates
     * this action.
     *
     * @param request The full HTTP request.
     */
    default void sendToRepeater(HttpRequest request)
    {
        sendToRepeater(null, request);
    }

    /**
     * This method can be used to send an HTTP request to the Burp Repeater
     * tool. The request will be displayed in the user interface, but will not
     * be issued until the user initiates this action.
     *
     * @param name    An optional caption which will appear on the Repeater
     *                tab containing the request. If this value is {@code null} then a default
     *                tab index will be displayed.
     * @param request The full HTTP request.
     */
    void sendToRepeater(String name, HttpRequest request);
}
