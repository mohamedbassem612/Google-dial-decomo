package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kek implements defpackage.kfh {
    private final defpackage.aoss a;
    private final defpackage.aoir b;
    private final defpackage.aoir c;
    private final defpackage.aoir d;
    private final defpackage.rsr e;

    public kek(defpackage.aoss aossVar, defpackage.rsr rsrVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zzx zzxVar3) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = aossVar;
        this.e = rsrVar;
        this.b = new defpackage.aoiy(new defpackage.jza(zzxVar, 11));
        this.c = new defpackage.aoiy(new defpackage.jza(zzxVar2, 12));
        this.d = new defpackage.aoiy(new defpackage.jza(zzxVar3, 13));
    }

    private final java.util.Set j() {
        java.lang.Object objA = this.d.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return (java.util.Set) objA;
    }

    private final java.util.Set k() {
        java.lang.Object objA = this.c.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return (java.util.Set) objA;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("CallLogChangeBroadcaster");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        return defpackage.aosv.F(this.a, 0, new defpackage.jzw(this, kfjVar, (defpackage.aoln) null, 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.Map map, defpackage.aoln aolnVar) {
        keh kehVar;
        if (aolnVar instanceof keh) {
            kehVar = (keh) aolnVar;
            int i = kehVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kehVar.c = i - Integer.MIN_VALUE;
            } else {
                kehVar = new keh(this, aolnVar);
            }
        } else {
            kehVar = new keh(this, aolnVar);
        }
        java.lang.Object objAf = kehVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kehVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAf);
            if (map.isEmpty()) {
                return defpackage.aokc.a;
            }
            defpackage.rsr rsrVar = this.e;
            java.util.Set setKeySet = map.keySet();
            kehVar.c = 1;
            objAf = rsrVar.af(setKeySet, kehVar);
            if (objAf == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAf);
        }
        return ((java.util.Map) objAf).values();
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.util.Set set, defpackage.aoln aolnVar) {
        defpackage.keg kegVar;
        if (aolnVar instanceof defpackage.keg) {
            kegVar = (defpackage.keg) aolnVar;
            int i = kegVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kegVar.c = i - Integer.MIN_VALUE;
            } else {
                kegVar = new defpackage.keg(this, aolnVar);
            }
        } else {
            kegVar = new defpackage.keg(this, aolnVar);
        }
        java.lang.Object objAf = kegVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kegVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAf);
            if (set.isEmpty()) {
                return defpackage.aokc.a;
            }
            defpackage.rsr rsrVar = this.e;
            kegVar.c = 1;
            objAf = rsrVar.af(set, kegVar);
            if (objAf == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAf);
        }
        return ((java.util.Map) objAf).values();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kek] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aoss] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final java.lang.Object g(defpackage.aoss aossVar, defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        defpackage.kei keiVar;
        ?? r5;
        if (aolnVar instanceof defpackage.kei) {
            keiVar = (defpackage.kei) aolnVar;
            int i = keiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                keiVar.d = i - Integer.MIN_VALUE;
            } else {
                keiVar = new defpackage.kei(this, aolnVar);
            }
        } else {
            keiVar = new defpackage.kei(this, aolnVar);
        }
        java.lang.Object objF = keiVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = keiVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objF);
            if (!j().isEmpty()) {
                java.util.Set set = ((defpackage.kfk) kfjVar).c;
                keiVar.a = aossVar;
                keiVar.d = 1;
                objF = f(set, keiVar);
                if (objF == aoluVar) {
                    r5 = aossVar;
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = keiVar.a;
        defpackage.aooc.af(objF);
        r5 = obj;
        r5 = aossVar;
        java.util.Collection collection = (java.util.Collection) objF;
        if (!collection.isEmpty()) {
            java.util.Iterator it = j().iterator();
            while (it.hasNext()) {
                defpackage.aoov.an(r5, null, 0, new jpj((defpackage.keo) it.next(), collection, (defpackage.aoln) null, 14), 3);
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kek] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aoss] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final java.lang.Object h(defpackage.aoss aossVar, defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        defpackage.kej kejVar;
        ?? r5;
        if (aolnVar instanceof defpackage.kej) {
            kejVar = (defpackage.kej) aolnVar;
            int i = kejVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kejVar.d = i - Integer.MIN_VALUE;
            } else {
                kejVar = new defpackage.kej(this, aolnVar);
            }
        } else {
            kejVar = new defpackage.kej(this, aolnVar);
        }
        java.lang.Object objC = kejVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kejVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            if (!k().isEmpty()) {
                java.util.Map map = ((defpackage.kfk) kfjVar).b;
                kejVar.a = aossVar;
                kejVar.d = 1;
                objC = c(map, kejVar);
                if (objC == aoluVar) {
                    r5 = aossVar;
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = kejVar.a;
        defpackage.aooc.af(objC);
        r5 = obj;
        r5 = aossVar;
        java.util.Collection collection = (java.util.Collection) objC;
        if (!collection.isEmpty()) {
            java.util.Iterator it = k().iterator();
            while (it.hasNext()) {
                defpackage.aoov.an(r5, null, 0, new jpj((keq) it.next(), collection, (defpackage.aoln) null, 16), 3);
            }
        }
        return defpackage.aojh.a;
    }

    public final java.util.Set i() {
        java.lang.Object objA = this.b.a();
        defpackage.aooh.e(objA, "getValue(...)");
        return (java.util.Set) objA;
    }
}
