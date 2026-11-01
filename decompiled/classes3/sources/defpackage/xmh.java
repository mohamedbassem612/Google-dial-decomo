package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmh extends ems {
    public static final /* synthetic */ int b = 0;
    private static final xtq f;
    private final emy c;
    private final java.lang.ref.WeakReference d;
    private final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        int i = defpackage.xox.a;
        f = new xtq("OnboardingTaskLifecycle", (byte[]) null);
    }

    public xmh(emx emxVar) {
        this.c = new emy(emxVar, true);
        this.d = new java.lang.ref.WeakReference(emxVar);
    }

    private final void f(java.lang.String str, aonj aonjVar) {
        if (this.e.post(new defpackage.xmg(this.c, this.d, aonjVar))) {
            return;
        }
        defpackage.xox.e((java.lang.String) f.a, "Failed to post registry runnable: ".concat(str));
    }

    public final emq a() {
        return this.c.d;
    }

    public final void c(emw emwVar) {
        aooh.f(emwVar, "observer");
        f("addObserver", new tge(emwVar, 19));
    }

    public final void d(emw emwVar) {
        aooh.f(emwVar, "observer");
        f("removeObserver", new tge(emwVar, 20));
    }

    public final void e(emp empVar) {
        aooh.f(empVar, "event");
        f("handleLifecycleEvent(" + empVar + ')', new defpackage.xms(empVar, 1));
    }
}
