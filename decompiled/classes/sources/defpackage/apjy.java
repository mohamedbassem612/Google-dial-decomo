package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjy implements defpackage.apix {
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    @Override // defpackage.apix
    public final defpackage.apjm a(defpackage.aplr aplrVar) {
        int iBj;
        int iBj2;
        java.lang.String string;
        int i;
        java.lang.String string2;
        java.lang.System.currentTimeMillis();
        defpackage.apjh apjhVar = aplrVar.c;
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        } else {
            defpackage.apie apieVar = apjhVar.e;
            if (apieVar == null) {
                defpackage.apiu apiuVar = apjhVar.c;
                int i2 = defpackage.apie.n;
                int iA = apiuVar.a();
                boolean z = true;
                boolean z2 = true;
                int i3 = 0;
                java.lang.String str = null;
                boolean z3 = false;
                boolean z4 = false;
                int iH = -1;
                int iH2 = -1;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                int iH3 = -1;
                int iH4 = -1;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                while (i3 < iA) {
                    java.lang.String strBe = defpackage.aoov.be(apiuVar, i3);
                    java.lang.String strBf = defpackage.aoov.bf(apiuVar, i3);
                    if (defpackage.aoov.s(strBe, "Cache-Control", z)) {
                        if (str == null) {
                            str = strBf;
                        }
                        iBj = 0;
                        while (iBj < strBf.length()) {
                            iBj2 = defpackage.aoov.bj(strBf, "=,;", iBj);
                            java.lang.String strSubstring = strBf.substring(iBj, iBj2);
                            boolean z11 = z;
                            defpackage.aooh.e(strSubstring, "substring(...)");
                            string = defpackage.aoov.x(strSubstring).toString();
                            defpackage.apiu apiuVar2 = apiuVar;
                            if (iBj2 != strBf.length()) {
                                i = iA;
                                if (strBf.charAt(iBj2) == ',' && strBf.charAt(iBj2) != ';') {
                                    int length = iBj2 + 1;
                                    int i4 = defpackage.apjv.a;
                                    int length2 = strBf.length();
                                    while (true) {
                                        if (length >= length2) {
                                            length = strBf.length();
                                            break;
                                        }
                                        char cCharAt = strBf.charAt(length);
                                        int i5 = length2;
                                        if (cCharAt != ' ' && cCharAt != '\t') {
                                            break;
                                        }
                                        length++;
                                        length2 = i5;
                                    }
                                    if (length >= strBf.length() || strBf.charAt(length) != '\"') {
                                        iBj = defpackage.aoov.bj(strBf, ",;", length);
                                        java.lang.String strSubstring2 = strBf.substring(length, iBj);
                                        defpackage.aooh.e(strSubstring2, "substring(...)");
                                        string2 = defpackage.aoov.x(strSubstring2).toString();
                                    } else {
                                        int i6 = length + 1;
                                        int iM = defpackage.aoov.M(strBf, '\"', i6);
                                        string2 = strBf.substring(i6, iM);
                                        defpackage.aooh.e(string2, "substring(...)");
                                        iBj = iM + 1;
                                    }
                                }
                                z = z11;
                                if (defpackage.aoov.s("no-cache", string, z)) {
                                    z3 = z;
                                } else if (defpackage.aoov.s("no-store", string, z)) {
                                    z4 = z;
                                } else if (defpackage.aoov.s("max-age", string, z)) {
                                    iH = defpackage.apjv.h(string2, -1);
                                } else if (defpackage.aoov.s("s-maxage", string, z)) {
                                    iH2 = defpackage.apjv.h(string2, -1);
                                } else if (defpackage.aoov.s("private", string, z)) {
                                    z5 = z;
                                } else if (defpackage.aoov.s("public", string, z)) {
                                    z6 = z;
                                } else if (defpackage.aoov.s("must-revalidate", string, z)) {
                                    z7 = z;
                                } else if (defpackage.aoov.s("max-stale", string, z)) {
                                    iH3 = defpackage.apjv.h(string2, Integer.MAX_VALUE);
                                } else if (defpackage.aoov.s("min-fresh", string, z)) {
                                    iH4 = defpackage.apjv.h(string2, -1);
                                } else if (defpackage.aoov.s("only-if-cached", string, z)) {
                                    z8 = z;
                                } else if (defpackage.aoov.s("no-transform", string, z)) {
                                    z9 = z;
                                } else if (defpackage.aoov.s("immutable", string, z)) {
                                    z10 = z;
                                }
                                apiuVar = apiuVar2;
                                iA = i;
                            } else {
                                i = iA;
                            }
                            iBj = iBj2 + 1;
                            string2 = null;
                            z = z11;
                            if (defpackage.aoov.s("no-cache", string, z)) {
                                z3 = z;
                            } else if (defpackage.aoov.s("no-store", string, z)) {
                                z4 = z;
                            } else if (defpackage.aoov.s("max-age", string, z)) {
                                iH = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("s-maxage", string, z)) {
                                iH2 = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("private", string, z)) {
                                z5 = z;
                            } else if (defpackage.aoov.s("public", string, z)) {
                                z6 = z;
                            } else if (defpackage.aoov.s("must-revalidate", string, z)) {
                                z7 = z;
                            } else if (defpackage.aoov.s("max-stale", string, z)) {
                                iH3 = defpackage.apjv.h(string2, Integer.MAX_VALUE);
                            } else if (defpackage.aoov.s("min-fresh", string, z)) {
                                iH4 = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("only-if-cached", string, z)) {
                                z8 = z;
                            } else if (defpackage.aoov.s("no-transform", string, z)) {
                                z9 = z;
                            } else if (defpackage.aoov.s("immutable", string, z)) {
                                z10 = z;
                            }
                            apiuVar = apiuVar2;
                            iA = i;
                        }
                        i3++;
                        apiuVar = apiuVar;
                        iA = iA;
                    } else {
                        if (defpackage.aoov.s(strBe, "Pragma", z)) {
                        }
                        i3++;
                        apiuVar = apiuVar;
                        iA = iA;
                    }
                    z2 = false;
                    iBj = 0;
                    while (iBj < strBf.length()) {
                        iBj2 = defpackage.aoov.bj(strBf, "=,;", iBj);
                        java.lang.String strSubstring3 = strBf.substring(iBj, iBj2);
                        boolean z12 = z;
                        defpackage.aooh.e(strSubstring3, "substring(...)");
                        string = defpackage.aoov.x(strSubstring3).toString();
                        defpackage.apiu apiuVar3 = apiuVar;
                        if (iBj2 != strBf.length()) {
                            i = iA;
                            if (strBf.charAt(iBj2) == ',') {
                            }
                            z = z12;
                            if (defpackage.aoov.s("no-cache", string, z)) {
                                z3 = z;
                            } else if (defpackage.aoov.s("no-store", string, z)) {
                                z4 = z;
                            } else if (defpackage.aoov.s("max-age", string, z)) {
                                iH = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("s-maxage", string, z)) {
                                iH2 = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("private", string, z)) {
                                z5 = z;
                            } else if (defpackage.aoov.s("public", string, z)) {
                                z6 = z;
                            } else if (defpackage.aoov.s("must-revalidate", string, z)) {
                                z7 = z;
                            } else if (defpackage.aoov.s("max-stale", string, z)) {
                                iH3 = defpackage.apjv.h(string2, Integer.MAX_VALUE);
                            } else if (defpackage.aoov.s("min-fresh", string, z)) {
                                iH4 = defpackage.apjv.h(string2, -1);
                            } else if (defpackage.aoov.s("only-if-cached", string, z)) {
                                z8 = z;
                            } else if (defpackage.aoov.s("no-transform", string, z)) {
                                z9 = z;
                            } else if (defpackage.aoov.s("immutable", string, z)) {
                                z10 = z;
                            }
                            apiuVar = apiuVar3;
                            iA = i;
                        } else {
                            i = iA;
                        }
                        iBj = iBj2 + 1;
                        string2 = null;
                        z = z12;
                        if (defpackage.aoov.s("no-cache", string, z)) {
                            z3 = z;
                        } else if (defpackage.aoov.s("no-store", string, z)) {
                            z4 = z;
                        } else if (defpackage.aoov.s("max-age", string, z)) {
                            iH = defpackage.apjv.h(string2, -1);
                        } else if (defpackage.aoov.s("s-maxage", string, z)) {
                            iH2 = defpackage.apjv.h(string2, -1);
                        } else if (defpackage.aoov.s("private", string, z)) {
                            z5 = z;
                        } else if (defpackage.aoov.s("public", string, z)) {
                            z6 = z;
                        } else if (defpackage.aoov.s("must-revalidate", string, z)) {
                            z7 = z;
                        } else if (defpackage.aoov.s("max-stale", string, z)) {
                            iH3 = defpackage.apjv.h(string2, Integer.MAX_VALUE);
                        } else if (defpackage.aoov.s("min-fresh", string, z)) {
                            iH4 = defpackage.apjv.h(string2, -1);
                        } else if (defpackage.aoov.s("only-if-cached", string, z)) {
                            z8 = z;
                        } else if (defpackage.aoov.s("no-transform", string, z)) {
                            z9 = z;
                        } else if (defpackage.aoov.s("immutable", string, z)) {
                            z10 = z;
                        }
                        apiuVar = apiuVar3;
                        iA = i;
                    }
                    i3++;
                    apiuVar = apiuVar;
                    iA = iA;
                }
                defpackage.apie apieVar2 = new defpackage.apie(z3, z4, iH, iH2, z5, z6, z7, iH3, iH4, z8, z9, z10, z != z2 ? null : str);
                apjhVar.e = apieVar2;
                apieVar = apieVar2;
            }
            if (apieVar.j) {
                apjhVar = null;
            }
        }
        if (apjhVar != null) {
            defpackage.apjm apjmVarA = aplrVar.a(apjhVar);
            defpackage.apjl apjlVar = new defpackage.apjl(apjmVarA);
            defpackage.apjm apjmVarP = defpackage.aooh.P(apjmVarA);
            if (apjmVarP.i != null) {
                throw new java.lang.IllegalArgumentException("networkResponse.networkResponse != null");
            }
            if (apjmVarP.j != null) {
                throw new java.lang.IllegalArgumentException("networkResponse.priorResponse != null");
            }
            apjlVar.f = apjmVarP;
            return apjlVar.a();
        }
        defpackage.apjl apjlVar2 = new defpackage.apjl();
        apjlVar2.d(aplrVar.c);
        apjlVar2.a = defpackage.apjf.HTTP_1_1;
        apjlVar2.b = 504;
        apjlVar2.c("Unsatisfiable Request (only-if-cached)");
        apjlVar2.h = -1L;
        apjlVar2.i = java.lang.System.currentTimeMillis();
        defpackage.apjm apjmVarA2 = apjlVar2.a();
        defpackage.apis apisVar = aplrVar.a.c;
        return apjmVarA2;
    }
}
