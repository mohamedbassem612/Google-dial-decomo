package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryz implements agtk {
    final /* synthetic */ defpackage.rza a;

    public ryz(defpackage.rza rzaVar) {
        this.a = rzaVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        if (anqw.d(th).o == anqt.q) {
            defpackage.rza.a.b().l("com/android/dialer/patrick/account/ui/CallingCardAccountFragmentPeer$onAccountSelectedCallback$<anonymous>", "onFailure", 213, "CallingCardAccountFragmentPeer.kt").v("Failed to update account name due to unauthenticated account.");
            defpackage.rza rzaVar = this.a;
            java.lang.String strY = rzaVar.b.Y(2132017949);
            aooh.e(strY, "getString(...)");
            rzaVar.a(strY);
            return;
        }
        defpackage.rza.a.c().k(th).l("com/android/dialer/patrick/account/ui/CallingCardAccountFragmentPeer$onAccountSelectedCallback$<anonymous>", "onFailure", 217, "CallingCardAccountFragmentPeer.kt").v("Failed to update account name.");
        defpackage.rza rzaVar2 = this.a;
        java.lang.String strY2 = rzaVar2.b.Y(2132017954);
        aooh.e(strY2, "getString(...)");
        rzaVar2.a(strY2);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        defpackage.abxt abxtVar;
        java.lang.String str3;
        java.lang.String str4;
        com.android.dialer.patrick.impl.service.CallingCardUiModel callingCardUiModel = (com.android.dialer.patrick.impl.service.CallingCardUiModel) obj2;
        defpackage.rza rzaVar = this.a;
        if (((java.lang.Boolean) rzaVar.j.a()).booleanValue()) {
            if (callingCardUiModel != null) {
                defpackage.abxt abxtVar2 = callingCardUiModel.a;
                if (abxtVar2 != null) {
                    rzaVar.l.f(new defpackage.rzt(abxtVar2, 1));
                }
            } else {
                callingCardUiModel = null;
            }
            if (callingCardUiModel != null && (str4 = callingCardUiModel.b) != null) {
                defpackage.sjl sjlVar = rzaVar.l;
                if (((java.lang.Boolean) sjlVar.b.a()).booleanValue()) {
                    aozj aozjVar = sjlVar.e;
                    com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar.c(), null, null, null, null, null, null, null, str4, 127);
                    aozjVar.e(onboardingSavedStateA);
                    sjlVar.a.d("onboarding_saved_state", onboardingSavedStateA);
                } else {
                    sjlVar.l.e(str4);
                }
            }
            if (callingCardUiModel != null && (str3 = callingCardUiModel.c) != null) {
                defpackage.sjl sjlVar2 = rzaVar.l;
                if (((java.lang.Boolean) sjlVar2.b.a()).booleanValue()) {
                    aozj aozjVar2 = sjlVar2.e;
                    com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState onboardingSavedStateA2 = com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.a((com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState) aozjVar2.c(), null, null, null, null, null, null, str3, null, 191);
                    aozjVar2.e(onboardingSavedStateA2);
                    sjlVar2.a.d("onboarding_saved_state", onboardingSavedStateA2);
                } else {
                    sjlVar2.k.e(str3);
                }
            }
            rzaVar.m.c();
            return;
        }
        defpackage.vaa vaaVarC = defpackage.abxl.C(defpackage.abxn.a.m());
        if (callingCardUiModel != null) {
            str = callingCardUiModel.c;
            if (str == null) {
            }
            vaaVarC.N(str);
            if (callingCardUiModel != null && (abxtVar = callingCardUiModel.a) != null) {
                vaaVarC.P(abxtVar);
            }
            if (callingCardUiModel != null && (str2 = callingCardUiModel.b) != null) {
                vaaVarC.O(str2);
            }
            vaaVarC.Q(3);
            defpackage.abxn abxnVarM = vaaVarC.M();
            defpackage.sjf sjfVar = rzaVar.d;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("OnboardingFlowArgument", abxnVarM.i());
            android.app.Activity activity = sjfVar.c;
            activity.setResult(-1, intent);
            activity.finish();
        }
        callingCardUiModel = null;
        str = "";
        vaaVarC.N(str);
        if (callingCardUiModel != null) {
            vaaVarC.P(abxtVar);
        }
        if (callingCardUiModel != null) {
            vaaVarC.O(str2);
        }
        vaaVarC.Q(3);
        defpackage.abxn abxnVarM2 = vaaVarC.M();
        defpackage.sjf sjfVar2 = rzaVar.d;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("OnboardingFlowArgument", abxnVarM2.i());
        android.app.Activity activity2 = sjfVar2.c;
        activity2.setResult(-1, intent2);
        activity2.finish();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
