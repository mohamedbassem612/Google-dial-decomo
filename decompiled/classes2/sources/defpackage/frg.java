package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class frg implements defpackage.frj {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Comparator b = j$.util.Comparator.-CC.comparingLong(new defpackage.fhk(4));
    private final aify c;
    private final long[] d;

    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    public frg(java.util.List list) {
        int i = ((aike) list).d;
        if (i == 1) {
            defpackage.frf frfVar = (defpackage.frf) ahvr.bm(list);
            long jD = d(frfVar.b);
            if (frfVar.c == -9223372036854775807L) {
                this.c = aify.p(frfVar.a);
                this.d = new long[]{jD};
                return;
            } else {
                this.c = aify.q(frfVar.a, aike.a);
                this.d = new long[]{jD, frfVar.c + jD};
                return;
            }
        }
        long[] jArr = new long[i << 1];
        this.d = jArr;
        java.util.Arrays.fill(jArr, Long.MAX_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aike aikeVarX = aify.x(b, list);
        int i2 = 0;
        for (int i3 = 0; i3 < aikeVarX.d; i3++) {
            defpackage.frf frfVar2 = (defpackage.frf) aikeVarX.get(i3);
            long jD2 = d(frfVar2.b);
            long j = frfVar2.c + jD2;
            if (i2 != 0) {
                int i4 = i2 - 1;
                long j2 = this.d[i4];
                if (j2 < jD2) {
                    this.d[i2] = jD2;
                    arrayList.add(frfVar2.a);
                    i2++;
                } else if (j2 == jD2 && ((aify) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, frfVar2.a);
                } else {
                    defpackage.etr.f("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.d[i4] = jD2;
                    arrayList.set(i4, frfVar2.a);
                }
            } else {
                this.d[i2] = jD2;
                arrayList.add(frfVar2.a);
                i2++;
            }
            if (frfVar2.c != -9223372036854775807L) {
                this.d[i2] = j;
                arrayList.add(aike.a);
                i2++;
            }
        }
        this.c = aify.n(arrayList);
    }

    public static long d(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.frj
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.frj
    public final int b(long j) {
        aify aifyVar = this.c;
        int iAb = eum.ab(this.d, j, false);
        if (iAb >= aifyVar.size()) {
            return -1;
        }
        return iAb;
    }

    @Override // defpackage.frj
    public final long c(int i) {
        ahvr.bM(i < this.c.size());
        return this.d[i];
    }

    @Override // defpackage.frj
    public final /* bridge */ /* synthetic */ java.util.List e(long j) {
        int iAc = eum.ac(this.d, j, false);
        return iAc == -1 ? aike.a : (aify) this.c.get(iAc);
    }
}
