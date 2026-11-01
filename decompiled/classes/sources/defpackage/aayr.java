package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aayr extends android.database.ContentObserver {
    final /* synthetic */ defpackage.aayu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayr(defpackage.aayu aayuVar) {
        super(null);
        j$.util.Objects.requireNonNull(aayuVar);
        this.a = aayuVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.f = (byte) 1;
    }
}
