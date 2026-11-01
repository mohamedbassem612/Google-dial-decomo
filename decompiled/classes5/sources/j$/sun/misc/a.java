package j$.sun.misc;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a {
    public static final j$.sun.misc.a b;
    public final sun.misc.Unsafe a;

    static {
        java.lang.reflect.Field declaredField;
        try {
            declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = sun.misc.Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    throw new java.lang.AssertionError("Couldn't find the Unsafe", e);
                }
                java.lang.reflect.Field field = declaredFields[i];
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && sun.misc.Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i++;
            }
        }
        declaredField.setAccessible(true);
        try {
            b = new j$.sun.misc.a((sun.misc.Unsafe) declaredField.get(null));
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    public a(sun.misc.Unsafe unsafe) {
        this.a = unsafe;
    }

    public final long a(java.lang.Class cls, java.lang.String str) {
        try {
            return this.a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.AssertionError("Cannot find field:", e);
        }
    }
}
