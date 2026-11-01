package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snr {
    public static final aimz a = aimz.i("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/ContactRetriever");
    public final defpackage.ryu b;
    private final aolr c;
    private final zrw d;

    public snr(defpackage.ryu ryuVar, aolr aolrVar, zrw zrwVar) {
        aooh.f(aolrVar, "backgroundContext");
        this.b = ryuVar;
        this.c = aolrVar;
        this.d = zrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.snn snnVar;
        if (aolnVar instanceof defpackage.snn) {
            snnVar = (defpackage.snn) aolnVar;
            int i = snnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snnVar.c = i - Integer.MIN_VALUE;
            } else {
                snnVar = new defpackage.snn(this, aolnVar);
            }
        } else {
            snnVar = new defpackage.snn(this, aolnVar);
        }
        java.lang.Object objL = snnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = snnVar.c;
        if (i2 == 0) {
            aooc.af(objL);
            zrw zrwVar = this.d;
            snnVar.c = 1;
            objL = zrwVar.l(snnVar);
            if (objL != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objL);
            return objL;
        }
        aooc.af(objL);
        if (!((java.lang.Boolean) objL).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/peertopeer/capabilities/registrar/impl/cache/batch/ContactRetriever", "fetchUnformattedPhoneNumberFromContacts", 31, "ContactRetriever.kt").v("Missing permissions to read contact data.");
            return aokc.a;
        }
        aolr aolrVar = this.c;
        defpackage.sno snoVar = new defpackage.sno(this, null);
        snnVar.c = 2;
        java.lang.Object objAj = aoov.aj(aolrVar, snoVar, snnVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }
}
