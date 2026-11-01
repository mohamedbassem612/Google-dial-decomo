package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jwg implements defpackage.kfh {
    public final defpackage.jwu a;
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(-1);
    public final defpackage.rlv c;
    public final defpackage.rsr d;
    private final defpackage.ajct e;
    private final defpackage.ajct f;
    private final defpackage.aogc g;

    public jwg(defpackage.jwu jwuVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aogc aogcVar, defpackage.rsr rsrVar, defpackage.rlv rlvVar) {
        this.a = jwuVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = aogcVar;
        this.d = rsrVar;
        this.c = rlvVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("CallingNetworksDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        defpackage.aogc aogcVar = this.g;
        defpackage.ajcq ajcqVarC = c(map);
        defpackage.ahrv ahrvVarI = defpackage.ahrv.g(aogcVar.bk()).i(new defpackage.jwf(this, 1), this.e);
        defpackage.jwf jwfVar = new defpackage.jwf(this, 0);
        defpackage.ajct ajctVar = this.f;
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ahrvVarI.i(jwfVar, ajctVar).h(new defpackage.jyx(kfjVar, 1), ajctVar));
        defpackage.kjs kjsVar = new defpackage.kjs(this, kfjVar, 1, null);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ahrv ahrvVarI2 = ahrvVarG.i(kjsVar, ajbmVar);
        java.util.Set set = kfkVar.c;
        defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarC, ahrvVarI2, set.isEmpty() ? defpackage.ajcm.a : defpackage.ahrv.g(this.d.ab(set)).i(new hky(this, 12), ajbmVar)})), (byte[]) null);
        defpackage.kve kveVar = new defpackage.kve(1);
        long j = defpackage.ahqx.a;
        return ahdaVar.o(new defpackage.ajav(defpackage.ahns.c(false), kveVar, 1), ajbmVar);
    }

    public final defpackage.ajcq c(java.util.Map map) {
        defpackage.ajcq ajcqVarO;
        if (map.isEmpty()) {
            return defpackage.ajcm.a;
        }
        defpackage.aihd aihdVar = (defpackage.aihd) j$.util.Collection.-EL.stream(map.values()).map(new etw(18)).filter(new jvr(5)).collect(defpackage.aido.b);
        defpackage.jwu jwuVar = this.a;
        if (aihdVar.isEmpty()) {
            ajcqVarO = new defpackage.ajcm(defpackage.aikj.b);
        } else if (jwuVar.d.m()) {
            ajcqVarO = new defpackage.ajdd(new jwt());
        } else {
            java.lang.Iterable iterableBf = defpackage.ahvr.bf(aihdVar.g(), 999);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterableBf.iterator();
            while (it.hasNext()) {
                arrayList.add(jwuVar.e.F(new jsh((java.util.List) it.next(), 3)));
            }
            defpackage.ahda ahdaVarAj = defpackage.ahvr.aj(arrayList);
            hkx hkxVar = new hkx(arrayList, 19);
            long j = defpackage.ahqx.a;
            ajcqVarO = ahdaVarAj.o(new defpackage.ajav(defpackage.ahns.c(false), hkxVar, 1), defpackage.ajbm.INSTANCE);
        }
        iau iauVar = new iau(this, map, 10);
        defpackage.ajct ajctVar = this.e;
        long j2 = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), iauVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarO, ahqvVar);
        ajcqVarO.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        long j = this.b.get();
        if (j <= 0) {
            return defpackage.ajcm.a;
        }
        defpackage.ajcq ajcqVarBl = this.g.bl(new jwe(j, 0));
        jvq jvqVar = new jvq(6);
        defpackage.ajct ajctVar = this.f;
        long j2 = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), jvqVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarBl, ahqvVar);
        ajcqVarBl.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
        return ajamVar;
    }
}
