package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final /* synthetic */ class vqm implements oi, aood {
    final /* synthetic */ defpackage.vqn a;

    public vqm(defpackage.vqn vqnVar) {
        this.a = vqnVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        aooh.f(activityResult, "p0");
        int i = activityResult.a;
        if (i == 0) {
            defpackage.vqn.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer", "onRecordVoicemailGreetingResult", 143, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("RecordVoicemailGreetingActivity is canceled");
            return;
        }
        if (i != -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        defpackage.vqn vqnVar = this.a;
        androidx.preference.Preference preferenceB = vqnVar.b();
        int i2 = 0;
        if (preferenceB != null) {
            preferenceB.R(false);
        }
        vqnVar.c.o(rmx.jW);
        defpackage.vqh vqhVar = vqnVar.b;
        android.view.View view = ((aw) vqhVar).Q;
        if (view == null) {
            throw new java.lang.IllegalStateException("View does not exist");
        }
        defpackage.agby agbyVarO = defpackage.agby.o(view, 2132019845, 0);
        defpackage.agbu agbuVar = agbyVarO.j;
        aooh.e(agbuVar, "getView(...)");
        android.view.ViewGroup.LayoutParams layoutParams = agbuVar.getLayoutParams();
        aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        android.view.View view2 = ((aw) vqhVar).Q;
        if (view2 != null) {
            int i3 = dzs.a;
            eax eaxVarA = dzl.a(view2);
            if (eaxVarA != null) {
                i2 = eaxVarA.f(647).e;
            }
        }
        marginLayoutParams.bottomMargin = i2 + vqhVar.dX().getDimensionPixelSize(2131167414);
        agbuVar.setLayoutParams(marginLayoutParams);
        agbyVarO.h();
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof oi) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        return new aoof(1, this.a, defpackage.vqn.class, "onRecordVoicemailGreetingResult", "onRecordVoicemailGreetingResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        return ex().hashCode();
    }
}
