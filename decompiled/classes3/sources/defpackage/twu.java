package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class twu {
    public static final aimz a = aimz.i("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl");
    public final aoss b;
    public final aolr c;
    public final aolr d;
    public final ajcu e;
    public final txc f;
    public final aoin g;
    public boolean h;
    public final aazc i;
    public final apni j;

    public twu(aoss aossVar, aolr aolrVar, aolr aolrVar2, apni apniVar, ajcu ajcuVar, aazc aazcVar, txc txcVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(apniVar, "androidJobs");
        aooh.f(ajcuVar, "backgroundScheduledExecutorService");
        aooh.f(aazcVar, "clock");
        aooh.f(txcVar, "sodaSpeechTranscriber");
        this.b = aossVar;
        this.c = aolrVar;
        this.d = aolrVar2;
        this.j = apniVar;
        this.e = ajcuVar;
        this.i = aazcVar;
        this.f = txcVar;
        this.g = aoinVar;
    }

    public final java.lang.Object a(java.io.File file, boolean z, aoln aolnVar) {
        return aoov.aj(this.c, new hyg(this, z, file, (aoln) null, 10), aolnVar);
    }
}
