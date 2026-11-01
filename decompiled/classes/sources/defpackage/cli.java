package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cli implements defpackage.ckj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private int b;

    public cli(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ckj
    public final void a(defpackage.ckg ckgVar, java.lang.Object obj) {
        if (this.$cid == 0) {
            boolean z = ckgVar instanceof defpackage.cbk;
            defpackage.clj cljVar = (defpackage.clj) this.a;
            if (z) {
                cljVar.f--;
                return;
            }
            if (ckgVar == cljVar.g) {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    cljVar.k.n(ckgVar, obj);
                    cljVar.g = null;
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = ckgVar instanceof defpackage.cbk;
        defpackage.cbb cbbVar = (defpackage.cbb) this.a;
        if (z2) {
            cbbVar.f--;
            return;
        }
        if (ckgVar == cbbVar.n) {
            int i2 = this.b - 1;
            this.b = i2;
            if (i2 == 0) {
                defpackage.cdk cdkVarO = cbbVar.m.O();
                if (cdkVarO != null) {
                    cdkVarO.b(ckgVar, obj);
                }
                cbbVar.n = null;
            }
        }
    }

    @Override // defpackage.ckj
    public final void b(defpackage.ckg ckgVar) {
        if (this.$cid != 0) {
            boolean z = ckgVar instanceof defpackage.cbk;
            defpackage.cbb cbbVar = (defpackage.cbb) this.a;
            if (z) {
                cbbVar.f++;
                return;
            } else if (ckgVar != cbbVar.n) {
                return;
            }
        } else {
            boolean z2 = ckgVar instanceof defpackage.cbk;
            defpackage.clj cljVar = (defpackage.clj) this.a;
            if (z2) {
                cljVar.f++;
                return;
            } else if (ckgVar != cljVar.g) {
                return;
            }
        }
        this.b++;
    }
}
