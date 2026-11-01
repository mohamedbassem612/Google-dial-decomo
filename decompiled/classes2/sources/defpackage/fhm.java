package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhm implements defpackage.fhj {
    private final java.util.ArrayList a = new java.util.ArrayList();

    private final int g(long j) {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((defpackage.frf) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.fhj
    public final long a(long j) {
        long j2;
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((defpackage.frf) arrayList.get(0)).b) {
            return ((defpackage.frf) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            j2 = ((defpackage.frf) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((defpackage.frf) arrayList.get(i - 1)).d;
                if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                    return j3;
                }
                return j2;
            }
        }
        j2 = ((defpackage.frf) ahvr.bk(arrayList)).d;
        if (j2 == -9223372036854775807L || j >= j2) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // defpackage.fhj
    public final long b(long j) {
        long j2;
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((defpackage.frf) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            j2 = ((defpackage.frf) arrayList.get(i)).b;
            if (j != j2) {
                if (j < j2) {
                    defpackage.frf frfVar = (defpackage.frf) arrayList.get(i - 1);
                    j2 = frfVar.d;
                    if (j2 == -9223372036854775807L || j2 > j) {
                        return frfVar.b;
                    }
                }
            }
            return j2;
        }
        defpackage.frf frfVar2 = (defpackage.frf) ahvr.bk(arrayList);
        j2 = frfVar2.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return frfVar2.b;
        }
        return j2;
    }

    @Override // defpackage.fhj
    public final aify c(long j) {
        int iG = g(j);
        if (iG == 0) {
            return aike.a;
        }
        defpackage.frf frfVar = (defpackage.frf) this.a.get(iG - 1);
        long j2 = frfVar.d;
        return (j2 == -9223372036854775807L || j < j2) ? frfVar.a : aike.a;
    }

    @Override // defpackage.fhj
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.fhj
    public final void e(long j) {
        int iG = g(j);
        if (iG != 0) {
            java.util.ArrayList arrayList = this.a;
            int i = iG - 1;
            long j2 = ((defpackage.frf) arrayList.get(i)).d;
            if (j2 == -9223372036854775807L || j2 >= j) {
                iG = i;
            }
            arrayList.subList(0, iG).clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.fhj
    public final boolean f(defpackage.frf frfVar, long j) {
        boolean z;
        long j2 = frfVar.b;
        ahvr.bM(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = frfVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.add(0, frfVar);
                break;
            }
            if (j2 >= ((defpackage.frf) arrayList.get(size)).b) {
                arrayList.add(size + 1, frfVar);
                break;
            }
            z &= ((defpackage.frf) arrayList.get(size)).b > j;
        }
        return z;
    }
}
