package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lya extends ld {
    public final com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView A;
    public final android.view.ViewGroup B;
    public final com.airbnb.lottie.LottieAnimationView C;
    public final com.android.dialer.calllog.icons.container.CallLogIconContainerView D;
    public boolean E;
    public final defpackage.hsh F;
    public java.lang.Long G;
    public final rze H;
    public final zjm I;
    private final defpackage.lxt J;
    private final ems K;
    private final android.view.View L;
    private final defpackage.lxz M;
    private int N;
    public final nwu s;
    public final defpackage.koo t;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;
    public final android.widget.ImageView y;
    public final android.widget.TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lya(aazc aazcVar, zjm zjmVar, nwu nwuVar, rze rzeVar, ahpz ahpzVar, defpackage.lxt lxtVar, ems emsVar, defpackage.koo kooVar, android.view.View view) {
        super(view);
        aooh.f(aazcVar, "clock");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(emsVar, "fragmentLifecycle");
        aooh.f(kooVar, "callTypeHelper");
        aooh.f(view, "itemView");
        this.I = zjmVar;
        this.s = nwuVar;
        this.H = rzeVar;
        this.J = lxtVar;
        this.K = emsVar;
        this.t = kooVar;
        android.view.View viewFindViewById = view.findViewById(2131427651);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.u = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(2131427713);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.v = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131427710);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.w = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(2131427652);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.x = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(2131427643);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.y = (android.widget.ImageView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(2131427645);
        aooh.e(viewFindViewById6, "findViewById(...)");
        this.z = (android.widget.TextView) viewFindViewById6;
        android.view.View viewFindViewById7 = view.findViewById(2131428245);
        aooh.e(viewFindViewById7, "findViewById(...)");
        this.A = (com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView) viewFindViewById7;
        android.view.View viewFindViewById8 = view.findViewById(2131429207);
        aooh.e(viewFindViewById8, "findViewById(...)");
        this.L = viewFindViewById8;
        android.view.View viewFindViewById9 = view.findViewById(2131429208);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById9;
        viewGroup.setBackgroundColor(urg.c(viewGroup.getContext(), 2130968934));
        aooh.e(viewFindViewById9, "apply(...)");
        this.B = viewGroup;
        java.lang.Object objFindViewById = view.findViewById(2131427418);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) objFindViewById;
        lottieAnimationView.i("conversation_history_swipe_to_delete.json");
        aooh.e(objFindViewById, "apply(...)");
        this.C = lottieAnimationView;
        android.view.View viewFindViewById10 = view.findViewById(2131428352);
        aooh.e(viewFindViewById10, "findViewById(...)");
        this.D = (com.android.dialer.calllog.icons.container.CallLogIconContainerView) viewFindViewById10;
        this.N = 1;
        this.F = defpackage.hsh.a(j$.util.Optional.of(emsVar), false);
        this.M = new defpackage.lxz(view, this);
        F(1);
        dzs.a(view, C().getString(2132017153), new vya(this, 1));
    }

    public final android.content.Context C() {
        android.content.Context context = this.a.getContext();
        aooh.e(context, "getContext(...)");
        return context;
    }

    public final void D() {
        defpackage.kip kipVarW;
        java.lang.Long l = this.G;
        if (l != null) {
            defpackage.lxt lxtVar = this.J;
            long jLongValue = l.longValue();
            int iB = b();
            java.lang.Integer numValueOf = null;
            if (iB == -1 || (kipVarW = lxtVar.w(iB)) == null || kipVarW.c != jLongValue) {
                java.util.Iterator it = lxtVar.g.a.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kipVarW = null;
                        break;
                    }
                    defpackage.kip kipVar = (defpackage.kip) it.next();
                    if (kipVar.c == jLongValue) {
                        kipVarW = kipVar;
                        break;
                    }
                }
            }
            if (kipVarW == null) {
                defpackage.lxt.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsAdapter", "deleteRow", 183, "ConversationHistoryCallDetailsAdapter.kt").v("row not found");
                return;
            }
            if (lxtVar.g.a.b.size() == 1) {
                lxtVar.f(iB);
                if (lxtVar.h != null) {
                    akzx akzxVarM = defpackage.lyq.a.m();
                    long j = kipVarW.c;
                    akzxVarM.u();
                    defpackage.lyq lyqVar = (defpackage.lyq) akzxVarM.b;
                    lyqVar.b |= 1;
                    lyqVar.c = j;
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.lyr.aU((defpackage.lyq) aladVarP).r(lxtVar.e.I(), "ConversationHistoryDeleteDialogFragment");
                    return;
                }
                return;
            }
            defpackage.lyi lyiVarY = lxtVar.e.y();
            long j2 = kipVarW.c;
            aify aifyVarP = kipVarW.m ? aify.p(kipVarW.l) : aike.a;
            aify aifyVarP2 = kipVarW.n ? aify.p(kipVarW.l) : aike.a;
            defpackage.lxt lxtVar2 = lyiVarY.i;
            int iA = lxtVar2.a();
            for (int i = 0; i < iA; i++) {
                defpackage.kip kipVarW2 = lxtVar2.w(i);
                if (kipVarW2 != null && kipVarW2.c == j2) {
                    numValueOf = java.lang.Integer.valueOf(i);
                    break;
                }
            }
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(numValueOf);
            aooh.e(optionalOfNullable, "ofNullable(...)");
            defpackage.lxt lxtVar3 = lyiVarY.i;
            j$.util.Objects.requireNonNull(lxtVar3);
            defpackage.lwx lwxVar = new defpackage.lwx(lxtVar3, 2);
            if (true == optionalOfNullable.isPresent()) {
                ((kh) lwxVar.a).f(((java.lang.Integer) optionalOfNullable.get()).intValue());
            }
            akzx akzxVarM2 = defpackage.lxu.a.m();
            akzxVarM2.u();
            defpackage.lxu lxuVar = (defpackage.lxu) akzxVarM2.b;
            lxuVar.b |= 1;
            lxuVar.c = j2;
            akzxVarM2.u();
            defpackage.lxu lxuVar2 = (defpackage.lxu) akzxVarM2.b;
            alat alatVar = lxuVar2.d;
            if (!alatVar.c()) {
                lxuVar2.d = alad.J(alatVar);
            }
            akyl.i(aifyVarP, lxuVar2.d);
            akzxVarM2.u();
            defpackage.lxu lxuVar3 = (defpackage.lxu) akzxVarM2.b;
            alat alatVar2 = lxuVar3.e;
            if (!alatVar2.c()) {
                lxuVar3.e = alad.J(alatVar2);
            }
            akyl.i(aifyVarP2, lxuVar3.e);
            defpackage.lxu lxuVar4 = (defpackage.lxu) akzxVarM2.p();
            defpackage.lxv lxvVar = new defpackage.lxv();
            amxr.g(lxvVar);
            ahgl.b(lxvVar, lxuVar4);
            lxvVar.r(lyiVarY.n.I(), "tag_conversation_history_call_details_delete_item_dialog_fragment");
        }
    }

    public final void E(float f) {
        android.view.ViewGroup viewGroup = this.B;
        viewGroup.setTranslationX(f);
        if (f == 0.0f) {
            F(1);
            return;
        }
        F(f > 0.0f ? 2 : 3);
        if (this.E) {
            viewGroup.invalidateOutline();
            this.C.o(mni.cz((float) ((((double) java.lang.Math.abs(f)) * 0.75d) / ((double) viewGroup.getWidth())), 0.0f, 0.75f), true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.airbnb.lottie.LottieAnimationView, java.lang.Object] */
    public final void F(int i) {
        int i2 = this.N;
        if (i2 != i) {
            if (i2 != 1 && i == 1) {
                this.L.setVisibility(8);
                android.view.ViewGroup viewGroup = this.B;
                viewGroup.setClipToOutline(false);
                viewGroup.setOutlineProvider(null);
                this.N = 1;
                return;
            }
            this.N = i;
            this.L.setVisibility(0);
            android.view.ViewGroup viewGroup2 = this.B;
            viewGroup2.setClipToOutline(true);
            viewGroup2.setOutlineProvider(this.M);
            int i3 = i == 2 ? 3 : 5;
            ?? r0 = this.C;
            aooh.f((java.lang.Object) r0, "<this>");
            android.view.ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
            aooh.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = i3 | 16;
            r0.o(0.0f, true);
            r0.setTranslationY(0.0f);
            r0.setAlpha(1.0f);
            this.E = true;
        }
    }
}
