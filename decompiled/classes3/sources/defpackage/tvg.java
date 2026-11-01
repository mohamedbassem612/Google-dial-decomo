package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tvg implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tvg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0543 A[Catch: all -> 0x0564, TRY_LEAVE, TryCatch #0 {all -> 0x0564, blocks: (B:122:0x04f7, B:124:0x04fd, B:126:0x0528, B:127:0x0543), top: B:149:0x04f7 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x055f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x04a9 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = 0;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.tvh.a;
                aimzVar.b().l("com/android/dialer/shortcuts/PinnedShortcuts", "refreshInBackground", 104, "PinnedShortcuts.java").v("refreshInBackground");
                defpackage.tvh tvhVar = (defpackage.tvh) this.a;
                android.content.Context context = tvhVar.c;
                if (dvx.c(context, "android.permission.READ_CONTACTS") != 0) {
                    a.bI(aimzVar.d(), "no contact permissions", "com/android/dialer/shortcuts/PinnedShortcuts", "refreshInBackground", 'l', "PinnedShortcuts.java", zct.b);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    aca acaVar = new aca();
                    java.util.Iterator it = hq$.ExternalSyntheticApiModelOutline1.m$2(hq$.ExternalSyntheticApiModelOutline1.m(context.getSystemService(hq$.ExternalSyntheticApiModelOutline1.m()))).iterator();
                    while (it.hasNext()) {
                        android.content.pm.ShortcutInfo shortcutInfoM = hq$.ExternalSyntheticApiModelOutline1.m(it.next());
                        if (!hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM) && !hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutInfoM)) {
                            java.lang.String action = hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM) != null ? hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM).getAction() : null;
                            if (action != null && action.equals("com.android.dialer.shortcuts.CALL_CONTACT")) {
                                java.lang.String strM = hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM);
                                android.database.Cursor cursorB = tvhVar.e.b(defpackage.tvb.b(shortcutInfoM), defpackage.tvh.b, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                                if (cursorB != null) {
                                    try {
                                        if (cursorB.moveToNext()) {
                                            defpackage.tva tvaVarC = defpackage.tvb.c();
                                            tvaVarC.b(cursorB.getLong(cursorB.getColumnIndexOrThrow("_id")));
                                            tvaVarC.d(strM);
                                            tvaVarC.c(cursorB.getString(cursorB.getColumnIndexOrThrow("display_name")));
                                            defpackage.tvb tvbVarA = tvaVarC.a();
                                            if (tvbVarA.d(shortcutInfoM)) {
                                                aimzVar.b().l("com/android/dialer/shortcuts/PinnedShortcuts", "refreshInBackground", 158, "PinnedShortcuts.java").v("contact updated");
                                                acaVar.put(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM), tvbVarA);
                                            }
                                        } else {
                                            aimzVar.b().l("com/android/dialer/shortcuts/PinnedShortcuts", "refreshInBackground", 141, "PinnedShortcuts.java").v("contact disabled");
                                            arrayList.add(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM));
                                            if (cursorB != null) {
                                            }
                                        }
                                        cursorB.close();
                                    } catch (java.lang.Throwable th) {
                                        if (cursorB == null) {
                                            throw th;
                                        }
                                        try {
                                            cursorB.close();
                                            throw th;
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    aimzVar.b().l("com/android/dialer/shortcuts/PinnedShortcuts", "refreshInBackground", 141, "PinnedShortcuts.java").v("contact disabled");
                                    arrayList.add(hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM));
                                    if (cursorB != null) {
                                        cursorB.close();
                                    }
                                }
                            }
                        }
                    }
                    android.content.pm.ShortcutManager shortcutManagerM = hq$.ExternalSyntheticApiModelOutline1.m(context.getSystemService(hq$.ExternalSyntheticApiModelOutline1.m()));
                    java.lang.String string = context.getResources().getString(2132018298);
                    if (!arrayList.isEmpty()) {
                        hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerM, arrayList, string);
                    }
                    if (!acaVar.isEmpty() && !hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerM, tvhVar.f.l(acaVar))) {
                        aimzVar.b().l("com/android/dialer/shortcuts/PinnedShortcuts", "applyDelta", 179, "PinnedShortcuts.java").v("shortcutManager rate limited.");
                    }
                }
                return null;
            case 1:
                aimz aimzVar2 = tvd.a;
                aimzVar2.b().l("com/android/dialer/shortcuts/DynamicShortcuts", "updateIconsInBackground", 165, "DynamicShortcuts.java").v("updateIconsInBackground");
                tvd tvdVar = (tvd) this.a;
                android.content.Context context2 = tvdVar.b;
                if (dvx.c(context2, "android.permission.READ_CONTACTS") != 0) {
                    a.bI(aimzVar2.d(), "no contact permissions", "com/android/dialer/shortcuts/DynamicShortcuts", "updateIconsInBackground", (char) 169, "DynamicShortcuts.java", zct.b);
                } else {
                    android.content.pm.ShortcutManager shortcutManagerA = tvd.a(context2);
                    int iM = hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA) - hq$.ExternalSyntheticApiModelOutline1.m(shortcutManagerA).size();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it2 = hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutManagerA).iterator();
                    while (it2.hasNext()) {
                        android.content.pm.ShortcutInfo shortcutInfoM2 = hq$.ExternalSyntheticApiModelOutline1.m(it2.next());
                        rsr rsrVar = tvdVar.e;
                        gus.aJ();
                        android.content.pm.ShortcutInfo.Builder builderM = hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m$1(hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m(new android.content.pm.ShortcutInfo.Builder((android.content.Context) rsrVar.b, hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2)), hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2)), hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2)), hq$.ExternalSyntheticApiModelOutline1.m$1(shortcutInfoM2)), hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2));
                        lpb.a();
                        arrayList2.add(hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m(builderM, ((tve) rsrVar.a).a(defpackage.tvb.b(shortcutInfoM2), hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2).toString(), hq$.ExternalSyntheticApiModelOutline1.m(shortcutInfoM2)))));
                        i++;
                        if (i >= iM) {
                            aimzVar2.b().l("com/android/dialer/shortcuts/DynamicShortcuts", "updateIconsInBackground", 187, "DynamicShortcuts.java").w("updating %d shortcut icons", arrayList2.size());
                            hq$.ExternalSyntheticApiModelOutline1.m$2(shortcutManagerA, arrayList2);
                        }
                    }
                    aimzVar2.b().l("com/android/dialer/shortcuts/DynamicShortcuts", "updateIconsInBackground", 187, "DynamicShortcuts.java").w("updating %d shortcut icons", arrayList2.size());
                    hq$.ExternalSyntheticApiModelOutline1.m$2(shortcutManagerA, arrayList2);
                }
                return null;
            case 2:
                akzx akzxVarM = defpackage.amtv.a.m();
                akzxVarM.u();
                defpackage.amtv amtvVar = (defpackage.amtv) akzxVarM.b;
                alak alakVar = amtvVar.b;
                if (!alakVar.c()) {
                    amtvVar.b = alad.H(alakVar);
                }
                java.util.Iterator it3 = ((defpackage.tzk) this.a).c.iterator();
                while (it3.hasNext()) {
                    amtvVar.b.g(((defpackage.amtu) it3.next()).l);
                }
                return (defpackage.amtv) akzxVarM.p();
            case 3:
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "checkPlaybackAndUpdatePlayerState", 289, "SonicAudioPlayer.java").v("state change from blocking to idle");
                ((defpackage.tzv) this.a).f(defpackage.tzt.a);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.tzx) this.a).h.a(ajcm.a);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzx akzxVarM2 = defpackage.qxp.a.m();
                defpackage.que queVar = defpackage.que.AUDIO_EMOJI;
                akzxVarM2.u();
                defpackage.qxp qxpVar = (defpackage.qxp) akzxVarM2.b;
                qxpVar.c = queVar.g;
                qxpVar.b |= 1;
                java.lang.String string2 = ((android.content.Context) this.a).getString(2132017439);
                akzxVarM2.u();
                defpackage.qxp qxpVar2 = (defpackage.qxp) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string2);
                qxpVar2.b |= 2;
                qxpVar2.d = string2;
                akzxVarM2.u();
                defpackage.qxp qxpVar3 = (defpackage.qxp) akzxVarM2.b;
                qxpVar3.e = 1;
                qxpVar3.b |= 4;
                defpackage.qtr qtrVar = defpackage.qtr.SONIC_GRID;
                akzxVarM2.u();
                defpackage.qxp qxpVar4 = (defpackage.qxp) akzxVarM2.b;
                qxpVar4.f = qtrVar.k;
                qxpVar4.b |= 8;
                return j$.util.Optional.of((defpackage.qxp) akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (j$.util.Optional) ((java.util.concurrent.atomic.AtomicReference) ((defpackage.taq) this.a).b).get();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.uaq) this.a).j.a(ajcm.a);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.uaq.a.b().l("com/android/dialer/sonic/impl/service/SonicPromoGridController", "showGridFragment", 136, "SonicPromoGridController.java").v("Displaying Sonic BottomSheetFragment via Presenter API");
                defpackage.uaq uaqVar = (defpackage.uaq) this.a;
                uaqVar.k.c(defpackage.qtr.SONIC_GRID);
                uaqVar.j.a(ajcm.a);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.uaq uaqVar2 = (defpackage.uaq) this.a;
                uaqVar2.k.d();
                uaqVar2.j.a(ajcm.a);
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.uar) this.a).h;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i2 = ((defpackage.uar) this.a).i;
                return java.lang.Boolean.valueOf(i2 == 2 || i2 == 3);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf(((android.os.UserManager) this.a).isSystemUser());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                zth zthVar = ((urr) this.a).a;
                return java.lang.Integer.valueOf(zthVar.a().getInt("display_options_theme_preference", true != zthVar.a().getBoolean("display_options_dark_mode", false) ? -1 : 2));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.aknk aknkVar = (defpackage.aknk) alad.A(defpackage.aknk.a, new java.io.FileInputStream((java.io.File) this.a), akzq.a());
                defpackage.usf.a.b().l("com/android/dialer/timekeeper/impl/TimeKeeperDetailsImporter", "buildTimeKeeperDetailsList", 111, "TimeKeeperDetailsImporter.java").v("buildTimeKeeperDetailsList");
                aift aiftVar = new aift(4);
                for (defpackage.aknm aknmVar : aknkVar.b) {
                    akzx akzxVarM3 = defpackage.ury.a.m();
                    java.lang.String str = aknmVar.b;
                    akzxVarM3.u();
                    defpackage.ury uryVar = (defpackage.ury) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(str);
                    uryVar.b |= 1;
                    uryVar.c = str;
                    for (java.util.Map.Entry entry : j$.util.DesugarCollections.unmodifiableMap(aknmVar.c).entrySet()) {
                        akzx akzxVarM4 = defpackage.urx.a.m();
                        for (java.util.Map.Entry entry2 : j$.util.DesugarCollections.unmodifiableMap(((defpackage.aknl) entry.getValue()).b).entrySet()) {
                            int iIntValue = ((java.lang.Integer) entry2.getKey()).intValue();
                            defpackage.akno aknoVar = (defpackage.akno) entry2.getValue();
                            akzx akzxVarM5 = defpackage.urw.a.m();
                            akzx akzxVarM6 = defpackage.urv.a.m();
                            defpackage.aknn aknnVar = aknoVar.b;
                            if (aknnVar == null) {
                                aknnVar = defpackage.aknn.a;
                            }
                            defpackage.alcg alcgVar = aknnVar.b;
                            if (alcgVar == null) {
                                alcgVar = defpackage.alcg.a;
                            }
                            int i3 = alcgVar.b;
                            akzxVarM6.u();
                            defpackage.urv urvVar = (defpackage.urv) akzxVarM6.b;
                            urvVar.b |= 1;
                            urvVar.c = i3;
                            defpackage.aknn aknnVar2 = aknoVar.b;
                            if (aknnVar2 == null) {
                                aknnVar2 = defpackage.aknn.a;
                            }
                            defpackage.alcg alcgVar2 = aknnVar2.c;
                            if (alcgVar2 == null) {
                                alcgVar2 = defpackage.alcg.a;
                            }
                            int i4 = alcgVar2.b;
                            akzxVarM6.u();
                            defpackage.urv urvVar2 = (defpackage.urv) akzxVarM6.b;
                            urvVar2.b |= 2;
                            urvVar2.d = i4;
                            defpackage.urv urvVar3 = (defpackage.urv) akzxVarM6.p();
                            akzxVarM5.u();
                            defpackage.urw urwVar = (defpackage.urw) akzxVarM5.b;
                            j$.util.Objects.requireNonNull(urvVar3);
                            urwVar.c = urvVar3;
                            urwVar.b |= 1;
                            akzxVarM4.S(iIntValue, (defpackage.urw) akzxVarM5.p());
                        }
                        akzxVarM3.R(((java.lang.Integer) entry.getKey()).intValue(), (defpackage.urx) akzxVarM4.p());
                    }
                    aiftVar.i((defpackage.ury) akzxVarM3.p());
                }
                return aiftVar.h();
            case 15:
                java.io.File file = new java.io.File(((defpackage.uvb) this.a).b.getCacheDir(), "feedback_audio_cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file.getAbsolutePath() + java.io.File.separator + "combined_recording.wav";
            case 16:
                java.io.File file2 = new java.io.File(((defpackage.uvb) this.a).b.getCacheDir(), "feedback_audio_cache" + java.io.File.separator + "combined_recording.wav");
                if (!file2.exists()) {
                    return null;
                }
                file2.delete();
                return null;
            case 17:
                aigf aigfVar = (aigf) this.a;
                ailj ailjVarK = aigfVar.f().k();
                while (ailjVarK.hasNext()) {
                    defpackage.uty utyVar = (defpackage.uty) ailjVarK.next();
                    if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) aigfVar.get(utyVar))).booleanValue()) {
                        return j$.util.Optional.of(utyVar);
                    }
                }
                return j$.util.Optional.empty();
            case 18:
                return rlt.a(((val) this.a).b, (android.telecom.PhoneAccountHandle) null);
            case 19:
                return java.lang.Boolean.valueOf(((zzx) this.a).m());
            default:
                return java.lang.Boolean.valueOf(((val) this.a).i.s().size() > 1);
        }
    }
}
