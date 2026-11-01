package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxg implements defpackage.gxe {
    public final defpackage.gfj a = new defpackage.gxf();
    private final defpackage.gfy b;

    public gxg(defpackage.gfy gfyVar) {
        this.b = gfyVar;
    }

    @Override // defpackage.gxe
    public final java.util.List a(java.lang.String str) {
        defpackage.aooh.f(str, "workSpecId");
        return (java.util.List) defpackage.dez.m(this.b, true, false, new gwo(str, 4, (char[]) null));
    }

    @Override // defpackage.gxe
    public final void b(defpackage.rsr rsrVar) {
        defpackage.dez.m(this.b, false, true, new defpackage.bet(this, rsrVar, 16, null));
    }
}
