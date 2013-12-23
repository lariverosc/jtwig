/**
 * Copyright 2012 Lyncode
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lyncode.jtwig.functions.internal.string;

import com.lyncode.jtwig.functions.Function;
import com.lyncode.jtwig.functions.exceptions.FunctionException;
import org.apache.commons.lang3.text.WordUtils;

public class Title implements Function {
    @Override
    public Object execute(Object... arguments) throws FunctionException {
        if (arguments.length != 1) throw new FunctionException("Invalid number of arguments");
        if (arguments[0] == null)
            return null;
        return WordUtils.capitalize((String) arguments[0]);
    }
}