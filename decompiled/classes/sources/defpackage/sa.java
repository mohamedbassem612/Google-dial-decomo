package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class sa {
    static long a(android.content.pm.PackageInfo packageInfo) {
        return ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
    }

    static java.lang.String b(android.content.pm.PackageManager packageManager) {
        return rz$.ExternalSyntheticApiModelOutline1.m(rz$.ExternalSyntheticApiModelOutline1.m(packageManager, "com.android.appsearch", 1));
    }

    public static float c(abr abrVar) {
        return abrVar.a.b;
    }

    public static float d(abr abrVar) {
        return abrVar.a.a;
    }

    public static void e(abr abrVar) {
        if (!abrVar.c()) {
            abrVar.a(0, 0, 0, 0);
            return;
        }
        float fC = c(abrVar);
        float fD = d(abrVar);
        int iCeil = (int) java.lang.Math.ceil(abt.a(fC, fD, abrVar.b()));
        int iCeil2 = (int) java.lang.Math.ceil(abt.b(fC, fD, abrVar.b()));
        abrVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static void f(defpackage.cmw cmwVar, defpackage.awa awaVar, defpackage.awh awhVar, defpackage.cmn cmnVar, int i, int i2, defpackage.aono aonoVar, defpackage.cav cavVar, int i3, int i4) {
        defpackage.cmw cmwVar2;
        int i5;
        defpackage.awa awaVar2;
        int i6;
        defpackage.awh awhVar2;
        int i7;
        int i8;
        defpackage.cmn cmnVar2;
        int i9;
        defpackage.cmw cmwVar3;
        defpackage.awa awaVar3;
        defpackage.awh awhVar3;
        int i10;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        defpackage.awa awaVar4;
        defpackage.awh awhVar4;
        int i11;
        int i12 = i4 & 1;
        defpackage.cav cavVarB = cavVar.b(-1303174015);
        if (i12 != 0) {
            i5 = i3 | 6;
            cmwVar2 = cmwVar;
        } else if ((i3 & 6) == 0) {
            cmwVar2 = cmwVar;
            i5 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i3;
        } else {
            cmwVar2 = cmwVar;
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 == 0) {
            if ((i3 & 48) == 0) {
                awaVar2 = awaVar;
                i5 |= true != cavVarB.B(awaVar2) ? 16 : 32;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    awhVar2 = awhVar;
                    if (true != cavVarB.B(awhVar2)) {
                        i7 = 128;
                    } else {
                        i7 = 256;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 224256;
                if ((1572864 & i3) == 0) {
                    if (true != cavVarB.D(aonoVar)) {
                        i11 = 524288;
                    } else {
                        i11 = 1048576;
                    }
                    i8 |= i11;
                }
                if (cavVarB.H((599187 & i8) != 599186, i8 & 1)) {
                    if (i12 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i13 != 0) {
                        awaVar4 = defpackage.awi.a;
                    } else {
                        awaVar4 = awaVar2;
                    }
                    if (i6 != 0) {
                        awhVar4 = defpackage.awi.c;
                    } else {
                        awhVar4 = awhVar2;
                    }
                    defpackage.cmn cmnVar3 = defpackage.cmh.m;
                    g(cmwVar4, awaVar4, awhVar4, cmnVar3, axw.a, aonoVar, cavVarB, (i8 & 524286) | ((i8 << 3) & 29360128));
                    i10 = Integer.MAX_VALUE;
                    i9 = Integer.MAX_VALUE;
                    cmwVar3 = cmwVar4;
                    awaVar3 = awaVar4;
                    awhVar3 = awhVar4;
                    cmnVar2 = cmnVar3;
                } else {
                    cavVarB.s();
                    cmnVar2 = cmnVar;
                    i9 = i2;
                    cmwVar3 = cmwVar2;
                    awaVar3 = awaVar2;
                    awhVar3 = awhVar2;
                    i10 = i;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new axq(cmwVar3, awaVar3, awhVar3, cmnVar2, i10, i9, aonoVar, i3, i4);
                }
            }
            i5 |= 384;
            awhVar2 = awhVar;
            i8 = i5 | 224256;
            if ((1572864 & i3) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i11 = 524288;
                } else {
                    i11 = 1048576;
                }
                i8 |= i11;
            }
            if (cavVarB.H((599187 & i8) != 599186, i8 & 1)) {
                if (i12 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i13 != 0) {
                    awaVar4 = defpackage.awi.a;
                } else {
                    awaVar4 = awaVar2;
                }
                if (i6 != 0) {
                    awhVar4 = defpackage.awi.c;
                } else {
                    awhVar4 = awhVar2;
                }
                defpackage.cmn cmnVar4 = defpackage.cmh.m;
                g(cmwVar4, awaVar4, awhVar4, cmnVar4, axw.a, aonoVar, cavVarB, (i8 & 524286) | ((i8 << 3) & 29360128));
                i10 = Integer.MAX_VALUE;
                i9 = Integer.MAX_VALUE;
                cmwVar3 = cmwVar4;
                awaVar3 = awaVar4;
                awhVar3 = awhVar4;
                cmnVar2 = cmnVar4;
            } else {
                cavVarB.s();
                cmnVar2 = cmnVar;
                i9 = i2;
                cmwVar3 = cmwVar2;
                awaVar3 = awaVar2;
                awhVar3 = awhVar2;
                i10 = i;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new axq(cmwVar3, awaVar3, awhVar3, cmnVar2, i10, i9, aonoVar, i3, i4);
            }
        }
        i5 |= 48;
        awaVar2 = awaVar;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                awhVar2 = awhVar;
                if (true != cavVarB.B(awhVar2)) {
                    i7 = 128;
                } else {
                    i7 = 256;
                }
                i5 |= i7;
            }
            i8 = i5 | 224256;
            if ((1572864 & i3) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i11 = 524288;
                } else {
                    i11 = 1048576;
                }
                i8 |= i11;
            }
            if (cavVarB.H((599187 & i8) != 599186, i8 & 1)) {
                if (i12 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i13 != 0) {
                    awaVar4 = defpackage.awi.a;
                } else {
                    awaVar4 = awaVar2;
                }
                if (i6 != 0) {
                    awhVar4 = defpackage.awi.c;
                } else {
                    awhVar4 = awhVar2;
                }
                defpackage.cmn cmnVar5 = defpackage.cmh.m;
                g(cmwVar4, awaVar4, awhVar4, cmnVar5, axw.a, aonoVar, cavVarB, (i8 & 524286) | ((i8 << 3) & 29360128));
                i10 = Integer.MAX_VALUE;
                i9 = Integer.MAX_VALUE;
                cmwVar3 = cmwVar4;
                awaVar3 = awaVar4;
                awhVar3 = awhVar4;
                cmnVar2 = cmnVar5;
            } else {
                cavVarB.s();
                cmnVar2 = cmnVar;
                i9 = i2;
                cmwVar3 = cmwVar2;
                awaVar3 = awaVar2;
                awhVar3 = awhVar2;
                i10 = i;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new axq(cmwVar3, awaVar3, awhVar3, cmnVar2, i10, i9, aonoVar, i3, i4);
            }
        }
        i5 |= 384;
        awhVar2 = awhVar;
        i8 = i5 | 224256;
        if ((1572864 & i3) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i11 = 524288;
            } else {
                i11 = 1048576;
            }
            i8 |= i11;
        }
        if (cavVarB.H((599187 & i8) != 599186, i8 & 1)) {
            if (i12 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i13 != 0) {
                awaVar4 = defpackage.awi.a;
            } else {
                awaVar4 = awaVar2;
            }
            if (i6 != 0) {
                awhVar4 = defpackage.awi.c;
            } else {
                awhVar4 = awhVar2;
            }
            defpackage.cmn cmnVar6 = defpackage.cmh.m;
            g(cmwVar4, awaVar4, awhVar4, cmnVar6, axw.a, aonoVar, cavVarB, (i8 & 524286) | ((i8 << 3) & 29360128));
            i10 = Integer.MAX_VALUE;
            i9 = Integer.MAX_VALUE;
            cmwVar3 = cmwVar4;
            awaVar3 = awaVar4;
            awhVar3 = awhVar4;
            cmnVar2 = cmnVar6;
        } else {
            cavVarB.s();
            cmnVar2 = cmnVar;
            i9 = i2;
            cmwVar3 = cmwVar2;
            awaVar3 = awaVar2;
            awhVar3 = awhVar2;
            i10 = i;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axq(cmwVar3, awaVar3, awhVar3, cmnVar2, i10, i9, aonoVar, i3, i4);
        }
    }

    public static void g(defpackage.cmw cmwVar, defpackage.awa awaVar, defpackage.awh awhVar, defpackage.cmn cmnVar, axw axwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3;
        defpackage.cbt cbtVar;
        boolean z;
        java.lang.Object obj;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1956591841);
        if (i4 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(awaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(awhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(cmnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.z(Integer.MAX_VALUE) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.z(Integer.MAX_VALUE) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? cavVarB.B(axwVar) : cavVarB.D(axwVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 4194304 : 8388608;
        }
        int i5 = i2;
        if (cavVarB.H((i5 & 4793491) != 4793490, i5 & 1)) {
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            cbtVar2.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i6 = (i5 & 3670016) ^ 1572864;
            boolean z2 = (i6 > 1048576 && cavVarB.B(axwVar)) || (i5 & 1572864) == 1048576;
            java.lang.Object objR = cbtVar2.R();
            if (z2 || objR == defpackage.cau.a) {
                objR = new axt();
                cbtVar2.ab(objR);
            }
            int i7 = ((i5 >> 3) & 65534) | 262144;
            axt axtVar = (axt) objR;
            boolean zB = ((((i7 & 14) ^ 6) > 4 && cavVarB.B(awaVar)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && cavVarB.B(awhVar)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && cavVarB.B(cmnVar)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && cavVarB.z(Integer.MAX_VALUE)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && cavVarB.z(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | cavVarB.B(axtVar);
            java.lang.Object objR2 = cbtVar2.R();
            if (zB || objR2 == defpackage.cau.a) {
                i3 = i6;
                defpackage.cbt cbtVar3 = cbtVar2;
                axv axvVar = new axv(awaVar, awhVar, awaVar.a(), new axd(cmnVar), awhVar.a(), axtVar);
                cbtVar3.ab(axvVar);
                objR2 = axvVar;
                cbtVar = cbtVar3;
            } else {
                cbtVar = cbtVar2;
                i3 = i6;
            }
            axv axvVar2 = (axv) objR2;
            boolean z3 = (i3 > 1048576 && cavVarB.B(axwVar)) || (i5 & 1572864) == 1048576;
            boolean z4 = (i5 & 29360128) == 8388608;
            boolean z5 = (i5 & 458752) == 131072;
            java.lang.Object objR3 = cbtVar.R();
            if (((z3 | z4) || z5) || objR3 == defpackage.cau.a) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                z = true;
                arrayList.add(new defpackage.cja(-1192950673, true, new defpackage.axo(aonoVar, 0)));
                int[] iArr = axs.a;
                cbtVar.ab(arrayList);
                obj = arrayList;
            } else {
                z = true;
                obj = objR3;
            }
            defpackage.cja cjaVar = new defpackage.cja(1271844412, z, new defpackage.brg((java.util.List) obj, 10));
            boolean zB2 = cavVarB.B(axvVar2);
            java.lang.Object objR4 = cbtVar.R();
            if (zB2 || objR4 == defpackage.cau.a) {
                objR4 = new cyl(axvVar2);
                cbtVar.ab(objR4);
            }
            defpackage.cye cyeVar = (defpackage.cye) objR4;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cjaVar.a(cavVarB, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axp(cmwVar, awaVar, awhVar, cmnVar, axwVar, aonoVar, i, 0);
        }
    }

    public static long h(defpackage.cyd cydVar, long j, defpackage.aonj aonjVar) {
        defpackage.azg azgVarAT = defpackage.den.aT(cydVar);
        if ((azgVarAT != null ? azgVarAT.a : 0.0f) != 0.0f) {
            int iF = cydVar.f(Integer.MAX_VALUE);
            return acl.c(iF, cydVar.e(iF));
        }
        defpackage.den.aT(cydVar);
        defpackage.czc czcVarV = cydVar.v(j);
        aonjVar.a(czcVarV);
        return acl.c(czcVarV.x(), czcVarV.w());
    }

    public static defpackage.cyd i(java.util.Iterator it, defpackage.sl slVar) {
        try {
            if (!(it instanceof axb)) {
                return (defpackage.cyd) it.next();
            }
            if (slVar != null) {
                throw null;
            }
            defpackage.aooh.g();
            throw null;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static defpackage.ctx j(defpackage.csw cswVar) {
        return new defpackage.ctx(cswVar.a, cswVar.b, cswVar.c, cswVar.d, cswVar.e, cswVar.f, cswVar.g, cswVar.h, cswVar.i, cswVar.j);
    }

    public static void k(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List list, float f8, float f9, float f10, float f11, long j, int i, boolean z, java.util.ArrayList arrayList, defpackage.csw cswVar, boolean z2) {
        m(false);
        arrayList.add(new defpackage.csw(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public static void l(float f, float f2, float f3, float f4, long j, int i, boolean z, java.util.ArrayList arrayList, defpackage.csw cswVar, boolean z2) {
        m(false);
        n(arrayList).j.add(j((defpackage.csw) arrayList.remove(arrayList.size() - 1)));
    }

    public static defpackage.csw n(java.util.ArrayList arrayList) {
        return (defpackage.csw) arrayList.get(arrayList.size() - 1);
    }

    public static /* synthetic */ android.graphics.Shader o(long j, float f, java.util.List list, java.util.List list2) {
        cpy.d(list, list2);
        return cqm.a.b(j, f, cpy.e(list), list2 != null ? defpackage.ajsz.cl(list2) : null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object p(java.lang.Object obj, java.lang.Object obj2, float f) {
        if (!defpackage.aooh.n(obj, obj2)) {
            java.lang.Object objC = obj instanceof defpackage.cqq ? obj.c(obj2, f) : null;
            if (objC == null && (obj2 instanceof defpackage.cqq)) {
                objC = obj2.c(obj, 1.0f - f);
            }
            if (objC != null) {
                return objC;
            }
            if (f < 0.5f) {
                return obj;
            }
        } else if (f < 0.5f) {
            return obj;
        }
        return obj2;
    }

    public static void m(boolean z) {
    }
}
