package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zpv implements agxi {
    private final ajct a;
    private final java.lang.Class b;
    private final defpackage.zpt c;
    private final defpackage.zps d;
    private final zpy e;

    public zpv(zpy zpyVar, ajct ajctVar, java.lang.Class cls, defpackage.zpt zptVar, defpackage.zps zpsVar) {
        this.e = zpyVar;
        this.a = ajctVar;
        this.b = cls;
        this.c = zptVar;
        this.d = zpsVar;
    }

    public final ajbg a() {
        j$.util.Optional optionalA = this.e.a();
        if (!optionalA.isPresent()) {
            return new ajbg(aiql.z(agxh.a(new defpackage.pom(null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 524287), j$.time.Instant.now())));
        }
        defpackage.zps zpsVar = this.d;
        defpackage.pnn pnnVar = new defpackage.pnn(((defpackage.pnm) zpsVar).a, (hkl) optionalA.orElseThrow());
        pnnVar.a = pnnVar.b.b.a();
        if (!pnnVar.a.isPresent()) {
            a.bI(defpackage.pnp.a.c().m(aioa.b), "unable to start timer", "com/android/dialer/incall/contactgrid/dataservice/ContactGridDataService$1", "onModelProductionStart", 'G', "ContactGridDataService.java", zct.b);
        }
        ajcq ajcqVarA = aiql.A(this.c.a(aooc.ar(optionalA.orElseThrow(), this.b)));
        defpackage.pgr pgrVar = new defpackage.pgr(this, pnnVar, 7);
        ajct ajctVar = this.a;
        ahvr.J(ajcqVarA, pgrVar, ajctVar);
        return new ajbg(ahrv.g(ajcqVarA).h(new defpackage.ymu(2), ajctVar));
    }

    public final ajcq b() {
        return aiql.z((java.lang.Object) null);
    }

    public final java.lang.Object e() {
        return defpackage.zpp.a;
    }
}
