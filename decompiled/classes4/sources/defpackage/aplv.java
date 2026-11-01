package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aplv {
    public long a;
    public final java.lang.Object b;

    public aplv() {
        this.a = 0L;
        this.b = new android.util.LongSparseArray(2000);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [appa, java.lang.Object] */
    public final java.lang.String a() {
        java.lang.String strQ = this.b.q(this.a);
        this.a -= (long) strQ.length();
        return strQ;
    }

    public final apiu b() {
        zzx zzxVar = new zzx((byte[]) null, (short[]) null);
        while (true) {
            java.lang.String strA = a();
            if (strA.length() == 0) {
                return aoov.bl(zzxVar);
            }
            int iM = aoov.M(strA, ':', 1);
            if (iM != -1) {
                java.lang.String strSubstring = strA.substring(0, iM);
                aooh.e(strSubstring, "substring(...)");
                java.lang.String strSubstring2 = strA.substring(iM + 1);
                aooh.e(strSubstring2, "substring(...)");
                zzxVar.S(strSubstring, strSubstring2);
            } else if (strA.charAt(0) == ':') {
                java.lang.String strSubstring3 = strA.substring(1);
                aooh.e(strSubstring3, "substring(...)");
                zzxVar.S("", strSubstring3);
            } else {
                zzxVar.S("", strA);
            }
        }
    }

    public aplv(appa appaVar) {
        this.b = appaVar;
        this.a = 262144L;
    }
}
