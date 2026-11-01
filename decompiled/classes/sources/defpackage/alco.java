package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alco {
    public static final defpackage.alcn a;
    static final boolean b;
    private static final sun.misc.Unsafe c;
    private static final java.lang.Class d;
    private static final boolean e;
    private static final boolean f;

    static {
        boolean z;
        defpackage.alcn alcnVar;
        sun.misc.Unsafe unsafeH = h();
        c = unsafeH;
        d = libcore.io.Memory.class;
        boolean zO = o(java.lang.Long.TYPE);
        e = zO;
        boolean zO2 = o(java.lang.Integer.TYPE);
        defpackage.alcm alclVar = null;
        if (unsafeH != null) {
            if (zO) {
                alclVar = new defpackage.alcm(unsafeH);
            } else if (zO2) {
                alclVar = new alcl(unsafeH);
            }
        }
        a = alclVar;
        if (alclVar != null) {
            try {
                java.lang.Class<?> cls = alclVar.a.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                g();
            } catch (java.lang.Throwable th) {
                i(th);
            }
        }
        defpackage.alcn alcnVar2 = a;
        if (alcnVar2 != null) {
            try {
                java.lang.Class<?> cls2 = alcnVar2.a.getClass();
                cls2.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls2.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls2.getMethod("arrayIndexScale", java.lang.Class.class);
                cls2.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls2.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                java.lang.Class<?> cls3 = java.lang.Long.TYPE;
                cls2.getMethod("putLong", java.lang.Object.class, cls3, cls3);
                cls2.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls2.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                z = true;
            } catch (java.lang.Throwable th2) {
                i(th2);
                z = false;
            }
        } else {
            z = false;
        }
        f = z;
        r(byte[].class);
        r(boolean[].class);
        q(boolean[].class);
        r(int[].class);
        q(int[].class);
        r(long[].class);
        q(long[].class);
        r(float[].class);
        q(float[].class);
        r(double[].class);
        q(double[].class);
        r(java.lang.Object[].class);
        q(java.lang.Object[].class);
        java.lang.reflect.Field fieldG = g();
        if (fieldG != null && (alcnVar = a) != null) {
            alcnVar.a.objectFieldOffset(fieldG);
        }
        b = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private alco() {
    }

    public static byte a(java.lang.Object obj, long j) {
        return (byte) ((a.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    static double b(java.lang.Object obj, long j) {
        return a.a(obj, j);
    }

    static float c(java.lang.Object obj, long j) {
        return a.b(obj, j);
    }

    static int d(java.lang.Object obj, long j) {
        return a.g(obj, j);
    }

    static java.lang.Object e(java.lang.Class cls) {
        try {
            return c.allocateInstance(cls);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    static java.lang.Object f(java.lang.Object obj, long j) {
        return a.i(obj, j);
    }

    public static java.lang.reflect.Field g() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        try {
            declaredField = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (java.lang.Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    static sun.misc.Unsafe h() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.alck(0));
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (java.lang.Exception unused2) {
            java.util.logging.Logger.getLogger(defpackage.alco.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(defpackage.alco.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void j(java.lang.Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        n(obj, j2, (d(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void k(java.lang.Object obj, long j, byte b2) {
        defpackage.alcn alcnVar = a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        alcnVar.j(obj, j2, (alcnVar.g(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    static void l(java.lang.Object obj, long j, double d2) {
        a.d(obj, j, d2);
    }

    static void m(java.lang.Object obj, long j, float f2) {
        a.e(obj, j, f2);
    }

    static void n(java.lang.Object obj, long j, int i) {
        a.j(obj, j, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean o(java.lang.Class cls) {
        try {
            java.lang.Class cls2 = d;
            cls2.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls2.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean p(java.lang.Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    private static void q(java.lang.Class cls) {
        if (f) {
            a.a.arrayIndexScale(cls);
        }
    }

    private static void r(java.lang.Class cls) {
        if (f) {
            a.a.arrayBaseOffset(cls);
        }
    }
}
