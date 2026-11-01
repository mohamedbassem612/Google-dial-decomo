package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeev implements defpackage.amwu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.amwu a;

    public /* synthetic */ aeev(defpackage.amwu amwuVar, int i) {
        this.$cid = i;
        this.a = amwuVar;
    }

    @Override // defpackage.amwu
    public final java.lang.Object a() {
        int i = this.$cid;
        defpackage.amwu amwuVar = this.a;
        return i != 0 ? ((com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase) amwuVar.a()).x() : ((com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase) amwuVar.a()).x();
    }
}
