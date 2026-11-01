package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wap {
    private static final aimz d = aimz.i("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter");
    public final aoss a;
    public final zog b;
    public final apni c;
    private final defpackage.wat e;
    private final defpackage.war f;
    private final defpackage.waw g;
    private final zdi h;
    private final defpackage.afpl i;

    public wap(aoss aossVar, defpackage.wat watVar, defpackage.war warVar, defpackage.waw wawVar, zdi zdiVar, defpackage.afpl afplVar, apni apniVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(wawVar, "crossDeviceMetricsWearMetricsStorage");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(apniVar, "androidJobs");
        this.a = aossVar;
        this.e = watVar;
        this.f = warVar;
        this.g = wawVar;
        this.h = zdiVar;
        this.i = afplVar;
        this.c = apniVar;
        this.b = new les(this, 15);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wam wamVar;
        java.lang.String str;
        java.lang.Object objB;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        boolean z2;
        akzx akzxVarM;
        if (aolnVar instanceof defpackage.wam) {
            wamVar = (defpackage.wam) aolnVar;
            int i = wamVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wamVar.c = i - Integer.MIN_VALUE;
            } else {
                wamVar = new defpackage.wam(this, aolnVar);
            }
        } else {
            wamVar = new defpackage.wam(this, aolnVar);
        }
        java.lang.Object objB2 = wamVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wamVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB2);
            } else if (i2 == 2) {
                aooc.af(objB2);
                str = (java.lang.String) aooh.q((j$.util.Optional) objB2);
                wamVar.d = str;
                wamVar.c = 3;
                objB = b(wamVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objB2 = objB;
                str2 = str;
                ajcq ajcqVarBl = ((defpackage.wal) objB2).bl();
                wamVar.d = str2;
                wamVar.c = 4;
                objB2 = aosv.D(ajcqVarBl, wamVar);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                str2 = wamVar.d;
                aooc.af(objB2);
                ajcq ajcqVarBl2 = ((defpackage.wal) objB2).bl();
                wamVar.d = str2;
                wamVar.c = 4;
                objB2 = aosv.D(ajcqVarBl2, wamVar);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = wamVar.d;
                aooc.af(objB2);
            }
            str3 = (java.lang.String) aooh.q((j$.util.Optional) objB2);
            aimw aimwVarL = d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "createDialerPhoneMetricsCallScopedKey", 89, "CrossDeviceMetricsCallScopedRequestStarter.kt");
            z = false;
            if (str2 != null || str2.length() == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (str3 != null && str3.length() != 0) {
                z = true;
            }
            aimwVarL.L("Is syntheticCallId present: %b; Is rawNumber present: %b", z2, z);
            akzxVarM = defpackage.zme.a.m();
            aooh.f(akzxVarM, "builder");
            if (str2 != null) {
                akzxVarM.u();
                defpackage.zme zmeVar = (defpackage.zme) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                zmeVar.b |= 1;
                zmeVar.c = str2;
            }
            if (str3 != null) {
                akzxVarM.u();
                defpackage.zme zmeVar2 = (defpackage.zme) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                zmeVar2.b |= 2;
                zmeVar2.d = str3;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            return (defpackage.zme) aladVarP;
        }
        aooc.af(objB2);
        wamVar.c = 1;
        objB2 = b(wamVar);
        if (objB2 == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBK = ((defpackage.wal) objB2).bK();
        wamVar.c = 2;
        objB2 = aosv.D(ajcqVarBK, wamVar);
        if (objB2 == aoluVar) {
            return aoluVar;
        }
        str = (java.lang.String) aooh.q((j$.util.Optional) objB2);
        wamVar.d = str;
        wamVar.c = 3;
        objB = b(wamVar);
        if (objB != aoluVar) {
            return aoluVar;
        }
        objB2 = objB;
        str2 = str;
        ajcq ajcqVarBl3 = ((defpackage.wal) objB2).bl();
        wamVar.d = str2;
        wamVar.c = 4;
        objB2 = aosv.D(ajcqVarBl3, wamVar);
        if (objB2 == aoluVar) {
            return aoluVar;
        }
        str3 = (java.lang.String) aooh.q((j$.util.Optional) objB2);
        aimw aimwVarL2 = d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "createDialerPhoneMetricsCallScopedKey", 89, "CrossDeviceMetricsCallScopedRequestStarter.kt");
        z = false;
        if (str2 != null) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (str3 != null) {
            z = true;
        }
        aimwVarL2.L("Is syntheticCallId present: %b; Is rawNumber present: %b", z2, z);
        akzxVarM = defpackage.zme.a.m();
        aooh.f(akzxVarM, "builder");
        if (str2 != null) {
            akzxVarM.u();
            defpackage.zme zmeVar3 = (defpackage.zme) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            zmeVar3.b |= 1;
            zmeVar3.c = str2;
        }
        if (str3 != null) {
            akzxVarM.u();
            defpackage.zme zmeVar4 = (defpackage.zme) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            zmeVar4.b |= 2;
            zmeVar4.d = str3;
        }
        alad aladVarP2 = akzxVarM.p();
        aooh.e(aladVarP2, "build(...)");
        return (defpackage.zme) aladVarP2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.wan wanVar;
        if (aolnVar instanceof defpackage.wan) {
            wanVar = (defpackage.wan) aolnVar;
            int i = wanVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wanVar.c = i - Integer.MIN_VALUE;
            } else {
                wanVar = new defpackage.wan(this, aolnVar);
            }
        } else {
            wanVar = new defpackage.wan(this, aolnVar);
        }
        java.lang.Object objD = wanVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wanVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.i.X();
            wanVar.c = 1;
            objD = aosv.D(ajcqVarX, wanVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.wal.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x014c  */
    /* JADX WARN: Code duplicated, block: B:37:0x014e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0153  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x015c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object c(aoln aolnVar) throws aois {
        defpackage.wao waoVar;
        defpackage.zoe zoeVar;
        defpackage.zoe zoeVar2;
        defpackage.zoe zoeVar3;
        defpackage.zoe zoeVar4;
        defpackage.zoe zoeVar5;
        defpackage.zoe zoeVar6;
        int i;
        int iOrdinal;
        int i2;
        defpackage.zmd zmdVar;
        akzx akzxVarM;
        boolean z;
        defpackage.waw wawVar;
        defpackage.wak wakVar;
        defpackage.amrr amrrVar;
        if (aolnVar instanceof defpackage.wao) {
            waoVar = (defpackage.wao) aolnVar;
            int i3 = waoVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                waoVar.c = i3 - Integer.MIN_VALUE;
            } else {
                waoVar = new defpackage.wao(this, aolnVar);
            }
        } else {
            waoVar = new defpackage.wao(this, aolnVar);
        }
        java.lang.Object objA = waoVar.a;
        aolu aoluVar = aolu.a;
        int i4 = waoVar.c;
        defpackage.zmi zmiVar = null;
        int i5 = 4;
        if (i4 != 0) {
            if (i4 == 1) {
                zoeVar = waoVar.f;
                zoeVar2 = waoVar.e;
                zoeVar3 = waoVar.d;
                aooc.af(objA);
            } else if (i4 == 2) {
                zoeVar4 = waoVar.f;
                zoeVar2 = waoVar.e;
                i5 = 4;
                zoeVar3 = waoVar.d;
                aooc.af(objA);
                defpackage.amte amteVar = (defpackage.amte) objA;
                aooh.f(amteVar, "value");
                akzx akzxVar = (akzx) zoeVar4.a;
                akzxVar.u();
                defpackage.zmf zmfVar = (defpackage.zmf) akzxVar.b;
                defpackage.zmf zmfVar2 = defpackage.zmf.a;
                j$.util.Objects.requireNonNull(amteVar);
                zmfVar.d = amteVar;
                zmfVar.b |= 2;
                zdi zdiVar = this.h;
                waoVar.d = zoeVar3;
                waoVar.e = zoeVar2;
                waoVar.f = null;
                waoVar.c = 3;
                objA = zdiVar.c(waoVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                zoeVar5 = zoeVar2;
                zoeVar6 = zoeVar3;
                boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                akzx akzxVar2 = (akzx) zoeVar5.a;
                akzxVar2.u();
                defpackage.zmf zmfVar3 = (defpackage.zmf) akzxVar2.b;
                defpackage.zmf zmfVar4 = defpackage.zmf.a;
                zmfVar3.b |= 4;
                zmfVar3.e = zBooleanValue;
                alad aladVarP = ((akzx) zoeVar6.a).p();
                aooh.e(aladVarP, "build(...)");
                defpackage.war warVar = this.f;
                waoVar.d = null;
                waoVar.e = null;
                i = i5;
                waoVar.c = i;
                objA = warVar.a((defpackage.zmf) aladVarP, waoVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                defpackage.zmk zmkVar = (defpackage.zmk) objA;
                iOrdinal = zmkVar.a.ordinal();
                if (iOrdinal != 0) {
                    i2 = 1;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                } else if (iOrdinal != 2) {
                    i2 = 3;
                } else {
                    i2 = 3;
                }
                zmdVar = zmkVar.b;
                if (zmdVar != null) {
                    if (zmdVar.b == 2) {
                        zmiVar = (defpackage.zmi) zmdVar.c;
                    } else {
                        zmiVar = defpackage.zmi.a;
                    }
                }
                akzxVarM = amrs.a.m();
                akzxVarM.u();
                amrs amrsVar = akzxVarM.b;
                amrsVar.c = i2 - 1;
                amrsVar.b |= 1;
                z = false;
                if (i2 == 2) {
                    d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "startRequest", 64, "CrossDeviceMetricsCallScopedRequestStarter.kt").v("Cross Device Metrics request was successful.");
                    amrrVar = zmiVar.b;
                    if (amrrVar == null) {
                        amrrVar = defpackage.amrr.a;
                    }
                    akzxVarM.u();
                    amrs amrsVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amrrVar);
                    amrsVar2.d = amrrVar;
                    amrsVar2.b |= 2;
                    z = zmiVar.c;
                }
                wawVar = this.g;
                amrs amrsVarP = akzxVarM.p();
                aooh.e(amrsVarP, "build(...)");
                wakVar = new defpackage.wak(z, amrsVarP);
                waoVar.c = 5;
                if (wawVar.b(wakVar, waoVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i4 == 3) {
                zoeVar5 = waoVar.e;
                zoeVar6 = waoVar.d;
                aooc.af(objA);
                i5 = 4;
                boolean zBooleanValue2 = ((java.lang.Boolean) objA).booleanValue();
                akzx akzxVar3 = (akzx) zoeVar5.a;
                akzxVar3.u();
                defpackage.zmf zmfVar5 = (defpackage.zmf) akzxVar3.b;
                defpackage.zmf zmfVar6 = defpackage.zmf.a;
                zmfVar5.b |= 4;
                zmfVar5.e = zBooleanValue2;
                alad aladVarP2 = ((akzx) zoeVar6.a).p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.war warVar2 = this.f;
                waoVar.d = null;
                waoVar.e = null;
                i = i5;
                waoVar.c = i;
                objA = warVar2.a((defpackage.zmf) aladVarP2, waoVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                defpackage.zmk zmkVar2 = (defpackage.zmk) objA;
                iOrdinal = zmkVar2.a.ordinal();
                if (iOrdinal != 0) {
                    i2 = 1;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                } else if (iOrdinal != 2) {
                    i2 = 3;
                } else {
                    i2 = 3;
                }
                zmdVar = zmkVar2.b;
                if (zmdVar != null) {
                    if (zmdVar.b == 2) {
                        zmiVar = (defpackage.zmi) zmdVar.c;
                    } else {
                        zmiVar = defpackage.zmi.a;
                    }
                }
                akzxVarM = amrs.a.m();
                akzxVarM.u();
                amrs amrsVar3 = akzxVarM.b;
                amrsVar3.c = i2 - 1;
                amrsVar3.b |= 1;
                z = false;
                if (i2 == 2) {
                    d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "startRequest", 64, "CrossDeviceMetricsCallScopedRequestStarter.kt").v("Cross Device Metrics request was successful.");
                    amrrVar = zmiVar.b;
                    if (amrrVar == null) {
                        amrrVar = defpackage.amrr.a;
                    }
                    akzxVarM.u();
                    amrs amrsVar4 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amrrVar);
                    amrsVar4.d = amrrVar;
                    amrsVar4.b |= 2;
                    z = zmiVar.c;
                }
                wawVar = this.g;
                amrs amrsVarP2 = akzxVarM.p();
                aooh.e(amrsVarP2, "build(...)");
                wakVar = new defpackage.wak(z, amrsVarP2);
                waoVar.c = 5;
                if (wawVar.b(wakVar, waoVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i4 == 4) {
                aooc.af(objA);
                i = 4;
                defpackage.zmk zmkVar3 = (defpackage.zmk) objA;
                iOrdinal = zmkVar3.a.ordinal();
                if (iOrdinal != 0) {
                    i2 = 1;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                } else if (iOrdinal != 2 || iOrdinal == 5) {
                    i2 = 3;
                } else {
                    i2 = i;
                }
                zmdVar = zmkVar3.b;
                if (zmdVar != null) {
                    if (zmdVar.b == 2) {
                        zmiVar = (defpackage.zmi) zmdVar.c;
                    } else {
                        zmiVar = defpackage.zmi.a;
                    }
                }
                akzxVarM = amrs.a.m();
                akzxVarM.u();
                amrs amrsVar5 = akzxVarM.b;
                amrsVar5.c = i2 - 1;
                amrsVar5.b |= 1;
                z = false;
                if (i2 == 2 && zmiVar != null) {
                    d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "startRequest", 64, "CrossDeviceMetricsCallScopedRequestStarter.kt").v("Cross Device Metrics request was successful.");
                    amrrVar = zmiVar.b;
                    if (amrrVar == null) {
                        amrrVar = defpackage.amrr.a;
                    }
                    akzxVarM.u();
                    amrs amrsVar6 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amrrVar);
                    amrsVar6.d = amrrVar;
                    amrsVar6.b |= 2;
                    z = zmiVar.c;
                }
                wawVar = this.g;
                amrs amrsVarP3 = akzxVarM.p();
                aooh.e(amrsVarP3, "build(...)");
                wakVar = new defpackage.wak(z, amrsVarP3);
                waoVar.c = 5;
                if (wawVar.b(wakVar, waoVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i4 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "startRequest", 50, "CrossDeviceMetricsCallScopedRequestStarter.kt").v("Starting Cross Device Metrics request.");
        akzx akzxVarM2 = defpackage.zmf.a.m();
        aooh.f(akzxVarM2, "builder");
        zoeVar = new defpackage.zoe(akzxVarM2);
        waoVar.d = zoeVar;
        waoVar.e = zoeVar;
        waoVar.f = zoeVar;
        waoVar.c = 1;
        objA = a(waoVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        zoeVar2 = zoeVar;
        zoeVar3 = zoeVar2;
        defpackage.zme zmeVar = (defpackage.zme) objA;
        aooh.f(zmeVar, "value");
        akzx akzxVar4 = (akzx) zoeVar.a;
        akzxVar4.u();
        defpackage.zmf zmfVar7 = (defpackage.zmf) akzxVar4.b;
        defpackage.zmf zmfVar8 = defpackage.zmf.a;
        j$.util.Objects.requireNonNull(zmeVar);
        zmfVar7.c = zmeVar;
        zmfVar7.b |= 1;
        defpackage.wat watVar = this.e;
        waoVar.d = zoeVar3;
        waoVar.e = zoeVar2;
        waoVar.f = zoeVar2;
        waoVar.c = 2;
        objA = watVar.a(waoVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        zoeVar4 = zoeVar2;
        defpackage.amte amteVar2 = (defpackage.amte) objA;
        aooh.f(amteVar2, "value");
        akzx akzxVar5 = (akzx) zoeVar4.a;
        akzxVar5.u();
        defpackage.zmf zmfVar9 = (defpackage.zmf) akzxVar5.b;
        defpackage.zmf zmfVar10 = defpackage.zmf.a;
        j$.util.Objects.requireNonNull(amteVar2);
        zmfVar9.d = amteVar2;
        zmfVar9.b |= 2;
        zdi zdiVar2 = this.h;
        waoVar.d = zoeVar3;
        waoVar.e = zoeVar2;
        waoVar.f = null;
        waoVar.c = 3;
        objA = zdiVar2.c(waoVar);
        if (objA != aoluVar) {
            return aoluVar;
        }
        zoeVar5 = zoeVar2;
        zoeVar6 = zoeVar3;
        boolean zBooleanValue3 = ((java.lang.Boolean) objA).booleanValue();
        akzx akzxVar6 = (akzx) zoeVar5.a;
        akzxVar6.u();
        defpackage.zmf zmfVar11 = (defpackage.zmf) akzxVar6.b;
        defpackage.zmf zmfVar12 = defpackage.zmf.a;
        zmfVar11.b |= 4;
        zmfVar11.e = zBooleanValue3;
        alad aladVarP3 = ((akzx) zoeVar6.a).p();
        aooh.e(aladVarP3, "build(...)");
        defpackage.war warVar3 = this.f;
        waoVar.d = null;
        waoVar.e = null;
        i = i5;
        waoVar.c = i;
        objA = warVar3.a((defpackage.zmf) aladVarP3, waoVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.zmk zmkVar4 = (defpackage.zmk) objA;
        iOrdinal = zmkVar4.a.ordinal();
        if (iOrdinal != 0) {
            i2 = 1;
        } else if (iOrdinal != 1) {
            i2 = 2;
        } else if (iOrdinal != 2) {
            i2 = 3;
        } else {
            i2 = 3;
        }
        zmdVar = zmkVar4.b;
        if (zmdVar != null) {
            if (zmdVar.b == 2) {
                zmiVar = (defpackage.zmi) zmdVar.c;
            } else {
                zmiVar = defpackage.zmi.a;
            }
        }
        akzxVarM = amrs.a.m();
        akzxVarM.u();
        amrs amrsVar7 = akzxVarM.b;
        amrsVar7.c = i2 - 1;
        amrsVar7.b |= 1;
        z = false;
        if (i2 == 2) {
            d.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsCallScopedRequestStarter", "startRequest", 64, "CrossDeviceMetricsCallScopedRequestStarter.kt").v("Cross Device Metrics request was successful.");
            amrrVar = zmiVar.b;
            if (amrrVar == null) {
                amrrVar = defpackage.amrr.a;
            }
            akzxVarM.u();
            amrs amrsVar8 = akzxVarM.b;
            j$.util.Objects.requireNonNull(amrrVar);
            amrsVar8.d = amrrVar;
            amrsVar8.b |= 2;
            z = zmiVar.c;
        }
        wawVar = this.g;
        amrs amrsVarP4 = akzxVarM.p();
        aooh.e(amrsVarP4, "build(...)");
        wakVar = new defpackage.wak(z, amrsVarP4);
        waoVar.c = 5;
        if (wawVar.b(wakVar, waoVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
