package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpu {
    public static final aimz a = aimz.i("com/android/dialer/callnotesinfra/summarizer/aicore/FeatureAvailabilityUpdater");
    public final ysb b;
    public final yth c;
    public final defpackage.ni d;
    private final aolr e;

    public kpu(ysb ysbVar, defpackage.ni niVar, yth ythVar, aolr aolrVar) {
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(niVar, "downloadStateHolder");
        aooh.f(aolrVar, "backgroundContext");
        this.b = ysbVar;
        this.d = niVar;
        this.c = ythVar;
        this.e = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(yse yseVar, aoln aolnVar) {
        defpackage.kps kpsVar;
        if (aolnVar instanceof defpackage.kps) {
            kpsVar = (defpackage.kps) aolnVar;
            int i = kpsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpsVar.c = i - Integer.MIN_VALUE;
            } else {
                kpsVar = new defpackage.kps(this, aolnVar);
            }
        } else {
            kpsVar = new defpackage.kps(this, aolnVar);
        }
        java.lang.Object objAj = kpsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kpsVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.e;
            defpackage.kpt kptVar = new defpackage.kpt(this, yseVar, null);
            kpsVar.c = 1;
            objAj = aoov.aj(aolrVar, kptVar, kpsVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        return ((aoiw) objAj).a;
    }
}
