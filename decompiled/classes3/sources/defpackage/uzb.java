package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uzb implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public uzb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0163 A[Catch: all -> 0x0198, TryCatch #11 {all -> 0x0198, blocks: (B:38:0x013d, B:40:0x014a, B:42:0x0155, B:44:0x0160, B:45:0x0163, B:47:0x016e, B:49:0x0187, B:48:0x017f), top: B:271:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x016e A[Catch: all -> 0x0198, TryCatch #11 {all -> 0x0198, blocks: (B:38:0x013d, B:40:0x014a, B:42:0x0155, B:44:0x0160, B:45:0x0163, B:47:0x016e, B:49:0x0187, B:48:0x017f), top: B:271:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x017f A[Catch: all -> 0x0198, TryCatch #11 {all -> 0x0198, blocks: (B:38:0x013d, B:40:0x014a, B:42:0x0155, B:44:0x0160, B:45:0x0163, B:47:0x016e, B:49:0x0187, B:48:0x017f), top: B:271:0x013d }] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        ajcq ajcqVarP;
        defpackage.ahtm ahtmVar;
        int i = 3;
        int i2 = 6;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.uza uzaVar = (defpackage.uza) this.a;
                uzaVar.c.o(rmx.fy);
                j$.util.Optional optionalA = uzaVar.a();
                if (true == optionalA.isPresent()) {
                    defpackage.zlr zlrVar = (defpackage.zlr) optionalA.get();
                    ((java.util.concurrent.atomic.AtomicBoolean) zlrVar.b).set(true);
                    ((zpz) zlrVar.c).a(ajcm.a);
                    zlrVar.k();
                }
                return defpackage.ahtm.a;
            case 1:
                defpackage.uza uzaVar2 = (defpackage.uza) this.a;
                uzaVar2.c.o(rmx.fz);
                j$.util.Optional optionalA2 = uzaVar2.a();
                if (true == optionalA2.isPresent()) {
                    agsm.i(959, ((defpackage.pqm) ((defpackage.zlr) optionalA2.get()).d).f(), "Failed to disconnect.", new java.lang.Object[0]);
                }
                return defpackage.ahtm.a;
            case 2:
                defpackage.tyr tyrVar = (defpackage.tyr) ahthVar;
                defpackage.tyv tyvVarB = defpackage.tyv.b(tyrVar.a().d);
                if (tyvVarB == null) {
                    tyvVarB = defpackage.tyv.UNRECOGNIZED;
                }
                java.lang.Object obj = this.a;
                int iOrdinal = tyvVarB.ordinal();
                if (iOrdinal == 1) {
                    java.lang.String str = tyrVar.a().c;
                    defpackage.vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "onSodaStatusBannerClick", 375, "VoicemailSettingsFragmentPeer.java").y("Starting download for SODA %s model", str);
                    akff akffVarA = akff.a(str);
                    defpackage.vrp vrpVar = ((defpackage.vpc) obj).t;
                    vrpVar.e.g(ahvr.H(vrpVar.i, new defpackage.vmb(akffVarA, 15), vrpVar.c), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else if (iOrdinal != 6) {
                    defpackage.vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "onSodaStatusBannerClick", 382, "VoicemailSettingsFragmentPeer.java").v("Click on un-clickable Soda Status Banner");
                } else {
                    defpackage.vpc vpcVar = (defpackage.vpc) obj;
                    ahqx.l(vpcVar.r.G(), vpcVar.x.a());
                }
                return defpackage.ahtm.a;
            case 3:
                defpackage.vpc.a.b().l("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer", "onPositiveClickForConversationHistoryDeletion", 758, "VoicemailSettingsFragmentPeer.java").v("showDisableConfirmationDialog, confirmed");
                ((defpackage.vpc) this.a).b(false);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity) ((defpackage.vqu) this.a).a).finish();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.vrh) this.a).r == 1 ? new defpackage.ahtm(new defpackage.vrg()) : defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.vwh.a.b().l("com/android/dialer/voicemail/tab/impl/ui/DeleteSelectedItemsDialogFragmentPeer", "onNegativeButtonClicked", 100, "DeleteSelectedItemsDialogFragmentPeer.java").v("negative button clicked in delete selected items dialog");
                ((defpackage.vwh) this.a).c.n(rmw.eJ);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj2 = this.a;
                ahoq ahoqVarW = ahvr.W(1016, "DeleteSelectedItemsDialogFragmentPeer_onPositiveButtonClicked");
                try {
                    defpackage.vwh.a.b().l("com/android/dialer/voicemail/tab/impl/ui/DeleteSelectedItemsDialogFragmentPeer", "onPositiveButtonClicked", 90, "DeleteSelectedItemsDialogFragmentPeer.java").v("positive button clicked in delete selected items dialog");
                    ((defpackage.vwh) obj2).e.i((java.lang.String) null).b(mce.eh);
                    defpackage.ahtm ahtmVar2 = new defpackage.ahtm(new defpackage.vwd(((defpackage.vwh) obj2).d));
                    ahoqVarW.close();
                    return ahtmVar2;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj3 = this.a;
                j$.util.Optional optional = ((defpackage.vxq) obj3).F;
                defpackage.vxc vxcVar = new defpackage.vxc(obj3, 7);
                if (true == optional.isPresent()) {
                    java.lang.Object obj4 = optional.get();
                    java.lang.Object obj5 = vxcVar.a;
                    defpackage.vtx vtxVar = (defpackage.vtx) obj4;
                    if ((vtxVar.b & 8) != 0) {
                        defpackage.vxq vxqVar = (defpackage.vxq) obj5;
                        defpackage.vvb vvbVar = vxqVar.X;
                        defpackage.vwz vwzVar = vxqVar.d;
                        defpackage.vtw vtwVar = vtxVar.f;
                        if (vtwVar == null) {
                            vtwVar = defpackage.vtw.a;
                        }
                        int iAd = a.ad(vtwVar.c);
                        i3 = iAd != 0 ? iAd : 1;
                        vzi vziVar = vtxVar.c;
                        if (vziVar == null) {
                            vziVar = vzi.a;
                        }
                        vvbVar.d(vwzVar, i3, vziVar);
                    }
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj6 = this.a;
                j$.util.Optional optional2 = ((defpackage.vxq) obj6).F;
                defpackage.vxc vxcVar2 = new defpackage.vxc(obj6, i);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj7 = optional2.get();
                    java.lang.Object obj8 = vxcVar2.a;
                    defpackage.vtx vtxVar2 = (defpackage.vtx) obj7;
                    if ((vtxVar2.b & 16) != 0) {
                        defpackage.vxq vxqVar2 = (defpackage.vxq) obj8;
                        defpackage.vvb vvbVar2 = vxqVar2.X;
                        defpackage.vwz vwzVar2 = vxqVar2.d;
                        defpackage.vtw vtwVar2 = vtxVar2.g;
                        if (vtwVar2 == null) {
                            vtwVar2 = defpackage.vtw.a;
                        }
                        int iAd2 = a.ad(vtwVar2.c);
                        i3 = iAd2 != 0 ? iAd2 : 1;
                        vzi vziVar2 = vtxVar2.c;
                        if (vziVar2 == null) {
                            vziVar2 = vzi.a;
                        }
                        vvbVar2.d(vwzVar2, i3, vziVar2);
                    }
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj9 = this.a;
                ahoq ahoqVarW2 = ahvr.W(1023, "VisualVoicemailFragmentPeer_onDeleteButtonClickEvent");
                try {
                    ((defpackage.vxq) obj9).l(mce.dC);
                    j$.util.Optional optionalD = ((defpackage.vxq) obj9).d();
                    if (optionalD.isPresent()) {
                        ((defpackage.vxq) obj9).m.n(rmw.V);
                        kiu kiuVar = ((defpackage.uzo) optionalD.orElseThrow()).d;
                        if (kiuVar == null) {
                            kiuVar = kiu.a;
                        }
                        long j = kiuVar.d;
                        java.util.Set set = ((defpackage.vxq) obj9).K;
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                        set.add(lValueOf);
                        ((defpackage.vxq) obj9).w();
                        ((defpackage.vxq) obj9).v();
                        vva vvaVar = ((defpackage.vxq) obj9).f;
                        android.net.Uri uriA = defpackage.vxq.a((defpackage.uzo) optionalD.orElseThrow());
                        java.lang.Runnable runnableH = ahqx.h(new fvl(10));
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        ajcu ajcuVar = vvaVar.g;
                        ahrv ahrvVarH = ahrv.g(ajcuVar.b(runnableH, 3000L, timeUnit)).i(new vmv(vvaVar, uriA, 11), ajcuVar).h(new vuj(vvaVar, 4), ajcuVar);
                        defpackage.agby agbyVarO = defpackage.agby.o(((aw) ((defpackage.vxq) obj9).d).Q, 2132020174, 0);
                        agbyVarO.k = 3000;
                        agbyVarO.s(2132020173, new defpackage.ahpp(((defpackage.vxq) obj9).j, 1020, "Clicked undo button in snackbar for voicemail", new defpackage.qgq(obj9, ahrvVarH, 18), 0));
                        agbyVarO.h();
                        ((defpackage.vxq) obj9).i.j(defpackage.zoe.N(ahrvVarH), new defpackage.zoe(lValueOf), ((defpackage.vxq) obj9).v);
                    } else {
                        a.bI(defpackage.vxq.a.c().m(aioa.b), "expanded entry is missing", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "deleteExpandedVoicemail", (char) 1958, "VisualVoicemailFragmentPeer.java", zct.b);
                        ((defpackage.vxq) obj9).k(mcd.ao);
                    }
                    defpackage.ahtm ahtmVar3 = defpackage.ahtm.a;
                    ahoqVarW2.close();
                    return ahtmVar3;
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarW2.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj10 = this.a;
                ahoq ahoqVarW3 = ahvr.W(1028, "VisualVoicemailFragmentPeer_onPlayPauseButtonClick");
                try {
                    ((defpackage.vxq) obj10).l(mce.dI);
                    ((defpackage.vxq) obj10).d().ifPresentOrElse(new defpackage.vxc(obj10, i2), new defpackage.vet(obj10, 8));
                    defpackage.ahtm ahtmVar4 = defpackage.ahtm.a;
                    ahoqVarW3.close();
                    return ahtmVar4;
                } catch (java.lang.Throwable th5) {
                    try {
                        ahoqVarW3.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.vxq vxqVar3 = (defpackage.vxq) this.a;
                j$.util.Optional optionalD2 = vxqVar3.d();
                ahvr.bZ(optionalD2.isPresent(), "expanded entry is missing");
                vxqVar3.m.n(rmw.ag);
                defpackage.uzn uznVar = ((defpackage.uzo) optionalD2.orElseThrow()).c;
                if (uznVar == null) {
                    uznVar = defpackage.uzn.a;
                }
                if (!uznVar.c) {
                    vxqVar3.i(2132020929);
                }
                agtj agtjVar = vxqVar3.i;
                vva vvaVar2 = vxqVar3.f;
                defpackage.uzo uzoVar = (defpackage.uzo) optionalD2.orElseThrow();
                defpackage.uzn uznVar2 = uzoVar.c;
                if (uznVar2 == null) {
                    uznVar2 = defpackage.uzn.a;
                }
                vva vvaVar3 = vvaVar2;
                ahrv ahrvVarG = ahrv.g(vvaVar3.a(android.net.Uri.parse(uznVar2.f)));
                vmv vmvVar = new vmv(vvaVar2, uzoVar, 9);
                ajcu ajcuVar2 = vvaVar3.g;
                defpackage.zoe zoeVarM = defpackage.zoe.M(ahrvVarG.i(vmvVar, ajcuVar2).i(new defpackage.vmq(vvaVar2, 20), ajcuVar2));
                kiu kiuVar2 = ((defpackage.uzo) optionalD2.orElseThrow()).d;
                if (kiuVar2 == null) {
                    kiuVar2 = kiu.a;
                }
                agtjVar.j(zoeVarM, new defpackage.zoe(java.lang.Long.valueOf(kiuVar2.d)), vxqVar3.w);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.vwg vwgVar = (defpackage.vwg) ahthVar;
                java.lang.Object obj11 = this.a;
                ahoq ahoqVarW4 = ahvr.W(1024, "VisualVoicemailFragmentPeer_onDeleteSelectedItemsButtonClickedEvent");
                try {
                    aify aifyVarA = vwgVar.a();
                    defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "deleteSelectedVoicemails", 1141, "VisualVoicemailFragmentPeer.java").w("Deleting %d voicemails", aifyVarA.size());
                    aify aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVarA).map(new defpackage.vxb(obj11, i)).filter(new vgb(13)).map(new defpackage.vun(5)).collect(aido.a);
                    agtj agtjVar2 = ((defpackage.vxq) obj11).i;
                    vva vvaVar4 = ((defpackage.vxq) obj11).f;
                    if (!((java.lang.Boolean) vvaVar4.n.a()).booleanValue()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = aifyVar.iterator();
                        while (it.hasNext()) {
                            arrayList.add(vvaVar4.h((android.net.Uri) it.next()));
                        }
                        ajcqVarP = ahvr.ah(arrayList).p(ahqx.b(new defpackage.vfm(vvaVar4, arrayList, 9, null)), vvaVar4.g);
                    } else if (aifyVar.isEmpty()) {
                        ajcqVarP = ajcm.a;
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(aifyVar.size());
                        java.util.Iterator it2 = aifyVar.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(android.content.ContentProviderOperation.newUpdate((android.net.Uri) it2.next()).withValue("deleted", "1").build());
                        }
                        ojo ojoVar = vvaVar4.d;
                        java.lang.String authority = ((android.net.Uri) aifyVar.get(0)).getAuthority();
                        aooh.f(authority, "authority");
                        ajcqVarP = ahrv.g(ojoVar.d.x(new agxb(authority, arrayList2, 0))).h(new vuj(vvaVar4, 3), vvaVar4.g);
                    }
                    agtjVar2.j(defpackage.zoe.N(ajcqVarP), new defpackage.zoe("Failed to delete the selected voicemails!"), ((defpackage.vxq) obj11).q);
                    j$.util.Optional optionalG = ((defpackage.vxq) obj11).aa.g();
                    defpackage.vmu vmuVar = new defpackage.vmu(aifyVar, 17);
                    if (true == optionalG.isPresent()) {
                        optionalG = j$.util.Optional.ofNullable(((vav) optionalG.get()).b((java.util.List) vmuVar.a));
                    }
                    agtjVar2.j(defpackage.zoe.N((ajcq) optionalG.orElse(ajcm.a)), new defpackage.zoe("Failed to delete notifications for the selected voicemails!"), ((defpackage.vxq) obj11).r);
                    ((defpackage.vxq) obj11).N = false;
                    ((defpackage.vxq) obj11).O.clear();
                    j$.util.Optional optional3 = ((defpackage.vxq) obj11).J;
                    if (true == optional3.isPresent()) {
                        ((android.view.ActionMode) optional3.get()).finish();
                    }
                    ((defpackage.vxq) obj11).l(mce.ei);
                    ((defpackage.vxq) obj11).m.n(rmw.eI);
                    defpackage.ahtm ahtmVar5 = defpackage.ahtm.a;
                    ahoqVarW4.close();
                    return ahtmVar5;
                } catch (java.lang.Throwable th7) {
                    try {
                        ahoqVarW4.close();
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "onSimSelectionClickedEvent", 2083, "VisualVoicemailFragmentPeer.java").v("enter");
                defpackage.vtt vttVar = ((defpackage.vwr) ahthVar).a;
                defpackage.vul vulVar = ((defpackage.vxq) this.a).V;
                defpackage.vvm vvmVar = vulVar.b;
                agsm.i(1030, ahrv.g(ahrv.g(vvmVar.e.a(new vuj(vttVar, 6), vvmVar.b))).h(new vuj(vulVar, 1), vulVar.d), "Failed to set selected voicemail account", new java.lang.Object[0]);
                return defpackage.ahtm.a;
            case 15:
                defpackage.vxu vxuVar = (defpackage.vxu) ahthVar;
                java.lang.Object obj12 = this.a;
                ahoq ahoqVarW5 = ahvr.W(1027, "VisualVoicemailFragmentPeer_onPlayButtonClickedEvent");
                try {
                    if (((defpackage.vxq) obj12).J.isEmpty()) {
                        ((defpackage.vxq) obj12).m.n(((defpackage.vxq) obj12).e.c ? rmw.bj : rmw.R);
                        ((defpackage.vxq) obj12).l(mce.dM);
                        long j2 = vxuVar.a;
                        ((defpackage.vxq) obj12).r(j2, true);
                        j$.util.Optional optionalC = ((defpackage.vxq) obj12).c(j2);
                        defpackage.vxc vxcVar3 = new defpackage.vxc(obj12, i2);
                        if (true == optionalC.isPresent()) {
                            java.lang.Object obj13 = optionalC.get();
                            java.lang.Object obj14 = vxcVar3.a;
                            defpackage.uzn uznVar3 = ((defpackage.uzo) obj13).c;
                            if (uznVar3 == null) {
                                uznVar3 = defpackage.uzn.a;
                            }
                            if (uznVar3.c) {
                                ((defpackage.vxq) obj14).j();
                                ((defpackage.vxq) obj14).m();
                            } else {
                                ((defpackage.vxq) obj14).i(2132020929);
                                ajcq ajcqVarA = ((defpackage.vxq) obj14).f.a(defpackage.vxq.a((defpackage.uzo) obj13));
                                agtj agtjVar3 = ((defpackage.vxq) obj14).i;
                                defpackage.zoe zoeVarN = defpackage.zoe.N(ajcqVarA);
                                kiu kiuVar3 = ((defpackage.uzo) obj13).d;
                                if (kiuVar3 == null) {
                                    kiuVar3 = kiu.a;
                                }
                                agtjVar3.j(zoeVarN, new defpackage.zoe(java.lang.Long.valueOf(kiuVar3.d)), ((defpackage.vxq) obj14).u);
                            }
                        }
                    } else {
                        ((defpackage.vxq) obj12).h(vxuVar.a);
                    }
                    ((defpackage.vxq) obj12).w();
                    defpackage.ahtm ahtmVar6 = defpackage.ahtm.a;
                    ahoqVarW5.close();
                    return ahtmVar6;
                } catch (java.lang.Throwable th9) {
                    try {
                        ahoqVarW5.close();
                        throw th9;
                    } catch (java.lang.Throwable th10) {
                        th9.addSuppressed(th10);
                        throw th9;
                    }
                }
            case 16:
                java.lang.Object obj15 = this.a;
                defpackage.vxv vxvVar = (defpackage.vxv) ahthVar;
                ahoq ahoqVarW6 = ahvr.W(1031, "VisualVoicemailFragmentPeer_onVoicemailEntryClickedEvent");
                try {
                    if (!((defpackage.vxq) obj15).e().isPresent() || ((defpackage.vxq) obj15).J.isPresent()) {
                        if (((defpackage.vxq) obj15).J.isPresent()) {
                            ((defpackage.vxq) obj15).h(vxvVar.a);
                        } else {
                            ((defpackage.vxq) obj15).l(mce.dw);
                            ((defpackage.vxq) obj15).r(vxvVar.a, false);
                        }
                        ((defpackage.vxq) obj15).w();
                        ((defpackage.vxq) obj15).v();
                        ahtmVar = defpackage.ahtm.a;
                    } else {
                        if (((defpackage.vxq) obj15).x(vxvVar.a)) {
                            ahtmVar = defpackage.ahtm.a;
                        } else {
                            if (((defpackage.vxq) obj15).J.isPresent()) {
                                ((defpackage.vxq) obj15).l(mce.dw);
                                ((defpackage.vxq) obj15).r(vxvVar.a, false);
                            } else {
                                ((defpackage.vxq) obj15).h(vxvVar.a);
                            }
                            ((defpackage.vxq) obj15).w();
                            ((defpackage.vxq) obj15).v();
                            ahtmVar = defpackage.ahtm.a;
                        }
                    }
                    ahoqVarW6.close();
                    return ahtmVar;
                } catch (java.lang.Throwable th11) {
                    try {
                        ahoqVarW6.close();
                        throw th11;
                    } catch (java.lang.Throwable th12) {
                        th11.addSuppressed(th12);
                        throw th11;
                    }
                }
            case 17:
                defpackage.vxw vxwVar = (defpackage.vxw) ahthVar;
                java.lang.Object obj16 = this.a;
                ahoq ahoqVarW7 = ahvr.W(1032, "VisualVoicemailFragmentPeer_onVoicemailEntryLongClickedEvent");
                try {
                    ((defpackage.vxq) obj16).l(mce.dS);
                    ((defpackage.vxq) obj16).t(true);
                    long j3 = vxwVar.a;
                    java.util.Set set2 = ((defpackage.vxq) obj16).O;
                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                    if (!set2.remove(lValueOf2)) {
                        set2.add(lValueOf2);
                    } else if (set2.isEmpty()) {
                        j$.util.Optional optional4 = ((defpackage.vxq) obj16).J;
                        if (true == optional4.isPresent()) {
                            ((android.view.ActionMode) optional4.get()).finish();
                        }
                    }
                    ((defpackage.vxq) obj16).s();
                    ((defpackage.vxq) obj16).w();
                    defpackage.ahtm ahtmVar7 = defpackage.ahtm.a;
                    ahoqVarW7.close();
                    return ahtmVar7;
                } catch (java.lang.Throwable th13) {
                    try {
                        ahoqVarW7.close();
                        throw th13;
                    } catch (java.lang.Throwable th14) {
                        th13.addSuppressed(th14);
                        throw th13;
                    }
                }
            case 18:
                defpackage.vxx vxxVar = (defpackage.vxx) ahthVar;
                rmw rmwVar = vxxVar.b ? rmw.bT : rmw.bU;
                java.lang.Object obj17 = this.a;
                defpackage.vxq vxqVar4 = (defpackage.vxq) obj17;
                vxqVar4.m.n(rmwVar);
                j$.util.Optional optionalF = vxqVar4.f(vxxVar.a);
                defpackage.vxc vxcVar4 = new defpackage.vxc(obj17, i3);
                if (true == optionalF.isPresent()) {
                    java.lang.Object obj18 = optionalF.get();
                    java.lang.Object obj19 = vxcVar4.a;
                    android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj18);
                    defpackage.vdm vdmVar = new defpackage.vdm();
                    vdmVar.d(j$.util.Optional.of(defpackage.uzm.TRANSCRIPTION_AVAILABLE_AND_RATED));
                    defpackage.vxq vxqVar5 = (defpackage.vxq) obj19;
                    vxqVar5.i.j(defpackage.zoe.N(vxqVar5.n.h(uri, vdmVar.a())), new defpackage.zoe("Failed to mark transcription as rated."), vxqVar5.q);
                }
                return defpackage.ahtm.a;
            case 19:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                defpackage.wgq.a.b().l("com/android/dialer/wirelesspriorityservice/impl/WpsWarningDialogFragmentPeer", "onPositiveButtonClicked", 48, "WpsWarningDialogFragmentPeer.kt").v("continuing WPS call, may disconnect background lte call");
                return new defpackage.ahtm(new defpackage.ztc(((defpackage.wgq) this.a).b));
            default:
                defpackage.tyr tyrVar2 = (defpackage.tyr) ahthVar;
                defpackage.tyv tyvVarB2 = defpackage.tyv.b(tyrVar2.a().d);
                if (tyvVarB2 == null) {
                    tyvVarB2 = defpackage.tyv.UNRECOGNIZED;
                }
                java.lang.Object obj20 = this.a;
                int iOrdinal2 = tyvVarB2.ordinal();
                if (iOrdinal2 == 1) {
                    defpackage.wqh.a.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onSodaStatusBannerClick", 422, "XatuSettingsFragmentPeer.java").y("Starting download for SODA %s model", tyrVar2.a().c);
                    defpackage.wql wqlVar = ((defpackage.wqh) obj20).h;
                    wqlVar.b.g(ahvr.H(wqlVar.h, new defpackage.wie(akff.a(tyrVar2.a().c), 17), wqlVar.g), 5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else if (iOrdinal2 != 6) {
                    a.bI(defpackage.wqh.a.d(), "Click on un-clickable Soda Status Banner", "com/android/dialer/xatu/impl/settings/XatuSettingsFragmentPeer", "onSodaStatusBannerClick", (char) 432, "XatuSettingsFragmentPeer.java", zct.b);
                } else {
                    defpackage.wqh wqhVar = (defpackage.wqh) obj20;
                    ahqx.l(wqhVar.e, wqhVar.o.a());
                }
                return defpackage.ahtm.a;
        }
    }
}
