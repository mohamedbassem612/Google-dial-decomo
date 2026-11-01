package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxz implements defpackage.gxx {
    public final defpackage.gfy a;
    public final defpackage.gfj b = new defpackage.gxy();

    public gxz(defpackage.gfy gfyVar) {
        this.a = gfyVar;
    }

    @Override // defpackage.gxx
    public final java.util.List a(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        return (java.util.List) defpackage.dez.m(this.a, true, false, new defpackage.gxp(str, 10, (char[][]) null));
    }

    @Override // defpackage.gxx
    public final void b(java.lang.String str) {
        defpackage.aooh.f(str, "id");
        defpackage.dez.m(this.a, false, true, new defpackage.gxp(str, 9, (byte[][]) null));
    }

    @Override // defpackage.gxx
    public final /* synthetic */ void c(java.lang.String str, java.util.Set set) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.dez.m(this.a, false, true, new defpackage.gxp(this, new defpackage.rsr((java.lang.String) it.next(), str), 11));
        }
    }
}
