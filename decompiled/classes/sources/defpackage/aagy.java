package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aagy implements android.os.Handler.Callback {
    final /* synthetic */ defpackage.aagv a;

    public aagy(defpackage.aagv aagvVar) {
        j$.util.Objects.requireNonNull(aagvVar);
        this.a = aagvVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus gmsClientSupervisorImpl$GmsClientConnectionStatus;
        int i;
        java.util.ArrayList arrayList;
        android.content.ComponentName componentName;
        int i2 = message.what;
        if (i2 == 0) {
            java.util.HashMap map = this.a.b;
            synchronized (map) {
                defpackage.aagu aaguVar = (defpackage.aagu) message.obj;
                com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus gmsClientSupervisorImpl$GmsClientConnectionStatus2 = (com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus) map.get(aaguVar);
                if (gmsClientSupervisorImpl$GmsClientConnectionStatus2 != null && gmsClientSupervisorImpl$GmsClientConnectionStatus2.d()) {
                    if (gmsClientSupervisorImpl$GmsClientConnectionStatus2.d) {
                        defpackage.aagv aagvVar = gmsClientSupervisorImpl$GmsClientConnectionStatus2.h;
                        synchronized (aagvVar.b) {
                            try {
                                aagvVar.d(gmsClientSupervisorImpl$GmsClientConnectionStatus2);
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            defpackage.aagv aagvVar2 = gmsClientSupervisorImpl$GmsClientConnectionStatus2.h;
                            aagvVar2.e.b(aagvVar2.c, gmsClientSupervisorImpl$GmsClientConnectionStatus2);
                            gmsClientSupervisorImpl$GmsClientConnectionStatus2.d = false;
                            gmsClientSupervisorImpl$GmsClientConnectionStatus2.c = 2;
                        } catch (java.lang.Throwable th2) {
                            gmsClientSupervisorImpl$GmsClientConnectionStatus2.d = false;
                            gmsClientSupervisorImpl$GmsClientConnectionStatus2.c = 2;
                            throw th2;
                        }
                    }
                    map.remove(aaguVar);
                }
            }
        } else {
            if (i2 != 1) {
                return false;
            }
            defpackage.aagv aagvVar3 = this.a;
            java.util.HashMap map2 = aagvVar3.b;
            synchronized (map2) {
                defpackage.aagw aagwVar = (defpackage.aagw) message.obj;
                defpackage.aagu aaguVar2 = aagwVar.a;
                gmsClientSupervisorImpl$GmsClientConnectionStatus = (com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus) map2.get(aaguVar2);
                i = -1;
                arrayList = null;
                if (gmsClientSupervisorImpl$GmsClientConnectionStatus != null && gmsClientSupervisorImpl$GmsClientConnectionStatus == aagwVar.b && gmsClientSupervisorImpl$GmsClientConnectionStatus.c == 3) {
                    android.util.Log.e("GmsClientSupervisor", defpackage.hgb.k(aaguVar2, "Timeout waiting for ServiceConnection callback "), new java.lang.Exception());
                    componentName = gmsClientSupervisorImpl$GmsClientConnectionStatus.f;
                    if (componentName == null) {
                        componentName = aaguVar2.c;
                    }
                    if (componentName == null) {
                        java.lang.String str = aaguVar2.b;
                        defpackage.aais.as(str);
                        componentName = new android.content.ComponentName(str, "unknown");
                    }
                    aagvVar3.d(gmsClientSupervisorImpl$GmsClientConnectionStatus);
                    gmsClientSupervisorImpl$GmsClientConnectionStatus.e = null;
                    gmsClientSupervisorImpl$GmsClientConnectionStatus.f = componentName;
                    gmsClientSupervisorImpl$GmsClientConnectionStatus.c = 2;
                    i = gmsClientSupervisorImpl$GmsClientConnectionStatus.b + 1;
                    gmsClientSupervisorImpl$GmsClientConnectionStatus.b = i;
                    java.util.Map map3 = gmsClientSupervisorImpl$GmsClientConnectionStatus.a;
                    arrayList = new java.util.ArrayList(map3.size());
                    for (java.util.Map.Entry entry : map3.entrySet()) {
                        arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry((android.content.ServiceConnection) entry.getKey(), (android.content.ServiceConnection) entry.getValue()));
                    }
                } else {
                    componentName = null;
                    gmsClientSupervisorImpl$GmsClientConnectionStatus = null;
                }
            }
            if (gmsClientSupervisorImpl$GmsClientConnectionStatus != null) {
                gmsClientSupervisorImpl$GmsClientConnectionStatus.b(arrayList, i, componentName);
            }
        }
        return true;
    }
}
