package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqy {
    public final androidx.window.sidecar.SidecarInterface a;
    public final defpackage.gqu b;
    public final java.util.Map c;
    public final java.util.Map d;
    public defpackage.gqw e;

    public gqy(android.content.Context context) {
        aooh.f(context, "context");
        aooh.f(context, "context");
        androidx.window.sidecar.SidecarInterface sidecarImpl = androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext());
        defpackage.gqu gquVar = new defpackage.gqu(null);
        this.a = sidecarImpl;
        this.b = gquVar;
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
    }

    public final defpackage.gqd a(android.app.Activity activity) {
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
        android.os.IBinder iBinderV = defpackage.fsu.v(activity);
        if (iBinderV == null) {
            return new defpackage.gqd(aokc.a);
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.a;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderV) : null;
        defpackage.gqu gquVar = this.b;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return gquVar.a(windowLayoutInfo, sidecarDeviceState);
    }

    public final void b(android.os.IBinder iBinder, final android.app.Activity activity) {
        java.util.Map map = this.c;
        map.put(iBinder, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        defpackage.gqw gqwVar = this.e;
        if (gqwVar != null) {
            gqwVar.a(activity, a(activity));
        }
        java.util.Map map2 = this.d;
        if (map2.get(activity) == null && (activity instanceof dvz)) {
            dxw dxwVar = new dxw() { // from class: gqv
                public final void accept(java.lang.Object obj) {
                    defpackage.gqy gqyVar = this.a;
                    defpackage.gqw gqwVar2 = gqyVar.e;
                    if (gqwVar2 != null) {
                        android.app.Activity activity2 = activity;
                        gqwVar2.a(activity2, gqyVar.a(activity2));
                    }
                }
            };
            map2.put(activity, dxwVar);
            ((dvz) activity).e(dxwVar);
        }
    }
}
