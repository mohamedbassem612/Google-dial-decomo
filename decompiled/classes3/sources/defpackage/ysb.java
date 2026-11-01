package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ysb {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/availability/AiCoreAvailabilityImpl");
    public final defpackage.ysy b;
    public final aoss c;
    public final defpackage.ytj d;
    public final j$.util.concurrent.ConcurrentHashMap e;
    public final j$.util.concurrent.ConcurrentHashMap f;
    public final zzx g;
    public final zzx h;
    public final apni i;
    private final aolr j;

    public ysb(zzx zzxVar, defpackage.ysy ysyVar, aolr aolrVar, aoss aossVar, apni apniVar, defpackage.ytj ytjVar, zzx zzxVar2) {
        aooh.f(ysyVar, "aiCoreModelAvailability");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        this.g = zzxVar;
        this.b = ysyVar;
        this.j = aolrVar;
        this.c = aossVar;
        this.i = apniVar;
        this.d = ytjVar;
        this.h = zzxVar2;
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.f = new j$.util.concurrent.ConcurrentHashMap();
    }

    public final java.lang.Object a(defpackage.yse yseVar, aoln aolnVar) {
        return aoov.aj(this.j, new defpackage.ysa(this, yseVar, null), aolnVar);
    }
}
