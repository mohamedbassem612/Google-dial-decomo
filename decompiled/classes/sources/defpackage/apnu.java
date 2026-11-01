package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnu implements defpackage.apnw {
    public static final defpackage.apnt a = new defpackage.apnt();
    private final java.lang.Class b;
    private final java.lang.reflect.Method c;
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;

    public apnu(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        defpackage.aooh.f(cls, "sslSocketClass");
        this.b = cls;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        defpackage.aooh.e(declaredMethod, "getDeclaredMethod(...)");
        this.c = declaredMethod;
        cls.getMethod("setHostname", java.lang.String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.apnw
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new java.lang.String(bArr, defpackage.aoqv.a);
            }
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if ((cause instanceof java.lang.NullPointerException) && defpackage.aooh.n(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // defpackage.apnw
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list, defpackage.appb appbVar) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        defpackage.aooh.f(list, "protocols");
        if (d(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, java.lang.Boolean.TRUE);
                java.lang.reflect.Method method = this.e;
                defpackage.apnn apnnVar = defpackage.apnn.b;
                defpackage.aooh.f(list, "protocols");
                defpackage.apoy apoyVar = new defpackage.apoy();
                for (java.lang.String str2 : defpackage.aoov.aY(list)) {
                    apoyVar.N(str2.length());
                    apoyVar.ab(str2);
                }
                method.invoke(sSLSocket, apoyVar.D());
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.AssertionError(e2);
            }
        }
    }

    @Override // defpackage.apnw
    public final boolean c() {
        int i = apnm.a;
        return false;
    }

    @Override // defpackage.apnw
    public final boolean d(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        return this.b.isInstance(sSLSocket);
    }

    @Override // defpackage.apnw
    public final /* synthetic */ void e() {
    }
}
