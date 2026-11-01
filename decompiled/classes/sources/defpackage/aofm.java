package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aofm extends defpackage.aofn {
    private static final defpackage.aogc d = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setUseSessionTickets", (java.lang.Object) new java.lang.Class[]{java.lang.Boolean.TYPE}, (byte[]) null);
    private static final defpackage.aogc e = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setHostname", (java.lang.Object) new java.lang.Class[]{java.lang.String.class}, (byte[]) null);
    private static final defpackage.aogc f = new defpackage.aogc((java.lang.Object) byte[].class, (java.lang.Object) "getAlpnSelectedProtocol", (java.lang.Object) new java.lang.Class[0], (byte[]) null);
    private static final defpackage.aogc g = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setAlpnProtocols", (java.lang.Object) new java.lang.Class[]{byte[].class}, (byte[]) null);
    private static final defpackage.aogc h = new defpackage.aogc((java.lang.Object) byte[].class, (java.lang.Object) "getNpnSelectedProtocol", (java.lang.Object) new java.lang.Class[0], (byte[]) null);
    private static final defpackage.aogc i = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setNpnProtocols", (java.lang.Object) new java.lang.Class[]{byte[].class}, (byte[]) null);
    private static final java.lang.reflect.Method j;
    private static final java.lang.reflect.Method k;
    private static final java.lang.reflect.Method l;
    private static final java.lang.reflect.Method m;
    private static final java.lang.reflect.Method n;
    private static final java.lang.reflect.Method o;
    private static final java.lang.reflect.Constructor p;

    static {
        java.lang.NoSuchMethodException noSuchMethodException;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.ClassNotFoundException classNotFoundException;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6;
        java.lang.reflect.Method method7;
        java.lang.reflect.Method method8;
        java.lang.reflect.Method method9;
        java.lang.reflect.Constructor<?> constructor = null;
        try {
            try {
                method2 = javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class);
                try {
                    method5 = javax.net.ssl.SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        method7 = javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null);
                        try {
                            java.lang.Class<?> cls = java.lang.Class.forName("android.net.ssl.SSLSockets");
                            method8 = cls.getMethod("isSupportedSocket", javax.net.ssl.SSLSocket.class);
                            try {
                                method6 = cls.getMethod("setUseSessionTickets", javax.net.ssl.SSLSocket.class, java.lang.Boolean.TYPE);
                            } catch (java.lang.ClassNotFoundException e2) {
                                classNotFoundException = e2;
                                method = method5;
                                method3 = method7;
                                method4 = method8;
                                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) classNotFoundException);
                                method5 = method;
                                method6 = null;
                                method7 = method3;
                                method8 = method4;
                            } catch (java.lang.NoSuchMethodException e3) {
                                noSuchMethodException = e3;
                                method = method5;
                                method3 = method7;
                                method4 = method8;
                                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) noSuchMethodException);
                                method5 = method;
                                method6 = null;
                                method7 = method3;
                                method8 = method4;
                            }
                        } catch (java.lang.ClassNotFoundException e4) {
                            classNotFoundException = e4;
                            method4 = null;
                            method = method5;
                            method3 = method7;
                        } catch (java.lang.NoSuchMethodException e5) {
                            noSuchMethodException = e5;
                            method4 = null;
                            method = method5;
                            method3 = method7;
                        }
                    } catch (java.lang.ClassNotFoundException e6) {
                        classNotFoundException = e6;
                        method3 = null;
                        method4 = null;
                        method = method5;
                    } catch (java.lang.NoSuchMethodException e7) {
                        noSuchMethodException = e7;
                        method3 = null;
                        method4 = null;
                        method = method5;
                    }
                } catch (java.lang.ClassNotFoundException e8) {
                    classNotFoundException = e8;
                    method = null;
                    method3 = null;
                    method4 = method3;
                    defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) classNotFoundException);
                    method5 = method;
                    method6 = null;
                    method7 = method3;
                    method8 = method4;
                    l = method2;
                    m = method5;
                    n = method7;
                    j = method8;
                    k = method6;
                    method9 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                    constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                    o = method9;
                    p = constructor;
                } catch (java.lang.NoSuchMethodException e9) {
                    noSuchMethodException = e9;
                    method = null;
                    method3 = null;
                    method4 = method3;
                    defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (java.lang.Throwable) noSuchMethodException);
                    method5 = method;
                    method6 = null;
                    method7 = method3;
                    method8 = method4;
                    l = method2;
                    m = method5;
                    n = method7;
                    j = method8;
                    k = method6;
                    method9 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
                    constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
                    o = method9;
                    p = constructor;
                }
            } catch (java.lang.ClassNotFoundException e10) {
                classNotFoundException = e10;
                method = null;
                method2 = null;
                method3 = null;
            } catch (java.lang.NoSuchMethodException e11) {
                noSuchMethodException = e11;
                method = null;
                method2 = null;
                method3 = null;
            }
            method9 = javax.net.ssl.SSLParameters.class.getMethod("setServerNames", java.util.List.class);
            try {
                constructor = java.lang.Class.forName("javax.net.ssl.SNIHostName").getConstructor(java.lang.String.class);
            } catch (java.lang.ClassNotFoundException e12) {
                e = e12;
                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) e);
            } catch (java.lang.NoSuchMethodException e13) {
                e = e13;
                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) e);
            }
        } catch (java.lang.ClassNotFoundException e14) {
            e = e14;
            method9 = null;
        } catch (java.lang.NoSuchMethodException e15) {
            e = e15;
            method9 = null;
        }
        l = method2;
        m = method5;
        n = method7;
        j = method8;
        k = method6;
        o = method9;
        p = constructor;
    }

    @Override // defpackage.aofn
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.reflect.Method method = n;
        if (method != null) {
            try {
                return (java.lang.String) method.invoke(sSLSocket, null);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.RuntimeException(e2);
            } catch (java.lang.reflect.InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof java.lang.UnsupportedOperationException)) {
                    throw new java.lang.RuntimeException(e3);
                }
                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new java.lang.Object[0]);
                if (bArr != null) {
                    return new java.lang.String(bArr, aogk.b);
                }
            } catch (java.lang.Exception e4) {
                defpackage.aofn.a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (java.lang.Throwable) e4);
            }
        }
        if (this.c.c() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) h.a(sSLSocket, new java.lang.Object[0]);
            if (bArr2 != null) {
                return new java.lang.String(bArr2, aogk.b);
            }
            return null;
        } catch (java.lang.Exception e5) {
            defpackage.aofn.a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (java.lang.Throwable) e5);
            return null;
        }
    }

    @Override // defpackage.aofn
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.lang.String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e A[Catch: InstantiationException -> 0x01e7, InvocationTargetException -> 0x01ee, IllegalAccessException -> 0x01f5, TryCatch #1 {InvocationTargetException -> 0x01ee, blocks: (B:8:0x0030, B:10:0x0038, B:14:0x004c, B:15:0x0051, B:17:0x0056, B:19:0x0066, B:21:0x007f, B:23:0x0083, B:25:0x0087, B:27:0x0091, B:29:0x0097, B:31:0x009f, B:55:0x011d, B:57:0x0123, B:69:0x0149, B:71:0x015a, B:58:0x0128, B:62:0x0131, B:68:0x0144, B:33:0x00ad, B:37:0x00b8, B:42:0x00ce, B:44:0x00df, B:54:0x0114, B:45:0x00e6, B:49:0x00ef, B:50:0x00f6, B:52:0x00fc, B:53:0x010c, B:72:0x016e, B:20:0x0074, B:73:0x0177, B:83:0x01a2, B:85:0x01a7, B:87:0x01ab, B:78:0x018a, B:80:0x0192, B:81:0x01a0), top: B:108:0x0030 }] */
    @Override // defpackage.aofn
    protected final void c(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.lang.reflect.Constructor constructor;
        java.lang.String[] strArr;
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.lang.Integer numX;
        boolean z;
        java.lang.reflect.Method method;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aogi) it.next()).e);
        }
        java.lang.String[] strArr2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            defpackage.ahvr.bR(defpackage.anxo.f(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            java.lang.reflect.Method method2 = j;
                            if (method2 == null || !((java.lang.Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                d.c(sSLSocket, java.lang.Boolean.TRUE);
                            } else {
                                k.invoke(null, sSLSocket, java.lang.Boolean.TRUE);
                            }
                            java.lang.reflect.Method method3 = o;
                            if (method3 == null || (constructor = p) == null) {
                                e.c(sSLSocket, str);
                            } else {
                                if (str.startsWith("[")) {
                                    defpackage.ahvr.bR(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
                                    int iIndexOf = str.indexOf(58);
                                    int iIndexOf2 = str.indexOf(93);
                                    defpackage.ahvr.bR(iIndexOf >= 0 && iIndexOf2 > iIndexOf, "Invalid bracketed host/port: %s", str);
                                    java.lang.String strSubstring3 = str.substring(1, iIndexOf2);
                                    int i2 = iIndexOf2 + 1;
                                    if (i2 == str.length()) {
                                        strArr = new java.lang.String[]{strSubstring3, ""};
                                    } else {
                                        defpackage.ahvr.bR(str.charAt(i2) == ':', "Only a colon may follow a close bracket: %s", str);
                                        int i3 = iIndexOf2 + 2;
                                        for (int i4 = i3; i4 < str.length(); i4++) {
                                            defpackage.ahvr.bR(java.lang.Character.isDigit(str.charAt(i4)), "Port must be numeric: %s", str);
                                        }
                                        strArr = new java.lang.String[]{strSubstring3, str.substring(i3)};
                                    }
                                    java.lang.String str2 = strArr[0];
                                    strSubstring = strArr[1];
                                    strSubstring2 = str2;
                                } else {
                                    int iIndexOf3 = str.indexOf(58);
                                    if (iIndexOf3 >= 0) {
                                        int i5 = iIndexOf3 + 1;
                                        if (str.indexOf(58, i5) == -1) {
                                            strSubstring2 = str.substring(0, iIndexOf3);
                                            strSubstring = str.substring(i5);
                                        } else {
                                            strSubstring2 = str;
                                            strSubstring = null;
                                        }
                                    } else {
                                        strSubstring2 = str;
                                        strSubstring = null;
                                    }
                                }
                                if (defpackage.ahvr.cp(strSubstring)) {
                                    numX = -1;
                                } else {
                                    numX = defpackage.aiql.X(strSubstring);
                                    defpackage.ahvr.bR(numX != null, "Unparseable port number: %s", str);
                                    int iIntValue = numX.intValue();
                                    defpackage.ahvr.bR(iIntValue >= 0 && iIntValue <= 65535, "Port number out of range: %s", str);
                                }
                                if (defpackage.aiyz.c(new aiyx(strSubstring2, numX.intValue()).a, null) == null) {
                                    method3.invoke(sSLParameters, java.util.Collections.singletonList(constructor.newInstance(str)));
                                } else {
                                    e.c(sSLSocket, str);
                                }
                            }
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException(e3);
            } catch (java.lang.InstantiationException e4) {
                throw new java.lang.RuntimeException(e4);
            }
        }
        java.lang.reflect.Method method4 = n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                l.invoke(sSLParameters, strArr2);
                z = true;
            } catch (java.lang.reflect.InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof java.lang.UnsupportedOperationException)) {
                    throw e5;
                }
                defpackage.aofn.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
                z = false;
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = m) != null && java.util.Arrays.equals(strArr2, (java.lang.String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        java.lang.Object[] objArr = {defpackage.aogh.e(list)};
        defpackage.aogh aoghVar = this.c;
        if (aoghVar.c() == 1) {
            g.a(sSLSocket, objArr);
        }
        if (aoghVar.c() == 3) {
            throw new java.lang.RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        i.a(sSLSocket, objArr);
    }
}
