package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abtf extends android.database.ContentObserver {
    final /* synthetic */ defpackage.abtg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abtf(defpackage.abtg abtgVar, android.os.Handler handler) {
        super(handler);
        j$.util.Objects.requireNonNull(abtgVar);
        this.a = abtgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        this.a.b();
    }
}
