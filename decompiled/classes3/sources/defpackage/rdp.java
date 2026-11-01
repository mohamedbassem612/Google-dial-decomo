package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdp {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public rdp(com.android.dialer.incall.voice.ui.VoiceScreenChipView voiceScreenChipView, ajwr ajwrVar) {
        this.a = voiceScreenChipView;
        this.b = ajwrVar;
        defpackage.rdn rdnVar = new defpackage.rdn(this);
        this.c = rdnVar;
        amcn amcnVar = new amcn();
        amcnVar.o(rdnVar);
        ahxr rdoVar = new defpackage.rdo();
        amcnVar.b = rdoVar;
        ahvr.bZ(rdoVar != ahxr.a, "Equivalence.equals() should not be used with setEquivalence. See go/tiktok/dataservice/recyclerview.md for proper usage.");
        defpackage.ahak ahakVarM = amcnVar.m();
        this.d = ahakVarM;
        voiceScreenChipView.getContext();
        android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(1, false);
        linearLayoutManager.af(0);
        voiceScreenChipView.aa(linearLayoutManager);
        voiceScreenChipView.setOverScrollMode(2);
        voiceScreenChipView.Y(ahakVarM);
        voiceScreenChipView.Z(null);
    }

    private final ajcq f(java.lang.String str, java.lang.String str2) {
        for (defpackage.acuh acuhVar : ((defpackage.acui) this.a).h) {
            if (acuhVar.c.equals(str)) {
                return ahvr.H(((zdl) this.c).a(android.net.Uri.parse(acuhVar.d)), new defpackage.soi(str2, 20), ajbm.a);
            }
        }
        throw new java.lang.IllegalStateException("no ClientFile for ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final java.lang.Long a(java.lang.String str) {
        return (java.lang.Long) j$.util.concurrent.ConcurrentMap.-EL.getOrDefault((java.util.concurrent.ConcurrentMap) this.b, str, -1L);
    }

    public final ajcq b(int i) {
        java.lang.String str = java.lang.String.format("%s-%s", this.d, defpackage.sns.p(i));
        switch (i - 1) {
            case 0:
                return f(str, ((android.content.Context) this.b).getString(2132019927));
            case 1:
                return f(str, ((android.content.Context) this.b).getString(2132019928));
            case 2:
                return f(str, ((android.content.Context) this.b).getString(2132019940));
            case 3:
                return f(str, ((android.content.Context) this.b).getString(2132019939));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return f(str, ((android.content.Context) this.b).getString(2132019922));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return f(str, ((android.content.Context) this.b).getString(2132019929));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return f(str, ((android.content.Context) this.b).getString(2132019934));
            default:
                return f(str, ((android.content.Context) this.b).getString(2132019933));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean c() {
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) this.b, defpackage.plr.CALL_INFO_SHOULD_SHOW_VALIDATION_FOR_CARRIER, new defpackage.pei(new opy(this, 13), 4));
        if (objComputeIfAbsent == null) {
            throw new java.lang.NullPointerException("Future was cancelled.");
        }
        ajcq ajcqVar = (ajcq) objComputeIfAbsent;
        if (!ajcqVar.isDone()) {
            return false;
        }
        java.lang.Object objH = aiql.H(ajcqVar);
        aooh.c(objH);
        return ((java.lang.Boolean) objH).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object d(aoln aolnVar) {
        ocd ocdVar;
        defpackage.occ occVar;
        boolean zBooleanValue;
        java.lang.Object objD;
        boolean z;
        if (aolnVar instanceof ocd) {
            ocdVar = (ocd) aolnVar;
            int i = ocdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocdVar.d = i - Integer.MIN_VALUE;
            } else {
                ocdVar = new ocd(this, aolnVar);
            }
        } else {
            ocdVar = new ocd(this, aolnVar);
        }
        java.lang.Object objD2 = ocdVar.c;
        aolu aoluVar = aolu.a;
        int i2 = ocdVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD2);
            } else if (i2 == 2) {
                java.lang.Object obj = ocdVar.a;
                aooc.af(objD2);
                occVar = obj;
                zBooleanValue = ((java.lang.Boolean) objD2).booleanValue();
                ajcq ajcqVarAH = occVar.aH();
                ocdVar.a = null;
                ocdVar.b = zBooleanValue;
                ocdVar.d = 3;
                objD = aosv.D(ajcqVarAH, ocdVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                objD2 = objD;
                z = zBooleanValue;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = ocdVar.b;
                aooc.af(objD2);
            }
            return new ocb(z, ((java.lang.Boolean) objD2).booleanValue());
        }
        aooc.af(objD2);
        ajcq ajcqVarX = ((defpackage.afpl) this.c).X();
        ocdVar.d = 1;
        objD2 = aosv.D(ajcqVarX, ocdVar);
        if (objD2 == aoluVar) {
            return aoluVar;
        }
        defpackage.occ occVar2 = (defpackage.occ) aooc.ar(objD2, defpackage.occ.class);
        ajcq ajcqVarAG = occVar2.aG();
        ocdVar.a = occVar2;
        ocdVar.d = 2;
        objD2 = aosv.D(ajcqVarAG, ocdVar);
        occVar = occVar2;
        if (objD2 == aoluVar) {
            return aoluVar;
        }
        zBooleanValue = ((java.lang.Boolean) objD2).booleanValue();
        ajcq ajcqVarAH2 = occVar.aH();
        ocdVar.a = null;
        ocdVar.b = zBooleanValue;
        ocdVar.d = 3;
        objD = aosv.D(ajcqVarAH2, ocdVar);
        if (objD != aoluVar) {
            return aoluVar;
        }
        objD2 = objD;
        z = zBooleanValue;
        return new ocb(z, ((java.lang.Boolean) objD2).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [uip] */
    public final java.lang.Object e(android.telecom.Call.Details details, java.lang.String str, aoln aolnVar) {
        msf msfVar;
        java.lang.Object obj;
        java.lang.String str2;
        nok nokVar;
        java.lang.Object obj2;
        uip uipVar;
        java.lang.Object objC;
        java.lang.Object obj3;
        ?? r11;
        udm udmVar;
        defpackage.udl udlVar;
        noi noiVarB;
        noh nohVarB;
        aiye aiyeVarV;
        java.lang.Object obj4;
        defpackage.ufz ufzVar;
        int iAQ;
        if (aolnVar instanceof msf) {
            msfVar = (msf) aolnVar;
            int i = msfVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                msfVar.d = i - Integer.MIN_VALUE;
            } else {
                msfVar = new msf(this, aolnVar);
            }
        } else {
            msfVar = new msf(this, aolnVar);
        }
        java.lang.Object objB = msfVar.c;
        aolu aoluVar = aolu.a;
        int i2 = msfVar.d;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                str = msfVar.e;
                java.lang.Object obj5 = msfVar.a;
                aooc.af(objB);
                obj = obj5;
            } else if (i2 == 2) {
                nok nokVar2 = msfVar.f;
                java.lang.String str3 = msfVar.e;
                java.lang.Object obj6 = msfVar.a;
                aooc.af(objB);
                nokVar = nokVar2;
                obj2 = obj6;
                str2 = str3;
                java.lang.Object obj7 = this.b;
                uipVar = (uip) objB;
                msfVar.a = obj2;
                msfVar.e = str2;
                msfVar.f = nokVar;
                msfVar.b = uipVar;
                msfVar.d = 3;
                objC = ((noe) obj7).c(msfVar);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                obj3 = obj2;
                r11 = uipVar;
                objB = objC;
                boolean zBooleanValue = ((java.lang.Boolean) objB).booleanValue();
                ajyi ajyiVarV = ajee.v(aiye.b.m());
                ajyi ajyiVarU = ajee.u(aiyd.a.m());
                ajyiVarU.s(mni.y(r11.j()));
                udmVar = r11.k().e;
                if (udmVar != null) {
                    i3 = iAQ;
                }
                ajyiVarU.t(mni.z(i3));
                udlVar = r11.k().h;
                if (udlVar == null) {
                    udlVar = defpackage.udl.UNKNOWN_VERDICT_SOURCE;
                }
                ajyiVarU.u(mni.A(udlVar));
                ajyiVarV.y(ajyiVarU.r());
                noiVarB = noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = noi.e;
                }
                ajyiVarV.w(mni.p(noiVarB));
                nohVarB = noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = noh.k;
                }
                ajyiVarV.z(mni.u(nohVarB));
                ajyiVarV.x(zBooleanValue);
                aiyeVarV = ajyiVarV.v();
                if (str2 != null) {
                    obj4 = this.d;
                    ufzVar = new defpackage.ufz(str2, aiyeVarV, null, new java.lang.Long(((android.telecom.Call.Details) obj3).getCreationTimeMillis()));
                    msfVar.a = null;
                    msfVar.e = null;
                    msfVar.f = null;
                    msfVar.b = null;
                    msfVar.d = 4;
                    if (((defpackage.ahiy) obj4).g(ufzVar, msfVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i2 == 3) {
                java.lang.Object obj8 = msfVar.b;
                nokVar = msfVar.f;
                str2 = msfVar.e;
                java.lang.Object obj9 = msfVar.a;
                aooc.af(objB);
                obj3 = obj9;
                r11 = obj8;
                boolean zBooleanValue2 = ((java.lang.Boolean) objB).booleanValue();
                ajyi ajyiVarV2 = ajee.v(aiye.b.m());
                ajyi ajyiVarU2 = ajee.u(aiyd.a.m());
                ajyiVarU2.s(mni.y(r11.j()));
                udmVar = r11.k().e;
                if (udmVar != null && (iAQ = a.aQ(udmVar.h)) != 0) {
                    i3 = iAQ;
                }
                ajyiVarU2.t(mni.z(i3));
                udlVar = r11.k().h;
                if (udlVar == null) {
                    udlVar = defpackage.udl.UNKNOWN_VERDICT_SOURCE;
                }
                ajyiVarU2.u(mni.A(udlVar));
                ajyiVarV2.y(ajyiVarU2.r());
                noiVarB = noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = noi.e;
                }
                ajyiVarV2.w(mni.p(noiVarB));
                nohVarB = noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = noh.k;
                }
                ajyiVarV2.z(mni.u(nohVarB));
                ajyiVarV2.x(zBooleanValue2);
                aiyeVarV = ajyiVarV2.v();
                if (str2 != null && str2.length() != 0) {
                    obj4 = this.d;
                    ufzVar = new defpackage.ufz(str2, aiyeVarV, null, new java.lang.Long(((android.telecom.Call.Details) obj3).getCreationTimeMillis()));
                    msfVar.a = null;
                    msfVar.e = null;
                    msfVar.f = null;
                    msfVar.b = null;
                    msfVar.d = 4;
                    if (((defpackage.ahiy) obj4).g(ufzVar, msfVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aojh.a;
        }
        aooc.af(objB);
        java.lang.Object obj10 = this.a;
        msfVar.a = details;
        msfVar.e = str;
        msfVar.d = 1;
        objB = ((nnx) obj10).b(msfVar);
        if (objB == aoluVar) {
            obj = details;
            return aoluVar;
        }
        obj = details;
        java.lang.Object obj11 = this.c;
        nok nokVar3 = (nok) objB;
        msfVar.a = obj;
        msfVar.e = str;
        msfVar.f = nokVar3;
        msfVar.d = 2;
        java.lang.Object objG = ((tvn) obj11).g((android.telecom.Call.Details) obj, msfVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        nokVar = nokVar3;
        objB = objG;
        obj2 = obj;
        java.lang.Object obj12 = this.b;
        uipVar = (uip) objB;
        msfVar.a = obj2;
        msfVar.e = str2;
        msfVar.f = nokVar;
        msfVar.b = uipVar;
        msfVar.d = 3;
        objC = ((noe) obj12).c(msfVar);
        if (objC != aoluVar) {
            return aoluVar;
        }
        obj3 = obj2;
        r11 = uipVar;
        objB = objC;
        boolean zBooleanValue3 = ((java.lang.Boolean) objB).booleanValue();
        ajyi ajyiVarV3 = ajee.v(aiye.b.m());
        ajyi ajyiVarU3 = ajee.u(aiyd.a.m());
        ajyiVarU3.s(mni.y(r11.j()));
        udmVar = r11.k().e;
        if (udmVar != null) {
            i3 = iAQ;
        }
        ajyiVarU3.t(mni.z(i3));
        udlVar = r11.k().h;
        if (udlVar == null) {
            udlVar = defpackage.udl.UNKNOWN_VERDICT_SOURCE;
        }
        ajyiVarU3.u(mni.A(udlVar));
        ajyiVarV3.y(ajyiVarU3.r());
        noiVarB = noi.b(nokVar.d);
        if (noiVarB == null) {
            noiVarB = noi.e;
        }
        ajyiVarV3.w(mni.p(noiVarB));
        nohVarB = noh.b(nokVar.c);
        if (nohVarB == null) {
            nohVarB = noh.k;
        }
        ajyiVarV3.z(mni.u(nohVarB));
        ajyiVarV3.x(zBooleanValue3);
        aiyeVarV = ajyiVarV3.v();
        if (str2 != null) {
            obj4 = this.d;
            ufzVar = new defpackage.ufz(str2, aiyeVarV, null, new java.lang.Long(((android.telecom.Call.Details) obj3).getCreationTimeMillis()));
            msfVar.a = null;
            msfVar.e = null;
            msfVar.f = null;
            msfVar.b = null;
            msfVar.d = 4;
            if (((defpackage.ahiy) obj4).g(ufzVar, msfVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public rdp(android.content.Context context, aolr aolrVar, rwi rwiVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(rwiVar, "dialerNotificationManager");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.d = aolrVar;
        this.b = rwiVar;
        this.c = rlvVar;
    }

    public rdp(android.content.Context context, zdl zdlVar, java.lang.String str, defpackage.acui acuiVar) {
        this.b = context;
        this.c = zdlVar;
        this.d = str;
        this.a = acuiVar;
    }

    public rdp(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(aoinVar, "enableDataPullingWhenCacheMissProvider");
        aooh.f(aoinVar2, "cacheMediatorRetentionInDayProvider");
        aooh.f(aoinVar3, "ackModeTimeoutInSecondsProvider");
        aooh.f(aoinVar4, "enableWakeUpMessagingAppProvider");
        this.c = aoinVar;
        this.b = aoinVar2;
        this.a = aoinVar3;
        this.d = aoinVar4;
    }

    public rdp(nnx nnxVar, tvn tvnVar, defpackage.ahiy ahiyVar, noe noeVar) {
        this.a = nnxVar;
        this.c = tvnVar;
        this.d = ahiyVar;
        this.b = noeVar;
    }

    public rdp(stm stmVar, defpackage.afpl afplVar, ajct ajctVar) {
        this.b = new ler(this, 11);
        this.a = stmVar;
        this.c = afplVar;
        this.d = ajctVar;
    }

    public rdp(zpm zpmVar, gpd gpdVar, aoss aossVar, aoin aoinVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.b = zpmVar;
        this.a = gpdVar;
        this.c = aossVar;
        this.d = aoinVar;
    }

    public rdp(oko okoVar, zpz zpzVar, aoss aossVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.a = okoVar;
        this.c = zpzVar;
        this.d = aossVar;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public rdp(defpackage.sya syaVar, ldq ldqVar, ajct ajctVar) {
        this.a = new ajwr();
        this.c = syaVar;
        this.b = ldqVar;
        this.d = ajctVar;
    }

    public rdp(zjm zjmVar, aazc aazcVar) {
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.a = zjmVar;
        this.c = aazcVar;
    }

    public rdp(defpackage.afpl afplVar, aoss aossVar, ruc rucVar) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rucVar, "metrics");
        this.c = afplVar;
        this.d = aossVar;
        this.b = rucVar;
        this.a = new les(this, 4);
    }
}
