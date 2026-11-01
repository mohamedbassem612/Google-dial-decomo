package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ezr implements defpackage.etl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ ezr(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.etl
    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            int i = defpackage.eyc.C;
            ((erg) obj).a(this.a);
            return;
        }
        int i2 = this.a;
        defpackage.fad fadVar = (defpackage.fad) obj;
        if (i2 == 1) {
            fadVar.n = true;
            i2 = 1;
        }
        fadVar.j = i2;
    }
}
