package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ykw implements emv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public ykw(aoop aoopVar, aw awVar, int i) {
        this.$cid = i;
        this.b = aoopVar;
        this.a = awVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void a(emx emxVar, emp empVar) {
        if (this.$cid != 0) {
            if (empVar.a().a(emq.d)) {
                ((aoop) this.b).a = false;
                ((aw) this.a).P().d(this);
                return;
            }
            return;
        }
        if (empVar == this.a) {
            for (defpackage.ykr ykrVar : this.b) {
                if (!aooh.n(ykrVar.a(), defpackage.yku.a)) {
                    ykrVar.c();
                }
            }
        }
    }

    public /* synthetic */ ykw(emp empVar, java.util.List list, int i) {
        this.$cid = i;
        this.a = empVar;
        this.b = list;
    }
}
