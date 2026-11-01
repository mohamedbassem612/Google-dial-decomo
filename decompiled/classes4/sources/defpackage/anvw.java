package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvw implements defpackage.anvy {
    private final /* synthetic */ int $cid;

    public anvw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.anvz
    public final /* synthetic */ int a(defpackage.aoaw aoawVar, int i, java.lang.Object obj, int i2) {
        int i3 = this.$cid;
        if (i3 == 0) {
            aoawVar.k(i);
            return 0;
        }
        if (i3 != 1) {
            aoawVar.j((byte[]) obj, i2, i);
            return i2 + i;
        }
        return aoawVar.e();
    }
}
