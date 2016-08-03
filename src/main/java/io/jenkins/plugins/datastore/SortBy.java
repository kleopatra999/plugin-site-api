package io.jenkins.plugins.datastore;

public enum SortBy {

  INSTALLS,
  NAME,
  RELEVANCE,
  TITLE,
  UPDATED;

  public String value() {
    return name().toLowerCase();
  }

  public static SortBy fromString(String s) {
    return valueOf(s.toUpperCase());
  }

}
