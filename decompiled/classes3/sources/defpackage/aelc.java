package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelc implements defpackage.xvb {
    final /* synthetic */ defpackage.agpx a;
    private final defpackage.aelb b;
    private ajcq c;
    private final int d;

    public aelc(defpackage.agpx agpxVar, defpackage.aelb aelbVar, int i) {
        j$.util.Objects.requireNonNull(agpxVar);
        this.a = agpxVar;
        this.b = aelbVar;
        this.d = i;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return android.graphics.Bitmap.class;
    }

    @Override // defpackage.xvb
    public final void d() {
        ajcq ajcqVar = this.c;
        if (ajcqVar != null) {
            ajcqVar.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aemh, java.lang.Object] */
    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        ajcq ajcqVarG = this.a.a.g(this.b.b.a, this.d);
        this.c = ajcqVarG;
        ahvr.J(ajcqVarG, new defpackage.uwo(this, xvaVar, 12), ajbm.a);
    }

    @Override // defpackage.xvb
    public final void e() {
    }
}
