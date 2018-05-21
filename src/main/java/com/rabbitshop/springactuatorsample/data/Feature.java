package com.rabbitshop.springactuatorsample.data;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class Feature {

	Boolean enabled;

}
