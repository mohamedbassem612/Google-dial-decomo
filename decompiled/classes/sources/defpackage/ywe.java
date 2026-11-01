package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ywe implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ defpackage.zzx d;
    public final /* synthetic */ defpackage.ahbq e;

    public /* synthetic */ ywe(defpackage.zzx zzxVar, defpackage.ahbq ahbqVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.d = zzxVar;
        this.e = ahbqVar;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yvp] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aoin, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        if (this.$cid == 0) {
            this.d.l(new defpackage.zbq(zbr.am));
            defpackage.aazt aaztVarJ = this.e.j();
            aaztVarJ.b();
            aaztVarJ.a = "17870033684663524689";
            aaztVarJ.c = new bqp((defpackage.yvp) this.a, (j$.util.Optional) this.b, (defpackage.aoln) null, 8);
            aaztVarJ.b = new sba(this.c, 14, (char[][][]) null);
            return aaztVarJ.a();
        }
        this.d.l(new defpackage.zbq(zbr.an));
        defpackage.aazt aaztVarJ2 = this.e.j();
        aaztVarJ2.b();
        aaztVarJ2.a = "4029226380118366774";
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "get(...)");
        long jLongValue = ((java.lang.Number) objA).longValue();
        java.lang.Object obj = this.a;
        defpackage.aooh.f(obj, "configProvider");
        aaztVarJ2.c = new yss((defpackage.tmi) obj, jLongValue, (defpackage.aoln) null, 2);
        aaztVarJ2.b = new sba(this.c, 13, (byte[][][]) null);
        return aaztVarJ2.a();
    }
}
