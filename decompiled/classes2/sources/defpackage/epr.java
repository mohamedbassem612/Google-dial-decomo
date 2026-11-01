package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epr {
    public final long a;
    public final int b;

    @java.lang.Deprecated
    public final android.net.Uri[] c;
    public final defpackage.eqt[] d;
    public final int[] e;
    public final long[] f;
    public final java.lang.String[] g;
    public final defpackage.eps[] h;
    public final long i;
    public final boolean j;

    static {
        java.lang.String str = eum.a;
    }

    public epr(int i, int[] iArr, defpackage.eqt[] eqtVarArr, long[] jArr, java.lang.String[] strArr, defpackage.eps[] epsVarArr) {
        android.net.Uri uri;
        int length = iArr.length;
        int length2 = eqtVarArr.length;
        int i2 = 0;
        ahvr.bM(length == length2);
        ahvr.bM(length == epsVarArr.length);
        this.a = 0L;
        this.b = i;
        this.e = iArr;
        this.d = eqtVarArr;
        this.f = jArr;
        this.i = 0L;
        this.j = false;
        this.c = new android.net.Uri[length2];
        while (true) {
            android.net.Uri[] uriArr = this.c;
            if (i2 >= uriArr.length) {
                this.g = strArr;
                this.h = epsVarArr;
                return;
            }
            defpackage.eqt eqtVar = eqtVarArr[i2];
            if (eqtVar == null) {
                uri = null;
            } else {
                defpackage.eqq eqqVar = eqtVar.b;
                ahvr.ci(eqqVar);
                uri = eqqVar.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.epr eprVar = (defpackage.epr) obj;
            if (this.b == eprVar.b && java.util.Arrays.equals(this.d, eprVar.d) && java.util.Arrays.equals(this.e, eprVar.e) && java.util.Arrays.equals(this.f, eprVar.f) && java.util.Arrays.equals(this.g, eprVar.g) && java.util.Arrays.equals(this.h, eprVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.b * 31) - 1) * 31) + anty.M(0L)) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + java.util.Arrays.hashCode(this.e)) * 31) + java.util.Arrays.hashCode(this.f)) * 31) + anty.M(0L)) * 961) + java.util.Arrays.hashCode(this.g)) * 31) + java.util.Arrays.hashCode(this.h)) * 31;
    }
}
