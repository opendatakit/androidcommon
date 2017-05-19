/*
 * Copyright (C) 2017 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.views;

/**
 * Extract the methods needed by OdkData on the ODKWebView.
 * Simplifies webservices class re-use.
 *
 * @author mitchellsundt@gmail.com
 */

public interface IOdkWebView {
   boolean isInactive();

   String getContainerFragmentID();
}
