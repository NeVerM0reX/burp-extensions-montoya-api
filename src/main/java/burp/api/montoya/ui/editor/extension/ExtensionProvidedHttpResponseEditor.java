/*
 * Copyright (c) 2022. PortSwigger Ltd. All rights reserved.
 *
 * This code may be used to extend the functionality of Burp Suite Community Edition
 * and Burp Suite Professional, provided that this usage does not violate the
 * license terms for those products.
 */

package burp.api.montoya.ui.editor.extension;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.Selection;

import java.awt.Component;

/**
 * Extensions that register an {@link HttpResponseEditorProvider} must return an instance of this interface.<br/>
 * Burp will then use that instance to create custom tabs within its HTTP response editor.
 */
public interface ExtensionProvidedHttpResponseEditor extends ExtensionProvidedEditor
{
    /**
     * @return An instance of {@link HttpResponse} derived from the content of the HTTP response editor.
     */
    HttpResponse getResponse();

    /**
     * {@inheritDoc}
     */
    @Override
    void setRequestResponse(HttpRequestResponse requestResponse);

    /**
     * {@inheritDoc}
     */
    @Override
    boolean isEnabledFor(HttpRequestResponse requestResponse);

    /**
     * {@inheritDoc}
     */
    @Override
    String caption();

    /**
     * {@inheritDoc}
     */
    @Override
    Component uiComponent();

    /**
     * {@inheritDoc}
     */
    @Override
    Selection selectedData();

    /**
     * {@inheritDoc}
     */
    @Override
    boolean isModified();
}
