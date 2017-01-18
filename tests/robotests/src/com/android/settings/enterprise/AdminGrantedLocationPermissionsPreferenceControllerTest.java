/*
 * Copyright (C) 2017 The Android Open Source Project
 *
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
 */

package com.android.settings.enterprise;

import android.Manifest;

import com.android.settings.R;
import com.android.settings.SettingsRobolectricTestRunner;
import com.android.settings.TestConfig;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

/**
 * Tests for {@link AdminGrantedLocationPermissionsPreferenceController}.
 */
@RunWith(SettingsRobolectricTestRunner.class)
@Config(manifest = TestConfig.MANIFEST_PATH, sdk = TestConfig.SDK_VERSION)
public final class AdminGrantedLocationPermissionsPreferenceControllerTest extends
        AdminGrantedPermissionsPreferenceControllerTestBase {

    public AdminGrantedLocationPermissionsPreferenceControllerTest() {
        super("enterprise_privacy_number_location_access_packages",
                new String[] {Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION},
                R.plurals.enterprise_privacy_number_location_access_packages);
    }

    @Override
    public void setUp() {
        super.setUp();
        mController = new AdminGrantedLocationPermissionsPreferenceController(mContext);
    }
}
