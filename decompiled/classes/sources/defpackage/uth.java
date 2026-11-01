package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uth implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/timekeeper/impl/worker/TimeKeeperDbRefreshingListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;

    public uth(defpackage.zjx zjxVar, defpackage.ajct ajctVar) {
        this.b = zjxVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.agux aguxVar = defpackage.uti.a;
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.uti.class);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.timekeeper.impl.worker.TimeKeeperDbRefreshingWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.uti.b, defpackage.ahwt.a));
        aguvVarA.c(defpackage.uti.a);
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.lcn(this, 4), this.c);
        return ajcqVarB;
    }
}
