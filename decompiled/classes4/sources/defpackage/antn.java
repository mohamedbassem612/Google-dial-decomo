package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class antn implements defpackage.antp {
    private final /* synthetic */ int $cid;

    @Override // defpackage.antp
    public final void a(defpackage.antw antwVar) {
        int i = this.$cid;
        if (i == 0) {
            antwVar.b();
            return;
        }
        if (i == 1) {
            antwVar.c();
        } else if (i != 2) {
            antwVar.a();
        } else {
            antwVar.e();
        }
    }
}
