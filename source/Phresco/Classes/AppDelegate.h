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
//
//  AppDelegate.h
//  Phresco
//
//  Created by ARUNACHALAM LAKSHMANAN on 1/18/12.
//  Copyright __MyCompanyName__ 2012. All rights reserved.
//

#import <UIKit/UIKit.h>
#ifdef PHONEGAP_FRAMEWORK
	#import <PhoneGap/PhoneGapDelegate.h>
    #import <PhoneGap/Reachability.h>
#else
	#import "PhoneGapDelegate.h"
#endif

//@class Reachability;
@interface AppDelegate : PhoneGapDelegate {

	NSString* invokeString;
    Reachability *internetReachable;
    Reachability *hostReachable;
    Reachability* hostReach;
    Reachability* internetReach;
    Reachability* wifiReach;
    
}

// invoke string is passed to your app on launch, this is only valid if you 
// edit Phresco.plist to add a protocol
// a simple tutorial can be found here : 
// http://iphonedevelopertips.com/cocoa/launching-your-own-application-via-a-custom-url-scheme.html

@property (copy)  NSString* invokeString;

NSString *urlString;

-(void) urlParsing;
@end

