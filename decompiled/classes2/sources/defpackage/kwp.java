package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kwp implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kwp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ ahtm a(ahth ahthVar) {
        ahtm ahtmVar;
        java.lang.Long l;
        int i = 5;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                defpackage.kwo kwoVar = (defpackage.kwo) this.a;
                j$.util.Optional optionalB = defpackage.hgz.b((android.view.ViewGroup) kwoVar.d.N().findViewById(2131427499));
                if (true == optionalB.isPresent()) {
                    defpackage.hgz.e((android.view.View) optionalB.get(), false);
                }
                lbi lbiVar = (lbi) kwoVar.c.a();
                defpackage.kwk kwkVar = kwoVar.b;
                java.lang.Long lValueOf = java.lang.Long.valueOf(kwkVar.e);
                akzx akzxVarM = kui.a.m();
                java.lang.String str = kwkVar.d;
                akzxVarM.u();
                kui kuiVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                kuiVar.b |= 1;
                kuiVar.c = str;
                kwoVar.f.i(zoe.N(lbiVar.d(aigf.k(lValueOf, akzxVarM.p()))), kwoVar.i);
                return ahtm.a;
            case 1:
                defpackage.kwo kwoVar2 = (defpackage.kwo) this.a;
                defpackage.kwk kwkVar2 = kwoVar2.b;
                defpackage.hhb.p(kwkVar2.d, kwkVar2.e).r(kwoVar2.d.I(), "DeleteCallRecordingDialogFragment");
                return ahtm.a;
            case 2:
                j$.util.Optional optionalB2 = ((defpackage.kyg) this.a).b();
                if (true == optionalB2.isPresent()) {
                    ((qbe) optionalB2.get()).a(qbc.da);
                }
                return ahtm.a;
            case 3:
                defpackage.kyg kygVar = (defpackage.kyg) this.a;
                j$.util.Optional optionalA = kygVar.a();
                if (!optionalA.isPresent()) {
                    a.bI(defpackage.kyg.a.d(), "cannot fetch controller", "com/android/dialer/callrecording/impl/service/CallRecordingDialogFragmentPeer", "onPositiveButtonClicked", 'f', "CallRecordingDialogFragmentPeer.java", zct.b);
                    return ahtm.a;
                }
                ((defpackage.kxx) optionalA.orElseThrow()).g();
                defpackage.lbo lboVar = kygVar.c;
                ahvr.J(lboVar.d.bl(new defpackage.lbn(0)), new defpackage.jya(lboVar, 4), lboVar.c);
                j$.util.Optional optionalB3 = kygVar.b();
                if (true == optionalB3.isPresent()) {
                    ((qbe) optionalB3.get()).a(qbc.cZ);
                }
                return ahtm.a;
            case 4:
                defpackage.kzf kzfVar = (defpackage.kzf) this.a;
                defpackage.kzd kzdVar = kzfVar.b;
                defpackage.kwx kwxVarB = defpackage.kwx.b(kzdVar.c);
                if (kwxVarB == null) {
                    kwxVarB = defpackage.kwx.UNSPECIFIED;
                }
                int iOrdinal = kwxVarB.ordinal();
                if (iOrdinal == 0) {
                    a.bI(defpackage.kzf.a.c().m(aioa.b), "unspecified selected.", "com/android/dialer/callrecording/impl/settings/AutoDeletionConfirmationDialogPeer", "onPositiveClick", 'W', "AutoDeletionConfirmationDialogPeer.java", zct.b);
                } else if (iOrdinal == 1) {
                    kzfVar.d.o(rmx.fF);
                } else if (iOrdinal == 2) {
                    kzfVar.d.o(rmx.fG);
                } else if (iOrdinal == 3) {
                    kzfVar.d.o(rmx.fH);
                } else if (iOrdinal == 4) {
                    kzfVar.d.o(rmx.fI);
                }
                defpackage.kzf.a.b().l("com/android/dialer/callrecording/impl/settings/AutoDeletionConfirmationDialogPeer", "onPositiveClick", 106, "AutoDeletionConfirmationDialogPeer.java").w("deleting %d messages", kzdVar.d);
                defpackage.kwx kwxVarB2 = defpackage.kwx.b(kzdVar.c);
                if (kwxVarB2 == null) {
                    kwxVarB2 = defpackage.kwx.UNSPECIFIED;
                }
                ahtmVar = new ahtm(new defpackage.kze(kwxVarB2));
                break;
            case 5:
                defpackage.kwx kwxVar = ((defpackage.kze) ahthVar).a;
                defpackage.kzs kzsVar = (defpackage.kzs) this.a;
                defpackage.kvb kvbVar = kzsVar.g;
                ahrv ahrvVarG = ahrv.g(kvbVar.b(kwxVar));
                int i3 = 20;
                defpackage.idd iddVar = new defpackage.idd(kvbVar, kwxVar, i3);
                ajct ajctVar = kvbVar.f;
                kzsVar.h.i(zoe.N(ahrvVarG.i(iddVar, ajctVar).i(new defpackage.hky(kvbVar, i3), ajctVar).h(new defpackage.jvq(12), ajctVar)), kzsVar.v);
                return ahtm.a;
            case 6:
                defpackage.kzs kzsVar2 = (defpackage.kzs) this.a;
                kzsVar2.l.I(false);
                kzsVar2.h.i(zoe.N(kzsVar2.d.e()), kzsVar2.t);
                kzsVar2.i.o(rmx.fE);
                return ahtm.a;
            case 7:
                ((defpackage.kzs) this.a).e(true);
                return ahtm.a;
            case 8:
                defpackage.kzs kzsVar3 = (defpackage.kzs) this.a;
                kzsVar3.h.i(zoe.N(kzsVar3.f.c(defpackage.kun.BEEP_SOUND)), kzsVar3.w);
                kzsVar3.i.o(rmx.nb);
                kzsVar3.C.bm(rmu.G);
                return ahtm.a;
            case 9:
                ((defpackage.lay) this.a).c(true);
                return ahtm.a;
            case 10:
                java.lang.String str2 = ((defpackage.lax) ahthVar).a;
                defpackage.lay layVar = (defpackage.lay) this.a;
                defpackage.kwc kwcVar = layVar.d;
                ajcq ajcqVarAV = kwcVar.m.aV(new aile(str2));
                kwcVar.k.s(ajcqVarAV, defpackage.kzj.a);
                layVar.g.i(zoe.N(ajcqVarAV), layVar.o);
                if (((java.lang.Boolean) layVar.h.a()).booleanValue()) {
                    agby agbyVarO = agby.o(layVar.c.N().findViewById(2131428969), 2132018143, 0);
                    agbyVarO.n(new ahsl(layVar.t, new defpackage.law(layVar, str2)));
                    agbyVarO.s(2132018144, new defpackage.hww(3));
                    layVar.j = agbyVarO;
                    layVar.j.h();
                }
                return ahtm.a;
            case 11:
                defpackage.lir lirVar = (defpackage.lir) ahthVar;
                int iAb = a.ab(lirVar.a().e);
                if (iAb == 0) {
                    iAb = 1;
                }
                java.lang.Object obj = this.a;
                int i4 = iAb - 2;
                if (i4 == 0) {
                    a.bI(defpackage.lhh.a.c().m(aioa.b), "click event for no button", "com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer", "onClickEvent", (char) 305, "CallScreenSettingsFragmentPeer.java", zct.b);
                    return ahtm.a;
                }
                if (i4 == 1) {
                    ((defpackage.lhh) obj).b(lirVar.a().b);
                    return ahtm.a;
                }
                if (i4 == 2) {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setData(android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.googlequicksearchbox"));
                    ((android.content.Context) j$.util.Objects.requireNonNull(((defpackage.lhh) obj).c.z())).startActivity(intent);
                    return ahtm.a;
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        int iAb2 = a.ab(lirVar.a().e);
                        throw new java.lang.IllegalStateException("Unexpected button: ".concat(defpackage.hhe.D(iAb2 != 0 ? iAb2 : 1)));
                    }
                    ((defpackage.lhh) obj).d.b();
                    return ahtm.a;
                }
                defpackage.lhe lheVar = ((defpackage.lhh) obj).d;
                defpackage.lij.a.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataService", "onVoicePackDownloadStarted", 112, "CallScreenSettingsDataService.java").v("voice pack download started");
                defpackage.lij lijVar = lheVar.b;
                ajcq ajcqVarBl = lijVar.e.bl(new jsd(lijVar, 10));
                agxj agxjVar = defpackage.lil.b;
                lijVar.d.s(ajcqVarBl, agxjVar);
                ahrv ahrvVarG2 = ahrv.g(lheVar.c.a(j$.util.Optional.empty()));
                long j = lheVar.e;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                ajcu ajcuVar = lheVar.d;
                lheVar.f.t(ahrvVarG2.j(j, timeUnit, ajcuVar).e(java.lang.Exception.class, new defpackage.lgd(lheVar, i), ajcuVar), agxjVar);
                return ahtm.a;
            case 12:
                defpackage.lhw.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceModelNotReadyDialogFragmentPeer", "onNegativeButtonClicked", 74, "VoiceModelNotReadyDialogFragmentPeer.java").v("dismiss dialog");
                ((defpackage.lhw) this.a).b.f();
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.lhw.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceModelNotReadyDialogFragmentPeer", "onPositiveButtonClicked", 66, "VoiceModelNotReadyDialogFragmentPeer.java").v("request voice model");
                defpackage.lhw lhwVar = (defpackage.lhw) this.a;
                lhwVar.c.b();
                lhwVar.b.f();
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.lif lifVar = (defpackage.lif) this.a;
                defpackage.lia liaVar = lifVar.d;
                defpackage.lie lieVar = (defpackage.lie) ahthVar;
                if (liaVar.aJ()) {
                    defpackage.lif.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer", "onVoiceClickEvent", 212, "VoiceSettingsFragmentPeer.java").v("Ignore voice click event due to stopped fragment");
                    return ahtm.a;
                }
                aimw aimwVarL = defpackage.lif.a.b().l("com/android/dialer/callscreen/impl/settings/VoiceSettingsFragmentPeer", "onVoiceClickEvent", 215, "VoiceSettingsFragmentPeer.java");
                defpackage.lhu lhuVar = lieVar.a;
                aimwVarL.y("voice: %s", lhuVar);
                defpackage.lif.b(defpackage.lif.a(liaVar), false);
                defpackage.lhz lhzVar = lifVar.e;
                java.lang.String str3 = lhuVar.c;
                lht lhtVar = lhzVar.c;
                ajcq ajcqVarI = ahvr.I(lhtVar.a(), new defpackage.kwa(lhtVar, str3, 18), ajbm.a);
                lhzVar.e.s(ajcqVarI, defpackage.lhz.a);
                agtj agtjVar = lifVar.f;
                agtjVar.i(zoe.N(ajcqVarI), lifVar.b);
                agtjVar.i(zoe.N(lifVar.g.a(android.net.Uri.parse(lhuVar.e))), lifVar.c);
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooh.f((defpackage.ltm) ahthVar, "event");
                j$.util.Optional optionalH = ((defpackage.ltp) this.a).e.h();
                aooh.e(optionalH, "getPrimaryCallScope(...)");
                apqr apqrVar = (apqr) aooh.q(optionalH);
                defpackage.ltl ltlVar = apqrVar != null ? (defpackage.ltl) apqrVar.a(defpackage.ltl.class) : null;
                pqm pqmVarCq = ltlVar != null ? ltlVar.cq() : null;
                if (pqmVarCq != null) {
                    pqmVarCq.f();
                }
                return ahtm.a;
            case 16:
                aooh.f((ahtf) ahthVar, "event");
                defpackage.lxu lxuVar = (defpackage.lxu) ((pgi) this.a).b;
                long j2 = lxuVar.c;
                alat alatVar = lxuVar.d;
                aooh.e(alatVar, "getCallScreenTranscriptIdsList(...)");
                alat alatVar2 = lxuVar.e;
                aooh.e(alatVar2, "getRttTranscriptIdsList(...)");
                return new ahtm(new defpackage.lyw(j2, alatVar, alatVar2));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.lys lysVar = (defpackage.lys) ahthVar;
                defpackage.lyi lyiVar = (defpackage.lyi) this.a;
                if (((java.lang.Boolean) lyiVar.A.a()).booleanValue() && (l = lysVar.a) != null) {
                    long jLongValue = l.longValue();
                    j$.util.Optional optionalOfNullable = lyiVar.v;
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.kiq) optionalOfNullable.get()).b);
                    }
                    if (j$.util.Collection.-EL.stream((java.util.List) optionalOfNullable.orElse(aike.a)).anyMatch(new defpackage.lyd(jLongValue, i2))) {
                        lyiVar.d(l.longValue());
                        return ahtm.a;
                    }
                }
                j$.util.Optional optionalOfNullable2 = lyiVar.v;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.kiq) optionalOfNullable2.get()).b);
                }
                java.util.List<defpackage.kip> list = (java.util.List) optionalOfNullable2.orElse(aike.a);
                akzx akzxVarM2 = defpackage.kis.a.m();
                boolean zBooleanValue = ((java.lang.Boolean) lyiVar.z.a()).booleanValue();
                for (defpackage.kip kipVar : list) {
                    akzxVarM2.F(kipVar.c);
                    akzxVarM2.G(kipVar.d);
                    if (!zBooleanValue) {
                        akzxVarM2.E(kipVar.l);
                    }
                }
                akzx akzxVarP = lyiVar.g.p();
                defpackage.kis kisVar = (defpackage.kis) akzxVarM2.p();
                akzxVarP.u();
                kiu kiuVar = akzxVarP.b;
                j$.util.Objects.requireNonNull(kisVar);
                kiuVar.u = kisVar;
                kiuVar.b |= 131072;
                kiu kiuVarP = akzxVarP.p();
                akzx akzxVarM3 = defpackage.kmc.a.m();
                akzxVarM3.u();
                defpackage.kmc kmcVar = (defpackage.kmc) akzxVarM3.b;
                kmcVar.e = 5;
                kmcVar.b |= 1;
                akzxVarM3.u();
                defpackage.kmc kmcVar2 = (defpackage.kmc) akzxVarM3.b;
                j$.util.Objects.requireNonNull(kiuVarP);
                kmcVar2.d = kiuVarP;
                kmcVar2.c = 3;
                defpackage.kmc kmcVar3 = (defpackage.kmc) akzxVarM3.p();
                if (((java.lang.Boolean) lyiVar.x.a()).booleanValue()) {
                    lyiVar.w.a(kmcVar3);
                } else {
                    android.content.Intent intent2 = new android.content.Intent("action_delete_call_log_item_requested");
                    akmr.t(intent2, "delete_calls_context", kmcVar3);
                    epq.a(lyiVar.m).d(intent2);
                }
                ahtmVar = new ahtm(defpackage.lzf.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.lyi) this.a).d(((defpackage.lyw) ahthVar).a);
                return ahtm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f((defpackage.lyj) ahthVar, "event");
                ((com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity) ((defpackage.lyo) this.a).a).finish();
                return ahtm.a;
            default:
                aooh.f((defpackage.lzf) ahthVar, "event");
                ((com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity) ((defpackage.lyo) this.a).a).finish();
                return ahtm.a;
        }
        return ahtmVar;
    }
}
