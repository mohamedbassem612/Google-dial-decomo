package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class akzq {
    public static final defpackage.akzq a = new defpackage.akzq(null);
    public static volatile int c = 1;
    private static volatile boolean d = false;
    private static volatile defpackage.akzq e;
    public final byte b;
    private final java.util.Map f;

    akzq() {
        this.b = (byte) -1;
        this.f = new java.util.HashMap();
    }

    public static defpackage.akzq a() {
        defpackage.akzq akzqVarB;
        defpackage.akzq akzqVar = e;
        if (akzqVar != null) {
            return akzqVar;
        }
        synchronized (defpackage.akzq.class) {
            akzqVarB = e;
            if (akzqVarB == null) {
                akzqVarB = defpackage.akzw.b(defpackage.akzq.class);
                e = akzqVarB;
            }
        }
        return akzqVarB;
    }

    public defpackage.apdi b(defpackage.albh albhVar, int i) {
        return (defpackage.apdi) this.f.get(new akzp(albhVar, i));
    }

    public akzq(byte[] bArr) {
        this.b = (byte) -1;
        this.f = java.util.Collections.EMPTY_MAP;
    }
}
