package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eit {
    static final boolean a;
    private static final sun.misc.Unsafe b;
    private static final java.lang.Class c;
    private static final boolean d;
    private static final defpackage.eis e;
    private static final boolean f;

    static {
        sun.misc.Unsafe unsafeH = h();
        b = unsafeH;
        c = defpackage.egd.a;
        boolean zR = r(java.lang.Long.TYPE);
        d = zR;
        boolean zR2 = r(java.lang.Integer.TYPE);
        defpackage.eiq eirVar = null;
        if (unsafeH != null) {
            if (!defpackage.egd.a()) {
                eirVar = new eir(unsafeH);
            } else if (zR) {
                eirVar = new defpackage.eiq(unsafeH);
            } else if (zR2) {
                eirVar = new eip(unsafeH);
            }
        }
        e = eirVar;
        if (eirVar != null) {
            eirVar.g();
        }
        f = eirVar == null ? false : eirVar.h();
        w(byte[].class);
        w(boolean[].class);
        v(boolean[].class);
        w(int[].class);
        v(int[].class);
        w(long[].class);
        v(long[].class);
        w(float[].class);
        v(float[].class);
        w(double[].class);
        v(double[].class);
        w(java.lang.Object[].class);
        v(java.lang.Object[].class);
        java.lang.reflect.Field fieldG = g();
        if (fieldG != null && eirVar != null) {
            eirVar.a.objectFieldOffset(fieldG);
        }
        a = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    private eit() {
    }

    static double a(java.lang.Object obj, long j) {
        return e.a(obj, j);
    }

    static float b(java.lang.Object obj, long j) {
        return e.b(obj, j);
    }

    static int c(java.lang.Object obj, long j) {
        return e.i(obj, j);
    }

    static long d(java.lang.Object obj, long j) {
        return e.j(obj, j);
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

    public static java.lang.reflect.Field g() {
        java.lang.reflect.Field fieldA;
        if (defpackage.egd.a() && (fieldA = defpackage.anty.A(java.nio.Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldA;
        }
        java.lang.reflect.Field fieldA2 = defpackage.anty.A(java.nio.Buffer.class, "address");
        if (fieldA2 == null || fieldA2.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return fieldA2;
    }

    static sun.misc.Unsafe h() {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.alck(1));
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
            java.util.logging.Logger.getLogger(defpackage.eit.class.getName()).log(java.util.logging.Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void i(java.lang.Throwable th) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.eit.class.getName());
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        java.util.Objects.toString(th);
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(java.lang.Object obj, long j, boolean z) {
        e.c(obj, j, z);
    }

    public static void k(java.lang.Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        o(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    public static void l(java.lang.Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        o(obj, j2, (c(obj, j2) & (~(255 << i))) | (b2 << i));
    }

    static void m(java.lang.Object obj, long j, double d2) {
        e.d(obj, j, d2);
    }

    static void n(java.lang.Object obj, long j, float f2) {
        e.e(obj, j, f2);
    }

    static void o(java.lang.Object obj, long j, int i) {
        e.k(obj, j, i);
    }

    static void p(java.lang.Object obj, long j, long j2) {
        e.l(obj, j, j2);
    }

    public static void q(java.lang.Object obj, long j, java.lang.Object obj2) {
        e.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean r(java.lang.Class cls) {
        if (!defpackage.egd.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = c;
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

    static boolean s(java.lang.Object obj, long j) {
        return e.f(obj, j);
    }

    public static boolean t(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(java.lang.Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static void v(java.lang.Class cls) {
        if (f) {
            e.a.arrayIndexScale(cls);
        }
    }

    private static void w(java.lang.Class cls) {
        if (f) {
            e.a.arrayBaseOffset(cls);
        }
    }
}
