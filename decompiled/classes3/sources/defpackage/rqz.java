package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rqz {
    public final defpackage.rqv b;
    public final android.content.Context c;
    public final defpackage.rqu d;
    public final ahpz e;
    public final rlv f;
    public final ruc g;
    public final defpackage.agzc h;
    public final defpackage.rqw i;
    public final odo j;
    public java.lang.Long k;
    public final odm l;
    public final ahbv n;
    public final aogc o;
    private final gpd p;
    public static final defpackage.rrh m = new defpackage.rrh(1);
    public static final aimz a = aimz.i("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer");

    public rqz(defpackage.rqv rqvVar, android.content.Context context, defpackage.rqu rquVar, ahpz ahpzVar, rlv rlvVar, aogc aogcVar, ruc rucVar, ahbv ahbvVar, defpackage.agzc agzcVar, defpackage.rqw rqwVar, odo odoVar, gpd gpdVar) {
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(rucVar, "metrics");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.b = rqvVar;
        this.c = context;
        this.d = rquVar;
        this.e = ahpzVar;
        this.f = rlvVar;
        this.o = aogcVar;
        this.g = rucVar;
        this.n = ahbvVar;
        this.h = agzcVar;
        this.i = rqwVar;
        this.j = odoVar;
        this.p = gpdVar;
        this.l = new defpackage.quy(this, 7);
    }

    public final mla a() {
        defpackage.rqu rquVar = this.d;
        if (rquVar.aG()) {
            mla mlaVarE = rquVar.I().e("precall_dialpad_dialog");
            if (mlaVarE instanceof mla) {
                return mlaVarE;
            }
        }
        return null;
    }

    public final defpackage.tkd b() {
        defpackage.rqu rquVar = this.d;
        if (rquVar.aG()) {
            aw awVarE = rquVar.I().e("dialpad_search_fragment_tag");
            if (awVarE instanceof defpackage.tkd) {
                return (defpackage.tkd) awVarE;
            }
        }
        return null;
    }

    public final void c(mce mceVar) {
        this.p.i((java.lang.String) null).b(mceVar);
    }

    public final void d(android.view.View view) {
        mla mlaVarA;
        defpackage.rqu rquVar = this.d;
        if (rquVar.dX().getConfiguration().orientation != 2 || rquVar.A().getResources().getBoolean(2131034172) || (mlaVarA = a()) == null) {
            return;
        }
        int measuredWidth = rquVar.N().getMeasuredWidth();
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
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "update", 294, "DialpadSearchFragmentPeer.kt").v("enter");
        if ((rqvVar.b & 2) == 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        alcf alcfVar = rqvVar.d;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        aooh.e(alcfVar, "getIntentTimestamp(...)");
        long jB = aldi.b(alcfVar);
        java.lang.Long l = this.k;
        if (l != null && jB == l.longValue()) {
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "update", 297, "DialpadSearchFragmentPeer.kt").v("skipping update since intent already processed");
        } else {
            this.k = java.lang.Long.valueOf(jB);
            f(rqvVar);
        }
    }

    public final void f(defpackage.rqv rqvVar) {
        a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "updateFromNewIntent", 309, "DialpadSearchFragmentPeer.kt").v("enter");
        mla mlaVarA = a();
        if (mlaVarA != null) {
            java.lang.String str = rqvVar.c;
            aooh.e(str, "getInput(...)");
            vwb.j(this.d.A(), str);
            g(str);
            mlaVarA.r().i(str);
        }
    }

    public final void g(java.lang.String str) {
        a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "updateSearchFragment", 320, "DialpadSearchFragmentPeer.kt").v("enter");
        defpackage.tkd tkdVarB = b();
        if (tkdVarB != null) {
            java.lang.String strJ = vwb.j(this.d.A(), str);
            tkdVarB.aX(strJ, 3, tkdVarB.aU(str));
            mla mlaVarA = a();
            if (mlaVarA != null) {
                mlaVarA.r().f(strJ);
            }
        }
    }
}
