package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class irq implements defpackage.ysg {
    private final defpackage.jbm a;
    private final defpackage.kpa b;
    private final defpackage.iqm c;

    public irq(defpackage.jbm jbmVar, defpackage.kpa kpaVar, defpackage.iqm iqmVar) {
        defpackage.aooh.f(jbmVar, "beeslySettings");
        defpackage.aooh.f(kpaVar, "callNotesConfiguration");
        this.a = jbmVar;
        this.b = kpaVar;
        this.c = iqmVar;
    }

    @Override // defpackage.ysg
    public final int a() {
        return 208;
    }

    @Override // defpackage.ysg
    public final long b() {
        return this.b.d;
    }

    @Override // defpackage.ysg
    public final long c() {
        return this.b.e;
    }

    @Override // defpackage.ysg
    public final /* synthetic */ java.lang.Integer d() {
        return null;
    }

    @Override // defpackage.ysg
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        return this.c.c() ? this.a.g(aolnVar) : java.lang.Boolean.FALSE;
    }

    @Override // defpackage.ysg
    public final /* synthetic */ void f() {
    }
}
