/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.swagger.generator.core.processor.annotation;

import io.servicecomb.swagger.generator.core.MethodAnnotationProcessor;
import io.servicecomb.swagger.generator.core.OperationGenerator;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @version  [版本号, 2017年3月6日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class ApiImplicitParamsMethodProcessor implements MethodAnnotationProcessor {
    /**
     * {@inheritDoc}
     */
    @Override
    public void process(Object annotation, OperationGenerator operationGenerator) {
        ApiImplicitParams apiImplicitParamsAnnotation = (ApiImplicitParams) annotation;

        MethodAnnotationProcessor processor =
            operationGenerator.getContext().findMethodAnnotationProcessor(ApiImplicitParam.class);
        for (ApiImplicitParam paramAnnotation : apiImplicitParamsAnnotation.value()) {
            processor.process(paramAnnotation, operationGenerator);
        }
    }
}