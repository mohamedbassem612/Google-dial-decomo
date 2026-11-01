package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzt {
    public static final defpackage.zzt a = c(1, java.lang.Double.valueOf(0.0d));
    public static final defpackage.zzt b = c(3, null);
    public static final defpackage.zzt c = c(4, null);
    public static final defpackage.zzt d = c(5, null);
    public static final defpackage.zzt e = c(2, java.lang.Double.valueOf(1.0d));
    public final double f;
    private final int g;

    public zzt(int i, double d2) {
        this.g = i;
        this.f = d2;
    }

    public static defpackage.zzt a(boolean z, double d2) {
        return c(true == z ? 2 : 1, java.lang.Double.valueOf(d2));
    }

    static defpackage.zzt c(int i, java.lang.Double d2) {
        if (d2 == null) {
            d2 = java.lang.Double.valueOf(0.0d);
        }
        return new defpackage.zzt(i, d2.doubleValue());
    }

    public final boolean b() {
        return this.g != 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zzt) {
            defpackage.zzt zztVar = (defpackage.zzt) obj;
            if (this.g == zztVar.g) {
                if (java.lang.Double.doubleToLongBits(this.f) == java.lang.Double.doubleToLongBits(zztVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.f;
        return ((this.g ^ 1000003) * 1000003) ^ ((int) ((java.lang.Double.doubleToLongBits(d2) >>> 32) ^ java.lang.Double.doubleToLongBits(d2)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.g;
        if (i == 1) {
            str = "NO_UPLOAD";
        } else if (i == 2) {
            str = "UPLOAD";
        } else if (i != 3) {
            str = i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT";
        } else {
            str = "ALWAYS_UPLOAD_DUE_TO_ERROR";
        }
        return "LogSamplerResult{samplingDecision=" + str + ", overallEffectiveSamplingRate=" + this.f + '}';
    }

    public zzt() {
        throw null;
    }
}
