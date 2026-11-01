package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqg implements defpackage.fmi {
    private final long a;
    private final defpackage.fqh[] b;
    private final int c;

    public fqg(long j, defpackage.fqh[] fqhVarArr, int i) {
        this.a = j;
        this.b = fqhVarArr;
        this.c = i;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        return e(j, -1);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074 A[SYNTHETIC] */
    @Override // defpackage.fmi
    public final defpackage.fly e(long j, int i) {
        int i2;
        long j2;
        long j3;
        long j4;
        long jI;
        long jI2;
        defpackage.fmb fmbVar;
        defpackage.fly flyVar;
        int i3;
        defpackage.fqq fqqVar;
        int iB;
        defpackage.fqh[] fqhVarArr = this.b;
        if (fqhVarArr.length != 0) {
            int i4 = i;
            if (i4 != -1) {
                i2 = i4;
            } else {
                i4 = this.c;
                i2 = -1;
            }
            if (i4 != -1) {
                defpackage.fqq fqqVar2 = fqhVarArr[i4].b;
                int iH = defpackage.fqi.h(fqqVar2, j);
                if (iH != -1) {
                    long[] jArr = fqqVar2.f;
                    j3 = jArr[iH];
                    long[] jArr2 = fqqVar2.c;
                    j2 = jArr2[iH];
                    if (j3 < j && iH < fqqVar2.b - 1 && (iB = fqqVar2.b(j)) != -1 && iB != iH) {
                        long j5 = jArr[iB];
                        jI = jArr2[iB];
                        j4 = j5;
                    }
                    if (i2 == -1) {
                        jI2 = j2;
                        for (i3 = 0; i3 < fqhVarArr.length; i3++) {
                            if (i3 != this.c) {
                                fqqVar = fqhVarArr[i3].b;
                                jI2 = defpackage.fqi.i(fqqVar, j3, jI2);
                                if (j4 != -9223372036854775807L) {
                                    jI = defpackage.fqi.i(fqqVar, j4, jI);
                                }
                            }
                        }
                    } else {
                        jI2 = j2;
                    }
                    fmbVar = new defpackage.fmb(j3, jI2);
                    if (j4 == -9223372036854775807L) {
                        flyVar = new defpackage.fly(fmbVar, fmbVar);
                    } else {
                        flyVar = new defpackage.fly(fmbVar, new defpackage.fmb(j4, jI));
                    }
                    return flyVar;
                }
            } else {
                j2 = Long.MAX_VALUE;
                j3 = j;
            }
            j4 = -9223372036854775807L;
            jI = -1;
            if (i2 == -1) {
                jI2 = j2;
                while (i3 < fqhVarArr.length) {
                    if (i3 != this.c) {
                        fqqVar = fqhVarArr[i3].b;
                        jI2 = defpackage.fqi.i(fqqVar, j3, jI2);
                        if (j4 != -9223372036854775807L) {
                            jI = defpackage.fqi.i(fqqVar, j4, jI);
                        }
                    }
                }
            } else {
                jI2 = j2;
            }
            fmbVar = new defpackage.fmb(j3, jI2);
            if (j4 == -9223372036854775807L) {
                flyVar = new defpackage.fly(fmbVar, fmbVar);
            } else {
                flyVar = new defpackage.fly(fmbVar, new defpackage.fmb(j4, jI));
            }
            return flyVar;
        }
        defpackage.fmb fmbVar2 = defpackage.fmb.a;
        return new defpackage.fly(fmbVar2, fmbVar2);
    }

    @Override // defpackage.fmi
    public final boolean f(int i) {
        return true;
    }
}
