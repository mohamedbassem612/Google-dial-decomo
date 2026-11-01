package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aip {
    public final long a;
    public final ccp b;
    public aiw c;
    public long d;
    public long e;
    public final nf f;
    private final aomy g;
    private final ccp h;

    public aip(java.lang.Object obj, nf nfVar, aiw aiwVar, long j, long j2, aomy aomyVar) {
        this.f = nfVar;
        this.a = j2;
        this.g = aomyVar;
        cdu cduVar = cdu.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.c = den.bq(aiwVar);
        this.d = j;
        this.e = Long.MIN_VALUE;
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cduVar);
    }

    public final java.lang.Object a() {
        return this.b.a();
    }

    public final void b() {
        d();
        this.g.a();
    }

    public final boolean c() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }

    public final void d() {
        this.h.b(java.lang.Boolean.FALSE);
    }
}
