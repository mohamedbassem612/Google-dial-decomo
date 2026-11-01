package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtx extends android.database.ContentObserver {
    final /* synthetic */ defpackage.aonn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtx(defpackage.aonn aonnVar) {
        super(null);
        this.a = aonnVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a(java.lang.Boolean.valueOf(z), null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        this.a.a(java.lang.Boolean.valueOf(z), uri);
    }
}
