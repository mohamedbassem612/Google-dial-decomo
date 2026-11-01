package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gta {
    public abstract defpackage.gsg a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters);

    public final defpackage.gsg b(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (str == null) {
            defpackage.aooh.i("workerClassName");
        }
        if (workerParameters == null) {
            defpackage.aooh.i("workerParameters");
        }
        defpackage.gsg gsgVarA = a(context, str, workerParameters);
        if (gsgVarA == null) {
            try {
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str).asSubclass(defpackage.gsg.class);
                if (clsAsSubclass == 0) {
                    defpackage.aooh.g();
                }
                try {
                    java.lang.Object objNewInstance = clsAsSubclass.getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(context, workerParameters);
                    if (objNewInstance == null) {
                        defpackage.aooh.g();
                    }
                    gsgVarA = (defpackage.gsg) objNewInstance;
                } catch (java.lang.Throwable th) {
                    java.lang.String strValueOf = java.lang.String.valueOf(str);
                    defpackage.gsh.a();
                    android.util.Log.e(gtb.a, "Could not instantiate ".concat(strValueOf), th);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                defpackage.gsh.a();
                android.util.Log.e(gtb.a, "Invalid class: ".concat(strValueOf2), th2);
                throw th2;
            }
        }
        if (!gsgVarA.c) {
            return gsgVarA;
        }
        throw new java.lang.IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
