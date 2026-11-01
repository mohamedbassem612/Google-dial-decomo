package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yth {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/modeldownloader/AiCoreModelDownloaderImpl");
    public final defpackage.ysy b;
    public final defpackage.ysf c;
    public final defpackage.ysu d;
    public final zzx e;
    public final zzx f;
    private final aoss g;
    private final ucm h;
    private final defpackage.uyg i;

    public yth(defpackage.ysu ysuVar, defpackage.ysy ysyVar, aoss aossVar, zzx zzxVar, ucm ucmVar, defpackage.uyg uygVar, zzx zzxVar2, defpackage.ysf ysfVar) {
        aooh.f(ysuVar, "aiCoreClient");
        aooh.f(ysyVar, "aiCoreModelAvailability");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ucmVar, "aiCoreModelAvailabilityFlow");
        aooh.f(uygVar, "dialerAiCoreModelDownloadProgressFlow");
        this.d = ysuVar;
        this.b = ysyVar;
        this.g = aossVar;
        this.e = zzxVar;
        this.h = ucmVar;
        this.i = uygVar;
        this.f = zzxVar2;
        this.c = ysfVar;
    }

    public final java.lang.Object a(defpackage.yse yseVar, float f, aoln aolnVar) {
        java.lang.Object objA = this.i.C(yseVar).a(new java.lang.Float(f), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object b(defpackage.yse yseVar, defpackage.yta ytaVar, aoln aolnVar) {
        java.lang.Object objA = this.h.a(yseVar).a(ytaVar, aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final void c(defpackage.yse yseVar) {
        aooh.f(yseVar, "feature");
        aoov.an(this.g, (aolr) null, 0, new ytl(this, yseVar, (aoln) null, 1), 3);
    }
}
