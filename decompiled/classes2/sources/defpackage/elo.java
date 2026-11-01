package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elo extends defpackage.elq {
    public final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elo(java.util.List list, boolean z) {
        super(list);
        aooh.f(list, "cubics");
        this.a = z;
    }

    @Override // defpackage.elq
    public final defpackage.elq a(defpackage.elu eluVar) {
        aokv aokvVar = new aokv(10);
        java.util.List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aokvVar.add(((defpackage.ell) list.get(i)).j(eluVar));
        }
        return new defpackage.elo(ajsz.aX(aokvVar), this.a);
    }

    public final java.lang.String toString() {
        return "Corner: cubics=" + ajsz.cr(this.b, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.dkq(18), 30) + " convex=" + this.a;
    }
}
