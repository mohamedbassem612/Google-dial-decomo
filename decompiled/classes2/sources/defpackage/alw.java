package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alw implements defpackage.alp {
    private final defpackage.als a;
    private final long b;
    private final long c;
    private final int d;

    public alw(defpackage.als alsVar, int i, long j) {
        this.a = alsVar;
        this.d = i;
        this.b = ((long) (alsVar.f() + alsVar.g())) * 1000000;
        this.c = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.c;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.b;
        long j4 = j2 / j3;
        if (this.d != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        java.lang.Long.signum(j4);
        return j2 - (j4 * j3);
    }

    private final aiw g(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? this.a.d(j4 - j2, aiwVar, aiwVar3, aiwVar2) : aiwVar2;
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(Long.MAX_VALUE, aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.c(f(j), aiwVar, aiwVar2, g(j, aiwVar, aiwVar3, aiwVar2));
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.d(f(j), aiwVar, aiwVar2, g(j, aiwVar, aiwVar3, aiwVar2));
    }

    @Override // defpackage.alp
    public final boolean e() {
        return true;
    }
}
