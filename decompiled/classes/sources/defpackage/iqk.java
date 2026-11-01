package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iqk implements defpackage.ecs {
    public final defpackage.iqf a;
    public final defpackage.iot b;
    public final defpackage.iqj c;
    public final defpackage.aoss d;
    public final defpackage.ipo e;
    public final defpackage.apni f;
    private final defpackage.zcr g;
    private final defpackage.aolr h;

    public iqk(defpackage.zcr zcrVar, defpackage.iqf iqfVar, defpackage.iot iotVar, defpackage.iqj iqjVar, defpackage.ipo ipoVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.apni apniVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        this.g = zcrVar;
        this.a = iqfVar;
        this.b = iotVar;
        this.c = iqjVar;
        this.e = ipoVar;
        this.d = aossVar;
        this.h = aolrVar;
        this.f = apniVar;
    }

    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        java.lang.Object objB = this.e.b(this.b, aolnVar);
        return objB != defpackage.aolu.a ? defpackage.aojh.a : objB;
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new hxq(this, (defpackage.albh) obj, (defpackage.aoln) null, 2), aolnVar);
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.g.a() ? this.e.a(this.b, aolnVar) : java.lang.Boolean.FALSE;
    }
}
