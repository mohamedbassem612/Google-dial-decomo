package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class GmsClientSupervisorImpl$GmsClientConnectionStatus implements android.content.ServiceConnection, defpackage.aagz {
    public final java.util.Map a;
    public int b;
    public int c;
    public boolean d;
    public android.os.IBinder e;
    public android.content.ComponentName f;
    public defpackage.aagw g;
    public final /* synthetic */ defpackage.aagv h;
    private final defpackage.aagu i;

    public GmsClientSupervisorImpl$GmsClientConnectionStatus(defpackage.aagv aagvVar, defpackage.aagu aaguVar) {
        j$.util.Objects.requireNonNull(aagvVar);
        this.h = aagvVar;
        this.b = 0;
        this.i = aaguVar;
        this.a = new java.util.HashMap();
        this.c = 2;
    }

    public final com.google.android.gms.common.ConnectionResult a(java.lang.String str, java.util.concurrent.Executor executor) {
        android.content.Intent component;
        android.os.Bundle bundleCall;
        com.google.android.gms.common.ConnectionResult connectionResult;
        try {
            android.content.Context context = this.h.c;
            defpackage.aagu aaguVar = this.i;
            android.net.Uri uri = defpackage.aahp.a;
            java.lang.String str2 = aaguVar.a;
            if (str2 == null) {
                component = new android.content.Intent().setComponent(aaguVar.c);
            } else {
                android.content.Intent intent = null;
                if (aaguVar.e) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("serviceActionBundleKey", str2);
                    try {
                        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(defpackage.aahp.a);
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
                        }
                        try {
                            bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (bundleCall != null) {
                                android.content.Intent intent2 = (android.content.Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                                if (intent2 != null) {
                                    intent = intent2;
                                } else {
                                    android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                    if (pendingIntent != null) {
                                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                        throw new defpackage.aahn(new com.google.android.gms.common.ConnectionResult(1, 25, pendingIntent, null, null, null));
                                    }
                                }
                            }
                            if (intent == null) {
                                android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                            }
                        } catch (java.lang.Throwable th) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            throw th;
                        }
                    } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                        bundleCall = null;
                    }
                }
                component = intent;
                if (component == null) {
                    component = new android.content.Intent(str2).setPackage(aaguVar.b);
                }
            }
            android.content.Intent intent3 = component;
            this.c = 3;
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            if (defpackage.a.n()) {
                android.os.StrictMode.setVmPolicy(defpackage.aais.c(new android.os.StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                defpackage.aagv aagvVar = this.h;
                defpackage.aaik aaikVar = aagvVar.e;
                android.content.Context context2 = aagvVar.c;
                defpackage.aagu aaguVar2 = this.i;
                boolean zD = aaikVar.d(context2, str, intent3, this, 4225, executor);
                this.d = zD;
                if (zD) {
                    this.g = new defpackage.aagw(aaguVar2, this);
                    aagvVar.d.sendMessageDelayed(aagvVar.d.obtainMessage(1, this.g), aagvVar.f);
                    connectionResult = com.google.android.gms.common.ConnectionResult.a;
                } else {
                    this.c = 2;
                    try {
                        aaikVar.b(context2, this);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    connectionResult = new com.google.android.gms.common.ConnectionResult(1, 16, null, null, null, null);
                }
                return connectionResult;
            } finally {
                android.os.StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (defpackage.aahn e2) {
            return e2.a;
        }
    }

    public final void b(java.util.List list, int i, android.content.ComponentName componentName) {
        java.lang.Object obj;
        java.lang.Object value;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            synchronized (this.h.b) {
                if (this.b != i) {
                    return;
                }
                obj = this.a.get(entry.getKey());
                value = entry.getValue();
            }
            if (obj == value) {
                ((android.content.ServiceConnection) entry.getValue()).onServiceDisconnected(componentName);
            }
        }
    }

    public final boolean c(android.content.ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, new defpackage.aagx(serviceConnection2));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        int i;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object value;
        defpackage.aagv aagvVar = this.h;
        synchronized (aagvVar.b) {
            aagvVar.d(this);
            this.e = iBinder;
            this.f = componentName;
            this.c = 1;
            i = this.b + 1;
            this.b = i;
            java.util.Map map = this.a;
            arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry((android.content.ServiceConnection) entry.getKey(), (android.content.ServiceConnection) entry.getValue()));
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) arrayList.get(i2);
            synchronized (this.h.b) {
                if (this.b != i) {
                    return;
                }
                obj = this.a.get(entry2.getKey());
                value = entry2.getValue();
            }
            if (obj == value) {
                ((android.content.ServiceConnection) entry2.getValue()).onServiceConnected(componentName, iBinder);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        int i;
        java.util.ArrayList arrayList;
        defpackage.aagv aagvVar = this.h;
        synchronized (aagvVar.b) {
            aagvVar.d(this);
            this.e = null;
            this.f = componentName;
            this.c = 2;
            i = this.b + 1;
            this.b = i;
            java.util.Map map = this.a;
            arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry((android.content.ServiceConnection) entry.getKey(), (android.content.ServiceConnection) entry.getValue()));
            }
        }
        b(arrayList, i, componentName);
    }
}
