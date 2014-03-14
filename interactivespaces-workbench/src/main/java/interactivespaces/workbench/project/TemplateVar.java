/*
 * Copyright (C) 2012 Google Inc.
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

package interactivespaces.workbench.project;

/**
 * A simple input/output pair specification.
 *
 * @author Trevor Pering
 */
public class TemplateVar {

  /**
   * The input path.
   */
  private String value;

  /**
   * Output path.
   */
  private String name;

  /**
   * Create a new template variable entry.
   *
   * @param name
   *          output path
   * @param value
   *          input path
   */
  public TemplateVar() {
  }

  /**
   * @return file input template path
   */
  public String getValue() {
    return value;
  }


  /**
   * @return output path
   */
  public String getName() {
    return name;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setName(String name) {
    this.name = name;
  }
}
