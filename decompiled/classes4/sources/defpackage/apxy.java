package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxy {
    static final defpackage.apxy a = new defpackage.apxy(null);
    private static volatile boolean b = false;
    private static volatile defpackage.apxy c = null;
    private static volatile int e = 1;
    private final java.util.Map d;

    apxy() {
        this.d = new java.util.HashMap();
    }

    public static defpackage.apxy a() {
        java.lang.Class cls = defpackage.apxh.a;
        defpackage.apxy apxyVar = c;
        if (apxyVar == null) {
            synchronized (defpackage.apxy.class) {
                apxyVar = c;
                if (apxyVar == null) {
                    java.lang.Class cls2 = defpackage.apxw.a;
                    defpackage.apxy apxyVar2 = null;
                    if (cls2 != null) {
                        try {
                            apxyVar2 = (defpackage.apxy) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (apxyVar2 == null) {
                        apxyVar2 = a;
                    }
                    c = apxyVar2;
                    apxyVar = apxyVar2;
                }
            }
        }
        return apxyVar;
    }

    public final aoog b(defpackage.apyv apyvVar, int i) {
        return (aoog) this.d.get(new defpackage.apxx(apyvVar, i));
    }

    public apxy(byte[] bArr) {
        this.d = java.util.Collections.EMPTY_MAP;
    }
}
