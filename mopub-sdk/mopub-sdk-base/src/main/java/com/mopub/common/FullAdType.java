// Copyright 2018-2020 Twitter, Inc.
// Licensed under the MoPub SDK License Agreement
// http://www.mopub.com/legal/sdk-license-agreement/

package com.mopub.common;

/**
 * Valid values for the "X-Fulladtype" header from the MoPub ad server. The value of this header
 * controls the base ad loading behavior.
 */
public class FullAdType {
    public static final String JSON = "json";
    public static final String MRAID = "mraid";
    public static final String VAST = "vast";
}
