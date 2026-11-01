package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class epk extends android.database.ContentObserver {
    final /* synthetic */ defpackage.epl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epk(defpackage.epl eplVar) {
        super(new android.os.Handler());
        this.a = eplVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.o();
    }
}
