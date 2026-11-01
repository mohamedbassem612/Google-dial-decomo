package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amws {
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final java.nio.charset.Charset a = java.nio.charset.StandardCharsets.ISO_8859_1;

    public static int a(defpackage.amwn amwnVar, defpackage.amva amvaVar, defpackage.amva amvaVar2, defpackage.amwq amwqVar) {
        return amvaVar.b + amwnVar.a(amwqVar) + amvaVar2.b;
    }

    public static int b(int i) {
        if (i < 96) {
            return b[i];
        }
        return -1;
    }

    public static defpackage.amwq c(int i, defpackage.amwm amwmVar) throws defpackage.amus {
        for (int i2 = 1; i2 <= 40; i2++) {
            defpackage.amwq amwqVarB = defpackage.amwq.b(i2);
            if (amwqVarB.b - amwqVarB.a(amwmVar).b() >= (i + 7) / 8) {
                return amwqVarB;
            }
        }
        throw new defpackage.amus("Data too big");
    }
}
