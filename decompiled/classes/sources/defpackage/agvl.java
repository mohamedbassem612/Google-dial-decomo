package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvl {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public static defpackage.aihd a(java.util.Set set) {
        defpackage.acc accVar = new defpackage.acc(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                accVar.add(str.substring(13));
            }
        }
        return defpackage.aihd.o(accVar);
    }

    public static java.lang.String b(androidx.work.WorkerParameters workerParameters) {
        return (java.lang.String) defpackage.ahvr.aZ(a(workerParameters.c).iterator());
    }
}
