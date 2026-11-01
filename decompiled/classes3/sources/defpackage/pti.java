package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pti extends android.telecom.Call.Callback implements defpackage.zpn {
    public static final /* synthetic */ int b = 0;
    private static final aimz c = aimz.i("com/android/dialer/incall/core/call/TelecomCallbacksAdapter");
    public final java.util.concurrent.Executor a;
    private final android.telecom.Call d;
    private final ahpz e;
    private final mfz f;
    private final defpackage.pub g;
    private final zpz h;
    private final zjm i;
    private final zzx j;
    private final zzx k;
    private final zzx l;
    private final zzx m;
    private final zzx n;
    private final zzx o;
    private final zzx p;
    private final zzx q;

    public pti(android.telecom.Call call, zzx zzxVar, zzx zzxVar2, zzx zzxVar3, zzx zzxVar4, zzx zzxVar5, zzx zzxVar6, zzx zzxVar7, zzx zzxVar8, defpackage.pub pubVar, ajct ajctVar, zpz zpzVar, ahpz ahpzVar, zjm zjmVar, mfz mfzVar) {
        this.d = call;
        this.j = zzxVar;
        this.k = zzxVar2;
        this.l = zzxVar3;
        this.m = zzxVar4;
        this.n = zzxVar5;
        this.o = zzxVar6;
        this.p = zzxVar7;
        this.g = pubVar;
        this.q = zzxVar8;
        this.a = new ajdc(ajctVar);
        this.h = zpzVar;
        this.e = ahpzVar;
        this.i = zjmVar;
        this.f = mfzVar;
    }

    private final void b() {
        this.h.a(aiql.z((java.lang.Object) null));
    }

    private final void c(boolean z) {
        if (z) {
            c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "propagateCallbacksIfListenersExist", 357, "TelecomCallbacksAdapter.java").v("will not propagate callback because listeners empty");
        } else {
            b();
        }
    }

    private final void d() {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "triggerVideoCallChangedListeners", 230, "TelecomCallbacksAdapter.java").v("triggerVideoCallChangedListeners");
        zzx zzxVar = this.o;
        j$.lang.Iterable.-EL.forEach(zzxVar.e(), new defpackage.oxs(this, 7));
        c(zzxVar.e().isEmpty());
    }

    @Override // defpackage.zpn
    public final void a() {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onCallScopeCreated", 109, "TelecomCallbacksAdapter.java").v("onCallScopeCreated");
        this.d.registerCallback(this);
        mni.aK(this.f, mfy.eq);
        d();
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(android.telecom.Call call) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onCallDestroyed", 243, "TelecomCallbacksAdapter.java").y("onCallDestroyed - call: %s", call);
        ahok ahokVarF = this.e.f(513, "TelecomCallbacksAdapter.onCallDestroyed");
        try {
            mni.aK(this.f, mfy.dL);
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onCannedTextResponsesLoaded(android.telecom.Call call, java.util.List list) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onCannedTextResponsesLoaded", 188, "TelecomCallbacksAdapter.java").y("onCannedTextResponsesLoaded [callid: %s]", this.i.d(call));
        ahok ahokVarF = this.e.f(514, "TelecomCallbacksAdapter.onCannedTextResponsesLoaded");
        try {
            mni.aK(this.f, mfy.dJ);
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onChildrenChanged(android.telecom.Call call, java.util.List list) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onChildrenChanged", 156, "TelecomCallbacksAdapter.java").G("onChildrenChanged [callId: %s, children size: %s]", this.i.d(call), list.size());
        ahok ahokVarF = this.e.f(515, "TelecomCallbacksAdapter.onChildrenChanged");
        try {
            mfz mfzVar = this.f;
            gus.au(list.size());
            mfzVar.c();
            defpackage.pub pubVar = this.g;
            ((defpackage.ptw) pubVar.f).a(new defpackage.pua(list.size(), 1));
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onConferenceableCallsChanged(android.telecom.Call call, java.util.List list) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onConferenceableCallsChanged", 253, "TelecomCallbacksAdapter.java").y("onConferenceableCallsChanged [callId: %s]", this.i.d(call));
        ahok ahokVarF = this.e.f(516, "TelecomCallbacksAdapter.onConferenceableCallsChanged");
        try {
            mni.aK(this.f, mfy.dM);
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onConnectionEvent(android.telecom.Call call, java.lang.String str, android.os.Bundle bundle) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onConnectionEvent", 263, "TelecomCallbacksAdapter.java").I("onConnectionEvent [callId: %s, event: %s]", this.i.d(call), aais.aD(str));
        ahok ahokVarF = this.e.f(517, "TelecomCallbacksAdapter.onConnectionEvent");
        try {
            mni.aK(this.f, mfy.dN);
            j$.lang.Iterable.-EL.forEach(this.j.e(), new ffz(this, str, bundle, 2));
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(android.telecom.Call call, android.telecom.Call.Details details) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onDetailsChanged", 171, "TelecomCallbacksAdapter.java").y("onDetailsChanged [callId: %s]", this.i.d(call));
        ahok ahokVarF = this.e.f(518, "TelecomCallbacksAdapter.onDetailsChanged");
        try {
            mni.aK(this.f, mfy.dI);
            j$.lang.Iterable.-EL.forEach(this.l.e(), new defpackage.oxs(this, 5));
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onParentChanged(android.telecom.Call call, android.telecom.Call call2) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onParentChanged", 139, "TelecomCallbacksAdapter.java").y("onParentChanged [callId: %s]", this.i.d(call));
        ahok ahokVarF = this.e.f(519, "TelecomCallbacksAdapter.onParentChanged");
        try {
            mni.aK(this.f, mfy.dG);
            zzx zzxVar = this.q;
            j$.lang.Iterable.-EL.forEach(zzxVar.e(), new defpackage.oxs(this, 4));
            c(zzxVar.e().isEmpty());
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onPostDialWait(android.telecom.Call call, java.lang.String str) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onPostDialWait", 200, "TelecomCallbacksAdapter.java").I("onPostDialWait [callId: %s, remainingPostDialSequence: %s]", this.i.d(call), aais.aD(str));
        ahok ahokVarF = this.e.f(520, "TelecomCallbacksAdapter.onPostDialWait");
        try {
            mni.aK(this.f, mfy.dK);
            zzx zzxVar = this.p;
            j$.lang.Iterable.-EL.forEach(zzxVar.e(), new rh(this, str, 9));
            c(zzxVar.e().isEmpty());
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onRttInitiationFailure(android.telecom.Call call, int i) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onRttInitiationFailure", 335, "TelecomCallbacksAdapter.java").G("onRttInitiationFailure [callId: %s, reason: %s]", this.i.d(call), i);
        ahok ahokVarF = this.e.f(521, "TelecomCallbacksAdapter.onRttInitiationFailure");
        try {
            mfz mfzVar = this.f;
            gus.au(i);
            mfzVar.c();
            zzx zzxVar = this.n;
            j$.lang.Iterable.-EL.forEach(zzxVar.e(), new qss(this, i, 1));
            c(zzxVar.e().isEmpty());
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onRttModeChanged(android.telecom.Call call, int i) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onRttModeChanged", 283, "TelecomCallbacksAdapter.java").G("onRttModeChanged [callId: %s, mode: %s]", this.i.d(call), i);
        ahok ahokVarF = this.e.f(522, "TelecomCallbacksAdapter.onRttModeChanged");
        try {
            mfz mfzVar = this.f;
            gus.au(i);
            mfzVar.c();
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onRttRequest(android.telecom.Call call, int i) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onRttRequest", 325, "TelecomCallbacksAdapter.java").G("onRttRequest [callId: %s, id: %d]", this.i.d(call), i);
        ahok ahokVarF = this.e.f(523, "TelecomCallbacksAdapter.onRttRequest");
        try {
            mni.aK(this.f, mfy.dQ);
            defpackage.pub pubVar = this.g;
            ((defpackage.ptw) pubVar.d).a(new defpackage.pua(i, 0));
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onRttStatusChanged(android.telecom.Call call, boolean z, android.telecom.Call.RttCall rttCall) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onRttStatusChanged", 294, "TelecomCallbacksAdapter.java").J("onRttStatusChanged [callId: %s, enabled: %s]", this.i.d(call), z);
        ahok ahokVarF = this.e.f(524, "TelecomCallbacksAdapter.onRttStatusChanged");
        try {
            mfz mfzVar = this.f;
            gus.ax(z);
            mfzVar.c();
            j$.lang.Iterable.-EL.forEach(this.m.e(), new defpackage.oxs(this, 6));
            if (call.getDetails().getIntentExtras() != null && call.getDetails().getIntentExtras().getBoolean("android.telecom.extra.START_CALL_WITH_RTT") && !z && call.getState() != 4) {
                defpackage.pub pubVar = this.g;
                ((defpackage.ptw) pubVar.e).a(new defpackage.ptm(10));
            }
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onStateChanged(android.telecom.Call call, int i) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onStateChanged", 120, "TelecomCallbacksAdapter.java").G("onStateChanged [callId: %s, state: %s]", this.i.d(call), i);
        ahok ahokVarF = this.e.f(525, "TelecomCallbacksAdapter.onStateChanged");
        try {
            mfz mfzVar = this.f;
            gus.au(i);
            mfzVar.c();
            j$.lang.Iterable.-EL.forEach(this.k.e(), new defpackage.rwh(this, call, i, 1));
            b();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.Call.Callback
    public final void onVideoCallChanged(android.telecom.Call call, android.telecom.InCallService.VideoCall videoCall) {
        c.b().l("com/android/dialer/incall/core/call/TelecomCallbacksAdapter", "onVideoCallChanged", 221, "TelecomCallbacksAdapter.java").y("onVideoCallChanged [callid: %s]", this.i.d(call));
        ahok ahokVarF = this.e.f(526, "TelecomCallbacksAdapter.onVideoCallChanged");
        try {
            d();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
