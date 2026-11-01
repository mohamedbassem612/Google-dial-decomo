package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(ahyc ahycVar, phg phgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ahycVar;
        this.b = phgVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                c((aoss) obj, (aoln) obj2).b(aojh.a);
                return null;
            case 3:
                return c((nok) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((nok) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((phm) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((rtl) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((sfd) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c(obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:57:0x0210 A[PHI: r4
      0x0210: PHI (r4v7 long) = (r4v6 long), (r4v8 long) binds: [B:53:0x0206, B:55:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [ahyc, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        int i = 5;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                aoss aossVar = (aoss) this.c;
                aihd<defpackage.lmw> aihdVarE = ((defpackage.lnh) this.a).k.e();
                aooh.e(aihdVarE, "get(...)");
                for (defpackage.lmw lmwVar : aihdVarE) {
                    java.lang.Object obj2 = this.b;
                    aimz aimzVar = zih.a;
                    aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.lwe((aoln) null, lmwVar, (defpackage.lmq) obj2, 1));
                }
                return aojh.a;
            case 1:
                aoss aossVar2 = (aoss) this.c;
                aooc.af(obj);
                ?? r12 = this.b;
                ?? r11 = this.a;
                aoov.an(aossVar2, (aolr) null, 4, new defpackage.amg((cvr) r11, (defpackage.bgw) r12, (aoln) null, 18), 1);
                return aoov.an(aossVar2, (aolr) null, 4, new defpackage.amg((cvr) r11, (defpackage.bgw) r12, (aoln) null, 19, (byte[]) null), 1);
            case 2:
                aooc.af(obj);
                aoss aossVar3 = (aoss) this.c;
                java.lang.Object obj3 = this.a;
                defpackage.maj majVar = (defpackage.maj) this.b;
                defpackage.msi msiVar = new defpackage.msi(majVar, (defpackage.nte) obj3, (aoln) null, 16);
                if (((java.lang.Boolean) majVar.c.a()).booleanValue()) {
                    aoov.an(aossVar3, (aolr) null, 0, new defpackage.itj((aonn) msiVar, (aoln) null, 9, (int[]) null), 3);
                    return null;
                }
                aimz aimzVar2 = zih.a;
                aoov.al(aossVar3, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, (aonn) msiVar, 8, (short[]) null));
                return null;
            case 3:
                aooc.af(obj);
                kaw kawVarAO = gus.aO(((nok) this.c).p());
                kawVarAO.F((defpackage.noh) this.a);
                alcf alcfVarE = aldi.e(android.os.SystemClock.elapsedRealtime());
                aooh.e(alcfVarE, "fromMillis(...)");
                kawVarAO.E(alcfVarE);
                return kawVarAO.D();
            case 4:
                aooc.af(obj);
                kaw kawVarAO2 = gus.aO(((nok) this.c).p());
                kawVarAO2.G((defpackage.noi) this.a);
                alcf alcfVarE2 = aldi.e(android.os.SystemClock.elapsedRealtime());
                aooh.e(alcfVarE2, "fromMillis(...)");
                kawVarAO2.E(alcfVarE2);
                return kawVarAO2.D();
            case 5:
                aooc.af(obj);
                aoss aossVar4 = (aoss) this.c;
                java.lang.Object obj4 = this.a;
                defpackage.nux nuxVar = (defpackage.nux) this.b;
                defpackage.nuw nuwVar = new defpackage.nuw(nuxVar, (defpackage.nvg) obj4, null);
                if (((java.lang.Boolean) nuxVar.c.a()).booleanValue()) {
                    return aoov.an(aossVar4, (aolr) null, 0, new defpackage.nuh((aonn) nuwVar, (aoln) null, 6, (short[]) null), 3);
                }
                aimz aimzVar3 = zih.a;
                return aoov.al(aossVar4, zih.b.plus(aols.a), 1, new defpackage.nuh((aoln) null, nuwVar, 5, (char[]) null));
            case 6:
                aooc.af(obj);
                defpackage.oez oezVar = (defpackage.oez) this.b;
                akzm akzmVar = oezVar.c;
                if (akzmVar != null) {
                    return akzmVar;
                }
                long jB = aldf.b((akzm) this.a);
                long j = 10;
                if (jB >= 10) {
                    if (jB >= 15) {
                        j = 20;
                        if (jB < 20) {
                            jB = 15;
                        } else {
                            jB = j;
                        }
                    } else {
                        jB = j;
                    }
                }
                akzm akzmVarF = aldf.f(jB, 0);
                aooh.e(akzmVarF, "fromSeconds(...)");
                oezVar.c = akzmVarF;
                return aojh.a;
            case 7:
                aooc.af(obj);
                phm phmVar = (phm) this.c;
                ajcq ajcqVar = phmVar.a;
                if (ajcqVar.isDone()) {
                    return new phm(ahvr.H(ajcqVar, (ahyc) this.a, ((phg) this.b).e), phmVar.b, phmVar.c);
                }
                phg.a.d().l("com/android/dialer/incall/cachedphonelookup/PhoneLookupCacheUpdater", "updateCallerIdFeedbackInfo$<anonymous>$<anonymous>", 79, "PhoneLookupCacheUpdater.kt").v("updateCallerIdFeedbackInfo: Called before fullInfo is done.");
                return phmVar;
            case 8:
                aooc.af(obj);
                try {
                    if (((qal) this.b).d.j(0) != 2) {
                        java.lang.Object obj5 = this.a;
                        qak qakVar = new qak(defpackage.bbb.m);
                        if (true == ((j$.util.Optional) obj5).isPresent()) {
                            qakVar.a.a(((j$.util.Optional) obj5).get());
                        }
                        break;
                    }
                    return aojh.a;
                } catch (java.lang.Exception e) {
                    if (!(e instanceof java.util.concurrent.CancellationException)) {
                        aimz aimzVar4 = zih.a;
                        zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
                    }
                    throw e;
                }
            case 9:
                aooc.af(obj);
                aoss aossVar5 = (aoss) this.c;
                java.lang.Object obj6 = this.b;
                rpa rpaVar = (rpa) this.a;
                rpaVar.e(ahvr.ag(aossVar5, rpaVar.m, new rka(rpaVar, (ttj) obj6, (aoln) null, 2)));
                return aojh.a;
            case 10:
                aooc.af(obj);
                aoss aossVar6 = (aoss) this.c;
                java.lang.Object obj7 = this.b;
                rpa rpaVar2 = (rpa) this.a;
                return ahvr.ag(aossVar6, rpaVar2.m, new roz(rpaVar2, (roc) obj7, (aoln) null, 2));
            case 11:
                aooc.af(obj);
                rtl rtlVar = (rtl) this.c;
                ipc ipcVarAa = ttj.aa(rtlVar.p());
                ipcVarAa.aR();
                rsd rsdVar = (rsd) this.b;
                java.lang.String string = rsdVar.toString();
                rtk rtkVarD = (rtk) j$.util.DesugarCollections.unmodifiableMap(rtlVar.b).get(rsdVar.toString());
                if (rtkVarD == null) {
                    rtkVarD = pez.bv(rtk.a.m()).D();
                }
                java.lang.Object obj8 = this.a;
                defpackage.hgw hgwVarBv = pez.bv(rtkVarD.p());
                aooh.f(obj8, "value");
                akzx akzxVar = (akzx) hgwVarBv.a;
                akzxVar.u();
                rtk rtkVar = akzxVar.b;
                j$.util.Objects.requireNonNull(obj8);
                rtkVar.c = (alcf) obj8;
                rtkVar.b |= 1;
                ipcVarAa.aQ(string, hgwVarBv.D());
                return ipcVarAa.aP();
            case 12:
                aooc.af(obj);
                ryg rygVarK = snl.K(((sfd) this.c).p());
                int iOrdinal = ((sfb) this.a).ordinal();
                if (iOrdinal == 0) {
                    i = 3;
                } else if (iOrdinal == 1) {
                    i = 4;
                } else if (iOrdinal != 2) {
                    throw new aois();
                }
                akzx akzxVar2 = (akzx) rygVarK.a;
                akzxVar2.u();
                sfd sfdVar = akzxVar2.b;
                sfdVar.d = a.aT(i);
                sfdVar.b |= 2;
                return rygVarK.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                aoss aossVar7 = (aoss) this.c;
                aimw aimwVarL = tuy.a.b().l("com/android/dialer/sharpie/impl/wear/SharpieWearRelay", "relayToWearLifecycleState$<anonymous>", 41, "SharpieWearRelay.kt");
                tuy tuyVar = (tuy) this.a;
                java.lang.String strName = tuyVar.c.name();
                tth tthVar = (tth) this.b;
                aimwVarL.I("lifecycle transition: %s -> %s", strName, tthVar.name());
                return ahvr.ag(aossVar7, tuyVar.d, new tkz(tuyVar, tthVar, (aoln) null, 13));
            default:
                aooc.af(obj);
                if (this.c == null) {
                    return this.b;
                }
                java.lang.Object obj9 = this.a;
                java.util.Objects.toString(obj9);
                throw new java.lang.IllegalStateException("Data already present for ".concat(java.lang.String.valueOf(obj9)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [bgw, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.lnb lnbVar = new defpackage.lnb((defpackage.lnh) this.a, (defpackage.lmq) this.b, aolnVar, 0);
                lnbVar.c = obj;
                return lnbVar;
            case 1:
                defpackage.lnb lnbVar2 = new defpackage.lnb((cvr) this.a, (defpackage.bgw) this.b, aolnVar, 1);
                lnbVar2.c = obj;
                return lnbVar2;
            case 2:
                defpackage.lnb lnbVar3 = new defpackage.lnb((defpackage.maj) this.b, (defpackage.nte) this.a, aolnVar, 2);
                lnbVar3.c = obj;
                return lnbVar3;
            case 3:
                defpackage.lnb lnbVar4 = new defpackage.lnb((defpackage.noh) this.a, (nnx) this.b, aolnVar, 3);
                lnbVar4.c = obj;
                return lnbVar4;
            case 4:
                defpackage.lnb lnbVar5 = new defpackage.lnb((defpackage.noi) this.a, (nnx) this.b, aolnVar, 4);
                lnbVar5.c = obj;
                return lnbVar5;
            case 5:
                defpackage.lnb lnbVar6 = new defpackage.lnb((defpackage.nux) this.b, (defpackage.nvg) this.a, aolnVar, 5);
                lnbVar6.c = obj;
                return lnbVar6;
            case 6:
                defpackage.lnb lnbVar7 = new defpackage.lnb((defpackage.oez) this.b, (akzm) this.a, aolnVar, 6);
                lnbVar7.c = obj;
                return lnbVar7;
            case 7:
                defpackage.lnb lnbVar8 = new defpackage.lnb((ahyc) this.a, (phg) this.b, aolnVar, 7);
                lnbVar8.c = obj;
                return lnbVar8;
            case 8:
                defpackage.lnb lnbVar9 = new defpackage.lnb(aolnVar, (qal) this.b, (j$.util.Optional) this.a, 8);
                lnbVar9.c = obj;
                return lnbVar9;
            case 9:
                defpackage.lnb lnbVar10 = new defpackage.lnb((rpa) this.a, (ttj) this.b, aolnVar, 9);
                lnbVar10.c = obj;
                return lnbVar10;
            case 10:
                defpackage.lnb lnbVar11 = new defpackage.lnb((rpa) this.a, (roc) this.b, aolnVar, 10);
                lnbVar11.c = obj;
                return lnbVar11;
            case 11:
                defpackage.lnb lnbVar12 = new defpackage.lnb((rsd) this.b, (alcf) this.a, aolnVar, 11);
                lnbVar12.c = obj;
                return lnbVar12;
            case 12:
                defpackage.lnb lnbVar13 = new defpackage.lnb((sfa) this.b, (sfb) this.a, aolnVar, 12);
                lnbVar13.c = obj;
                return lnbVar13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.lnb lnbVar14 = new defpackage.lnb((tuy) this.a, (tth) this.b, aolnVar, 13);
                lnbVar14.c = obj;
                return lnbVar14;
            default:
                defpackage.lnb lnbVar15 = new defpackage.lnb(this.b, this.a, aolnVar, 14);
                lnbVar15.c = obj;
                return lnbVar15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(aoln aolnVar, qal qalVar, j$.util.Optional optional, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = qalVar;
        this.a = optional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(cvr cvrVar, defpackage.bgw bgwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = cvrVar;
        this.b = bgwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(java.lang.Object obj, java.lang.Object obj2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.lnh lnhVar, defpackage.lmq lmqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = lnhVar;
        this.b = lmqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.maj majVar, defpackage.nte nteVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = majVar;
        this.a = nteVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.noh nohVar, nnx nnxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nohVar;
        this.b = nnxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.noi noiVar, nnx nnxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = noiVar;
        this.b = nnxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.nux nuxVar, defpackage.nvg nvgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nuxVar;
        this.a = nvgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(defpackage.oez oezVar, akzm akzmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = oezVar;
        this.a = akzmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(rpa rpaVar, roc rocVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
        this.b = rocVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(rpa rpaVar, ttj ttjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
        this.b = ttjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(rsd rsdVar, alcf alcfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = rsdVar;
        this.a = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(sfa sfaVar, sfb sfbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = sfaVar;
        this.a = sfbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnb(tuy tuyVar, tth tthVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tuyVar;
        this.b = tthVar;
    }
}
