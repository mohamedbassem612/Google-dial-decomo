package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kla implements defpackage.kmf {
    public static final android.view.animation.Interpolator a = new android.view.animation.LinearInterpolator();
    public static final android.view.animation.Interpolator b = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    public static final android.view.animation.Interpolator c = new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
    public final rlv d;
    public defpackage.kme e;
    public final defpackage.hsh f;
    public final defpackage.hsh g;
    public java.lang.Integer h;
    public java.lang.Integer i;
    public final gpd j;
    private final jys k;
    private final android.support.v7.widget.RecyclerView l;

    public kla(jys jysVar, gpd gpdVar, rlv rlvVar, android.support.v7.widget.RecyclerView recyclerView) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(recyclerView, "recyclerView");
        this.k = jysVar;
        this.j = gpdVar;
        this.d = rlvVar;
        this.l = recyclerView;
        this.f = defpackage.hsh.c();
        this.g = defpackage.hsh.c();
    }

    public static final void g(ld ldVar, aonj aonjVar) {
        defpackage.due dueVar = new defpackage.due();
        android.view.View viewFindViewById = ldVar.a.findViewById(2131427662);
        aooh.e(viewFindViewById, "findViewById(...)");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) viewFindViewById;
        dueVar.c(constraintLayout);
        aonjVar.a(dueVar);
        dueVar.b(constraintLayout);
    }

    private static final void h(ld ldVar, android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(ldVar.a.getWidth(), 1073741824), 0);
    }

    private static final android.view.View i(ld ldVar) {
        android.view.View viewFindViewById = ldVar.a.findViewById(2131428668);
        aooh.e(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    public final float a(ld ldVar) {
        return ldVar.a.getContext().getResources().getDimensionPixelSize(2131165528);
    }

    public final android.content.Context b() {
        android.content.Context context = this.l.getContext();
        aooh.e(context, "getContext(...)");
        return context;
    }

    public final ld c(int i) {
        ld ldVarG = this.l.g(i, false);
        if (ldVarG instanceof defpackage.kma) {
            return ldVarG;
        }
        return null;
    }

    public final defpackage.kkx d(ld ldVar) {
        defpackage.kkw kkwVarG;
        android.view.View view = ldVar.a;
        android.view.View viewFindViewById = view.findViewById(2131428906);
        aooh.e(viewFindViewById, "findViewById(...)");
        defpackage.kkw kkwVarG2 = defpackage.hgu.G(viewFindViewById);
        android.view.View viewFindViewById2 = view.findViewById(2131427760);
        aooh.e(viewFindViewById2, "findViewById(...)");
        h(ldVar, viewFindViewById2);
        defpackage.kkw kkwVarG3 = defpackage.hgu.G(viewFindViewById2);
        defpackage.kma kmaVar = (defpackage.kma) ldVar;
        android.widget.LinearLayout linearLayoutC = kmaVar.C();
        h(ldVar, linearLayoutC);
        defpackage.kkw kkwVarG4 = defpackage.hgu.G(linearLayoutC);
        android.view.View viewFindViewById3 = view.findViewById(2131427408);
        aooh.e(viewFindViewById3, "findViewById(...)");
        h(ldVar, viewFindViewById3);
        defpackage.kkw kkwVarG5 = defpackage.hgu.G(viewFindViewById3);
        defpackage.kkw kkwVarG6 = null;
        if (kmaVar.J.U(kmaVar.E()) != null) {
            android.view.View viewFindViewById4 = view.findViewById(2131428244);
            aooh.e(viewFindViewById4, "findViewById(...)");
            h(ldVar, viewFindViewById4);
            kkwVarG = defpackage.hgu.G(viewFindViewById4);
        } else {
            kkwVarG = null;
        }
        android.view.View viewI = i(ldVar);
        if (!(viewI instanceof android.view.ViewStub) && viewI.getVisibility() == 0) {
            android.view.View viewI2 = i(ldVar);
            h(ldVar, viewI2);
            kkwVarG6 = defpackage.hgu.G(viewI2);
        }
        return new defpackage.kkx(kkwVarG2, kkwVarG, kkwVarG6, kkwVarG3, kkwVarG4, kkwVarG5);
    }

    @Override // defpackage.kmf
    public final void e(int i) {
        ld ldVarC = c(i);
        if (ldVarC != null) {
            defpackage.hsh hshVarA = this.g;
            if (hshVarA.isRunning()) {
                return;
            }
            java.lang.Integer num = this.h;
            if (num == null || num.intValue() != i) {
                hshVarA.d();
                defpackage.kkx kkxVarD = d(ldVarC);
                defpackage.kma kmaVar = (defpackage.kma) ldVarC;
                android.widget.LinearLayout linearLayoutC = kmaVar.C();
                byte[] bArr = null;
                this.e = null;
                int i2 = 8;
                linearLayoutC.setVisibility(8);
                hshVarA.k(new defpackage.mo(ldVarC, this, i, 7, null));
                int i3 = 0;
                if (kmaVar.H) {
                    android.view.View view = kkxVarD.d.b;
                    view.setVisibility(0);
                    defpackage.hgu.E(hshVarA, view, a(ldVarC), 0.0f);
                    hshVarA = defpackage.hgu.A(hshVarA, view);
                    hshVarA.i(new defpackage.ioi(view, 13));
                }
                float fA = a(ldVarC);
                defpackage.kkw kkwVar = kkxVarD.c;
                float fA2 = kkwVar != null ? kkwVar.a() : 0;
                defpackage.kkw kkwVar2 = kkxVarD.e;
                defpackage.kkw kkwVar3 = kkxVarD.f;
                kkwVar3.b.getLayoutParams().height = kkwVar3.c;
                hshVarA.k(new defpackage.jnv(ldVarC, kkxVarD, i2, bArr));
                android.view.View view2 = kkwVar2.b;
                defpackage.hgu.D(hshVarA, view2, kkwVar2.c, 0.0f);
                defpackage.hgu.E(hshVarA, view2, fA2, fA2 - fA);
                defpackage.hsh hshVarB = defpackage.hgu.B(hshVarA, view2);
                hshVarB.i(new defpackage.jnv(kkxVarD, ldVarC, 9));
                defpackage.kkw kkwVar4 = kkxVarD.b;
                if (kkwVar4 != null) {
                    android.view.View view3 = kkwVar4.b;
                    float fA3 = kkwVar != null ? -view3.getHeight() : a(ldVarC);
                    hshVarB.k(new defpackage.ioi(view3, 15));
                    defpackage.hgu.E(hshVarB, view3, fA3, 0.0f);
                    hshVarB = defpackage.hgu.A(hshVarB, view3);
                    hshVarB.i(new defpackage.jnv(view3, kkxVarD, 4, bArr));
                    if (kkwVar != null) {
                        defpackage.hgu.E(hshVarB, kkwVar.b, fA3, 0.0f);
                    }
                }
                hshVarB.h(new defpackage.kkv(ldVarC, kkxVarD, i3));
                hshVarB.i(new defpackage.jnv(this, ldVarC, 7));
                hshVarB.setDuration(wsc.bp(b(), urp.f)).start();
            }
        }
    }

    public final void f(kiu kiuVar) {
        defpackage.kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        agsm.i(198, this.k.b(kisVar.b), "Failed to clear missed calls.", new java.lang.Object[0]);
    }
}
