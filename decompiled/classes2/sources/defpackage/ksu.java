package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ksu implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ksu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v21, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, com.android.dialer.calloptions.ui.CallOptionsActivity] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context, com.android.dialer.calloptions.ui.CallOptionsActivity] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.content.Context, com.android.dialer.calloptions.ui.CallOptionsActivity] */
    /* JADX WARN: Type inference failed for: r13v21, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v48, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v49, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v70, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v76, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v77, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() throws aois {
        int i = 6;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.ksv ksvVar = (defpackage.ksv) this.a;
                ksvVar.i = 4;
                ksvVar.e.o(rmx.AW);
                android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (java.lang.String) this.b);
                android.content.Intent intentCreateChooser = android.content.Intent.createChooser(intent, null);
                aooh.e(intentCreateChooser, "createChooser(...)");
                ?? r0 = ksvVar.b;
                ahqx.l((android.content.Context) r0, intentCreateChooser);
                r0.finish();
                return aojh.a;
            case 1:
                defpackage.ksv ksvVar2 = (defpackage.ksv) this.a;
                ksvVar2.i = 4;
                ksvVar2.e.o(rmx.AV);
                ?? r1 = ksvVar2.b;
                mni.cB((android.content.Context) r1, (java.lang.CharSequence) this.b);
                r1.finish();
                return aojh.a;
            case 2:
                defpackage.ksv ksvVar3 = (defpackage.ksv) this.a;
                ksvVar3.i = 4;
                ksvVar3.e.o(rmx.AT);
                ksvVar3.l.i((java.lang.String) null).b(mce.hX);
                java.lang.Object obj = this.b;
                aooh.f(obj, "number");
                android.content.Intent intent2 = new android.content.Intent("com.android.dialer.LAUNCH_PRE_CALL");
                intent2.setData(android.net.Uri.fromParts("tel", (java.lang.String) obj, null));
                intent2.setPackage(((android.content.Context) ksvVar3.m.a).getPackageName());
                ?? r13 = ksvVar3.b;
                ahqx.l((android.content.Context) r13, intent2);
                r13.finish();
                return aojh.a;
            case 3:
                java.lang.String str = ((defpackage.ksp) this.a).d;
                defpackage.ksv ksvVar4 = (defpackage.ksv) this.b;
                ksvVar4.c(str);
                ksvVar4.b.finish();
                return aojh.a;
            case 4:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.lxq lxqVar = (defpackage.lxq) this.a;
                java.util.List list = lxqVar.b;
                java.lang.Object obj2 = this.b;
                if (!list.isEmpty()) {
                    arrayList.add(new defpackage.lxp(2132018187));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
                    int i3 = 0;
                    for (java.lang.Object obj3 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            ajsz.bh();
                        }
                        defpackage.kip kipVar = (defpackage.kip) obj3;
                        defpackage.vk vkVarBR = mni.bR(defpackage.lxn.a.m());
                        vkVarBR.Q(i3 == 0);
                        vkVarBR.P(i3 == list.size() + (-1));
                        arrayList2.add(new defpackage.lxo(kipVar, vkVarBR.O(), ((defpackage.lxt) obj2).f));
                        i3 = i4;
                    }
                    arrayList.addAll(arrayList2);
                }
                java.util.List list2 = lxqVar.c;
                if (list2.isEmpty()) {
                    return arrayList;
                }
                arrayList.add(new defpackage.lxp(2132018186));
                java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(list2, 10));
                int i5 = 0;
                for (java.lang.Object obj4 : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        ajsz.bh();
                    }
                    defpackage.kip kipVar2 = (defpackage.kip) obj4;
                    defpackage.vk vkVarBR2 = mni.bR(defpackage.lxn.a.m());
                    vkVarBR2.Q(i5 == 0);
                    vkVarBR2.P(i5 == list2.size() + (-1));
                    arrayList3.add(new defpackage.lxo(kipVar2, vkVarBR2.O(), ((defpackage.lxt) obj2).f));
                    i5 = i6;
                }
                arrayList.addAll(arrayList3);
                return arrayList;
            case 5:
                ((defpackage.mki) this.b).c.unregisterReceiver((android.content.BroadcastReceiver) this.a);
                return aojh.a;
            case 6:
                ((defpackage.mki) this.b).c.unregisterReceiver((android.content.BroadcastReceiver) this.a);
                return aojh.a;
            case 7:
                ?? r2 = this.a;
                a.E((ccp) r2, !a.C((ccp) r2));
                if (a.C((ccp) r2)) {
                    this.b.a();
                }
                return aojh.a;
            case 8:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q((j$.util.Optional) this.b);
                if (disconnectCause == null || disconnectCause.getReason() == null) {
                    return null;
                }
                java.lang.String reason = disconnectCause.getReason();
                aooh.e(reason, "getReason(...)");
                if (!aoov.ad(reason, "REASON_WIFI_ON_BUT_WFC_OFF")) {
                    return null;
                }
                defpackage.mma.b.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "produceWifiCallingPrompt$<anonymous>", 127, "DisconnectPromptProducerModule.kt").y("produce prompt for disconnect cause: %s", disconnectCause.getReason());
                java.lang.CharSequence description = disconnectCause.getDescription();
                java.lang.String string = description != null ? description.toString() : "null";
                android.content.Context context = (android.content.Context) this.a;
                return new defpackage.mls(defpackage.mlt.PROMPT_TYPE_ENABLE_WIFI_CALLING, string, null, string, context.getString(2132019060), context.getString(android.R.string.cancel), new defpackage.mlz(context));
            case 9:
                java.lang.Object obj5 = this.b;
                defpackage.mzx mzxVar = (defpackage.mzx) this.a;
                aoov.an(mzxVar.d, (aolr) null, 0, new defpackage.msi(mzxVar, (alyi) obj5, (aoln) null, 15), 3);
                return aojh.a;
            case 10:
                defpackage.npj npjVar = (defpackage.npj) this.a;
                int iOrdinal = npjVar.b.ordinal();
                java.lang.Object obj6 = this.b;
                if (iOrdinal == 0) {
                    tyw tywVar = npjVar.a;
                    java.lang.String str2 = tywVar.c;
                    aooh.e(str2, "getLanguageCode(...)");
                    tyv tyvVarB = tyv.b(tywVar.d);
                    if (tyvVarB == null) {
                        tyvVarB = tyv.m;
                    }
                    int iOrdinal2 = tyvVarB.ordinal();
                    if (iOrdinal2 == 1) {
                        defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "onBannerButtonClicked", 542, "DobbySettingsMainFragmentPeer.kt").y("starting SODA download for language code %s", str2);
                        defpackage.npe npeVar = ((defpackage.npr) obj6).e;
                        npeVar.q.i(aoov.am(npeVar.b, 0, new defpackage.nea(npeVar, akff.a(str2), (aoln) null, 17), 3));
                    } else if (iOrdinal2 == 6) {
                        defpackage.npr nprVar = (defpackage.npr) obj6;
                        afsq.G(nprVar.b, nprVar.v.a());
                    }
                } else if (iOrdinal == 1) {
                    tyw tywVar2 = npjVar.a;
                    tyv tyvVarB2 = tyv.b(tywVar2.d);
                    if (tyvVarB2 == null) {
                        tyvVarB2 = tyv.m;
                    }
                    if (tyvVarB2 == tyv.b) {
                        defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "onBannerButtonClicked", 556, "DobbySettingsMainFragmentPeer.kt").y("starting VoiceLM download for model %s", tywVar2.g);
                        defpackage.npe npeVar2 = ((defpackage.npr) obj6).e;
                        java.lang.String str3 = tywVar2.g;
                        aooh.e(str3, "getModelId(...)");
                        aooh.f(str3, "modelId");
                        if (npeVar2.k == null) {
                            defpackage.npe.a.d().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "downloadVoiceLmModel", 156, "DobbySettingsService.kt").v("ttsModelDownloader not initialized, unable to download VoiceLM model.");
                        } else {
                            npeVar2.q.i(aoov.am(npeVar2.b, 0, new defpackage.nea(npeVar2, str3, (aoln) null, 18), 3));
                        }
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    tyv tyvVarB3 = tyv.b(npjVar.a.d);
                    if (tyvVarB3 == null) {
                        tyvVarB3 = tyv.m;
                    }
                    if (tyvVarB3 == tyv.b) {
                        defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "onBannerButtonClicked", 562, "DobbySettingsMainFragmentPeer.kt").v("starting GACS download");
                        defpackage.npe npeVar3 = ((defpackage.npr) obj6).e;
                        npeVar3.q.i(aoov.an(npeVar3.b, (aolr) null, 0, new defpackage.mhq(npeVar3, (aoln) null, 12), 3));
                    }
                }
                return aojh.a;
            case 11:
                if (((defpackage.nou) this.a).l) {
                    java.lang.Object obj7 = this.b;
                    defpackage.npr nprVar2 = (defpackage.npr) obj7;
                    nprVar2.j.o(rmx.ym);
                    j$.util.Optional optionalG = nprVar2.w.g();
                    defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.npi(obj7, i2), i);
                    if (true == optionalG.isPresent()) {
                        lwxVar.a.a(optionalG.get());
                    }
                }
                return aojh.a;
            case 12:
                this.b.a(this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                qug qugVarB = qug.b(((qty) this.a).c);
                if (qugVarB == null) {
                    qugVarB = qug.a;
                }
                this.b.a(qugVarB);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.String str4 = ((pcq) this.a).b;
                aooh.e(str4, "callId(...)");
                java.lang.Object obj8 = this.b;
                ahok ahokVarF = ((quz) obj8).f.f(662, "AudioSelectorFragmentPeer_onCloseButtonClicked");
                try {
                    j$.util.Optional optionalE = ((quz) obj8).i.e(str4);
                    aooh.e(optionalE, "get(...)");
                    apqr apqrVar = (apqr) aooh.q(optionalE);
                    defpackage.quw quwVar = apqrVar != null ? (defpackage.quw) apqrVar.a(defpackage.quw.class) : null;
                    defpackage.hgw hgwVarLz = quwVar != null ? quwVar.lz() : null;
                    if (hgwVarLz != null) {
                        ((rap) hgwVarLz.a).d();
                        break;
                    }
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahokVarF, th);
                        throw th2;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj9 = this.b;
                aooh.c(obj9);
                java.lang.Object obj10 = this.a;
                ahok ahokVarF2 = ((quz) obj10).f.f(664, "AudioSelectorFragmentPeer_onListItemClicked");
                try {
                    ahvr.i(new defpackage.rdt((zmv) obj9), ((quz) obj10).e);
                    ajsz.ak(ahokVarF2, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahokVarF2, th3);
                        throw th4;
                    }
                }
            case 16:
                qxm qxmVar = (qxm) this.b;
                qxmVar.h.a();
                this.a.b(java.lang.Boolean.valueOf(!qxmVar.f));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.String str5 = ((qxo) this.a).e;
                aooh.e(str5, "getCallId(...)");
                qxz qxzVarB = ((qyb) this.b).b(str5);
                defpackage.her herVarLy = qxzVarB != null ? qxzVarB.ly() : null;
                if (herVarLy != null) {
                    ((rap) herVarLy.a).d();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.b.a(this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                qug qugVarB2 = qug.b(((quf) this.a).e);
                if (qugVarB2 == null) {
                    qugVarB2 = qug.a;
                }
                this.b.a(qugVarB2);
                return aojh.a;
            default:
                ((qyz) this.b).b.a(this.a);
                return aojh.a;
        }
    }

    public /* synthetic */ ksu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
