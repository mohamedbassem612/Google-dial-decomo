package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvf {
    public static final java.lang.String a = defpackage.gsh.b("WorkerWrapper");

    public static final java.lang.Object a(defpackage.ajcq ajcqVar, defpackage.gsg gsgVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        try {
            if (ajcqVar.isDone()) {
                return b(ajcqVar);
            }
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
            aoscVar.z();
            ajcqVar.c(new defpackage.gyk(ajcqVar, aoscVar, 1), defpackage.gru.INSTANCE);
            aoscVar.d(new defpackage.deu(gsgVar, ajcqVar, 2, null));
            return aoscVar.k();
        } catch (java.util.concurrent.ExecutionException e) {
            throw c(e);
        }
    }

    public static final java.lang.Object b(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final java.lang.Throwable c(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        defpackage.aooh.c(cause);
        return cause;
    }
}
