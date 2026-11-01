package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oxc implements defpackage.agyz {
    private static final agxj b = new agxj("AnswerMethodSettingsDataSourceKey");
    private static final aimz c = aimz.i("com/android/dialer/incall/answer/method/settings/service/AnswerMethodSettingsLocalDataSource");
    public final defpackage.pgi a;
    private final aoss d;
    private final aogc e;

    public oxc(defpackage.pgi pgiVar, aogc aogcVar, aoss aossVar) {
        aooh.f(aogcVar, "resultPropagator");
        aooh.f(aossVar, "lightweightScope");
        this.a = pgiVar;
        this.e = aogcVar;
        this.d = aossVar;
    }

    @Override // defpackage.agyz
    public final agxk a() {
        return b;
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        return aosv.F(this.d, 0, new oxe(this, (aoln) null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.owy owyVar, aoln aolnVar) {
        defpackage.oxb oxbVar;
        if (aolnVar instanceof defpackage.oxb) {
            oxbVar = (defpackage.oxb) aolnVar;
            int i = oxbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxbVar.c = i - Integer.MIN_VALUE;
            } else {
                oxbVar = new defpackage.oxb(this, aolnVar);
            }
        } else {
            oxbVar = new defpackage.oxb(this, aolnVar);
        }
        java.lang.Object obj = oxbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oxbVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            c.b().l("com/android/dialer/incall/answer/method/settings/service/AnswerMethodSettingsLocalDataSource", "setSelectedAnswerMethod", 35, "AnswerMethodSettingsLocalDataSource.kt").y("Setting selected answer method: %s", owyVar);
            defpackage.pgi pgiVar = this.a;
            oxbVar.c = 1;
            if (pgiVar.e(owyVar, oxbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.e.s(ajcm.a, b);
        return aojh.a;
    }
}
