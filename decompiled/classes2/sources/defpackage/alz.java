package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alz implements defpackage.alp {
    private final int a;
    private final defpackage.als b;
    private final long c;
    private final long d;
    private final int e;

    public alz(int i, defpackage.als alsVar, int i2, long j) {
        this.a = i;
        this.b = alsVar;
        this.e = i2;
        this.c = ((long) (alsVar.f() + alsVar.g())) * 1000000;
        this.d = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long jMin = java.lang.Math.min(j2 / j3, ((long) this.a) - 1);
        if (this.e != 1 && jMin % 2 != 0) {
            return ((jMin + 1) * j3) - j2;
        }
        java.lang.Long.signum(jMin);
        return j2 - (jMin * j3);
    }

    private final aiw g(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? d(j4 - j2, aiwVar, aiwVar2, aiwVar3) : aiwVar2;
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return (((long) this.a) * this.c) - this.d;
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(a(aiwVar, aiwVar2, aiwVar3), aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.b.c(f(j), aiwVar, aiwVar2, g(j, aiwVar, aiwVar3, aiwVar2));
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.b.d(f(j), aiwVar, aiwVar2, g(j, aiwVar, aiwVar3, aiwVar2));
    }

    @Override // defpackage.alp
    public final /* synthetic */ boolean e() {
        return false;
    }
}
