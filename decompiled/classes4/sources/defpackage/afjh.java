package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afjh {
    public static final defpackage.afjh a;
    public static final java.util.concurrent.atomic.AtomicBoolean b;
    public com.google.android.libraries.surveys.internal.model.SurveyDataImpl d;
    public java.lang.String e;
    public aify f;
    public long g;
    public java.lang.String h;
    public long i;
    public gus l;
    public final aazc k = new aazc((byte[]) null);
    public final java.lang.String j = "com.google.android.libraries.surveys.internal.view.SurveyActivity";
    public final defpackage.afji c = defpackage.afji.a;

    static {
        java.util.Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations", "com.google.android.gms");
        a = new defpackage.afjh();
        b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    private afjh() {
        aehj.b = new aprf(this);
        this.g = 0L;
        this.i = j$.time.Instant.now().toEpochMilli();
    }

    public static void a() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                android.util.Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    public static void b() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final void c(defpackage.afiy afiyVar, com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImpl) {
        if (this.l != null) {
            gus.af(surveyDataImpl.a(), afiyVar);
        }
    }

    public final void d(defpackage.algv algvVar, apdh apdhVar, android.content.Context context) {
        java.lang.String str = android.text.TextUtils.isEmpty(this.e) ? null : this.e;
        aehj aehjVar = defpackage.afjy.c;
        if (defpackage.afjy.c(defpackage.anjv.c(defpackage.afjy.b))) {
            defpackage.amac amacVarT = defpackage.amac.t();
            akzx akzxVarM = defpackage.algy.a.m();
            akzxVarM.u();
            defpackage.algy algyVar = (defpackage.algy) akzxVarM.b;
            j$.util.Objects.requireNonNull(algvVar);
            algyVar.c = algvVar;
            algyVar.b = 4;
            amacVarT.q((defpackage.algy) akzxVarM.p(), apdhVar.b(), apdhVar.a(), context, str);
        }
    }

    public final defpackage.afjq e(ahex ahexVar, java.lang.String str) {
        defpackage.afjq afjqVarF = afjg.a.c.F((android.content.Context) ahexVar.e, (java.lang.String) ahexVar.b, "", str);
        afjqVarF.e = (oqf) ahexVar.c;
        return afjqVarF;
    }
}
