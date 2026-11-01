package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bda extends defpackage.cmv implements defpackage.dat {
    public defpackage.bdu a;

    public bda(defpackage.bdu bduVar) {
        this.a = bduVar;
    }

    @Override // defpackage.cmv
    public final void dc() {
        this.a.b = this;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bda) && defpackage.aooh.n(this.a, ((defpackage.bda) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        java.util.List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.bfe bfeVar = (defpackage.bfe) list.get(i);
            defpackage.cso csoVarE = bfeVar.e();
            if (csoVarE != null) {
                long jC = bfeVar.c() >> 32;
                long jC2 = bfeVar.c() & 4294967295L;
                long j = csoVarE.j;
                float f = ((int) jC) - ((int) (j >> 32));
                float f2 = ((int) jC2) - ((int) (j & 4294967295L));
                dbmVar.q().c.r(f, f2);
                float f3 = -f;
                float f4 = -f2;
                try {
                    defpackage.den.H(dbmVar, csoVarE);
                    dbmVar.q().c.r(f3, f4);
                } catch (java.lang.Throwable th) {
                    dbmVar.q().c.r(f3, f4);
                    throw th;
                }
            }
        }
        dbmVar.D();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }

    @Override // defpackage.cmv
    public final void u() {
        this.a.b();
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
