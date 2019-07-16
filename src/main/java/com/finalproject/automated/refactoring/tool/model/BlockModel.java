package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Data
@Builder(builderMethodName = "blockBuilder")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class BlockModel extends StatementModel {

    @Builder.Default
    private List<StatementModel> statements = new ArrayList<>();

    private StatementModel endOfBlockStatement;
}
