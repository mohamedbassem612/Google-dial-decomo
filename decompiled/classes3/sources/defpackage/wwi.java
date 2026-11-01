package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wwi implements defpackage.wvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.wvs a;

    public /* synthetic */ wwi(defpackage.wvs wvsVar, int i) {
        this.$cid = i;
        this.a = wvsVar;
    }

    @Override // defpackage.wvs
    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            akzx akzxVarM = defpackage.wwf.a.m();
            akzxVarM.u();
            defpackage.wwf wwfVar = (defpackage.wwf) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj);
            wwfVar.c = obj;
            wwfVar.b = 3;
            this.a.a((defpackage.wwf) akzxVarM.p());
            return;
        }
        if (i != 1) {
            throw null;
        }
        akzx akzxVarM2 = defpackage.wwf.a.m();
        akzxVarM2.u();
        defpackage.wwf wwfVar2 = (defpackage.wwf) akzxVarM2.b;
        j$.util.Objects.requireNonNull(obj);
        wwfVar2.c = obj;
        wwfVar2.b = 2;
        this.a.a((defpackage.wwf) akzxVarM2.p());
    }
}
