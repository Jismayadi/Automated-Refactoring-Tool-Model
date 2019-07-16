package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

@Data
@Builder
public class PropertyModel {

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String type;

    private String name;
}
