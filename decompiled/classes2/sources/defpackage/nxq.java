package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nxq implements ahlb {
    public static final aimz a = aimz.i("com/android/dialer/duo/data/synclet/MeetPhoneNumberSynclet");
    private final zjx b;
    private final ajct c;

    public nxq(zjx zjxVar, ajct ajctVar) {
        aooh.f(zjxVar, "tikTokWorkManager");
        aooh.f(ajctVar, "lightweightExecutor");
        this.b = zjxVar;
        this.c = ajctVar;
    }

    public final ajcq a() {
        aguv aguvVarA = aguz.a(nxr.class);
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        java.util.Objects.toString(uuidRandomUUID);
        aguvVarA.f(new aguy("com.android.dialer.duo.data.synclet.MeetReachabilityWorker".concat(java.lang.String.valueOf(uuidRandomUUID)), 2));
        aguvVarA.e(new aile("com.android.dialer.duo.data.synclet.MeetReachabilityWorker"));
        grl grlVar = new grl();
        grlVar.e = true;
        grlVar.b = true;
        aguvVarA.b(grlVar.a());
        ahvr.J(this.b.b(aguvVarA.a()), new defpackage.jya(7), this.c);
        return aiql.z(aojh.a);
    }
}
