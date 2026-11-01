package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ern {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final defpackage.eqg[] d;
    private int e;

    static {
        java.lang.String str = eum.a;
    }

    public ern(java.lang.String str, defpackage.eqg... eqgVarArr) {
        int length = eqgVarArr.length;
        int i = 1;
        ahvr.bM(length > 0);
        this.b = str;
        this.d = eqgVarArr;
        this.a = length;
        java.lang.String str2 = eqgVarArr[0].p;
        this.c = android.text.TextUtils.isEmpty(str2) ? defpackage.eqz.b(eqgVarArr[0].o) : defpackage.eqz.b(str2);
        defpackage.eqg eqgVar = eqgVarArr[0];
        java.lang.String strB = b(eqgVar.d);
        int i2 = eqgVar.f | 16384;
        while (true) {
            defpackage.eqg[] eqgVarArr2 = this.d;
            if (i >= eqgVarArr2.length) {
                return;
            }
            defpackage.eqg eqgVar2 = eqgVarArr2[i];
            java.lang.String str3 = eqgVar2.d;
            if (!strB.equals(b(str3))) {
                c("languages", eqgVarArr2[0].d, str3, i);
                return;
            } else {
                if (i2 != (eqgVar2.f | 16384)) {
                    c("role flags", java.lang.Integer.toBinaryString(eqgVarArr2[0].f), java.lang.Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    private static java.lang.String b(java.lang.String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        defpackage.etr.d("TrackGroup", "", new java.lang.IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ')'));
    }

    public final defpackage.eqg a(int i) {
        return this.d[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ern ernVar = (defpackage.ern) obj;
            if (this.b.equals(ernVar.b) && java.util.Arrays.equals(this.d, ernVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.b.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.d);
        this.e = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        return this.b + ": " + java.util.Arrays.toString(this.d);
    }
}
