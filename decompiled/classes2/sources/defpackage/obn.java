package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class obn implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ obn(alic alicVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, java.io.IOException iOException, boolean z, int i) {
        this.$cid = i;
        this.c = alicVar;
        this.e = fflVar;
        this.d = ffqVar;
        this.b = iOException;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.fga fgaVar = (defpackage.fga) obj;
            boolean z = this.a;
            java.lang.Object obj2 = this.b;
            fgaVar.h(0, (defpackage.ffu) ((alic) this.c).b, (defpackage.ffl) this.e, (defpackage.ffq) this.d, (java.io.IOException) obj2, z);
            return;
        }
        defpackage.heq heqVar = (defpackage.heq) this.b;
        heqVar.ac().setVisibility(0);
        heqVar.ab().setVisibility(0);
        android.widget.ImageButton imageButtonZ = heqVar.Z();
        imageButtonZ.setVisibility(0);
        java.lang.Object obj3 = this.d;
        java.lang.Object obj4 = this.c;
        afsq.F(imageButtonZ, ((defpackage.obr) obj4).b, "EmergencyVoiceFragmentPeer_showModal_onCloseButtonClicked", new defpackage.jjg(obj4, obj3, 14));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe = heqVar.ae();
        aooh.f(constraintLayoutAe, "view");
        pez.aI(constraintLayoutAe).setVisibility(8);
        pez.aG(constraintLayoutAe).setVisibility(8);
        pez.aJ(constraintLayoutAe).setVisibility(0);
        android.widget.ImageView imageViewAF = pez.aF(constraintLayoutAe);
        imageViewAF.setVisibility(0);
        defpackage.nzp nzpVar = (defpackage.nzp) this.e;
        imageViewAF.setImageResource(nzpVar.d);
        imageViewAF.setContentDescription(nzpVar.g);
        android.widget.TextView textViewAH = pez.aH(constraintLayoutAe);
        textViewAH.setText(nzpVar.f);
        textViewAH.setVisibility(0);
        int dimensionPixelSize = this.a ? ((android.view.View) heqVar.a).getResources().getDimensionPixelSize(2131167279) : ((android.view.View) heqVar.a).getResources().getDimensionPixelSize(2131167277);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe2 = heqVar.ae();
        constraintLayoutAe2.setPadding(constraintLayoutAe2.getPaddingLeft(), constraintLayoutAe2.getPaddingTop(), constraintLayoutAe2.getPaddingRight(), dimensionPixelSize);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe3 = heqVar.ae();
        dtv layoutParams = constraintLayoutAe3.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        dtv dtvVar = layoutParams;
        dtvVar.t = 2131428533;
        dtvVar.u = -1;
        dtvVar.s = -1;
        dtvVar.v = 2131428533;
        constraintLayoutAe3.setLayoutParams(dtvVar);
        heqVar.ae().setVisibility(0);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ obn(defpackage.heq heqVar, boolean z, defpackage.obr obrVar, defpackage.obf obfVar, defpackage.nzp nzpVar, int i) {
        this.$cid = i;
        this.b = heqVar;
        this.a = z;
        this.c = obrVar;
        this.d = obfVar;
        this.e = nzpVar;
    }
}
