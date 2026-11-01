package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nyl implements defpackage.sqn {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/duo/phonelookup/MeetPhoneLookupContributor");
    public final defpackage.nxg a;
    public final defpackage.nwu b;
    public final defpackage.aoin c;
    private final defpackage.aoss e;
    private final defpackage.aoss f;
    private final defpackage.rlv g;
    private final defpackage.olc h;

    public nyl(defpackage.olc olcVar, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.nxg nxgVar, defpackage.nwu nwuVar, defpackage.aoin aoinVar, defpackage.rlv rlvVar) {
        if (olcVar == null) {
            defpackage.aooh.i("dialerMeetLibrary");
        }
        if (aossVar == null) {
            defpackage.aooh.i("futureScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (nxgVar == null) {
            defpackage.aooh.i("meetDataRepository");
        }
        if (nwuVar == null) {
            defpackage.aooh.i("meetCallController");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableIncallMeetApiIntegration");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.h = olcVar;
        this.e = aossVar;
        this.f = aossVar2;
        this.a = nxgVar;
        this.b = nwuVar;
        this.c = aoinVar;
        this.g = rlvVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        if (aigfVar == null) {
            defpackage.aooh.i("existingInfoMap");
        }
        return defpackage.aosv.F(this.e, 0, new defpackage.bur(this, aigfVar, (defpackage.aoln) null, 17), 3);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        defpackage.aooh.f(aihdVar, "phoneNumbers");
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.aooh.f(hkdVar, "dialerPhoneNumber");
        return defpackage.aosv.F(this.e, 0, new nyj(this, hkdVar, (defpackage.aoln) null), 3);
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ java.lang.Object f(spn spnVar) {
        defpackage.aooh.f(spnVar, "phoneLookupInfo");
        defpackage.nwy nwyVar = spnVar.r;
        if (nwyVar == null) {
            nwyVar = defpackage.nwy.a;
        }
        defpackage.aooh.e(nwyVar, "getMeetInfo(...)");
        return nwyVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "MeetPhoneLookupContributor";
    }

    @Override // defpackage.sqn
    public final /* bridge */ /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        defpackage.nwy nwyVar = (defpackage.nwy) obj;
        defpackage.aooh.f(akzxVar, "phoneLookupInfo");
        defpackage.aooh.f(nwyVar, "subMessage");
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(nwyVar);
        spnVar.r = nwyVar;
        spnVar.b |= 32768;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final java.lang.Object i(defpackage.aigf aigfVar, defpackage.aoln aolnVar) {
        defpackage.nyi nyiVar;
        defpackage.ahoq ahoqVarX;
        java.lang.Object objC;
        defpackage.ahoq ahoqVar;
        java.lang.Throwable th;
        java.lang.Object obj;
        ?? r7;
        if (aolnVar instanceof defpackage.nyi) {
            nyiVar = (defpackage.nyi) aolnVar;
            int i = nyiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nyiVar.d = i - Integer.MIN_VALUE;
            } else {
                nyiVar = new defpackage.nyi(this, aolnVar);
            }
        } else {
            nyiVar = new defpackage.nyi(this, aolnVar);
        }
        java.lang.Object obj2 = nyiVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nyiVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (!defpackage.ahvr.R(nyiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoqVarX = defpackage.ahvr.X(395, "MeetPhoneLookupContributor_getMostRecentInfoInternal", defpackage.ahot.a, true);
            try {
                defpackage.nxg nxgVar = this.a;
                nyiVar.a = aigfVar;
                nyiVar.e = ahoqVarX;
                nyiVar.d = 1;
                objC = nxgVar.c(nyiVar);
                r7 = aigfVar;
                obj = aoluVar;
                if (objC != aoluVar) {
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarX;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = nyiVar.e;
        java.lang.Object obj3 = nyiVar.a;
        try {
            defpackage.aooc.af(obj2);
            ahoqVarX = ahoqVar;
            r7 = obj3;
            objC = obj2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        defpackage.aigf aigfVar2 = (defpackage.aigf) objC;
        defpackage.nwv nwvVarA = this.b.a();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r7.size()));
        for (java.util.Map.Entry entry : r7.entrySet()) {
            java.lang.Object key = entry.getKey();
            defpackage.kaw kawVarAN = defpackage.gus.aN(defpackage.nwy.a.m());
            if (nwvVarA == null) {
                defpackage.aooh.g();
            }
            kawVarAN.y(nwvVarA);
            nwx nwxVar = (nwx) aigfVar2.get(((hkd) entry.getKey()).c);
            if (nwxVar == null) {
                nwxVar = nwx.a;
            }
            kawVarAN.z(nwxVar);
            linkedHashMap.put(key, kawVarAN.x());
        }
        defpackage.ajsz.ak(ahoqVarX, null);
        obj = linkedHashMap;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.String str, defpackage.aoln aolnVar) {
        nyk nykVar;
        defpackage.aoot aootVar;
        java.lang.String str2;
        defpackage.aoot aootVar2;
        defpackage.aoot aootVar3;
        java.lang.String str3;
        defpackage.aoot aootVar4;
        defpackage.nwy nwyVar;
        defpackage.aoot aootVar5;
        java.lang.String str4;
        nwx nwxVarB;
        if (aolnVar instanceof nyk) {
            nykVar = (nyk) aolnVar;
            int i = nykVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nykVar.c = i - Integer.MIN_VALUE;
            } else {
                nykVar = new nyk(this, aolnVar);
            }
        } else {
            nykVar = new nyk(this, aolnVar);
        }
        java.lang.Object objA = nykVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = nykVar.c;
        int iAR = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                aootVar = nykVar.f;
                defpackage.aoot aootVar6 = nykVar.e;
                java.lang.String str5 = nykVar.d;
                defpackage.aooc.af(objA);
                aootVar2 = aootVar6;
                str2 = str5;
            } else if (i2 == 2) {
                aootVar3 = nykVar.e;
                str2 = nykVar.d;
                defpackage.aooc.af(objA);
                if (!((java.lang.Boolean) objA).booleanValue()) {
                    ((defpackage.aimw) d.b().l("com/android/dialer/duo/phonelookup/MeetPhoneLookupContributor", "lookupInternal", 73, "MeetPhoneLookupContributor.kt")).v("Meet is on legacy client, show disabled Meet button");
                    this.g.o(defpackage.rmx.MEET_ON_LEGACY_CLIENT);
                    aootVar3.a = defpackage.nwv.AVAILABLE_NO_REACHABILITY;
                    aootVar4 = aootVar3;
                    str3 = str2;
                    nwyVar = null;
                    defpackage.aoov.an(this.f, null, 0, new blv(this, aootVar4, nwyVar, str3, (defpackage.aoln) null, 12), 3);
                    defpackage.kaw kawVarAN = defpackage.gus.aN(defpackage.nwy.a.m());
                    kawVarAN.y((defpackage.nwv) aootVar4.a);
                    if (nwyVar != null) {
                        nwxVarB = nwx.b(nwyVar.d);
                        if (nwxVarB == null) {
                            nwxVarB = nwx.d;
                        }
                    } else {
                        nwxVarB = nwx.a;
                    }
                    kawVarAN.z(nwxVarB);
                    if (nwyVar != null && (iAR = defpackage.a.aR(nwyVar.f)) == 0) {
                        iAR = 1;
                    }
                    kawVarAN.A(iAR);
                    return kawVarAN.x();
                }
                this.g.o(defpackage.rmx.MEET_REACHABILITY_FOR_SINGLE_NUMBER_REQUESTED);
                defpackage.olc olcVar = this.h;
                nykVar.d = str2;
                nykVar.e = aootVar3;
                nykVar.c = 3;
                objA = defpackage.aoov.aj(olcVar.d, new olb(str2, olcVar, (defpackage.aoln) null), nykVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                aootVar5 = aootVar3;
                str4 = str2;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aootVar5 = nykVar.e;
                str4 = nykVar.d;
                defpackage.aooc.af(objA);
            }
            str3 = str4;
            aootVar4 = aootVar5;
            nwyVar = (defpackage.nwy) objA;
            defpackage.aoov.an(this.f, null, 0, new blv(this, aootVar4, nwyVar, str3, (defpackage.aoln) null, 12), 3);
            defpackage.kaw kawVarAN2 = defpackage.gus.aN(defpackage.nwy.a.m());
            kawVarAN2.y((defpackage.nwv) aootVar4.a);
            if (nwyVar != null) {
                nwxVarB = nwx.b(nwyVar.d);
                if (nwxVarB == null) {
                    nwxVarB = nwx.d;
                }
            } else {
                nwxVarB = nwx.a;
            }
            kawVarAN2.z(nwxVarB);
            if (nwyVar != null) {
                iAR = 1;
            }
            kawVarAN2.A(iAR);
            return kawVarAN2.x();
        }
        defpackage.aooc.af(objA);
        this.g.o(defpackage.rmx.MEET_INFO_REQUESTED);
        aootVar = new defpackage.aoot();
        defpackage.olc olcVar2 = this.h;
        nykVar.d = str;
        nykVar.e = aootVar;
        nykVar.f = aootVar;
        nykVar.c = 1;
        objA = olcVar2.a(nykVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        aootVar2 = aootVar;
        aootVar.a = objA;
        if (aootVar2.a != defpackage.nwv.AVAILABLE) {
            str3 = str2;
            aootVar4 = aootVar2;
        } else {
            defpackage.olc olcVar3 = this.h;
            nykVar.d = str2;
            nykVar.e = aootVar2;
            nykVar.f = null;
            nykVar.c = 2;
            objA = olcVar3.c(nykVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aootVar3 = aootVar2;
            if (!((java.lang.Boolean) objA).booleanValue()) {
                this.g.o(defpackage.rmx.MEET_REACHABILITY_FOR_SINGLE_NUMBER_REQUESTED);
                defpackage.olc olcVar4 = this.h;
                nykVar.d = str2;
                nykVar.e = aootVar3;
                nykVar.c = 3;
                objA = defpackage.aoov.aj(olcVar4.d, new olb(str2, olcVar4, (defpackage.aoln) null), nykVar);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                aootVar5 = aootVar3;
                str4 = str2;
                str3 = str4;
                aootVar4 = aootVar5;
                nwyVar = (defpackage.nwy) objA;
                defpackage.aoov.an(this.f, null, 0, new blv(this, aootVar4, nwyVar, str3, (defpackage.aoln) null, 12), 3);
                defpackage.kaw kawVarAN3 = defpackage.gus.aN(defpackage.nwy.a.m());
                kawVarAN3.y((defpackage.nwv) aootVar4.a);
                if (nwyVar != null) {
                    nwxVarB = nwx.b(nwyVar.d);
                    if (nwxVarB == null) {
                        nwxVarB = nwx.d;
                    }
                } else {
                    nwxVarB = nwx.a;
                }
                kawVarAN3.z(nwxVarB);
                if (nwyVar != null) {
                    iAR = 1;
                }
                kawVarAN3.A(iAR);
                return kawVarAN3.x();
            }
            ((defpackage.aimw) d.b().l("com/android/dialer/duo/phonelookup/MeetPhoneLookupContributor", "lookupInternal", 73, "MeetPhoneLookupContributor.kt")).v("Meet is on legacy client, show disabled Meet button");
            this.g.o(defpackage.rmx.MEET_ON_LEGACY_CLIENT);
            aootVar3.a = defpackage.nwv.AVAILABLE_NO_REACHABILITY;
            aootVar4 = aootVar3;
            str3 = str2;
        }
        nwyVar = null;
        defpackage.aoov.an(this.f, null, 0, new blv(this, aootVar4, nwyVar, str3, (defpackage.aoln) null, 12), 3);
        defpackage.kaw kawVarAN4 = defpackage.gus.aN(defpackage.nwy.a.m());
        kawVarAN4.y((defpackage.nwv) aootVar4.a);
        if (nwyVar != null) {
            nwxVarB = nwx.b(nwyVar.d);
            if (nwxVarB == null) {
                nwxVarB = nwx.d;
            }
        } else {
            nwxVarB = nwx.a;
        }
        kawVarAN4.z(nwxVarB);
        if (nwyVar != null) {
            iAR = 1;
        }
        kawVarAN4.A(iAR);
        return kawVarAN4.x();
    }
}
