package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amyz i;

    public odf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amyz amyzVar3) {
        super(amyzVar2, new amzw(defpackage.odf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amyzVar3;
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.odl odlVar = (defpackage.odl) list.get(1);
        android.content.Context context = (android.content.Context) list.get(2);
        defpackage.ocu ocuVar = (defpackage.ocu) list.get(3);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(odlVar, "satelliteSOSTelephonyInfoCache");
        aooh.f(context, "appContext");
        aooh.f(ocuVar, "satelliteFeaturePromoController");
        aooh.f(optional, "satelliteSOSDebugSnapshot");
        aooh.f(optional2, "emergencyDebugSnapshotCache");
        return aosv.F(aossVar, 0, new defpackage.odb(odlVar, context, this.i, optional, optional2, ocuVar, zBooleanValue, null), 3);
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
