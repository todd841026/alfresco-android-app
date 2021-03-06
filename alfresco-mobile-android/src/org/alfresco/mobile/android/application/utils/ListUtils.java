/*******************************************************************************
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 * 
 * This file is part of Alfresco Mobile for Android.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.application.utils;

import java.util.HashMap;
import java.util.Map;

public class ListUtils
{

    public static Map<String, ?> createPair(String name, String value)
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name", name);
        hashMap.put("value", value);
        return hashMap;
    }

    public static Map<String, ?> createThree(String top, String bottom, String content)
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("top", top);
        hashMap.put("bottom", bottom);
        hashMap.put("content", content);
        return hashMap;
    }

}
