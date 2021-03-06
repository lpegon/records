package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ObjectLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FileLink
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class FileLink extends ObjectLink  {
  @JsonProperty("thumbnailUri")
  private String thumbnailUri = null;

  public FileLink thumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
    return this;
  }

   /**
   * Get thumbnailUri
   * @return thumbnailUri
  **/
  @ApiModelProperty(value = "")
  public String getThumbnailUri() {
    return thumbnailUri;
  }

  public void setThumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileLink fileLink = (FileLink) o;
    return Objects.equals(this.thumbnailUri, fileLink.thumbnailUri) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumbnailUri, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileLink {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    thumbnailUri: ").append(toIndentedString(thumbnailUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

