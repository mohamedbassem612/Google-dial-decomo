package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agdc implements defpackage.aftz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.widget.LinearLayout a;

    public /* synthetic */ agdc(android.widget.LinearLayout linearLayout, int i) {
        this.$cid = i;
        this.a = linearLayout;
    }

    @Override // defpackage.aftz
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.agdf agdfVar = (defpackage.agdf) this.a;
            afsq.C(agdfVar.d, agdfVar.d());
            return;
        }
        android.widget.LinearLayout linearLayout = this.a;
        if (i == 1) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = ((defpackage.agdf) linearLayout).b;
            afsq.C(checkableImageButton, checkableImageButton.getContentDescription());
        } else {
            defpackage.agdo agdoVar = (defpackage.agdo) linearLayout;
            afsq.C(agdoVar.c, agdoVar.b());
        }
    }
}
