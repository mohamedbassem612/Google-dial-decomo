package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackk extends aw {
    private static final aiof ar = aiof.i("GnpSdk");
    public acit a;
    public com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext al;
    public defpackage.akkc am;
    public defpackage.afpl ao;
    public defpackage.afpl ap;
    public defpackage.vqf aq;
    private boolean as;
    public aduj b;
    public defpackage.ackm d;
    public boolean c = false;
    public boolean e = true;
    public boolean ak = false;
    public java.lang.Boolean an = java.lang.Boolean.FALSE;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(2131624665, viewGroup);
    }

    public final void a() {
        this.ap.u(this.al, defpackage.acir.f);
        b();
    }

    public final void af(android.os.Bundle bundle) {
        super.af(bundle);
        if (bundle != null && !this.c) {
            b();
            return;
        }
        android.view.View viewFindViewById = G().findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new oge(this, viewFindViewById, 3));
        viewFindViewById.requestLayout();
    }

    public final void ai() {
        defpackage.ackm ackmVar = this.d;
        if (ackmVar != null) {
            ackmVar.a();
            if (!this.ak && !this.as) {
                this.ap.v(this.al, 3);
            }
            if (anfq.c()) {
                this.d = null;
            }
        }
        super.ai();
    }

    public final void b() {
        if (G() == null || G().isFinishing() || !aG() || ((aw) this).s) {
            return;
        }
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = this.al;
        if (promoContext != null) {
            defpackage.vqf vqfVar = this.aq;
            az azVarG = G();
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            android.view.View viewJ = vqfVar.J(azVarG, akjxVar.c == 5 ? (defpackage.akkh) akjxVar.d : defpackage.akkh.a);
            if (viewJ != null) {
                dzs.i(viewJ, (dye) null);
            }
        }
        bo boVar = ((aw) this).B;
        if (boVar != null) {
            u uVar = new u(boVar);
            uVar.k(this);
            uVar.i(true, true);
        }
    }

    public final void g(android.content.Context context) {
        super.g(context);
        try {
            ((defpackage.abzv) ((aoin) defpackage.adxj.a(context).hc().get(defpackage.ackk.class)).a()).a(this);
        } catch (java.lang.Exception e) {
            ar.d().k(e).l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/tooltip/TooltipFragment", "onAttach", 97, "TooltipFragment.java").v("Failed to inject members.");
        }
    }

    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        this.c = bundle != null && bundle.getBoolean("showing");
        this.an = java.lang.Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
    }

    public final void k(android.os.Bundle bundle) {
        bundle.putBoolean("showing", this.c);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.an.booleanValue());
        this.as = true;
    }
}
