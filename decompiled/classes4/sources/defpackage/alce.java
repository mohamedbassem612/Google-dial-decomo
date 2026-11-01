package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alce {
    public static final java.lang.String[] a = new java.lang.String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = java.lang.String.format("\\%03o", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = a;
        strArr[127] = "\\177";
        strArr[34] = "\\\"";
        strArr[39] = "\\'";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        strArr[7] = "\\a";
        strArr[11] = "\\v";
    }

    static java.lang.String a(akzc akzcVar) {
        return anty.G(akzcVar.D());
    }
}
