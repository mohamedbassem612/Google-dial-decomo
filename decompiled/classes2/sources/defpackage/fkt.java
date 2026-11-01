package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fkt implements defpackage.fma {
    public final defpackage.fkw a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public fkt(defpackage.fkw fkwVar, long j, long j2, long j3, long j4, long j5) {
        this.a = fkwVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.fmb fmbVar = new defpackage.fmb(j, defpackage.fkv.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new defpackage.fly(fmbVar, fmbVar);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }
}
