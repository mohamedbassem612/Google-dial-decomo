package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class czy extends dac {
    public dae a;

    public czy(dae daeVar) {
        this.a = daeVar;
    }

    public final java.lang.Object a(defpackage.oq oqVar) {
        if (oqVar != this.a.e()) {
            cwh.d("Check failed.");
        }
        return this.a.d();
    }

    public final void b(defpackage.oq oqVar, java.lang.Object obj) {
        throw new java.lang.IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final boolean c(defpackage.oq oqVar) {
        return oqVar == this.a.e();
    }
}
