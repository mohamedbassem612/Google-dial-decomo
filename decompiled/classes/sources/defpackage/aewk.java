package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aewk extends android.database.ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewk(defpackage.aewl aewlVar) {
        super(null);
        j$.util.Objects.requireNonNull(aewlVar);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        defpackage.aexb.e();
    }
}
