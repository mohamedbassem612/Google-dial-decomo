package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class agwa implements amwu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ amwu a;

    public /* synthetic */ agwa(amwu amwuVar, int i) {
        this.$cid = i;
        this.a = amwuVar;
    }

    public final java.lang.Object a() {
        if (this.$cid != 0) {
            return ((com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase) this.a.a()).x();
        }
        java.lang.Boolean.TRUE.booleanValue();
        return java.lang.Boolean.TRUE;
    }
}
