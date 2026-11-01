package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofh implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.CountDownLatch a;
    final /* synthetic */ java.util.concurrent.CyclicBarrier b;
    final /* synthetic */ defpackage.aoer c;
    final /* synthetic */ java.util.concurrent.CountDownLatch d;
    final /* synthetic */ defpackage.aofk e;

    public aofh(defpackage.aofk aofkVar, java.util.concurrent.CountDownLatch countDownLatch, java.util.concurrent.CyclicBarrier cyclicBarrier, defpackage.aoer aoerVar, java.util.concurrent.CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = aoerVar;
        this.d = countDownLatch2;
        j$.util.Objects.requireNonNull(aofkVar);
        this.e = aofkVar;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        defpackage.aofk aofkVar;
        defpackage.aofi aofiVar;
        java.net.Socket socketCreateSocket;
        java.lang.String strSubstring;
        int i;
        java.lang.String lowerCase;
        int i2;
        byte[] bArr;
        appx appxVar;
        char c;
        appx appxVar2 = new appx(new defpackage.aofg(this));
        try {
            try {
                try {
                    this.a.await();
                    this.b.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.Throwable th) {
                    th = th;
                    defpackage.aofk aofkVar2 = this.e;
                    aofkVar2.q = new defpackage.aofi(aofkVar2, new defpackage.aogt(appxVar2));
                    this.d.countDown();
                    throw th;
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.BrokenBarrierException | java.util.concurrent.TimeoutException unused2) {
                aofkVar = this.e;
                aofkVar.m(0, defpackage.aogl.INTERNAL_ERROR, anqw.l.f("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
                aofkVar.q = aofiVar;
                this.d.countDown();
            }
            defpackage.aofk aofkVar3 = this.e;
            defpackage.annj annjVar = aofkVar3.K;
            try {
                if (annjVar != null) {
                    java.net.SocketAddress socketAddress = annjVar.a;
                    if (!(socketAddress instanceof java.net.InetSocketAddress)) {
                        throw new anqx(anqw.k.f("Unsupported SocketAddress implementation " + java.lang.String.valueOf(this.e.K.a.getClass())), (anph) null);
                    }
                    java.net.InetSocketAddress inetSocketAddress = annjVar.b;
                    java.lang.String str = annjVar.c;
                    java.lang.String str2 = annjVar.d;
                    try {
                        socketCreateSocket = ((java.net.InetSocketAddress) socketAddress).getAddress() != null ? aofkVar3.v.createSocket(((java.net.InetSocketAddress) socketAddress).getAddress(), ((java.net.InetSocketAddress) socketAddress).getPort()) : aofkVar3.v.createSocket(((java.net.InetSocketAddress) socketAddress).getHostName(), ((java.net.InetSocketAddress) socketAddress).getPort());
                        try {
                            socketCreateSocket.setTcpNoDelay(true);
                            socketCreateSocket.setSoTimeout(aofkVar3.L);
                            apqd apqdVarAO = aoov.aO(socketCreateSocket);
                            apoz apozVarAK = aoov.aK(aoov.aM(socketCreateSocket));
                            defpackage.aogz aogzVar = new defpackage.aogz();
                            aogzVar.a = "https";
                            java.lang.String hostName = inetSocketAddress.getHostName();
                            try {
                                if (hostName == null) {
                                    throw new java.lang.IllegalArgumentException("host == null");
                                }
                                int length = hostName.length();
                                int iCharCount = 0;
                                while (true) {
                                    if (iCharCount >= length) {
                                        strSubstring = hostName.substring(0, length);
                                        break;
                                    }
                                    int i3 = 37;
                                    if (hostName.charAt(iCharCount) == '%') {
                                        apoy apoyVar = new apoy();
                                        apoyVar.U(hostName, 0, iCharCount);
                                        while (iCharCount < length) {
                                            int iCodePointAt = hostName.codePointAt(iCharCount);
                                            if (iCodePointAt != i3) {
                                                appxVar = appxVar2;
                                                apoyVar.V(iCodePointAt);
                                            } else {
                                                int i4 = iCharCount + 2;
                                                if (i4 < length) {
                                                    int iA = defpackage.aoha.a(hostName.charAt(iCharCount + 1));
                                                    int iA2 = defpackage.aoha.a(hostName.charAt(i4));
                                                    appxVar = appxVar2;
                                                    if (iA == -1 || iA2 == -1) {
                                                        iCodePointAt = 37;
                                                        apoyVar.V(iCodePointAt);
                                                    } else {
                                                        apoyVar.N((iA << 4) + iA2);
                                                        iCharCount = i4;
                                                        iCodePointAt = 37;
                                                    }
                                                } else {
                                                    iCodePointAt = 37;
                                                    appxVar = appxVar2;
                                                    apoyVar.V(iCodePointAt);
                                                }
                                            }
                                            iCharCount += java.lang.Character.charCount(iCodePointAt);
                                            appxVar2 = appxVar;
                                            i3 = 37;
                                        }
                                        strSubstring = apoyVar.o();
                                        break;
                                    }
                                    iCharCount++;
                                }
                                if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
                                    java.net.InetAddress inetAddressB = defpackage.aogz.b(strSubstring, strSubstring.length() - 1);
                                    if (inetAddressB == null) {
                                        lowerCase = null;
                                        i = 8;
                                    } else {
                                        byte[] address = inetAddressB.getAddress();
                                        int i5 = 16;
                                        if (address.length != 16) {
                                            throw new java.lang.AssertionError();
                                        }
                                        int i6 = -1;
                                        int i7 = 0;
                                        int i8 = 0;
                                        i = 8;
                                        while (i8 < address.length) {
                                            int i9 = i8;
                                            while (i9 < i5 && address[i9] == 0 && address[i9 + 1] == 0) {
                                                i9 += 2;
                                            }
                                            int i10 = i9 - i8;
                                            if (i10 > i7) {
                                                i7 = i10;
                                                i6 = i8;
                                            }
                                            i8 = i9 + 2;
                                            i5 = 16;
                                        }
                                        apoy apoyVar2 = new apoy();
                                        int i11 = 0;
                                        while (i11 < address.length) {
                                            if (i11 == i6) {
                                                apoyVar2.N(58);
                                                i11 += i7;
                                                bArr = address;
                                                if (i11 == 16) {
                                                    apoyVar2.N(58);
                                                }
                                            } else {
                                                bArr = address;
                                                if (i11 > 0) {
                                                    apoyVar2.N(58);
                                                }
                                                apoyVar2.Y(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                                                i11 += 2;
                                                i6 = i6;
                                            }
                                            address = bArr;
                                        }
                                        lowerCase = apoyVar2.o();
                                    }
                                } else {
                                    i = 8;
                                    try {
                                        lowerCase = java.net.IDN.toASCII(strSubstring).toLowerCase(java.util.Locale.US);
                                        if (lowerCase.isEmpty()) {
                                            lowerCase = null;
                                            break;
                                        }
                                        for (int i12 = 0; i12 < lowerCase.length(); i12++) {
                                            char cCharAt = lowerCase.charAt(i12);
                                            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                                                lowerCase = null;
                                                break;
                                            }
                                        }
                                    } catch (java.lang.IllegalArgumentException unused3) {
                                    }
                                }
                                if (lowerCase == null) {
                                    throw new java.lang.IllegalArgumentException("unexpected host: ".concat(hostName));
                                }
                                aogzVar.b = lowerCase;
                                int port = inetSocketAddress.getPort();
                                if (port <= 0 || port > 65535) {
                                    throw new java.lang.IllegalArgumentException(a.bj(port, "unexpected port: "));
                                }
                                aogzVar.c = port;
                                if (aogzVar.a == null) {
                                    throw new java.lang.IllegalStateException("scheme == null");
                                }
                                if (aogzVar.b == null) {
                                    throw new java.lang.IllegalStateException("host == null");
                                }
                                defpackage.aoha aohaVar = new defpackage.aoha(aogzVar);
                                vqf vqfVar = new vqf((byte[]) null);
                                defpackage.aoil.o("Host", aohaVar.a + ':' + aohaVar.b, vqfVar);
                                defpackage.aoil.o("User-Agent", aofkVar3.g, vqfVar);
                                if (str != null && str2 != null) {
                                    try {
                                        byte[] bytes = (str + ':' + str2).getBytes("ISO-8859-1");
                                        appb appbVar = appb.a;
                                        defpackage.aoil.o("Proxy-Authorization", a.bx(aoov.aR(bytes).p(), "Basic "), vqfVar);
                                    } catch (java.io.UnsupportedEncodingException unused4) {
                                        throw new java.lang.AssertionError();
                                    }
                                }
                                ?? r2 = vqfVar.a;
                                java.lang.String[] strArr = (java.lang.String[]) r2.toArray(new java.lang.String[r2.size()]);
                                apozVarAK.ab(java.lang.String.format(java.util.Locale.US, "CONNECT %s:%d HTTP/1.1", aohaVar.a, java.lang.Integer.valueOf(aohaVar.b)));
                                apozVarAK.ab("\r\n");
                                int iQ = anty.q(strArr);
                                for (int i13 = 0; i13 < iQ; i13++) {
                                    apozVarAK.ab(anty.r(i13, strArr));
                                    apozVarAK.ab(": ");
                                    apozVarAK.ab(anty.s(i13, strArr));
                                    apozVarAK.ab("\r\n");
                                }
                                apozVarAK.ab("\r\n");
                                apozVarAK.flush();
                                java.lang.String strH = defpackage.aofk.h(apqdVarAO);
                                if (strH.startsWith("HTTP/1.")) {
                                    i2 = 9;
                                    if (strH.length() < 9 || strH.charAt(i) != ' ') {
                                        throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                    }
                                    int iCharAt = strH.charAt(7) - '0';
                                    if (iCharAt != 0 && iCharAt != 1) {
                                        throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                    }
                                    defpackage.aogi aogiVar = defpackage.aogi.HTTP_1_0;
                                } else {
                                    if (!strH.startsWith("ICY ")) {
                                        throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                    }
                                    defpackage.aogi aogiVar2 = defpackage.aogi.HTTP_1_0;
                                    i2 = 4;
                                }
                                int i14 = i2 + 3;
                                if (strH.length() < i14) {
                                    throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                }
                                try {
                                    int i15 = java.lang.Integer.parseInt(strH.substring(i2, i14));
                                    java.lang.String strSubstring2 = "";
                                    if (strH.length() > i14) {
                                        if (strH.charAt(i14) != ' ') {
                                            throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                        }
                                        strSubstring2 = strH.substring(i2 + 4);
                                    }
                                    while (!defpackage.aofk.h(apqdVarAO).equals("")) {
                                    }
                                    if (i15 < 200 || i15 >= 300) {
                                        apoy apoyVar3 = new apoy();
                                        try {
                                            socketCreateSocket.shutdownOutput();
                                            apqdVarAO.b(apoyVar3, 1024L);
                                        } catch (java.io.IOException e) {
                                            apoyVar3.Z("Unable to read body: " + e.toString());
                                        }
                                        try {
                                            socketCreateSocket.close();
                                        } catch (java.io.IOException unused5) {
                                        }
                                        throw new anqx(anqw.l.f(java.lang.String.format(java.util.Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", java.lang.Integer.valueOf(i15), strSubstring2, apoyVar3.o())), (anph) null);
                                    }
                                    socketCreateSocket.setSoTimeout(0);
                                    aofkVar3.c = socketCreateSocket;
                                } catch (java.lang.NumberFormatException unused6) {
                                    throw new java.net.ProtocolException("Unexpected status line: ".concat(strH));
                                }
                            } catch (java.io.IOException e2) {
                                e = e2;
                            }
                        } catch (java.io.IOException e3) {
                            e = e3;
                        }
                    } catch (java.io.IOException e4) {
                        e = e4;
                        socketCreateSocket = null;
                    }
                    if (socketCreateSocket != null) {
                        anxo.h(socketCreateSocket);
                    }
                    throw new anqx(anqw.l.f("Failed trying to connect with proxy").e(e), (anph) null);
                }
                javax.net.SocketFactory socketFactory = aofkVar3.v;
                java.net.InetSocketAddress inetSocketAddress2 = aofkVar3.e;
                aofkVar3.c = socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                defpackage.aofk aofkVar4 = this.e;
                if (aofkVar4.w != null) {
                    aofkVar4.c.setSoTimeout(aofkVar4.L);
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = aofkVar4.w;
                    javax.net.ssl.HostnameVerifier hostnameVerifier = aofkVar4.x;
                    java.net.Socket socket = aofkVar4.c;
                    java.lang.String str3 = aofkVar4.f;
                    java.net.URI uriF = anxo.f(str3);
                    java.lang.String host = uriF.getHost() != null ? uriF.getHost() : str3;
                    java.net.URI uriF2 = anxo.f(str3);
                    int port2 = uriF2.getPort() != -1 ? uriF2.getPort() : aofkVar4.e.getPort();
                    aofz aofzVar = aofkVar4.B;
                    int i16 = defpackage.aofp.b;
                    ahvr.cj(sSLSocketFactory, "sslSocketFactory");
                    ahvr.cj(socket, "socket");
                    ahvr.cj(aofzVar, "spec");
                    javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) sSLSocketFactory.createSocket(socket, host, port2, true);
                    java.lang.String[] strArr2 = aofzVar.c;
                    java.lang.String[] strArr3 = strArr2 != null ? (java.lang.String[]) defpackage.aogk.b(java.lang.String.class, strArr2, sSLSocket.getEnabledCipherSuites()) : null;
                    java.lang.String[] strArr4 = (java.lang.String[]) defpackage.aogk.b(java.lang.String.class, aofzVar.d, sSLSocket.getEnabledProtocols());
                    aofy aofyVar = new aofy(aofzVar);
                    if (strArr3 == null) {
                        aofyVar.a = null;
                    } else {
                        aofyVar.a = (java.lang.String[]) strArr3.clone();
                    }
                    if (strArr4 == null) {
                        aofyVar.b = null;
                    } else {
                        aofyVar.b = (java.lang.String[]) strArr4.clone();
                    }
                    aofz aofzVar2 = new aofz(aofyVar);
                    sSLSocket.setEnabledProtocols(aofzVar2.d);
                    java.lang.String[] strArr5 = aofzVar2.c;
                    if (strArr5 != null) {
                        sSLSocket.setEnabledCipherSuites(strArr5);
                    }
                    java.lang.String strB = aofn.b.b(sSLSocket, host, aofzVar.e ? defpackage.aofp.a : null);
                    java.util.List list = defpackage.aofp.a;
                    defpackage.aogi aogiVar3 = defpackage.aogi.HTTP_1_0;
                    if (!strB.equals(aogiVar3.e)) {
                        aogiVar3 = defpackage.aogi.HTTP_1_1;
                        if (!strB.equals(aogiVar3.e)) {
                            aogiVar3 = defpackage.aogi.HTTP_2;
                            if (!strB.equals(aogiVar3.e)) {
                                aogiVar3 = defpackage.aogi.SPDY_3;
                                if (!strB.equals(aogiVar3.e)) {
                                    throw new java.io.IOException("Unexpected protocol: ".concat(strB));
                                }
                            }
                        }
                    }
                    ahvr.cc(list.contains(aogiVar3), "Only " + java.lang.String.valueOf(list) + " are supported, but negotiated protocol is %s", strB);
                    if (!hostnameVerifier.verify((host.startsWith("[") && host.endsWith("]")) ? host.substring(1, host.length() - 1) : host, sSLSocket.getSession())) {
                        throw new javax.net.ssl.SSLPeerUnverifiedException("Cannot verify hostname: ".concat(java.lang.String.valueOf(host)));
                    }
                    aofkVar4.c.setSoTimeout(0);
                    aofkVar4.d = sSLSocket.getSession();
                    aofkVar4.c = sSLSocket;
                }
                aofkVar4.c.setTcpNoDelay(true);
                appxVar2 = new appx(aoov.aO(aofkVar4.c));
                try {
                    defpackage.aoer aoerVar = this.c;
                    apqb apqbVarAM = aoov.aM(aofkVar4.c);
                    java.net.Socket socket2 = aofkVar4.c;
                    ahvr.bZ(aoerVar.f == null, "AsyncSink's becomeConnected should only be called once.");
                    aoerVar.f = apqbVarAM;
                    ahvr.cj(socket2, "socket");
                    aoerVar.g = socket2;
                    defpackage.antt anttVar = new defpackage.antt(aofkVar4.r);
                    anttVar.c(defpackage.annh.a, aofkVar4.c.getRemoteSocketAddress());
                    anttVar.c(defpackage.annh.b, aofkVar4.c.getLocalSocketAddress());
                    anttVar.c(defpackage.annh.c, aofkVar4.d);
                    anttVar.c(defpackage.anxi.a, aofkVar4.d == null ? defpackage.anqj.a : defpackage.anqj.c);
                    aofkVar4.r = anttVar.a();
                    aofkVar4.q = new defpackage.aofi(aofkVar4, new defpackage.aogt(appxVar2));
                    this.d.countDown();
                    synchronized (aofkVar4.m) {
                        java.net.Socket socket3 = aofkVar4.c;
                        ahvr.cj(socket3, "socket");
                        aofkVar4.y = socket3;
                        javax.net.ssl.SSLSession sSLSession = aofkVar4.d;
                        if (sSLSession != null) {
                            sSLSession.getCipherSuite();
                            java.security.cert.Certificate[] localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                                c = 0;
                                java.security.cert.Certificate certificate = localCertificates[0];
                            } else {
                                c = 0;
                            }
                            try {
                                java.security.cert.Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                                if (peerCertificates != null) {
                                    java.security.cert.Certificate certificate2 = peerCertificates[c];
                                }
                            } catch (javax.net.ssl.SSLPeerUnverifiedException e5) {
                                anno.a.logp(java.util.logging.Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", java.lang.String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (java.lang.Throwable) e5);
                            }
                        }
                    }
                } catch (java.lang.Exception e6) {
                    e = e6;
                    defpackage.aofk aofkVar5 = this.e;
                    anxo.h(aofkVar5.c);
                    aofkVar5.e(e);
                    aofkVar = aofkVar5;
                    aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
                    aofkVar.q = aofiVar;
                    this.d.countDown();
                } catch (anqx e7) {
                    e = e7;
                    this.e.m(0, defpackage.aogl.INTERNAL_ERROR, e.a);
                    aofkVar = this.e;
                    aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
                    aofkVar.q = aofiVar;
                    this.d.countDown();
                }
            } catch (anqx e8) {
                e = e8;
                appxVar2 = appxVar2;
                this.e.m(0, defpackage.aogl.INTERNAL_ERROR, e.a);
                aofkVar = this.e;
                aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
                aofkVar.q = aofiVar;
                this.d.countDown();
            } catch (java.lang.Exception e9) {
                e = e9;
                appxVar2 = appxVar2;
                defpackage.aofk aofkVar6 = this.e;
                anxo.h(aofkVar6.c);
                aofkVar6.e(e);
                aofkVar = aofkVar6;
                aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
                aofkVar.q = aofiVar;
                this.d.countDown();
            } catch (java.lang.Throwable th2) {
                th = th2;
                appxVar2 = appxVar2;
                defpackage.aofk aofkVar7 = this.e;
                aofkVar7.q = new defpackage.aofi(aofkVar7, new defpackage.aogt(appxVar2));
                this.d.countDown();
                throw th;
            }
        } catch (anqx e10) {
            e = e10;
            appxVar2 = appxVar2;
            this.e.m(0, defpackage.aogl.INTERNAL_ERROR, e.a);
            aofkVar = this.e;
            aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
            aofkVar.q = aofiVar;
            this.d.countDown();
        } catch (java.lang.Exception e11) {
            e = e11;
            appxVar2 = appxVar2;
            defpackage.aofk aofkVar8 = this.e;
            anxo.h(aofkVar8.c);
            aofkVar8.e(e);
            aofkVar = aofkVar8;
            aofiVar = new defpackage.aofi(aofkVar, new defpackage.aogt(appxVar2));
            aofkVar.q = aofiVar;
            this.d.countDown();
        } catch (java.lang.Throwable th3) {
            th = th3;
            appxVar2 = appxVar2;
            defpackage.aofk aofkVar9 = this.e;
            aofkVar9.q = new defpackage.aofi(aofkVar9, new defpackage.aogt(appxVar2));
            this.d.countDown();
            throw th;
        }
    }
}
