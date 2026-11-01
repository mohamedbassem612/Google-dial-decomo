package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cxw implements defpackage.czn {
    final /* synthetic */ cxy a;
    final /* synthetic */ java.lang.Object b;
    private final acq c;

    public cxw(cxy cxyVar, java.lang.Object obj) {
        this.a = cxyVar;
        this.b = obj;
        int[] iArr = acr.a;
        this.c = new acq(6);
    }

    @Override // defpackage.czn
    public final int a() {
        dbk dbkVar = (dbk) this.a.n.a(this.b);
        if (dbkVar != null) {
            return dbkVar.u().size();
        }
        return 0;
    }

    @Override // defpackage.czn
    public final long b(int i) {
        dbk dbkVar = (dbk) this.a.n.a(this.b);
        if (dbkVar != null && dbkVar.al()) {
            int size = dbkVar.u().size();
            if (i < 0 || i >= size) {
                cwh.e(a.bv((byte) 41, size, i, "Index (", ") is out of bound of [0, "));
            }
            if (this.c.a(i)) {
                int iG = ((dbk) dbkVar.u().get(i)).g();
                int iE = ((dbk) dbkVar.u().get(i)).e();
                return (((long) iG) << 32) | (((long) iE) & 4294967295L);
            }
        }
        return 0L;
    }

    @Override // defpackage.czn
    public final void c() {
        this.a.i(this.b);
    }

    @Override // defpackage.czn
    public final void d(int i, long j) {
        cxy cxyVar = this.a;
        dbk dbkVar = (dbk) cxyVar.n.a(this.b);
        if (dbkVar == null || !dbkVar.al()) {
            return;
        }
        int size = dbkVar.u().size();
        if (i < 0 || i >= size) {
            cwh.e(a.bv((byte) 41, size, i, "Index (", ") is out of bound of [0, "));
        }
        if (dbkVar.am()) {
            cwh.c("Pre-measure called on node that is not placed");
        }
        dbk dbkVar2 = cxyVar.a;
        dbkVar2.n = true;
        dbn.a(dbkVar).x((dbk) dbkVar.u().get(i), j);
        dbkVar2.n = false;
        this.c.d(i);
    }

    @Override // defpackage.czn
    public final void e(aonj aonjVar) {
        dce dceVar;
        dbk dbkVar = (dbk) this.a.n.a(this.b);
        cmv cmvVar = null;
        if (dbkVar != null && (dceVar = dbkVar.v) != null) {
            cmvVar = dceVar.f;
        }
        if (cmvVar == null || !cmvVar.D) {
            return;
        }
        den.q(cmvVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", aonjVar);
    }
}
