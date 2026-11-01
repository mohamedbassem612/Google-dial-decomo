package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdp {
    public static final defpackage.afdq a;

    static {
        defpackage.afdq afdoVar;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            java.util.Iterator it = java.util.ServiceLoader.load(defpackage.afdq.class, defpackage.afdq.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                afdoVar = (defpackage.afdq) it.next();
                defpackage.ahvr.bZ(!it.hasNext(), "Expected at most one FlagsService");
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                afdoVar = new defpackage.afdo();
            }
            a = afdoVar;
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
