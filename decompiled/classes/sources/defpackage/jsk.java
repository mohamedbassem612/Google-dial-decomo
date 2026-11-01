package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jsk {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calleridfeedback/impl/database/CallerIdFeedbackDatabase");
    private static final defpackage.ahbq h;
    public final defpackage.ajct b;
    public final defpackage.aazc c;
    public final defpackage.kaw d;
    public final defpackage.ahbv e;
    public final defpackage.zzx f;
    public final defpackage.aogc g;

    static {
        defpackage.afib afibVar = new defpackage.afib();
        afibVar.a("CREATE TABLE caller_id_feedback (normalized_phone_number TEXT PRIMARY KEY, caller_id_feedback_info BLOB NOT NULL, feedback_creation_time_millis INTEGER NOT NULL)");
        h = afibVar.b();
    }

    public jsk(defpackage.aogc aogcVar, defpackage.aazc aazcVar, defpackage.ahbv ahbvVar, defpackage.aogc aogcVar2, defpackage.kaw kawVar, defpackage.ajct ajctVar) {
        this.f = aogcVar.aB("caller_id_feedback", h);
        this.c = aazcVar;
        this.e = ahbvVar;
        this.g = aogcVar2;
        this.d = kawVar;
        this.b = ajctVar;
    }

    public final defpackage.ajcq a(java.lang.String str) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT caller_id_feedback_info FROM caller_id_feedback WHERE normalized_phone_number = ?");
        adagVar.p(str);
        return this.f.F(new jsh(adagVar.B(), 2));
    }

    public final defpackage.ajcq b(java.lang.String str, java.lang.String str2, defpackage.jsm jsmVar) {
        return defpackage.ahrv.g(a(str)).i(new jsc(this, str2, str, jsmVar, 3), this.b);
    }

    public final defpackage.ajcq c(java.lang.String str, soz sozVar, defpackage.jsm jsmVar) {
        return defpackage.ahrv.g(a(str)).i(new jsc(this, sozVar, str, jsmVar, 1), this.b);
    }

    public final defpackage.ajcq d(java.lang.String str, zhj zhjVar, defpackage.jsm jsmVar) {
        return defpackage.ahrv.g(a(str)).i(new jsc(this, zhjVar, str, jsmVar, 0), this.b);
    }

    public final defpackage.ajcq e(java.lang.String str, spa spaVar, defpackage.jsm jsmVar) {
        if (str.isEmpty()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calleridfeedback/impl/database/CallerIdFeedbackDatabase", "insertOrReplace", 279, "CallerIdFeedbackDatabase.java")).v("Trying to enter an empty phone number in CallerIdFeedbackDatabase.");
            return defpackage.ajcm.a;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("normalized_phone_number", str);
        contentValues.put("caller_id_feedback_info", spaVar.i());
        contentValues.put("feedback_creation_time_millis", java.lang.Long.valueOf(jsmVar.c));
        return defpackage.ahrv.g(this.f.G(new jsg(contentValues, 0))).i(new idd(this, jsmVar, 5), this.b);
    }
}
