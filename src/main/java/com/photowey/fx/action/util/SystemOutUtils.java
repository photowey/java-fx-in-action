package com.photowey.fx.action.util;

/**
 * SystemOutUtils
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public final class SystemOutUtils {

    private SystemOutUtils() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    // ===================================================================

    public static void print(String message, Object... params) {
        System.out.print(String.format(message, params));
    }

    // ===================================================================

    public static void println(String message, Object... params) {
        System.out.println(String.format(message, params));
    }

    // ===================================================================

    public static void printf(String message, Object... params) {
        System.out.printf(message, params);
    }

    public static void printfln(String message, Object... params) {
        System.out.printf(message, params);
        System.out.println();
    }
}
