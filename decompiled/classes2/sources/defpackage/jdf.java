package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdf implements utx {
    public final aoin a;
    public final aimz b;
    public final kgl c;
    private final defpackage.jdg d;
    private final aoss e;
    private final aoss f;

    public jdf(android.content.Context context, defpackage.jdg jdgVar, kgl kglVar, aoin aoinVar, aoss aossVar, aoss aossVar2) {
        aooh.f(context, "appContext");
        aooh.f(kglVar, "beeslySot");
        aooh.f(aoinVar, "enableBeeslySurveyEligibility");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        this.d = jdgVar;
        this.c = kglVar;
        this.a = aoinVar;
        this.e = aossVar;
        this.f = aossVar2;
        this.b = aimz.i("com/android/dialer/beesly/impl/v2/feedback/BeeslyFeedbackIntegration");
    }

    public final /* synthetic */ ajcq a(long j) {
        return ajcm.a;
    }

    public final /* synthetic */ ajcq b(long j) {
        return ajcm.a;
    }

    public final ajcq c(utu utuVar) {
        return aosv.F(this.e, 0, new defpackage.jcu(this, utuVar, (aoln) null, 2), 3);
    }

    public final /* synthetic */ ajcq d(long j, java.lang.String str) {
        return wsc.bj();
    }

    public final ajcq e(long j) {
        return aosv.F(this.e, 0, new defpackage.atg(this, j, (aoln) null, 6), 3);
    }

    public final ajcq f(utu utuVar) {
        aooh.f(utuVar, "feedbackUiInfo");
        return aosv.F(this.f, 0, new defpackage.jcu(this, utuVar, (aoln) null, 3, (byte[]) null), 3);
    }

    public final ajcq g(long j) {
        return aosv.F(this.e, 0, new defpackage.atg(this, j, (aoln) null, 7, (byte[]) null), 3);
    }

    public final /* synthetic */ ajcq h(long j) {
        return wsc.bm();
    }

    public final /* synthetic */ j$.util.Optional i(long j) {
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional j(uuh uuhVar) {
        aooh.f(uuhVar, "transcriptDataCase");
        if (uuhVar.ordinal() != 20) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        j$.util.Optional optionalOf = j$.util.Optional.of(this.d);
        aooh.e(optionalOf, "of(...)");
        return optionalOf;
    }

    public final /* synthetic */ ajcq k() {
        return wsc.bk();
    }

    public final ajcq l(long j, int i) {
        return aosv.F(this.e, 0, new defpackage.atg(this, j, (aoln) null, 8, (char[]) null), 3);
    }
}
