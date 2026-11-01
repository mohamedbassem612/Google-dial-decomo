package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rpz implements defpackage.dyy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public rpz(defpackage.afvo afvoVar, defpackage.afvp afvpVar, int i) {
        this.$cid = i;
        this.b = afvoVar;
        this.a = afvpVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [afvo, java.lang.Object] */
    @Override // defpackage.dyy
    public final defpackage.eax dC(android.view.View view, defpackage.eax eaxVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                return !(((defpackage.rqi) this.a).b((android.view.View) this.b) instanceof com.google.android.material.navigationrail.NavigationRailView) ? defpackage.eax.a : eaxVar;
            }
            this.b.a(view, eaxVar, new defpackage.afvp((defpackage.afvp) this.a));
            return eaxVar;
        }
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = this.b;
        defpackage.dwn dwnVarF = eaxVar.f(647);
        android.view.View view2 = (android.view.View) obj2;
        defpackage.rqi rqiVar = (defpackage.rqi) obj;
        rqiVar.b(view2);
        rqiVar.r = dwnVarF;
        rqiVar.c(view2, dwnVarF);
        int i2 = dwnVarF.b;
        int i3 = dwnVarF.d;
        int i4 = dwnVarF.e;
        android.view.View viewFindViewById = view2.findViewById(2131428494);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        ((com.google.android.material.navigation.NavigationView) viewFindViewById).setPadding(i2, 0, i3, i4);
        return eaxVar;
    }

    public /* synthetic */ rpz(defpackage.rqi rqiVar, android.view.View view, int i) {
        this.$cid = i;
        this.a = rqiVar;
        this.b = view;
    }
}
