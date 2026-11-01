package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajq implements defpackage.ajm {
    private final int a;
    private final ajh b;
    private final long c;
    private final long d;

    public ajq(int i, int i2, ajh ajhVar) {
        this.a = i;
        this.b = ajhVar;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    public final /* synthetic */ defpackage.alp a(nf nfVar) {
        return new defpackage.alu(this);
    }

    @Override // defpackage.ajm
    public final /* synthetic */ float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.ajm
    public final float c(long j, float f, float f2, float f3) {
        float f4;
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            long j2 = j - this.d;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = this.c;
            if (j2 > j3) {
                j2 = j3;
            }
            f4 = j2 / j3;
        }
        float fA = this.b.a(f4);
        return (f * (1.0f - fA)) + (f2 * fA);
    }

    @Override // defpackage.ajm
    public final float d(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (c(j2, f, f2, f3) - c((-1000000) + j2, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.ajm
    public final long e(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
