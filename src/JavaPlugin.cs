// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 

using AutoRest.Core;
using AutoRest.Core.Extensibility;
using AutoRest.Core.Model;
using AutoRest.Java.Model;

namespace AutoRest.Java
{
    public sealed class JavaPlugin : Plugin<IGeneratorSettings, CodeModelTransformer<CodeModelJv>, CodeGeneratorJv, CodeNamerJv, CodeModelJv>
    {
    }
}