package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmb extends gmr {
    final /* synthetic */ com.google.android.libraries.surveys.internal.view.SurveyViewPager a;

    public afmb(com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager) {
        j$.util.Objects.requireNonNull(surveyViewPager);
        this.a = surveyViewPager;
    }

    public final void b(int i) {
        com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = this.a;
        surveyViewPager.invalidate();
        defpackage.afke afkeVarX = surveyViewPager.x();
        if (afkeVarX != null) {
            afkeVarX.p();
            afkeVarX.f();
            android.view.View view = ((aw) afkeVarX).Q;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        surveyViewPager.requestLayout();
    }
}
