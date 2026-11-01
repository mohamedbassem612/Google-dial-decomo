package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apzs {
    static final boolean a;
    private static final sun.misc.Unsafe b;
    private static final java.lang.Class c;
    private static final boolean d;
    private static final defpackage.apzr e;
    private static final boolean f;

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    static {
        defpackage.apzr apzpVar;
        boolean z;
        defpackage.apzr apzrVar;
        sun.misc.Unsafe unsafeG = g();
        b = unsafeG;
        c = defpackage.apxh.a;
        boolean zP = p(java.lang.Long.TYPE);
        d = zP;
        boolean zP2 = p(java.lang.Integer.TYPE);
        java.lang.reflect.Field field = null;
        if (unsafeG == null) {
            apzpVar = null;
        } else if (zP) {
            apzpVar = new defpackage.apzq(unsafeG);
        } else if (zP2) {
            apzpVar = new defpackage.apzp(unsafeG);
        } else {
            apzpVar = null;
        }
        e = apzpVar;
        if (apzpVar != null) {
            try {
                java.lang.Class<?> cls = apzpVar.a.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", java.lang.Class.class);
                cls.getMethod("arrayIndexScale", java.lang.Class.class);
                cls.getMethod("getInt", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putInt", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
                java.lang.Class<?> cls2 = java.lang.Long.TYPE;
                cls.getMethod("putLong", java.lang.Object.class, cls2, cls2);
                cls.getMethod("getObject", java.lang.Object.class, java.lang.Long.TYPE);
                cls.getMethod("putObject", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Object.class);
                z = true;
            } catch (java.lang.Throwable th) {
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.apzs.class.getName());
                th.toString();
                logger.log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z = false;
            }
        } else {
            z = false;
        }
        f = z;
        u(byte[].class);
        u(boolean[].class);
        t(boolean[].class);
        u(int[].class);
        t(int[].class);
        u(long[].class);
        t(long[].class);
        u(float[].class);
        t(float[].class);
        u(double[].class);
        t(double[].class);
        u(java.lang.Object[].class);
        t(java.lang.Object[].class);
        java.lang.reflect.Field fieldA = anty.A(java.nio.Buffer.class, "effectiveDirectAddress");
        if (fieldA != null || ((fieldA = anty.A(java.nio.Buffer.class, "address")) != null && fieldA.getType() == java.lang.Long.TYPE)) {
            field = fieldA;
        }
        if (field != null && (apzrVar = e) != null) {
            apzrVar.a.objectFieldOffset(field);
        }
        a = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private apzs() {
    }

    static double a(java.lang.Object obj, long j) {
        return e.a(obj, j);
    }

    static float b(java.lang.Object obj, long j) {
        return e.b(obj, j);
    }

    static int c(java.lang.Object obj, long j) {
        return e.g(obj, j);
    }

    static long d(java.lang.Object obj, long j) {
        return e.h(obj, j);
    }

    static java.lang.Object e(java.lang.Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    public static java.lang.Object f(java.lang.Object obj, long j) {
        return e.a.getObject(obj, j);
    }

    static sun.misc.Unsafe g() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.apzo());
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
            java.util.logging.Logger.getLogger(defpackage.apzs.class.getName()).log(java.util.logging.Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    static void h(java.lang.Object obj, long j, boolean z) {
        e.c(obj, j, z);
    }

    public static void i(java.lang.Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        m(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void j(java.lang.Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        m(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    static void k(java.lang.Object obj, long j, double d2) {
        e.d(obj, j, d2);
    }

    static void l(java.lang.Object obj, long j, float f2) {
        e.e(obj, j, f2);
    }

    static void m(java.lang.Object obj, long j, int i) {
        e.i(obj, j, i);
    }

    static void n(java.lang.Object obj, long j, long j2) {
        e.j(obj, j, j2);
    }

    public static void o(java.lang.Object obj, long j, java.lang.Object obj2) {
        e.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean p(java.lang.Class cls) {
        java.lang.Class cls2 = defpackage.apxh.a;
        try {
            java.lang.Class cls3 = c;
            cls3.getMethod("peekLong", cls, java.lang.Boolean.TYPE);
            cls3.getMethod("pokeLong", cls, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls3.getMethod("pokeInt", cls, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            cls3.getMethod("peekInt", cls, java.lang.Boolean.TYPE);
            cls3.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            java.lang.Class cls5 = java.lang.Integer.TYPE;
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static boolean q(java.lang.Object obj, long j) {
        return e.f(obj, j);
    }

    public static boolean r(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean s(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static void t(java.lang.Class cls) {
        if (f) {
            e.a.arrayIndexScale(cls);
        }
    }

    private static void u(java.lang.Class cls) {
        if (f) {
            e.a.arrayBaseOffset(cls);
        }
    }
}
