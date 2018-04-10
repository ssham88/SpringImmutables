package com.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableItem.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Item"})
public final class ImmutableItem implements Item {
  private final String name;
  private final String description;
  private final int value;

  private ImmutableItem(String name, String description, int value) {
    this.name = name;
    this.description = description;
    this.value = value;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableItem(newValue, this.description, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "description");
    return new ImmutableItem(this.name, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Item#getValue() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItem withValue(int value) {
    if (this.value == value) return this;
    return new ImmutableItem(this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableItem
        && equalTo((ImmutableItem) another);
  }

  private boolean equalTo(ImmutableItem another) {
    return name.equals(another.name)
        && description.equals(another.description)
        && value == another.value;
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code description}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + value;
    return h;
  }

  /**
   * Prints the immutable value {@code Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Item{"
        + "name=" + name
        + ", description=" + description
        + ", value=" + value
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Item instance
   */
  public static ImmutableItem copyOf(Item instance) {
    if (instance instanceof ImmutableItem) {
      return (ImmutableItem) instance;
    }
    return ImmutableItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableItem ImmutableItem}.
   * @return A new ImmutableItem builder
   */
  public static ImmutableItem.Builder builder() {
    return new ImmutableItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableItem ImmutableItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_DESCRIPTION = 0x2L;
    private static final long INIT_BIT_VALUE = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String description;
    private int value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Item} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Item instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      description(instance.description());
      value(instance.getValue());
      return this;
    }

    /**
     * Initializes the value for the {@link Item#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Item#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link Item#getValue() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder value(int value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableItem ImmutableItem}.
     * @return An immutable instance of Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableItem(name, description, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build Item, some of required attributes are not set " + attributes;
    }
  }
}
