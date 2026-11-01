package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxc implements defpackage.gwz {
    public final defpackage.gfy a;
    public final defpackage.gfj b = new defpackage.gxb();

    public gxc(defpackage.gfy gfyVar) {
        this.a = gfyVar;
    }

    @Override // defpackage.gwz
    public final /* synthetic */ defpackage.gwy a(defpackage.gxd gxdVar) {
        java.lang.String str = gxdVar.a;
        if (str == null) {
            defpackage.aooh.i("workSpecId");
        }
        return (defpackage.gwy) defpackage.dez.m(this.a, true, false, new defpackage.gxa(str, gxdVar.b, 0));
    }

    @Override // defpackage.gwz
    public final java.util.List b() {
        return (java.util.List) defpackage.dez.m(this.a, true, false, new defpackage.ddz(19));
    }

    @Override // defpackage.gwz
    public final void c(defpackage.gwy gwyVar) {
        defpackage.dez.m(this.a, false, true, new defpackage.bet(this, gwyVar, 14, null));
    }

    @Override // defpackage.gwz
    public final void d(java.lang.String str) {
        defpackage.aooh.f(str, "workSpecId");
        defpackage.dez.m(this.a, false, true, new defpackage.bet(str, 15, (char[]) null));
    }
}
