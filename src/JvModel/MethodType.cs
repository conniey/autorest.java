// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;

namespace AutoRest.Java.Model
{
    public enum MethodType
    {
        Other,
        ListBySubscription,
        ListByResourceGroup,
        Get,
        Delete
    }
}