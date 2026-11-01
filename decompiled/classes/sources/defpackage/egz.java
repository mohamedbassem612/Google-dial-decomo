package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class egz {
    static final defpackage.egz a = new defpackage.egz(null);
    private static volatile boolean b = false;
    private static volatile defpackage.egz c = null;
    private static volatile int e = 1;
    private final java.util.Map d;

    egz() {
        this.d = new java.util.HashMap();
    }

    public static defpackage.egz a() {
        java.lang.Class cls = defpackage.egd.a;
        defpackage.egz egzVar = c;
        if (egzVar == null) {
            synchronized (defpackage.egz.class) {
                egzVar = c;
                if (egzVar == null) {
                    java.lang.Class cls2 = defpackage.egx.a;
                    defpackage.egz egzVar2 = null;
                    if (cls2 != null) {
                        try {
                            egzVar2 = (defpackage.egz) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (egzVar2 == null) {
                        egzVar2 = a;
                    }
                    c = egzVar2;
                    egzVar = egzVar2;
                }
            }
        }
        return egzVar;
    }

    public final ece b(defpackage.ehw ehwVar, int i) {
        return (ece) this.d.get(new egy(ehwVar, i));
    }

    public egz(byte[] bArr) {
        this.d = java.util.Collections.EMPTY_MAP;
    }
}
