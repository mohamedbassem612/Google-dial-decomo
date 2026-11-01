package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SurveyPromptBannerWrapper extends android.widget.FrameLayout {
    public SurveyPromptBannerWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        com.google.android.libraries.surveys.internal.view.SurveyPromptBannerWrapper surveyPromptBannerWrapper;
        int i3;
        aehj aehjVar = afjy.c;
        if (afjy.c(defpackage.anll.a.eZ().b(afjy.b))) {
            surveyPromptBannerWrapper = this;
            i3 = i;
            i2 = defpackage.afjs.b(surveyPromptBannerWrapper, findViewById(2131429173), i3, i2, findViewById(2131429180), null, false);
        } else {
            surveyPromptBannerWrapper = this;
            i3 = i;
        }
        super.onMeasure(i3, i2);
    }
}
