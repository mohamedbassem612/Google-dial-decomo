package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rqe extends emo {
    final /* synthetic */ rqi a;
    final /* synthetic */ rnz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(rqi rqiVar, rnz rnzVar) {
        super((byte[]) null);
        this.a = rqiVar;
        this.b = rnzVar;
    }

    public final void d(android.view.View view) {
        rnw rnwVar;
        rqi rqiVar = this.a;
        rqi.j(rqiVar.b.N()).w(this);
        aigf aigfVar = rqiVar.t;
        rnz rnzVar = this.b;
        aoin aoinVar = (aoin) aigfVar.get(rnzVar);
        if (aoinVar != null && (rnwVar = (rnw) aoinVar.a()) != null) {
            rnwVar.a();
        } else {
            java.lang.String str = java.lang.String.format("MainScreenFeatureUiProvider for tab %s is not provided", java.util.Arrays.copyOf(new java.lang.Object[]{rnzVar.name()}, 1));
            aooh.e(str, "format(...)");
            throw new java.util.NoSuchElementException(str);
        }
    }
}
