package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazs implements defpackage.acvk {
    private static final defpackage.aimz b = defpackage.aimz.i("com/google/android/libraries/abuse/hades/download/PersephoneFileGroupPopulator");
    public final defpackage.aazd a;
    private final defpackage.aoss c;
    private final defpackage.aonj d;
    private final defpackage.ahyn e;
    private final defpackage.aonj f;
    private final defpackage.ahyn g;
    private final defpackage.aazz h;

    public aazs(defpackage.aazz aazzVar, defpackage.aoss aossVar, defpackage.aazd aazdVar, defpackage.aonj aonjVar, defpackage.ahyn ahynVar, defpackage.aonj aonjVar2, defpackage.ahyn ahynVar2) {
        defpackage.aooh.f(aonjVar, "labelsSupplier");
        defpackage.aooh.f(aonjVar2, "populatorIsEnabledFlag");
        this.h = aazzVar;
        this.c = aossVar;
        this.a = aazdVar;
        this.d = aonjVar;
        this.e = ahynVar;
        this.f = aonjVar2;
        this.g = ahynVar2;
    }

    @Override // defpackage.acvk
    public final defpackage.ajcq a(defpackage.acwi acwiVar) {
        defpackage.aooh.f(acwiVar, "mobileDataDownload");
        return defpackage.aosv.F(this.c, 0, new defpackage.ytl(this, acwiVar, (defpackage.aoln) null, 18), 3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[Catch: Exception -> 0x0109, acvh -> 0x011a, TryCatch #2 {acvh -> 0x011a, Exception -> 0x0109, blocks: (B:15:0x0030, B:46:0x00f9, B:20:0x003f, B:41:0x00cf, B:43:0x00d5, B:44:0x00e5, B:23:0x004a, B:38:0x00be, B:32:0x008e, B:34:0x00a2, B:35:0x00a7), top: B:67:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5 A[Catch: Exception -> 0x0109, acvh -> 0x011a, TryCatch #2 {acvh -> 0x011a, Exception -> 0x0109, blocks: (B:15:0x0030, B:46:0x00f9, B:20:0x003f, B:41:0x00cf, B:43:0x00d5, B:44:0x00e5, B:23:0x004a, B:38:0x00be, B:32:0x008e, B:34:0x00a2, B:35:0x00a7), top: B:67:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [acwi] */
    /* JADX WARN: Type inference failed for: r12v25 */
    public final java.lang.Object b(defpackage.acwi acwiVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        aazr aazrVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.aazd aazdVar;
        defpackage.aazz aazzVar;
        ?? r12;
        aazw aazwVar;
        defpackage.ajcq ajcqVarE;
        if (aolnVar instanceof aazr) {
            aazrVar = (aazr) aolnVar;
            int i = aazrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aazrVar.d = i - Integer.MIN_VALUE;
            } else {
                aazrVar = new aazr(this, aolnVar);
            }
        } else {
            aazrVar = new aazr(this, aolnVar);
        }
        java.lang.Object objA = aazrVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aazrVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    java.lang.Object obj3 = aazrVar.a;
                    defpackage.aooc.af(objA);
                    obj = obj3;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        aazdVar = aazrVar.f;
                        aazzVar = aazrVar.e;
                        java.lang.Object obj4 = aazrVar.a;
                        defpackage.aooc.af(objA);
                        obj2 = obj4;
                        aazrVar.a = obj2;
                        aazrVar.e = null;
                        aazrVar.f = null;
                        aazrVar.d = 4;
                        objA = aazzVar.a(aazdVar, (java.util.Map) objA, aazrVar);
                        if (objA != aoluVar) {
                            return aoluVar;
                        }
                        r12 = obj2;
                        aazwVar = (aazw) objA;
                        if (aazwVar.c == 2) {
                            ((defpackage.adae) ((defpackage.ahys) this.g).a).E(this.a, 4, 1);
                            return defpackage.aojh.a;
                        }
                        ajcqVarE = vqy.e((defpackage.acwi) r12, aazwVar.b, this.e, defpackage.aokc.a);
                        aazrVar.a = null;
                        aazrVar.d = 5;
                        if (defpackage.aosv.D(ajcqVarE, aazrVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (i2 == 4) {
                        java.lang.Object obj5 = aazrVar.a;
                        defpackage.aooc.af(objA);
                        r12 = obj5;
                        aazwVar = (aazw) objA;
                        if (aazwVar.c == 2) {
                            ((defpackage.adae) ((defpackage.ahys) this.g).a).E(this.a, 4, 1);
                            return defpackage.aojh.a;
                        }
                        ajcqVarE = vqy.e((defpackage.acwi) r12, aazwVar.b, this.e, defpackage.aokc.a);
                        aazrVar.a = null;
                        aazrVar.d = 5;
                        if (defpackage.aosv.D(ajcqVarE, aazrVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(objA);
                    }
                    ((defpackage.adae) ((defpackage.ahys) this.g).a).E(this.a, 1, 1);
                } else {
                    defpackage.aooc.af(objA);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(objA);
            defpackage.aonj aonjVar = this.f;
            aazrVar.a = acwiVar;
            aazrVar.d = 1;
            objA = aonjVar.a(aazrVar);
            if (objA == aoluVar) {
                obj = acwiVar;
                return aoluVar;
            }
            obj = acwiVar;
            if (((java.lang.Boolean) objA).booleanValue()) {
                defpackage.adae adaeVar = (defpackage.adae) ((defpackage.ahys) this.g).a;
                defpackage.aazd aazdVar2 = this.a;
                defpackage.abav abavVarL = ((defpackage.acxg) adaeVar.a).l(aazdVar2);
                if (abavVarL != null) {
                    abavVarL.e(aazdVar2, 17);
                }
                defpackage.aazz aazzVar2 = this.h;
                defpackage.aonj aonjVar2 = this.d;
                aazrVar.a = obj;
                aazrVar.e = aazzVar2;
                aazrVar.f = aazdVar2;
                aazrVar.d = 3;
                java.lang.Object objA2 = aonjVar2.a(aazrVar);
                if (objA2 == aoluVar) {
                    return aoluVar;
                }
                obj2 = obj;
                aazdVar = aazdVar2;
                aazzVar = aazzVar2;
                objA = objA2;
                aazrVar.a = obj2;
                aazrVar.e = null;
                aazrVar.f = null;
                aazrVar.d = 4;
                objA = aazzVar.a(aazdVar, (java.util.Map) objA, aazrVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                r12 = obj2;
                aazwVar = (aazw) objA;
                if (aazwVar.c == 2) {
                    ((defpackage.adae) ((defpackage.ahys) this.g).a).E(this.a, 4, 1);
                    return defpackage.aojh.a;
                }
                ajcqVarE = vqy.e((defpackage.acwi) r12, aazwVar.b, this.e, defpackage.aokc.a);
                aazrVar.a = null;
                aazrVar.d = 5;
                if (defpackage.aosv.D(ajcqVarE, aazrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.adae) ((defpackage.ahys) this.g).a).E(this.a, 1, 1);
            } else {
                ((defpackage.aimw) b.b().l("com/google/android/libraries/abuse/hades/download/PersephoneFileGroupPopulator", "refreshFileGroupsInternal", 77, "PersephoneFileGroupPopulator.kt")).y("populator is disabled for client %s, skipping manifest refresh", this.a);
            }
            return defpackage.aojh.a;
        } catch (defpackage.acvh e) {
            acvg acvgVar = e.a;
            int i3 = 42;
            if (acvgVar != null) {
                int iOrdinal = acvgVar.ordinal();
                if (iOrdinal != 48) {
                    switch (iOrdinal) {
                        case 62:
                            i3 = 43;
                            break;
                        case 63:
                            i3 = 44;
                            break;
                        case 64:
                            i3 = 45;
                            break;
                        case 65:
                            i3 = 46;
                            break;
                        case 66:
                            i3 = 55;
                            break;
                    }
                } else {
                    i3 = 52;
                }
            }
            defpackage.ahyn ahynVar = this.g;
            ((defpackage.adae) ((defpackage.ahys) ahynVar).a).E(this.a, 2, i3);
            throw e;
        } catch (java.lang.Exception e2) {
            defpackage.ahyn ahynVar2 = this.g;
            ((defpackage.adae) ((defpackage.ahys) ahynVar2).a).E(this.a, 2, 50);
            throw e2;
        }
    }
}
