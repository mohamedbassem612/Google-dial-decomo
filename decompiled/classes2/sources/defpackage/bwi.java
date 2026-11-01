package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bwi implements defpackage.drr {
    public final int a;
    private final int b;
    private final long c;

    public bwi(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // defpackage.drr
    public final long a(dpo dpoVar, long j, dpq dpqVar, long j2) {
        int i = this.a;
        if (a.x(i, 3)) {
            return c(dpoVar, j2, this.c);
        }
        if (a.x(i, 4)) {
            return d(dpoVar, j2, this.c);
        }
        if (a.x(i, 1)) {
            return b(dpoVar, j2, this.c);
        }
        if (!a.x(i, 2)) {
            if (a.x(i, 5)) {
                long j3 = this.c;
                return dpqVar == dpq.a ? c(dpoVar, j2, j3) : d(dpoVar, j2, j3);
            }
            boolean zX = a.x(i, 6);
            long j4 = this.c;
            if (zX) {
                return dpqVar == dpq.a ? d(dpoVar, j2, j4) : c(dpoVar, j2, j4);
            }
            return b(dpoVar, j2, j4);
        }
        long j5 = this.c;
        int i2 = (int) (j2 >> 32);
        int iW = aooc.w(dpoVar.b + ((dpoVar.b() - i2) / 2), 0, java.lang.Math.max(0, ((int) (j5 >> 32)) - i2));
        int i3 = dpoVar.e;
        int i4 = this.b;
        int i5 = i3 + i4;
        int i6 = (int) (j2 & 4294967295L);
        int i7 = (int) (j5 & 4294967295L);
        if (i5 + i6 > i7) {
            i5 = (dpoVar.c - i6) - i4;
        }
        return (((long) aooc.w(i5, 0, java.lang.Math.max(0, i7 - i6))) & 4294967295L) | (((long) iW) << 32);
    }

    public final long b(dpo dpoVar, long j, long j2) {
        int i = (int) (j >> 32);
        int iW = aooc.w(dpoVar.b + ((dpoVar.b() - i) / 2), 0, java.lang.Math.max(0, ((int) (j2 >> 32)) - i));
        int i2 = (int) (j & 4294967295L);
        int i3 = dpoVar.c - i2;
        int i4 = this.b;
        int i5 = i3 - i4;
        if (i5 < 0) {
            i5 = dpoVar.e + i4;
        }
        return (((long) iW) << 32) | (((long) aooc.w(i5, 0, java.lang.Math.max(0, ((int) (j2 & 4294967295L)) - i2))) & 4294967295L);
    }

    public final long c(dpo dpoVar, long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = this.b;
        int i3 = dpoVar.b - (i + i2);
        if (i3 < 0) {
            i3 = dpoVar.d + i2;
        }
        int iW = aooc.w(i3, 0, java.lang.Math.max(0, ((int) (j2 >> 32)) - i));
        int i4 = dpoVar.c + dpoVar.e;
        int i5 = (int) (j & 4294967295L);
        return (((long) iW) << 32) | (((long) aooc.w((i4 - i5) / 2, 0, java.lang.Math.max(0, ((int) (j2 & 4294967295L)) - i5))) & 4294967295L);
    }

    public final long d(dpo dpoVar, long j, long j2) {
        int i = dpoVar.d;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        int i4 = i + i3;
        int i5 = (int) (j2 >> 32);
        if (i4 + i2 > i5) {
            i4 = dpoVar.b - (i3 + i2);
        }
        int iW = aooc.w(i4, 0, java.lang.Math.max(0, i5 - i2));
        int i6 = dpoVar.c + dpoVar.e;
        int i7 = (int) (j & 4294967295L);
        return (((long) iW) << 32) | (((long) aooc.w((i6 - i7) / 2, 0, java.lang.Math.max(0, ((int) (j2 & 4294967295L)) - i7))) & 4294967295L);
    }
}
