package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftp implements defpackage.frj {
    private final java.util.List a;
    private final long[] b;
    private final long[] c;

    public ftp(java.util.List list) {
        this.a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        this.b = new long[list.size() << 1];
        for (int i = 0; i < list.size(); i++) {
            defpackage.fti ftiVar = (defpackage.fti) list.get(i);
            long[] jArr = this.b;
            int i2 = i << 1;
            jArr[i2] = ftiVar.a;
            jArr[i2 + 1] = ftiVar.b;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.frj
    public final int a() {
        return this.c.length;
    }

    @Override // defpackage.frj
    public final int b(long j) {
        long[] jArr = this.c;
        int iAb = eum.ab(jArr, j, false);
        if (iAb >= jArr.length) {
            return -1;
        }
        return iAb;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // defpackage.frj
    public final long c(int i) {
        ahvr.bM((boolean) ((i ^ (-1)) >>> 31));
        long[] jArr = this.c;
        ahvr.bM(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.frj
    public final java.util.List e(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.b;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                defpackage.fti ftiVar = (defpackage.fti) list.get(i);
                java.lang.Object obj = ftiVar.c;
                if (((defpackage.ess) obj).y == -3.4028235E38f) {
                    arrayList2.add(ftiVar);
                } else {
                    arrayList.add(obj);
                }
            }
            i++;
        }
        j$.util.List.-EL.sort(arrayList2, j$.util.Comparator.-CC.comparingLong(new defpackage.fhk(5)));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            defpackage.esr esrVar = new defpackage.esr((defpackage.ess) ((defpackage.fti) arrayList2.get(i3)).c);
            esrVar.c((-1) - i3, 1);
            arrayList.add(esrVar.a());
        }
        return arrayList;
    }
}
