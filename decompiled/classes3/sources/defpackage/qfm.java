package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qfm implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qfm(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, rlv] */
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z;
        java.lang.Object obj2;
        int i = this.$cid;
        if (i == 0) {
            aify aifyVar = (aify) obj;
            if (aifyVar == null) {
                return aike.a;
            }
            boolean z2 = this.a;
            aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.pei(this.b, 7)).collect(aido.a);
            if (!z2) {
                return aifyVar2;
            }
            akzx akzxVarM = defpackage.qgp.a.m();
            akzxVarM.u();
            defpackage.qgp qgpVar = (defpackage.qgp) akzxVarM.b;
            qgpVar.e = 3;
            qgpVar.b |= 4;
            defpackage.qgp qgpVar2 = (defpackage.qgp) akzxVarM.p();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(qgpVar2);
            arrayList.addAll(aifyVar2);
            return aify.n(arrayList);
        }
        if (i == 1) {
            java.lang.Integer num = (java.lang.Integer) obj;
            if (!this.a) {
                if (num.intValue() == 0) {
                    return lio.a;
                }
                return num.intValue() == 1 ? lio.b : lio.c;
            }
            if (num.intValue() <= 0) {
                return lio.d;
            }
            lil lilVar = (lil) this.b;
            lilVar.l.t(ahvr.D(new defpackage.wok(1), lilVar.j, java.util.concurrent.TimeUnit.MILLISECONDS, lilVar.e), lil.b);
            return lio.e;
        }
        if (i == 2) {
            ((defpackage.uss) this.b).f.o(this.a ? rmx.mH : rmx.mI);
            return null;
        }
        if (i == 3) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                uek.a.b().l("com/android/dialer/spam/inapp/InAppSpam", "report", 160, "InAppSpam.java").v("InAppSpamStorage updated");
            } else {
                uek.a.b().l("com/android/dialer/spam/inapp/InAppSpam", "report", 162, "InAppSpam.java").v("InAppSpamStorage update failed");
            }
            boolean z3 = this.a;
            ((kjr) ((uek) this.b).f.a()).a();
            return java.lang.Boolean.valueOf(z3);
        }
        if (i == 4) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                java.lang.Object obj3 = this.b;
                defpackage.vrr vrrVar = defpackage.vrr.a;
                if (obj3 == vrrVar && this.a) {
                    return vrrVar;
                }
            }
            return defpackage.vrr.b;
        }
        if (i != 5) {
            java.lang.String str = (java.lang.String) obj;
            if (str == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            ?? r0 = this.b;
            agoq agoqVar = (agoq) r0.get(str);
            if (agoqVar == null) {
                agpt.a.c().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "getValidAccount$<anonymous>", 268, "GmsAccounts.kt").v("the primary email address for the duplicate gaia id does not match any of the corresponding accounts on device.");
                return null;
            }
            if (!this.a) {
                return agoqVar;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(r0.size() - 1);
            for (java.lang.String str2 : r0.keySet()) {
                if (!aooh.n(str, str2)) {
                    arrayList2.add(str2);
                }
            }
            apdi apdiVar = agpv.a;
            agoqVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) agoqVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            akzx akzxVarP = ((agpu) objJ).p();
            aooh.e(akzxVarP, "toBuilder(...)");
            akzxVarP.u();
            agpu agpuVar = akzxVarP.b;
            alat alatVar = agpuVar.d;
            if (!alatVar.c()) {
                agpuVar.d = alad.J(alatVar);
            }
            akyl.i(arrayList2, agpuVar.d);
            akzz akzzVarP = agoqVar.p();
            akzzVarP.bV(apdiVar, akzxVarP.p());
            return akzzVarP.p();
        }
        akzx akzxVarM2 = vtg.a.m();
        java.util.Iterator it = ((vtg) obj).b.iterator();
        boolean z4 = false;
        while (true) {
            z = this.a;
            obj2 = this.b;
            if (!it.hasNext()) {
                break;
            }
            defpackage.vtf vtfVar = (defpackage.vtf) it.next();
            if (vth.b(vtfVar, (android.telecom.PhoneAccountHandle) obj2)) {
                akzx akzxVarP2 = vtfVar.p();
                akzxVarP2.u();
                defpackage.vtf vtfVar2 = (defpackage.vtf) akzxVarP2.b;
                vtfVar2.b |= 1;
                vtfVar2.e = z;
                akzxVarM2.Z((defpackage.vtf) akzxVarP2.p());
            } else {
                akzxVarM2.Z(vtfVar);
            }
            akzx akzxVarP3 = vtfVar.p();
            akzxVarP3.u();
            defpackage.vtf vtfVar3 = (defpackage.vtf) akzxVarP3.b;
            vtfVar3.b |= 1;
            vtfVar3.e = z;
            akzxVarM2.Z((defpackage.vtf) akzxVarP3.p());
            z4 = true;
        }
        if (!z4) {
            akzx akzxVarM3 = defpackage.vtf.a.m();
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj2;
            java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
            akzxVarM3.u();
            defpackage.vtf vtfVar4 = (defpackage.vtf) akzxVarM3.b;
            j$.util.Objects.requireNonNull(strFlattenToString);
            vtfVar4.c = strFlattenToString;
            java.lang.String id = phoneAccountHandle.getId();
            akzxVarM3.u();
            defpackage.vtf vtfVar5 = (defpackage.vtf) akzxVarM3.b;
            j$.util.Objects.requireNonNull(id);
            vtfVar5.d = id;
            akzxVarM3.u();
            defpackage.vtf vtfVar6 = (defpackage.vtf) akzxVarM3.b;
            vtfVar6.b |= 1;
            vtfVar6.e = z;
            akzxVarM2.u();
            vtg vtgVar = akzxVarM2.b;
            defpackage.vtf vtfVar7 = (defpackage.vtf) akzxVarM3.p();
            j$.util.Objects.requireNonNull(vtfVar7);
            vtgVar.b();
            vtgVar.b.add(vtfVar7);
        }
        return akzxVarM2.p();
    }
}
