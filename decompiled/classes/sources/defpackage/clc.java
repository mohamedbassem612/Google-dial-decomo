package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class clc implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ clc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [dao, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z = true;
        boolean zDispatchTouchEvent = false;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((java.util.List) obj).retainAll(this.a));
            case 1:
                return java.lang.Boolean.valueOf(this.a.contains(obj));
            case 2:
                defpackage.cou couVar = ((defpackage.deg) defpackage.cfo.C(this.a)).F;
                defpackage.cpg cpgVarB = couVar.b();
                if (cpgVarB != null && rx.w(cpgVarB)) {
                    couVar.j(true, true, 8);
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.cnt cntVar = (defpackage.cnt) obj;
                if (!cntVar.D) {
                    return ddg.b;
                }
                defpackage.cnt cntVar2 = cntVar.d;
                defpackage.aonj aonjVar = cntVar.a;
                cntVar.d = null;
                defpackage.cnt cntVar3 = cntVar.d;
                defpackage.aoop aoopVar = (defpackage.aoop) this.a;
                aoopVar.a = aoopVar.a;
                return ddg.a;
            case 4:
                ((defpackage.czb) obj).u((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 5:
                defpackage.cra craVar = (defpackage.cra) obj;
                craVar.y(craVar.a() * 3.0f);
                cog cogVar = (cog) this.a;
                craVar.z(cogVar.b);
                craVar.s(cogVar.d);
                craVar.p(-72057594037927936L);
                craVar.A(-72057594037927936L);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ctt cttVar = (defpackage.ctt) obj;
                defpackage.csv csvVar = (defpackage.csv) this.a;
                csvVar.d(cttVar);
                defpackage.aonj aonjVar2 = csvVar.e;
                if (aonjVar2 != null) {
                    aonjVar2.a(cttVar);
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ctu ctuVar = (defpackage.ctu) this.a;
                ctuVar.c = true;
                ctuVar.d.a();
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.csj csjVar = (defpackage.csj) obj;
                defpackage.ctu ctuVar2 = (defpackage.ctu) this.a;
                float f = ctuVar2.g;
                float f2 = ctuVar2.h;
                defpackage.csg csgVarQ = csjVar.q();
                long jA = csgVarQ.a();
                csgVarQ.b().g();
                defpackage.csv csvVar2 = ctuVar2.a;
                try {
                    csgVarQ.c.q(f, f2, 0L);
                    csvVar2.b(csjVar);
                    return defpackage.aojh.a;
                } finally {
                    csgVarQ.b().e();
                    csgVarQ.h(jA);
                }
            case 9:
                defpackage.ddh ddhVar = (defpackage.ddh) obj;
                defpackage.aomy aomyVar = defpackage.cuv.a;
                if (ddhVar.L().D) {
                    ((defpackage.aoot) this.a).a = ddhVar;
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 10:
                cva cvaVar = (cva) obj;
                defpackage.aoot aootVar = (defpackage.aoot) this.a;
                if (aootVar.a != null) {
                    boolean z2 = cvaVar.a;
                } else if (cvaVar.b) {
                    aootVar.a = cvaVar;
                }
                return java.lang.Boolean.TRUE;
            case 11:
                if (!((cva) obj).b) {
                    return ddg.a;
                }
                ((defpackage.aoop) this.a).a = false;
                return ddg.c;
            case 12:
                ((cvs) this.a).d().a((android.view.MotionEvent) obj);
                return defpackage.aojh.a;
            case 13:
                ((cvs) this.a).d().a((android.view.MotionEvent) obj);
                return defpackage.aojh.a;
            case 14:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                java.lang.Object obj2 = this.a;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        zDispatchTouchEvent = ((dqc) obj2).dispatchTouchEvent(motionEvent);
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 10:
                        dqc dqcVar = (dqc) obj2;
                        defpackage.dcv dcvVar = dqcVar.x.k;
                        defpackage.dcv dcvVar2 = true == (dcvVar instanceof defpackage.deg) ? dcvVar : null;
                        if (dcvVar2 == null || !((defpackage.deg) dcvVar2).q.E()) {
                            zDispatchTouchEvent = dqcVar.dispatchGenericMotionEvent(motionEvent);
                        }
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    default:
                        zDispatchTouchEvent = ((dqc) obj2).dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return java.lang.Boolean.valueOf(zDispatchTouchEvent);
            case 15:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 16:
                defpackage.czb czbVar = (defpackage.czb) obj;
                ?? r8 = this.a;
                int size = r8.size();
                for (int i = 0; i < size; i++) {
                    defpackage.czb.B(czbVar, (defpackage.czc) r8.get(i), 0, 0);
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.dah dahVar = (defpackage.dah) obj;
                if (dahVar.h() != Integer.MAX_VALUE) {
                    java.lang.Object obj3 = this.a;
                    if (dahVar.i().b) {
                        if (((defpackage.dag) obj3).a.q()) {
                            boolean zQ = dahVar.q();
                            dahVar.p(true);
                            dahVar.m();
                            dahVar.p(zQ);
                        } else {
                            dahVar.m();
                        }
                    }
                    for (java.util.Map.Entry entry : dahVar.i().h.entrySet()) {
                        ((defpackage.dag) obj3).d((defpackage.cwk) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), dahVar.k());
                    }
                    defpackage.dck dckVar = dahVar.k().A;
                    if (dckVar == null) {
                        defpackage.aooh.g();
                    }
                    while (true) {
                        defpackage.dag dagVar = (defpackage.dag) obj3;
                        if (!defpackage.aooh.n(dckVar, dagVar.a.k())) {
                            for (defpackage.cwk cwkVar : dagVar.c(dckVar).keySet()) {
                                dagVar.d(cwkVar, dagVar.a(dckVar, cwkVar), dckVar);
                            }
                            dckVar = dckVar.A;
                            if (dckVar == null) {
                                defpackage.aooh.g();
                            }
                        }
                    }
                }
                return defpackage.aojh.a;
            case 18:
                java.lang.Class cls = defpackage.deg.a;
                ((defpackage.aoot) this.a).a = (defpackage.cpg) obj;
                return java.lang.Boolean.TRUE;
            case 19:
                return java.lang.Boolean.valueOf(((defpackage.cpg) obj).i(((cok) this.a).a));
            default:
                return java.lang.Boolean.valueOf(((defpackage.aco) this.a).b(((defpackage.dij) obj).c));
        }
    }
}
