package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ept {
    public static final defpackage.ept a = new defpackage.ept(new defpackage.epr[0]);
    private static final defpackage.epr e;
    private final defpackage.epr[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        defpackage.epr eprVar = new defpackage.epr(-1, new int[0], new defpackage.eqt[0], new long[0], new java.lang.String[0], new defpackage.eps[0]);
        int[] iArr = eprVar.e;
        int length = iArr.length;
        int iMax = java.lang.Math.max(0, length);
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iMax);
        java.util.Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = eprVar.f;
        int length2 = jArr.length;
        int iMax2 = java.lang.Math.max(0, length2);
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax2);
        java.util.Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        defpackage.eqt[] eqtVarArr = (defpackage.eqt[]) java.util.Arrays.copyOf(eprVar.d, 0);
        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(eprVar.g, 0);
        defpackage.eps[] epsVarArr = eprVar.h;
        e = new defpackage.epr(0, iArrCopyOf, eqtVarArr, jArrCopyOf, strArr, (defpackage.eps[]) java.util.Arrays.copyOf(epsVarArr, java.lang.Math.max(0, epsVarArr.length)));
        java.lang.String str = eum.a;
    }

    private ept(defpackage.epr[] eprVarArr) {
        this.f = eprVarArr;
    }

    public final defpackage.epr a(int i) {
        return i < 0 ? e : this.f[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ept eptVar = (defpackage.ept) obj;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && java.util.Arrays.equals(this.f, eptVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 961 + java.util.Arrays.hashCode(this.f);
    }

    public final java.lang.String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
