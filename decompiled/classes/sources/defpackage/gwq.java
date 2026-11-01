package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwq implements defpackage.gwn {
    public final defpackage.gfj a = new defpackage.gwp();
    private final defpackage.gfy b;

    public gwq(defpackage.gfy gfyVar) {
        this.b = gfyVar;
    }

    @Override // defpackage.gwn
    public final java.util.List a(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return (java.util.List) defpackage.dez.m(this.b, true, false, new defpackage.bet(str, 11));
    }

    @Override // defpackage.gwn
    public final boolean b(java.lang.String str) {
        defpackage.aooh.f(str, "id");
        return ((java.lang.Boolean) defpackage.dez.m(this.b, true, false, new gwo(str, 0))).booleanValue();
    }

    @Override // defpackage.gwn
    public final void c(defpackage.ils ilsVar) {
        defpackage.dez.m(this.b, false, true, new defpackage.dpz(this, ilsVar, 20));
    }
}
