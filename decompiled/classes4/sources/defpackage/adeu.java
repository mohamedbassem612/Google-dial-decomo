package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class adeu {
    public static final defpackage.adeu a = new defpackage.adeu();
    private static final defpackage.akxq b;
    private static final defpackage.akxq c;
    private static final java.util.Map d;

    static {
        akzz akzzVarM = defpackage.akxq.a.m();
        akzzVarM.bS(defpackage.akxj.a);
        akzzVarM.bS(defpackage.akxj.b);
        defpackage.akxq akxqVarP = akzzVarM.p();
        aooh.e(akxqVarP, "build(...)");
        b = akxqVarP;
        akzz akzzVarM2 = defpackage.akxq.a.m();
        akzzVarM2.bS(defpackage.akxj.a);
        defpackage.akxq akxqVarP2 = akzzVarM2.p();
        aooh.e(akxqVarP2, "build(...)");
        defpackage.akxq akxqVar = akxqVarP2;
        c = akxqVar;
        d = ajsz.aM(new aoiu(130783453, akxqVar));
    }

    public static final defpackage.akxp a(int... iArr) {
        akzx akzxVarM = defpackage.akxs.e.m();
        akzxVarM.u();
        defpackage.akxs akxsVar = (defpackage.akxs) akzxVarM.b;
        akxsVar.f |= 4;
        akxsVar.k = true;
        int i = iArr[0];
        akzxVarM.u();
        defpackage.akxs akxsVar2 = (defpackage.akxs) akzxVarM.b;
        akxsVar2.f |= 2;
        akxsVar2.h = i;
        defpackage.akxp akxpVarD = defpackage.aknx.d((defpackage.akxs) akzxVarM.p());
        aooh.e(akxpVarD, "createPToken(...)");
        return akxpVarD;
    }

    public static final defpackage.akxp b(int... iArr) {
        akzx akzxVarM = defpackage.akxs.e.m();
        int length = iArr.length;
        if (length > 0) {
            int i = iArr[0];
            akzxVarM.u();
            defpackage.akxs akxsVar = (defpackage.akxs) akzxVarM.b;
            akxsVar.f |= 2;
            akxsVar.h = i;
            if (length > 1) {
                java.util.List listAY = ajsz.aY(java.lang.Integer.valueOf(iArr[1]));
                akzxVarM.u();
                defpackage.akxs akxsVar2 = (defpackage.akxs) akzxVarM.b;
                alak alakVar = akxsVar2.i;
                if (!alakVar.c()) {
                    akxsVar2.i = alad.H(alakVar);
                }
                akyl.i(listAY, akxsVar2.i);
            }
        }
        defpackage.akxp akxpVarD = defpackage.aknx.d((defpackage.akxs) akzxVarM.p());
        aooh.e(akxpVarD, "createPToken(...)");
        return akxpVarD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v10 int, still in use, count: 3, list:
      (r8v10 int) from 0x026c: IF  (r8v10 int) != (-634435981 int)  -> B:84:0x026e A[HIDDEN] (LINE:621)
      (r8v10 int) from 0x0271: IF  (r8v10 int) != (1436199848 int)  -> B:86:0x0273 A[HIDDEN] (LINE:626)
      (r8v10 int) from 0x0276: IF  (r8v10 int) != (2008876522 int)  -> B:88:0x0278 A[HIDDEN] (LINE:631)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object c(android.content.Context context, xtq xtqVar, defpackage.adde addeVar, defpackage.akxp akxpVar, aoln aolnVar) {
        defpackage.adet adetVar;
        j$.util.Optional optionalEmpty;
        defpackage.apjb apjbVar;
        defpackage.akxy akxyVar;
        ajcq ajcqVarZ;
        aify aifyVarH;
        if (aolnVar instanceof defpackage.adet) {
            adetVar = (defpackage.adet) aolnVar;
            int i = adetVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adetVar.c = i - Integer.MIN_VALUE;
            } else {
                adetVar = new defpackage.adet(this, aolnVar);
            }
        } else {
            adetVar = new defpackage.adet(this, aolnVar);
        }
        java.lang.Object objD = adetVar.a;
        aolu aoluVar = aolu.a;
        int i2 = adetVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            if (xtqVar == null) {
                return java.lang.Boolean.FALSE;
            }
            java.lang.String str = addeVar.b;
            akzx akzxVarM = defpackage.akxw.a.m();
            akzx akzxVarM2 = defpackage.akxo.a.m();
            akzxVarM2.u();
            defpackage.akxo akxoVar = (defpackage.akxo) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            akxoVar.b |= 4;
            akxoVar.d = str;
            defpackage.akxo akxoVar2 = (defpackage.akxo) akzxVarM2.p();
            akzxVarM.u();
            defpackage.akxw akxwVar = (defpackage.akxw) akzxVarM.b;
            j$.util.Objects.requireNonNull(akxoVar2);
            akxwVar.c = akxoVar2;
            akxwVar.b |= 1;
            defpackage.akxw akxwVar2 = (defpackage.akxw) akzxVarM.p();
            aooh.e(akxwVar2, "build(...)");
            akzx akzxVarM3 = defpackage.akwk.a.m();
            akzx akzxVarM4 = defpackage.akwh.a.m();
            defpackage.akwo akwoVar = addeVar.c;
            akzxVarM4.u();
            defpackage.akwh akwhVar = (defpackage.akwh) akzxVarM4.b;
            j$.util.Objects.requireNonNull(akwoVar);
            alat alatVar = akwhVar.b;
            if (!alatVar.c()) {
                akwhVar.b = alad.J(alatVar);
            }
            akwhVar.b.add(akwoVar);
            akzxVarM3.u();
            defpackage.akwk akwkVar = (defpackage.akwk) akzxVarM3.b;
            defpackage.akwh akwhVar2 = (defpackage.akwh) akzxVarM4.p();
            j$.util.Objects.requireNonNull(akwhVar2);
            akwkVar.c = akwhVar2;
            akwkVar.b = 4;
            alad aladVarP = akzxVarM3.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.akwk akwkVar2 = (defpackage.akwk) aladVarP;
            defpackage.acuk.a.isPresent();
            try {
                java.lang.Object applicationContext = context.getApplicationContext();
                optionalEmpty = applicationContext instanceof defpackage.acum ? j$.util.Optional.of(java.lang.Integer.valueOf(((defpackage.acum) applicationContext).a())) : j$.util.Optional.empty();
            } catch (java.lang.RuntimeException unused) {
                optionalEmpty = j$.util.Optional.empty();
            }
            java.lang.Integer num = addeVar.a;
            java.lang.Object objOrElse = j$.util.Optional.ofNullable(num).or(new defpackage.acul(optionalEmpty, 0)).orElse(0);
            aooh.c(objOrElse);
            int iIntValue = ((java.lang.Number) objOrElse).intValue();
            if (iIntValue == 0) {
                aiql.l(java.util.concurrent.TimeUnit.SECONDS, "time unit");
                iIntValue = 0;
            }
            akzx akzxVarM5 = defpackage.akxt.a.m();
            akzx akzxVarM6 = defpackage.akxv.a.m();
            akzxVarM6.u();
            defpackage.akxv akxvVar = (defpackage.akxv) akzxVarM6.b;
            akxvVar.e = a.U(3);
            akxvVar.b |= 2;
            akzxVarM6.u();
            defpackage.akxv akxvVar2 = (defpackage.akxv) akzxVarM6.b;
            alak alakVar = akxvVar2.d;
            if (!alakVar.c()) {
                akxvVar2.d = alad.H(alakVar);
            }
            akxvVar2.d.g(iIntValue);
            akzxVarM6.u();
            defpackage.akxv akxvVar3 = (defpackage.akxv) akzxVarM6.b;
            j$.util.Objects.requireNonNull(akwkVar2);
            akxvVar3.c = akwkVar2;
            akxvVar3.b |= 1;
            akzxVarM5.u();
            defpackage.akxt akxtVar = (defpackage.akxt) akzxVarM5.b;
            defpackage.akxv akxvVar4 = (defpackage.akxv) akzxVarM6.p();
            j$.util.Objects.requireNonNull(akxvVar4);
            akxtVar.c = akxvVar4;
            akxtVar.b |= 1;
            alad aladVarP2 = akzxVarM5.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.akxt akxtVar2 = (defpackage.akxt) aladVarP2;
            defpackage.akxq akxqVar = (defpackage.akxq) j$.util.Map.-EL.getOrDefault(d, num, b);
            java.lang.Object obj = xtqVar.a;
            if (akxqVar.d.size() > 0 || akxqVar.c.size() > 0) {
                aift aiftVar = new aift(4);
                java.util.Iterator it = akxqVar.d.iterator();
                while (it.hasNext()) {
                    aiftVar.i(defpackage.akwz.b(((java.lang.Integer) it.next()).intValue()));
                }
                java.util.Iterator it2 = akxqVar.c.iterator();
                while (it2.hasNext()) {
                    java.lang.String str2 = ((defpackage.akyb) it2.next()).c;
                    if (iHashCode != -634435981) {
                        if (iHashCode != 1436199848) {
                            if (iHashCode != 2008876522) {
                                switch (str2) {
                                    case "dma52_data_sharing_v4":
                                        akxyVar = defpackage.akxy.DMA52_DATA_SHARING_V4;
                                        break;
                                    case "dma52_data_sharing_v5":
                                        akxyVar = defpackage.akxy.DMA52_DATA_SHARING_V5;
                                        break;
                                    case "dma52_data_sharing_v6":
                                        akxyVar = defpackage.akxy.DMA52_DATA_SHARING_V6;
                                        break;
                                    case "dma52_data_sharing_v7":
                                        akxyVar = defpackage.akxy.DMA52_DATA_SHARING_V7;
                                        break;
                                    default:
                                        akxyVar = defpackage.akxy.UNSPECIFIED_POLICY;
                                        break;
                                }
                            } else if (str2.equals("dma52_data_sharing_v4_prod")) {
                                akxyVar = defpackage.akxy.DMA52_DATA_SHARING_V4_PROD;
                            } else {
                                akxyVar = defpackage.akxy.UNSPECIFIED_POLICY;
                            }
                        } else if (str2.equals("workspace_processing_user_consent")) {
                            akxyVar = defpackage.akxy.WORKSPACE_PROCESSING_USER_CONSENT;
                        } else {
                            akxyVar = defpackage.akxy.UNSPECIFIED_POLICY;
                        }
                    } else if (str2.equals("workspace_processing_user_consent_v2")) {
                        akxyVar = defpackage.akxy.WORKSPACE_PROCESSING_USER_CONSENT_V2;
                    } else {
                        akxyVar = defpackage.akxy.UNSPECIFIED_POLICY;
                    }
                    aiftVar.i(akxyVar);
                }
                apjbVar = new defpackage.apjb(aiftVar.h(), aike.a);
            } else {
                defpackage.akyh akyhVar = akxqVar.b;
                if (akyhVar == null) {
                    akyhVar = defpackage.akyh.a;
                }
                defpackage.akyg akygVar = akyhVar.b;
                if (akygVar == null) {
                    akygVar = defpackage.akyg.a;
                }
                aift aiftVar2 = null;
                aift aiftVar3 = null;
                aift aiftVar4 = null;
                for (defpackage.akyf akyfVar : akygVar.b) {
                    defpackage.akxy akxyVarB = defpackage.akwz.b(akyfVar.b == 6 ? ((java.lang.Integer) akyfVar.c).intValue() : 0);
                    if (!defpackage.akwz.b.contains(akxyVarB) && defpackage.akwz.a.contains(akxyVarB)) {
                        int i3 = akyfVar.d;
                        if (i3 == 4) {
                            if (aiftVar3 == null) {
                                aiftVar3 = new aift(4);
                            }
                            aiftVar3.i(akxyVarB);
                        } else if (i3 == 3) {
                            if (aiftVar4 == null) {
                                aiftVar4 = new aift(4);
                            }
                            aiftVar4.i(akxyVarB);
                        }
                    }
                }
                if (aiftVar3 != null) {
                    aiftVar2 = aiftVar3;
                } else if (aiftVar4 == null) {
                    apjbVar = defpackage.akwz.d;
                }
                if (aiftVar2 == null) {
                    aifyVarH = defpackage.akwz.b.g();
                } else {
                    aiftVar2.k(defpackage.akwz.b);
                    aifyVarH = aiftVar2.h();
                }
                apjbVar = new defpackage.apjb(aifyVarH, aiftVar4 == null ? aike.a : aiftVar4.h());
            }
            try {
                defpackage.akww akwwVarC = akmr.c(akxpVar);
                ahvr.bP(akwwVarC.b.size() == 1, "Unexpected number of scalar ptokens: %s", akwwVarC.b.size());
                akwv akwvVar = (akwv) akwwVarC.b.get(0);
                defpackage.alfs alfsVar = (akwvVar.b == 1 ? (defpackage.akwu) akwvVar.c : defpackage.akwu.a).c;
                if (alfsVar == null) {
                    alfsVar = defpackage.alfs.a;
                }
                defpackage.alfr alfrVar = alfsVar.c;
                if (alfrVar == null) {
                    alfrVar = defpackage.alfr.a;
                }
                defpackage.alfr alfrVar2 = alfrVar;
                defpackage.akwz akwzVar = (defpackage.akwz) obj;
                ajcqVarZ = ajan.f(aiql.v(akwzVar.a(apjbVar.a, akxwVar2, alfrVar2, akxtVar2)), new ahml(akwzVar, alfrVar2, akxtVar2, 3), ajbm.a);
                if (!((aify) apjbVar.b).isEmpty()) {
                    try {
                        ((defpackage.akwz) obj).c.execute(new defpackage.akwx((defpackage.akwz) obj, apjbVar, akxwVar2, alfrVar2, akxtVar2, 0));
                    } catch (java.lang.RuntimeException unused2) {
                    }
                }
            } catch (java.lang.IllegalArgumentException unused3) {
                ((defpackage.akwz) obj).c(false, defpackage.alfr.a, akxtVar2, (defpackage.akxy) ahvr.bj((java.lang.Iterable) apjbVar.a, defpackage.akxy.UNSPECIFIED_POLICY), 10008, akxf.a);
                akzx akzxVarM7 = defpackage.akxu.a.m();
                akzxVarM7.u();
                defpackage.akxu akxuVar = (defpackage.akxu) akzxVarM7.b;
                akxuVar.b |= 1;
                akxuVar.c = false;
                ajcqVarZ = aiql.z((defpackage.akxu) akzxVarM7.p());
            }
            adetVar.c = 1;
            objD = aosv.D(ajcqVarZ, adetVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(((defpackage.akxu) objD).c);
    }
}
