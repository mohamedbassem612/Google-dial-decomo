package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pgw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [ajcq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pgs pgsVar = (defpackage.pgs) list.get(0);
        android.net.Uri uri = (android.net.Uri) list.get(1);
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(2);
        aooh.f(pgsVar, "cachedPhoneLookup");
        aooh.f(uri, "callHandle");
        aooh.f(details, "details");
        ahoq ahoqVarW = ahvr.W(480, "produceLegacyFullPhoneLookupInfo");
        try {
            ajcq ajcqVarA = aiql.A((ajcq) ((defpackage.aliq) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(pgsVar.f, defpackage.pgs.a(details), new defpackage.pgq(pgsVar, details, 0))).a);
            ahoqVarW.a(ajcqVarA);
            aooh.e(ajcqVarA, "attachToFuture(...)");
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return ajcqVarA;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
