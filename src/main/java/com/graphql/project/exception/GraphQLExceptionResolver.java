package com.graphql.project.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GraphQLExceptionResolver  extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, graphql.schema.DataFetchingEnvironment env) {
        if (ex instanceof CustomException) {
            return GraphqlErrorBuilder.newError(env)
                    .message(ex.getMessage())
                    .errorType(ErrorType.NOT_FOUND)
                    .build();
        }
        return super.resolveToSingleError(ex, env);
    }
}
