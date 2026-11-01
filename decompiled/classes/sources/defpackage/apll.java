package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apll implements defpackage.apix {
    public static final defpackage.apll a = new defpackage.apll();

    /* JADX WARN: Code duplicated, block: B:140:0x0294 A[Catch: IOException -> 0x02c3, TryCatch #3 {IOException -> 0x02c3, blocks: (B:63:0x00f2, B:65:0x00f8, B:67:0x00fd, B:68:0x0101, B:81:0x014f, B:83:0x015c, B:85:0x0166, B:93:0x0183, B:95:0x01a2, B:96:0x01af, B:108:0x01e2, B:109:0x01e3, B:127:0x025d, B:129:0x026d, B:137:0x0287, B:140:0x0294, B:141:0x02b6, B:131:0x027b, B:121:0x0221, B:122:0x0222, B:123:0x0223, B:124:0x022a, B:126:0x024b, B:143:0x02b8, B:144:0x02c2, B:88:0x0176, B:89:0x017d, B:75:0x0127, B:77:0x012d, B:79:0x0132, B:80:0x0135, B:125:0x022b, B:97:0x01b0, B:99:0x01b7, B:101:0x01be, B:103:0x01c5, B:105:0x01cc, B:107:0x01d3, B:111:0x01ff, B:112:0x0206, B:113:0x0207, B:114:0x020e, B:115:0x020f, B:116:0x0216, B:117:0x0217, B:118:0x021e), top: B:159:0x00f2, inners: #0, #8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x0294, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v12, types: [aplp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [aplp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [aplp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v28, types: [aplp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v36, types: [aplp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aplp, java.lang.Object] */
    @Override // defpackage.apix
    public final defpackage.apjm a(defpackage.aplr aplrVar) throws java.io.IOException {
        java.io.IOException iOException;
        boolean z;
        defpackage.apjl apjlVarA;
        defpackage.apjm apjmVarA;
        int i;
        boolean z2;
        defpackage.apjm apjmVarA2;
        defpackage.apjo apjoVar;
        defpackage.apkl apklVar = aplrVar.b;
        if (apklVar == null) {
            defpackage.aooh.g();
        }
        defpackage.apjh apjhVar = aplrVar.c;
        defpackage.apjk apjkVar = apjhVar.d;
        java.lang.String str = apjhVar.b;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z3 = defpackage.aoov.bd(str) && apjkVar != null;
        boolean zS = defpackage.aoov.s("upgrade", apjhVar.a("Connection"), true);
        java.io.IOException iOException2 = null;
        if (apjhVar == null) {
            try {
                defpackage.aooh.i("request");
            } catch (java.io.IOException e) {
                iOException = e;
                z = true;
                apjlVarA = null;
            }
        }
        try {
            java.lang.Object obj = apklVar.b;
            defpackage.apis apisVar = ((defpackage.apks) obj).c;
            apklVar.c.j(apjhVar);
            ((defpackage.apks) obj).c.a(apjhVar);
            try {
                if (z3) {
                    if (defpackage.aoov.s("100-continue", apjhVar.a("Expect"), true)) {
                        try {
                            apklVar.c.i();
                            defpackage.apjl apjlVarA2 = apklVar.a(true);
                            try {
                                apklVar.e();
                                apjlVarA = apjlVarA2;
                                z = false;
                            } catch (java.io.IOException e2) {
                                iOException2 = e2;
                                apjlVarA = apjlVarA2;
                                z = true;
                                if (iOException2 instanceof apmd) {
                                    throw iOException2;
                                }
                                throw iOException2;
                            }
                        } catch (java.io.IOException e3) {
                            defpackage.apis apisVar2 = ((defpackage.apks) apklVar.b).c;
                            apklVar.f(e3);
                            throw e3;
                        }
                    } else {
                        z = true;
                        apjlVarA = null;
                    }
                    if (apjlVarA != null) {
                        apklVar.d();
                        if (!apklVar.b().e()) {
                            apklVar.c();
                        }
                    } else {
                        if (apjhVar == null) {
                            defpackage.aooh.i("request");
                        }
                        defpackage.apjk apjkVar2 = apjhVar.d;
                        if (apjkVar2 == null) {
                            defpackage.aooh.g();
                        }
                        long jA = apjkVar2.a();
                        defpackage.apis apisVar3 = ((defpackage.apks) apklVar.b).c;
                        defpackage.appv appvVar = new defpackage.appv(new apki(apklVar, apklVar.c.d(apjhVar, jA), jA, false));
                        apjkVar.d(appvVar);
                        appvVar.close();
                    }
                } else {
                    apklVar.d();
                    z = true;
                    apjlVarA = null;
                }
                try {
                    apklVar.c.h();
                    while (true) {
                        if (i != 100 && (i < 102 || i >= 200)) {
                            break;
                        }
                        defpackage.apjl apjlVarA3 = apklVar.a(false);
                        if (apjlVarA3 == null) {
                            defpackage.aooh.g();
                        }
                        if (z) {
                            apklVar.e();
                        }
                        apjlVarA3.d(apjhVar);
                        apjlVarA3.c = apklVar.b().d;
                        apjlVarA3.h = jCurrentTimeMillis;
                        apjlVarA3.i = java.lang.System.currentTimeMillis();
                        apjmVarA = apjlVarA3.a();
                        i = apjmVarA.d;
                    }
                } catch (java.io.IOException e4) {
                    defpackage.apis apisVar4 = ((defpackage.apks) apklVar.b).c;
                    apklVar.f(e4);
                    throw e4;
                }
            } catch (java.io.IOException e5) {
                iOException = e5;
                iOException2 = iOException;
                if ((iOException2 instanceof apmd) || !apklVar.a) {
                    throw iOException2;
                }
            }
            if (apjlVarA == null) {
                try {
                    apjlVarA = apklVar.a(false);
                    if (apjlVarA == null) {
                        defpackage.aooh.g();
                    }
                    if (z) {
                        apklVar.e();
                        z = false;
                    }
                } catch (java.io.IOException e6) {
                    if (iOException2 == null) {
                        throw e6;
                    }
                    aoil.b(iOException2, e6);
                    throw iOException2;
                }
            }
            apjlVarA.d(apjhVar);
            apjlVarA.c = apklVar.b().d;
            apjlVarA.h = jCurrentTimeMillis;
            apjlVarA.i = java.lang.System.currentTimeMillis();
            apjmVarA = apjlVarA.a();
            i = apjmVarA.d;
            ((defpackage.apks) apklVar.b).c.b();
            if (i != 101) {
                z2 = false;
            } else {
                if (apklVar.b().e()) {
                    throw new java.net.ProtocolException("Unexpected 101 code on HTTP/2 connection");
                }
                if (defpackage.aoov.s("upgrade", apjmVarA.a("Connection"), true)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (zS && z2) {
                defpackage.apjl apjlVar = new defpackage.apjl(apjmVarA);
                defpackage.apjo apjoVar2 = apjmVarA.g;
                apjlVar.d = new defpackage.apjt(apjoVar2.fO(), apjoVar2.a());
                java.lang.Object obj2 = apklVar.b;
                if (((defpackage.apks) obj2).g) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                ((defpackage.apks) obj2).g = true;
                ((defpackage.apks) obj2).d.e();
                synchronized (obj2) {
                    if (((defpackage.apks) obj2).o == null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (((defpackage.apks) obj2).k || ((defpackage.apks) obj2).l) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (((defpackage.apks) obj2).i) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (!((defpackage.apks) obj2).j) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    ((defpackage.apks) obj2).j = false;
                    ((defpackage.apks) obj2).k = true;
                    ((defpackage.apks) obj2).l = true;
                }
                defpackage.apkt apktVar = (defpackage.apkt) apklVar.c.c();
                apktVar.c.setSoTimeout(0);
                apktVar.g();
                apjlVar.e = new apkk(apklVar);
                apjmVarA2 = apjlVar.a();
            } else {
                try {
                    java.lang.String strA = apjmVarA.a("Content-Type");
                    ?? r0 = apklVar.c;
                    long jA2 = r0.a(apjmVarA);
                    defpackage.apls aplsVar = new defpackage.apls(strA, jA2, new defpackage.appx(new defpackage.apkj(apklVar, r0.f(apjmVarA), jA2, false)));
                    defpackage.apjl apjlVar2 = new defpackage.apjl(apjmVarA);
                    apjlVar2.d = aplsVar;
                    apjlVar2.k = new defpackage.aplk();
                    apjmVarA2 = apjlVar2.a();
                } catch (java.io.IOException e7) {
                    defpackage.apis apisVar5 = ((defpackage.apks) apklVar.b).c;
                    apklVar.f(e7);
                    throw e7;
                }
            }
            if (defpackage.aoov.s("close", apjmVarA2.a.a("Connection"), true) || defpackage.aoov.s("close", apjmVarA2.a("Connection"), true)) {
                apklVar.c();
            }
            if (i == 204) {
                apjoVar = apjmVarA2.g;
                if (apjoVar.a() > 0) {
                    throw new java.net.ProtocolException("HTTP " + i + " had non-zero Content-Length: " + apjoVar.a());
                }
            } else if (i == 205) {
                i = 205;
                apjoVar = apjmVarA2.g;
                if (apjoVar.a() > 0) {
                    throw new java.net.ProtocolException("HTTP " + i + " had non-zero Content-Length: " + apjoVar.a());
                }
            }
            return apjmVarA2;
        } catch (java.io.IOException e8) {
            defpackage.apis apisVar6 = ((defpackage.apks) apklVar.b).c;
            apklVar.f(e8);
            throw e8;
        }
    }
}
