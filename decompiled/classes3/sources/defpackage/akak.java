package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akak implements android.accounts.OnAccountsUpdateListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ akam a;

    public akak(akam akamVar) {
        j$.util.Objects.requireNonNull(akamVar);
        this.a = akamVar;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(android.accounts.Account[] accountArr) {
        java.util.Map map = this.a.a;
        synchronized (map) {
            j$.util.Collection.-EL.removeIf(map.entrySet(), new defpackage.abdh(aihd.p(accountArr), 17));
        }
    }
}
