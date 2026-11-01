package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplt implements defpackage.apix {
    private static final int b(defpackage.apjm apjmVar, int i) {
        java.lang.String strA = apjmVar.a("Retry-After");
        if (strA == null) {
            return i;
        }
        if (new defpackage.aorg("\\d+").f(strA)) {
            return java.lang.Integer.valueOf(strA).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019a  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ec A[Catch: all -> 0x02d5, TryCatch #3 {all -> 0x02d5, blocks: (B:24:0x00a4, B:26:0x00a8, B:27:0x00ac, B:29:0x00b6, B:31:0x00bc, B:33:0x00c6, B:35:0x00ce, B:48:0x00f0, B:50:0x00f5, B:52:0x00f9, B:54:0x00fd, B:56:0x0103, B:58:0x0107, B:60:0x010b, B:127:0x0208, B:129:0x020c, B:136:0x021e, B:138:0x0229, B:140:0x0238, B:141:0x0245, B:64:0x0116, B:65:0x0119, B:67:0x0123, B:68:0x012a, B:69:0x012b, B:71:0x012f, B:73:0x0133, B:76:0x013d, B:78:0x0141, B:81:0x0149, B:83:0x016b, B:84:0x016f, B:87:0x0173, B:90:0x0178, B:91:0x0179, B:92:0x017a, B:94:0x0182, B:96:0x018a, B:98:0x0192, B:102:0x019c, B:106:0x01b2, B:109:0x01b9, B:118:0x01d6, B:119:0x01ec, B:114:0x01c6, B:116:0x01ce, B:120:0x01f1, B:122:0x01f7, B:123:0x01fc, B:143:0x0247, B:146:0x0251, B:148:0x0255, B:150:0x025b, B:152:0x025f, B:154:0x0263, B:156:0x0267, B:166:0x027e, B:168:0x0282, B:170:0x0287, B:172:0x028b, B:173:0x028e, B:175:0x0294, B:177:0x029a, B:181:0x02a3, B:183:0x02a7, B:184:0x02ad, B:186:0x02b3, B:187:0x02bd, B:188:0x02be, B:160:0x026e, B:162:0x0272, B:164:0x027a, B:86:0x0171), top: B:219:0x00a4, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x017a A[Catch: all -> 0x02d5, TryCatch #3 {all -> 0x02d5, blocks: (B:24:0x00a4, B:26:0x00a8, B:27:0x00ac, B:29:0x00b6, B:31:0x00bc, B:33:0x00c6, B:35:0x00ce, B:48:0x00f0, B:50:0x00f5, B:52:0x00f9, B:54:0x00fd, B:56:0x0103, B:58:0x0107, B:60:0x010b, B:127:0x0208, B:129:0x020c, B:136:0x021e, B:138:0x0229, B:140:0x0238, B:141:0x0245, B:64:0x0116, B:65:0x0119, B:67:0x0123, B:68:0x012a, B:69:0x012b, B:71:0x012f, B:73:0x0133, B:76:0x013d, B:78:0x0141, B:81:0x0149, B:83:0x016b, B:84:0x016f, B:87:0x0173, B:90:0x0178, B:91:0x0179, B:92:0x017a, B:94:0x0182, B:96:0x018a, B:98:0x0192, B:102:0x019c, B:106:0x01b2, B:109:0x01b9, B:118:0x01d6, B:119:0x01ec, B:114:0x01c6, B:116:0x01ce, B:120:0x01f1, B:122:0x01f7, B:123:0x01fc, B:143:0x0247, B:146:0x0251, B:148:0x0255, B:150:0x025b, B:152:0x025f, B:154:0x0263, B:156:0x0267, B:166:0x027e, B:168:0x0282, B:170:0x0287, B:172:0x028b, B:173:0x028e, B:175:0x0294, B:177:0x029a, B:181:0x02a3, B:183:0x02a7, B:184:0x02ad, B:186:0x02b3, B:187:0x02bd, B:188:0x02be, B:160:0x026e, B:162:0x0272, B:164:0x027a, B:86:0x0171), top: B:219:0x00a4, inners: #2, #4 }] */
    /* JADX WARN: Type inference failed for: r6v32, types: [aplp, java.lang.Object] */
    @Override // defpackage.apix
    public final defpackage.apjm a(defpackage.aplr aplrVar) throws java.lang.Throwable {
        defpackage.apks apksVar;
        defpackage.apjh apjhVar;
        java.util.List list;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.apkl apklVar;
        defpackage.apjk apjkVar;
        java.lang.String strA;
        defpackage.apjh apjhVar2;
        defpackage.apjk apjkVar2;
        defpackage.apjm apjmVar;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        javax.net.ssl.HostnameVerifier hostnameVerifier;
        defpackage.apih apihVar;
        defpackage.apjh apjhVar3 = aplrVar.c;
        java.util.List listBU = defpackage.aokc.a;
        defpackage.apjm apjmVar2 = null;
        int i = 0;
        defpackage.apjh apjhVar4 = apjhVar3;
        boolean z4 = true;
        while (true) {
            if (apjhVar4 == null) {
                defpackage.aooh.i("request");
            }
            defpackage.apks apksVar2 = aplrVar.a;
            if (apksVar2.h != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            synchronized (apksVar2) {
                try {
                    try {
                        if (apksVar2.j) {
                            throw new java.lang.IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                        }
                        if (apksVar2.i || apksVar2.l || apksVar2.k) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apksVar = apksVar2;
                }
                throw th;
            }
            if (z4) {
                defpackage.apje apjeVar = apksVar2.a;
                defpackage.zzx zzxVar = aplrVar.q;
                int i2 = aplrVar.e;
                int i3 = aplrVar.f;
                int i4 = aplrVar.d;
                boolean z5 = aplrVar.n;
                java.util.List list2 = listBU;
                defpackage.apiw apiwVar = apjhVar4.a;
                if (apiwVar.j()) {
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = aplrVar.p;
                    javax.net.ssl.HostnameVerifier hostnameVerifier2 = aplrVar.j;
                    apihVar = aplrVar.g;
                    hostnameVerifier = hostnameVerifier2;
                    sSLSocketFactory = sSLSocketFactory2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    apihVar = null;
                }
                java.lang.Object obj = zzxVar.a;
                defpackage.apkc apkcVar = apjeVar.y;
                defpackage.apjh apjhVar5 = apjhVar4;
                list = list2;
                defpackage.apkw apkwVar = new defpackage.apkw(apkcVar, (defpackage.apkv) obj, i2, i3, i4, i2, z5, new defpackage.apib(apiwVar.b, apiwVar.c, aplrVar.i, aplrVar.o, sSLSocketFactory, hostnameVerifier, apihVar, aplrVar.l, aplrVar.k, apjeVar.r, apjeVar.q, aplrVar.m), apjeVar.A, apksVar2, apjhVar5);
                apksVar = apksVar2;
                apjhVar = apjhVar5;
                apksVar.q = new defpackage.apko(apkwVar, apkcVar);
            } else {
                apjhVar = apjhVar4;
                list = listBU;
                apksVar = apksVar2;
            }
            try {
                if (apksVar.n) {
                    z = true;
                    try {
                        throw new java.io.IOException("Canceled");
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        z2 = z;
                        apksVar.i(z2);
                        throw th;
                    }
                }
                try {
                    defpackage.apjl apjlVar = new defpackage.apjl(aplrVar.a(apjhVar));
                    apjlVar.d(apjhVar);
                    apjlVar.g = apjmVar2 != null ? defpackage.aooh.P(apjmVar2) : null;
                    defpackage.apjm apjmVarA = apjlVar.a();
                    defpackage.apkl apklVar2 = apksVar.h;
                    defpackage.apjp apjpVar = apklVar2 != null ? apklVar2.b().b : null;
                    int i5 = apjmVarA.d;
                    defpackage.apjh apjhVar6 = apjmVarA.a;
                    java.lang.String str = apjhVar6.b;
                    if (i5 == 307 || i5 == 308) {
                        if (aplrVar.a.a.h || (strA = apjmVarA.a("Location")) == null) {
                            apjhVar2 = null;
                        } else {
                            defpackage.apiw apiwVar2 = apjhVar6.a;
                            defpackage.apiv apivVarI = apiwVar2.i(strA);
                            defpackage.apiw apiwVarA = apivVarI != null ? apivVarI.a() : null;
                            if (apiwVarA == null) {
                                apjhVar2 = null;
                            } else {
                                defpackage.aooh.n(apiwVarA.a, apiwVar2.a);
                                defpackage.apjg apjgVar = new defpackage.apjg(apjhVar6);
                                if (defpackage.aoov.bd(str)) {
                                    if (str == null) {
                                        defpackage.aooh.i("method");
                                    }
                                    if (i5 == 303) {
                                        if (defpackage.aooh.n(str, "PROPFIND")) {
                                            apjgVar.b(str, apjhVar6.d);
                                        } else {
                                            apjgVar.b("GET", null);
                                            apjgVar.c("Transfer-Encoding");
                                            apjgVar.c("Content-Length");
                                            apjgVar.c("Content-Type");
                                        }
                                    } else if (i5 == 307 || i5 == 308 || defpackage.aooh.n(str, "PROPFIND") || defpackage.aooh.n(str, "QUERY")) {
                                        apjgVar.b(str, apjhVar6.d);
                                    } else {
                                        apjgVar.b("GET", null);
                                        apjgVar.c("Transfer-Encoding");
                                        apjgVar.c("Content-Length");
                                        apjgVar.c("Content-Type");
                                    }
                                }
                                if (!defpackage.apjx.i(apiwVar2, apiwVarA)) {
                                    apjgVar.c("Authorization");
                                }
                                apjgVar.a = apiwVarA;
                                apjhVar2 = new defpackage.apjh(apjgVar);
                            }
                        }
                    } else if (i5 == 401) {
                        apjhVar2 = null;
                    } else if (i5 == 421) {
                        defpackage.apjk apjkVar3 = apjhVar6.d;
                        if ((apjkVar3 != null && apjkVar3.e()) || apklVar2 == null || defpackage.aooh.n(((defpackage.apko) apklVar2.d).f.a.i.b, apklVar2.c.c().a().a.i.b)) {
                            apjhVar2 = null;
                        } else {
                            defpackage.apkt apktVarB = apklVar2.b();
                            synchronized (apktVarB) {
                                apktVarB.i = true;
                            }
                            apjhVar2 = apjhVar6;
                        }
                    } else if (i5 != 503) {
                        if (i5 == 407) {
                            if (apjpVar == null) {
                                defpackage.aooh.g();
                            }
                            if (apjpVar.b.type() != java.net.Proxy.Type.HTTP) {
                                throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                            }
                        } else if (i5 != 408) {
                            switch (i5) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    if (aplrVar.a.a.h) {
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else if (aplrVar.n && (((apjkVar2 = apjhVar6.d) == null || !apjkVar2.e()) && (((apjmVar = apjmVarA.j) == null || apjmVar.d != 408) && b(apjmVarA, 0) <= 0))) {
                            apjhVar2 = apjhVar6;
                        }
                        apjhVar2 = null;
                    } else {
                        defpackage.apjm apjmVar3 = apjmVarA.j;
                        if ((apjmVar3 == null || apjmVar3.d != 503) && b(apjmVarA, Integer.MAX_VALUE) == 0) {
                            apjhVar2 = apjhVar6;
                        } else {
                            apjhVar2 = null;
                        }
                    }
                    try {
                        if (apjhVar2 == null) {
                            defpackage.apis apisVar = apksVar.c;
                        } else {
                            defpackage.apjk apjkVar4 = apjhVar2.d;
                            if (apjkVar4 == null || !apjkVar4.e()) {
                                defpackage.apjv.j(apjmVarA.g);
                                int i6 = i + 1;
                                if (i6 > 20) {
                                    defpackage.apis apisVar2 = apksVar.c;
                                    throw new java.net.ProtocolException(defpackage.a.bj(i6, "Too many follow-up requests: "));
                                }
                                defpackage.apis apisVar3 = apksVar.c;
                                apksVar.i(true);
                                apjmVar2 = apjmVarA;
                                i = i6;
                                z4 = true;
                                listBU = list;
                                apjhVar4 = apjhVar2;
                            } else {
                                defpackage.apis apisVar4 = apksVar.c;
                            }
                        }
                        apksVar.i(false);
                        return apjmVarA;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        z2 = false;
                    }
                } catch (java.io.IOException e) {
                    boolean z6 = e instanceof apmd;
                    if (aplrVar.n && ((z6 || (((apjkVar = apjhVar.d) == null || !apjkVar.e()) && !(e instanceof java.io.FileNotFoundException))) && !(e instanceof java.net.ProtocolException))) {
                        if (e instanceof java.io.InterruptedIOException) {
                            if ((e instanceof java.net.SocketTimeoutException) && z6) {
                                apklVar = apksVar.o;
                                if (apklVar == null && apklVar.a) {
                                    defpackage.apko apkoVar = apksVar.q;
                                    if (apkoVar == null) {
                                        defpackage.aooh.g();
                                    }
                                    defpackage.apkw apkwVar2 = apkoVar.f;
                                    defpackage.apkl apklVar3 = apksVar.o;
                                    z3 = apkwVar2.c(apklVar3 != null ? apklVar3.b() : null);
                                }
                            }
                        } else if ((!(e instanceof javax.net.ssl.SSLHandshakeException) || !(e.getCause() instanceof java.security.cert.CertificateException)) && !(e instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
                            apklVar = apksVar.o;
                            if (apklVar == null) {
                            }
                        }
                    }
                    defpackage.apis apisVar5 = apksVar.c;
                    if (!z3) {
                        int i7 = defpackage.apjv.a;
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            aoil.b(e, (java.lang.Exception) it.next());
                        }
                        throw e;
                    }
                    listBU = defpackage.ajsz.bU(list, e);
                    apksVar.i(true);
                    apjhVar4 = apjhVar;
                    z4 = false;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                z = true;
                z2 = z;
            }
            apksVar.i(z2);
            throw th;
        }
    }
}
