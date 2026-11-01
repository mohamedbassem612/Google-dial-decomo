package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflr extends na {
    final /* synthetic */ com.google.android.libraries.surveys.internal.view.SurveyActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflr(com.google.android.libraries.surveys.internal.view.SurveyActivity surveyActivity) {
        super(true);
        j$.util.Objects.requireNonNull(surveyActivity);
        this.a = surveyActivity;
    }

    public final void b() {
        defpackage.aflv aflvVar = this.a.n;
        aflvVar.o(6);
        if (aflvVar.j) {
            aflvVar.u.setResult(-1, new android.content.Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        aflvVar.u.finish();
    }
}
