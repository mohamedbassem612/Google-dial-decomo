package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajah extends defpackage.ajad {
    static final sun.misc.Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        sun.misc.Unsafe unsafeI;
        try {
            try {
                unsafeI = sun.misc.Unsafe.getUnsafe();
            } catch (java.lang.SecurityException unused) {
                try {
                    unsafeI = (sun.misc.Unsafe) java.lang.Class.forName("java.security.AccessController").getMethod("doPrivileged", java.security.PrivilegedExceptionAction.class).invoke(null, new defpackage.ajag());
                } catch (java.lang.Exception unused2) {
                    unsafeI = defpackage.a.i();
                }
            }
            try {
                c = unsafeI.objectFieldOffset(defpackage.ajaj.class.getDeclaredField("waitersField"));
                b = unsafeI.objectFieldOffset(defpackage.ajaj.class.getDeclaredField("listenersField"));
                d = unsafeI.objectFieldOffset(defpackage.ajaj.class.getDeclaredField("valueField"));
                e = unsafeI.objectFieldOffset(defpackage.ajai.class.getDeclaredField("thread"));
                f = unsafeI.objectFieldOffset(defpackage.ajai.class.getDeclaredField("next"));
                a = unsafeI;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException("Could not initialize intrinsics", e3);
        }
    }

    @Override // defpackage.ajad
    public final defpackage.aizz a(defpackage.ajaj ajajVar, defpackage.aizz aizzVar) {
        defpackage.aizz aizzVar2;
        do {
            aizzVar2 = ajajVar.listenersField;
            if (aizzVar == aizzVar2) {
                break;
            }
        } while (!e(ajajVar, aizzVar2, aizzVar));
        return aizzVar2;
    }

    @Override // defpackage.ajad
    public final defpackage.ajai b(defpackage.ajaj ajajVar, defpackage.ajai ajaiVar) {
        defpackage.ajai ajaiVar2;
        do {
            ajaiVar2 = ajajVar.waitersField;
            if (ajaiVar == ajaiVar2) {
                break;
            }
        } while (!g(ajajVar, ajaiVar2, ajaiVar));
        return ajaiVar2;
    }

    @Override // defpackage.ajad
    public final void c(defpackage.ajai ajaiVar, defpackage.ajai ajaiVar2) {
        a.putObject(ajaiVar, f, ajaiVar2);
    }

    @Override // defpackage.ajad
    public final void d(defpackage.ajai ajaiVar, java.lang.Thread thread) {
        a.putObject(ajaiVar, e, thread);
    }

    @Override // defpackage.ajad
    public final boolean e(defpackage.ajaj ajajVar, defpackage.aizz aizzVar, defpackage.aizz aizzVar2) {
        return defpackage.ajaf.a(a, ajajVar, b, aizzVar, aizzVar2);
    }

    @Override // defpackage.ajad
    public final boolean f(defpackage.ajaj ajajVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.ajaf.a(a, ajajVar, d, obj, obj2);
    }

    @Override // defpackage.ajad
    public final boolean g(defpackage.ajaj ajajVar, defpackage.ajai ajaiVar, defpackage.ajai ajaiVar2) {
        return defpackage.ajaf.a(a, ajajVar, c, ajaiVar, ajaiVar2);
    }
}
