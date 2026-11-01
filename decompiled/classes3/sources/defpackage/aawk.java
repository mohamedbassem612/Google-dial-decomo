package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawk extends defpackage.aaxl {
    private final java.lang.ref.WeakReference a;
    private volatile int b = -1;

    public aawk(defpackage.aawl aawlVar) {
        this.a = new java.lang.ref.WeakReference(aawlVar);
    }

    public static final void q(defpackage.aaxh aaxhVar, boolean z, byte[] bArr) {
        try {
            android.os.Parcel parcelEP = aaxhVar.eP();
            java.lang.ClassLoader classLoader = yld.a;
            parcelEP.writeInt(z ? 1 : 0);
            parcelEP.writeByteArray(bArr);
            aaxhVar.eS(1, parcelEP);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    private final boolean r(java.lang.Runnable runnable, java.lang.String str, java.lang.Object obj) {
        defpackage.aawl aawlVarA = a("postEvent (" + str + ')');
        boolean z = false;
        if (aawlVarA != null) {
            if (android.util.Log.isLoggable("WearableLS", 3)) {
                android.util.Log.d("WearableLS", java.lang.String.format("%s: %s %s", str, aawlVarA.b, obj));
            }
            if (s(aawlVarA)) {
                synchronized (aawlVarA.g) {
                    if (!aawlVarA.h) {
                        aawlVarA.c.post(runnable);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private final boolean s(defpackage.aawl aawlVar) {
        int callingUid = android.os.Binder.getCallingUid();
        if (callingUid == this.b) {
            return true;
        }
        if ((defpackage.aaye.a(aawlVar).b() && aehj.bP(aawlVar, callingUid, "com.google.android.wearable.app.cn")) || aehj.bO(aawlVar, callingUid)) {
            this.b = callingUid;
            return true;
        }
        android.util.Log.e("WearableLS", a.bj(callingUid, "Caller is not GooglePlayServices; caller UID: "));
        return false;
    }

    public final defpackage.aawl a(java.lang.String str) {
        defpackage.aawl aawlVar = (defpackage.aawl) this.a.get();
        if (aawlVar != null || !android.util.Log.isLoggable("WearableLS", 3)) {
            return aawlVar;
        }
        android.util.Log.d("WearableLS", str.concat(": service reference no longer valid"));
        return null;
    }

    @Override // defpackage.aaxm
    public final void b(com.google.android.gms.wearable.internal.ChannelEventParcelable channelEventParcelable) {
        r(new defpackage.aawj(this, channelEventParcelable, 3), "onChannelEvent", channelEventParcelable);
    }

    @Override // defpackage.aaxm
    public final void c(com.google.android.gms.wearable.internal.CapabilityInfoParcelable capabilityInfoParcelable) {
        r(new defpackage.yne(this, 15, (short[]) null), "onConnectedCapabilityChanged", capabilityInfoParcelable);
    }

    @Override // defpackage.aaxm
    public final void d(java.util.List list) {
        r(new defpackage.yne(this, 14, (char[]) null), "onConnectedNodes", list);
    }

    @Override // defpackage.aaxm
    public final void e(com.google.android.gms.common.data.DataHolder dataHolder) {
        try {
            if (r(new defpackage.aawj(this, dataHolder, 0), "onDataItemChanged", java.lang.String.valueOf(dataHolder) + ", rows=" + dataHolder.h)) {
                return;
            }
            dataHolder.e();
        } catch (java.lang.Throwable th) {
            dataHolder.e();
            throw th;
        }
    }

    @Override // defpackage.aaxm
    public final void f(com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        r(new defpackage.yne(this, 17, (boolean[]) null), "onEntityUpdate", amsEntityUpdateParcelable);
    }

    @Override // defpackage.aaxm
    public final void g(com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable) {
        r(new defpackage.aawj(this, messageEventParcelable, 2), "onMessageReceived", messageEventParcelable);
    }

    @Override // defpackage.aaxm
    public final void h(com.google.android.gms.wearable.internal.NodeMigratedEventParcelable nodeMigratedEventParcelable) {
        defpackage.aawj aawjVar = new defpackage.aawj(this, nodeMigratedEventParcelable, 1);
        com.google.android.gms.common.data.DataHolder dataHolder = nodeMigratedEventParcelable.b;
        if (r(aawjVar, "onNodeMigrated", "DataHolder[rows=" + dataHolder.h + ']')) {
            return;
        }
        dataHolder.e();
    }

    @Override // defpackage.aaxm
    public final void i(com.google.android.gms.wearable.internal.AncsNotificationParcelable ancsNotificationParcelable) {
        r(new defpackage.yne(this, 16, (int[]) null), "onNotificationReceived", ancsNotificationParcelable);
    }

    @Override // defpackage.aaxm
    public final void j(com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable) {
        r(new defpackage.yne(this, 12), "onPeerConnected", nodeParcelable);
    }

    @Override // defpackage.aaxm
    public final void k(com.google.android.gms.wearable.internal.NodeParcelable nodeParcelable) {
        r(new defpackage.yne(this, 13, (byte[]) null), "onPeerDisconnected", nodeParcelable);
    }

    @Override // defpackage.aaxm
    public final void o(com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable, defpackage.aaxh aaxhVar) {
        if (r(new defpackage.acxq(this, aaxhVar, messageEventParcelable, 1), "onRequestReceived", messageEventParcelable)) {
            return;
        }
        q(aaxhVar, false, null);
    }

    @Override // defpackage.aaxm
    public final boolean p(defpackage.aaxi aaxiVar) {
        defpackage.aaxm aaxkVar;
        defpackage.aawl aawlVarA = a("onGetService");
        if (aawlVarA == null) {
            return false;
        }
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            android.util.Log.d("WearableLS", java.lang.String.format("onGetService: %s", aawlVarA.b));
        }
        if (!s(aawlVarA)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable wearableListenerServiceInfo = new com.google.android.gms.wearable.internal.WearableListenerServiceInfo(aawlVarA.getPackageName());
            android.os.IBinder iBinder = aawlVarA.d;
            if (iBinder == null) {
                aaxkVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                aaxkVar = iInterfaceQueryLocalInterface instanceof defpackage.aaxm ? (defpackage.aaxm) iInterfaceQueryLocalInterface : new defpackage.aaxk(iBinder);
            }
            android.os.Parcel parcelEP = aaxiVar.eP();
            yld.d(parcelEP, wearableListenerServiceInfo);
            yld.f(parcelEP, aaxkVar);
            aaxiVar.eR(1, parcelEP);
            return true;
        } catch (android.os.RemoteException e) {
            android.util.Log.e("WearableLS", "Failed to respond to onGetService", e);
            return false;
        }
    }

    @Override // defpackage.aaxm
    public final void l() {
    }

    @Override // defpackage.aaxm
    public final void m() {
    }

    @Override // defpackage.aaxm
    public final void n() {
    }
}
