package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adpv implements defpackage.ahyp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adpv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahyp
    public final boolean a(java.lang.Object obj) {
        defpackage.ajdd ajddVar;
        if (this.$cid == 0) {
            return ((defpackage.aihd) this.a).contains(defpackage.adqb.a((com.google.android.libraries.micore.superpacks.common.PackManifest) obj));
        }
        java.lang.Object obj2 = this.a;
        synchronized (obj2) {
            ajddVar = ((defpackage.adla) obj2).f;
        }
        return ajddVar == null;
    }
}
