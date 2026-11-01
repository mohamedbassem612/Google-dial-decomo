package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afho implements android.database.sqlite.SQLiteTransactionListener {
    final /* synthetic */ defpackage.afhp a;

    public afho(defpackage.afhp afhpVar) {
        j$.util.Objects.requireNonNull(afhpVar);
        this.a = afhpVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afie */
    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() throws afie {
        if (!this.a.a) {
            throw new afie();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
