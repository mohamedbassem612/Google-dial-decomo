package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqu {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String b = "gqu";
    private final gnh c;

    public /* synthetic */ gqu(byte[] bArr) {
        this.c = gnh.c;
    }

    public final defpackage.gqd a(androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo, androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
        defpackage.gpx gpxVar;
        defpackage.gpw gpwVar;
        aooh.f(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new defpackage.gqd(aokc.a);
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState2 = new androidx.window.sidecar.SidecarDeviceState();
        int iX = defpackage.fsu.x(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iX;
            } catch (java.lang.NoSuchFieldError unused) {
                androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState2, java.lang.Integer.valueOf(iX));
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
        }
        java.util.List<androidx.window.sidecar.SidecarDisplayFeature> listY = defpackage.fsu.y(sidecarWindowLayoutInfo);
        aooh.f(listY, "sidecarDisplayFeatures");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature : listY) {
            aooh.f(sidecarDisplayFeature, "feature");
            java.lang.String str = b;
            aooh.e(str, "TAG");
            androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2 = (androidx.window.sidecar.SidecarDisplayFeature) gus.R(sidecarDisplayFeature, str, this.c, gmu.a).a("Type must be either TYPE_FOLD or TYPE_HINGE", new defpackage.fvt(17)).a("Feature bounds must not be 0", new defpackage.fvt(18)).a("TYPE_FOLD must have 0 area", new defpackage.fvt(19)).a("Feature be pinned to either left or top", new defpackage.fvt(20)).b();
            defpackage.gpy gpyVar = null;
            if (sidecarDisplayFeature2 != null) {
                int type = sidecarDisplayFeature2.getType();
                if (type == 1) {
                    gpxVar = defpackage.gpx.a;
                } else if (type == 2) {
                    gpxVar = defpackage.gpx.b;
                }
                int iX2 = defpackage.fsu.x(sidecarDeviceState2);
                if (iX2 == 2) {
                    gpwVar = defpackage.gpw.b;
                } else if (iX2 == 3) {
                    gpwVar = defpackage.gpw.a;
                }
                android.graphics.Rect rect = sidecarDisplayFeature.getRect();
                aooh.e(rect, "getRect(...)");
                gpyVar = new defpackage.gpy(new gmv(rect), gpxVar, gpwVar);
            }
            if (gpyVar != null) {
                arrayList.add(gpyVar);
            }
        }
        return new defpackage.gqd(arrayList);
    }

    public gqu() {
        throw null;
    }
}
