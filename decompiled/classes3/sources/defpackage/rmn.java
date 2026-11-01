package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rmn implements ahyc {
    public final /* synthetic */ rmo a;
    public final /* synthetic */ rmw b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ akzx e;

    public /* synthetic */ rmn(rmo rmoVar, akzx akzxVar, rmw rmwVar, java.lang.String str, long j) {
        this.a = rmoVar;
        this.e = akzxVar;
        this.b = rmwVar;
        this.c = str;
        this.d = j;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        akzx akzxVar = this.e;
        amnr amnrVar = (amnr) obj;
        akzxVar.u();
        ampv ampvVar = akzxVar.b;
        ampv ampvVar2 = ampv.a;
        j$.util.Objects.requireNonNull(amnrVar);
        ampvVar.A = amnrVar;
        ampvVar.c |= 2048;
        rmo rmoVar = this.a;
        zzc zzcVarH = rmoVar.a.h(akzxVar.p(), rmoVar.F());
        rmw rmwVar = this.b;
        zzcVarH.m(rmwVar.lo);
        rmoVar.c.d(zzcVarH);
        rmoVar.b.h(rmwVar, this.c, this.d);
        return null;
    }
}
