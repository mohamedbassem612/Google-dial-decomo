package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyl {
    private static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod");
    private final aw b;
    private final defpackage.oxm c;
    private int d;

    public oyl(aw awVar, defpackage.oxm oxmVar) {
        aooh.f(awVar, "parentFragment");
        this.b = awVar;
        this.c = oxmVar;
        this.d = 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a() throws aois {
        aw awVarE = this.b.I().e("answer_buttons_fragment");
        if (awVarE == null) {
            a.b().l("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod", "resetViewState", 93, "TidePodsAnswerMethod.kt").v("answer method fragment is not found");
            return;
        }
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            a.b().l("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod", "resetViewState", 98, "TidePodsAnswerMethod.kt").v("no answer method type currently set");
            return;
        }
        if (i2 == 1) {
            ((defpackage.oxq) awVarE).y().m();
            return;
        }
        if (i2 == 2) {
            defpackage.oyu oyuVarY = ((defpackage.oyr) awVarE).y();
            oyuVarY.b().setAlpha(1.0f);
            oyuVarY.c().setAlpha(1.0f);
            oyuVarY.e().setAlpha(1.0f);
            oyuVarY.e().setScaleX(1.0f);
            oyuVarY.e().setScaleY(1.0f);
            oyuVarY.f().setAlpha(1.0f);
            oyuVarY.f().setScaleX(1.0f);
            oyuVarY.f().setScaleY(1.0f);
            return;
        }
        if (i2 == 3) {
            defpackage.oyp oypVarY = ((defpackage.oym) awVarE).y();
            defpackage.oyp.o(oypVarY.i());
            defpackage.oyp.o(oypVarY.h());
            defpackage.oyp.o(oypVarY.f());
            defpackage.oyp.o(oypVarY.c());
            defpackage.oyp.o(oypVarY.g());
            defpackage.oyp.o(oypVarY.d());
            defpackage.oyp.o(oypVarY.e());
            defpackage.oyp.o(oypVarY.b());
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                throw new aois();
            }
            a.b().l("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod", "resetViewState", 105, "TidePodsAnswerMethod.kt").v("resetting unsupported method");
            return;
        }
        defpackage.ozg ozgVar = awVarE instanceof defpackage.ozg ? (defpackage.ozg) awVarE : null;
        if (ozgVar != null) {
            defpackage.ozk ozkVarY = ozgVar.y();
            androidx.compose.ui.platform.ComposeView composeView = ((aw) ozkVarY.b).Q;
            aooh.d(composeView, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
            composeView.a(new cja(-731566240, true, new ntw(ozkVarY, 8)));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void b(boolean z, android.view.View view, java.lang.Boolean bool) throws aois {
        java.lang.String str;
        defpackage.oxm oxmVar = this.c;
        aw awVar = this.b;
        int iA = oxmVar.a(awVar.H(), bool, z);
        if (iA != this.d) {
            this.d = iA;
            aimz aimzVar = a;
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod", "updateAnswerMethodFragment", 56, "TidePodsAnswerMethod.kt");
            if (iA == 2) {
                str = "FLING_UP_DOWN";
            } else if (iA == 3) {
                str = "TWO_BUTTONS";
            } else if (iA != 4) {
                str = iA != 5 ? "ANSWER_UNSUPPORTED" : "HORIZONTAL_SWIPE";
            } else {
                str = "TWO_BUTTONS_LARGE_SCREEN";
            }
            aimwVarL.y("Setting up new answer method fragment: %s", str);
            if (iA == 5 && view != null) {
                aimzVar.b().l("com/android/dialer/incall/answer/method/ui/TidePodsAnswerMethod", "updateAnswerMethodFragment", 61, "TidePodsAnswerMethod.kt").v("Adjusting answer method spacer height to accommodate horizontal swipe.");
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = view.getContext().getResources().getDimensionPixelSize(2131165318);
                view.setLayoutParams(layoutParams);
            }
            int i = this.d;
            int i2 = i - 1;
            aw oxqVar = null;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    oxqVar = new defpackage.oxq();
                    amxr.g(oxqVar);
                } else if (i2 == 2) {
                    oxqVar = new defpackage.oyr();
                    amxr.g(oxqVar);
                } else if (i2 == 3) {
                    oxqVar = new defpackage.oym();
                    amxr.g(oxqVar);
                } else if (i2 == 4) {
                    oxqVar = new defpackage.ozg();
                    amxr.g(oxqVar);
                } else {
                    if (i2 != 5) {
                        throw new aois();
                    }
                    oxqVar = new defpackage.oyw();
                    amxr.g(oxqVar);
                }
            }
            if (oxqVar != null) {
                u uVar = new u(awVar.I());
                uVar.q(2131427469, oxqVar, "answer_buttons_fragment");
                uVar.c();
            }
        }
    }
}
