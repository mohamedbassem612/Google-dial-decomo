package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipx extends defpackage.aipo {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final java.util.concurrent.atomic.AtomicReference d;
    private static final java.util.concurrent.atomic.AtomicLong e;
    private static final j$.util.concurrent.ConcurrentLinkedQueue f;
    private volatile defpackage.aion g;

    static {
        a = android.os.Build.FINGERPRINT == null || "robolectric".equals(android.os.Build.FINGERPRINT);
        b = "goldfish".equals(android.os.Build.HARDWARE) || "ranchu".equals(android.os.Build.HARDWARE);
        c = "eng".equals(android.os.Build.TYPE) || "userdebug".equals(android.os.Build.TYPE);
        d = new java.util.concurrent.atomic.AtomicReference();
        e = new java.util.concurrent.atomic.AtomicLong();
        f = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    public aipx(java.lang.String str) {
        defpackage.aion aionVarA;
        super(str);
        if (a || b) {
            this.g = new aipp().a(d());
            return;
        }
        if (c) {
            defpackage.aipz aipzVar = defpackage.aiqb.c;
            aionVarA = new defpackage.aipz(aipzVar.a, aipzVar.b, aipzVar.f, java.util.logging.Level.OFF, aipzVar.d, aipzVar.e).a(d());
        } else {
            aionVarA = null;
        }
        this.g = aionVarA;
    }

    public static void e() {
        while (true) {
            defpackage.aipx aipxVar = (defpackage.aipx) defpackage.aipw.a.poll();
            if (aipxVar == null) {
                f();
                return;
            }
            aipxVar.g = ((defpackage.aipq) d.get()).a(aipxVar.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [aiom, java.lang.Object] */
    private static void f() {
        while (true) {
            defpackage.apni apniVar = (defpackage.apni) f.poll();
            if (apniVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = apniVar.a;
            java.lang.Object obj = apniVar.b;
            if (!r1.U()) {
                if (((defpackage.aion) obj).b(r1.r())) {
                }
            }
            ((defpackage.aion) obj).a(r1);
        }
    }

    @Override // defpackage.aion
    public final void a(defpackage.aiom aiomVar) {
        if (this.g != null) {
            this.g.a(aiomVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            android.util.Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new defpackage.apni(this, aiomVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.aion
    public final boolean b(java.util.logging.Level level) {
        return this.g == null || this.g.b(level);
    }

    @Override // defpackage.aipo, defpackage.aion
    public final void c(java.lang.RuntimeException runtimeException, defpackage.aiom aiomVar) {
        if (this.g != null) {
            this.g.c(runtimeException, aiomVar);
        } else {
            android.util.Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
