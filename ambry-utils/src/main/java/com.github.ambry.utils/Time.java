package com.github.ambry.utils;

/**
 * A mockable interface for time functions
 */
public abstract class Time {

  /**
   * Some common constants
   */
  public static final int NsPerUs = 1000;
  public static final int UsPerMs = 1000;
  public static final int MsPerSec = 1000;
  public static final int NsPerMs = NsPerUs * UsPerMs;
  public static final int NsPerSec = NsPerMs * MsPerSec;
  public static final int UsPerSec = UsPerMs * MsPerSec;
  public static final int SecsPerMin = 60;
  public static final int MinsPerHour = 60;
  public static final int HoursPerDay = 24;
  public static final int SecsPerHour = SecsPerMin * MinsPerHour;
  public static final int SecsPerDay = SecsPerHour * HoursPerDay;
  public static final int MinsPerDay = MinsPerHour * HoursPerDay;

  public abstract long milliseconds();

  public abstract long nanoseconds();

  public abstract void sleep(long ms) throws InterruptedException;
}
