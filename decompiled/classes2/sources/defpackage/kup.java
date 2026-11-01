package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kup implements defpackage.kuo {
    public static final java.util.Map a = ajsz.aO(new aoiu[]{new aoiu("starting_voice_ar_XA", defpackage.kut.AR_XA_START), new aoiu("ending_voice_ar_XA", defpackage.kut.AR_XA_END), new aoiu("starting_voice_my_MM", defpackage.kut.MY_MM_START), new aoiu("ending_voice_my_MM", defpackage.kut.MY_MM_END)});
    public final defpackage.kuu b;
    public final kwt c;
    public final rlv d;
    private final aolr e;
    private final aoss f;

    public kup(aolr aolrVar, aoss aossVar, defpackage.kuu kuuVar, kwt kwtVar, rlv rlvVar) {
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.e = aolrVar;
        this.f = aossVar;
        this.b = kuuVar;
        this.c = kwtVar;
        this.d = rlvVar;
    }

    @Override // defpackage.kuo
    public final ajcq a() {
        return aosv.F(this.f, 0, new defpackage.ksy(this, (aoln) null, 4), 3);
    }

    @Override // defpackage.kuo
    public final ajcq b() {
        return aosv.F(this.f, 0, new defpackage.ksy(this, (aoln) null, 5, (byte[]) null), 3);
    }

    public final java.lang.Object c(java.lang.String str, aoln aolnVar) {
        return aoov.aj(this.e, new defpackage.kqd(str, this, (aoln) null, 2), aolnVar);
    }
}
