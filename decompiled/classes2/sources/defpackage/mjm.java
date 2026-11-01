package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjm {
    public static final agxj a = new agxj("PRECALL_DIALPAD_DATA_SOURCE");
    public final ajct b;
    public final aoin d;
    public final aogc g;
    public final agab h;
    private final ojo i;
    private final zzx j;
    public final ahda f = new ahda();
    public final akzx e = defpackage.mit.a.m();
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(true);

    public mjm(ajct ajctVar, agab agabVar, aogc aogcVar, zzx zzxVar, ojo ojoVar, aoin aoinVar) {
        this.b = ajctVar;
        this.h = agabVar;
        this.g = aogcVar;
        this.j = zzxVar;
        this.i = ojoVar;
        this.d = aoinVar;
    }

    public final java.lang.String a() {
        return ((defpackage.mit) this.e.b).d;
    }

    public final java.util.List b(java.util.Set set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        akzx akzxVar = this.e;
        for (defpackage.miu miuVar : j$.util.DesugarCollections.unmodifiableList(((defpackage.mit) akzxVar.b).c)) {
            defpackage.miy miyVarB = defpackage.miy.b(miuVar.h);
            if (miyVarB == null) {
                miyVarB = defpackage.miy.UNKNOWN;
            }
            if (!set.contains(miyVarB)) {
                arrayList.add(miuVar);
            }
        }
        akzxVar.u();
        ((defpackage.mit) akzxVar.b).c = albq.a;
        return arrayList;
    }

    public final void c() {
        ajbg ajbgVarD = this.i.d(android.provider.CallLog.Calls.CONTENT_URI, new java.lang.String[]{"number"}, "type = 2", (java.lang.String[]) null, "date DESC LIMIT 1");
        ajbc ajbcVarE = ahqx.e(new kwb(2));
        ajct ajctVar = this.b;
        this.g.s(ahrv.g(ajbgVarD.c(ajbcVarE, ajctVar).h()).i(new defpackage.lhy(this, 18), ajctVar), a);
    }

    public final ajcq d(java.lang.String str, java.util.Set set) {
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(this.j.k().e()).filter(new defpackage.jty(set, 10)).map(new defpackage.jil(str, 13)).collect(aido.a);
        return ahvr.aj(aifyVar).p(new defpackage.jsr(this, aifyVar, set, 9), this.b);
    }
}
