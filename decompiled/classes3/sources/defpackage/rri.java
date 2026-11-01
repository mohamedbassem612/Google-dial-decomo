package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rri {
    public static final defpackage.rrh a = new defpackage.rrh(0);
    public static final aimz b = aimz.i("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer");
    public final defpackage.rqv c;
    public final android.content.Context d;
    public final defpackage.rrf e;
    public final ahpz f;
    public final rlv g;
    public final ruc h;
    public final defpackage.agzc i;
    public final defpackage.rqw j;
    public final odo k;
    public java.lang.Long l;
    public final odm m;
    public final ahbv n;
    public final aogc o;
    private final gpd p;

    public rri(defpackage.rqv rqvVar, android.content.Context context, defpackage.rrf rrfVar, ahpz ahpzVar, rlv rlvVar, aogc aogcVar, ruc rucVar, ahbv ahbvVar, defpackage.agzc agzcVar, defpackage.rqw rqwVar, odo odoVar, gpd gpdVar) {
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(rucVar, "metrics");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.c = rqvVar;
        this.d = context;
        this.e = rrfVar;
        this.f = ahpzVar;
        this.g = rlvVar;
        this.o = aogcVar;
        this.h = rucVar;
        this.n = ahbvVar;
        this.i = agzcVar;
        this.j = rqwVar;
        this.k = odoVar;
        this.p = gpdVar;
        this.m = new defpackage.quy(this, 8);
    }

    public final mla a() {
        defpackage.rrf rrfVar = this.e;
        if (rrfVar.aG()) {
            mla mlaVarE = rrfVar.I().e("precall_dialpad_dialog");
            if (mlaVarE instanceof mla) {
                return mlaVarE;
            }
        }
        return null;
    }

    public final defpackage.tgc b() {
        defpackage.rrf rrfVar = this.e;
        if (rrfVar.aG()) {
            defpackage.tgc tgcVarE = rrfVar.I().e("dialpad_search_fragment_tag");
            if (tgcVarE instanceof defpackage.tgc) {
                return tgcVarE;
            }
        }
        return null;
    }

    public final void c(mce mceVar) {
        this.p.i((java.lang.String) null).b(mceVar);
    }

    public final void d(android.view.View view) {
        mla mlaVarA;
        defpackage.rrf rrfVar = this.e;
        if (rrfVar.dX().getConfiguration().orientation != 2 || rrfVar.A().getResources().getBoolean(2131034172) || (mlaVarA = a()) == null) {
            return;
        }
        int measuredWidth = rrfVar.N().getMeasuredWidth();
        int width = mlaVarA.N().findViewById(2131427997).getWidth();
        android.view.View viewFindViewById = view.findViewById(2131427995);
        aooh.e(viewFindViewById, "findViewById(...)");
        dtv layoutParams = viewFindViewById.getLayoutParams();
        aooh.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        dtv dtvVar = layoutParams;
        dtvVar.width = measuredWidth - width;
        viewFindViewById.setLayoutParams(dtvVar);
    }

    public final void e(defpackage.rqv rqvVar) {
        aooh.f(rqvVar, "dialpadSearchFragmentArgs");
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "update", 288, "NewDialpadSearchFragmentPeer.kt").v("enter");
        if ((rqvVar.b & 2) == 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        alcf alcfVar = rqvVar.d;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        aooh.e(alcfVar, "getIntentTimestamp(...)");
        long jB = aldi.b(alcfVar);
        java.lang.Long l = this.l;
        if (l != null && jB == l.longValue()) {
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "update", 291, "NewDialpadSearchFragmentPeer.kt").v("skipping update since intent already processed");
        } else {
            this.l = java.lang.Long.valueOf(jB);
            f(rqvVar);
        }
    }

    public final void f(defpackage.rqv rqvVar) {
        b.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "updateFromNewIntent", 303, "NewDialpadSearchFragmentPeer.kt").v("enter");
        mla mlaVarA = a();
        if (mlaVarA != null) {
            java.lang.String str = rqvVar.c;
            aooh.e(str, "getInput(...)");
            g(str);
            mlaVarA.r().i(str);
        }
    }

    public final void g(java.lang.String str) {
        b.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "updateSearchFragment", 312, "NewDialpadSearchFragmentPeer.kt").v("enter");
        defpackage.tgc tgcVarB = b();
        if (tgcVarB != null) {
            java.lang.String strJ = vwb.j(this.e.A(), str);
            tgcVarB.y().e(str, 2);
            mla mlaVarA = a();
            if (mlaVarA != null) {
                mlaVarA.r().f(strJ);
            }
        }
    }
}
