package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yqm {
    public static volatile anpk a;
    public static volatile anpk b;
    public static volatile anpk c;
    public static volatile anpk d;
    public static volatile anpk e;
    public static volatile anpk f;

    private yqm() {
    }

    public static void a(java.nio.ByteBuffer byteBuffer, java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length <= 0 || byteArray[0] != 0) {
            byteBuffer.put(byteArray);
        } else {
            byteBuffer.put(byteArray, 1, length - 1);
        }
    }

    public static void b(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        defpackage.ypd ypdVar = defpackage.ype.a;
        if (ypdVar != null) {
            try {
                java.lang.Object objInvoke = ypdVar.d.invoke(ypdVar.b, null);
                if (objInvoke != null) {
                    ypdVar.e.invoke(objInvoke, 210616);
                    java.lang.reflect.Method method = ypdVar.f;
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i));
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i2));
                    ypdVar.g.invoke(objInvoke, java.lang.Long.valueOf(j));
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i3));
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i4));
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i5));
                    method.invoke(objInvoke, java.lang.Integer.valueOf(i6));
                    ypdVar.h.invoke(objInvoke, null);
                    java.lang.Object objInvoke2 = ypdVar.i.invoke(objInvoke, null);
                    if (objInvoke2 != null) {
                        ypdVar.c.invoke(ypdVar.a, objInvoke2);
                    }
                }
            } catch (java.lang.ReflectiveOperationException e2) {
                android.util.Log.w("StatsLogReflector", "Failed to write stats reflectively. Telemetry is disabled.", e2);
            }
        }
    }

    public static final defpackage.ymj c(defpackage.ynr ynrVar) {
        return new defpackage.ynq(ynrVar.a, ynrVar.c, ynrVar.b);
    }

    public static final aepd d(int i) {
        defpackage.ysk yskVar = (defpackage.ysk) defpackage.ysk.a.get(java.lang.Integer.valueOf(i));
        if (yskVar == null) {
            yskVar = defpackage.ysk.UNKNOWN;
        }
        return new aepg(yskVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final int e(defpackage.yse yseVar) throws aois {
        aooh.f(yseVar, "<this>");
        switch (yseVar.ordinal()) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
                return 11;
            case 3:
                return 5;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return 7;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return 10;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return 8;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return 9;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 12;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return 14;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return 15;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return 16;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return 17;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return 6;
            default:
                throw new aois();
        }
    }

    public static int f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 8) {
            return 9;
        }
        switch (i) {
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return 11;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return 12;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return 13;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return 15;
            default:
                return 0;
        }
    }

    public static final /* synthetic */ xtq g(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }
}
