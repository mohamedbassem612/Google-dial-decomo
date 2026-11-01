package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aipg extends defpackage.aipi {
    public final int[] a;
    public final int b;
    private final defpackage.aior c;
    private final defpackage.aior d;

    public aipg(defpackage.aior aiorVar, defpackage.aior aiorVar2) {
        int iH;
        this.c = aiorVar;
        this.d = aiorVar2;
        int iB = aiorVar2.b();
        if (iB > 28) {
            throw new java.lang.IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iB];
        this.a = iArr;
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            defpackage.ainp ainpVarE = e(i);
            long j2 = ainpVarE.d | j;
            if (j2 != j || (iH = h(ainpVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = ainpVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(defpackage.ainp ainpVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (ainpVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aipi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aipi
    public final java.lang.Object b(defpackage.ainp ainpVar) {
        defpackage.aiql.j(!ainpVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(ainpVar, iArr, this.b);
        if (iH >= 0) {
            return ainpVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.aipi
    public final java.util.Set c() {
        return new aipe(this);
    }

    @Override // defpackage.aipi
    public final void d(defpackage.aioy aioyVar, java.lang.Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            defpackage.ainp ainpVarE = e(i2 & 31);
            if (ainpVarE.b) {
                aioyVar.b(ainpVarE, new aipf(this, ainpVarE, i2), obj);
            } else {
                aioyVar.a(ainpVarE, ainpVarE.c(f(i2)), obj);
            }
        }
    }

    public final defpackage.ainp e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final java.lang.Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
