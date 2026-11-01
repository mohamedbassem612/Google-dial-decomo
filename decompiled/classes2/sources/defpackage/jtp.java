package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jtp {
    private static final aimz f = aimz.i("com/android/dialer/calleridfeedback/impl/logging/CallerIdCrowdsourcingOptInLogger");
    private static final aihd g = aihd.t(defpackage.aixq.USER_CONFIRMED_BUSINESS, defpackage.aixq.USER_CONFIRMED_BUSINESS_CNAP, defpackage.aixq.USER_DENIED_BUSINESS, defpackage.aixq.USER_DENIED_BUSINESS_CNAP);
    public final zzd a;
    public final android.content.Context b;
    public final aoin c;
    public final zdi d;
    public final defpackage.krv e;
    private final defpackage.jtt h;

    public jtp(zzd zzdVar, defpackage.jtt jttVar, defpackage.krv krvVar, android.content.Context context, zdi zdiVar, aoin aoinVar) {
        this.a = zzdVar;
        this.h = jttVar;
        this.e = krvVar;
        this.b = context;
        this.d = zdiVar;
        this.c = aoinVar;
    }

    public final ajcq a(defpackage.jrz jrzVar, defpackage.aixq aixqVar) {
        if (g.contains(aixqVar)) {
            return this.h.a(6, jrzVar, new defpackage.ac((java.lang.Object) this, (java.lang.Object) jrzVar, (java.lang.Object) aixqVar, 19, (char[]) null));
        }
        a.bt(f.c().m(aioa.b), "Unloggable feedback type (%s) attempted", aixqVar.name(), "com/android/dialer/calleridfeedback/impl/logging/CallerIdCrowdsourcingOptInLogger", "log", 'S', "CallerIdCrowdsourcingOptInLogger.java", zct.b);
        return ajcm.a;
    }
}
