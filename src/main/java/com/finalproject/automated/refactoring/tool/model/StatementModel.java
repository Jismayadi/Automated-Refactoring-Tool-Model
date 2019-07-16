package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Data
@Builder(builderMethodName = "statementBuilder")
@NoArgsConstructor
@AllArgsConstructor
public class StatementModel {

    private String statement;

    private Integer startIndex;

    private Integer endIndex;
}
