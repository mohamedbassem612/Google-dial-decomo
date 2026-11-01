package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fak extends android.database.ContentObserver {
    public final android.content.ContentResolver a;
    public final android.net.Uri b;
    final /* synthetic */ defpackage.fam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fak(defpackage.fam famVar, android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(handler);
        j$.util.Objects.requireNonNull(famVar);
        this.c = famVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.d();
    }
}
