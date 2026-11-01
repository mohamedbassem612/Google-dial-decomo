package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class alaa extends defpackage.alad implements defpackage.alab {
    public defpackage.akzs n = defpackage.akzs.a;

    public final defpackage.akzs b() {
        defpackage.akzs akzsVar = this.n;
        if (akzsVar.c) {
            this.n = akzsVar.clone();
        }
        return this.n;
    }

    @Override // defpackage.alab
    public final java.lang.Object bT(defpackage.apdi apdiVar) {
        c(apdiVar);
        java.lang.Object objJ = this.n.j((defpackage.alac) apdiVar.a);
        if (objJ == null) {
            return apdiVar.b;
        }
        apdiVar.c(objJ);
        return objJ;
    }

    @Override // defpackage.alab
    public final boolean bU(defpackage.apdi apdiVar) {
        c(apdiVar);
        return this.n.l((defpackage.alac) apdiVar.a);
    }

    public final void c(defpackage.apdi apdiVar) {
        if (apdiVar.d != t()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
