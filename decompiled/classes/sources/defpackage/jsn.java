package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jsn implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calleridfeedback/impl/database/retention/CallerIdFeedbackDeletionListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;
    private final defpackage.jso d;

    public jsn(defpackage.zjx zjxVar, defpackage.ajct ajctVar, defpackage.jso jsoVar) {
        this.b = zjxVar;
        this.c = ajctVar;
        this.d = jsoVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.jso.class);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.calleridfeeback.impl.database.retention.CallerIdFeedbackDeletionWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.jso.b, defpackage.ahwt.a));
        aguvVarA.c(defpackage.jso.a);
        if (((java.lang.Boolean) this.d.f.a()).booleanValue()) {
            aguvVarA.b(defpackage.jso.c);
        }
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.lcn(this, 1), this.c);
        return ajcqVarB;
    }
}
