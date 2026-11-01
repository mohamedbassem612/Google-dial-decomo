package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gvt implements defpackage.gvw {
    public final defpackage.gwf a;

    public gvt(defpackage.gwf gwfVar) {
        this.a = gwfVar;
    }

    @Override // defpackage.gvw
    public final defpackage.aoxh a(defpackage.grn grnVar) {
        defpackage.aooh.f(grnVar, "constraints");
        return new defpackage.aoxa(new dqx(this, (defpackage.aoln) null, 2));
    }

    @Override // defpackage.gvw
    public final boolean c(defpackage.gxl gxlVar) {
        return b(gxlVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(java.lang.Object obj) {
        throw null;
    }
}
