package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class brm implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.czc b;
    public final /* synthetic */ int c;

    public /* synthetic */ brm(int i, defpackage.czc czcVar, int i2, int i3) {
        this.$cid = i3;
        this.a = i;
        this.b = czcVar;
        this.c = i2;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((defpackage.czb) obj).s(this.b, this.a, this.c, 0.0f);
            return defpackage.aojh.a;
        }
        defpackage.czc czcVar = this.b;
        ((defpackage.czb) obj).s(czcVar, defpackage.aopc.i((this.a - czcVar.a) / 2.0f), defpackage.aopc.i((this.c - czcVar.b) / 2.0f), 0.0f);
        return defpackage.aojh.a;
    }

    public /* synthetic */ brm(defpackage.czc czcVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.b = czcVar;
        this.a = i;
        this.c = i2;
    }
}
