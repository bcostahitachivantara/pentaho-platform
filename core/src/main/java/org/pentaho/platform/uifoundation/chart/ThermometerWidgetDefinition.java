/*!
 *
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License, version 2 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright (c) 2002-2018 Hitachi Vantara. All rights reserved.
 *
 */

package org.pentaho.platform.uifoundation.chart;

import java.awt.Font;

public class ThermometerWidgetDefinition extends WidgetDefinition {

  /**
   * 
   */
  private static final long serialVersionUID = 2902723672393895969L;

  // TODO make this work in a similar way to DialWidgetDefinition
  public ThermometerWidgetDefinition( final double value, final double minimum, final double maximum ) {
    super( value, minimum, maximum );
  }

  @Override
  public Font getValueFont() {
    return null;
  }

}
