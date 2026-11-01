package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqw extends defpackage.cqx {
    public final defpackage.cpo a;
    public final defpackage.cpx b;

    public cqw(defpackage.cpo cpoVar) {
        this.a = cpoVar;
        defpackage.cpx cpxVar = null;
        if (!defpackage.cdh.u(cpoVar)) {
            defpackage.cpx cpxVar2 = new defpackage.cpx((byte[]) null);
            cpxVar2.q(cpoVar, 1);
            cpxVar = cpxVar2;
        }
        this.b = cpxVar;
    }

    @Override // defpackage.cqx
    public final defpackage.cpn a() {
        defpackage.cpo cpoVar = this.a;
        return new defpackage.cpn(cpoVar.a, cpoVar.b, cpoVar.c, cpoVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cqw) && defpackage.aooh.n(this.a, ((defpackage.cqw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
