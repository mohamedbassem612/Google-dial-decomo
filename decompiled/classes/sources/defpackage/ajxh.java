package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajxh implements defpackage.aaui {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ajxh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aaui
    public final void d(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((defpackage.zzx) this.a).i((defpackage.aakj) obj);
            return;
        }
        defpackage.ajxy ajxyVar = (defpackage.ajxy) obj;
        if (!((com.google.firebase.messaging.FirebaseMessaging) this.a).h() || ajxyVar.b.a() == null || ajxyVar.d()) {
            return;
        }
        ajxyVar.c(0L);
    }
}
