package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifb {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public ifb(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(aoinVar, "enableWinkyPhaseOne");
        aooh.f(aoinVar2, "enableWinkyPhaseTwo");
        aooh.f(aoinVar3, "enableWinkyFullFunctionality");
        aooh.f(aoinVar4, "enableAgenticCallScreen");
        this.a = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.b = aoinVar4;
        java.util.Map mapI = i();
        aola aolaVar = new aola(8);
        for (java.util.Map.Entry entry : mapI.entrySet()) {
            java.lang.Object key = entry.getKey();
            for (java.lang.Object obj : (java.util.Set) entry.getValue()) {
                java.lang.Object linkedHashSet = aolaVar.get(obj);
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                    aolaVar.put(obj, linkedHashSet);
                }
                ((java.util.Set) linkedHashSet).add(key);
            }
        }
        aola aolaVarE = aolaVar.e();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(aolaVarE.g));
        for (java.util.Map.Entry entry2 : aolaVarE.entrySet()) {
            java.lang.Object key2 = entry2.getKey();
            java.util.Set<defpackage.mnd> set = (java.util.Set) entry2.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(set, 10));
            for (defpackage.mnd mndVar : set) {
                defpackage.vk vkVarS = mni.S(defpackage.mne.a.m());
                vkVarS.J(mndVar);
                arrayList.add(vkVarS.I());
            }
            linkedHashMap.put(key2, ajsz.cf(arrayList));
        }
        this.e = linkedHashMap;
    }

    public static ajcq b() {
        return aiql.y(new java.lang.IllegalStateException("Attempting to read/write into settings ProtoDataStore while in direct boot mode"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a() {
        return ((zzx) this.d).m() ? b() : ahvr.H(((aogc) this.a).bk(), new defpackage.hup(this, 18), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    public final defpackage.hzp c(defpackage.hzj hzjVar) {
        ((lpb) this.d.a()).getClass();
        ajcu ajcuVar = (ajcu) this.e.a();
        ajcuVar.getClass();
        ajcu ajcuVar2 = (ajcu) this.c.a();
        ajcuVar2.getClass();
        defpackage.hzf hzfVar = (defpackage.hzf) this.b.a();
        hzfVar.getClass();
        aazc aazcVar = (aazc) this.a.a();
        aazcVar.getClass();
        return new defpackage.hzp(hzjVar, ajcuVar, ajcuVar2, hzfVar, aazcVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoin, java.lang.Object] */
    public final defpackage.hzb d(defpackage.hzh hzhVar, j$.time.Duration duration) {
        duration.getClass();
        defpackage.hyy hyyVar = (defpackage.hyy) this.c.a();
        hyyVar.getClass();
        aigf aigfVar = (aigf) this.a.a();
        aigfVar.getClass();
        ajcu ajcuVar = (ajcu) this.e.a();
        ajcuVar.getClass();
        ((lpb) this.d.a()).getClass();
        defpackage.hgw hgwVar = (defpackage.hgw) this.b.a();
        hgwVar.getClass();
        return new defpackage.hzb(hzhVar, duration, hyyVar, aigfVar, ajcuVar, hgwVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.nmo nmoVar, boolean z, aoln aolnVar) throws aois {
        defpackage.njj njjVar;
        defpackage.mne mneVarH;
        java.lang.Object objK;
        defpackage.mnb mnbVar;
        if (aolnVar instanceof defpackage.njj) {
            njjVar = (defpackage.njj) aolnVar;
            int i = njjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njjVar.c = i - Integer.MIN_VALUE;
            } else {
                njjVar = new defpackage.njj(this, aolnVar);
            }
        } else {
            njjVar = new defpackage.njj(this, aolnVar);
        }
        java.lang.Object obj = njjVar.b;
        aolu aoluVar = aolu.a;
        int i2 = njjVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            mneVarH = ((defpackage.ifb) this.e).h(nmoVar, z);
            if (mneVarH != null) {
                objK = ((zzx) this.a).e().k();
                aooh.e(objK, "iterator(...)");
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objK = njjVar.a;
        mneVarH = njjVar.d;
        aooc.af(obj);
        do {
            ailj ailjVar = (ailj) objK;
            if (!ailjVar.hasNext()) {
                return aojh.a;
            }
            mnbVar = (defpackage.mnb) ailjVar.next();
            njjVar.d = mneVarH;
            njjVar.a = objK;
            njjVar.c = 1;
        } while (mnbVar.a() != aoluVar);
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    public final java.lang.Object f(defpackage.nmo nmoVar, java.lang.Boolean bool, aoln aolnVar) {
        defpackage.njk njkVar;
        aoke aokeVarAF;
        ?? r6;
        ?? it;
        java.lang.Object objQ;
        if (aolnVar instanceof defpackage.njk) {
            njkVar = (defpackage.njk) aolnVar;
            int i = njkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                njkVar.d = i - Integer.MIN_VALUE;
            } else {
                njkVar = new defpackage.njk(this, aolnVar);
            }
        } else {
            njkVar = new defpackage.njk(this, aolnVar);
        }
        java.lang.Object obj = njkVar.c;
        aolu aoluVar = aolu.a;
        int i2 = njkVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            aooh.f(nmoVar, "lifecycleState");
            if (nmoVar == defpackage.nmo.READY_FOR_MANUAL_SCREENING && bool == null) {
                throw new java.lang.IllegalArgumentException("isNonInteractiveScreening must not be null when lifecycleState is READY_FOR_MANUAL_SCREENING");
            }
            int iOrdinal = nmoVar.ordinal();
            if (iOrdinal == 1) {
                defpackage.vk vkVarS = mni.S(defpackage.mne.a.m());
                vkVarS.J(defpackage.mnd.BEESLY);
                aokeVarAF = ajsz.aF(vkVarS.I());
            } else if (iOrdinal != 2) {
                aokeVarAF = aoke.a;
            } else {
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                defpackage.mne mneVar = defpackage.mne.a;
                defpackage.vk vkVarS2 = mni.S(mneVar.m());
                vkVarS2.J(defpackage.mnd.BEESLY);
                linkedHashSet.add(vkVarS2.I());
                if (aooh.n(bool, java.lang.Boolean.TRUE)) {
                    defpackage.vk vkVarS3 = mni.S(mneVar.m());
                    vkVarS3.J(defpackage.mnd.WINKY);
                    linkedHashSet.add(vkVarS3.I());
                }
                aokeVarAF = ajsz.cf(linkedHashSet);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aokeVarAF, 10));
            java.util.Iterator it2 = aokeVarAF.iterator();
            while (it2.hasNext()) {
                defpackage.mnd mndVarB = defpackage.mnd.b(((defpackage.mne) it2.next()).c);
                if (mndVarB == null) {
                    mndVarB = defpackage.mnd.UNRECOGNIZED;
                }
                arrayList.add(mndVarB);
            }
            java.util.Set setCf = ajsz.cf(arrayList);
            aigf aigfVarK = ((zzx) this.b).k();
            aooh.c(aigfVarK);
            it = aigfVarK.entrySet().iterator();
            r6 = setCf;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = njkVar.b;
            java.lang.Object obj3 = njkVar.a;
            aooc.af(obj);
            it = obj2;
            r6 = obj3;
        }
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            defpackage.mnd mndVar = (defpackage.mnd) entry.getKey();
            aoin aoinVar = (aoin) entry.getValue();
            boolean zContains = r6.contains(mndVar);
            defpackage.jyn jynVar = (defpackage.jyn) aoinVar.a();
            njkVar.a = r6;
            njkVar.b = it;
            njkVar.d = 1;
            if (zContains) {
                defpackage.vk vkVarS4 = mni.S(defpackage.mne.a.m());
                vkVarS4.J(defpackage.mnd.BEESLY);
                objQ = jynVar.q(vkVarS4.I(), njkVar);
                if (objQ != aoluVar) {
                    objQ = aojh.a;
                }
            } else {
                objQ = aojh.a;
            }
            if (objQ == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.nmo nmoVar, boolean z, aoln aolnVar) throws aois {
        defpackage.njl njlVar;
        defpackage.mne mneVarH;
        java.lang.Object objK;
        if (aolnVar instanceof defpackage.njl) {
            njlVar = (defpackage.njl) aolnVar;
            int i = njlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njlVar.c = i - Integer.MIN_VALUE;
            } else {
                njlVar = new defpackage.njl(this, aolnVar);
            }
        } else {
            njlVar = new defpackage.njl(this, aolnVar);
        }
        java.lang.Object obj = njlVar.b;
        aojh aojhVar = aolu.a;
        int i2 = njlVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            mneVarH = ((defpackage.ifb) this.e).h(nmoVar, z);
            if (mneVarH != null) {
                objK = ((zzx) this.c).e().k();
                aooh.e(objK, "iterator(...)");
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objK = njlVar.a;
        mneVarH = njlVar.d;
        aooc.af(obj);
        do {
            ailj ailjVar = (ailj) objK;
            if (!ailjVar.hasNext()) {
                return aojh.a;
            }
            defpackage.jhw jhwVar = (defpackage.jhw) ailjVar.next();
            njlVar.d = mneVarH;
            njlVar.a = objK;
            njlVar.c = 1;
            java.lang.Object obj2 = jhwVar.a;
            defpackage.hgw hgwVarO = defpackage.hhk.o(defpackage.jhv.a.m());
            hgwVarO.f(7);
            ((zij) obj2).c(hgwVarO.e());
        } while (aojh.a != aojhVar);
        return aojhVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r1v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aoin, java.lang.Object] */
    public final defpackage.mne h(defpackage.nmo nmoVar, boolean z) throws aois {
        aooh.f(nmoVar, "lifecycleState");
        switch (nmoVar.ordinal()) {
            case 5:
            case 6:
                if (z && (((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue())) {
                    defpackage.vk vkVarS = mni.S(defpackage.mne.a.m());
                    vkVarS.J(defpackage.mnd.WINKY);
                    return vkVarS.I();
                }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case 16:
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.vk vkVarS2 = mni.S(defpackage.mne.a.m());
                vkVarS2.J(defpackage.mnd.BEESLY);
                return vkVarS2.I();
            default:
                throw new aois();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aoin, java.lang.Object] */
    public final java.util.Map i() {
        aoiu[] aoiuVarArr = new aoiu[2];
        defpackage.mnd mndVar = defpackage.mnd.BEESLY;
        defpackage.nmo nmoVar = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
        aoiuVarArr[0] = new aoiu(mndVar, ajsz.cW(new defpackage.nmo[]{defpackage.nmo.NOT_A_DOBBY_CALL, nmoVar}));
        aoiuVarArr[1] = new aoiu(defpackage.mnd.WINKY, (((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue()) ? ajsz.aF(nmoVar) : aoke.a);
        return ajsz.aO(aoiuVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final java.lang.Object j(int i, defpackage.hkd hkdVar, aoln aolnVar) {
        defpackage.lzn lznVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.lzn) {
            lznVar = (defpackage.lzn) aolnVar;
            int i2 = lznVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lznVar.c = i2 - Integer.MIN_VALUE;
            } else {
                lznVar = new defpackage.lzn(this, aolnVar);
            }
        } else {
            lznVar = new defpackage.lzn(this, aolnVar);
        }
        java.lang.Object objS = lznVar.b;
        aolu aoluVar = aolu.a;
        int i3 = lznVar.c;
        if (i3 == 0) {
            aooc.af(objS);
            java.lang.Object obj = this.e;
            lznVar.d = hkdVar;
            lznVar.a = i;
            lznVar.c = 1;
            objS = kcq.S((rsr) obj, lznVar);
            if (objS == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = lznVar.a;
            hkdVar = lznVar.d;
            aooc.af(objS);
        }
        java.util.ArrayList<defpackage.kdy> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : (java.util.Collection) objS) {
            defpackage.kdy kdyVar = (defpackage.kdy) obj2;
            if (kdyVar.f == i && ((sso) this.b.a()).c(hkdVar, kdyVar.b())) {
                arrayList.add(obj2);
            }
        }
        akzx akzxVarM = defpackage.kis.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        java.lang.Boolean bool = (java.lang.Boolean) this.c.a();
        for (defpackage.kdy kdyVar2 : arrayList) {
            akzxVarM.F(kdyVar2.a);
            akzxVarM.G(kdyVar2.b);
            if (!bool.booleanValue() && (str = kdyVar2.s) != null && str.length() != 0) {
                akzxVarM.E(str);
            }
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aladVarP;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq k(int i) {
        return ahvr.I(((defpackage.lgi) this.c).b(), new defpackage.lhb(this, i, 2), (java.util.concurrent.Executor) this.d);
    }

    public ifb(zzx zzxVar, defpackage.ifb ifbVar, zzx zzxVar2, zzx zzxVar3, zzx zzxVar4) {
        this.b = zzxVar;
        this.e = ifbVar;
        this.a = zzxVar2;
        this.c = zzxVar3;
        this.d = zzxVar4;
    }

    public ifb(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, byte[] bArr) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
        aoinVar5.getClass();
        this.b = aoinVar5;
    }

    public ifb(defpackage.lgi lgiVar, defpackage.lgg lggVar, defpackage.lem lemVar, ajct ajctVar, qbe qbeVar) {
        this.c = lgiVar;
        this.e = lggVar;
        this.a = lemVar;
        this.d = new ajdc(ajctVar);
        this.b = qbeVar;
    }

    public ifb(android.content.Context context, aoss aossVar, rsr rsrVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableCancelMissedCallNotificationByCreationTime");
        this.a = context;
        this.d = aossVar;
        this.e = rsrVar;
        this.c = aoinVar;
        this.b = aooc.ag(new defpackage.kgq(this, 13));
    }

    public ifb(aogc aogcVar, kaw kawVar, aoin aoinVar, ajct ajctVar, zzx zzxVar) {
        this.a = aogcVar;
        this.b = kawVar;
        this.e = aoinVar;
        this.c = ajctVar;
        this.d = zzxVar;
    }

    public ifb(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        aoinVar.getClass();
        this.d = aoinVar;
        aoinVar2.getClass();
        this.e = aoinVar2;
        aoinVar3.getClass();
        this.c = aoinVar3;
        aoinVar4.getClass();
        this.b = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ifb(android.content.Context context, defpackage.ifs ifsVar) {
        this.a = context;
        this.e = ifsVar;
        defpackage.ifs.inflate(ifsVar.getContext(), 2131623993, (android.view.ViewGroup) ifsVar);
        android.view.View viewFindViewById = ifsVar.findViewById(2131427496);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.b = (android.widget.ImageView) viewFindViewById;
        android.view.View viewFindViewById2 = ifsVar.findViewById(2131427497);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.c = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = ifsVar.findViewById(2131428911);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.d = (android.widget.ImageView) viewFindViewById3;
    }
}
