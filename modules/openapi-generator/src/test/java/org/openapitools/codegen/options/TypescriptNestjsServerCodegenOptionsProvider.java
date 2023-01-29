package org.openapitools.codegen.options;

import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.languages.TypescriptNestjsServerCodegen;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class TypescriptNestjsServerCodegenOptionsProvider implements OptionsProvider {
    public static final String PROJECT_NAME_VALUE = "OpenAPI";

    @Override
    public String getLanguage() {
        return "typescript-nestjs-server";
    }

    @Override
    public Map<String, String> createOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder
                .put(TypescriptNestjsServerCodegen.PROJECT_NAME, PROJECT_NAME_VALUE)
                .build();
    }

    @Override
    public boolean isServer() {
        return false;
    }
}

