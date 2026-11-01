package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsi {
    public static final defpackage.acss a = a(2);
    public static final defpackage.acss b = a(3);
    public static final defpackage.acss c = a(4);
    public static final defpackage.acss d = a(5);
    public static final defpackage.acss e = a(6);
    public static final defpackage.acss f = a(7);

    private static final defpackage.acss a(int i) {
        java.util.Map map = defpackage.acst.a;
        java.lang.Object obj = defpackage.acst.a.get(java.lang.Integer.valueOf(i));
        if (obj == null) {
            throw new java.lang.IllegalStateException(a.bj(i, "Missing shader parameters for state "));
        }
        float[] fArr = (float[]) obj;
        int length = fArr.length;
        if (length == 13) {
            return new defpackage.acss(fArr[0] > 0.0f, fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8], fArr[9] != 0.0f, fArr[10], fArr[11], fArr[12]);
        }
        throw new java.lang.IllegalArgumentException(a.bj(length, "Expected 13 shader parameters, got "));
    }
}
