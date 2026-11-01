package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahri implements defpackage.afam {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.ahyn a;
    public final /* synthetic */ java.util.Set b;

    public /* synthetic */ ahri(defpackage.ahyn ahynVar, java.util.Set set, int i) {
        this.$cid = i;
        this.a = ahynVar;
        this.b = set;
    }

    @Override // defpackage.afam
    public final void a() {
        int i = this.$cid;
        defpackage.ahyn ahynVar = this.a;
        if (i == 0) {
            defpackage.ahpl.a = (defpackage.ahpk) ((defpackage.ahys) ahynVar).a;
            java.util.Set set = this.b;
            if (!set.isEmpty()) {
                defpackage.ahns.o(defpackage.aihd.o(set));
            }
            defpackage.ahns.a = true;
            return;
        }
        defpackage.ahpl.a = (defpackage.ahpk) ((defpackage.ahys) ahynVar).a;
        defpackage.ahnf.a = 3;
        defpackage.ahow.a = 1;
        java.util.Set set2 = this.b;
        if (set2.isEmpty()) {
            return;
        }
        defpackage.ahns.o(defpackage.aihd.o(set2));
    }
}
