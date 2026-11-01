package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyj extends defpackage.eoa {
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();
    public final defpackage.agti c = new defpackage.agti("SubscriptionMixinVM");
    public final java.util.Set d = new java.util.HashSet();
    public final defpackage.agtg e;
    public final java.util.concurrent.Executor f;
    public final defpackage.aazc g;
    public final defpackage.aogc i;

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public agyj(defpackage.aazc aazcVar, defpackage.aogc aogcVar, java.util.concurrent.Executor executor) throws afeb {
        this.g = aazcVar;
        this.i = aogcVar;
        this.f = executor;
        defpackage.agtg agtgVar = new defpackage.agtg(executor, true, false, false);
        this.e = agtgVar;
        agtgVar.d();
    }

    public final void a(defpackage.agxi agxiVar, defpackage.agyn agynVar, defpackage.agye agyeVar) {
        defpackage.afec.c();
        b(agxiVar, agyeVar, agynVar, defpackage.ahwt.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void b(defpackage.agxi agxiVar, defpackage.agye agyeVar, defpackage.agyn agynVar, defpackage.ahyn ahynVar) throws afeb {
        defpackage.agym agymVar;
        int iIntValue;
        boolean zAdd;
        if (agxiVar == null) {
            throw new java.lang.NullPointerException("Subscribed to a null DataSource. Are you mocking a DataService? Instead, use the real implementation and mock any stubs/interfaces it calls. See go/mocks#prefer-real-objects");
        }
        if (ahynVar.f()) {
            java.lang.Integer num = (java.lang.Integer) ahynVar.b();
            num.intValue();
            agymVar = (defpackage.agym) j$.util.Map.-EL.computeIfAbsent(this.b, num, new pgq(this, agxiVar, 19));
        } else {
            agymVar = (defpackage.agym) j$.util.Map.-EL.computeIfAbsent(this.a, agyeVar.getClass(), new defpackage.sqg(this, agxiVar, 4));
        }
        defpackage.agym agymVar2 = agymVar;
        if (ahynVar.f()) {
            zAdd = this.d.add(ahynVar.b());
        } else {
            defpackage.agti agtiVar = this.c;
            defpackage.afec.c();
            java.lang.Class<?> cls = agyeVar.getClass();
            defpackage.aca acaVar = agtiVar.c;
            if (acaVar.containsKey(cls)) {
                iIntValue = ((java.lang.Integer) acaVar.get(cls)).intValue();
            } else {
                int andIncrement = defpackage.agti.a.getAndIncrement();
                acaVar.put(cls, java.lang.Integer.valueOf(andIncrement));
                iIntValue = andIncrement;
            }
            zAdd = agtiVar.b.put(java.lang.Integer.valueOf(iIntValue), agyeVar) == null;
        }
        if (agxiVar.e() == null) {
            throw new java.lang.NullPointerException("Cannot subscribe with a null key");
        }
        if ((agyeVar instanceof defpackage.agyd) && (agyeVar instanceof defpackage.agxf)) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.agyb agybVar = agymVar2.f;
        java.lang.Object obj = agybVar.b;
        defpackage.aazc aazcVar = agymVar2.j;
        long j = agybVar.d;
        boolean z = j != Long.MAX_VALUE;
        j$.time.Instant instantNow = j$.time.Instant.now();
        defpackage.ahvr.bZ(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        agyeVar.getClass();
        agymVar2.f = new defpackage.agyb(agxiVar, agxiVar.e(), agynVar, j + 1, 3, agybVar.e.a(agxiVar, instantNow));
        defpackage.agyg agygVar = agymVar2.g;
        agymVar2.g = new defpackage.agyg(agygVar.b + 1, agyeVar, agygVar.d, agygVar.e, defpackage.ahwt.a);
        if (agymVar2.c == null) {
            agymVar2.c = new defpackage.agyl(agymVar2);
            agymVar2.k.u(agymVar2.f.b, agymVar2.c);
        } else if (!agymVar2.f.b.equals(obj)) {
            defpackage.aogc aogcVar = agymVar2.k;
            aogcVar.v(obj, agymVar2.c);
            aogcVar.u(agymVar2.f.b, agymVar2.c);
        }
        if (zAdd) {
            defpackage.agyg agygVar2 = agymVar2.g;
            if (agygVar2.e.f()) {
                defpackage.ahvr.bZ(!agygVar2.f.f(), "Cannot be the case that subscription has data.");
                defpackage.agyg agygVar3 = agymVar2.g;
                agymVar2.g = defpackage.agym.j(agygVar3, (defpackage.agxr) agygVar3.e.b());
                defpackage.ahvr.bZ(agymVar2.g.f.f(), "Callbacks did not accept pinned data after rotation.");
                if (!(agymVar2.g.c instanceof defpackage.agxf) || agymVar2.h.b()) {
                    return;
                }
                agymVar2.g = agymVar2.g.b(true);
                defpackage.agym.f((defpackage.agxf) agymVar2.g.c);
                return;
            }
        }
        agymVar2.e(agymVar2.f.e);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.eoa
    protected final void d() throws afeb {
        java.util.Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((defpackage.agym) it.next()).a();
        }
        java.util.Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((defpackage.agym) it2.next()).a();
        }
        this.e.a().clear();
    }
}
