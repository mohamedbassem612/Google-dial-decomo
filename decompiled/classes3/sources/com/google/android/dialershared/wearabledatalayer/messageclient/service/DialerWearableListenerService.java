package com.google.android.dialershared.wearabledatalayer.messageclient.service;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialerWearableListenerService extends defpackage.zuu implements ahei {
    public defpackage.uzx a;
    private defpackage.zus j;
    private boolean k;
    private boolean l;
    private final amac m = new amac(this);

    @java.lang.Deprecated
    public DialerWearableListenerService() {
        afec.c();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.zus y() {
        defpackage.zus zusVar = this.j;
        if (zusVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.l) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return zusVar;
    }

    @Override // defpackage.aawl
    public final void c(com.google.android.gms.wearable.ChannelClient$Channel channelClient$Channel) {
        ahpm ahpmVarM = this.m.m("onChannelOpened");
        try {
            defpackage.zus zusVarY = y();
            defpackage.zus.a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/DialerWearableListenerServicePeer", "onChannelOpened", 72, "DialerWearableListenerServicePeer.java").y("Channel opened: %s", channelClient$Channel);
            j$.util.Optional optional = zusVarY.d;
            optional.isPresent();
            if (((java.lang.Boolean) j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((mfq) optional.get()).a())).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                defpackage.ztj ztjVar = zusVarY.e;
                aooh.f(channelClient$Channel, "channel");
                defpackage.ztj.a.b().l("com/google/android/dialershared/wearabledatalayer/channelclient/serviceintegration/impl/DialerCrossSurfaceStreamServiceIntegrationImpl", "onWearableListenerServiceChannelOpened", 31, "DialerCrossSurfaceStreamServiceIntegrationImpl.kt").y("Channel opened: %s", channelClient$Channel);
                aoov.an(ztjVar.b, (aolr) null, 0, new defpackage.yzh(ztjVar, channelClient$Channel, (aoln) null, 2), 3);
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

    @Override // defpackage.aawl
    public final void d(com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable) {
        ahpm ahpmVarM = this.m.m("onMessageReceived");
        try {
            defpackage.zus zusVarY = y();
            defpackage.zus.a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/DialerWearableListenerServicePeer", "onMessageReceived", 66, "DialerWearableListenerServicePeer.java").y("Message received: %s", messageEventParcelable);
            defpackage.zuv zuvVar = zusVarY.b;
            java.lang.String str = messageEventParcelable.b;
            aimz aimzVar = defpackage.zuv.a;
            aimzVar.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/infralistener/OnMessageReceivedListener", "onMessageReceived", 31, "OnMessageReceivedListener.java").y("messages received: %s", str);
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(zuvVar.b.e()).filter(new vpl(str, 20)).collect(aido.a);
            aimzVar.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/infralistener/OnMessageReceivedListener", "onMessageReceived", 38, "OnMessageReceivedListener.java").w("message listener found: %d", aifyVar.size());
            j$.lang.Iterable.-EL.forEach(aifyVar, new defpackage.who(messageEventParcelable, 19));
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zux] */
    /* JADX WARN: Type inference failed for: r9v12, types: [albh, java.lang.Object] */
    @Override // defpackage.aawl
    public final aaum e(java.lang.String str, byte[] bArr) {
        aaum aaumVarA;
        ahpm ahpmVarM = this.m.m("onRequest");
        try {
            defpackage.zus zusVarY = y();
            defpackage.zus.a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/DialerWearableListenerServicePeer", "onRequest", 60, "DialerWearableListenerServicePeer.java").I("Request received from %s: %s", str, bArr);
            defpackage.zuw zuwVar = zusVarY.c;
            aimz aimzVar = defpackage.zuw.a;
            aimzVar.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/infralistener/OnRequestListener", "onRequest", 51, "OnRequestListener.java").y("requesting message: %s", str);
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(zuwVar.c.e()).filter(new defpackage.abdh(str, 1)).collect(aido.a);
            aimzVar.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/service/infralistener/OnRequestListener", "onRequest", 58, "OnRequestListener.java").w("%d message listener found", aifyVar.size());
            if (aifyVar.isEmpty()) {
                aaumVarA = aazc.s(new byte[0]);
            } else {
                if (aifyVar.size() > 1) {
                    throw new java.lang.IllegalStateException("Not expected more than one listeners registered for a request path.");
                }
                defpackage.afpl afplVar = (defpackage.afpl) aifyVar.get(0);
                try {
                    aaumVarA = defpackage.abxl.A(ahvr.H(afplVar.a.a(((defpackage.ztw) afplVar.b).h.a(bArr, akzq.a())), new defpackage.ymu(6), zuwVar.b));
                } catch (alaz e) {
                    throw new java.lang.IllegalArgumentException("unable to parse invalid protocol buffer", e);
                }
            }
            ahpmVarM.close();
            return aaumVarA;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zuu, defpackage.aawl, android.app.Service
    public final void onCreate() {
        ahpm ahpmVarL = this.m.l();
        try {
            this.k = true;
            ahvr.bY(getApplication() instanceof ahfx);
            if (this.j == null) {
                if (!this.k) {
                    throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.l) {
                    throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
                }
                ahoq ahoqVarW = ahvr.W(1240, "CreateComponent");
                try {
                    B();
                    ahoqVarW.close();
                    ahoq ahoqVarW2 = ahvr.W(1241, "CreatePeer");
                    try {
                        this.j = ((defpackage.zut) agab.aC(this, defpackage.zut.class)).c();
                        ahoqVarW2.close();
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
            this.k = false;
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

    @Override // defpackage.aawl, android.app.Service
    public final void onDestroy() {
        ahpm ahpmVarN = this.m.n();
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            uzxVar.aQ();
            super.onDestroy();
            this.l = true;
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
}
