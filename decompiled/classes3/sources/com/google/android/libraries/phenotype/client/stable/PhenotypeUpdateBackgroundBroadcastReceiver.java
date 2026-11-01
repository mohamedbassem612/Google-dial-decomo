package com.google.android.libraries.phenotype.client.stable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        final java.lang.String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                android.util.Log.w("PhenotypeBackgroundRecv", a.bk(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            aewq aewqVarA = aewq.a(context);
            if (aewqVarA == null) {
                aewq.e();
                ahvr.bY(false);
                return;
            }
            java.util.Map mapA = aezd.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            aezd aezdVar = (aezd) mapA.get(stringExtra);
            if (aezdVar == null || !aezdVar.b.equals(ajsw.d)) {
                android.util.Log.i("PhenotypeBackgroundRecv", a.bk(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final ajck ajckVarZ = ajck.w(ajck.w(defpackage.aezf.b(aewqVarA).c()).x(new defpackage.adek(stringExtra, 14), aewqVarA.c())).y(new defpackage.aczq((java.lang.Object) aezdVar, (java.lang.Object) stringExtra, (java.lang.Object) aewqVarA, 13, (char[]) null), aewqVarA.c()).z(25L, java.util.concurrent.TimeUnit.SECONDS, aewqVarA.c());
            ajckVarZ.c(new java.lang.Runnable() { // from class: aezk
                @Override // java.lang.Runnable
                public final void run() {
                    ajck ajckVar = ajckVarZ;
                    java.lang.String str = stringExtra;
                    android.content.BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            aiql.H(ajckVar);
                            android.util.Log.i("PhenotypeBackgroundRecv", a.bx(str, "Successfully updated snapshot for "));
                        } catch (java.util.concurrent.ExecutionException e) {
                            android.util.Log.w("PhenotypeBackgroundRecv", a.bx(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, aewqVarA.c());
        }
    }
}
