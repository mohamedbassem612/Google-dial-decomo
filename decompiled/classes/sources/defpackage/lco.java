package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lco implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;

    public lco(defpackage.zjx zjxVar, defpackage.ajct ajctVar) {
        this.b = zjxVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.aimz aimzVar = defpackage.lcp.a;
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.lcp.class);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.callscreen.impl.donation.scotty.CallScreenMetricsWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.lcp.c, defpackage.ahwt.a));
        aguvVarA.c(defpackage.lcp.b);
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.lcn(this, 0), this.c);
        return ajcqVarB;
    }
}
