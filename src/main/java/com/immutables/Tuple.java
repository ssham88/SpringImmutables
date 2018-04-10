package com.immutables;

import org.immutables.value.Value;

@Value.Immutable(builder = false, copy = false)
interface Tuple {
  @Value.Parameter int getIndex();
  @Value.Parameter String getName();
}
