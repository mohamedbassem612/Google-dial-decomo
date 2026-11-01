package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cax {
    public static final java.lang.Object a = new defpackage.cct("provider");
    public static final java.lang.Object b = new defpackage.cct("provider");
    public static final java.lang.Object c = new defpackage.cct("compositionLocalMap");
    public static final java.lang.Object d = new defpackage.cct("providers");
    public static final java.lang.Object e = new defpackage.cct("reference");

    public static final java.lang.Void a(java.lang.String str) {
        throw new cas(defpackage.a.bk(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void b(java.lang.String str) {
        throw new cas(defpackage.a.bk(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void c(defpackage.cfp cfpVar, defpackage.cjh cjhVar) {
        int i;
        int i2;
        int i3 = cfpVar.o;
        int iL = cfpVar.l(i3);
        int iG = cfpVar.g();
        int iJ = cfpVar.j(i3) + i3;
        defpackage.acq acqVar = null;
        int i4 = i3;
        defpackage.acm acmVar = null;
        while (i4 < iJ) {
            int i5 = i4 + 1;
            int iC = cfpVar.c(i5);
            for (int iC2 = cfpVar.c(i4); iC2 < iC; iC2++) {
                java.lang.Object obj = cfpVar.c[cfpVar.e(iC2)];
                boolean z = obj instanceof defpackage.cdw;
                if (!z || (i2 = defpackage.cbu.d((defpackage.cdw) obj).a) < 0) {
                    if (obj instanceof defpackage.cap) {
                        cjhVar.g((defpackage.cap) obj);
                    }
                    if (z) {
                        cjhVar.e((defpackage.cdw) obj);
                    }
                    if (obj instanceof defpackage.cdk) {
                        ((defpackage.cdk) obj).c();
                    }
                } else {
                    int iB = cfpVar.b(i4, i2);
                    if (acqVar == null) {
                        int[] iArr = defpackage.acr.a;
                        acqVar = new defpackage.acq(6);
                    }
                    if (acmVar == null) {
                        acmVar = new defpackage.acm(16);
                    }
                    acqVar.d(iB);
                    acmVar.f(iB);
                    acmVar.f(iC2);
                }
            }
            int iL2 = i5 < iG ? cfpVar.l(i5) : -1;
            if (iL2 == i4) {
                i = iG;
            } else {
                while (true) {
                    if (acmVar == null || acqVar == null || !acqVar.e(i4)) {
                        i = iG;
                    } else {
                        int i6 = acmVar.b;
                        int i7 = i6 / 2;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < i7) {
                            int i10 = i8 << 1;
                            int i11 = iG;
                            int iA = acmVar.a(i10);
                            if (iA == i4) {
                                java.lang.Object obj2 = cfpVar.c[cfpVar.e(acmVar.a(i10 + 1))];
                                if (obj2 instanceof defpackage.cap) {
                                    cjhVar.g((defpackage.cap) obj2);
                                }
                                if (obj2 instanceof defpackage.cdw) {
                                    cjhVar.e((defpackage.cdw) obj2);
                                }
                                if (obj2 instanceof defpackage.cdk) {
                                    ((defpackage.cdk) obj2).c();
                                }
                            } else if (i10 != i9) {
                                int i12 = i9 + 1;
                                acmVar.i(i9, iA);
                                i9 += 2;
                                acmVar.i(i12, acmVar.a(i10 + 1));
                            } else {
                                i9 += 2;
                            }
                            i8++;
                            cjhVar = cjhVar;
                            iG = i11;
                        }
                        i = iG;
                        if (i9 != i6) {
                            acmVar.d(i9, i6);
                        }
                    }
                    if (i4 == i3 || iL == iL2) {
                        break;
                    }
                    i4 = iL;
                    iG = i;
                    iL = cfpVar.l(iL);
                    cjhVar = cjhVar;
                }
            }
            iL = iL2;
            i4 = i5;
            iG = i;
        }
        cfpVar.T();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0293  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final vk d(defpackage.cbb cbbVar, cck cckVar, defpackage.cfp cfpVar, defpackage.cah cahVar) {
        defpackage.cfh cfhVar;
        int i;
        java.util.List arrayList;
        long[] jArr;
        int i2;
        defpackage.cfh cfhVar2;
        int i3;
        int i4;
        long j;
        char c2;
        boolean zB;
        java.lang.Object obj;
        int i5;
        int i6;
        long j2;
        java.lang.Object obj2;
        cck cckVar2 = cckVar;
        defpackage.cfm cfmVar = new defpackage.cfm();
        if (cfpVar.e != null) {
            cfmVar.b();
        }
        if (cfpVar.s != null) {
            cfmVar.a();
        }
        int i7 = cfpVar.o;
        if (cahVar != null && cfpVar.k(i7) > 0) {
            int iL = cfpVar.q;
            while (iL > 0 && !cfpVar.S(iL)) {
                iL = cfpVar.l(iL);
            }
            if (iL >= 0 && cfpVar.S(iL)) {
                java.lang.Object objT = cfpVar.t(iL);
                int i8 = iL + 1;
                int iJ = iL + cfpVar.j(iL);
                int iK = 0;
                while (i8 < iJ) {
                    int iJ2 = cfpVar.j(i8) + i8;
                    if (iJ2 > i7) {
                        break;
                    }
                    iK += cfpVar.S(i8) ? 1 : cfpVar.k(i8);
                    i8 = iJ2;
                }
                int iK2 = cfpVar.S(i7) ? 1 : cfpVar.k(i7);
                cahVar.d(objT);
                cahVar.l(iK, iK2);
                cahVar.h();
            }
        }
        defpackage.cfh cfhVar3 = cckVar2.g;
        if (cfhVar3.a()) {
            if (cbbVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            }
            if (cbbVar.q.e > 0) {
                arrayList = new java.util.ArrayList();
                defpackage.adw adwVar = cbbVar.q;
                long[] jArr2 = adwVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j3 = jArr2[i9];
                        i = 1;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = (~(i9 - length)) >>> 31;
                            int i11 = 0;
                            while (true) {
                                i2 = 8 - i10;
                                if (i11 >= i2) {
                                    break;
                                }
                                if ((j3 & 255) < 128) {
                                    int i12 = (i9 << 3) + i11;
                                    int i13 = 8;
                                    java.lang.Object obj3 = adwVar.b[i12];
                                    cfhVar2 = cfhVar3;
                                    java.lang.Object obj4 = adwVar.c[i12];
                                    if (obj3 == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                                    }
                                    if (obj4 instanceof defpackage.ady) {
                                        if (obj4 == null) {
                                            defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                            obj4 = null;
                                        }
                                        defpackage.ady adyVar = (defpackage.ady) obj4;
                                        java.lang.Object[] objArr = adyVar.b;
                                        long[] jArr3 = adyVar.a;
                                        i3 = i10;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i14 = 0;
                                            while (true) {
                                                long j4 = jArr3[i14];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                    int i16 = 0;
                                                    while (i16 < i15) {
                                                        if ((j4 & 255) < 128) {
                                                            i5 = i16;
                                                            int i17 = (i14 << 3) + i5;
                                                            i6 = i11;
                                                            java.lang.Object obj5 = objArr[i17];
                                                            j2 = j4;
                                                            defpackage.cdk cdkVar = (defpackage.cdk) obj3;
                                                            defpackage.cfh cfhVar4 = cdkVar.e;
                                                            if (cfhVar4 != null) {
                                                                obj2 = obj3;
                                                                if (cfpVar.Q(defpackage.cfd.c(cfhVar2), defpackage.cfd.c(cfhVar4))) {
                                                                    arrayList.add(new defpackage.aoiu(cdkVar, obj5));
                                                                    adyVar.i(i17);
                                                                }
                                                            }
                                                            j4 = j2 >> i13;
                                                            i16 = i5 + 1;
                                                            i11 = i6;
                                                            obj3 = obj2;
                                                        } else {
                                                            i5 = i16;
                                                            i6 = i11;
                                                            j2 = j4;
                                                        }
                                                        obj2 = obj3;
                                                        j4 = j2 >> i13;
                                                        i16 = i5 + 1;
                                                        i11 = i6;
                                                        obj3 = obj2;
                                                    }
                                                    i4 = i11;
                                                    obj = obj3;
                                                    if (i15 != i13) {
                                                        break;
                                                    }
                                                } else {
                                                    i4 = i11;
                                                    obj = obj3;
                                                }
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                i11 = i4;
                                                obj3 = obj;
                                                i13 = 8;
                                            }
                                        } else {
                                            i4 = i11;
                                            j = j3;
                                        }
                                        zB = adyVar.b();
                                    } else {
                                        i3 = i10;
                                        i4 = i11;
                                        j = j3;
                                        if (obj4 == null) {
                                            defpackage.aooh.h("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                            obj4 = null;
                                        }
                                        defpackage.cdk cdkVar2 = (defpackage.cdk) obj3;
                                        defpackage.cfh cfhVar5 = cdkVar2.e;
                                        if (cfhVar5 == null || !cfpVar.Q(defpackage.cfd.c(cfhVar2), defpackage.cfd.c(cfhVar5))) {
                                            zB = false;
                                        } else {
                                            arrayList.add(new defpackage.aoiu(cdkVar2, obj4));
                                            zB = true;
                                        }
                                    }
                                    if (zB) {
                                        adwVar.j(i12);
                                    }
                                    c2 = '\b';
                                } else {
                                    cfhVar2 = cfhVar3;
                                    i3 = i10;
                                    i4 = i11;
                                    j = j3;
                                    c2 = '\b';
                                }
                                j3 = j >> c2;
                                i11 = i4 + 1;
                                cfhVar3 = cfhVar2;
                                jArr2 = jArr2;
                                i10 = i3;
                            }
                            cfhVar = cfhVar3;
                            jArr = jArr2;
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            cfhVar = cfhVar3;
                            jArr = jArr2;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        cfhVar3 = cfhVar;
                        jArr2 = jArr;
                    }
                } else {
                    cfhVar = cfhVar3;
                    i = 1;
                }
            } else {
                cfhVar = cfhVar3;
                i = 1;
                arrayList = defpackage.aokc.a;
            }
            cckVar2 = cckVar;
            cckVar2.d = defpackage.ajsz.bT(cckVar2.d, arrayList);
        } else {
            cfhVar = cfhVar3;
            i = 1;
        }
        defpackage.cfp cfpVarF = cfmVar.f();
        try {
            cfpVarF.w();
            cfpVarF.K(126665345, cckVar2.a);
            cfpVarF.D(cfpVarF.q);
            cfpVarF.X(cckVar2.b);
            defpackage.cfh cfhVarC = defpackage.cfd.c(cfhVar);
            if (cfpVarF.m <= 0) {
                b("Check failed");
            }
            if (cfpVar.m != 0) {
                b("Check failed");
            }
            if (!cfhVarC.a()) {
                b("Check failed");
            }
            int iA = cfpVar.a(cfhVarC) + 1;
            int i18 = cfpVar.o;
            if (i18 > iA || iA >= cfpVar.p) {
                b("Check failed");
            }
            int iL2 = cfpVar.l(iA);
            int iJ3 = cfpVar.j(iA);
            int iK3 = cfpVar.S(iA) ? i : cfpVar.k(iA);
            java.util.List listY = defpackage.den.Y(cfpVar, iA, cfpVarF, false, false, true);
            cfpVar.O(iL2);
            int i19 = iK3 > 0 ? i : 0;
            while (iL2 >= i18) {
                int iH = cfpVar.h(iL2);
                int[] iArr = cfpVar.b;
                int i20 = iH * 5;
                int i21 = i20 + 3;
                iArr[i21] = iArr[i21] - iJ3;
                if (i19 != 0) {
                    int i22 = i20 + 1;
                    int i23 = iArr[i22];
                    if ((1073741824 & i23) == 0) {
                        iArr[i22] = (i23 & (-67108864)) | ((67108863 & i23) - iK3);
                        i19 = i;
                    } else {
                        i19 = 0;
                    }
                } else {
                    i19 = 0;
                }
                iL2 = cfpVar.l(iL2);
            }
            if (i19 != 0) {
                if (cfpVar.n < iK3) {
                    b("Check failed");
                }
                cfpVar.n -= iK3;
            }
            cfpVarF.m();
            cfpVarF.V();
            cfpVarF.y();
            cfpVarF.x(i);
            vk vkVar = new vk(cfmVar, (byte[]) null);
            if (!listY.isEmpty()) {
                int size = listY.size();
                for (int i24 = 0; i24 < size; i24++) {
                    defpackage.cfh cfhVar6 = (defpackage.cfh) listY.get(i24);
                    if (cfmVar.h(cfhVar6)) {
                        int iD = cfmVar.d(cfhVar6);
                        int iD2 = defpackage.cfo.d(cfmVar.a, iD);
                        int i25 = iD + 1;
                        if (((i25 < cfmVar.b ? cfmVar.a[(i25 * 5) + 4] : cfmVar.c.length) - iD2 > 0 ? cfmVar.c[iD2] : defpackage.cau.a) instanceof defpackage.cdk) {
                            caw cawVar = new caw(cbbVar, cckVar2);
                            defpackage.cfp cfpVarF2 = cfmVar.f();
                            try {
                                defpackage.cdh.c(cfpVarF2, listY, cawVar);
                                boolean z = true;
                                break;
                            } finally {
                                cfpVarF2.x(false);
                            }
                        }
                    }
                }
            }
            return vkVar;
        } catch (java.lang.Throwable th) {
            cfpVarF.x(false);
            throw th;
        }
    }
}
