package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hiv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public hiv() {
        this.b = new aogy((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = new aogy((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.c = new defpackage.m[32];
    }

    public final defpackage.hkl a() {
        aooc.an(this.c, java.lang.Boolean.class);
        return new defpackage.hkl((defpackage.him) this.a, (defpackage.hii) this.b);
    }

    public final void b() {
        this.c = java.lang.Boolean.FALSE;
    }

    public final void c(defpackage.gqd gqdVar) {
        this.c = gqdVar;
        new defpackage.gra(this, gqdVar, 0).run();
    }

    public final void d(emp empVar) {
        java.lang.Object obj = this.c;
        if (obj != null) {
            ((defpackage.eny) obj).run();
        }
        defpackage.eny enyVar = new defpackage.eny((emy) this.a, empVar);
        this.c = enyVar;
        ((android.os.Handler) this.b).postAtFrontOfQueue(enyVar);
    }

    public hiv(android.app.Activity activity, dxw dxwVar) {
        this.b = activity;
        this.a = dxwVar;
    }

    public hiv(defpackage.him himVar, defpackage.hii hiiVar) {
        this.a = himVar;
        this.b = hiiVar;
    }

    public hiv(emx emxVar) {
        this.a = new emy(emxVar, true);
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
    }
}
