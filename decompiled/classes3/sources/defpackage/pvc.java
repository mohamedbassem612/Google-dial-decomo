package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvc {
    public final java.lang.String a;
    public final android.hardware.camera2.CameraCharacteristics b;

    public pvc(java.lang.String str, android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.a = str;
        if (cameraCharacteristics == null) {
            throw new java.lang.NullPointerException("Null cameraCharacteristics");
        }
        this.b = cameraCharacteristics;
    }

    public final defpackage.pus a() {
        int iIntValue = ((java.lang.Integer) this.b.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (iIntValue == 0) {
            return defpackage.pus.a;
        }
        if (iIntValue == 90) {
            return defpackage.pus.b;
        }
        if (iIntValue == 180) {
            return defpackage.pus.c;
        }
        if (iIntValue == 270) {
            return defpackage.pus.d;
        }
        defpackage.pus.e.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/CameraOrientation", "of", 35, "CameraOrientation.java").w("unexpected camera orientation degree: %d", iIntValue);
        return defpackage.pus.a;
    }

    public final aify b() {
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) this.b.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return aify.o(streamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class));
        }
        a.bI(defpackage.pvf.a.c().m(aioa.b), "StreamConfigurationMap is null", "com/android/dialer/incall/core/video/impl/CameraController$CameraInfo", "getCameraSizes", (char) 560, "CameraController.java", zct.b);
        return aike.a;
    }

    final java.lang.Integer c() {
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.a));
        } catch (java.lang.NumberFormatException e) {
            defpackage.pvf.a.c().i(zct.b).k(e).l("com/android/dialer/incall/core/video/impl/CameraController$CameraInfo", "numericId", 532, "CameraController.java").y("invalid camera id received: %s", this.a);
            return null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pvc) {
            defpackage.pvc pvcVar = (defpackage.pvc) obj;
            if (this.a.equals(pvcVar.a) && this.b.equals(pvcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CameraInfo{id=" + this.a + ", cameraCharacteristics=" + this.b.toString() + '}';
    }

    public pvc() {
        throw null;
    }
}
