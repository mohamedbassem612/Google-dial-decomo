package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public obc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.obc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        zms zmsVar = (zms) list.get(0);
        pzn pznVar = (pzn) list.get(1);
        defpackage.obd obdVar = (defpackage.obd) list.get(2);
        ajct ajctVar = (ajct) list.get(3);
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(pznVar, "earpieceOnDisplayTracker");
        aooh.f(obdVar, "controller");
        aooh.f(ajctVar, "lightweightExecutor");
        return aiql.z(uyg.K(new defpackage.hsl(pznVar, zmsVar, obdVar, 11, (char[]) null), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
