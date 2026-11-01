package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ish {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider");
    public final android.content.Context b;
    public long c;
    private final defpackage.iql d;
    private final defpackage.aoin e;
    private final defpackage.ixt f;
    private final defpackage.iwc g;
    private final defpackage.vpq h;
    private final defpackage.aolr i;
    private final defpackage.zpm j;
    private final defpackage.zjm k;

    public ish(defpackage.iql iqlVar, defpackage.aoin aoinVar, defpackage.ixt ixtVar, defpackage.iwc iwcVar, defpackage.vpq vpqVar, defpackage.zjm zjmVar, defpackage.zpm zpmVar, android.content.Context context, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aoinVar, "setCustomGreetingDuration");
        defpackage.aooh.f(iwcVar, "beeslySingletonLocaleProvider");
        defpackage.aooh.f(zpmVar, "callScopes");
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aolrVar, "blockingContext");
        this.d = iqlVar;
        this.e = aoinVar;
        this.f = ixtVar;
        this.g = iwcVar;
        this.h = vpqVar;
        this.k = zjmVar;
        this.j = zpmVar;
        this.b = context;
        this.i = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        isb isbVar;
        java.lang.String path;
        java.lang.String str;
        if (aolnVar instanceof isb) {
            isbVar = (isb) aolnVar;
            int i = isbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                isbVar.c = i - Integer.MIN_VALUE;
            } else {
                isbVar = new isb(this, aolnVar);
            }
        } else {
            isbVar = new isb(this, aolnVar);
        }
        java.lang.Object objH = isbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = isbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objH);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = isbVar.e;
                java.lang.String str2 = isbVar.d;
                defpackage.aooc.af(objH);
                str = str2;
            }
            this.c = (((java.lang.Number) objH).longValue() + 1) * 1000;
            return str;
        }
        defpackage.aooc.af(objH);
        defpackage.ixt ixtVar = this.f;
        isbVar.c = 1;
        objH = ixtVar.h(isbVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        java.lang.String str3 = (java.lang.String) objH;
        if (str3 != null) {
            android.net.Uri uri = android.net.Uri.parse(str3);
            defpackage.aooh.e(uri, "parse(...)");
            if (uri != null) {
                path = uri.getPath();
            } else {
                path = null;
            }
        } else {
            path = null;
        }
        if (path == null || path.length() == 0) {
            return null;
        }
        qbe qbeVarF = f();
        if (qbeVarF != null) {
            qbeVarF.c(defpackage.qbc.BEESLY_CUSTOM_GREETING_USED);
        }
        if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
            return path;
        }
        defpackage.ixt ixtVar2 = this.f;
        isbVar.d = path;
        isbVar.e = this;
        isbVar.c = 2;
        java.lang.Object objE = ixtVar2.e(isbVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        str = path;
        objH = objE;
        this.c = (((java.lang.Number) objH).longValue() + 1) * 1000;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r10 != r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoln r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof isc
            if (r0 == 0) goto L13
            r0 = r10
            isc r0 = (isc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            isc r0 = new isc
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            defpackage.aooc.af(r10)
            goto L7c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.aooc.af(r10)
            goto L71
        L3c:
            ish r2 = r0.d
            defpackage.aooc.af(r10)
            goto L64
        L42:
            defpackage.aooc.af(r10)
            goto L55
        L46:
            defpackage.aooc.af(r10)
            r7 = 0
            r9.c = r7
            r0.c = r6
            java.lang.Object r10 = r9.a(r0)
            if (r10 == r1) goto L7b
        L55:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L73
            r0.d = r9
            r0.c = r5
            java.lang.Object r10 = r9.e(r0)
            if (r10 == r1) goto L7b
            r2 = r9
        L64:
            android.telecom.PhoneAccountHandle r10 = (android.telecom.PhoneAccountHandle) r10
            r5 = 0
            r0.d = r5
            r0.c = r4
            java.lang.Object r10 = r2.d(r10, r0)
            if (r10 == r1) goto L7b
        L71:
            java.lang.String r10 = (java.lang.String) r10
        L73:
            r0.c = r3
            java.lang.Object r10 = r9.c(r10, r0)
            if (r10 != r1) goto L7c
        L7b:
            r10 = r1
        L7c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ish.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01df  */
    /* JADX WARN: Code duplicated, block: B:34:0x0214  */
    /* JADX WARN: Code duplicated, block: B:37:0x026c  */
    /* JADX WARN: Code duplicated, block: B:38:0x026e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0278  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object c(java.lang.String str, defpackage.aoln aolnVar) {
        isd isdVar;
        defpackage.ipc ipcVarF;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.ipc ipcVar;
        java.lang.String str4;
        defpackage.ipc ipcVar2;
        her herVarM;
        defpackage.alct alctVarW;
        her herVarN;
        hgw hgwVarN;
        defpackage.ipc ipcVar3;
        defpackage.ipc ipcVar4;
        int iAQ;
        java.lang.String str5;
        defpackage.akzx akzxVar;
        boolean z;
        defpackage.ipc ipcVar5;
        her herVar;
        her herVar2;
        hgw hgwVar;
        hgw hgwVar2;
        hgw hgwVar3;
        defpackage.ipc ipcVar6;
        defpackage.alct alctVar;
        her herVar3;
        her herVar4;
        if (aolnVar instanceof isd) {
            isdVar = (isd) aolnVar;
            int i = isdVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                isdVar.e = i - Integer.MIN_VALUE;
            } else {
                isdVar = new isd(this, aolnVar);
            }
        } else {
            isdVar = new isd(this, aolnVar);
        }
        java.lang.Object objAQ = isdVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = isdVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                str4 = (java.lang.String) isdVar.b;
                ipcVarF = (defpackage.ipc) isdVar.a;
                ipcVar2 = isdVar.g;
                defpackage.aooc.af(objAQ);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hgwVar = isdVar.j;
                herVar = isdVar.m;
                hgwVar2 = isdVar.i;
                hgwVar3 = isdVar.h;
                herVar2 = isdVar.l;
                alctVar = isdVar.f;
                herVar3 = isdVar.k;
                ipcVar5 = (defpackage.ipc) isdVar.b;
                herVar4 = (her) isdVar.a;
                ipcVar6 = isdVar.g;
                defpackage.aooc.af(objAQ);
            }
            hgwVar.l((alqk) objAQ);
            hgwVar2.p();
            hgwVar2.n(this.d.a());
            herVar.E(hgwVar3.k());
            herVar3.y(alctVar, herVar2.C());
            ipcVar5.e(herVar4.v());
            return ipcVar6.b();
        }
        defpackage.aooc.af(objAQ);
        ipcVarF = defpackage.kcq.F(defpackage.igf.a.m());
        ipcVarF.g(defpackage.ifv.AUDIO_PRISM_FEATURE_KEY_DOBBY);
        defpackage.ipc ipcVarG = defpackage.kcq.G(defpackage.ige.a.m());
        ipcVarG.i(3);
        ipcVarF.d(ipcVarG.h());
        defpackage.ipc ipcVarL = defpackage.kcq.L(defpackage.ifz.a.m());
        defpackage.ipc ipcVarP = defpackage.kcq.P(defpackage.ify.a.m());
        ipcVarP.m(defpackage.ifx.DOWNLINK);
        ipcVarL.k(ipcVarP.l());
        ipcVarF.c(ipcVarL.j());
        str2 = (java.lang.String) this.g.i.a();
        str3 = null;
        if (str != null) {
            defpackage.aolr aolrVar = this.i;
            fyn fynVar = new fyn(this, str, (defpackage.aoln) null, 12);
            isdVar.g = ipcVarF;
            isdVar.a = ipcVarF;
            isdVar.b = str2;
            isdVar.e = 1;
            java.lang.Object objAj = defpackage.aoov.aj(aolrVar, fynVar, isdVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            objAQ = objAj;
            str4 = str2;
            ipcVar2 = ipcVarF;
        } else {
            ipcVar = ipcVarF;
        }
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "getConfigImpl$<anonymous>", 123, "BeeslySingletonAudioPrismConfigProvider.kt")).y("Setting custom Greeting file: %s", str3);
        herVarM = hhk.m(defpackage.igs.a.m());
        herVarM.z(str2);
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "getConfigImpl$<anonymous>$<anonymous>", 126, "BeeslySingletonAudioPrismConfigProvider.kt")).y("Beesly AudioPrism CompositeModel Locale: %s", herVarM.x());
        defpackage.alct alctVarW2 = herVarM.w();
        igr igrVar = igr.a;
        her herVarN2 = hhk.n(igrVar.m());
        herVarN2.F(hhv.e(ihm.a.m()).j());
        herVarM.y(alctVarW2, herVarN2.C());
        alctVarW = herVarM.w();
        herVarN = hhk.n(igrVar.m());
        hgwVarN = hhv.n(ihf.b.m());
        hgwVarN.m(amba.d);
        isdVar.g = ipcVarF;
        isdVar.a = herVarM;
        isdVar.b = ipcVar;
        isdVar.k = herVarM;
        isdVar.f = alctVarW;
        isdVar.l = herVarN;
        isdVar.h = hgwVarN;
        isdVar.i = hgwVarN;
        isdVar.m = herVarN;
        isdVar.j = hgwVarN;
        isdVar.e = 2;
        vqu vquVarH = ahus.H((defpackage.akzz) alqk.a.m());
        defpackage.apdi apdiVar = alwn.r;
        defpackage.aooh.e(apdiVar, "callAssistantConversationContext");
        ajyi ajyiVarI = airh.I(alwn.a.m());
        ajyiVarI.aX();
        defpackage.akzx akzxVarM = alyr.a.m();
        ipcVar3 = ipcVarF;
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        alyr alyrVar = akzxVarM.b;
        alyrVar.c = 1;
        alyrVar.b |= 1;
        ipcVar4 = ipcVar;
        defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "createCallAssistantConversationContext$<anonymous>$<anonymous>$<anonymous>", 155, "BeeslySingletonAudioPrismConfigProvider.kt");
        iAQ = defpackage.a.aQ(akzxVarM.b.c);
        if (iAQ != 0 || iAQ == 1) {
            str5 = "VOICEMAIL_MODE_DISABLED_DEFAULT";
        } else {
            str5 = iAQ != 2 ? "VOICEMAIL_MODE_FULL_BOT" : "VOICEMAIL_MODE_ONE_STATEMENT";
        }
        aimwVar.y("voicemail mode is %s", str5);
        alyr alyrVarR = akzxVarM.r();
        defpackage.aooh.e(alyrVarR, "build(...)");
        alyr alyrVar2 = alyrVarR;
        defpackage.aooh.f(alyrVar2, "value");
        akzxVar = (defpackage.akzx) ajyiVarI.a;
        akzxVar.u();
        alwn alwnVar = akzxVar.b;
        j$.util.Objects.requireNonNull(alyrVar2);
        alwnVar.g = alyrVar2;
        alwnVar.b |= 64;
        ajyiVarI.aU(str2);
        ajyiVarI.aW();
        if (str3 != null) {
            defpackage.akzx akzxVarM2 = alxa.a.m();
            defpackage.aooh.f(akzxVarM2, "builder");
            akzxVarM2.u();
            alxa alxaVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str3);
            alxaVar.b |= 1;
            alxaVar.c = str3;
            alxa alxaVarR = akzxVarM2.r();
            defpackage.aooh.e(alxaVarR, "build(...)");
            alxa alxaVar2 = alxaVarR;
            defpackage.aooh.f(alxaVar2, "value");
            akzxVar.u();
            alwn alwnVar2 = akzxVar.b;
            j$.util.Objects.requireNonNull(alxaVar2);
            alwnVar2.o = alxaVar2;
            alwnVar2.b |= 16384;
        }
        akzxVar.u();
        alwn alwnVar3 = akzxVar.b;
        alwnVar3.b |= 32768;
        alwnVar3.p = true;
        vquVarH.aY(apdiVar, ajyiVarI.aS());
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        vquVarH.aR(z);
        objAQ = vquVarH.aQ();
        if (objAQ != aoluVar) {
            return aoluVar;
        }
        ipcVar5 = ipcVar4;
        herVar = herVarN;
        herVar2 = herVar;
        hgwVar = hgwVarN;
        hgwVar2 = hgwVar;
        hgwVar3 = hgwVar2;
        ipcVar6 = ipcVar3;
        alctVar = alctVarW;
        herVar3 = herVarM;
        herVar4 = herVar3;
        hgwVar.l((alqk) objAQ);
        hgwVar2.p();
        hgwVar2.n(this.d.a());
        herVar.E(hgwVar3.k());
        herVar3.y(alctVar, herVar2.C());
        ipcVar5.e(herVar4.v());
        return ipcVar6.b();
        ipcVar = ipcVarF;
        ipcVarF = ipcVar2;
        str3 = (java.lang.String) objAQ;
        str2 = str4;
        defpackage.aimz aimzVar2 = a;
        ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "getConfigImpl$<anonymous>", 123, "BeeslySingletonAudioPrismConfigProvider.kt")).y("Setting custom Greeting file: %s", str3);
        herVarM = hhk.m(defpackage.igs.a.m());
        herVarM.z(str2);
        ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "getConfigImpl$<anonymous>$<anonymous>", 126, "BeeslySingletonAudioPrismConfigProvider.kt")).y("Beesly AudioPrism CompositeModel Locale: %s", herVarM.x());
        defpackage.alct alctVarW3 = herVarM.w();
        igr igrVar2 = igr.a;
        her herVarN3 = hhk.n(igrVar2.m());
        herVarN3.F(hhv.e(ihm.a.m()).j());
        herVarM.y(alctVarW3, herVarN3.C());
        alctVarW = herVarM.w();
        herVarN = hhk.n(igrVar2.m());
        hgwVarN = hhv.n(ihf.b.m());
        hgwVarN.m(amba.d);
        isdVar.g = ipcVarF;
        isdVar.a = herVarM;
        isdVar.b = ipcVar;
        isdVar.k = herVarM;
        isdVar.f = alctVarW;
        isdVar.l = herVarN;
        isdVar.h = hgwVarN;
        isdVar.i = hgwVarN;
        isdVar.m = herVarN;
        isdVar.j = hgwVarN;
        isdVar.e = 2;
        vqu vquVarH2 = ahus.H((defpackage.akzz) alqk.a.m());
        defpackage.apdi apdiVar2 = alwn.r;
        defpackage.aooh.e(apdiVar2, "callAssistantConversationContext");
        ajyi ajyiVarI2 = airh.I(alwn.a.m());
        ajyiVarI2.aX();
        defpackage.akzx akzxVarM3 = alyr.a.m();
        ipcVar3 = ipcVarF;
        defpackage.aooh.f(akzxVarM3, "builder");
        akzxVarM3.u();
        alyr alyrVar3 = akzxVarM3.b;
        alyrVar3.c = 1;
        alyrVar3.b |= 1;
        ipcVar4 = ipcVar;
        defpackage.aimw aimwVar2 = (defpackage.aimw) aimzVar2.b().l("com/android/dialer/beesly/impl/audioprism/BeeslySingletonAudioPrismConfigProvider", "createCallAssistantConversationContext$<anonymous>$<anonymous>$<anonymous>", 155, "BeeslySingletonAudioPrismConfigProvider.kt");
        iAQ = defpackage.a.aQ(akzxVarM3.b.c);
        if (iAQ != 0) {
            str5 = "VOICEMAIL_MODE_DISABLED_DEFAULT";
        } else {
            str5 = "VOICEMAIL_MODE_DISABLED_DEFAULT";
        }
        aimwVar2.y("voicemail mode is %s", str5);
        alyr alyrVarR2 = akzxVarM3.r();
        defpackage.aooh.e(alyrVarR2, "build(...)");
        alyr alyrVar4 = alyrVarR2;
        defpackage.aooh.f(alyrVar4, "value");
        akzxVar = (defpackage.akzx) ajyiVarI2.a;
        akzxVar.u();
        alwn alwnVar4 = akzxVar.b;
        j$.util.Objects.requireNonNull(alyrVar4);
        alwnVar4.g = alyrVar4;
        alwnVar4.b |= 64;
        ajyiVarI2.aU(str2);
        ajyiVarI2.aW();
        if (str3 != null) {
            defpackage.akzx akzxVarM4 = alxa.a.m();
            defpackage.aooh.f(akzxVarM4, "builder");
            akzxVarM4.u();
            alxa alxaVar3 = akzxVarM4.b;
            j$.util.Objects.requireNonNull(str3);
            alxaVar3.b |= 1;
            alxaVar3.c = str3;
            alxa alxaVarR2 = akzxVarM4.r();
            defpackage.aooh.e(alxaVarR2, "build(...)");
            alxa alxaVar4 = alxaVarR2;
            defpackage.aooh.f(alxaVar4, "value");
            akzxVar.u();
            alwn alwnVar5 = akzxVar.b;
            j$.util.Objects.requireNonNull(alxaVar4);
            alwnVar5.o = alxaVar4;
            alwnVar5.b |= 16384;
        }
        akzxVar.u();
        alwn alwnVar6 = akzxVar.b;
        alwnVar6.b |= 32768;
        alwnVar6.p = true;
        vquVarH2.aY(apdiVar2, ajyiVarI2.aS());
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            z = true;
        } else {
            z = false;
        }
        vquVarH2.aR(z);
        objAQ = vquVarH2.aQ();
        if (objAQ != aoluVar) {
            return aoluVar;
        }
        ipcVar5 = ipcVar4;
        herVar = herVarN;
        herVar2 = herVar;
        hgwVar = hgwVarN;
        hgwVar2 = hgwVar;
        hgwVar3 = hgwVar2;
        ipcVar6 = ipcVar3;
        alctVar = alctVarW;
        herVar3 = herVarM;
        herVar4 = herVar3;
        hgwVar.l((alqk) objAQ);
        hgwVar2.p();
        hgwVar2.n(this.d.a());
        herVar.E(hgwVar3.k());
        herVar3.y(alctVar, herVar2.C());
        ipcVar5.e(herVar4.v());
        return ipcVar6.b();
    }

    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ise iseVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        voy voyVar;
        java.lang.String str;
        android.net.Uri uri;
        if (aolnVar instanceof ise) {
            iseVar = (ise) aolnVar;
            int i = iseVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iseVar.c = i - Integer.MIN_VALUE;
            } else {
                iseVar = new ise(this, aolnVar);
            }
        } else {
            iseVar = new ise(this, aolnVar);
        }
        ise iseVar2 = iseVar;
        java.lang.Object objD = iseVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iseVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            if (phoneAccountHandle != null) {
                defpackage.ajcq ajcqVarC = this.h.c(phoneAccountHandle);
                iseVar2.d = phoneAccountHandle;
                iseVar2.c = 1;
                objD = defpackage.aosv.D(ajcqVarC, iseVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                phoneAccountHandle2 = phoneAccountHandle;
            }
            this.c = 0L;
            return null;
        }
        if (i2 == 1) {
            phoneAccountHandle2 = iseVar2.d;
            defpackage.aooc.af(objD);
        } else {
            if (i2 == 2) {
                phoneAccountHandle2 = iseVar2.d;
                defpackage.aooc.af(objD);
                java.lang.Object obj = objD;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = phoneAccountHandle2;
                voyVar = (voy) obj;
                if (voyVar != null || (uri = voyVar.d) == null) {
                    str = null;
                } else {
                    defpackage.aolr aolrVar = this.i;
                    isf isfVar = new isf(this, phoneAccountHandle3, uri, voyVar, (defpackage.aoln) null, 0);
                    iseVar2.d = null;
                    iseVar2.c = 3;
                    objD = defpackage.aoov.aj(aolrVar, isfVar, iseVar2);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                }
                if (str != null) {
                    return str;
                }
                this.c = 0L;
                return null;
            }
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        str = (java.lang.String) objD;
        if (str != null) {
            return str;
        }
        this.c = 0L;
        return null;
        vpj vpjVar = (vpj) objD;
        for (vph vphVar : vpjVar.g) {
            if (defpackage.aooh.n(vpjVar.e, vphVar.c) || vpjVar.g.size() == 1) {
                java.lang.String str2 = vphVar.d;
                defpackage.aooh.e(str2, "getLocalAudioUri(...)");
                if (str2.length() != 0) {
                    this.c = vphVar.f * 1000;
                    qbe qbeVarF = f();
                    if (qbeVarF != null) {
                        qbeVarF.c(defpackage.qbc.BEESLY_VVM_GREETING_USED);
                    }
                    return vphVar.d;
                }
            }
        }
        defpackage.ajcq ajcqVarN = this.k.n(phoneAccountHandle2);
        iseVar2.d = phoneAccountHandle2;
        iseVar2.c = 2;
        objD = defpackage.aosv.D(ajcqVarN, iseVar2);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj2 = objD;
        android.telecom.PhoneAccountHandle phoneAccountHandle4 = phoneAccountHandle2;
        voyVar = (voy) obj2;
        if (voyVar != null) {
        }
        str = null;
        if (str != null) {
            return str;
        }
        this.c = 0L;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        isg isgVar;
        if (aolnVar instanceof isg) {
            isgVar = (isg) aolnVar;
            int i = isgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                isgVar.c = i - Integer.MIN_VALUE;
            } else {
                isgVar = new isg(this, aolnVar);
            }
        } else {
            isgVar = new isg(this, aolnVar);
        }
        java.lang.Object objD = isgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = isgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.zpm zpmVar = this.j;
            j$.util.Optional optionalH = zpmVar.h();
            defpackage.aooh.e(optionalH, "getPrimaryCallScope(...)");
            apqr apqrVar = (apqr) defpackage.aooh.q(optionalH);
            if (apqrVar == null) {
                return null;
            }
            defpackage.ajcq ajcqVarK = zpmVar.k(apqrVar, isa.class, new iry(0));
            defpackage.aooh.e(ajcqVarK, "fromCallProductionComponent(...)");
            isgVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarK, isgVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return defpackage.aooh.q((j$.util.Optional) objD);
    }

    public final qbe f() {
        irz irzVar;
        j$.util.Optional optionalH = this.j.h();
        defpackage.aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) defpackage.aooh.q(optionalH);
        if (apqrVar == null || (irzVar = (irz) apqrVar.a(irz.class)) == null) {
            return null;
        }
        return irzVar.cp();
    }
}
