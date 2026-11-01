package com.android.incallui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class InCallServiceImpl extends defpackage.wum implements ahei {
    public defpackage.uzx a;
    private defpackage.wun b;
    private boolean c;
    private final amac d = new amac(this);

    @java.lang.Deprecated
    public InCallServiceImpl() {
        afec.c();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.wun y() {
        defpackage.wun wunVar = this.b;
        if (wunVar != null) {
            return wunVar;
        }
        throw new java.lang.IllegalStateException("peer() called before initialized.");
    }

    @Override // android.telecom.InCallService, android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ahpm ahpmVarK = this.d.k(intent);
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            uzxVar.aR();
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onBind", 122, "InCallServiceImplPeer.java").v("onBind");
            wunVarY.c.a(ruc.as);
            mni.aK(wunVarY.g, mgv.N);
            for (defpackage.puq puqVar : wunVarY.d) {
                com.android.incallui.InCallServiceImpl inCallServiceImpl = wunVarY.b;
                puqVar.s = true;
                ((java.util.concurrent.atomic.AtomicReference) puqVar.u.a).set(j$.util.Optional.of(inCallServiceImpl));
                defpackage.pmv pmvVar = new defpackage.pmv(intent, 18);
                j$.util.Optional optional = puqVar.f;
                optional.isPresent();
                ((defpackage.qau) optional.get()).a((android.content.Intent) pmvVar.a);
            }
            android.os.IBinder iBinderOnBind = super.onBind(intent);
            ahpmVarK.close();
            return iBinderOnBind;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarK.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.InCallService
    public final void onBringToForeground(boolean z) {
        ahpm ahpmVarM = this.d.m("onBringToForeground");
        try {
            super.onBringToForeground(z);
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onBringToForeground", 75, "InCallServiceImplPeer.java").y("onBringToForeground [showDialpad: %b]", java.lang.Boolean.valueOf(z));
            wunVarY.c.a(ruc.ao);
            mni.aK(wunVarY.g, mgv.K);
            for (defpackage.puq puqVar : wunVarY.d) {
                aimz aimzVar = defpackage.puq.a;
                aimzVar.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onBringToForeground", 172, "InCallServicePeerImpl.java").v("enter");
                if (puqVar.s) {
                    j$.util.Optional optional = puqVar.g;
                    defpackage.wtq wtqVar = new defpackage.wtq(z, 1);
                    optional.isPresent();
                    ((defpackage.qav) optional.get()).a(wtqVar.a);
                } else {
                    a.bI(aimzVar.c().m(aioa.b), "InCallService not bound", "com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onBringToForeground", (char) 178, "InCallServicePeerImpl.java", zct.b);
                }
            }
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x03c6 */
    /* JADX WARN: Code duplicated, block: B:140:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[LOOP:1: B:40:0x019e->B:142:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a6 A[Catch: all -> 0x03b7, TryCatch #12 {all -> 0x03b7, blocks: (B:39:0x017b, B:40:0x019e, B:42:0x01a6, B:44:0x01fc, B:45:0x0258, B:59:0x037f, B:89:0x03b6, B:88:0x03b3, B:36:0x0167, B:46:0x0260, B:52:0x0311, B:54:0x0326, B:56:0x0338, B:57:0x036d, B:58:0x0374, B:82:0x03ab, B:81:0x03a8, B:47:0x02ce, B:49:0x02e4, B:51:0x030e, B:68:0x0395, B:67:0x0392, B:75:0x03a0, B:74:0x039d, B:50:0x0306, B:64:0x038d, B:48:0x02d6, B:71:0x0398, B:78:0x03a3, B:85:0x03ae), top: B:134:0x017b, inners: #5, #9 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0326 A[Catch: all -> 0x03ac, TryCatch #5 {all -> 0x03ac, blocks: (B:46:0x0260, B:52:0x0311, B:54:0x0326, B:56:0x0338, B:57:0x036d, B:58:0x0374, B:82:0x03ab, B:81:0x03a8, B:47:0x02ce, B:49:0x02e4, B:51:0x030e, B:68:0x0395, B:67:0x0392, B:75:0x03a0, B:74:0x039d, B:50:0x0306, B:64:0x038d, B:48:0x02d6, B:71:0x0398, B:78:0x03a3), top: B:121:0x0260, outer: #12, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0338 A[Catch: all -> 0x03ac, TryCatch #5 {all -> 0x03ac, blocks: (B:46:0x0260, B:52:0x0311, B:54:0x0326, B:56:0x0338, B:57:0x036d, B:58:0x0374, B:82:0x03ab, B:81:0x03a8, B:47:0x02ce, B:49:0x02e4, B:51:0x030e, B:68:0x0395, B:67:0x0392, B:75:0x03a0, B:74:0x039d, B:50:0x0306, B:64:0x038d, B:48:0x02d6, B:71:0x0398, B:78:0x03a3), top: B:121:0x0260, outer: #12, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r14v18, types: [aoin, java.lang.Object] */
    @Override // android.telecom.InCallService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCallAdded(android.telecom.Call r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.incallui.InCallServiceImpl.onCallAdded(android.telecom.Call):void");
    }

    @Override // android.telecom.InCallService
    public final void onCallAudioStateChanged(android.telecom.CallAudioState callAudioState) {
        ahpm ahpmVarM = this.d.m("onCallAudioStateChanged");
        try {
            super.onCallAudioStateChanged(callAudioState);
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onCallAudioStateChanged", 65, "InCallServiceImplPeer.java").v("onCallAudioStateChanged");
            wunVarY.c.a(ruc.an);
            mni.aK(wunVarY.g, mgv.J);
            for (defpackage.puq puqVar : wunVarY.d) {
                if (puqVar.s) {
                    zms zmsVar = puqVar.d;
                    zms.a.b().l("com/google/android/dialershared/incall/core/audiomode/AudioModeProvider", "onAudioStateChanged", 77, "AudioModeProvider.java").y("audioState: %s", callAudioState);
                    android.telecom.CallAudioState callAudioState2 = (android.telecom.CallAudioState) zmsVar.e.getAndSet(callAudioState);
                    if (!callAudioState2.equals(callAudioState)) {
                        if (!callAudioState2.isMuted() && callAudioState.isMuted()) {
                            j$.util.Optional optional = zmsVar.c;
                            optional.isPresent();
                            ((ipc) optional.get()).aN(1);
                        }
                        if (callAudioState2.isMuted() && !callAudioState.isMuted()) {
                            j$.util.Optional optional2 = zmsVar.c;
                            optional2.isPresent();
                            ((ipc) optional2.get()).aN(2);
                        }
                        if (callAudioState2.getRoute() != 8 && callAudioState.getRoute() == 8) {
                            j$.util.Optional optional3 = zmsVar.c;
                            optional3.isPresent();
                            ((ipc) optional3.get()).aN(3);
                        }
                        if (callAudioState2.getRoute() == 8 && callAudioState.getRoute() != 8) {
                            j$.util.Optional optional4 = zmsVar.c;
                            optional4.isPresent();
                            ((ipc) optional4.get()).aN(4);
                        }
                        defpackage.wdm wdmVar = new defpackage.wdm(zmsVar, callAudioState, 10, null);
                        ajct ajctVar = zmsVar.d;
                        agsm.i(1227, ahvr.E(wdmVar, ajctVar), "failed notifying active audio state changed listener", new java.lang.Object[0]);
                        android.telecom.CallAudioState callAudioState3 = callAudioState;
                        agsm.i(1228, ahvr.E(new opo(zmsVar, callAudioState2, callAudioState3, 18, (char[]) null), ajctVar), "failed notifying audio state changed listeners", new java.lang.Object[0]);
                        zmsVar.f.a(ajcm.a);
                        callAudioState = callAudioState3;
                    }
                } else {
                    a.bI(defpackage.puq.a.c().m(aioa.b), "InCallService not bound", "com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onCallAudioStateChanged", (char) 164, "InCallServicePeerImpl.java", zct.b);
                }
            }
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService
    public final void onCallRemoved(android.telecom.Call call) {
        int i;
        ahpm ahpmVarM = this.d.m("onCallRemoved");
        try {
            super.onCallRemoved(call);
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onCallRemoved", 100, "InCallServiceImplPeer.java").v("onCallRemoved");
            wunVarY.f.b(ruc.aG);
            wunVarY.c.a(ruc.aq);
            mni.aK(wunVarY.g, mgv.M);
            for (defpackage.puq puqVar : wunVarY.d) {
                defpackage.puq.a.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onCallRemoved", 245, "InCallServicePeerImpl.java").y("onCallRemoved - call: %s", call);
                defpackage.pmv pmvVar = new defpackage.pmv(call, 20);
                j$.util.Optional optional = puqVar.j;
                optional.isPresent();
                ((defpackage.pzo) optional.get()).c((android.telecom.Call) pmvVar.a, 4);
                if (!puqVar.e.hasSystemFeature("android.hardware.type.watch") || ((java.lang.Boolean) puqVar.q.a()).booleanValue()) {
                    puqVar.r.add(puqVar.t.d(call));
                    qat qatVar = new qat(puqVar, call, 1);
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(call.getDetails().getDisconnectCause());
                    defpackage.pnh pnhVar = new defpackage.pnh(puqVar, 10);
                    if (true == optionalOfNullable.isPresent()) {
                        java.lang.Object obj = optionalOfNullable.get();
                        java.lang.Object obj2 = pnhVar.a;
                        android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) obj;
                        int code = disconnectCause.getCode();
                        if (code != 9 && code != 11) {
                            switch (code) {
                                case 1:
                                case 3:
                                    i = 2000;
                                    break;
                                case 2:
                                    i = ((java.lang.Boolean) ((defpackage.puq) obj2).p.a()).booleanValue() ? 0 : 200;
                                    break;
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                    i = 0;
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            i = (disconnectCause.getReason() == null || !disconnectCause.getReason().contains("IMS_MERGED_SUCCESSFULLY")) ? 5000 : 200;
                        }
                        optionalOfNullable = j$.util.Optional.ofNullable(i);
                    }
                    puqVar.l.g(ahvr.D(qatVar, ((java.lang.Integer) optionalOfNullable.orElse(5000)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, puqVar.m), 10L, java.util.concurrent.TimeUnit.SECONDS);
                }
            }
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.InCallService
    public final void onCanAddCallChanged(boolean z) {
        ahpm ahpmVarM = this.d.m("onCanAddCallChanged");
        try {
            super.onCanAddCallChanged(z);
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onCanAddCallChanged", 112, "InCallServiceImplPeer.java").y("onCanAddCallChanged [canAddCall: %b]", java.lang.Boolean.valueOf(z));
            wunVarY.c.a(ruc.ar);
            mni.aK(wunVarY.g, mgv.Q);
            for (defpackage.puq puqVar : wunVarY.d) {
                aimz aimzVar = defpackage.puq.a;
                aimzVar.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onCanAddCallChanged", 319, "InCallServicePeerImpl.java").y("canAddCall: %b", java.lang.Boolean.valueOf(z));
                j$.util.Optional optionalH = puqVar.b.h();
                if (optionalH.isPresent()) {
                    ((defpackage.pup) ((defpackage.apqr) optionalH.orElseThrow()).a(defpackage.pup.class)).be().b.a(ajcm.a);
                } else {
                    aimzVar.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onCanAddCallChanged", 323, "InCallServicePeerImpl.java").v("No primary call, so no call to notify");
                }
            }
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wum, android.app.Service
    public final void onCreate() {
        ahpm ahpmVarL = this.d.l();
        try {
            this.c = true;
            ahvr.bY(getApplication() instanceof ahfx);
            if (this.b == null) {
                if (!this.c) {
                    throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
                }
                ahoq ahoqVarW = ahvr.W(1113, "CreateComponent");
                try {
                    B();
                    ahoqVarW.close();
                    ahoq ahoqVarW2 = ahvr.W(1114, "CreatePeer");
                    try {
                        this.b = ((defpackage.wup) agab.aC(this, defpackage.wup.class)).b();
                        ahoqVarW2.close();
                        this.b.h = this;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            super.onCreate();
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onCreate", 53, "InCallServiceImplPeer.java").v("onCreate");
            wunVarY.c.a(ruc.am);
            mni.aK(wunVarY.g, mgv.I);
            wunVarY.e.b();
            java.util.Iterator it = wunVarY.d.iterator();
            while (it.hasNext()) {
                ((defpackage.puq) it.next()).c.a();
            }
            this.c = false;
            ahpmVarL.close();
        } catch (java.lang.Throwable th5) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ahpm ahpmVarN = this.d.n();
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            uzxVar.aQ();
            super.onDestroy();
            ahpmVarN.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarN.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.InCallService
    public final void onSilenceRinger() {
        ahpm ahpmVarM = this.d.m("onSilenceRinger");
        try {
            super.onSilenceRinger();
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onSilenceRinger", 145, "InCallServiceImplPeer.java").v("onSilenceRinger");
            wunVarY.c.a(ruc.au);
            mni.aK(wunVarY.g, mgv.P);
            for (defpackage.puq puqVar : wunVarY.d) {
                if (puqVar.s) {
                    defpackage.apqr apqrVar = (defpackage.apqr) puqVar.b.h().orElse((java.lang.Object) null);
                    if (apqrVar == null) {
                        defpackage.puq.a.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onSilenceRinger", 391, "InCallServicePeerImpl.java").v("No primary call, so no call to notify");
                    } else {
                        defpackage.pub pubVarCt = ((defpackage.pup) apqrVar.a(defpackage.pup.class)).ct();
                        ((defpackage.ptw) pubVarCt.a).a(new defpackage.ptm(8));
                    }
                } else {
                    a.bI(defpackage.puq.a.c().m(aioa.b), "InCallService not bound", "com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onSilenceRinger", (char) 385, "InCallServicePeerImpl.java", zct.b);
                }
            }
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService, android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        amac amacVar = this.d;
        ahou ahouVarI = amacVar.i();
        final ahpj ahpjVarB = ahns.b();
        final ahpm ahpmVarJ = amacVar.j("Unbinding");
        final ahoq ahoqVarX = ahvr.X(1435, amacVar.o("onUnbind"), ahouVarI, true);
        ahpm ahpmVar = new ahpm() { // from class: ahol
            public final void close() {
                ahoqVarX.close();
                ahpm ahpmVar2 = ahpmVarJ;
                if (ahpmVar2 != null) {
                    ahpmVar2.close();
                }
                ahns.u(ahpjVarB);
            }
        };
        try {
            defpackage.wun wunVarY = y();
            defpackage.wun.a.b().l("com/android/incallui/InCallServiceImplPeer", "onUnbind", 133, "InCallServiceImplPeer.java").v("onUnbind");
            wunVarY.c.a(ruc.at);
            mni.aK(wunVarY.g, mgv.O);
            for (defpackage.puq puqVar : wunVarY.d) {
                j$.util.Optional optional = puqVar.i;
                optional.isPresent();
                java.lang.Object obj = optional.get();
                defpackage.qaw.a.b().l("com/android/dialer/incall/incallservicelisteners/OnUnbindListenerImpl", "onUnbind", 32, "OnUnbindListenerImpl.java").v("enter");
                defpackage.otj otjVar = ((defpackage.qaw) obj).b;
                j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(otjVar.d, new defpackage.oth(otjVar, 3));
                ahvr.bF(!((defpackage.qaw) obj).c.d(new mif(10)), "InCall UI is still locked by OnBindUiLock despite InCallService#onUnbind being called.", new java.lang.Object[0]);
                if (puqVar.s) {
                    ((java.util.concurrent.atomic.AtomicReference) puqVar.u.a).set(j$.util.Optional.empty());
                    zpm zpmVar = puqVar.b;
                    ailj ailjVarK = zpmVar.a().k();
                    while (ailjVarK.hasNext()) {
                        java.lang.Object obj2 = ((defpackage.apqr) ailjVarK.next()).b;
                        if (puqVar.r.contains(obj2)) {
                            defpackage.puq.a.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "removeCallScopesNotScheduledForRemoval", 373, "InCallServicePeerImpl.java").y("CallScope %s not removed as it is already scheduled for removal.", obj2);
                        } else {
                            zpmVar.j((java.lang.String) obj2);
                            defpackage.puq.a.b().l("com/android/dialer/incall/core/peer/InCallServicePeerImpl", "removeCallScopesNotScheduledForRemoval", 370, "InCallServicePeerImpl.java").y("CallScope %s removed in unbind.", obj2);
                        }
                    }
                    puqVar.s = false;
                } else {
                    a.bI(defpackage.puq.a.c().m(aioa.b), "InCallService not bound", "com/android/dialer/incall/core/peer/InCallServicePeerImpl", "onUnbind", (char) 357, "InCallServicePeerImpl.java", zct.b);
                }
            }
            ahpmVar.close();
            return false;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVar.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
