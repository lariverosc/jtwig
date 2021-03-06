/**
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

package com.lyncode.jtwig.content.model.renderable;

import com.lyncode.jtwig.content.api.Renderable;
import com.lyncode.jtwig.exception.RenderException;
import com.lyncode.jtwig.render.RenderContext;

public class Replacement implements Renderable {
    private final Renderable replacement;
    private final Renderable original;

    public Replacement(Renderable replacement, Renderable original) {
        this.replacement = replacement;
        this.original = original;
    }

    @Override
    public void render(RenderContext context) throws RenderException {
        replacement.render(context);
    }

    public Renderable getParent() {
        return original;
    }

}
