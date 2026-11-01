package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhl implements defpackage.fhj {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Comparator b = j$.util.Comparator.-EL.thenComparing(j$.util.Comparator.-CC.comparingLong(new defpackage.fhk(1)), j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingLong(new defpackage.fhk(0))));
    private final java.util.List c = new java.util.ArrayList();

    @Override // defpackage.fhj
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            java.util.List list = this.c;
            if (i >= list.size()) {
                break;
            }
            long j2 = ((defpackage.frf) list.get(i)).b;
            long j3 = ((defpackage.frf) list.get(i)).d;
            if (j < j2) {
                if (jMin == -9223372036854775807L) {
                    jMin = j2;
                    break;
                }
                jMin = java.lang.Math.min(jMin, j2);
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : java.lang.Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.fhj
    public final long b(long j) {
        java.util.List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((defpackage.frf) list.get(0)).b) {
                long jMax = ((defpackage.frf) list.get(0)).b;
                for (int i = 0; i < list.size(); i++) {
                    long j2 = ((defpackage.frf) list.get(i)).b;
                    long j3 = ((defpackage.frf) list.get(i)).d;
                    if (j3 <= j) {
                        jMax = java.lang.Math.max(jMax, j3);
                    } else {
                        if (j2 > j) {
                            return jMax;
                        }
                        jMax = java.lang.Math.max(jMax, j2);
                    }
                }
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.fhj
    public final aify c(long j) {
        java.util.List list = this.c;
        if (!list.isEmpty()) {
            if (j >= ((defpackage.frf) list.get(0)).b) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    defpackage.frf frfVar = (defpackage.frf) list.get(i);
                    long j2 = frfVar.b;
                    if (j >= j2 && j < frfVar.d) {
                        arrayList.add(frfVar);
                    }
                    if (j < j2) {
                        break;
                    }
                }
                aike aikeVarX = aify.x(b, arrayList);
                aift aiftVar = new aift(4);
                for (int i2 = 0; i2 < aikeVarX.d; i2++) {
                    aiftVar.k(((defpackage.frf) aikeVarX.get(i2)).a);
                }
                return aiftVar.h();
            }
        }
        return aike.a;
    }

    @Override // defpackage.fhj
    public final void d() {
        this.c.clear();
    }

    @Override // defpackage.fhj
    public final void e(long j) {
        int i = 0;
        while (true) {
            java.util.List list = this.c;
            if (i >= list.size()) {
                return;
            }
            long j2 = ((defpackage.frf) list.get(i)).b;
            if (j > j2 && j > ((defpackage.frf) list.get(i)).d) {
                list.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.fhj
    public final boolean f(defpackage.frf frfVar, long j) {
        long j2 = frfVar.b;
        ahvr.bM(j2 != -9223372036854775807L);
        ahvr.bM(frfVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < frfVar.d;
        java.util.List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                list.add(0, frfVar);
            }
            return z;
        } while (j2 < ((defpackage.frf) list.get(size)).b);
        list.add(size + 1, frfVar);
        return z;
    }
}
