package com.immutables;

import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Tuple}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code ImmutableTuple.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Tuple"})
final class ImmutableTuple implements Tuple {
  private final int index;
  private final String name;

  private ImmutableTuple(int index, String name) {
    this.index = index;
    this.name = Objects.requireNonNull(name, "name");
  }

  /**
   * @return The value of the {@code index} attribute
   */
  @Override
  public int getIndex() {
    return index;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTuple} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTuple
        && equalTo((ImmutableTuple) another);
  }

  private boolean equalTo(ImmutableTuple another) {
    return index == another.index
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code index}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + index;
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Tuple} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Tuple{"
        + "index=" + index
        + ", name=" + name
        + "}";
  }

  /**
   * Construct a new immutable {@code Tuple} instance.
   * @param index The value for the {@code index} attribute
   * @param name The value for the {@code name} attribute
   * @return An immutable Tuple instance
   */
  public static ImmutableTuple of(int index, String name) {
    return new ImmutableTuple(index, name);
  }
}
