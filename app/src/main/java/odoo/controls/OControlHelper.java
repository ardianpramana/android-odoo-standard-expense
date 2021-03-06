/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 7/1/15 5:46 PM
 */
package odoo.controls;

import android.graphics.Typeface;

public class OControlHelper {
    public static final String TAG = OControlHelper.class.getSimpleName();

    public static Typeface boldFont() {
        return Typeface.create("sans-serif-condensed", 0);
    }

    public static Typeface lightFont() {
        return Typeface.create("sans-serif-light", 0);
    }
}
