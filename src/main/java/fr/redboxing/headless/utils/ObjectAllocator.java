package fr.redboxing.headless.utils;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Hacky util to allocate objects without needing to invoke their constructor.
 *
 * @author Brady
 * @since 3/3/2020
 */
public final class ObjectAllocator {

    private static final Unsafe theUnsafe;

    static {
        try {
            Class<?> clazz = Class.forName("sun.misc.Unsafe");
            Field field = clazz.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            theUnsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ObjectAllocator() {}

    public static <T> T allocate(Class<T> clazz) {
        try {
            // noinspection unchecked
            return (T) theUnsafe.allocateInstance(clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}