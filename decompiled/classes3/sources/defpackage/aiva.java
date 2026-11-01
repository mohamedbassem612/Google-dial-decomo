package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aiva extends alad implements albi {
    public static final defpackage.aiva a;
    public int b;
    public aiwd c;
    public aiwd e;
    public aivx f;
    public defpackage.aivk g;
    public defpackage.aivb h;
    private aiwd i;
    private byte j = 2;
    public alat d = albq.a;

    static {
        defpackage.aiva aivaVar = new defpackage.aiva();
        a = aivaVar;
        alad.Q(defpackage.aiva.class, aivaVar);
    }

    private aiva() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new java.lang.Object[]{"b", "c", "d", aivy.class, "e", "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new defpackage.aiva();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiva.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
