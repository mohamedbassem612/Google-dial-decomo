package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acw {
    public long[] a;
    public int b;

    public acw(int i) {
        this.a = i == 0 ? defpackage.ada.a : new long[i];
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i, (length * 3) / 2));
            defpackage.aooh.e(jArrCopyOf, "copyOf(...)");
            this.a = jArrCopyOf;
        }
    }

    public final void b(long j) {
        a(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acw)) {
            return false;
        }
        defpackage.acw acwVar = (defpackage.acw) obj;
        int i = acwVar.b;
        int i2 = this.b;
        if (i != i2) {
            return false;
        }
        long[] jArr = this.a;
        long[] jArr2 = acwVar.a;
        defpackage.aopq aopqVarC = defpackage.aooc.C(0, i2);
        int i3 = aopqVarC.a;
        int i4 = aopqVarC.b;
        if (i3 <= i4) {
            while (jArr[i3] == jArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iM = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM += defpackage.anty.M(jArr[i2]) * 31;
        }
        return iM;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }
}
