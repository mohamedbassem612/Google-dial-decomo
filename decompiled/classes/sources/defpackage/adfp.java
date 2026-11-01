package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adfp extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ahzi a;
    final /* synthetic */ android.accounts.Account b;

    public adfp(defpackage.adai adaiVar, defpackage.ahzi ahziVar, android.accounts.Account account) {
        this.a = ahziVar;
        this.b = account;
        j$.util.Objects.requireNonNull(adaiVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adfm, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        ?? EZ = this.a.eZ();
        if (EZ != 0) {
            android.accounts.Account[] accounts = android.accounts.AccountManager.get(context).getAccounts();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra < 0 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            EZ.f();
        }
    }
}
