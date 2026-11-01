package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tak implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ tak(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v129, types: [hxf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarO;
        ajcq ajcqVarH;
        int i = 18;
        int i2 = 11;
        int i3 = 16;
        int i4 = 20;
        int i5 = 10;
        int i6 = 12;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.tam) this.a).d.c((lhd) this.b);
            case 1:
                lgj lgjVar = (lgj) obj;
                if (lgjVar != lgj.c && lgjVar != lgj.d) {
                    defpackage.szt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener", "onConversationChanged", 85, "RevelioConversationListener.java").v("already requested to show revelio UI");
                    return ajcm.a;
                }
                lgp lgpVar = (lgp) this.b;
                int size = lgpVar.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return ajcm.a;
                    }
                    lgo lgoVar = (lgo) lgpVar.b.get(size);
                    int iAN = a.aN(lgoVar.g);
                    if (iAN != 0 && iAN == 2) {
                        java.lang.Object obj2 = this.a;
                        akzx akzxVarM = defpackage.tan.a.m();
                        int i9 = true != lgoVar.k ? 2 : 4;
                        akzxVarM.u();
                        defpackage.tan tanVar = (defpackage.tan) akzxVarM.b;
                        tanVar.c = i9 - 1;
                        tanVar.b |= 1;
                        java.lang.String str = lgoVar.e;
                        akzxVarM.u();
                        defpackage.tan tanVar2 = (defpackage.tan) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        tanVar2.b |= 2;
                        tanVar2.d = str;
                        int iAN2 = a.aN(lgoVar.f);
                        if (iAN2 == 0) {
                            iAN2 = 1;
                        }
                        defpackage.szt sztVar = (defpackage.szt) obj2;
                        defpackage.szs szsVar = sztVar.c;
                        boolean z = iAN2 == 3;
                        akzxVarM.u();
                        defpackage.tan tanVar3 = (defpackage.tan) akzxVarM.b;
                        tanVar3.b |= 4;
                        tanVar3.e = z;
                        ajcq ajcqVarI = szsVar.i((defpackage.tan) akzxVarM.p());
                        int iAN3 = a.aN(lgoVar.f);
                        if (iAN3 == 0 || iAN3 != 3) {
                            return ajcqVarI;
                        }
                        defpackage.szt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener", "onConversationChanged", 105, "RevelioConversationListener.java").v("incoming message is complete, attempting to send call to user");
                        sztVar.f = true;
                        return ahvr.I(ajcqVarI, new defpackage.tai(obj2, 1), sztVar.d);
                    }
                }
                break;
            case 2:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                gou gouVar = (gou) this.b;
                return ((kaw) gouVar.d).p(((aogc) gouVar.c).bl(new jsd(obj3, 20)));
            case 3:
                defpackage.tbe tbeVar = (defpackage.tbe) obj;
                java.lang.Object obj4 = this.a;
                akzx akzxVarP = ((alad) obj4).p();
                tbf tbfVar = (tbf) obj4;
                defpackage.tbe tbeVarB = defpackage.tbe.b(tbfVar.e);
                if (tbeVarB == null) {
                    tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
                }
                defpackage.tbe tbeVar2 = defpackage.tbe.NOT_SET_BY_USER;
                if (tbeVarB == tbeVar2) {
                    akzxVarP.u();
                    tbf tbfVar2 = akzxVarP.b;
                    tbfVar2.e = tbeVar.e;
                    tbfVar2.b |= 4;
                }
                defpackage.tbe tbeVarB2 = defpackage.tbe.b(tbfVar.f);
                if (tbeVarB2 == null) {
                    tbeVarB2 = tbeVar2;
                }
                if (tbeVarB2 == tbeVar2) {
                    int iAQ = a.aQ(tbfVar.c);
                    if (iAQ == 0) {
                        iAQ = 1;
                    }
                    defpackage.tbe tbeVar3 = iAQ + (-1) != 1 ? defpackage.tbe.RING_PHONE : defpackage.tbe.AUTOMATICALLY_SCREEN;
                    akzxVarP.u();
                    tbf tbfVar3 = akzxVarP.b;
                    tbfVar3.f = tbeVar3.e;
                    tbfVar3.b |= 8;
                }
                defpackage.tbe tbeVarB3 = defpackage.tbe.b(tbfVar.g);
                if (tbeVarB3 == null) {
                    tbeVarB3 = tbeVar2;
                }
                if (tbeVarB3 == tbeVar2) {
                    int iAQ2 = a.aQ(tbfVar.c);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    defpackage.tbe tbeVarK = gou.k(iAQ2);
                    akzxVarP.u();
                    tbf tbfVar4 = akzxVarP.b;
                    tbfVar4.g = tbeVarK.e;
                    tbfVar4.b |= 16;
                }
                defpackage.tbe tbeVarB4 = defpackage.tbe.b(tbfVar.h);
                if (tbeVarB4 == null) {
                    tbeVarB4 = tbeVar2;
                }
                if (tbeVarB4 == tbeVar2) {
                    int iAQ3 = a.aQ(tbfVar.c);
                    if (iAQ3 == 0) {
                        iAQ3 = 1;
                    }
                    defpackage.tbe tbeVarK2 = gou.k(iAQ3);
                    akzxVarP.u();
                    tbf tbfVar5 = akzxVarP.b;
                    tbfVar5.h = tbeVarK2.e;
                    tbfVar5.b |= 32;
                }
                defpackage.tbe tbeVarB5 = defpackage.tbe.b(akzxVarP.b.e);
                if (tbeVarB5 != null) {
                    tbeVar2 = tbeVarB5;
                }
                gou gouVar2 = (gou) this.b;
                if (((uhs) gouVar2.e).e()) {
                    ajcq ajcqVarJ = gouVar2.j();
                    ajcq ajcqVarI2 = gouVar2.i();
                    ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarJ, ajcqVarI2}).o(new defpackage.tbb(ajcqVarJ, ajcqVarI2, tbeVar2, i7), (java.util.concurrent.Executor) gouVar2.b);
                } else {
                    ajcqVarO = aiql.z(tbeVar2);
                }
                return ahvr.H(ajcqVarO, new defpackage.soi(akzxVarP, i3), (java.util.concurrent.Executor) gouVar2.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playVoicemailBeepSoundToCaller", 73, "RevelioInCallAudioPlayer.java").v("Avatar session stopped listening; no longer playing beep sound to caller");
                    return ajcm.a;
                }
                java.lang.Object obj5 = this.a;
                java.lang.Object obj6 = this.b;
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playVoicemailBeepSoundToCaller", 78, "RevelioInCallAudioPlayer.java").v("playing voicemail beep sound");
                return ((defpackage.tbj) obj6).b.d((java.io.File) ((j$.util.Optional) obj5).orElseThrow(), "VOICEMAIL_BEEP");
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimw aimwVarL = tcu.a.b().l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "getRttConfiguration", 89, "RttConfigurationDao.java");
                java.lang.Object obj7 = this.a;
                aimwVarL.y("rtt calling mode is enabled: %b", obj7);
                return aiql.z(((java.lang.Boolean) obj7).booleanValue() ? tcp.d : ((tcu) this.b).a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aigf aigfVar = (aigf) obj;
                aift aiftVar = new aift(4);
                for (defpackage.thz thzVar : this.a) {
                    long j = thzVar.a;
                    j$.util.Optional optional = thzVar.b;
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    if (aigfVar.containsKey(lValueOf)) {
                        aify aifyVar = (aify) aigfVar.get(lValueOf);
                        if (optional.isPresent()) {
                            int size2 = aifyVar.size();
                            int i10 = i7;
                            int i11 = i10;
                            while (i10 < size2) {
                                defpackage.tin tinVar = (defpackage.tin) aifyVar.get(i10);
                                int i12 = i7;
                                if (new ahxd(']').g(new ahxd('[').g((java.lang.String) optional.orElseThrow())).equals(tinVar.d)) {
                                    defpackage.til tilVar = new defpackage.til(tinVar);
                                    tilVar.i(optional);
                                    tilVar.j = 2;
                                    aiftVar.i(tilVar.a());
                                    i11 = 1;
                                }
                                i10++;
                                i7 = i12;
                            }
                            int i13 = i7;
                            if (i11 == 0) {
                                int size3 = aifyVar.size();
                                for (int i14 = i13; i14 < size3; i14++) {
                                    defpackage.til tilVar2 = new defpackage.til((defpackage.tin) aifyVar.get(i14));
                                    tilVar2.i(optional);
                                    tilVar2.j = 3;
                                    aiftVar.i(tilVar2.a());
                                }
                            }
                            i7 = i13;
                            i8 = 1;
                        } else {
                            int size4 = aifyVar.size();
                            for (int i15 = i7; i15 < size4; i15++) {
                                defpackage.til tilVar3 = new defpackage.til((defpackage.tin) aifyVar.get(i15));
                                tilVar3.i(optional);
                                tilVar3.j = i8;
                                aiftVar.i(tilVar3.a());
                            }
                        }
                    }
                }
                return ((defpackage.tia) this.b).d(aiftVar.h());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ahrv.g(((oqi) this.b).a(oqt.i)).h(new defpackage.tbp(12), ((defpackage.tzh) this.a).a);
                }
                return aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ahvr.bZ(((java.lang.Boolean) obj).booleanValue(), "failed to add file group");
                return ((tzq) this.b).d.F((defpackage.acvj) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                hxf hxfVar = (hxi) obj;
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.b;
                defpackage.tzv tzvVar = (defpackage.tzv) obj9;
                return ahvr.I(tzvVar.c(hxfVar, (j$.util.Optional) obj8), new defpackage.tak(obj9, hxfVar, i5), tzvVar.b);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                hxi hxiVar = (hxi) this.b;
                hxf hxfVar2 = hxiVar.a;
                java.lang.Object obj10 = this.a;
                defpackage.tzv tzvVar2 = (defpackage.tzv) obj10;
                ajcq ajcqVarA = tzvVar2.a(hxfVar2);
                hxf hxfVar3 = hxiVar.b;
                ahrv ahrvVarG = ahrv.g(hxfVar3.c());
                defpackage.tct tctVar = new defpackage.tct(obj10, i2);
                ajct ajctVar = tzvVar2.b;
                ajcq ajcqVarH2 = ahrv.g(ahrvVarG.f(java.lang.Exception.class, tctVar, ajctVar).h(new oqe(obj10, hxfVar3, 20, (byte[]) null), ajctVar)).i(new defpackage.qgk(6), ajctVar).f(java.lang.Exception.class, new defpackage.tct(obj10, i6), ajctVar).h(new defpackage.tcy(obj10, i5), ajctVar);
                return ahvr.ai(new ajcq[]{ajcqVarA, ajcqVarH2}).p(new jsr(obj10, ajcqVarA, ajcqVarH2, 18), ajctVar);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                hxf hxfVar4 = (hxf) obj;
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                defpackage.tzv tzvVar3 = (defpackage.tzv) obj12;
                return ahvr.I(tzvVar3.c(hxfVar4, (j$.util.Optional) obj11), new defpackage.tak(obj12, hxfVar4, i6), tzvVar3.b);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ?? r1 = this.b;
                java.lang.Object obj13 = this.a;
                defpackage.tzv tzvVar4 = (defpackage.tzv) obj13;
                ajcq ajcqVarA2 = tzvVar4.a(r1);
                return ahvr.ai(new ajcq[]{ajcqVarA2}).p(new qat(obj13, ajcqVarA2, 16, (byte[]) null), tzvVar4.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj14 = this.b;
                udy udyVar = (udy) obj14;
                ahrv ahrvVarG2 = ahrv.g(udyVar.n.a(defpackage.ugv.a));
                defpackage.udu uduVar = new defpackage.udu(obj14, i7);
                ajct ajctVar2 = udyVar.e;
                return ahrvVarG2.i(uduVar, ajctVar2).h(new defpackage.tcy(this.a, i), ajctVar2);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj15 = this.a;
                defpackage.ucq ucqVar = (defpackage.ucq) ((akzx) obj15).p();
                int i16 = ucqVar.b & 8;
                java.lang.Object obj16 = this.b;
                if (i16 != 0) {
                    udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "getLastSpamCallData", 770, "CompositeSpam.java").v("report input has call id");
                    ajcqVarH = ((udy) obj16).d.eU(ahqx.i(new defpackage.syg(obj16, ucqVar, i6, bArr)));
                } else {
                    udy udyVar2 = (udy) obj16;
                    zjm zjmVar = udyVar2.r;
                    aivu aivuVar = ucqVar.c;
                    if (aivuVar == null) {
                        aivuVar = aivu.a;
                    }
                    java.lang.String str2 = aivuVar.g;
                    rsr rsrVar = new rsr();
                    rsrVar.aC(new kaw("number").aI("=", str2));
                    rsr rsrVarAB = rsrVar.aB();
                    ajcqVarH = ahvr.H(((ojo) zjmVar.b).d(android.provider.CallLog.Calls.CONTENT_URI, new java.lang.String[]{"date"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, "date DESC").c(ahqx.e(new kwb(10)), (java.util.concurrent.Executor) zjmVar.a).h(), new defpackage.uev(obj16, i8), udyVar2.d);
                }
                return ahvr.H(ajcqVarH, new defpackage.tcy(obj15, i4), ((udy) obj16).e);
            case 15:
                java.lang.String str3 = (java.lang.String) obj;
                java.lang.Object obj17 = this.a;
                aooh.f(obj17, "number");
                aooh.f(str3, "countryIso");
                uhz uhzVar = ((udy) this.b).o;
                return aosv.C(aoov.am(uhzVar.a, 0, new defpackage.uhy(uhzVar, (java.lang.String) obj17, str3, null, 1), 3));
            case 16:
                defpackage.ucq ucqVar2 = (defpackage.ucq) ((akzx) this.a).p();
                java.lang.Object obj18 = this.b;
                return ((udy) obj18).d.eU(ahqx.i(new defpackage.syg(obj18, ucqVar2, i2, bArr)));
            case 17:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj19 = this.b;
                java.lang.Object obj20 = this.a;
                uek.a.b().l("com/android/dialer/spam/inapp/InAppSpam", "storeSharpieVerdict", 192, "InAppSpam.java").v("update InAppSpamStorage");
                java.lang.String str4 = ((hkd) obj19).c;
                aooh.f(str4, "phoneNumber");
                uft uftVar = ((uek) obj20).j;
                return aosv.F(uftVar.a, 0, new defpackage.ufr(uftVar, str4, (aoln) null, 2), 3);
            case 18:
                java.lang.Object obj21 = this.a;
                java.lang.Object obj22 = this.b;
                uex uexVar = (uex) obj22;
                return ahvr.H(uexVar.f((akzx) obj21), new defpackage.tzs(obj22, obj21, i6, bArr), uexVar.d);
            case 19:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z((java.lang.Object) null);
                }
                java.lang.Object obj23 = this.a;
                java.lang.Object obj24 = this.b;
                defpackage.ugv ugvVar = defpackage.ugv.a;
                defpackage.abba abbaVarB = defpackage.abba.a.b(ajsz.aY(aaoo.I((java.lang.String) obj23, (java.lang.String) null)));
                ugs ugsVar = ((uex) obj24).g;
                return aosv.F(ugsVar.b, 0, new defpackage.ugg(ugsVar, ugvVar, abbaVarB, (aoln) null, 3), 3);
            default:
                java.lang.Object obj25 = this.a;
                java.lang.Object obj26 = this.b;
                uex uexVar2 = (uex) obj26;
                return ahvr.H(uexVar2.f((akzx) obj25), new defpackage.tzs(obj26, obj25, 13, bArr), uexVar2.d);
        }
    }

    public /* synthetic */ tak(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
