package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rd {
    static void a(android.app.appsearch.GlobalSearchSession globalSearchSession, java.lang.String str, java.lang.String str2, android.app.appsearch.GetByDocumentIdRequest getByDocumentIdRequest, java.util.concurrent.Executor executor, android.app.appsearch.BatchResultCallback batchResultCallback) {
        ae$.ExternalSyntheticApiModelOutline0.m(globalSearchSession, str, str2, getByDocumentIdRequest, executor, batchResultCallback);
    }

    static void b(android.app.appsearch.GlobalSearchSession globalSearchSession, java.lang.String str, java.lang.String str2, java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        ae$.ExternalSyntheticApiModelOutline0.m(globalSearchSession, str, str2, executor, consumer);
    }

    static void c(android.app.appsearch.GlobalSearchSession globalSearchSession, java.lang.String str, android.app.appsearch.observer.ObserverSpec observerSpec, java.util.concurrent.Executor executor, android.app.appsearch.observer.ObserverCallback observerCallback) {
        ae$.ExternalSyntheticApiModelOutline0.m(globalSearchSession, str, observerSpec, executor, observerCallback);
    }

    static void d(android.app.appsearch.GlobalSearchSession globalSearchSession, java.lang.String str, android.app.appsearch.observer.ObserverCallback observerCallback) {
        ae$.ExternalSyntheticApiModelOutline0.m(globalSearchSession, str, observerCallback);
    }

    public static pw e(android.app.appsearch.GenericDocument genericDocument, rf rfVar) {
        defpackage.dzk.x(genericDocument);
        pv pvVar = new pv(mp$.ExternalSyntheticApiModelOutline0.m(genericDocument), mp$.ExternalSyntheticApiModelOutline0.m$1(genericDocument), mp$.ExternalSyntheticApiModelOutline0.m$2(genericDocument));
        int iM = mp$.ExternalSyntheticApiModelOutline0.m(genericDocument);
        if (iM < 0) {
            throw new java.lang.IllegalArgumentException("Document score cannot be negative.");
        }
        sd sdVar = pvVar.a;
        sdVar.b = iM;
        pv pvVar2 = pvVar.b;
        long jM = mp$.ExternalSyntheticApiModelOutline0.m(genericDocument);
        if (jM < 0) {
            throw new java.lang.IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        pvVar2.a.d(jM);
        pvVar2.b.a.a = mp$.ExternalSyntheticApiModelOutline0.m$1(genericDocument);
        for (java.lang.String str : mp$.ExternalSyntheticApiModelOutline0.m(genericDocument)) {
            java.lang.Object objM = mp$.ExternalSyntheticApiModelOutline0.m(genericDocument, str);
            int i = 0;
            if (str.equals("$$__AppSearch__parentTypes")) {
                if (!(objM instanceof java.lang.String[])) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Parents list must be of String[] type, but got %s", objM.getClass().toString()));
                }
                sdVar.c(java.util.Arrays.asList((java.lang.String[]) objM));
            } else if (objM instanceof java.lang.String[]) {
                java.lang.String[] strArr = (java.lang.String[]) objM;
                defpackage.dzk.x(str);
                defpackage.dzk.x(strArr);
                pv.d(str);
                while (i < strArr.length) {
                    if (strArr[i] == null) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "The String at ", " is null."));
                    }
                    i++;
                }
                sk skVar = new sk(str);
                skVar.h(strArr);
                sdVar.b(str, skVar.a());
            } else if (objM instanceof long[]) {
                long[] jArr = (long[]) objM;
                defpackage.dzk.x(str);
                defpackage.dzk.x(jArr);
                pv.d(str);
                sk skVar2 = new sk(str);
                skVar2.g(jArr);
                sdVar.b(str, skVar2.a());
            } else if (objM instanceof double[]) {
                double[] dArr = (double[]) objM;
                defpackage.dzk.x(str);
                defpackage.dzk.x(dArr);
                pv.d(str);
                sk skVar3 = new sk(str);
                skVar3.e(dArr);
                sdVar.b(str, skVar3.a());
            } else if (objM instanceof boolean[]) {
                boolean[] zArr = (boolean[]) objM;
                defpackage.dzk.x(str);
                defpackage.dzk.x(zArr);
                pv.d(str);
                sk skVar4 = new sk(str);
                skVar4.b(zArr);
                sdVar.b(str, skVar4.a());
            } else if (objM instanceof byte[][]) {
                byte[][] bArr = (byte[][]) objM;
                defpackage.dzk.x(str);
                defpackage.dzk.x(bArr);
                pv.d(str);
                while (i < bArr.length) {
                    if (bArr[i] == null) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "The byte[] at ", " is null."));
                    }
                    i++;
                }
                sk skVar5 = new sk(str);
                skVar5.c(bArr);
                sdVar.b(str, skVar5.a());
            } else if (objM instanceof android.app.appsearch.GenericDocument[]) {
                android.app.appsearch.GenericDocument[] genericDocumentArr = (android.app.appsearch.GenericDocument[]) objM;
                pw[] pwVarArr = new pw[genericDocumentArr.length];
                while (i < genericDocumentArr.length) {
                    pwVarArr[i] = e(genericDocumentArr[i], rfVar);
                    i++;
                }
                pvVar.c(str, pwVarArr);
            } else if (android.os.Build.VERSION.SDK_INT >= 36 && (objM instanceof android.app.appsearch.EmbeddingVector[])) {
                rk.b(pvVar, str, (android.app.appsearch.EmbeddingVector[]) objM, rfVar);
            } else {
                if (android.os.Build.VERSION.SDK_INT < 36 || !(objM instanceof android.app.appsearch.AppSearchBlobHandle[])) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Property \"%s\" has unsupported value type %s", str, objM.getClass().toString()));
                }
                rk.a(pvVar, str, (android.app.appsearch.AppSearchBlobHandle[]) objM);
            }
        }
        return pvVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:106:0x017a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    public static final void f(defpackage.css cssVar, java.lang.String str, defpackage.cmw cmwVar, defpackage.cmj cmjVar, cwy cwyVar, float f, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.cmj cmjVar2;
        int i5;
        int i6;
        cwy cwyVar2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        boolean z;
        defpackage.cmj cmjVar3;
        cwy cwyVar3;
        float f3;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar3;
        defpackage.cmj cmjVar4;
        cwy cwyVar4;
        float f4;
        defpackage.cmw dhsVar;
        defpackage.cbt cbtVar;
        java.lang.Object objR;
        defpackage.aomy aomyVar;
        int i11;
        defpackage.cbt cbtVar2;
        java.lang.Object objR2;
        int i12 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1142754848);
        if (i12 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(cssVar) : cavVarB.D(cssVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(str) ? 16 : 32;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    cmjVar2 = cmjVar;
                    if (true != cavVarB.B(cmjVar2)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        cwyVar2 = cwyVar;
                        if (true != cavVarB.B(cwyVar2)) {
                            i7 = 8192;
                        } else {
                            i7 = 16384;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (true != cavVarB.y(f2)) {
                                i9 = 65536;
                            } else {
                                i9 = 131072;
                            }
                            i3 |= i9;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (true != cavVarB.B(null)) {
                                i10 = 524288;
                            } else {
                                i10 = 1048576;
                            }
                            i3 |= i10;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cavVarB.H(z, i3 & 1)) {
                            if (i13 != 0) {
                                cmwVar3 = defpackage.cmw.c;
                            } else {
                                cmwVar3 = cmwVar2;
                            }
                            if (i4 != 0) {
                                cmjVar4 = defpackage.cmh.e;
                            } else {
                                cmjVar4 = cmjVar2;
                            }
                            if (i6 != 0) {
                                cwyVar4 = defpackage.cwx.b;
                            } else {
                                cwyVar4 = cwyVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (str != null) {
                                cavVarB.u(1899222916);
                                i11 = i3 & 112;
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (i11 != 32 || objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.agb(str, 14);
                                    cbtVar2.ab(objR2);
                                }
                                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dig.a;
                                dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                                cbtVar2.W(false);
                            } else {
                                cavVarB.u(1899381698);
                                ((defpackage.cbt) cavVarB).W(false);
                                dhsVar = defpackage.cmw.c;
                            }
                            defpackage.cmw cmwVarJ = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = bgg.b;
                                cbtVar.ab(objR);
                            }
                            defpackage.cye cyeVar = (defpackage.cye) objR;
                            long j = cbtVar.x;
                            long j2 = j ^ (j >>> 32);
                            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarJ);
                            defpackage.cje cjeVarAi = cbtVar.ai();
                            aomyVar = defpackage.dam.a;
                            cavVarB.v();
                            if (cbtVar.w) {
                                cavVarB.j(aomyVar);
                            } else {
                                cavVarB.x();
                            }
                            defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
                            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
                            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
                            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
                            cbtVar.W(true);
                            cwyVar3 = cwyVar4;
                            f3 = f4;
                            cmwVar2 = cmwVar3;
                            cmjVar3 = cmjVar4;
                        } else {
                            cavVarB.s();
                            cmjVar3 = cmjVar2;
                            cwyVar3 = cwyVar2;
                            f3 = f2;
                        }
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (true != cavVarB.B(null)) {
                            i10 = 524288;
                        } else {
                            i10 = 1048576;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i3 & 1)) {
                        if (i13 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar2;
                        }
                        if (i4 != 0) {
                            cmjVar4 = defpackage.cmh.e;
                        } else {
                            cmjVar4 = cmjVar2;
                        }
                        if (i6 != 0) {
                            cwyVar4 = defpackage.cwx.b;
                        } else {
                            cwyVar4 = cwyVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (str != null) {
                            cavVarB.u(1899222916);
                            i11 = i3 & 112;
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (i11 != 32) {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.dig.a;
                            dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                            cbtVar2.W(false);
                        } else {
                            cavVarB.u(1899381698);
                            ((defpackage.cbt) cavVarB).W(false);
                            dhsVar = defpackage.cmw.c;
                        }
                        defpackage.cmw cmwVarJ2 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = bgg.b;
                            cbtVar.ab(objR);
                        }
                        defpackage.cye cyeVar2 = (defpackage.cye) objR;
                        long j3 = cbtVar.x;
                        long j4 = j3 ^ (j3 >>> 32);
                        defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarJ2);
                        defpackage.cje cjeVarAi2 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVarB.v();
                        if (cbtVar.w) {
                            cavVarB.j(aomyVar);
                        } else {
                            cavVarB.x();
                        }
                        defpackage.cev.c(cavVarB, cyeVar2, defpackage.dam.e);
                        defpackage.cev.c(cavVarB, cjeVarAi2, defpackage.dam.d);
                        cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVarB, cmwVarM2, defpackage.dam.c);
                        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j4), defpackage.dam.f);
                        cbtVar.W(true);
                        cwyVar3 = cwyVar4;
                        f3 = f4;
                        cmwVar2 = cmwVar3;
                        cmjVar3 = cmjVar4;
                    } else {
                        cavVarB.s();
                        cmjVar3 = cmjVar2;
                        cwyVar3 = cwyVar2;
                        f3 = f2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                    }
                }
                i3 |= 24576;
                cwyVar2 = cwyVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (true != cavVarB.B(null)) {
                            i10 = 524288;
                        } else {
                            i10 = 1048576;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i3 & 1)) {
                        if (i13 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar2;
                        }
                        if (i4 != 0) {
                            cmjVar4 = defpackage.cmh.e;
                        } else {
                            cmjVar4 = cmjVar2;
                        }
                        if (i6 != 0) {
                            cwyVar4 = defpackage.cwx.b;
                        } else {
                            cwyVar4 = cwyVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (str != null) {
                            cavVarB.u(1899222916);
                            i11 = i3 & 112;
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (i11 != 32) {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger3 = defpackage.dig.a;
                            dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                            cbtVar2.W(false);
                        } else {
                            cavVarB.u(1899381698);
                            ((defpackage.cbt) cavVarB).W(false);
                            dhsVar = defpackage.cmw.c;
                        }
                        defpackage.cmw cmwVarJ3 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = bgg.b;
                            cbtVar.ab(objR);
                        }
                        defpackage.cye cyeVar3 = (defpackage.cye) objR;
                        long j5 = cbtVar.x;
                        long j6 = j5 ^ (j5 >>> 32);
                        defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVarB, cmwVarJ3);
                        defpackage.cje cjeVarAi3 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVarB.v();
                        if (cbtVar.w) {
                            cavVarB.j(aomyVar);
                        } else {
                            cavVarB.x();
                        }
                        defpackage.cev.c(cavVarB, cyeVar3, defpackage.dam.e);
                        defpackage.cev.c(cavVarB, cjeVarAi3, defpackage.dam.d);
                        cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVarB, cmwVarM3, defpackage.dam.c);
                        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j6), defpackage.dam.f);
                        cbtVar.W(true);
                        cwyVar3 = cwyVar4;
                        f3 = f4;
                        cmwVar2 = cmwVar3;
                        cmjVar3 = cmjVar4;
                    } else {
                        cavVarB.s();
                        cmjVar3 = cmjVar2;
                        cwyVar3 = cwyVar2;
                        f3 = f2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ4 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar4 = (defpackage.cye) objR;
                    long j7 = cbtVar.x;
                    long j8 = j7 ^ (j7 >>> 32);
                    defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVarB, cmwVarJ4);
                    defpackage.cje cjeVarAi4 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar4, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi4, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM4, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j8), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 3072;
            cmjVar2 = cmjVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    cwyVar2 = cwyVar;
                    if (true != cavVarB.B(cwyVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (true != cavVarB.B(null)) {
                            i10 = 524288;
                        } else {
                            i10 = 1048576;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i3 & 1)) {
                        if (i13 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar2;
                        }
                        if (i4 != 0) {
                            cmjVar4 = defpackage.cmh.e;
                        } else {
                            cmjVar4 = cmjVar2;
                        }
                        if (i6 != 0) {
                            cwyVar4 = defpackage.cwx.b;
                        } else {
                            cwyVar4 = cwyVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (str != null) {
                            cavVarB.u(1899222916);
                            i11 = i3 & 112;
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (i11 != 32) {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger5 = defpackage.dig.a;
                            dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                            cbtVar2.W(false);
                        } else {
                            cavVarB.u(1899381698);
                            ((defpackage.cbt) cavVarB).W(false);
                            dhsVar = defpackage.cmw.c;
                        }
                        defpackage.cmw cmwVarJ5 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = bgg.b;
                            cbtVar.ab(objR);
                        }
                        defpackage.cye cyeVar5 = (defpackage.cye) objR;
                        long j9 = cbtVar.x;
                        long j10 = j9 ^ (j9 >>> 32);
                        defpackage.cmw cmwVarM5 = defpackage.cfo.m(cavVarB, cmwVarJ5);
                        defpackage.cje cjeVarAi5 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVarB.v();
                        if (cbtVar.w) {
                            cavVarB.j(aomyVar);
                        } else {
                            cavVarB.x();
                        }
                        defpackage.cev.c(cavVarB, cyeVar5, defpackage.dam.e);
                        defpackage.cev.c(cavVarB, cjeVarAi5, defpackage.dam.d);
                        cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVarB, cmwVarM5, defpackage.dam.c);
                        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j10), defpackage.dam.f);
                        cbtVar.W(true);
                        cwyVar3 = cwyVar4;
                        f3 = f4;
                        cmwVar2 = cmwVar3;
                        cmjVar3 = cmjVar4;
                    } else {
                        cavVarB.s();
                        cmjVar3 = cmjVar2;
                        cwyVar3 = cwyVar2;
                        f3 = f2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger6 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ6 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar6 = (defpackage.cye) objR;
                    long j11 = cbtVar.x;
                    long j12 = j11 ^ (j11 >>> 32);
                    defpackage.cmw cmwVarM6 = defpackage.cfo.m(cavVarB, cmwVarJ6);
                    defpackage.cje cjeVarAi6 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar6, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi6, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM6, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j12), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 24576;
            cwyVar2 = cwyVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger7 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ7 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar7 = (defpackage.cye) objR;
                    long j13 = cbtVar.x;
                    long j14 = j13 ^ (j13 >>> 32);
                    defpackage.cmw cmwVarM7 = defpackage.cfo.m(cavVarB, cmwVarJ7);
                    defpackage.cje cjeVarAi7 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar7, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi7, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM7, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j14), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    cmjVar4 = defpackage.cmh.e;
                } else {
                    cmjVar4 = cmjVar2;
                }
                if (i6 != 0) {
                    cwyVar4 = defpackage.cwx.b;
                } else {
                    cwyVar4 = cwyVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (str != null) {
                    cavVarB.u(1899222916);
                    i11 = i3 & 112;
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (i11 != 32) {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger8 = defpackage.dig.a;
                    dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                    cbtVar2.W(false);
                } else {
                    cavVarB.u(1899381698);
                    ((defpackage.cbt) cavVarB).W(false);
                    dhsVar = defpackage.cmw.c;
                }
                defpackage.cmw cmwVarJ8 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = bgg.b;
                    cbtVar.ab(objR);
                }
                defpackage.cye cyeVar8 = (defpackage.cye) objR;
                long j15 = cbtVar.x;
                long j16 = j15 ^ (j15 >>> 32);
                defpackage.cmw cmwVarM8 = defpackage.cfo.m(cavVarB, cmwVarJ8);
                defpackage.cje cjeVarAi8 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVar8, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi8, defpackage.dam.d);
                cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVarB, cmwVarM8, defpackage.dam.c);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j16), defpackage.dam.f);
                cbtVar.W(true);
                cwyVar3 = cwyVar4;
                f3 = f4;
                cmwVar2 = cmwVar3;
                cmjVar3 = cmjVar4;
            } else {
                cavVarB.s();
                cmjVar3 = cmjVar2;
                cwyVar3 = cwyVar2;
                f3 = f2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                cmjVar2 = cmjVar;
                if (true != cavVarB.B(cmjVar2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    cwyVar2 = cwyVar;
                    if (true != cavVarB.B(cwyVar2)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 65536;
                        } else {
                            i9 = 131072;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 64) != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (true != cavVarB.B(null)) {
                            i10 = 524288;
                        } else {
                            i10 = 1048576;
                        }
                        i3 |= i10;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i3 & 1)) {
                        if (i13 != 0) {
                            cmwVar3 = defpackage.cmw.c;
                        } else {
                            cmwVar3 = cmwVar2;
                        }
                        if (i4 != 0) {
                            cmjVar4 = defpackage.cmh.e;
                        } else {
                            cmjVar4 = cmjVar2;
                        }
                        if (i6 != 0) {
                            cwyVar4 = defpackage.cwx.b;
                        } else {
                            cwyVar4 = cwyVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (str != null) {
                            cavVarB.u(1899222916);
                            i11 = i3 & 112;
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (i11 != 32) {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            } else {
                                objR2 = new defpackage.agb(str, 14);
                                cbtVar2.ab(objR2);
                            }
                            java.util.concurrent.atomic.AtomicInteger atomicInteger9 = defpackage.dig.a;
                            dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                            cbtVar2.W(false);
                        } else {
                            cavVarB.u(1899381698);
                            ((defpackage.cbt) cavVarB).W(false);
                            dhsVar = defpackage.cmw.c;
                        }
                        defpackage.cmw cmwVarJ9 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = bgg.b;
                            cbtVar.ab(objR);
                        }
                        defpackage.cye cyeVar9 = (defpackage.cye) objR;
                        long j17 = cbtVar.x;
                        long j18 = j17 ^ (j17 >>> 32);
                        defpackage.cmw cmwVarM9 = defpackage.cfo.m(cavVarB, cmwVarJ9);
                        defpackage.cje cjeVarAi9 = cbtVar.ai();
                        aomyVar = defpackage.dam.a;
                        cavVarB.v();
                        if (cbtVar.w) {
                            cavVarB.j(aomyVar);
                        } else {
                            cavVarB.x();
                        }
                        defpackage.cev.c(cavVarB, cyeVar9, defpackage.dam.e);
                        defpackage.cev.c(cavVarB, cjeVarAi9, defpackage.dam.d);
                        cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                        defpackage.cev.c(cavVarB, cmwVarM9, defpackage.dam.c);
                        defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j18), defpackage.dam.f);
                        cbtVar.W(true);
                        cwyVar3 = cwyVar4;
                        f3 = f4;
                        cmwVar2 = cmwVar3;
                        cmjVar3 = cmjVar4;
                    } else {
                        cavVarB.s();
                        cmjVar3 = cmjVar2;
                        cwyVar3 = cwyVar2;
                        f3 = f2;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger10 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ10 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar10 = (defpackage.cye) objR;
                    long j19 = cbtVar.x;
                    long j110 = j19 ^ (j19 >>> 32);
                    defpackage.cmw cmwVarM10 = defpackage.cfo.m(cavVarB, cmwVarJ10);
                    defpackage.cje cjeVarAi10 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar10, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi10, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM10, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j110), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 24576;
            cwyVar2 = cwyVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger11 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ11 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar11 = (defpackage.cye) objR;
                    long j111 = cbtVar.x;
                    long j112 = j111 ^ (j111 >>> 32);
                    defpackage.cmw cmwVarM11 = defpackage.cfo.m(cavVarB, cmwVarJ11);
                    defpackage.cje cjeVarAi11 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar11, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi11, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM11, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j112), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    cmjVar4 = defpackage.cmh.e;
                } else {
                    cmjVar4 = cmjVar2;
                }
                if (i6 != 0) {
                    cwyVar4 = defpackage.cwx.b;
                } else {
                    cwyVar4 = cwyVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (str != null) {
                    cavVarB.u(1899222916);
                    i11 = i3 & 112;
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (i11 != 32) {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger12 = defpackage.dig.a;
                    dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                    cbtVar2.W(false);
                } else {
                    cavVarB.u(1899381698);
                    ((defpackage.cbt) cavVarB).W(false);
                    dhsVar = defpackage.cmw.c;
                }
                defpackage.cmw cmwVarJ12 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = bgg.b;
                    cbtVar.ab(objR);
                }
                defpackage.cye cyeVar12 = (defpackage.cye) objR;
                long j113 = cbtVar.x;
                long j114 = j113 ^ (j113 >>> 32);
                defpackage.cmw cmwVarM12 = defpackage.cfo.m(cavVarB, cmwVarJ12);
                defpackage.cje cjeVarAi12 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVar12, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi12, defpackage.dam.d);
                cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVarB, cmwVarM12, defpackage.dam.c);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j114), defpackage.dam.f);
                cbtVar.W(true);
                cwyVar3 = cwyVar4;
                f3 = f4;
                cmwVar2 = cmwVar3;
                cmjVar3 = cmjVar4;
            } else {
                cavVarB.s();
                cmjVar3 = cmjVar2;
                cwyVar3 = cwyVar2;
                f3 = f2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
            }
        }
        i3 |= 3072;
        cmjVar2 = cmjVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                cwyVar2 = cwyVar;
                if (true != cavVarB.B(cwyVar2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 65536;
                    } else {
                        i9 = 131072;
                    }
                    i3 |= i9;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (true != cavVarB.B(null)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i3 |= i10;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i13 != 0) {
                        cmwVar3 = defpackage.cmw.c;
                    } else {
                        cmwVar3 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cmjVar4 = defpackage.cmh.e;
                    } else {
                        cmjVar4 = cmjVar2;
                    }
                    if (i6 != 0) {
                        cwyVar4 = defpackage.cwx.b;
                    } else {
                        cwyVar4 = cwyVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (str != null) {
                        cavVarB.u(1899222916);
                        i11 = i3 & 112;
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (i11 != 32) {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        } else {
                            objR2 = new defpackage.agb(str, 14);
                            cbtVar2.ab(objR2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger13 = defpackage.dig.a;
                        dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                        cbtVar2.W(false);
                    } else {
                        cavVarB.u(1899381698);
                        ((defpackage.cbt) cavVarB).W(false);
                        dhsVar = defpackage.cmw.c;
                    }
                    defpackage.cmw cmwVarJ13 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = bgg.b;
                        cbtVar.ab(objR);
                    }
                    defpackage.cye cyeVar13 = (defpackage.cye) objR;
                    long j115 = cbtVar.x;
                    long j116 = j115 ^ (j115 >>> 32);
                    defpackage.cmw cmwVarM13 = defpackage.cfo.m(cavVarB, cmwVarJ13);
                    defpackage.cje cjeVarAi13 = cbtVar.ai();
                    aomyVar = defpackage.dam.a;
                    cavVarB.v();
                    if (cbtVar.w) {
                        cavVarB.j(aomyVar);
                    } else {
                        cavVarB.x();
                    }
                    defpackage.cev.c(cavVarB, cyeVar13, defpackage.dam.e);
                    defpackage.cev.c(cavVarB, cjeVarAi13, defpackage.dam.d);
                    cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVarB, cmwVarM13, defpackage.dam.c);
                    defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j116), defpackage.dam.f);
                    cbtVar.W(true);
                    cwyVar3 = cwyVar4;
                    f3 = f4;
                    cmwVar2 = cmwVar3;
                    cmjVar3 = cmjVar4;
                } else {
                    cavVarB.s();
                    cmjVar3 = cmjVar2;
                    cwyVar3 = cwyVar2;
                    f3 = f2;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    cmjVar4 = defpackage.cmh.e;
                } else {
                    cmjVar4 = cmjVar2;
                }
                if (i6 != 0) {
                    cwyVar4 = defpackage.cwx.b;
                } else {
                    cwyVar4 = cwyVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (str != null) {
                    cavVarB.u(1899222916);
                    i11 = i3 & 112;
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (i11 != 32) {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger14 = defpackage.dig.a;
                    dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                    cbtVar2.W(false);
                } else {
                    cavVarB.u(1899381698);
                    ((defpackage.cbt) cavVarB).W(false);
                    dhsVar = defpackage.cmw.c;
                }
                defpackage.cmw cmwVarJ14 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = bgg.b;
                    cbtVar.ab(objR);
                }
                defpackage.cye cyeVar14 = (defpackage.cye) objR;
                long j117 = cbtVar.x;
                long j118 = j117 ^ (j117 >>> 32);
                defpackage.cmw cmwVarM14 = defpackage.cfo.m(cavVarB, cmwVarJ14);
                defpackage.cje cjeVarAi14 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVar14, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi14, defpackage.dam.d);
                cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVarB, cmwVarM14, defpackage.dam.c);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j118), defpackage.dam.f);
                cbtVar.W(true);
                cwyVar3 = cwyVar4;
                f3 = f4;
                cmwVar2 = cmwVar3;
                cmjVar3 = cmjVar4;
            } else {
                cavVarB.s();
                cmjVar3 = cmjVar2;
                cwyVar3 = cwyVar2;
                f3 = f2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
            }
        }
        i3 |= 24576;
        cwyVar2 = cwyVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (true != cavVarB.y(f2)) {
                    i9 = 65536;
                } else {
                    i9 = 131072;
                }
                i3 |= i9;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.B(null)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i13 != 0) {
                    cmwVar3 = defpackage.cmw.c;
                } else {
                    cmwVar3 = cmwVar2;
                }
                if (i4 != 0) {
                    cmjVar4 = defpackage.cmh.e;
                } else {
                    cmjVar4 = cmjVar2;
                }
                if (i6 != 0) {
                    cwyVar4 = defpackage.cwx.b;
                } else {
                    cwyVar4 = cwyVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (str != null) {
                    cavVarB.u(1899222916);
                    i11 = i3 & 112;
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (i11 != 32) {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    } else {
                        objR2 = new defpackage.agb(str, 14);
                        cbtVar2.ab(objR2);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger15 = defpackage.dig.a;
                    dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                    cbtVar2.W(false);
                } else {
                    cavVarB.u(1899381698);
                    ((defpackage.cbt) cavVarB).W(false);
                    dhsVar = defpackage.cmw.c;
                }
                defpackage.cmw cmwVarJ15 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = bgg.b;
                    cbtVar.ab(objR);
                }
                defpackage.cye cyeVar15 = (defpackage.cye) objR;
                long j119 = cbtVar.x;
                long j1110 = j119 ^ (j119 >>> 32);
                defpackage.cmw cmwVarM15 = defpackage.cfo.m(cavVarB, cmwVarJ15);
                defpackage.cje cjeVarAi15 = cbtVar.ai();
                aomyVar = defpackage.dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                defpackage.cev.c(cavVarB, cyeVar15, defpackage.dam.e);
                defpackage.cev.c(cavVarB, cjeVarAi15, defpackage.dam.d);
                cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                defpackage.cev.c(cavVarB, cmwVarM15, defpackage.dam.c);
                defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j1110), defpackage.dam.f);
                cbtVar.W(true);
                cwyVar3 = cwyVar4;
                f3 = f4;
                cmwVar2 = cmwVar3;
                cmjVar3 = cmjVar4;
            } else {
                cavVarB.s();
                cmjVar3 = cmjVar2;
                cwyVar3 = cwyVar2;
                f3 = f2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
            }
        }
        i3 |= 196608;
        f2 = f;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != cavVarB.B(null)) {
                i10 = 524288;
            } else {
                i10 = 1048576;
            }
            i3 |= i10;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i3 & 1)) {
            if (i13 != 0) {
                cmwVar3 = defpackage.cmw.c;
            } else {
                cmwVar3 = cmwVar2;
            }
            if (i4 != 0) {
                cmjVar4 = defpackage.cmh.e;
            } else {
                cmjVar4 = cmjVar2;
            }
            if (i6 != 0) {
                cwyVar4 = defpackage.cwx.b;
            } else {
                cwyVar4 = cwyVar2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (str != null) {
                cavVarB.u(1899222916);
                i11 = i3 & 112;
                cbtVar2 = (defpackage.cbt) cavVarB;
                objR2 = cbtVar2.R();
                if (i11 != 32) {
                    objR2 = new defpackage.agb(str, 14);
                    cbtVar2.ab(objR2);
                } else {
                    objR2 = new defpackage.agb(str, 14);
                    cbtVar2.ab(objR2);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger16 = defpackage.dig.a;
                dhsVar = new defpackage.dhs(false, (defpackage.aonj) objR2);
                cbtVar2.W(false);
            } else {
                cavVarB.u(1899381698);
                ((defpackage.cbt) cavVarB).W(false);
                dhsVar = defpackage.cmw.c;
            }
            defpackage.cmw cmwVarJ16 = defpackage.ru.j(defpackage.cfd.K(cmwVar3.a(dhsVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479), cssVar, cmjVar4, cwyVar4, f4, null, 2);
            cbtVar = (defpackage.cbt) cavVarB;
            objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = bgg.b;
                cbtVar.ab(objR);
            }
            defpackage.cye cyeVar16 = (defpackage.cye) objR;
            long j1111 = cbtVar.x;
            long j1112 = j1111 ^ (j1111 >>> 32);
            defpackage.cmw cmwVarM16 = defpackage.cfo.m(cavVarB, cmwVarJ16);
            defpackage.cje cjeVarAi16 = cbtVar.ai();
            aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar16, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi16, defpackage.dam.d);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM16, defpackage.dam.c);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j1112), defpackage.dam.f);
            cbtVar.W(true);
            cwyVar3 = cwyVar4;
            f3 = f4;
            cmwVar2 = cmwVar3;
            cmjVar3 = cmjVar4;
        } else {
            cavVarB.s();
            cmjVar3 = cmjVar2;
            cwyVar3 = cwyVar2;
            f3 = f2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new anr(cssVar, str, cmwVar2, cmjVar3, cwyVar3, f3, i, i2);
        }
    }

    public static final void g(defpackage.csx csxVar, java.lang.String str, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        f(defpackage.sl.f(csxVar, cavVar), str, cmwVar, defpackage.cmh.e, defpackage.cwx.b, 1.0f, cavVar, (i & 112) | 8 | (i & 896), 0);
    }

    public static final void h(defpackage.dao daoVar, defpackage.aonj aonjVar) {
        defpackage.den.o(daoVar, ank.b, new defpackage.agb(aonjVar, 13));
    }

    public static final long i(android.content.res.TypedArray typedArray, int i) {
        return defpackage.cfd.M(typedArray.getColor(i, 0));
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final long j(long r58, float r60) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.j(long, float):long");
    }

    public static final bvy k(android.content.Context context) {
        int[] iArr = bso.a;
        android.content.res.Resources.Theme theme = context.getTheme();
        if (theme == null) {
            theme = context.getResources().newTheme();
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(2132086249, iArr);
        try {
            long jI = i(typedArrayObtainStyledAttributes, 28);
            i(typedArrayObtainStyledAttributes, 38);
            i(typedArrayObtainStyledAttributes, 37);
            long jI2 = i(typedArrayObtainStyledAttributes, 36);
            long jI3 = i(typedArrayObtainStyledAttributes, 35);
            i(typedArrayObtainStyledAttributes, 34);
            i(typedArrayObtainStyledAttributes, 33);
            i(typedArrayObtainStyledAttributes, 32);
            long jI4 = i(typedArrayObtainStyledAttributes, 31);
            long jI5 = i(typedArrayObtainStyledAttributes, 30);
            long jI6 = i(typedArrayObtainStyledAttributes, 29);
            long jI7 = i(typedArrayObtainStyledAttributes, 27);
            i(typedArrayObtainStyledAttributes, 26);
            long jI8 = i(typedArrayObtainStyledAttributes, 41);
            i(typedArrayObtainStyledAttributes, 51);
            i(typedArrayObtainStyledAttributes, 50);
            long jI9 = i(typedArrayObtainStyledAttributes, 49);
            long jI10 = i(typedArrayObtainStyledAttributes, 48);
            i(typedArrayObtainStyledAttributes, 47);
            i(typedArrayObtainStyledAttributes, 46);
            i(typedArrayObtainStyledAttributes, 45);
            long jI11 = i(typedArrayObtainStyledAttributes, 44);
            long jI12 = i(typedArrayObtainStyledAttributes, 43);
            long jI13 = i(typedArrayObtainStyledAttributes, 42);
            long jI14 = i(typedArrayObtainStyledAttributes, 40);
            i(typedArrayObtainStyledAttributes, 39);
            long jI15 = i(typedArrayObtainStyledAttributes, 54);
            i(typedArrayObtainStyledAttributes, 64);
            i(typedArrayObtainStyledAttributes, 63);
            long jI16 = i(typedArrayObtainStyledAttributes, 62);
            long jI17 = i(typedArrayObtainStyledAttributes, 61);
            i(typedArrayObtainStyledAttributes, 60);
            i(typedArrayObtainStyledAttributes, 59);
            i(typedArrayObtainStyledAttributes, 58);
            long jI18 = i(typedArrayObtainStyledAttributes, 57);
            long jI19 = i(typedArrayObtainStyledAttributes, 56);
            long jI20 = i(typedArrayObtainStyledAttributes, 55);
            long jI21 = i(typedArrayObtainStyledAttributes, 53);
            i(typedArrayObtainStyledAttributes, 52);
            i(typedArrayObtainStyledAttributes, 2);
            i(typedArrayObtainStyledAttributes, 12);
            j(i(typedArrayObtainStyledAttributes, 5), 98.0f);
            j(i(typedArrayObtainStyledAttributes, 5), 96.0f);
            i(typedArrayObtainStyledAttributes, 11);
            j(i(typedArrayObtainStyledAttributes, 5), 94.0f);
            j(i(typedArrayObtainStyledAttributes, 5), 92.0f);
            i(typedArrayObtainStyledAttributes, 10);
            j(i(typedArrayObtainStyledAttributes, 5), 87.0f);
            i(typedArrayObtainStyledAttributes, 9);
            i(typedArrayObtainStyledAttributes, 8);
            i(typedArrayObtainStyledAttributes, 7);
            i(typedArrayObtainStyledAttributes, 6);
            i(typedArrayObtainStyledAttributes, 5);
            i(typedArrayObtainStyledAttributes, 4);
            j(i(typedArrayObtainStyledAttributes, 5), 24.0f);
            j(i(typedArrayObtainStyledAttributes, 5), 22.0f);
            i(typedArrayObtainStyledAttributes, 3);
            j(i(typedArrayObtainStyledAttributes, 5), 17.0f);
            j(i(typedArrayObtainStyledAttributes, 5), 12.0f);
            i(typedArrayObtainStyledAttributes, 1);
            j(i(typedArrayObtainStyledAttributes, 5), 6.0f);
            j(i(typedArrayObtainStyledAttributes, 5), 4.0f);
            i(typedArrayObtainStyledAttributes, 0);
            long jI22 = i(typedArrayObtainStyledAttributes, 15);
            i(typedArrayObtainStyledAttributes, 25);
            long j = j(i(typedArrayObtainStyledAttributes, 18), 98.0f);
            long j2 = j(i(typedArrayObtainStyledAttributes, 18), 96.0f);
            long jI23 = i(typedArrayObtainStyledAttributes, 24);
            long j3 = j(i(typedArrayObtainStyledAttributes, 18), 94.0f);
            long j4 = j(i(typedArrayObtainStyledAttributes, 18), 92.0f);
            long jI24 = i(typedArrayObtainStyledAttributes, 23);
            long j5 = j(i(typedArrayObtainStyledAttributes, 18), 87.0f);
            long jI25 = i(typedArrayObtainStyledAttributes, 22);
            i(typedArrayObtainStyledAttributes, 21);
            long jI26 = i(typedArrayObtainStyledAttributes, 20);
            long jI27 = i(typedArrayObtainStyledAttributes, 19);
            i(typedArrayObtainStyledAttributes, 18);
            return new bvy(jI22, j, j2, jI23, j3, j4, jI24, j5, jI25, jI26, jI27, i(typedArrayObtainStyledAttributes, 17), j(i(typedArrayObtainStyledAttributes, 18), 24.0f), j(i(typedArrayObtainStyledAttributes, 18), 22.0f), i(typedArrayObtainStyledAttributes, 16), j(i(typedArrayObtainStyledAttributes, 18), 17.0f), j(i(typedArrayObtainStyledAttributes, 18), 12.0f), i(typedArrayObtainStyledAttributes, 14), j(i(typedArrayObtainStyledAttributes, 18), 6.0f), j(i(typedArrayObtainStyledAttributes, 18), 4.0f), i(typedArrayObtainStyledAttributes, 13), jI, jI2, jI3, jI4, jI5, jI6, jI7, jI8, jI9, jI10, jI11, jI12, jI13, jI14, jI15, jI16, jI17, jI18, jI19, jI20, jI21);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final void l(defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVarB = cavVar.b(75144485);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.cmw cmwVarE = defpackage.azm.e(defpackage.azm.d(cmwVar, 1.0f), 1.0f);
            boolean z2 = (i2 & 112) == 32;
            if ((((i2 & 896) ^ 384) <= 256 || !cavVarB.A(j)) && (i2 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            java.lang.Object objR = cbtVar.R();
            if (z3 || objR == defpackage.cau.a) {
                objR = new bpd(j, 0);
                cbtVar.ab(objR);
            }
            yt.a(cmwVarE, (defpackage.aonj) objR, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(cmwVar, j, i, 0);
        }
    }

    public static final void m(defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1534852205);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(1.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.cmw cmwVarK = defpackage.azm.k(defpackage.azm.b(cmwVar, 1.0f), 1.0f);
            boolean z = ((i2 & 112) == 32) | ((((i2 & 896) ^ 384) > 256 && cavVarB.A(j)) || (i2 & 384) == 256);
            java.lang.Object objR = cbtVar.R();
            if (z || objR == defpackage.cau.a) {
                objR = new bpd(j, 1);
                cbtVar.ab(objR);
            }
            yt.a(cmwVarK, (defpackage.aonj) objR, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(cmwVar, j, i, 1);
        }
    }

    public static /* synthetic */ defpackage.aojh n(defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVar, 0);
            long jA = cavVar.a();
            long j = jA ^ (jA >>> 32);
            defpackage.cje cjeVarM = cavVar.M();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmtVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            defpackage.cev.c(cavVar, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
            defpackage.cev.c(cavVar, java.lang.Integer.valueOf((int) j), defpackage.dam.f);
            cavVar.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
            aonoVar.a(defpackage.awy.a, cavVar, 6);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static final void o(defpackage.cmw cmwVar, defpackage.crd crdVar, defpackage.bnw bnwVar, defpackage.bnx bnxVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.crd crdVar2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1359693790);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            crdVar2 = crdVar;
            i2 |= true != cavVarB.B(crdVar2) ? 16 : 32;
        } else {
            crdVar2 = crdVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bnwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bnxVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            defpackage.bvo.b(cmwVar, crdVar2, bnwVar.a(true), bnwVar.b(true), 0.0f, ((defpackage.dpi) bnxVar.a(true, null, cavVarB, ((i2 >> 3) & 896) | 54).a()).a, null, defpackage.cfo.j(-97109725, new defpackage.axo(aonoVar, 18), cavVarB), cavVar2, 16);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(cmwVar, crdVar, bnwVar, bnxVar, aonoVar, i, 3);
        }
    }

    public static final void p(defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, defpackage.bnw bnwVar, defpackage.bnx bnxVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2136075085);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(bnwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bnxVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B(null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 33554432 : 67108864;
        }
        if (cavVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(1577873102);
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.kaw kawVar = (defpackage.kaw) objR;
            cbtVar.W(false);
            int i4 = i2;
            defpackage.bvo.d(aomyVar, cmwVar, z, crdVar, bnwVar.a(z), bnwVar.b(z), 0.0f, ((defpackage.dpi) bnxVar.a(z, kawVar, cavVarB, ((i4 >> 6) & 14) | ((i4 >> 9) & 896)).a()).a, null, kawVar, defpackage.cfo.j(-1347531112, new defpackage.axo(aonoVar, 17), cavVarB), cavVarB, 64);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmp(aomyVar, cmwVar, z, crdVar, bnwVar, bnxVar, aonoVar, i, 2);
        }
    }

    public static final float q(bns bnsVar) {
        if (bnsVar != null) {
            return bnsVar.a;
        }
        return 0.0f;
    }

    public static final bns r(defpackage.cxe cxeVar) {
        java.lang.Object objG = cxeVar.g();
        if (objG instanceof bns) {
            return (bns) objG;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[PHI: r4 r10
      0x0059: PHI (r4v2 long) = (r4v1 long), (r4v3 long) binds: [B:18:0x0053, B:24:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r10v2 aomy) = (r10v1 aomy), (r10v3 aomy) binds: [B:18:0x0053, B:24:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object s(defpackage.aomy r10, defpackage.aoln r11) {
        /*
            boolean r0 = r11 instanceof bno
            if (r0 == 0) goto L13
            r0 = r11
            bno r0 = (bno) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bno r0 = new bno
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r4 = r0.a
            bll r10 = r0.d
            defpackage.aooc.af(r11)
            goto L7b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            bll r10 = r0.d
            defpackage.aooc.af(r11)
            goto L53
        L3c:
            defpackage.aooc.af(r11)
            bcm r11 = new bcm
            r2 = 18
            r11.<init>(r2)
            r2 = r10
            bll r2 = (bll) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r11 = defpackage.cdh.e(r11, r0)
            if (r11 == r1) goto L8a
        L53:
            java.lang.Number r11 = (java.lang.Number) r11
            long r4 = r11.longValue()
        L59:
            java.lang.Object r11 = r10.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L88
            bcm r11 = new bcm
            r2 = 19
            r11.<init>(r2)
            r2 = r10
            bll r2 = (bll) r2
            r0.d = r2
            r0.a = r4
            r0.c = r3
            java.lang.Object r11 = defpackage.cdh.e(r11, r0)
            if (r11 == r1) goto L8a
        L7b:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r6 = r6 - r4
            r8 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L59
        L88:
            aojh r1 = defpackage.aojh.a
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.s(aomy, aoln):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: cav
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void t(defpackage.aono r18, defpackage.cmw r19, defpackage.awa r20, defpackage.cmn r21, defpackage.aonj r22, defpackage.cav r23, int r24) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.t(aono, cmw, awa, cmn, aonj, cav, int):void");
    }

    public static final defpackage.vx u(defpackage.cer cerVar) {
        return (defpackage.vx) cerVar.a();
    }
}
