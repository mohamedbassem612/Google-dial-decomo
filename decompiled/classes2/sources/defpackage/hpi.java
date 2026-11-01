package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hpi implements defpackage.xu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hpi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aomy, java.lang.Object] */
    @Override // defpackage.xu
    public final void onClick() {
        defpackage.hqb hqbVarD;
        int i = this.$cid;
        if (i == 0) {
            this.a.a();
            return;
        }
        ?? r2 = this.a;
        if (i == 1) {
            r2.a();
            return;
        }
        defpackage.hpo hpoVarD = ((defpackage.hpp) r2).d();
        if (hpoVarD == null || (hqbVarD = hpoVarD.d()) == null) {
            return;
        }
        hqbVarD.a();
    }
}
