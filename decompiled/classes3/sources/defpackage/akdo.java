package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akdo extends alad implements albi {
    public static final defpackage.akdo a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";

    static {
        defpackage.akdo akdoVar = new defpackage.akdo();
        a = akdoVar;
        alad.Q(defpackage.akdo.class, akdoVar);
    }

    private akdo() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.akdo();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.akdo.class);
    }
}
