package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sc implements android.app.appsearch.BatchResultCallback {
    private final dsj a;
    private final java.util.function.Function b;

    public sc(dsj dsjVar, java.util.function.Function function) {
        this.a = dsjVar;
        this.b = function;
    }

    public final void onResult(android.app.appsearch.AppSearchBatchResult appSearchBatchResult) {
        defpackage.pg pgVar;
        java.util.function.Function functionIdentity = j$.util.function.Function.-CC.identity();
        dzk.x(appSearchBatchResult);
        defpackage.we weVar = new defpackage.we((byte[]) null);
        dzk.x(appSearchBatchResult);
        java.util.function.Function function = this.b;
        for (java.util.Map.Entry entry : rk$.ExternalSyntheticApiModelOutline0.m(appSearchBatchResult).entrySet()) {
            java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(functionIdentity, entry.getKey());
            try {
                weVar.d(objM, aa$.ExternalSyntheticApiModelOutline1.m(function, entry.getValue()));
            } catch (java.lang.Throwable th) {
                boolean z = th instanceof defpackage.qv;
                if (!z || th.a != 6) {
                    android.util.Log.w("AppSearchResult", "Converting throwable to failed result.", th);
                } else if (defpackage.sn.a) {
                    th.toString();
                    android.util.Log.v("AppSearchResult", "Converting throwable to failed result: ".concat(th.toString()));
                }
                if (z) {
                    defpackage.qv qvVar = th;
                    pgVar = new defpackage.pg(qvVar.a, null, qvVar.getMessage());
                } else {
                    java.lang.String simpleName = th.getClass().getSimpleName();
                    int i = 13;
                    if (!(th instanceof java.util.concurrent.CancellationException) && !(th instanceof java.lang.InterruptedException)) {
                        i = 2;
                        if (!(th instanceof java.lang.IllegalStateException) && !(th instanceof java.lang.NullPointerException) && !(th instanceof java.util.concurrent.ExecutionException)) {
                            if (th instanceof java.lang.IllegalArgumentException) {
                                i = 3;
                            } else if (th instanceof java.io.IOException) {
                                i = 4;
                            } else {
                                i = th instanceof java.lang.SecurityException ? 8 : 1;
                            }
                        }
                    }
                    pgVar = new defpackage.pg(i, null, simpleName + ": " + th.getMessage());
                }
                weVar.c(objM, pgVar);
            }
        }
        for (java.util.Map.Entry entry2 : rk$.ExternalSyntheticApiModelOutline0.m$1(appSearchBatchResult).entrySet()) {
            java.lang.Object objM2 = aa$.ExternalSyntheticApiModelOutline1.m(functionIdentity, entry2.getKey());
            int iM = mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(entry2.getValue()));
            java.lang.String strM = mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(entry2.getValue()));
            if (iM == 6) {
                if (strM == null) {
                    strM = a.bg(objM2, "Document id '", "' doesn't exist");
                }
                iM = 6;
            }
            weVar.b(objM2, iM, strM);
        }
        this.a.f(weVar.a());
    }

    public final void onSystemError(java.lang.Throwable th) {
        this.a.g(th);
    }
}
