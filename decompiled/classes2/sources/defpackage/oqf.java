package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oqf {
    final /* synthetic */ j$.util.Optional a;
    final /* synthetic */ dsd b;

    public oqf(oqi oqiVar, j$.util.Optional optional, dsd dsdVar) {
        this.a = optional;
        this.b = dsdVar;
        j$.util.Objects.requireNonNull(oqiVar);
    }

    public final void a(java.lang.String str, afjd afjdVar) {
        oqi.a.d().l("com/android/dialer/hats/DialerHatsEventProcessor$2", "onRequestFailed", 327, "DialerHatsEventProcessor.java").I("Failed to fetch survey (trigger id: %s, error: %s).", str, afjdVar);
        this.b.b(j$.util.Optional.empty());
    }

    public final void b(com.google.android.libraries.surveys.SurveyData surveyData) {
        oqi.a.b().l("com/android/dialer/hats/DialerHatsEventProcessor$2", "onRequestSuccess", 319, "DialerHatsEventProcessor.java").y("HaTS survey request succeeded, trigger ID = %s", ((defpackage.oql) this.a.orElseThrow()).e());
        this.b.b(j$.util.Optional.of(surveyData));
    }
}
