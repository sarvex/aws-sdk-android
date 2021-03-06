/*
 * Copyright 2014-2015 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.unmarshallers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.util.DateUtils;

/**
 * An unmarshaller that unmarshals ISO-8601-formatted dates as Java
 * {@code Date} objects.
 */
public class DateUnmarshaller extends SUnmarshaller {

    private static final DateUnmarshaller INSTANCE =
            new DateUnmarshaller();

    public static DateUnmarshaller instance() {
        return INSTANCE;
    }

    private DateUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        return DateUtils.parseISO8601Date(value.getS());
    }
}
