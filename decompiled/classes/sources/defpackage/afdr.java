package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdr {
    private static final defpackage.zzx c = new defpackage.zzx((byte[]) null, (byte[]) null, (byte[]) null);
    private final java.lang.String a;
    private final java.lang.String b;

    public afdr(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final java.lang.String a() {
        if (!defpackage.afdp.a.b(c)) {
            return this.b;
        }
        java.lang.String str = this.a;
        java.lang.String strA = defpackage.afea.a(str, this.b);
        if (strA == null || strA.length() != 91) {
            return strA;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strA);
        int i = 2;
        while (true) {
            java.lang.String strA2 = defpackage.afea.a(str + i, "");
            sb.append(strA2);
            if (strA2.length() != 91) {
                return sb.toString();
            }
            i++;
        }
    }
}
