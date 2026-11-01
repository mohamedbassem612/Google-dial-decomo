package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hhx {
    public android.app.Activity a;
    public defpackage.ahgd b;
    private final him c;
    private final hkr d;
    private final hkf e;

    public hhx(him himVar, hkr hkrVar, hkf hkfVar) {
        this.c = himVar;
        this.d = hkrVar;
        this.e = hkfVar;
    }

    static /* synthetic */ java.lang.String b(java.lang.Object obj, java.lang.Class cls, java.lang.String str) {
        return str + cls.toString() + ", but the wrapper available is of type: " + java.lang.String.valueOf(obj.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    static /* synthetic */ java.lang.String c(defpackage.az azVar, java.lang.Class cls) {
        java.lang.Class<?> cls2 = azVar.getClass();
        return "Attempt to inject a Activity wrapper of type " + cls.toString() + ", but the wrapper available is of type: " + java.lang.String.valueOf(cls2) + ". Does your peer's @Inject constructor reference the wrong wrapper class?";
    }

    public final hke a() {
        return new hke(this.d);
    }
}
