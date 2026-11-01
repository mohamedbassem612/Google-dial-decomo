package com.android.voicemail.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerVisualVoicemailService extends android.telephony.VisualVoicemailService {
    public static final aimz a = aimz.i("com/android/voicemail/impl/DialerVisualVoicemailService");

    public static void b(com.android.voicemail.impl.sms.VvmMessage vvmMessage) {
        a.d().i(zct.a).l("com/android/voicemail/impl/DialerVisualVoicemailService", "sendSmsReceivedLegacyBroadcast", 498, "DialerVisualVoicemailService.java").y("onSmsReceived: VvmService not available on %s", ((com.android.voicemail.impl.sms.AutoValue_VvmMessage) vvmMessage).a);
    }

    public static boolean c(android.content.Context context) {
        return defpackage.xfc.k(context).ov().m();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    private final void g(final android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask, com.android.voicemail.impl.sms.VvmMessage vvmMessage) {
        j$.util.Optional optionalEmpty;
        ajcq ajcqVarA;
        byte b;
        int i;
        byte[] bArr = null;
        val valVar = (val) defpackage.xfc.k(this).na().g().orElse((java.lang.Object) null);
        if (valVar == null) {
            aimz aimzVar = defpackage.xrp.a;
            ainm ainmVarB = aimzVar.b();
            ainp ainpVar = zct.a;
            a.bI(ainmVarB, "processing VVM SMS on legacy mode", "com/android/voicemail/impl/sms/LegacyModeSmsHandler", "handle", '9', "LegacyModeSmsHandler.java", ainpVar);
            com.android.voicemail.impl.sms.AutoValue_VvmMessage autoValue_VvmMessage = (com.android.voicemail.impl.sms.AutoValue_VvmMessage) vvmMessage;
            java.lang.String str = autoValue_VvmMessage.b;
            android.os.Bundle bundle = autoValue_VvmMessage.c;
            android.telecom.PhoneAccountHandle phoneAccountHandle = autoValue_VvmMessage.a;
            if (str.equals("SYNC")) {
                java.lang.String strI = defpackage.xfc.i(bundle, "ev");
                defpackage.xfc.i(bundle, "id");
                defpackage.xfc.h(bundle, "l");
                defpackage.xfc.i(bundle, "t");
                defpackage.xfc.i(bundle, "s");
                int iH = defpackage.xfc.h(bundle, "c");
                defpackage.xfc.j(bundle.getString("dt"));
                aimzVar.b().i(ainpVar).l("com/android/voicemail/impl/sms/LegacyModeSmsHandler", "handle", 67, "LegacyModeSmsHandler.java").I("Received SYNC sms for %s with event %s", phoneAccountHandle, strI);
                int iHashCode = strI.hashCode();
                if (iHashCode == 2495 ? strI.equals("NM") : !(iHashCode != 76128 || !strI.equals("MBU"))) {
                    defpackage.xrp.a(this, phoneAccountHandle, iH);
                }
            } else if ("MBOXUPDATE".equals(str)) {
                aimzVar.d().i(zct.b).i(ainpVar).l("com/android/voicemail/impl/sms/LegacyModeSmsHandler", "handle", 82, "LegacyModeSmsHandler.java").v("receiving alternative VVM SMS on non-activated account");
                try {
                    i = java.lang.Integer.parseInt(bundle.getString("m"));
                } catch (java.lang.NumberFormatException e) {
                    defpackage.xrp.a.c().i(zct.b).i(zct.a).k(e).l("com/android/voicemail/impl/sms/LegacyModeSmsHandler", "handle", 94, "LegacyModeSmsHandler.java").v("missing message count");
                    i = 0;
                }
                defpackage.xrp.a(this, phoneAccountHandle, i);
            }
            visualVoicemailTask.finish();
            return;
        }
        com.android.voicemail.impl.sms.AutoValue_VvmMessage autoValue_VvmMessage2 = (com.android.voicemail.impl.sms.AutoValue_VvmMessage) vvmMessage;
        android.telecom.PhoneAccountHandle phoneAccountHandle2 = autoValue_VvmMessage2.a;
        java.lang.String str2 = autoValue_VvmMessage2.b;
        android.os.Bundle bundle2 = autoValue_VvmMessage2.c;
        if (str2.equals("SYNC")) {
            if (bundle2.containsKey("ev")) {
                java.lang.String string = bundle2.getString("ev");
                int iHashCode2 = string.hashCode();
                if (iHashCode2 != 2495) {
                    if (iHashCode2 == 76128 && string.equals("MBU")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (string.equals("NM")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    try {
                        optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(java.lang.Integer.parseInt(bundle2.getString("c"))));
                    } catch (java.lang.NumberFormatException e2) {
                        if (((java.lang.Boolean) valVar.k.a()).booleanValue()) {
                            a.by(val.a.b(), "missing new message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "extractVoicemailCountFromSyncMessage", (char) 503, "MwiNotifierImpl.java", e2);
                            optionalEmpty = j$.util.Optional.empty();
                        } else {
                            a.bq(val.a.c(), "missing new message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "extractVoicemailCountFromSyncMessage", (char) 506, "MwiNotifierImpl.java", e2, zct.b);
                            optionalEmpty = j$.util.Optional.empty();
                        }
                    }
                } else if (b != 1) {
                    optionalEmpty = j$.util.Optional.empty();
                } else {
                    try {
                        optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(java.lang.Integer.parseInt(bundle2.getString("c"))));
                    } catch (java.lang.NumberFormatException e3) {
                        if (((java.lang.Boolean) valVar.k.a()).booleanValue()) {
                            a.by(val.a.b(), "missing new message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "extractVoicemailCountFromSyncMessage", (char) 516, "MwiNotifierImpl.java", e3);
                            optionalEmpty = j$.util.Optional.of(0);
                        } else {
                            a.bq(val.a.c(), "missing new message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "extractVoicemailCountFromSyncMessage", (char) 519, "MwiNotifierImpl.java", e3, zct.b);
                            optionalEmpty = j$.util.Optional.empty();
                        }
                    }
                }
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
        } else if (str2.equals("MBOXUPDATE") && bundle2.containsKey("m")) {
            val.a.b().l("com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "getVoicemailCountFromVoicemailSms", 473, "MwiNotifierImpl.java").v("receiving alternative VVM SMS on non-activated account");
            try {
                optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(java.lang.Integer.parseInt(bundle2.getString("m"))));
            } catch (java.lang.NumberFormatException e4) {
                if (((java.lang.Boolean) valVar.k.a()).booleanValue()) {
                    a.by(val.a.d(), "missing alternative message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "getVoicemailCountFromVoicemailSms", (char) 478, "MwiNotifierImpl.java", e4);
                    optionalEmpty = j$.util.Optional.of(0);
                } else {
                    a.bq(val.a.c(), "missing alternative message count", "com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "getVoicemailCountFromVoicemailSms", (char) 485, "MwiNotifierImpl.java", e4, zct.b);
                    optionalEmpty = j$.util.Optional.empty();
                }
            }
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        j$.util.Optional optional = optionalEmpty;
        if (optional.isPresent()) {
            ajcqVarA = (((java.lang.Boolean) valVar.k.a()).booleanValue() && ((java.lang.Integer) optional.orElseThrow()).intValue() == 0) ? valVar.a(phoneAccountHandle2) : ahvr.I(ahvr.F(new defpackage.uwl(valVar, phoneAccountHandle2, 7, bArr), valVar.f), new defpackage.sue(valVar, optional, phoneAccountHandle2, 12, (char[]) null), valVar.e);
        } else {
            ajcqVarA = ajcm.a;
        }
        agsm.i(1179, ahvr.H(ajcqVarA, new ahyc() { // from class: xrg
            public final java.lang.Object apply(java.lang.Object obj) {
                aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                visualVoicemailTask.finish();
                return null;
            }
        }, defpackage.xfc.k(this).fH()), "failed to show notification", new java.lang.Object[0]);
    }

    public final void a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalD = defpackage.xfc.k(this).be().D(phoneAccountHandle);
        if (true == optionalD.isPresent()) {
            oko okoVar = (oko) optionalD.get();
            a.bI(a.b(), "disabling SMS filter", "com/android/voicemail/impl/DialerVisualVoicemailService", "disableFilter", (char) 460, "DialerVisualVoicemailService.java", zct.a);
            okoVar.W((android.telephony.VisualVoicemailSmsFilterSettings) null);
        }
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, vcg] */
    public final boolean d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalG = defpackage.xfc.k(this).nd().g();
        xbz xbzVar = new xbz(phoneAccountHandle, 3);
        if (true == optionalG.isPresent()) {
            optionalG = ((vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) xbzVar.a);
            optionalG.getClass();
        }
        if (optionalG.isPresent()) {
            return ((defpackage.abtr) optionalG.get()).f.s(phoneAccountHandle);
        }
        a.bt(a.b(), "isLegacyModeEnabled: new VvmService not available on %s", phoneAccountHandle, "com/android/voicemail/impl/DialerVisualVoicemailService", "isLegacyModeEnabledBlocking", (char) 450, "DialerVisualVoicemailService.java", zct.a);
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, vcc] */
    public final boolean e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalG = defpackage.xfc.k(this).nd().g();
        xbz xbzVar = new xbz(phoneAccountHandle, 2);
        if (true == optionalG.isPresent()) {
            optionalG = ((vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) xbzVar.a);
            optionalG.getClass();
        }
        if (optionalG.isPresent()) {
            return ((defpackage.abtr) optionalG.get()).e.l(phoneAccountHandle);
        }
        return false;
    }

    public final boolean f() {
        return defpackage.xfc.k(this).op().k();
    }

    @Override // android.telephony.VisualVoicemailService
    public final void onCellServiceConnected(final android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask, final android.telecom.PhoneAccountHandle phoneAccountHandle) {
        xrh xrhVarK = defpackage.xfc.k(this);
        xrhVarK.eO().g(ahvr.E(new java.lang.Runnable() { // from class: xrc
            /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, vcc] */
            @Override // java.lang.Runnable
            public final void run() {
                final com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService = this.a;
                xrh xrhVarK2 = defpackage.xfc.k(dialerVisualVoicemailService);
                aimz aimzVar = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                ainm ainmVarB = aimzVar.b();
                final android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                ainp ainpVar = zct.a;
                a.bt(ainmVarB, "onCellServiceConnected for PhoneAccountHandle %s", phoneAccountHandle2, "com/android/voicemail/impl/DialerVisualVoicemailService", "onCellServiceConnectedBlocking", 'c', "DialerVisualVoicemailService.java", ainpVar);
                zjv.i(xrhVarK2.dQ(), mgv.X, aify.p(aais.aE(phoneAccountHandle2)), (mhc) null, 0, 28);
                xrhVarK2.eO().g(xrhVarK2.bx().d(), 5L, java.util.concurrent.TimeUnit.SECONDS);
                defpackage.vaa vaaVarJK = xrhVarK2.jK();
                aooh.f(phoneAccountHandle2, "phoneAccountHandle");
                ailj ailjVarK = ((zzx) vaaVarJK.a).e().k();
                aooh.e(ailjVarK, "iterator(...)");
                while (ailjVarK.hasNext()) {
                    vde vdeVar = (vde) ailjVarK.next();
                    aooh.f(phoneAccountHandle2, "phoneAccountHandle");
                    vde.a.b().l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierNameCache", "onCellServiceConnected", 42, "VvmCarrierNameCache.kt").y("cell connected, invalidating cache for %s", phoneAccountHandle2);
                    vdeVar.b.remove(phoneAccountHandle2);
                }
                android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask2 = visualVoicemailTask;
                if (com.android.voicemail.impl.DialerVisualVoicemailService.c(dialerVisualVoicemailService)) {
                    a.bI(aimzVar.b(), "onCellServiceConnected: user locked", "com/android/voicemail/impl/DialerVisualVoicemailService", "onCellServiceConnectedBlocking", 's', "DialerVisualVoicemailService.java", ainpVar);
                    visualVoicemailTask2.finish();
                    return;
                }
                j$.util.Optional.of(phoneAccountHandle2);
                if (!dialerVisualVoicemailService.f()) {
                    hgb.j(aimzVar.d(), "onCellServiceConnected received when module is disabled", "com/android/voicemail/impl/DialerVisualVoicemailService", "onCellServiceConnectedBlocking", '}', "DialerVisualVoicemailService.java", ainpVar, zct.b);
                    visualVoicemailTask2.finish();
                    return;
                }
                defpackage.vai vaiVarIE = defpackage.xfc.k(dialerVisualVoicemailService).iE();
                defpackage.vah vahVar = vaiVarIE.c;
                defpackage.uwl uwlVar = new defpackage.uwl(vahVar, phoneAccountHandle2, 4, null);
                ajct ajctVar = vahVar.b;
                agsm.i(1182, ahvr.I(ahvr.I(ahvr.F(uwlVar, ajctVar), new uhj(vahVar, phoneAccountHandle2, 11, (byte[]) null), ajctVar), new defpackage.udu(vaiVarIE, 17), vaiVarIE.d), "update phone account sim presence failed.", new java.lang.Object[0]);
                if (!dialerVisualVoicemailService.e(phoneAccountHandle2) && !dialerVisualVoicemailService.d(phoneAccountHandle2)) {
                    dialerVisualVoicemailService.a(phoneAccountHandle2);
                    visualVoicemailTask2.finish();
                    return;
                }
                xrhVarK2.bt().n(rmw.au);
                j$.util.Optional optionalG = xrhVarK2.nd().g();
                xbz xbzVar = new xbz(phoneAccountHandle2, 4);
                if (true == optionalG.isPresent()) {
                    optionalG = ((vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) xbzVar.a);
                    optionalG.getClass();
                }
                if (optionalG.isPresent()) {
                    java.lang.Object obj = optionalG.get();
                    final defpackage.abtr abtrVar = (defpackage.abtr) obj;
                    agsm.d("com/android/voicemail/impl/DialerVisualVoicemailService", "onCellServiceConnectedBlocking", 150, ahvr.I(abtrVar.e.c(phoneAccountHandle2), new ajat() { // from class: xrf
                        public final ajcq a(java.lang.Object obj2) {
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                                com.android.voicemail.impl.DialerVisualVoicemailService.a.b().l("com/android/voicemail/impl/DialerVisualVoicemailService", "onCellServiceConnectedBlocking", 155, "DialerVisualVoicemailService.java").v("vvm is activated, skip activation");
                                return ajcm.a;
                            }
                            android.telecom.PhoneAccountHandle phoneAccountHandle3 = phoneAccountHandle2;
                            defpackage.abtr abtrVar2 = abtrVar;
                            com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService2 = dialerVisualVoicemailService;
                            defpackage.xfc.k(dialerVisualVoicemailService2).nJ().i((java.lang.String) null).b(mce.dN);
                            return ((vee) abtrVar2.d).g(phoneAccountHandle3);
                        }
                    }, xrhVarK2.fH()), zct.b, "failed to schedule activation", new java.lang.Object[0]);
                }
                visualVoicemailTask2.finish();
            }
        }, xrhVarK.fG()), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.telephony.VisualVoicemailService
    public final void onSimRemoved(final android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask, final android.telecom.PhoneAccountHandle phoneAccountHandle) {
        com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService;
        ajcq ajcqVarF;
        aimz aimzVar = a;
        ainm ainmVarB = aimzVar.b();
        ainp ainpVar = zct.a;
        a.bt(ainmVarB, "onSimRemoved for PhoneAccountHandle %s", phoneAccountHandle, "com/android/voicemail/impl/DialerVisualVoicemailService", "onSimRemoved", (char) 261, "DialerVisualVoicemailService.java", ainpVar);
        final xrh xrhVarK = defpackage.xfc.k(this);
        zjv.i(xrhVarK.dQ(), mgv.Z, aify.p(aais.aE(phoneAccountHandle)), (mhc) null, 0, 28);
        final boolean zBooleanValue = ((java.lang.Boolean) xrhVarK.ia().a()).booleanValue();
        if (!zBooleanValue) {
            xrhVarK.jK().d(phoneAccountHandle);
        }
        if (c(this)) {
            a.bI(aimzVar.b(), "onSimRemoved: user locked", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSimRemoved", (char) 274, "DialerVisualVoicemailService.java", ainpVar);
            if (zBooleanValue) {
                xrhVarK.jK().d(phoneAccountHandle);
            }
            visualVoicemailTask.finish();
            return;
        }
        j$.util.Optional.of(phoneAccountHandle);
        if (!f()) {
            hgb.j(aimzVar.d(), "onSimRemoved called when module is disabled", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSimRemoved", (char) 287, "DialerVisualVoicemailService.java", ainpVar, zct.b);
            if (zBooleanValue) {
                xrhVarK.jK().d(phoneAccountHandle);
            }
            visualVoicemailTask.finish();
            return;
        }
        if (((java.lang.Boolean) defpackage.xfc.k(this).hF().a()).booleanValue()) {
            rsr rsrVarPe = defpackage.xfc.k(this).pe();
            ajcqVarF = ahvr.H(((afhf) rsrVarPe.b).c(), new defpackage.vmj(7), (java.util.concurrent.Executor) rsrVarPe.a);
            dialerVisualVoicemailService = this;
        } else {
            dialerVisualVoicemailService = this;
            ajcqVarF = ahvr.F(new defpackage.wwy(dialerVisualVoicemailService, 18), defpackage.xfc.k(dialerVisualVoicemailService).fF());
        }
        ajcq ajcqVar = ajcqVarF;
        final com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService2 = dialerVisualVoicemailService;
        agsm.i(1180, ahvr.I(ajcqVar, new ajat() { // from class: xrb
            public final ajcq a(java.lang.Object obj) {
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                xrh xrhVar = xrhVarK;
                boolean z = zBooleanValue;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                final android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask2 = visualVoicemailTask;
                if (zBooleanValue2) {
                    a.bI(com.android.voicemail.impl.DialerVisualVoicemailService.a.b(), "system shutting down, ignoring vvm account removal", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSimRemoved", (char) 306, "DialerVisualVoicemailService.java", zct.a);
                    if (z) {
                        xrhVar.jK().d(phoneAccountHandle2);
                    }
                    visualVoicemailTask2.finish();
                    return ajcm.a;
                }
                xrhVar.bt().n(rmw.au);
                j$.util.Optional optionalG = xrhVar.nd().g();
                ahrv ahrvVarH = ajcm.a;
                if (optionalG.isPresent()) {
                    vda vdaVar = (vda) optionalG.orElseThrow();
                    ajct ajctVarFH = xrhVar.fH();
                    ahrvVarH = ahrv.g(vdaVar.a(phoneAccountHandle2)).i(new defpackage.xcv(phoneAccountHandle2, 10), ajctVarFH).e(java.lang.Throwable.class, new defpackage.ymu(1), ajctVarFH);
                }
                final com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService3 = this.a;
                if (ttj.N(dialerVisualVoicemailService3.getApplicationContext()).ir()) {
                    ahrvVarH = ahvr.I(ahrvVarH, new ajat() { // from class: xqx
                        public final ajcq a(java.lang.Object obj2) {
                            android.content.Context applicationContext = dialerVisualVoicemailService3.getApplicationContext();
                            return !ttj.N(applicationContext).ir() ? ajcm.a : ahvr.E(new defpackage.qsu(applicationContext, 20), ttj.N(applicationContext).fG());
                        }
                    }, xrhVar.fH());
                }
                if (z) {
                    ahrvVarH = ahvr.H(ahrvVarH, new wym(xrhVar, phoneAccountHandle2, 4), xrhVar.fH());
                }
                return ahvr.C(ahvr.ak(new ajcq[]{ahrvVarH}).o(new java.util.concurrent.Callable() { // from class: xrd
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                        visualVoicemailTask2.finish();
                        return null;
                    }
                }, xrhVar.fH()), java.lang.Throwable.class, new ajat() { // from class: xre
                    public final ajcq a(java.lang.Object obj2) {
                        aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                        visualVoicemailTask2.finish();
                        return aiql.y((java.lang.Throwable) obj2);
                    }
                }, xrhVar.fH());
            }
        }, xrhVarK.fG()), "failed to remove vvm account", new java.lang.Object[0]);
    }

    @Override // android.telephony.VisualVoicemailService
    public final void onSmsReceived(final android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask, final android.telephony.VisualVoicemailSms visualVoicemailSms) {
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        aliqVar.b = visualVoicemailSms.getFields();
        aliqVar.w(visualVoicemailSms.getPhoneAccountHandle());
        aliqVar.c = visualVoicemailSms.getPrefix();
        final com.android.voicemail.impl.sms.VvmMessage vvmMessageV = aliqVar.v();
        aimz aimzVar = a;
        aimzVar.b().l("com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", 172, "DialerVisualVoicemailService.java").y("onSmsReceived: %s", vvmMessageV);
        zjv.i(defpackage.xfc.k(this).dQ(), mgv.Y, aify.q(gus.aw(java.lang.String.valueOf(visualVoicemailSms.getPrefix())), aais.aE(visualVoicemailSms.getPhoneAccountHandle())), (mhc) null, 0, 28);
        if (c(this)) {
            a.bI(aimzVar.d(), "direct boot", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", (char) 181, "DialerVisualVoicemailService.java", zct.b);
            g(visualVoicemailTask, vvmMessageV);
            return;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle = ((com.android.voicemail.impl.sms.AutoValue_VvmMessage) vvmMessageV).a;
        j$.util.Optional.of(phoneAccountHandle);
        if (!f()) {
            a.bI(aimzVar.c(), "onSmsReceived received when module is disabled", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", (char) 187, "DialerVisualVoicemailService.java", zct.a);
            visualVoicemailTask.finish();
            return;
        }
        if (e(phoneAccountHandle)) {
            j$.util.Optional optionalG = defpackage.xfc.k(this).nd().g();
            if (optionalG.isPresent()) {
                ajct ajctVarFH = defpackage.xfc.k(this).fH();
                agsm.i(1181, ahvr.Q(new defpackage.wwg(optionalG, vvmMessageV, 8), ajctVarFH).i(new ajat() { // from class: xqy
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, vcg] */
                    public final ajcq a(java.lang.Object obj) {
                        j$.util.Optional optional = (j$.util.Optional) obj;
                        if (!optional.isPresent()) {
                            com.android.voicemail.impl.DialerVisualVoicemailService.b(vvmMessageV);
                            return aiql.z(java.lang.Boolean.TRUE);
                        }
                        final android.telephony.VisualVoicemailSms visualVoicemailSms2 = visualVoicemailSms;
                        com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService = this.a;
                        final defpackage.abtr abtrVar = (defpackage.abtr) optional.get();
                        return ahrv.g(abtrVar.f.o()).i(new ajat() { // from class: xra
                            public final ajcq a(java.lang.Object obj2) {
                                aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                                if (!((java.lang.Boolean) obj2).booleanValue()) {
                                    return aiql.z(java.lang.Boolean.FALSE);
                                }
                                final android.telephony.VisualVoicemailSms visualVoicemailSms3 = visualVoicemailSms2;
                                final vew vewVar = (vew) abtrVar.c;
                                final ven venVar = vewVar.d;
                                return ahvr.I(ahvr.F(new java.util.concurrent.Callable() { // from class: vem
                                    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
                                    @Override // java.util.concurrent.Callable
                                    public final java.lang.Object call() {
                                        defpackage.veq veqVar;
                                        int i;
                                        defpackage.vep vepVar;
                                        android.telephony.VisualVoicemailSms visualVoicemailSms4 = visualVoicemailSms3;
                                        java.lang.String prefix = visualVoicemailSms4.getPrefix();
                                        android.telecom.PhoneAccountHandle phoneAccountHandle2 = visualVoicemailSms4.getPhoneAccountHandle();
                                        int i2 = 0;
                                        boolean z = phoneAccountHandle2 != null;
                                        android.os.Bundle fields = visualVoicemailSms4.getFields();
                                        ahvr.bN(z, "missing phone account");
                                        ahvr.bN(fields != null, "missing sms fields");
                                        ahvr.bN(!android.text.TextUtils.isEmpty(prefix), "missing sms prefix");
                                        akzx akzxVarM = defpackage.vek.a.m();
                                        java.lang.String strFlattenToString = phoneAccountHandle2.getComponentName().flattenToString();
                                        akzxVarM.u();
                                        defpackage.vek vekVar = (defpackage.vek) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(strFlattenToString);
                                        vekVar.d = strFlattenToString;
                                        java.lang.String id = phoneAccountHandle2.getId();
                                        akzxVarM.u();
                                        defpackage.vek vekVar2 = (defpackage.vek) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(id);
                                        vekVar2.e = id;
                                        int iHashCode = prefix.hashCode();
                                        if (iHashCode != -1839152142) {
                                            if (iHashCode == 2560667 && prefix.equals("SYNC")) {
                                                android.os.Bundle fields2 = visualVoicemailSms4.getFields();
                                                if (fields2.containsKey("ev")) {
                                                    java.lang.String string = fields2.getString("ev");
                                                    int iHashCode2 = string.hashCode();
                                                    if (iHashCode2 != 2286) {
                                                        if (iHashCode2 != 2495) {
                                                            if (iHashCode2 == 76128 && string.equals("MBU")) {
                                                                veqVar = defpackage.veq.EVENT_MAILBOX_UPDATE;
                                                            } else {
                                                                veqVar = defpackage.veq.UNRECOGNIZED;
                                                            }
                                                        } else if (string.equals("NM")) {
                                                            veqVar = defpackage.veq.EVENT_NEW_MESSAGE;
                                                        } else {
                                                            veqVar = defpackage.veq.UNRECOGNIZED;
                                                        }
                                                    } else if (string.equals("GU")) {
                                                        veqVar = defpackage.veq.EVENT_GREETINGS_UPDATE;
                                                    } else {
                                                        veqVar = defpackage.veq.UNRECOGNIZED;
                                                    }
                                                } else {
                                                    veqVar = defpackage.veq.EVENT_UNSPECIFIED;
                                                }
                                                int iOrdinal = veqVar.ordinal();
                                                if (iOrdinal == 0) {
                                                    throw new java.lang.IllegalArgumentException("missing trigger event");
                                                }
                                                int i3 = 2;
                                                if (iOrdinal == 1) {
                                                    java.lang.String string2 = fields2.getString("t");
                                                    akzx akzxVarM2 = defpackage.vep.a.m();
                                                    akzxVarM2.u();
                                                    ((defpackage.vep) akzxVarM2.b).c = veqVar.a();
                                                    akzxVarM2.u();
                                                    defpackage.vep vepVar2 = (defpackage.vep) akzxVarM2.b;
                                                    j$.util.Objects.requireNonNull(string2);
                                                    vepVar2.d = string2;
                                                    android.os.Bundle fields3 = visualVoicemailSms4.getFields();
                                                    j$.util.Collection.-EL.stream(aify.s("id", "l", "s", "dt")).filter(new defpackage.ree(fields3, 11)).forEach(new defpackage.uwm(3));
                                                    akzx akzxVarM3 = defpackage.vcn.a.m();
                                                    java.lang.String string3 = fields3.getString("l");
                                                    try {
                                                        akzx akzxVarM4 = akzm.a.m();
                                                        int length = string3.length();
                                                        if (length == 0) {
                                                            throw new java.lang.NumberFormatException("empty string");
                                                        }
                                                        if (string3.charAt(0) == '+' && length > 1) {
                                                            i2 = 1;
                                                        }
                                                        long j = 0;
                                                        while (true) {
                                                            i = i3;
                                                            if (i2 >= length) {
                                                                akzxVarM4.u();
                                                                akzxVarM4.b.b = j;
                                                                akzm akzmVarP = akzxVarM4.p();
                                                                ven venVar2 = venVar;
                                                                akzxVarM3.u();
                                                                defpackage.vcn vcnVar = (defpackage.vcn) akzxVarM3.b;
                                                                j$.util.Objects.requireNonNull(akzmVarP);
                                                                vcnVar.f = akzmVarP;
                                                                vcnVar.b |= 2;
                                                                j$.util.Objects.requireNonNull(akzxVarM3);
                                                                ven.b(fields3, "id", new defpackage.vel(akzxVarM3, 5));
                                                                if (((java.lang.Boolean) venVar2.d.a()).booleanValue()) {
                                                                    ven.a.b().l("com/android/dialer/voicemail/service/impl/sms/OmtpSmsMessageConverter", "toVvmMessage", 221, "OmtpSmsMessageConverter.java").y("Received SMS with SYNC_MESSAGE_UID: %s", fields3.getString("id"));
                                                                }
                                                                j$.util.Objects.requireNonNull(akzxVarM3);
                                                                ven.b(fields3, "s", new defpackage.vel(akzxVarM3, 6));
                                                                ven.b(fields3, "dt", new defpackage.vel(akzxVarM3, 7));
                                                                defpackage.vcn vcnVar2 = (defpackage.vcn) akzxVarM3.p();
                                                                akzxVarM2.u();
                                                                defpackage.vep vepVar3 = (defpackage.vep) akzxVarM2.b;
                                                                j$.util.Objects.requireNonNull(vcnVar2);
                                                                vepVar3.e = vcnVar2;
                                                                vepVar3.b |= 1;
                                                                vepVar = (defpackage.vep) akzxVarM2.p();
                                                                break;
                                                            }
                                                            int iDigit = java.lang.Character.digit(string3.charAt(i2), 10);
                                                            if (iDigit == -1) {
                                                                throw new java.lang.NumberFormatException(string3.toString());
                                                            }
                                                            if (j < 0 || j > 1844674407370955161L || (j == 1844674407370955161L && iDigit > 5)) {
                                                                throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(string3.toString()));
                                                            }
                                                            j = (j * 10) + ((long) iDigit);
                                                            i2++;
                                                            string3 = string3;
                                                            i3 = i;
                                                        }
                                                    } catch (java.lang.NumberFormatException e) {
                                                        throw new java.lang.IllegalArgumentException("invalid message length", e);
                                                    }
                                                } else {
                                                    if (iOrdinal != 2 && iOrdinal != 3) {
                                                        throw new java.lang.IllegalArgumentException("unrecognized trigger event");
                                                    }
                                                    akzx akzxVarM5 = defpackage.vep.a.m();
                                                    akzxVarM5.u();
                                                    ((defpackage.vep) akzxVarM5.b).c = veqVar.a();
                                                    vepVar = (defpackage.vep) akzxVarM5.p();
                                                    i = 2;
                                                }
                                                akzxVarM.u();
                                                defpackage.vek vekVar3 = (defpackage.vek) akzxVarM.b;
                                                j$.util.Objects.requireNonNull(vepVar);
                                                vekVar3.c = vepVar;
                                                vekVar3.b = i;
                                                return (defpackage.vek) akzxVarM.p();
                                            }
                                        } else if (prefix.equals("STATUS")) {
                                            defpackage.veo veoVarC = ven.c(phoneAccountHandle2, fields);
                                            akzxVarM.u();
                                            defpackage.vek vekVar4 = (defpackage.vek) akzxVarM.b;
                                            j$.util.Objects.requireNonNull(veoVarC);
                                            vekVar4.c = veoVarC;
                                            vekVar4.b = 1;
                                            return (defpackage.vek) akzxVarM.p();
                                        }
                                        throw new java.lang.IllegalArgumentException("unrecognized sms prefix: ".concat(java.lang.String.valueOf(prefix)));
                                    }
                                }, venVar.c), new ajat() { // from class: ves
                                    public final ajcq a(java.lang.Object obj3) {
                                        return vewVar.a(visualVoicemailSms3.getPhoneAccountHandle(), (defpackage.vek) obj3);
                                    }
                                }, vewVar.b);
                            }
                        }, defpackage.xfc.k(dialerVisualVoicemailService).fH());
                    }
                }, ajctVarFH).h(new ahyc() { // from class: xqz
                    public final java.lang.Object apply(java.lang.Object obj) {
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            com.android.voicemail.impl.sms.VvmMessage vvmMessage = vvmMessageV;
                            com.android.voicemail.impl.DialerVisualVoicemailService dialerVisualVoicemailService = this.a;
                            com.android.voicemail.impl.DialerVisualVoicemailService.a.b().l("com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", 228, "DialerVisualVoicemailService.java").v("disabling filter");
                            dialerVisualVoicemailService.a(((com.android.voicemail.impl.sms.AutoValue_VvmMessage) vvmMessage).a);
                        }
                        visualVoicemailTask.finish();
                        return null;
                    }
                }, ajctVarFH), "failed to handle received sms", new java.lang.Object[0]);
                return;
            } else {
                b(vvmMessageV);
                visualVoicemailTask.finish();
                return;
            }
        }
        a.bI(aimzVar.c(), "onSmsReceived received when service is disabled", "com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", (char) 193, "DialerVisualVoicemailService.java", zct.a);
        if (d(phoneAccountHandle)) {
            aimzVar.d().i(zct.b).l("com/android/voicemail/impl/DialerVisualVoicemailService", "onSmsReceived", 195, "DialerVisualVoicemailService.java").v("is legacy mode");
            g(visualVoicemailTask, vvmMessageV);
        } else {
            a(phoneAccountHandle);
            visualVoicemailTask.finish();
        }
    }

    @Override // android.telephony.VisualVoicemailService
    public final void onStopped(android.telephony.VisualVoicemailService.VisualVoicemailTask visualVoicemailTask) {
        aimz aimzVar = a;
        ainm ainmVarB = aimzVar.b();
        ainp ainpVar = zct.a;
        a.bI(ainmVarB, "onStopped", "com/android/voicemail/impl/DialerVisualVoicemailService", "onStopped", (char) 399, "DialerVisualVoicemailService.java", ainpVar);
        zjv.i(defpackage.xfc.k(this).dQ(), mgv.aa, (java.util.List) null, (mhc) null, 0, 30);
        if (c(this)) {
            a.bI(aimzVar.b(), "onStopped: user locked", "com/android/voicemail/impl/DialerVisualVoicemailService", "onStopped", (char) 404, "DialerVisualVoicemailService.java", ainpVar);
            visualVoicemailTask.finish();
            return;
        }
        j$.util.Optional.empty();
        if (f()) {
            defpackage.xfc.k(this).bt().n(rmw.au);
        } else {
            a.bI(aimzVar.d(), "onStopped called when module is disabled", "com/android/voicemail/impl/DialerVisualVoicemailService", "onStopped", (char) 409, "DialerVisualVoicemailService.java", ainpVar);
            visualVoicemailTask.finish();
        }
    }
}
