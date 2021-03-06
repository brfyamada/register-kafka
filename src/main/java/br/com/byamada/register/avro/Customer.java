/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.byamada.register.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -244892753877675233L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"br.com.byamada.register.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Customer Name\"},{\"name\":\"document\",\"type\":\"string\",\"doc\":\"Customer document number\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Customer age\"},{\"name\":\"isActive\",\"type\":\"boolean\",\"doc\":\"Customer state\",\"default\":true}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Customer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Customer from a ByteBuffer. */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Customer Name */
  @Deprecated public java.lang.CharSequence name;
  /** Customer document number */
  @Deprecated public java.lang.CharSequence document;
  /** Customer age */
  @Deprecated public int age;
  /** Customer state */
  @Deprecated public boolean isActive;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param name Customer Name
   * @param document Customer document number
   * @param age Customer age
   * @param isActive Customer state
   */
  public Customer(java.lang.CharSequence name, java.lang.CharSequence document, java.lang.Integer age, java.lang.Boolean isActive) {
    this.name = name;
    this.document = document;
    this.age = age;
    this.isActive = isActive;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return document;
    case 2: return age;
    case 3: return isActive;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: document = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: isActive = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Customer Name
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Customer Name
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'document' field.
   * @return Customer document number
   */
  public java.lang.CharSequence getDocument() {
    return document;
  }

  /**
   * Sets the value of the 'document' field.
   * Customer document number
   * @param value the value to set.
   */
  public void setDocument(java.lang.CharSequence value) {
    this.document = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return Customer age
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * Customer age
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'isActive' field.
   * @return Customer state
   */
  public java.lang.Boolean getIsActive() {
    return isActive;
  }

  /**
   * Sets the value of the 'isActive' field.
   * Customer state
   * @param value the value to set.
   */
  public void setIsActive(java.lang.Boolean value) {
    this.isActive = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static br.com.byamada.register.avro.Customer.Builder newBuilder() {
    return new br.com.byamada.register.avro.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static br.com.byamada.register.avro.Customer.Builder newBuilder(br.com.byamada.register.avro.Customer.Builder other) {
    return new br.com.byamada.register.avro.Customer.Builder(other);
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static br.com.byamada.register.avro.Customer.Builder newBuilder(br.com.byamada.register.avro.Customer other) {
    return new br.com.byamada.register.avro.Customer.Builder(other);
  }

  /**
   * RecordBuilder for Customer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    /** Customer Name */
    private java.lang.CharSequence name;
    /** Customer document number */
    private java.lang.CharSequence document;
    /** Customer age */
    private int age;
    /** Customer state */
    private boolean isActive;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.byamada.register.avro.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.document)) {
        this.document = data().deepCopy(fields()[1].schema(), other.document);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isActive)) {
        this.isActive = data().deepCopy(fields()[3].schema(), other.isActive);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.byamada.register.avro.Customer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.document)) {
        this.document = data().deepCopy(fields()[1].schema(), other.document);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isActive)) {
        this.isActive = data().deepCopy(fields()[3].schema(), other.isActive);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * Customer Name
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Customer Name
      * @param value The value of 'name'.
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Customer Name
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * Customer Name
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'document' field.
      * Customer document number
      * @return The value.
      */
    public java.lang.CharSequence getDocument() {
      return document;
    }

    /**
      * Sets the value of the 'document' field.
      * Customer document number
      * @param value The value of 'document'.
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder setDocument(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.document = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'document' field has been set.
      * Customer document number
      * @return True if the 'document' field has been set, false otherwise.
      */
    public boolean hasDocument() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'document' field.
      * Customer document number
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder clearDocument() {
      document = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Customer age
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Customer age
      * @param value The value of 'age'.
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Customer age
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * Customer age
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'isActive' field.
      * Customer state
      * @return The value.
      */
    public java.lang.Boolean getIsActive() {
      return isActive;
    }

    /**
      * Sets the value of the 'isActive' field.
      * Customer state
      * @param value The value of 'isActive'.
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder setIsActive(boolean value) {
      validate(fields()[3], value);
      this.isActive = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'isActive' field has been set.
      * Customer state
      * @return True if the 'isActive' field has been set, false otherwise.
      */
    public boolean hasIsActive() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'isActive' field.
      * Customer state
      * @return This builder.
      */
    public br.com.byamada.register.avro.Customer.Builder clearIsActive() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.document = fieldSetFlags()[1] ? this.document : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.isActive = fieldSetFlags()[3] ? this.isActive : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
