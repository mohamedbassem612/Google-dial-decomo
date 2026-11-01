package com.google.android.libraries.phenotype.client.stable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AccountRemovedBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            try {
                java.lang.String stringExtra = intent.getStringExtra("accountType");
                if (stringExtra != null) {
                    if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                        android.os.Bundle extras = intent.getExtras();
                        java.lang.String string = extras != null ? extras.getString("authAccount") : null;
                        if (string != null && (string.contains("..") || string.contains("/") || string.contains("\\") || string.equals("."))) {
                            android.util.Log.w("AccountRemovedRecv", "Got an invalid account name for P/H. Exiting.");
                            return;
                        }
                        aewq.e();
                        if (!abyl.i(context)) {
                            android.util.Log.w("AccountRemovedRecv", "Device is locked, ignoring account removal broadcast.");
                            return;
                        }
                        aewq aewqVarA = aewq.a(context);
                        if (aewqVarA == null) {
                            android.util.Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                            return;
                        }
                        android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        ajcq[] ajcqVarArr = new ajcq[2];
                        ajck ajckVarY = string != null ? ajck.w(defpackage.aezf.b(aewqVarA).a(new defpackage.adek(string, 13), aewqVarA.c())).y(new defpackage.adot(aewqVarA, string, 6), aewqVarA.c()) : ajcm.a;
                        aeqw aeqwVar = new aeqw(6);
                        ajbm ajbmVar = ajbm.a;
                        ajcqVarArr[0] = aizu.f(ajckVarY, java.io.IOException.class, aeqwVar, ajbmVar);
                        ajcqVarArr[1] = string != null ? aewqVarA.c().eT(new defpackage.aekf(context, string, 8)) : ajcm.a;
                        aiql.Z(ajcqVarArr).b(new defpackage.zpk(pendingResultGoAsync, 15), ajbmVar);
                    }
                }
            } catch (java.lang.ClassCastException e) {
                android.util.Log.w("AccountRemovedRecv", "Invalid broadcast received: ", e);
            }
        }
    }
}
