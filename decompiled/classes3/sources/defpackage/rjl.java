package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rjl implements defpackage.agyz {
    public final rjb a;
    public final java.util.Map b;
    private final aoss c;

    public rjl(rjb rjbVar, java.util.Map map, aoss aossVar) {
        aooh.f(rjbVar, "joyballConsentStatusNotifier");
        aooh.f(aossVar, "lightweightScope");
        this.a = rjbVar;
        this.b = map;
        this.c = aossVar;
    }

    @Override // defpackage.agyz
    public final agxk a() {
        return new agxj("JoyballLocalDataSourceKey");
    }

    @Override // defpackage.agyz
    public final ajcq b() {
        return aosv.F(this.c, 0, new loe(this, (aoln) null, 20), 3);
    }

    public final java.lang.Object c(aono aonoVar, aoln aolnVar) {
        java.lang.Object objD = aosv.D(aosv.F(this.c, 0, new pzf(this, aonoVar, (aoln) null, 2), 3), aolnVar);
        return objD != aolu.a ? aojh.a : objD;
    }
}
