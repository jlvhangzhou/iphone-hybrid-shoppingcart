/*
 * ###
 * PHR_IphoneHybrid
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
package com.photon.phresco;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;

import com.photon.phresco.uiconstants.PhrescoUiConstants;

public class RegisterTest extends TestCase {

	WebDriver driver;

	@Test
	public void testregister() throws Exception {
		
		try {
			
			PhrescoUiConstants phrsc = new PhrescoUiConstants();
			String serverURL = phrsc.PROTOCOL + "://" + phrsc.HOST + ":" + phrsc.SERVER_PORT + "/"+phrsc.CONTEXT;
			System.out.println("serverURL :"+serverURL);
			driver.get(serverURL);
			driver.findElement(By.xpath(phrsc.REGISTER)).click();
			driver.findElement(By.id(phrsc.FIRSTNAME)).sendKeys(phrsc.FIRSTNAME_VALUE);
			driver.findElement(By.id(phrsc.LASTNAME)).sendKeys(phrsc.LASTNAME_VALUE);
			driver.findElement(By.id(phrsc.EMAIL_ID)).sendKeys(phrsc.EMAIL_ID_VALUE);
			driver.findElement(By.id(phrsc.PASSWORD)).sendKeys(phrsc.PASSWORD_VALUE);
			driver.findElement(By.id(phrsc.PHONENO)).sendKeys(phrsc.PHONENO_VALUE);
			driver.findElement(By.xpath(phrsc.REGISTER_BUTTON));
			driver.findElement(By.xpath(phrsc.REGISTER_BUTTON)).click();

		 } catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void setUp() throws Exception {

		driver = new IPhoneDriver();
	}

	public void tearDown() throws Exception {
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();
	}

}
