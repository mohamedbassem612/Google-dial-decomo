package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsm extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ defpackage.lsn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsm(defpackage.lsn lsnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = lsnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0157  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x024c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0260  */
    /* JADX WARN: Code duplicated, block: B:69:0x027c  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objB;
        defpackage.lsn lsnVar;
        android.os.Bundle bundle;
        java.lang.Object objE;
        java.lang.String str;
        java.lang.Object objF;
        android.os.Bundle bundle2;
        java.lang.String str2;
        java.lang.Object objA;
        java.util.ArrayList<java.lang.String> stringArrayList;
        int size;
        java.lang.Object objA2;
        defpackage.lrc lrcVar;
        java.lang.Object objE2;
        java.lang.String str3;
        int length;
        java.lang.Object objA3;
        java.lang.Object objCO;
        java.lang.Object oqVar;
        java.lang.Object obj2;
        java.lang.Object objE3;
        defpackage.oq oqVar2;
        defpackage.oq oqVar3;
        java.lang.String str4;
        java.lang.Object objB2;
        int iOrdinal;
        java.lang.Object objH;
        aolu aoluVar = aolu.a;
        switch (this.f) {
            case 0:
                aooc.af(obj);
                defpackage.lsn lsnVar2 = this.g;
                if (lsnVar2.d.d() && !lsnVar2.p) {
                    this.f = 1;
                    objB = lsnVar2.b(this);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    lsnVar = this.g;
                    bundle = (android.os.Bundle) objB;
                    if (((java.lang.Boolean) lsnVar.g.a()).booleanValue()) {
                        this.a = bundle;
                        this.f = 2;
                        objE = lsnVar.e(this);
                        if (objE == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.lsn lsnVar3 = this.g;
                        str = (java.lang.String) objE;
                        this.a = bundle;
                        this.b = str;
                        this.f = 3;
                        objF = lsnVar3.f(this);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        bundle2 = bundle;
                        str2 = str;
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 243, "ContactCheckerReceiverController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str2, (java.lang.String) objF);
                        bundle = bundle2;
                    }
                    defpackage.lsn lsnVar4 = this.g;
                    boolean zContainsKey = bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER");
                    this.a = bundle;
                    this.b = null;
                    this.f = 4;
                    defpackage.lrc lrcVar2 = lsnVar4.l;
                    objA = ahvr.ag(lrcVar2.a, lrcVar2.g, new defpackage.jcm(lrcVar2, zContainsKey, (aoln) null, 2)).a(this);
                    if (objA != aoluVar) {
                        objA = aojh.a;
                    }
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                    if (stringArrayList != null) {
                        size = stringArrayList.size();
                    } else {
                        size = 0;
                    }
                    if (size > 0) {
                        defpackage.lsn lsnVar5 = this.g;
                        this.a = null;
                        this.f = 5;
                        defpackage.lrc lrcVar3 = lsnVar5.l;
                        objA2 = ahvr.ag(lrcVar3.a, lrcVar3.g, new defpackage.bck(lrcVar3, size, (aoln) null, 4, (byte[]) null)).a(this);
                        if (objA2 != aoluVar) {
                            objA2 = aojh.a;
                        }
                        if (objA2 == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.lsn lsnVar6 = this.g;
                        lrcVar = lsnVar6.l;
                        this.a = lrcVar;
                        this.f = 6;
                        objE2 = lsnVar6.e(this);
                        if (objE2 == aoluVar) {
                            return aoluVar;
                        }
                        str3 = (java.lang.String) objE2;
                        if (str3 != null) {
                            length = str3.length();
                        } else {
                            length = 0;
                        }
                        this.a = null;
                        this.f = 7;
                        objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                        if (objA3 != aoluVar) {
                            objA3 = aojh.a;
                        }
                        if (objA3 == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                    defpackage.lsn lsnVar7 = this.g;
                    objCO = mni.cO(defpackage.ltu.a.m());
                    akzx akzxVarM = defpackage.ltt.a.m();
                    aooh.f(akzxVarM, "builder");
                    oqVar = new defpackage.oq(akzxVarM);
                    this.a = objCO;
                    this.b = oqVar;
                    this.c = oqVar;
                    this.d = objCO;
                    obj2 = lsnVar7.d;
                    this.e = obj2;
                    this.f = 8;
                    objE3 = lsnVar7.e(this);
                    if (objE3 != aoluVar) {
                        return aoluVar;
                    }
                    oqVar2 = objCO;
                    oqVar3 = oqVar;
                    str4 = (java.lang.String) objE3;
                    if (str4 != null) {
                        akzx akzxVar = (akzx) ((defpackage.oq) oqVar).a;
                        akzxVar.u();
                        defpackage.ltt lttVar = (defpackage.ltt) akzxVar.b;
                        defpackage.ltt lttVar2 = defpackage.ltt.a;
                        j$.util.Objects.requireNonNull(str4);
                        lttVar.b |= 1;
                        lttVar.c = str4;
                    }
                    alad aladVarP = ((akzx) oqVar3.a).p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.ltt lttVar3 = (defpackage.ltt) aladVarP;
                    aooh.f(lttVar3, "value");
                    akzx akzxVar2 = (akzx) ((defpackage.oq) objCO).a;
                    akzxVar2.u();
                    defpackage.ltu ltuVar = (defpackage.ltu) akzxVar2.b;
                    defpackage.ltu ltuVar2 = defpackage.ltu.a;
                    j$.util.Objects.requireNonNull(lttVar3);
                    ltuVar.c = lttVar3;
                    ltuVar.b = 3;
                    defpackage.ltu ltuVarO = oqVar2.o();
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = 9;
                    objB2 = ((defpackage.lug) obj2).b(ltuVarO, this);
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                    iOrdinal = ((zfm) objB2).ordinal();
                    if (iOrdinal != 0) {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                    } else if (iOrdinal != 5) {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                        defpackage.lsn lsnVar8 = this.g;
                        this.f = 10;
                        objH = lsnVar8.h(this);
                        if (objH == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objH).booleanValue()) {
                            this.g.k.a(mcd.aX);
                        }
                    } else {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                objB = obj;
                lsnVar = this.g;
                bundle = (android.os.Bundle) objB;
                if (((java.lang.Boolean) lsnVar.g.a()).booleanValue()) {
                    this.a = bundle;
                    this.f = 2;
                    objE = lsnVar.e(this);
                    if (objE == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.lsn lsnVar9 = this.g;
                    str = (java.lang.String) objE;
                    this.a = bundle;
                    this.b = str;
                    this.f = 3;
                    objF = lsnVar9.f(this);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    bundle2 = bundle;
                    str2 = str;
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 243, "ContactCheckerReceiverController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str2, (java.lang.String) objF);
                    bundle = bundle2;
                }
                defpackage.lsn lsnVar10 = this.g;
                boolean zContainsKey2 = bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER");
                this.a = bundle;
                this.b = null;
                this.f = 4;
                defpackage.lrc lrcVar4 = lsnVar10.l;
                objA = ahvr.ag(lrcVar4.a, lrcVar4.g, new defpackage.jcm(lrcVar4, zContainsKey2, (aoln) null, 2)).a(this);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
                stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                if (stringArrayList != null) {
                    size = stringArrayList.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    defpackage.lsn lsnVar11 = this.g;
                    this.a = null;
                    this.f = 5;
                    defpackage.lrc lrcVar5 = lsnVar11.l;
                    objA2 = ahvr.ag(lrcVar5.a, lrcVar5.g, new defpackage.bck(lrcVar5, size, (aoln) null, 4, (byte[]) null)).a(this);
                    if (objA2 != aoluVar) {
                        objA2 = aojh.a;
                    }
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.lsn lsnVar12 = this.g;
                    lrcVar = lsnVar12.l;
                    this.a = lrcVar;
                    this.f = 6;
                    objE2 = lsnVar12.e(this);
                    if (objE2 == aoluVar) {
                        return aoluVar;
                    }
                    str3 = (java.lang.String) objE2;
                    if (str3 != null) {
                        length = str3.length();
                    } else {
                        length = 0;
                    }
                    this.a = null;
                    this.f = 7;
                    objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                    if (objA3 != aoluVar) {
                        objA3 = aojh.a;
                    }
                    if (objA3 == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar13 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM2 = defpackage.ltt.a.m();
                aooh.f(akzxVarM2, "builder");
                oqVar = new defpackage.oq(akzxVarM2);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar13.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar13.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar3 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar3.u();
                    defpackage.ltt lttVar4 = (defpackage.ltt) akzxVar3.b;
                    defpackage.ltt lttVar5 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar4.b |= 1;
                    lttVar4.c = str4;
                }
                alad aladVarP2 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.ltt lttVar6 = (defpackage.ltt) aladVarP2;
                aooh.f(lttVar6, "value");
                akzx akzxVar4 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar4.u();
                defpackage.ltu ltuVar3 = (defpackage.ltu) akzxVar4.b;
                defpackage.ltu ltuVar4 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar6);
                ltuVar3.c = lttVar6;
                ltuVar3.b = 3;
                defpackage.ltu ltuVarO2 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO2, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar14 = this.g;
                    this.f = 10;
                    objH = lsnVar14.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 2:
                bundle = (android.os.Bundle) this.a;
                aooc.af(obj);
                objE = obj;
                defpackage.lsn lsnVar15 = this.g;
                str = (java.lang.String) objE;
                this.a = bundle;
                this.b = str;
                this.f = 3;
                objF = lsnVar15.f(this);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                bundle2 = bundle;
                str2 = str;
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 243, "ContactCheckerReceiverController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str2, (java.lang.String) objF);
                bundle = bundle2;
                defpackage.lsn lsnVar16 = this.g;
                boolean zContainsKey3 = bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER");
                this.a = bundle;
                this.b = null;
                this.f = 4;
                defpackage.lrc lrcVar6 = lsnVar16.l;
                objA = ahvr.ag(lrcVar6.a, lrcVar6.g, new defpackage.jcm(lrcVar6, zContainsKey3, (aoln) null, 2)).a(this);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
                stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                if (stringArrayList != null) {
                    size = stringArrayList.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    defpackage.lsn lsnVar17 = this.g;
                    this.a = null;
                    this.f = 5;
                    defpackage.lrc lrcVar7 = lsnVar17.l;
                    objA2 = ahvr.ag(lrcVar7.a, lrcVar7.g, new defpackage.bck(lrcVar7, size, (aoln) null, 4, (byte[]) null)).a(this);
                    if (objA2 != aoluVar) {
                        objA2 = aojh.a;
                    }
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.lsn lsnVar18 = this.g;
                    lrcVar = lsnVar18.l;
                    this.a = lrcVar;
                    this.f = 6;
                    objE2 = lsnVar18.e(this);
                    if (objE2 == aoluVar) {
                        return aoluVar;
                    }
                    str3 = (java.lang.String) objE2;
                    if (str3 != null) {
                        length = str3.length();
                    } else {
                        length = 0;
                    }
                    this.a = null;
                    this.f = 7;
                    objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                    if (objA3 != aoluVar) {
                        objA3 = aojh.a;
                    }
                    if (objA3 == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar19 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM3 = defpackage.ltt.a.m();
                aooh.f(akzxVarM3, "builder");
                oqVar = new defpackage.oq(akzxVarM3);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar19.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar19.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar5 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar5.u();
                    defpackage.ltt lttVar7 = (defpackage.ltt) akzxVar5.b;
                    defpackage.ltt lttVar8 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar7.b |= 1;
                    lttVar7.c = str4;
                }
                alad aladVarP3 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.ltt lttVar9 = (defpackage.ltt) aladVarP3;
                aooh.f(lttVar9, "value");
                akzx akzxVar6 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar6.u();
                defpackage.ltu ltuVar5 = (defpackage.ltu) akzxVar6.b;
                defpackage.ltu ltuVar6 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar9);
                ltuVar5.c = lttVar9;
                ltuVar5.b = 3;
                defpackage.ltu ltuVarO3 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO3, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar110 = this.g;
                    this.f = 10;
                    objH = lsnVar110.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 3:
                str2 = (java.lang.String) this.b;
                bundle2 = (android.os.Bundle) this.a;
                aooc.af(obj);
                objF = obj;
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 243, "ContactCheckerReceiverController.kt").I("ContactChecker: FirstForwardedNumber: %s, LastForwardedNumber: %s", str2, (java.lang.String) objF);
                bundle = bundle2;
                defpackage.lsn lsnVar111 = this.g;
                boolean zContainsKey4 = bundle.containsKey("android.telecom.extra.LAST_FORWARDED_NUMBER");
                this.a = bundle;
                this.b = null;
                this.f = 4;
                defpackage.lrc lrcVar8 = lsnVar111.l;
                objA = ahvr.ag(lrcVar8.a, lrcVar8.g, new defpackage.jcm(lrcVar8, zContainsKey4, (aoln) null, 2)).a(this);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
                stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                if (stringArrayList != null) {
                    size = stringArrayList.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    defpackage.lsn lsnVar112 = this.g;
                    this.a = null;
                    this.f = 5;
                    defpackage.lrc lrcVar9 = lsnVar112.l;
                    objA2 = ahvr.ag(lrcVar9.a, lrcVar9.g, new defpackage.bck(lrcVar9, size, (aoln) null, 4, (byte[]) null)).a(this);
                    if (objA2 != aoluVar) {
                        objA2 = aojh.a;
                    }
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.lsn lsnVar113 = this.g;
                    lrcVar = lsnVar113.l;
                    this.a = lrcVar;
                    this.f = 6;
                    objE2 = lsnVar113.e(this);
                    if (objE2 == aoluVar) {
                        return aoluVar;
                    }
                    str3 = (java.lang.String) objE2;
                    if (str3 != null) {
                        length = str3.length();
                    } else {
                        length = 0;
                    }
                    this.a = null;
                    this.f = 7;
                    objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                    if (objA3 != aoluVar) {
                        objA3 = aojh.a;
                    }
                    if (objA3 == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar114 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM4 = defpackage.ltt.a.m();
                aooh.f(akzxVarM4, "builder");
                oqVar = new defpackage.oq(akzxVarM4);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar114.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar114.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar7 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar7.u();
                    defpackage.ltt lttVar10 = (defpackage.ltt) akzxVar7.b;
                    defpackage.ltt lttVar11 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar10.b |= 1;
                    lttVar10.c = str4;
                }
                alad aladVarP4 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP4, "build(...)");
                defpackage.ltt lttVar12 = (defpackage.ltt) aladVarP4;
                aooh.f(lttVar12, "value");
                akzx akzxVar8 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar8.u();
                defpackage.ltu ltuVar7 = (defpackage.ltu) akzxVar8.b;
                defpackage.ltu ltuVar8 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar12);
                ltuVar7.c = lttVar12;
                ltuVar7.b = 3;
                defpackage.ltu ltuVarO4 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO4, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar115 = this.g;
                    this.f = 10;
                    objH = lsnVar115.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 4:
                bundle = (android.os.Bundle) this.a;
                aooc.af(obj);
                stringArrayList = bundle.getStringArrayList("android.telecom.extra.LAST_FORWARDED_NUMBER");
                if (stringArrayList != null) {
                    size = stringArrayList.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    defpackage.lsn lsnVar116 = this.g;
                    this.a = null;
                    this.f = 5;
                    defpackage.lrc lrcVar10 = lsnVar116.l;
                    objA2 = ahvr.ag(lrcVar10.a, lrcVar10.g, new defpackage.bck(lrcVar10, size, (aoln) null, 4, (byte[]) null)).a(this);
                    if (objA2 != aoluVar) {
                        objA2 = aojh.a;
                    }
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.lsn lsnVar117 = this.g;
                    lrcVar = lsnVar117.l;
                    this.a = lrcVar;
                    this.f = 6;
                    objE2 = lsnVar117.e(this);
                    if (objE2 == aoluVar) {
                        return aoluVar;
                    }
                    str3 = (java.lang.String) objE2;
                    if (str3 != null) {
                        length = str3.length();
                    } else {
                        length = 0;
                    }
                    this.a = null;
                    this.f = 7;
                    objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                    if (objA3 != aoluVar) {
                        objA3 = aojh.a;
                    }
                    if (objA3 == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar118 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM5 = defpackage.ltt.a.m();
                aooh.f(akzxVarM5, "builder");
                oqVar = new defpackage.oq(akzxVarM5);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar118.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar118.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar9 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar9.u();
                    defpackage.ltt lttVar13 = (defpackage.ltt) akzxVar9.b;
                    defpackage.ltt lttVar14 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar13.b |= 1;
                    lttVar13.c = str4;
                }
                alad aladVarP5 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP5, "build(...)");
                defpackage.ltt lttVar15 = (defpackage.ltt) aladVarP5;
                aooh.f(lttVar15, "value");
                akzx akzxVar10 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar10.u();
                defpackage.ltu ltuVar9 = (defpackage.ltu) akzxVar10.b;
                defpackage.ltu ltuVar10 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar15);
                ltuVar9.c = lttVar15;
                ltuVar9.b = 3;
                defpackage.ltu ltuVarO5 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO5, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar119 = this.g;
                    this.f = 10;
                    objH = lsnVar119.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 5:
                aooc.af(obj);
                defpackage.lsn lsnVar1110 = this.g;
                lrcVar = lsnVar1110.l;
                this.a = lrcVar;
                this.f = 6;
                objE2 = lsnVar1110.e(this);
                if (objE2 == aoluVar) {
                    return aoluVar;
                }
                str3 = (java.lang.String) objE2;
                if (str3 != null) {
                    length = str3.length();
                } else {
                    length = 0;
                }
                this.a = null;
                this.f = 7;
                objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                if (objA3 != aoluVar) {
                    objA3 = aojh.a;
                }
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar1111 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM6 = defpackage.ltt.a.m();
                aooh.f(akzxVarM6, "builder");
                oqVar = new defpackage.oq(akzxVarM6);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar1111.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar1111.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar11 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar11.u();
                    defpackage.ltt lttVar16 = (defpackage.ltt) akzxVar11.b;
                    defpackage.ltt lttVar17 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar16.b |= 1;
                    lttVar16.c = str4;
                }
                alad aladVarP6 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP6, "build(...)");
                defpackage.ltt lttVar18 = (defpackage.ltt) aladVarP6;
                aooh.f(lttVar18, "value");
                akzx akzxVar12 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar12.u();
                defpackage.ltu ltuVar11 = (defpackage.ltu) akzxVar12.b;
                defpackage.ltu ltuVar12 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar18);
                ltuVar11.c = lttVar18;
                ltuVar11.b = 3;
                defpackage.ltu ltuVarO6 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO6, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar1112 = this.g;
                    this.f = 10;
                    objH = lsnVar1112.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 6:
                defpackage.lrc lrcVar11 = (defpackage.lrc) this.a;
                aooc.af(obj);
                lrcVar = lrcVar11;
                objE2 = obj;
                str3 = (java.lang.String) objE2;
                if (str3 != null) {
                    length = str3.length();
                } else {
                    length = 0;
                }
                this.a = null;
                this.f = 7;
                objA3 = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.bck(lrcVar, length, (aoln) null, 3)).a(this);
                if (objA3 != aoluVar) {
                    objA3 = aojh.a;
                }
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar1113 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM7 = defpackage.ltt.a.m();
                aooh.f(akzxVarM7, "builder");
                oqVar = new defpackage.oq(akzxVarM7);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar1113.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar1113.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar13 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar13.u();
                    defpackage.ltt lttVar19 = (defpackage.ltt) akzxVar13.b;
                    defpackage.ltt lttVar110 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar19.b |= 1;
                    lttVar19.c = str4;
                }
                alad aladVarP7 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP7, "build(...)");
                defpackage.ltt lttVar111 = (defpackage.ltt) aladVarP7;
                aooh.f(lttVar111, "value");
                akzx akzxVar14 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar14.u();
                defpackage.ltu ltuVar13 = (defpackage.ltu) akzxVar14.b;
                defpackage.ltu ltuVar14 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar111);
                ltuVar13.c = lttVar111;
                ltuVar13.b = 3;
                defpackage.ltu ltuVarO7 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO7, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar1114 = this.g;
                    this.f = 10;
                    objH = lsnVar1114.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 7:
                aooc.af(obj);
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 260, "ContactCheckerReceiverController.kt").v("Sending the challenge message to the caller");
                defpackage.lsn lsnVar1115 = this.g;
                objCO = mni.cO(defpackage.ltu.a.m());
                akzx akzxVarM8 = defpackage.ltt.a.m();
                aooh.f(akzxVarM8, "builder");
                oqVar = new defpackage.oq(akzxVarM8);
                this.a = objCO;
                this.b = oqVar;
                this.c = oqVar;
                this.d = objCO;
                obj2 = lsnVar1115.d;
                this.e = obj2;
                this.f = 8;
                objE3 = lsnVar1115.e(this);
                if (objE3 != aoluVar) {
                    return aoluVar;
                }
                oqVar2 = objCO;
                oqVar3 = oqVar;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar15 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar15.u();
                    defpackage.ltt lttVar112 = (defpackage.ltt) akzxVar15.b;
                    defpackage.ltt lttVar113 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar112.b |= 1;
                    lttVar112.c = str4;
                }
                alad aladVarP8 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP8, "build(...)");
                defpackage.ltt lttVar114 = (defpackage.ltt) aladVarP8;
                aooh.f(lttVar114, "value");
                akzx akzxVar16 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar16.u();
                defpackage.ltu ltuVar15 = (defpackage.ltu) akzxVar16.b;
                defpackage.ltu ltuVar16 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar114);
                ltuVar15.c = lttVar114;
                ltuVar15.b = 3;
                defpackage.ltu ltuVarO8 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO8, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar1116 = this.g;
                    this.f = 10;
                    objH = lsnVar1116.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 8:
                java.lang.Object obj3 = this.e;
                objCO = this.d;
                java.lang.Object obj4 = this.c;
                defpackage.oq oqVar4 = (defpackage.oq) this.b;
                defpackage.oq oqVar5 = (defpackage.oq) this.a;
                aooc.af(obj);
                oqVar = obj4;
                obj2 = obj3;
                objE3 = obj;
                oqVar3 = oqVar4;
                oqVar2 = oqVar5;
                str4 = (java.lang.String) objE3;
                if (str4 != null) {
                    akzx akzxVar17 = (akzx) ((defpackage.oq) oqVar).a;
                    akzxVar17.u();
                    defpackage.ltt lttVar115 = (defpackage.ltt) akzxVar17.b;
                    defpackage.ltt lttVar116 = defpackage.ltt.a;
                    j$.util.Objects.requireNonNull(str4);
                    lttVar115.b |= 1;
                    lttVar115.c = str4;
                }
                alad aladVarP9 = ((akzx) oqVar3.a).p();
                aooh.e(aladVarP9, "build(...)");
                defpackage.ltt lttVar117 = (defpackage.ltt) aladVarP9;
                aooh.f(lttVar117, "value");
                akzx akzxVar18 = (akzx) ((defpackage.oq) objCO).a;
                akzxVar18.u();
                defpackage.ltu ltuVar17 = (defpackage.ltu) akzxVar18.b;
                defpackage.ltu ltuVar18 = defpackage.ltu.a;
                j$.util.Objects.requireNonNull(lttVar117);
                ltuVar17.c = lttVar117;
                ltuVar17.b = 3;
                defpackage.ltu ltuVarO9 = oqVar2.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 9;
                objB2 = ((defpackage.lug) obj2).b(ltuVarO9, this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar1117 = this.g;
                    this.f = 10;
                    objH = lsnVar1117.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            case 9:
                aooc.af(obj);
                objB2 = obj;
                iOrdinal = ((zfm) objB2).ordinal();
                if (iOrdinal != 0) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 271, "ContactCheckerReceiverController.kt").v("Successfully sent the challenge message to caller");
                } else if (iOrdinal != 5) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 277, "ContactCheckerReceiverController.kt").v("Failed to send the challenge message to caller");
                    defpackage.lsn lsnVar1118 = this.g;
                    this.f = 10;
                    objH = lsnVar1118.h(this);
                    if (objH == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objH).booleanValue()) {
                        this.g.k.a(mcd.aX);
                    }
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "scheduleVerification$<anonymous>$<anonymous>", 274, "ContactCheckerReceiverController.kt").v("Challenge message sending was rejected");
                }
                return aojh.a;
            default:
                aooc.af(obj);
                objH = obj;
                if (((java.lang.Boolean) objH).booleanValue()) {
                    this.g.k.a(mcd.aX);
                }
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lsm(this.g, aolnVar);
    }
}
