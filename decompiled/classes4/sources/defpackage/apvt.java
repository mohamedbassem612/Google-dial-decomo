package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apvt {
    private static final java.lang.String a = "apvt";
    private static defpackage.apvs b;

    private apvt() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0016, B:12:0x0027, B:14:0x002b, B:15:0x0032, B:16:0x0034), top: B:22:0x0003, inners: #1 }] */
    public static defpackage.apvs a(android.content.Context context, defpackage.apvp apvpVar) {
        defpackage.apvs apvsVar;
        synchronized (defpackage.apvt.class) {
            if (b == null && defpackage.apvu.b(context, apvpVar)) {
                try {
                    b = new defpackage.apzx();
                } catch (java.lang.Exception e) {
                    android.util.Log.e("cn_".concat(java.lang.String.valueOf(a)), "Exception creating an instance of CronetLoggerImpl", e);
                }
                if (b == null) {
                    b = new defpackage.apwq();
                }
                apvsVar = b;
            } else {
                if (b == null) {
                    b = new defpackage.apwq();
                }
                apvsVar = b;
            }
            throw th;
        }
        return apvsVar;
    }
}
