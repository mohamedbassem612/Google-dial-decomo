package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bxq implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bxq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v53, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object a() {
        defpackage.byn bynVar;
        java.lang.Object obj;
        dbk dbkVar;
        cpn cpnVar;
        dnw dnwVarA;
        boolean z;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.bgx((defpackage.bwj) this.b, (aoln) null, 18), 3);
                return java.lang.Boolean.TRUE;
            case 1:
                java.lang.Object obj2 = this.b;
                ?? r8 = this.a;
                android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) obj2;
                accessibilityManager.removeAccessibilityStateChangeListener(r8);
                defpackage.byp bypVar = (defpackage.byp) r8;
                accessibilityManager.removeTouchExplorationStateChangeListener(bypVar.a);
                if (android.os.Build.VERSION.SDK_INT >= 33 && (bynVar = bypVar.b) != null) {
                    ae$.ExternalSyntheticApiModelOutline0.m(accessibilityManager, bynVar);
                }
                return aojh.a;
            case 2:
                defpackage.cck cckVar = (defpackage.cck) this.a;
                ((cbt) this.b).al(cckVar.a, cckVar.h, cckVar.b);
                return aojh.a;
            case 3:
                ((defpackage.cnv) this.b).a.a(this.a);
                return aojh.a;
            case 4:
                ((aoot) this.a).a = ((cpg) this.b).b();
                return aojh.a;
            case 5:
                ((cuz) this.a).c((cmv) this.b);
                return aojh.a;
            case 6:
                return java.lang.Boolean.valueOf(deg.al((deg) this.a, (android.view.KeyEvent) this.b));
            case 7:
                return java.lang.Boolean.valueOf(deg.an((deg) this.a, (android.view.MotionEvent) this.b));
            case 8:
                defpackage.dgf dgfVar = (defpackage.dgf) this.a;
                dic dicVar = dgfVar.d;
                dic dicVar2 = dgfVar.e;
                java.lang.Float f = dgfVar.b;
                java.lang.Float f2 = dgfVar.c;
                float fFloatValue = (dicVar == null || f == null) ? 0.0f : ((java.lang.Number) dicVar.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (dicVar2 == null || f2 == null) ? 0.0f : ((java.lang.Number) dicVar2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    java.lang.Object obj3 = this.b;
                    dem demVar = (dem) obj3;
                    int iM = demVar.m(dgfVar.a);
                    ajwz ajwzVar = (ajwz) demVar.q().a(demVar.d);
                    if (ajwzVar != null) {
                        try {
                            defpackage.ebd ebdVar = ((dem) obj3).f;
                            if (ebdVar != null) {
                                ebdVar.p(((dem) obj3).L(ajwzVar));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused) {
                        }
                    }
                    ajwz ajwzVar2 = (ajwz) demVar.q().a(demVar.e);
                    if (ajwzVar2 != null) {
                        try {
                            defpackage.ebd ebdVar2 = ((dem) obj3).g;
                            if (ebdVar2 != null) {
                                ebdVar2.p(((dem) obj3).L(ajwzVar2));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused2) {
                        }
                    }
                    demVar.a.invalidate();
                    ajwz ajwzVar3 = (ajwz) demVar.q().a(iM);
                    if (ajwzVar3 != null && (obj = ajwzVar3.c) != null && (dbkVar = ((dij) obj).a) != null) {
                        if (dicVar != null) {
                            demVar.s.g(iM, dicVar);
                        }
                        if (dicVar2 != null) {
                            demVar.t.g(iM, dicVar2);
                        }
                        demVar.u(dbkVar);
                    }
                }
                if (dicVar != null) {
                    dgfVar.b = (java.lang.Float) dicVar.a.a();
                }
                if (dicVar2 != null) {
                    dgfVar.c = (java.lang.Float) dicVar2.a.a();
                }
                return aojh.a;
            case 9:
                ?? r0 = this.a;
                if (r0 != 0 && (cpnVar = (cpn) r0.a()) != null) {
                    return cpnVar;
                }
                ?? r9 = this.b;
                boolean zU = r9.u();
                cxi cxiVar = r9;
                if (true != zU) {
                    cxiVar = 0;
                }
                if (cxiVar != 0) {
                    return cdh.x(0L, dpy.l(cxiVar.h()));
                }
                return null;
            case 10:
                dny dnyVar = dnz.a;
                dkz dkzVar = (dkz) this.b;
                int iD = dkzVar.d();
                dnx dnxVarQ = dkzVar.q();
                if (dnxVarQ == null) {
                    dnwVarA = ((dnx) this.a).a(0);
                } else {
                    dnwVarA = dnxVarQ.isEmpty() ? null : dnxVarQ.a(0);
                    if (dnwVarA == null) {
                        dnwVarA = ((dnx) this.a).a(0);
                    }
                }
                return dlm.a(dfd.f(iD, dnwVarA));
            case 11:
                ((aoot) this.a).a = cfo.G((dan) this.b, cza.a);
                return aojh.a;
            case 12:
                java.lang.Object obj4 = this.b;
                aooh.f(obj4, "entry");
                aozj aozjVar = ((defpackage.fwp) this.a).g;
                java.util.Set set = (java.util.Set) aozjVar.c();
                aooh.f(set, "<this>");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(ajsz.aL(set.size()));
                boolean z3 = false;
                for (java.lang.Object obj5 : set) {
                    if (z3 || !aooh.n(obj5, obj4)) {
                        z = true;
                        z3 = z3;
                    } else {
                        z3 = true;
                        z = false;
                    }
                    if (z) {
                        linkedHashSet.add(obj5);
                    }
                }
                aozjVar.e(linkedHashSet);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj6 = this.b;
                aooh.f(obj6, "popUpTo");
                java.lang.Object obj7 = this.a;
                synchronized (((defpackage.fwp) obj7).h) {
                    aozj aozjVar2 = ((defpackage.fwp) obj7).f;
                    java.lang.Iterable iterable = (java.lang.Iterable) aozjVar2.c();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj8 : iterable) {
                        if (aooh.n((defpackage.fvs) obj8, obj6)) {
                            aozjVar2.e(arrayList);
                        } else {
                            arrayList.add(obj8);
                        }
                    }
                    aozjVar2.e(arrayList);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.fwn) this.a).g((defpackage.fvs) this.b, false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ?? r1 = this.b;
                int size = defpackage.hgu.ab(r1).size();
                fya fyaVar = (fya) this.a;
                fyaVar.g(size > 1);
                defpackage.fxh fxhVar = new defpackage.fxh((defpackage.fvs) ajsz.bJ(defpackage.hgu.ab(r1)));
                java.util.List listBV = ajsz.bV(ajsz.co(defpackage.hgu.ab(r1)));
                java.util.ArrayList arrayList2 = new java.util.ArrayList(listBV.size());
                int size2 = listBV.size();
                for (int i = 0; i < size2; i++) {
                    arrayList2.add(new defpackage.fxh((defpackage.fvs) listBV.get(i)));
                }
                aokc aokcVar = aokc.a;
                fyaVar.f = fxhVar;
                fyaVar.c = arrayList2;
                fyaVar.d = aokcVar;
                fxy fxyVar = fyaVar.e;
                if (fxyVar != null) {
                    ((fye) fxyVar.d).e(fyaVar);
                }
                return aojh.a;
            case 16:
                ((defpackage.gqb) this.a).b.a(this.b);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                synchronized (defpackage.gvq.b) {
                    java.util.Map map = defpackage.gvq.c;
                    map.remove(obj10);
                    if (map.isEmpty()) {
                        gsh.a().c(gvs.a, "NetworkRequestConstraintController unregister shared callback");
                        ((android.net.ConnectivityManager) obj9).unregisterNetworkCallback(defpackage.gvq.a);
                        defpackage.gvq.f = null;
                        defpackage.gvq.d = null;
                        defpackage.gvq.e = false;
                    }
                    break;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj11 = this.b;
                gwf gwfVar = ((gvt) this.a).a;
                synchronized (gwfVar.b) {
                    java.util.LinkedHashSet linkedHashSet2 = gwfVar.c;
                    if (linkedHashSet2.remove(obj11) && linkedHashSet2.isEmpty()) {
                        gwfVar.e();
                    }
                    break;
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                guq guqVar = (guq) this.b;
                gus.g((java.lang.String) this.a, guqVar);
                gus.h(guqVar);
                return aojh.a;
            default:
                java.lang.Object obj12 = this.b;
                guq guqVar2 = (guq) obj12;
                androidx.work.impl.WorkDatabase workDatabase = guqVar2.e;
                aooh.e(workDatabase, "getWorkDatabase(...)");
                workDatabase.p(new defpackage.gra(obj12, this.a, 7, (byte[]) (z2 ? 1 : 0)));
                gus.h(guqVar2);
                return aojh.a;
        }
    }

    public /* synthetic */ bxq(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
