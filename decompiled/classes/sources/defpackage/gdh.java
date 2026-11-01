package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdh implements defpackage.gdg, defpackage.aoss, defpackage.aowv {
    private final /* synthetic */ defpackage.aoss a;
    private final defpackage.aowv b;

    public gdh(defpackage.aoss aossVar, defpackage.aowv aowvVar) {
        if (aossVar == null) {
            defpackage.aooh.i("scope");
        }
        this.a = aossVar;
        this.b = aowvVar;
    }

    @Override // defpackage.aowv
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.b.a(obj, aolnVar);
    }

    @Override // defpackage.aowv
    public final java.lang.Object b(java.lang.Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.aoss
    public final defpackage.aolr c() {
        return this.a.c();
    }

    @Override // defpackage.aowv
    public final void d(defpackage.aonj aonjVar) {
        throw null;
    }

    @Override // defpackage.aowv
    public final boolean e(java.lang.Throwable th) {
        return this.b.e(null);
    }

    @Override // defpackage.aowv
    public final boolean f() {
        throw null;
    }
}
