package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogv {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aogs.class.getName());
    public static final appb b;

    static {
        appb appbVar = appb.a;
        b = aoov.aQ("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(int i, byte b2, short s) throws java.io.IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s), java.lang.Integer.valueOf(i));
    }

    public static int b(appa appaVar) {
        return ((appaVar.d() & 255) << 16) | ((appaVar.d() & 255) << 8) | (appaVar.d() & 255);
    }

    public static java.io.IOException c(java.lang.String str, java.lang.Object... objArr) throws java.io.IOException {
        throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }

    public static java.lang.IllegalArgumentException d(java.lang.String str, java.lang.Object... objArr) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, str, objArr));
    }
}
