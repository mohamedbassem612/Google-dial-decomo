package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aewf extends android.database.ContentObserver {
    final /* synthetic */ defpackage.aewg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewf(defpackage.aewg aewgVar) {
        super(null);
        j$.util.Objects.requireNonNull(aewgVar);
        this.a = aewgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b();
    }
}
