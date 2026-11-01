package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sps implements iph {
    private final rsr a;

    public sps(rsr rsrVar) {
        this.a = rsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.io.OutputStream outputStream, aoln aolnVar) {
        defpackage.spq spqVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.spq) {
            spqVar = (defpackage.spq) aolnVar;
            int i = spqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                spqVar.d = i - Integer.MIN_VALUE;
            } else {
                spqVar = new defpackage.spq(this, aolnVar);
            }
        } else {
            spqVar = new defpackage.spq(this, aolnVar);
        }
        java.lang.Object objH = spqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = spqVar.d;
        if (i2 == 0) {
            aooc.af(objH);
            rsr rsrVar = this.a;
            spqVar.a = outputStream;
            spqVar.d = 1;
            objH = rsrVar.h(spqVar);
            if (objH == aoluVar) {
                obj = outputStream;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = spqVar.a;
            aooc.af(objH);
            obj = obj2;
        }
        obj = outputStream;
        for (defpackage.srn srnVar : ((java.util.Map) objH).values()) {
            aooh.f(srnVar, "<this>");
            akzx akzxVarM = defpackage.sqx.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.String str = srnVar.a;
            aooh.f(str, "value");
            akzxVarM.u();
            defpackage.sqx sqxVar = (defpackage.sqx) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            sqxVar.c = str;
            defpackage.ryu ryuVarH = defpackage.sns.h(srnVar.b.p());
            ryuVarH.d();
            defpackage.spn spnVarC = ryuVarH.c();
            aooh.f(spnVarC, "value");
            akzxVarM.u();
            defpackage.sqx sqxVar2 = (defpackage.sqx) akzxVarM.b;
            j$.util.Objects.requireNonNull(spnVarC);
            sqxVar2.d = spnVarC;
            sqxVar2.b |= 1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            ((defpackage.sqx) aladVarP).g((java.io.OutputStream) obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Map] */
    public final java.lang.Object b(java.io.InputStream inputStream, aoln aolnVar) {
        defpackage.spr sprVar;
        ?? r14;
        defpackage.spn spnVarC;
        if (aolnVar instanceof defpackage.spr) {
            sprVar = (defpackage.spr) aolnVar;
            int i = sprVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sprVar.d = i - Integer.MIN_VALUE;
            } else {
                sprVar = new defpackage.spr(this, aolnVar);
            }
        } else {
            sprVar = new defpackage.spr(this, aolnVar);
        }
        java.lang.Object objF = sprVar.b;
        aolu aoluVar = aolu.a;
        int i2 = sprVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = sprVar.a;
                aooc.af(objF);
                r14 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objF);
            }
            return ipg.a;
        }
        aooc.af(objF);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (true) {
            defpackage.sqx sqxVar = (defpackage.sqx) defpackage.sqx.u(defpackage.sqx.a, inputStream, akzq.a());
            if (sqxVar == null) {
                break;
            }
            java.lang.String str = sqxVar.c;
            defpackage.spn spnVar = sqxVar.d;
            if (spnVar == null) {
                spnVar = defpackage.spn.a;
            }
            linkedHashMap.put(str, spnVar);
        }
        if (linkedHashMap.isEmpty()) {
            return ipg.a;
        }
        rsr rsrVar = this.a;
        java.util.Set setKeySet = linkedHashMap.keySet();
        sprVar.a = linkedHashMap;
        sprVar.d = 1;
        java.lang.Object objD = ((srl) rsrVar.b).d(setKeySet, sprVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        objF = objD;
        r14 = linkedHashMap;
        java.util.Map map = (java.util.Map) objF;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(ajsz.aL(r14.size()));
        for (java.util.Map.Entry entry : r14.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getKey();
            defpackage.spn spnVar2 = (defpackage.spn) entry.getValue();
            defpackage.srn srnVar = (defpackage.srn) map.get(str2);
            if (srnVar != null) {
                defpackage.ryu ryuVarH = defpackage.sns.h(srnVar.b.p());
                akzx akzxVar = (akzx) ryuVarH.a;
                defpackage.spc spcVar = ((defpackage.spn) akzxVar.b).i;
                if (spcVar == null) {
                    spcVar = defpackage.spc.a;
                }
                aooh.e(spcVar, "getCnapInfo(...)");
                defpackage.spc spcVar2 = defpackage.spc.a;
                if (aooh.n(spcVar, spcVar2)) {
                    defpackage.spc spcVar3 = spnVar2.i;
                    if (spcVar3 != null) {
                        spcVar2 = spcVar3;
                    }
                    aooh.e(spcVar2, "getCnapInfo(...)");
                    aooh.f(spcVar2, "value");
                    akzxVar.u();
                    defpackage.spn spnVar3 = (defpackage.spn) akzxVar.b;
                    j$.util.Objects.requireNonNull(spcVar2);
                    spnVar3.i = spcVar2;
                    spnVar3.b |= 64;
                }
                defpackage.spb spbVar = ((defpackage.spn) akzxVar.b).j;
                if (spbVar == null) {
                    spbVar = defpackage.spb.a;
                }
                aooh.e(spbVar, "getCequintInfo(...)");
                defpackage.spb spbVar2 = defpackage.spb.a;
                if (aooh.n(spbVar, spbVar2)) {
                    defpackage.spb spbVar3 = spnVar2.j;
                    if (spbVar3 != null) {
                        spbVar2 = spbVar3;
                    }
                    aooh.e(spbVar2, "getCequintInfo(...)");
                    aooh.f(spbVar2, "value");
                    akzxVar.u();
                    defpackage.spn spnVar4 = (defpackage.spn) akzxVar.b;
                    j$.util.Objects.requireNonNull(spbVar2);
                    spnVar4.j = spbVar2;
                    spnVar4.b |= 128;
                }
                defpackage.zhj zhjVar = ((defpackage.spn) akzxVar.b).l;
                if (zhjVar == null) {
                    zhjVar = defpackage.zhj.a;
                }
                aooh.e(zhjVar, "getDialerGatewayCallInfoLookupApiInfo(...)");
                defpackage.zhj zhjVar2 = defpackage.zhj.a;
                if (aooh.n(zhjVar, zhjVar2)) {
                    defpackage.zhj zhjVar3 = spnVar2.l;
                    if (zhjVar3 != null) {
                        zhjVar2 = zhjVar3;
                    }
                    aooh.e(zhjVar2, "getDialerGatewayCallInfoLookupApiInfo(...)");
                    aooh.f(zhjVar2, "value");
                    akzxVar.u();
                    defpackage.spn spnVar5 = (defpackage.spn) akzxVar.b;
                    j$.util.Objects.requireNonNull(zhjVar2);
                    spnVar5.l = zhjVar2;
                    spnVar5.b |= 512;
                }
                spnVarC = ryuVarH.c();
                if (spnVarC == null) {
                    defpackage.ryu ryuVarH2 = defpackage.sns.h(spnVar2.p());
                    ryuVarH2.d();
                    spnVarC = ryuVarH2.c();
                }
            } else {
                defpackage.ryu ryuVarH3 = defpackage.sns.h(spnVar2.p());
                ryuVarH3.d();
                spnVarC = ryuVarH3.c();
            }
            linkedHashMap2.put(key, spnVarC);
        }
        rsr rsrVar2 = this.a;
        aoke aokeVar = aoke.a;
        sprVar.a = null;
        sprVar.d = 2;
        objF = rsrVar2.f(linkedHashMap2, aokeVar, sprVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        return ipg.a;
    }
}
