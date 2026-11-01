package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agra implements defpackage.agnq, defpackage.agnp {
    public agra() {
        java.lang.Boolean.FALSE.booleanValue();
    }

    @Override // defpackage.agnp
    public final ajcq a(defpackage.agns agnsVar) {
        ajcq ajcqVarZ;
        ahoq ahoqVarW = ahvr.W(1306, "Get Intent Account");
        try {
            android.content.Intent intent = agnsVar.a;
            if (intent.hasExtra("account_id")) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    defpackage.agnm.a.c().l("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 117, "AccountIntents.java").v("AccountId was manually propagated. Use AccountIntents instead.");
                }
                ajcqVarZ = aiql.z(intExtra != -1 ? com.google.apps.tiktok.account.AccountId.b(intExtra) : null);
            } else {
                ajcqVarZ = aiql.z((java.lang.Object) null);
            }
            ahoqVarW.close();
            return ajcqVarZ;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
