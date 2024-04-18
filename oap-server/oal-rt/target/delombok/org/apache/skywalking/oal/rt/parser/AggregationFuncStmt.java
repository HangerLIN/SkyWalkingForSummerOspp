// Generated by delombok at Thu Apr 18 20:40:39 CST 2024
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.skywalking.oal.rt.parser;

import java.util.LinkedList;
import java.util.List;

public class AggregationFuncStmt {
    private String aggregationFunctionName;
    private List<ConditionExpression> funcConditionExpressions;
    private int funcConditionExpressionGetIdx = 0;
    private List<Argument> funcArgs;
    private int argGetIdx = 0;
    private String nextArgCast = null;

    public void addFuncConditionExpression(ConditionExpression conditionExpression) {
        if (funcConditionExpressions == null) {
            funcConditionExpressions = new LinkedList<>();
        }
        funcConditionExpressions.add(conditionExpression);
    }

    public ConditionExpression getNextFuncConditionExpression() {
        return funcConditionExpressions.get(funcConditionExpressionGetIdx++);
    }

    public void addFuncArg(Argument argument) {
        if (funcArgs == null) {
            funcArgs = new LinkedList<>();
        }
        if (nextArgCast != null) {
            argument.setCastType(nextArgCast);
            nextArgCast = null;
        }
        funcArgs.add(argument);
    }

    public Argument getLastArgument() {
        return funcArgs.get(funcArgs.size() - 1);
    }

    public Argument getNextFuncArg() {
        return funcArgs.get(argGetIdx++);
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setAggregationFunctionName(final String aggregationFunctionName) {
        this.aggregationFunctionName = aggregationFunctionName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setFuncConditionExpressions(final List<ConditionExpression> funcConditionExpressions) {
        this.funcConditionExpressions = funcConditionExpressions;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setFuncConditionExpressionGetIdx(final int funcConditionExpressionGetIdx) {
        this.funcConditionExpressionGetIdx = funcConditionExpressionGetIdx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setFuncArgs(final List<Argument> funcArgs) {
        this.funcArgs = funcArgs;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setArgGetIdx(final int argGetIdx) {
        this.argGetIdx = argGetIdx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public void setNextArgCast(final String nextArgCast) {
        this.nextArgCast = nextArgCast;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getAggregationFunctionName() {
        return this.aggregationFunctionName;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<ConditionExpression> getFuncConditionExpressions() {
        return this.funcConditionExpressions;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getFuncConditionExpressionGetIdx() {
        return this.funcConditionExpressionGetIdx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public List<Argument> getFuncArgs() {
        return this.funcArgs;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public int getArgGetIdx() {
        return this.argGetIdx;
    }

    @java.lang.SuppressWarnings("all")
    @lombok.Generated
    public String getNextArgCast() {
        return this.nextArgCast;
    }
}
