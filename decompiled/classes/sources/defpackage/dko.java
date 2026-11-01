package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dko implements defpackage.ckb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.aonn a;
    final /* synthetic */ defpackage.aonj b;

    public dko(defpackage.aonn aonnVar, defpackage.aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aonnVar;
        this.b = aonjVar;
    }

    @Override // defpackage.ckb
    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        defpackage.aonj aonjVar = this.b;
        return i != 0 ? aonjVar.a(obj) : aonjVar.a(obj);
    }

    @Override // defpackage.ckb
    public final java.lang.Object b(defpackage.cjs cjsVar, java.lang.Object obj) {
        int i = this.$cid;
        defpackage.aonn aonnVar = this.a;
        return i != 0 ? aonnVar.a(cjsVar, obj) : aonnVar.a(cjsVar, obj);
    }
}
