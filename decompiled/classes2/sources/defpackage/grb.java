package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class grb implements defpackage.gqo {
    public static volatile defpackage.grb a;
    public static final java.util.concurrent.locks.ReentrantLock b = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();
    private final defpackage.gqy d;

    public grb(final defpackage.gqy gqyVar) {
        this.d = gqyVar;
        if (gqyVar != null) {
            gqyVar.e = new defpackage.gqw(new defpackage.gqz(this));
            androidx.window.sidecar.SidecarInterface sidecarInterface = gqyVar.a;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback(new androidx.window.sidecar.SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
                        androidx.window.sidecar.SidecarInterface sidecarInterface2;
                        aooh.f(sidecarDeviceState, "newDeviceState");
                        defpackage.gqy gqyVar2 = gqyVar;
                        for (android.app.Activity activity : gqyVar2.c.values()) {
                            android.os.IBinder iBinderV = defpackage.fsu.v(activity);
                            androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderV != null && (sidecarInterface2 = gqyVar2.a) != null) {
                                windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinderV);
                            }
                            defpackage.gqw gqwVar = gqyVar2.e;
                            if (gqwVar != null) {
                                gqwVar.a(activity, gqyVar2.b.a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
                        aooh.f(iBinder, "windowToken");
                        aooh.f(sidecarWindowLayoutInfo, "newLayout");
                        defpackage.gqy gqyVar2 = gqyVar;
                        android.app.Activity activity = (android.app.Activity) gqyVar2.c.get(iBinder);
                        if (activity == null) {
                            android.util.Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        defpackage.gqu gquVar = gqyVar2.b;
                        androidx.window.sidecar.SidecarInterface sidecarInterface2 = gqyVar2.a;
                        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                            sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
                        }
                        defpackage.gqd gqdVarA = gquVar.a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        defpackage.gqw gqwVar = gqyVar2.e;
                        if (gqwVar != null) {
                            gqwVar.a(activity, gqdVarA);
                        }
                    }
                }, null));
            }
        }
    }

    @Override // defpackage.gqo
    public final void a(dxw dxwVar) {
        synchronized (b) {
            defpackage.gqy gqyVar = this.d;
            if (gqyVar != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                aooh.e(it, "iterator(...)");
                while (it.hasNext()) {
                    defpackage.hiv hivVar = (defpackage.hiv) it.next();
                    if (hivVar.a == dxwVar) {
                        aooh.c(hivVar);
                        arrayList.add(hivVar);
                    }
                }
                copyOnWriteArrayList.removeAll(arrayList);
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    java.lang.Object obj = ((defpackage.hiv) it2.next()).b;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        java.util.Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (aooh.n(((defpackage.hiv) it3.next()).b, obj)) {
                                }
                            }
                        }
                    }
                    android.os.IBinder iBinderV = defpackage.fsu.v((android.app.Activity) obj);
                    if (iBinderV == null) {
                        continue;
                    } else {
                        androidx.window.sidecar.SidecarInterface sidecarInterface = gqyVar.a;
                        if (sidecarInterface != null) {
                            sidecarInterface.onWindowLayoutChangeListenerRemoved(iBinderV);
                        }
                        java.util.Map map = gqyVar.d;
                        dxw dxwVar2 = (dxw) map.get(obj);
                        if (dxwVar2 != null) {
                            if (obj instanceof dvz) {
                                ((dvz) obj).fg(dxwVar2);
                            }
                            map.remove(obj);
                        }
                        defpackage.gqw gqwVar = gqyVar.e;
                        if (gqwVar != null) {
                            java.util.concurrent.locks.ReentrantLock reentrantLock = gqwVar.a;
                            reentrantLock.lock();
                            try {
                                gqwVar.b.put(obj, null);
                                reentrantLock.unlock();
                            } catch (java.lang.Throwable th) {
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                        java.util.Map map2 = gqyVar.c;
                        int size = map2.size();
                        map2.remove(iBinderV);
                        if (size == 1 && sidecarInterface != null) {
                            sidecarInterface.onDeviceStateListenersChanged(true);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.gqo
    public final void b(android.content.Context context, dxw dxwVar) {
        java.lang.Object next;
        aooh.f(context, "context");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            dxwVar.accept(new defpackage.gqd(aokc.a));
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            defpackage.gqy gqyVar = this.d;
            if (gqyVar == null) {
                dxwVar.accept(new defpackage.gqd(aokc.a));
            } else {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                boolean z = false;
                if (!copyOnWriteArrayList.isEmpty()) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (aooh.n(((defpackage.hiv) it.next()).b, activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                defpackage.hiv hivVar = new defpackage.hiv(activity, dxwVar);
                copyOnWriteArrayList.add(hivVar);
                if (z) {
                    java.util.Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!aooh.n(activity, ((defpackage.hiv) next).b));
                    defpackage.hiv hivVar2 = (defpackage.hiv) next;
                    java.lang.Object obj = hivVar2 != null ? hivVar2.c : null;
                    if (obj != null) {
                        hivVar.c((defpackage.gqd) obj);
                    }
                } else {
                    android.os.IBinder iBinderV = defpackage.fsu.v(activity);
                    if (iBinderV != null) {
                        gqyVar.b(iBinderV, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new defpackage.gqx(gqyVar, activity));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
