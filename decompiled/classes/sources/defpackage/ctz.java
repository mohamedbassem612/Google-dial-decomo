package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctz extends defpackage.css {
    public final defpackage.ccp a;
    public final defpackage.ccp b;
    public final defpackage.ctu c;
    public final defpackage.ccp d;
    private float e;
    private defpackage.cqh f;

    public ctz(defpackage.csv csvVar, defpackage.jxt jxtVar) {
        defpackage.cpp cppVar = new defpackage.cpp(0L);
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(cppVar, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
        defpackage.ctu ctuVar = new defpackage.ctu(csvVar, jxtVar);
        ctuVar.d = new bup(this, 11);
        this.c = ctuVar;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.aojh.a, defpackage.cdu.b);
        this.e = 1.0f;
    }

    @Override // defpackage.css
    public final long a() {
        return ((defpackage.cpp) this.a.a()).a;
    }

    @Override // defpackage.css
    protected final void b(defpackage.csj csjVar) {
        defpackage.ctu ctuVar = this.c;
        defpackage.cqh cqhVarD = this.f;
        if (cqhVarD == null) {
            cqhVarD = ctuVar.d();
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue() && csjVar.p() == defpackage.dpq.b) {
            long jN = csjVar.n();
            defpackage.csg csgVarQ = csjVar.q();
            long jA = csgVarQ.a();
            csgVarQ.b().g();
            try {
                csgVarQ.c.q(-1.0f, 1.0f, jN);
                ctuVar.g(csjVar, this.e, cqhVarD);
                csgVarQ.b().e();
                csgVarQ.h(jA);
            } catch (java.lang.Throwable th) {
                csgVarQ.b().e();
                csgVarQ.h(jA);
                throw th;
            }
        } else {
            ctuVar.g(csjVar, this.e, cqhVarD);
        }
        this.d.a();
    }

    @Override // defpackage.css
    protected final void c(float f) {
        this.e = f;
    }

    @Override // defpackage.css
    protected final void d(defpackage.cqh cqhVar) {
        this.f = cqhVar;
    }

    public ctz() {
        this(new defpackage.csv(), null);
    }
}
