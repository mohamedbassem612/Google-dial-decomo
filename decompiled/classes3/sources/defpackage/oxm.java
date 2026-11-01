package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oxm {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes");
    private final tec b;
    private final aoin c;

    public oxm(tec tecVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableFlippablesVideoCalling");
        this.b = tecVar;
        this.c = aoinVar;
    }

    public final int a(android.app.Activity activity, java.lang.Boolean bool, boolean z) {
        aimz aimzVar;
        aooh.f(activity, "activity");
        if (defpackage.rhx.c(activity)) {
            a.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes", "computeMethodType", 39, "AnswerMethodTypes.kt").v("Answer method selected: TWO_BUTTONS_LARGE_SCREEN");
            return 4;
        }
        tec tecVar = this.b;
        if (tecVar.a(activity) && aooh.n(bool, java.lang.Boolean.TRUE)) {
            a.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes", "computeMethodType", 45, "AnswerMethodTypes.kt").v("Answer method selected: ANSWER_UNSUPPORTED");
            return 6;
        }
        if (!((android.view.accessibility.AccessibilityManager) activity.getSystemService(android.view.accessibility.AccessibilityManager.class)).isTouchExplorationEnabled() && !fh$.ExternalSyntheticApiModelOutline0.m(activity)) {
            aooh.f(activity, "activity");
            int i = activity.getResources().getConfiguration().keyboard;
            if (i == 1) {
                aimzVar = a;
                aimzVar.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes$Companion", "hasHardwareKeyboard", 91, "AnswerMethodTypes.kt").v("no hardware keys");
            } else {
                aimz aimzVar2 = a;
                if (i == 0) {
                    aimzVar2.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes$Companion", "hasHardwareKeyboard", 95, "AnswerMethodTypes.kt").v("unknown keyboard hardware");
                    aimzVar = aimzVar2;
                } else {
                    aimzVar2.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes$Companion", "hasHardwareKeyboard", 98, "AnswerMethodTypes.kt").v("returning true");
                }
            }
            if (activity.getResources().getConfiguration().navigation == 1) {
                if (!z || (((java.lang.Boolean) this.c.a()).booleanValue() && tecVar.a(activity))) {
                    aimzVar.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes", "computeMethodType", 66, "AnswerMethodTypes.kt").v("Answer method selected: HORIZONTAL_SWIPE");
                    return 5;
                }
                aimzVar.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes", "computeMethodType", 69, "AnswerMethodTypes.kt").v("Answer method selected: FLING_UP_DOWN");
                return 2;
            }
        }
        a.b().l("com/android/dialer/incall/answer/method/ui/AnswerMethodTypes", "computeMethodType", 54, "AnswerMethodTypes.kt").v("Answer method selected: TWO_BUTTONS");
        return 3;
    }
}
