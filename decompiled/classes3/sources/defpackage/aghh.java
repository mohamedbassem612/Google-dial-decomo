package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghh implements eoe {
    private final android.content.Context a;

    static {
        new xtq("SetupProgressViewModelFactory", (byte[]) null);
    }

    public aghh(android.content.Context context) {
        this.a = context;
    }

    public final eoa a(java.lang.Class cls) {
        aooh.f(cls, "modelClass");
        if (!cls.isAssignableFrom(defpackage.aghg.class)) {
            throw new java.lang.IllegalArgumentException("Unknown ViewModel class: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        android.content.Context applicationContext = this.a.getApplicationContext();
        aooh.e(applicationContext, "getApplicationContext(...)");
        return new defpackage.aghg(applicationContext);
    }

    public final eoa b(java.lang.Class cls, eoq eoqVar) {
        aooh.f(cls, "modelClass");
        if (!cls.isAssignableFrom(defpackage.aghg.class)) {
            throw new java.lang.IllegalArgumentException("Unknown ViewModel class: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        android.content.Context applicationContext = this.a.getApplicationContext();
        aooh.e(applicationContext, "getApplicationContext(...)");
        return new defpackage.aghg(applicationContext);
    }

    public final /* synthetic */ eoa c(aopu aopuVar, eoq eoqVar) {
        return enn.c(this, aopuVar, eoqVar);
    }
}
