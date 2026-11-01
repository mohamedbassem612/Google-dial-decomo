package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class amuu extends defpackage.amuz {
    private final int c;
    private final int d;

    public amuu(defpackage.amuz amuzVar, int i, int i2) {
        super(amuzVar);
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[PHI: r0
      0x0010: PHI (r0v2 int) = (r0v1 int), (r0v5 int) binds: [B:6:0x0009, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // defpackage.amuz
    public final void a(defpackage.amva amvaVar, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                amvaVar.d(31, 5);
                if (i2 > 62) {
                    amvaVar.d(i2 - 31, 16);
                } else if (i == 0) {
                    amvaVar.d(java.lang.Math.min(i2, 31), 5);
                } else {
                    amvaVar.d(i2 - 31, 5);
                }
            } else if (i == 31) {
                i = 31;
                if (i2 <= 62) {
                    amvaVar.d(31, 5);
                    if (i2 > 62) {
                        amvaVar.d(i2 - 31, 16);
                    } else if (i == 0) {
                        amvaVar.d(java.lang.Math.min(i2, 31), 5);
                    } else {
                        amvaVar.d(i2 - 31, 5);
                    }
                }
            }
            amvaVar.d(bArr[this.c + i], 8);
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        int i = this.c;
        sb.append(i);
        sb.append("::");
        sb.append((i + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
