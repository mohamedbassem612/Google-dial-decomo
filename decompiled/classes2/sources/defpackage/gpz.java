package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpz {
    static final /* synthetic */ defpackage.gpz a = new defpackage.gpz();
    public static final /* synthetic */ int b = 0;
    private static final aoir c;

    static {
        aopu[] aopuVarArr = aoou.a;
        new aooa(defpackage.gqa.class).c();
        c = aooc.ag(new defpackage.eli(6));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    public final defpackage.gqa a(android.content.Context context) {
        java.lang.reflect.Method method;
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        aooh.f(context, "context");
        defpackage.gqo gqoVar = (defpackage.gqo) c.a();
        if (gqoVar == null) {
            defpackage.grb grbVar = defpackage.grb.a;
            aooh.f(context, "context");
            if (defpackage.grb.a == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = defpackage.grb.b;
                reentrantLock.lock();
                try {
                    if (defpackage.grb.a == null) {
                        aooh.f(context, "context");
                        defpackage.gqy gqyVar = null;
                        try {
                            defpackage.gni gniVarW = defpackage.fsu.w();
                            if (gniVarW != null && gniVarW.compareTo(defpackage.gni.a) >= 0) {
                                defpackage.gqy gqyVar2 = new defpackage.gqy(context);
                                androidx.window.sidecar.SidecarInterface sidecarInterface = gqyVar2.a;
                                java.lang.reflect.Method method2 = (sidecarInterface == null || (cls3 = sidecarInterface.getClass()) == null) ? null : cls3.getMethod("setSidecarCallback", androidx.window.sidecar.SidecarInterface.SidecarCallback.class);
                                java.lang.Class<?> returnType = method2 != null ? method2.getReturnType() : null;
                                if (!aooh.n(returnType, java.lang.Void.TYPE)) {
                                    throw new java.lang.NoSuchMethodException(a.bh(returnType, "Illegal return type for 'setSidecarCallback': "));
                                }
                                if (sidecarInterface != null) {
                                    sidecarInterface.getDeviceState();
                                    sidecarInterface.onDeviceStateListenersChanged(true);
                                    java.lang.Class<?> cls4 = sidecarInterface.getClass();
                                    if (cls4 != null) {
                                        method = cls4.getMethod("getWindowLayoutInfo", android.os.IBinder.class);
                                    } else {
                                        method = null;
                                    }
                                } else {
                                    method = null;
                                }
                                java.lang.Class<?> returnType2 = method != null ? method.getReturnType() : null;
                                if (!aooh.n(returnType2, androidx.window.sidecar.SidecarWindowLayoutInfo.class)) {
                                    throw new java.lang.NoSuchMethodException(a.bh(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
                                }
                                java.lang.reflect.Method method3 = (sidecarInterface == null || (cls2 = sidecarInterface.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", android.os.IBinder.class);
                                java.lang.Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                if (!aooh.n(returnType3, java.lang.Void.TYPE)) {
                                    throw new java.lang.NoSuchMethodException(a.bh(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
                                }
                                java.lang.reflect.Method method4 = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", android.os.IBinder.class);
                                java.lang.Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                if (!aooh.n(returnType4, java.lang.Void.TYPE)) {
                                    throw new java.lang.NoSuchMethodException(a.bh(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
                                }
                                androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
                                try {
                                    sidecarDeviceState.posture = 3;
                                } catch (java.lang.NoSuchFieldError unused) {
                                    androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, 3);
                                    java.lang.Object objInvoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                    aooh.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                                    if (((java.lang.Integer) objInvoke).intValue() != 3) {
                                        throw new java.lang.Exception("Invalid device posture getter/setter");
                                    }
                                }
                                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = new androidx.window.sidecar.SidecarDisplayFeature();
                                android.graphics.Rect rect = sidecarDisplayFeature.getRect();
                                aooh.e(rect, "getRect(...)");
                                sidecarDisplayFeature.setRect(rect);
                                sidecarDisplayFeature.getType();
                                sidecarDisplayFeature.setType(1);
                                androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new androidx.window.sidecar.SidecarWindowLayoutInfo();
                                try {
                                    java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
                                } catch (java.lang.NoSuchFieldError unused2) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(sidecarDisplayFeature);
                                    androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                    java.lang.Object objInvoke2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                    aooh.d(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                    if (!aooh.n(arrayList, (java.util.List) objInvoke2)) {
                                        throw new java.lang.Exception("Invalid display feature getter/setter");
                                    }
                                }
                                gqyVar = gqyVar2;
                            }
                        } catch (java.lang.Throwable unused3) {
                        }
                        defpackage.grb.a = new defpackage.grb(gqyVar);
                    }
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            gqoVar = defpackage.grb.a;
            aooh.c(gqoVar);
        }
        int i = defpackage.gqj.a;
        aooh.f(context, "context");
        if (defpackage.gqi.a == null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = defpackage.gqi.b;
            reentrantLock2.lock();
            try {
                if (defpackage.gqi.a == null) {
                    aooh.f(context, "context");
                    java.lang.Object systemService = context.getApplicationContext().getSystemService("input");
                    aooh.d(systemService, "null cannot be cast to non-null type android.hardware.input.InputManager");
                    defpackage.heq heqVar = new defpackage.heq((android.hardware.input.InputManager) systemService);
                    aooh.f(gqg.a.b(), "windowMetricsCalculator");
                    new defpackage.gqn(heqVar);
                    defpackage.gqi.a = new defpackage.gqk();
                }
                reentrantLock2.unlock();
            } catch (java.lang.Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        defpackage.gqj gqjVar = defpackage.gqi.a;
        aooh.c(gqjVar);
        new gqh();
        new gms();
        return new defpackage.gqb(gqoVar, gqjVar);
    }
}
