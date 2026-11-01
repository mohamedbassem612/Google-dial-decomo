package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nxs implements ahlb {
    public static final aimz a = aimz.i("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchSynclet");
    private final zjx b;
    private final ajct c;

    public nxs(zjx zjxVar, ajct ajctVar) {
        aooh.f(zjxVar, "tikTokWorkManager");
        aooh.f(ajctVar, "lightweightExecutor");
        this.b = zjxVar;
        this.c = ajctVar;
    }

    public final ajcq a() {
        aguv aguvVarA = aguz.a(nxu.class);
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        java.util.Objects.toString(uuidRandomUUID);
        aguvVarA.f(new aguy("com.android.dialer.duo.data.synclet.MeetReachabilityMiniBatchWorker".concat(java.lang.String.valueOf(uuidRandomUUID)), 2));
        aguvVarA.e(new aile("com.android.dialer.duo.data.synclet.MeetReachabilityMiniBatchWorker"));
        grl grlVar = new grl();
        grlVar.e = true;
        grlVar.b = true;
        aguvVarA.b(grlVar.a());
        ahvr.J(this.b.b(aguvVarA.a()), new defpackage.jya(8), this.c);
        return aiql.z(aojh.a);
    }
}
