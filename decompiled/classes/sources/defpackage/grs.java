package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grs extends defpackage.gta {
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // defpackage.gta
    public final defpackage.gsg a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (str == null) {
            defpackage.aooh.i("workerClassName");
        }
        if (workerParameters == null) {
            defpackage.aooh.i("workerParameters");
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                defpackage.gsg gsgVarA = ((defpackage.gta) it.next()).a(context, str, workerParameters);
                if (gsgVarA != null) {
                    return gsgVarA;
                }
            } catch (java.lang.Throwable th) {
                java.lang.String strBp = defpackage.a.bp((byte) 41, str, "Unable to instantiate a ListenableWorker (");
                defpackage.gsh.a();
                android.util.Log.e(grt.a, strBp, th);
                throw th;
            }
        }
        return null;
    }
}
