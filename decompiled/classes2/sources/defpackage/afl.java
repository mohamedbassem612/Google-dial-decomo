package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afl {
    public aii a;
    public boolean d;
    public java.util.List h;
    public long b = 9205357640488583168L;
    public long c = 9205357640488583168L;
    public long e = 9205357640488583168L;
    public long f = 9205357640488583168L;
    public final ccp g = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
    public long i = 0;

    public final cpn a() {
        long j = this.f;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L || j == 9205357640488583168L) {
            return null;
        }
        return cdh.x(j2, j);
    }

    public final cpn b() {
        if (c()) {
            return null;
        }
        return (cpn) this.g.a();
    }

    public final boolean c() {
        if (this.d) {
            return false;
        }
        aii aiiVar = this.a;
        return aiiVar == null || !aiiVar.k();
    }
}
