package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lqz implements defpackage.kel {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    private final java.lang.Object d;
    private final java.lang.Object e;

    public lqz(defpackage.tkl tklVar, defpackage.gpd gpdVar, defpackage.aolr aolrVar, int i) {
        this.$cid = i;
        if (gpdVar == null) {
            defpackage.aooh.i("haloCallLogReader");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.c = tklVar;
        this.a = gpdVar;
        this.d = aolrVar;
        this.b = defpackage.ken.HALO;
        defpackage.kgu kguVar = defpackage.kgu.a;
        defpackage.albn albnVarM = defpackage.alad.M(defpackage.kgu.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.e = new defpackage.ker(albnVarM);
    }

    @Override // defpackage.kes
    public final /* synthetic */ java.lang.Object a() {
        return this.$cid != 0 ? this.b : this.e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5 A[LOOP:1: B:40:0x00ef->B:42:0x00f5, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.kes
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        lqy lqyVar;
        ?? r8;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        ?? r7;
        java.util.Map map;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        lsv lsvVar;
        lra lraVar;
        if (this.$cid != 0) {
            return defpackage.aoov.aj(this.d, new khg(this, list, (defpackage.aoln) null, 2), aolnVar);
        }
        if (aolnVar instanceof lqy) {
            lqyVar = (lqy) aolnVar;
            int i = lqyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lqyVar.d = i - Integer.MIN_VALUE;
            } else {
                lqyVar = new lqy(this, aolnVar);
            }
        } else {
            lqyVar = new lqy(this, aolnVar);
        }
        java.lang.Object objE = lqyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lqyVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            if (((defpackage.lrb) this.a).b()) {
                java.lang.Object obj2 = this.b;
                lqyVar.a = list;
                lqyVar.d = 1;
                objE = ((defpackage.kaw) obj2).e(lqyVar);
                if (objE != aoluVar) {
                }
                r8 = list;
                obj = list;
                return aoluVar;
            }
            r8 = list;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r8, 10));
            for (kdy kdyVar : r8) {
                arrayList.add(null);
            }
            return arrayList;
        }
        if (i2 == 1) {
            java.lang.Object obj3 = lqyVar.a;
            defpackage.aooc.af(objE);
            obj = obj3;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj4 = lqyVar.a;
            defpackage.aooc.af(objE);
            r7 = obj4;
        }
        map = (java.util.Map) objE;
        arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(r7, 10));
        it = r7.iterator();
        while (it.hasNext()) {
            lsvVar = (lsv) map.get(new java.lang.Long(((kdy) it.next()).b));
            if (lsvVar != null) {
                defpackage.akzx akzxVarM = lra.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                lra lraVar2 = akzxVarM.b;
                lraVar2.b |= 1;
                lraVar2.c = lsvVar.a;
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                lraVar = (lra) aladVarR;
            } else {
                lraVar = null;
            }
            arrayList2.add(lraVar);
        }
        return arrayList2;
        r8 = list;
        obj = list;
        r8 = obj;
        if (((java.lang.Boolean) objE).booleanValue()) {
            java.lang.Object obj5 = this.d;
            lqyVar.a = obj;
            lqyVar.d = 2;
            defpackage.rsr rsrVar = (defpackage.rsr) obj5;
            objE = defpackage.aoov.aj(rsrVar.a, new ksy(rsrVar, (defpackage.aoln) null, 14, (byte[]) null), lqyVar);
            if (objE != aoluVar) {
                r7 = obj;
                map = (java.util.Map) objE;
                arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(r7, 10));
                it = r7.iterator();
                while (it.hasNext()) {
                    lsvVar = (lsv) map.get(new java.lang.Long(((kdy) it.next()).b));
                    if (lsvVar != null) {
                        defpackage.akzx akzxVarM2 = lra.a.m();
                        defpackage.aooh.f(akzxVarM2, "builder");
                        akzxVarM2.u();
                        lra lraVar3 = akzxVarM2.b;
                        lraVar3.b |= 1;
                        lraVar3.c = lsvVar.a;
                        defpackage.alad aladVarR2 = akzxVarM2.r();
                        defpackage.aooh.e(aladVarR2, "build(...)");
                        lraVar = (lra) aladVarR2;
                    } else {
                        lraVar = null;
                    }
                    arrayList2.add(lraVar);
                }
                return arrayList2;
            }
            r8 = list;
            obj = list;
            return aoluVar;
        }
        r8 = list;
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r8, 10));
        while (r8.hasNext()) {
            arrayList.add(null);
        }
        return arrayList;
    }

    @Override // defpackage.kel
    public final /* synthetic */ boolean c(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            return hgt.x(obj);
        }
        defpackage.aooh.f((defpackage.kgu) obj, "data1");
        return true;
    }

    @Override // defpackage.kes
    public final defpackage.ker d() {
        return (defpackage.ker) (this.$cid != 0 ? this.e : this.c);
    }

    public lqz(defpackage.rsr rsrVar, defpackage.lrb lrbVar, defpackage.kaw kawVar, int i) {
        this.$cid = i;
        this.d = rsrVar;
        this.a = lrbVar;
        this.b = kawVar;
        this.e = defpackage.ken.CONTACT_CHECKER;
        lra lraVar = lra.a;
        defpackage.albn albnVarM = defpackage.alad.M(lra.class);
        defpackage.aooh.e(albnVarM, "parser(...)");
        this.c = new defpackage.ker(albnVarM);
    }
}
