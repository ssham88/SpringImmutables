package com.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface Item {
	abstract String getName();

	abstract String description();

	abstract int getValue();
}
