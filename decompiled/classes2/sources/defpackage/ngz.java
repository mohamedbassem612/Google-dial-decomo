package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ngz implements defpackage.igc {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyRawAudioListener");
    public final defpackage.nrv b;
    public final nnx c;
    public final defpackage.ogj d;
    private final aolr e;

    public ngz(aolr aolrVar, defpackage.ogj ogjVar, defpackage.nrv nrvVar, nnx nnxVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ogjVar, "state");
        aooh.f(nrvVar, "dobbySessionWriter");
        this.e = aolrVar;
        this.d = ogjVar;
        this.b = nrvVar;
        this.c = nnxVar;
    }

    @Override // defpackage.igc
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.e, new defpackage.ngy(this, igbVar, null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    @Override // defpackage.igc
    public final /* synthetic */ java.lang.Object b(defpackage.igb igbVar, aoln aolnVar) {
        return aojh.a;
    }
}
