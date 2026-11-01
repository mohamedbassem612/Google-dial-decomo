package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hul implements defpackage.zta {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/assisteddialing/impl/AssistedDialingPrecallIntegration");
    public final defpackage.huc b;
    public final defpackage.aolr c;
    public final defpackage.hum d;
    private final defpackage.aoss e;

    public hul(defpackage.hum humVar, defpackage.huc hucVar, defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        this.d = humVar;
        this.b = hucVar;
        this.e = aossVar;
        this.c = aolrVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        throw new java.lang.UnsupportedOperationException("no UI available");
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        return defpackage.aiql.z(zsz.d);
    }

    @Override // defpackage.zta
    public final defpackage.ajcq c(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        return defpackage.aosv.F(this.e, 0, new defpackage.huk(zrxVar, this, (defpackage.aoln) null, 0), 3);
    }
}
