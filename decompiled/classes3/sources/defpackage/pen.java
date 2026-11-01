package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pen extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public pen(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.pen.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.util.Map map = (java.util.Map) list.get(1);
        zzx zzxVar = (zzx) list.get(2);
        aoss aossVar = (aoss) list.get(3);
        mgu mguVar = (mgu) list.get(4);
        defpackage.yzr yzrVar = (defpackage.yzr) list.get(5);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        aooh.f(optional, "selectedCallBackgroundKey");
        aooh.f(map, "callBackgroundProviders");
        aooh.f(zzxVar, "callBackgroundUpdateListeners");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mguVar, "recorder");
        aooh.f(yzrVar, "callScopedCallBackgroundCache");
        aooh.f(optional2, "syntheticTetheredPhoneCallId");
        java.lang.Object objF = mguVar.g(new defpackage.pht(aossVar, map, (defpackage.pdw) aooh.q(optional), optional2, yzrVar, zzxVar, 1)).b(mfy.eQ).f();
        aooh.e(objF, "whenDone(...)");
        return (ajcq) objF;
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
