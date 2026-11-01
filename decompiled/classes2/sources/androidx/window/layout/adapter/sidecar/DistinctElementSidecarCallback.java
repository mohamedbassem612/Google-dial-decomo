package androidx.window.layout.adapter.sidecar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class DistinctElementSidecarCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
    private androidx.window.sidecar.SidecarDeviceState b;
    private final androidx.window.sidecar.SidecarInterface.SidecarCallback d;
    private final java.lang.Object a = new java.lang.Object();
    private final java.util.Map c = new java.util.WeakHashMap();

    public DistinctElementSidecarCallback(androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback) {
        int i = defpackage.gqu.a;
        this.d = sidecarCallback;
    }

    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.a) {
                androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2 = this.b;
                if (aooh.n(sidecarDeviceState2, sidecarDeviceState) || (sidecarDeviceState2 != null && defpackage.fsu.x(sidecarDeviceState2) == defpackage.fsu.x(sidecarDeviceState))) {
                    return;
                }
                this.b = sidecarDeviceState;
                this.d.onDeviceStateChanged(sidecarDeviceState);
            }
        }
    }

    public void onWindowLayoutChanged(android.os.IBinder iBinder, androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.a) {
            java.util.Map map = this.c;
            androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (androidx.window.sidecar.SidecarWindowLayoutInfo) map.get(iBinder);
            if (!aooh.n(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                    java.util.List listY = defpackage.fsu.y(sidecarWindowLayoutInfo2);
                    java.util.List listY2 = defpackage.fsu.y(sidecarWindowLayoutInfo);
                    if (listY != listY2) {
                        if (listY != null && listY2 != null && listY.size() == listY2.size()) {
                            int size = listY.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) listY.get(i);
                                    androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2 = (androidx.window.sidecar.SidecarDisplayFeature) listY2.get(i);
                                    if (!aooh.n(sidecarDisplayFeature, sidecarDisplayFeature2) && (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType() || !aooh.n(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(androidx.window.sidecar.SidecarInterface.SidecarCallback sidecarCallback, byte[] bArr) {
        this.d = sidecarCallback;
    }
}
