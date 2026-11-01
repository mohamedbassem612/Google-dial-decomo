package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sqc implements defpackage.kfh {
    public java.util.Map a;
    public java.util.Set b;
    public final defpackage.sqi c;
    public final defpackage.rsr d;
    public final defpackage.rsr e;
    public final defpackage.gus f;
    private final defpackage.ecx g;
    private final defpackage.aoss h;

    public sqc(defpackage.sqi sqiVar, defpackage.rsr rsrVar, defpackage.rsr rsrVar2, defpackage.ecx ecxVar, defpackage.aoss aossVar, defpackage.gus gusVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (gusVar == null) {
            defpackage.aooh.i("numberAttributesBuilder");
        }
        this.c = sqiVar;
        this.d = rsrVar;
        this.e = rsrVar2;
        this.g = ecxVar;
        this.h = aossVar;
        this.f = gusVar;
        this.a = defpackage.aokd.a;
        this.b = defpackage.aoke.a;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("PhoneLookupDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        return defpackage.aosv.F(this.h, 0, new defpackage.spx(this, kfjVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        defpackage.spy spyVar;
        if (aolnVar instanceof defpackage.spy) {
            spyVar = (defpackage.spy) aolnVar;
            int i = spyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                spyVar.c = i - Integer.MIN_VALUE;
            } else {
                spyVar = new defpackage.spy(this, aolnVar);
            }
        } else {
            spyVar = new defpackage.spy(this, aolnVar);
        }
        java.lang.Object objAe = spyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = spyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAe);
            defpackage.rsr rsrVar = this.e;
            spyVar.d = (defpackage.kfk) kfjVar;
            spyVar.c = 1;
            objAe = rsrVar.ae(spyVar);
            if (objAe == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kfjVar = spyVar.d;
            defpackage.aooc.af(objAe);
        }
        java.util.Map map = (java.util.Map) objAe;
        int size = map.size();
        java.util.Map map2 = ((defpackage.kfk) kfjVar).a;
        defpackage.aola aolaVar = new defpackage.aola(size + map2.size());
        for (java.util.Map.Entry entry : map2.entrySet()) {
            java.lang.Long l = (java.lang.Long) entry.getKey();
            android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
            if (l == null) {
                defpackage.aooh.g();
            }
            byte[] asByteArray = contentValues.getAsByteArray("number");
            hkd hkdVarE = defpackage.alad.E(hkd.a, asByteArray, 0, asByteArray.length, defpackage.akzq.a());
            defpackage.alad.V(hkdVarE);
            hkd hkdVar = hkdVarE;
            defpackage.aooh.e(hkdVar, "parseFrom(...)");
            aolaVar.put(l, hkdVar);
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            long jLongValue = ((java.lang.Number) entry2.getKey()).longValue();
            hkd hkdVarB = ((kdy) entry2.getValue()).b();
            if (hkdVarB != null) {
            }
        }
        return aolaVar.e();
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aosv.F(this.h, 0, new tmn(this, (defpackage.aoln) null, 1), 3);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        return defpackage.aosv.F(this.h, 0, new defpackage.mev(this, (defpackage.aoln) null, 19, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        defpackage.spz spzVar;
        if (aolnVar instanceof defpackage.spz) {
            spzVar = (defpackage.spz) aolnVar;
            int i = spzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                spzVar.c = i - Integer.MIN_VALUE;
            } else {
                spzVar = new defpackage.spz(this, aolnVar);
            }
        } else {
            spzVar = new defpackage.spz(this, aolnVar);
        }
        java.lang.Object objAu = spzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = spzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aoxh aoxhVarB = this.g.b();
            spzVar.c = 1;
            objAu = defpackage.aoov.au(aoxhVarB, spzVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        return new java.lang.Long(((defpackage.sqd) objAu).c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, defpackage.aoln aolnVar) {
        sqb sqbVar;
        if (aolnVar instanceof sqb) {
            sqbVar = (sqb) aolnVar;
            int i = sqbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqbVar.c = i - Integer.MIN_VALUE;
            } else {
                sqbVar = new sqb(this, aolnVar);
            }
        } else {
            sqbVar = new sqb(this, aolnVar);
        }
        java.lang.Object obj = sqbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sqbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.g;
            mnx mnxVar = new mnx(j, (defpackage.aoln) null, 2, (char[]) null);
            sqbVar.c = 1;
            if (ecxVar.a(mnxVar, sqbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
