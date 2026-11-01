package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anow implements defpackage.anqs {
    private final /* synthetic */ int $cid;

    public anow(int i) {
        this.$cid = i;
    }

    @Override // defpackage.anqs
    public final /* synthetic */ int a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.anov) obj).a();
        }
        if (i != 1) {
            return ((defpackage.anpw) obj).d();
        }
        ((defpackage.anop) obj).e();
        return 5;
    }

    @Override // defpackage.anqs
    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.anov) obj).d();
        } else if (i != 1) {
            ((defpackage.anpw) obj).f();
        } else {
            ((defpackage.anop) obj).d();
        }
    }
}
