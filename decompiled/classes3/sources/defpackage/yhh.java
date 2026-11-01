package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yhh implements java.lang.Cloneable {
    final float a;
    final int b;

    public yhh(float f) {
        this.b = 1;
        this.a = f;
    }

    public final float a(defpackage.yjh yjhVar) {
        if (this.b != 9) {
            return c(yjhVar);
        }
        defpackage.ygv ygvVarB = yjhVar.b();
        if (ygvVarB == null) {
            return this.a;
        }
        float f = ygvVarB.c;
        float f2 = ygvVarB.d;
        float f3 = this.a;
        return (f == f2 ? f3 * f : f3 * ((float) (java.lang.Math.sqrt((f * f) + (f2 * f2)) / 1.414213562373095d))) / 100.0f;
    }

    public final float b(defpackage.yjh yjhVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : c(yjhVar);
    }

    public final float c(defpackage.yjh yjhVar) {
        float f;
        float fA;
        float f2;
        float f3;
        switch (this.b - 1) {
            case 1:
                f = this.a;
                fA = yjhVar.a();
                return f * fA;
            case 2:
                f = this.a;
                fA = yjhVar.d.d.getTextSize() / 2.0f;
                return f * fA;
            case 3:
                return this.a * 96.0f;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                f2 = 2.54f;
                f3 = this.a * 96.0f;
                return f3 / f2;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                f2 = 25.4f;
                f3 = this.a * 96.0f;
                return f3 / f2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                f2 = 72.0f;
                f3 = this.a * 96.0f;
                return f3 / f2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                f2 = 6.0f;
                f3 = this.a * 96.0f;
                return f3 / f2;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.ygv ygvVarB = yjhVar.b();
                if (ygvVarB != null) {
                    f3 = this.a * ygvVarB.c;
                    f2 = 100.0f;
                    return f3 / f2;
                }
            default:
                return this.a;
        }
    }

    public final float d(defpackage.yjh yjhVar) {
        if (this.b != 9) {
            return c(yjhVar);
        }
        defpackage.ygv ygvVarB = yjhVar.b();
        float f = this.a;
        return ygvVarB != null ? (f * ygvVarB.d) / 100.0f : f;
    }

    public final boolean e() {
        return this.a < 0.0f;
    }

    public final boolean f() {
        return this.a == 0.0f;
    }

    public final float g() {
        float f;
        int i = this.b - 1;
        if (i == 3) {
            return this.a * 96.0f;
        }
        if (i == 4) {
            f = 2.54f;
        } else if (i == 5) {
            f = 25.4f;
        } else if (i == 6) {
            f = 72.0f;
        } else {
            if (i != 7) {
                return this.a;
            }
            f = 6.0f;
        }
        return (this.a * 96.0f) / f;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        switch (i) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "in";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "cm";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "mm";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "pt";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "pc";
                break;
            default:
                str = "percent";
                break;
        }
        return java.lang.String.valueOf(strValueOf).concat(str);
    }

    public yhh(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
