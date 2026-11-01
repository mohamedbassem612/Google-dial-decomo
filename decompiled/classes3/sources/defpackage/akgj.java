package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akgj {
    BRANCH(0),
    SINGLE(1),
    ANY(2),
    RANGE(3),
    MAP(4),
    TMAP(5);

    public static final defpackage.akgj[] g = values();

    akgj(int i) {
        if (i != ordinal()) {
            throw new java.lang.AssertionError(a.bj(i, "bad opcode value: "));
        }
    }

    public static int a(defpackage.akgh akghVar, defpackage.aogy aogyVar, int i) {
        int iC = (akghVar.c() << 16) | akghVar.c();
        if (!aogyVar.g()) {
            return i;
        }
        int iF = aogyVar.f();
        int i2 = (iC >>> (((int) (903298571996192 >>> (iF * 5))) & 31)) & ((int) (1099368461105 >>> (iF << 2))) & 15;
        if (i2 == 0) {
            return 3;
        }
        return akghVar.e(i2 - 1);
    }
}
