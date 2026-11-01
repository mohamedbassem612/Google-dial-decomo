package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agcy implements android.view.View.OnFocusChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.agdg a;

    public /* synthetic */ agcy(defpackage.agdg agdgVar, int i) {
        this.$cid = i;
        this.a = agdgVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        int i = this.$cid;
        defpackage.agdg agdgVar = this.a;
        if (i != 0) {
            defpackage.agcs agcsVar = (defpackage.agcs) agdgVar;
            agcsVar.f(agcsVar.k());
            return;
        }
        defpackage.agdb agdbVar = (defpackage.agdb) agdgVar;
        agdbVar.b = z;
        agdgVar.x();
        if (z) {
            return;
        }
        agdbVar.k(false);
        agdbVar.c = false;
    }
}
