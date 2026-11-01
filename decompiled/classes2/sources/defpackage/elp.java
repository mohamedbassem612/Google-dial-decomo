package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elp extends defpackage.elq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elp(java.util.List list) {
        super(list);
        aooh.f(list, "cubics");
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ defpackage.elq a(defpackage.elu eluVar) {
        aokv aokvVar = new aokv(10);
        java.util.List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aokvVar.add(((defpackage.ell) list.get(i)).j(eluVar));
        }
        return new defpackage.elp(ajsz.aX(aokvVar));
    }

    public final java.lang.String toString() {
        return "Edge";
    }
}
