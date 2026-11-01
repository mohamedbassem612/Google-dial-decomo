package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class wi {
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(java.lang.Object obj, defpackage.cmw cmwVar, defpackage.ajl ajlVar, java.lang.String str, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean zD;
        int i5;
        int i6;
        int i7;
        java.lang.String str2;
        defpackage.ajl ajlVar2;
        defpackage.cmw cmwVar3;
        defpackage.cdk cdkVarI;
        int i8;
        defpackage.cmw cmwVar4;
        java.lang.String str3;
        int i9;
        defpackage.ajl ajlVarBv = ajlVar;
        int i10 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-513216493);
        if (i10 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(obj) : cavVarB.D(obj)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if ((i & 512) == 0) {
                    zD = cavVarB.B(ajlVarBv);
                } else {
                    zD = cavVarB.D(ajlVarBv);
                }
                if (true != zD) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != cavVarB.B(str)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (true != cavVarB.D(aonoVar)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if (cavVarB.H((i3 & 9363) != 9362, i3 & 1)) {
                if (i11 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                    i8 = i6;
                } else {
                    i8 = i6;
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    ajlVarBv = defpackage.den.bv(0, 0, null, 7);
                }
                defpackage.ajl ajlVar3 = ajlVarBv;
                if (i8 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 6) & 112)), cmwVar4, ajlVar3, null, aonoVar, cavVarB, i3 & 58352);
                str2 = str3;
                cmwVar3 = cmwVar4;
                ajlVar2 = ajlVar3;
            } else {
                cavVarB.s();
                str2 = str;
                ajlVar2 = ajlVarBv;
                cmwVar3 = cmwVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new dqf(obj, cmwVar3, ajlVar2, str2, aonoVar, i, i2, 1);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zD = cavVarB.B(ajlVarBv);
            } else {
                zD = cavVarB.D(ajlVarBv);
            }
            if (true != zD) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != cavVarB.B(str)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if (true != cavVarB.D(aonoVar)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if (cavVarB.H((i3 & 9363) != 9362, i3 & 1)) {
            if (i11 != 0) {
                cmwVar4 = defpackage.cmw.c;
                i8 = i6;
            } else {
                i8 = i6;
                cmwVar4 = cmwVar2;
            }
            if (i4 != 0) {
                ajlVarBv = defpackage.den.bv(0, 0, null, 7);
            }
            defpackage.ajl ajlVar4 = ajlVarBv;
            if (i8 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str;
            }
            b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 6) & 112)), cmwVar4, ajlVar4, null, aonoVar, cavVarB, i3 & 58352);
            str2 = str3;
            cmwVar3 = cmwVar4;
            ajlVar2 = ajlVar4;
        } else {
            cavVarB.s();
            str2 = str;
            ajlVar2 = ajlVarBv;
            cmwVar3 = cmwVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqf(obj, cmwVar3, ajlVar2, str2, aonoVar, i, i2, 1);
        }
    }

    public static final void b(defpackage.alg algVar, defpackage.cmw cmwVar, defpackage.ajl ajlVar, defpackage.aonj aonjVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        defpackage.aonj aonjVar2;
        char c;
        boolean z;
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1877370462);
        int i3 = i2 == 0 ? (true != cavVarB.B(algVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? cavVarB.B(ajlVar) : cavVarB.D(ajlVar)) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != cavVarB.D(aonoVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = new defpackage.nq(9);
                cbtVar.ab(objR);
            }
            aonjVar2 = (defpackage.aonj) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{algVar.f()}, true));
                cbtVar.ab(objR2);
            }
            java.util.List list = (java.util.List) objR2;
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                long[] jArr = defpackage.adx.a;
                objR3 = new defpackage.adw(6);
                cbtVar.ab(objR3);
            }
            defpackage.adw adwVar = (defpackage.adw) objR3;
            java.lang.Object objH = algVar.h();
            if (defpackage.aooh.n(algVar.f(), objH)) {
                cavVarB.u(321155112);
                if (list.size() == 1 && defpackage.aooh.n(list.get(0), objH)) {
                    cavVarB.u(321479744);
                    cbtVar.W(false);
                    c = ' ';
                } else {
                    cavVarB.u(321289466);
                    boolean zD = cavVarB.D(objH);
                    c = ' ';
                    java.lang.Object objR4 = cbtVar.R();
                    if (zD || objR4 == obj) {
                        objR4 = new defpackage.nm(objH, 14);
                        cbtVar.ab(objR4);
                    }
                    defpackage.ajsz.bw(list, (defpackage.aonj) objR4);
                    adwVar.k();
                    cbtVar.W(false);
                }
                cbtVar.W(false);
            } else {
                c = ' ';
                cavVarB.u(321485696);
                cbtVar.W(false);
            }
            if (defpackage.adw.f(adwVar, objH)) {
                z = false;
                cavVarB.u(322297152);
                cbtVar.W(false);
            } else {
                cavVarB.u(321546611);
                java.util.Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (defpackage.aooh.n(aonjVar2.a(it.next()), aonjVar2.a(objH))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    list.add(objH);
                } else {
                    list.set(i5, objH);
                }
                adwVar.k();
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    java.lang.Object obj2 = list.get(i6);
                    adwVar.n(obj2, defpackage.cfo.j(-934471669, new afp(algVar, ajlVar, obj2, aonoVar), cavVarB));
                }
                z = false;
                cbtVar.W(false);
            }
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, z);
            long j = cbtVar.x;
            long j2 = j ^ (j >>> c);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.a(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(-1312707512);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                java.lang.Object obj3 = list.get(i7);
                cbtVar.Z(1171574969, aonjVar2.a(obj3), 0, null);
                defpackage.aonn aonnVar = (defpackage.aonn) adwVar.a(obj3);
                if (aonnVar == null) {
                    cavVarB.u(1959122128);
                } else {
                    cavVarB.u(1171576145);
                    aonnVar.a(cavVarB, 0);
                }
                cbtVar.W(false);
                cbtVar.W(false);
            }
            cbtVar.W(false);
            cbtVar.W(true);
        } else {
            cavVarB.s();
            aonjVar2 = aonjVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(algVar, cmwVar, ajlVar, aonjVar2, aonoVar, i, 1);
        }
    }

    public static final void c(java.util.List list, java.lang.Object[] objArr) {
        for (java.lang.Object obj : objArr) {
            list.add(obj);
        }
    }

    public static final int d(bcb bcbVar) {
        java.util.List list = bcbVar.l;
        defpackage.aso asoVar = defpackage.aso.a;
        if (list.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            boolean z = bcbVar.o == asoVar;
            int i4 = i(z, bcbVar, i);
            if (i4 == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < list.size() && i(z, bcbVar, i) == i4) {
                    iMax = java.lang.Math.max(iMax, (int) (z ? ((bcc) list.get(i)).j & 4294967295L : ((bcc) list.get(i)).j >> 32));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + bcbVar.q;
    }

    public static final long e(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public static final float f(defpackage.czb czbVar, boolean z, defpackage.czi[] cziVarArr, float f) {
        float f2 = Float.NaN;
        for (defpackage.czi cziVar : cziVarArr) {
            float fQ = czbVar.q(cziVar);
            if (java.lang.Float.isNaN(f2)) {
                f2 = fQ;
            } else if (z == (fQ > f2)) {
                f2 = fQ;
            }
        }
        return !java.lang.Float.isNaN(f2) ? f2 : f;
    }

    public static final defpackage.cmw g(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new cyw(aonjVar));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final defpackage.diy h(defpackage.dao daoVar, defpackage.aonj aonjVar) {
        defpackage.dbk dbkVarA = defpackage.cfo.A(daoVar);
        int i = dbkVarA.c;
        defpackage.diw diwVar = ((defpackage.deg) defpackage.dbn.a(dbkVarA)).o;
        defpackage.diz dizVar = diwVar.c;
        defpackage.aco acoVar = dizVar.g;
        defpackage.diy diyVar = new defpackage.diy(dizVar, i, daoVar, aonjVar);
        java.lang.Object objA = acoVar.a(i);
        if (objA == null) {
            acoVar.g(i, diyVar);
            objA = diyVar;
        }
        defpackage.diy diyVar2 = (defpackage.diy) objA;
        if (diyVar2 != diyVar) {
            while (true) {
                defpackage.diy diyVar3 = diyVar2.b;
                if (diyVar3 == null) {
                    break;
                }
                diyVar2 = diyVar3;
            }
            diyVar2.b = diyVar;
        }
        defpackage.dbk dbkVarA2 = defpackage.cfo.A(daoVar.L());
        if (defpackage.diw.h(dbkVarA2)) {
            diwVar.b.b(diwVar.a(dbkVarA2), true);
        }
        diwVar.d();
        diwVar.i();
        return diyVar;
    }

    private static final int i(boolean z, bcb bcbVar, int i) {
        return z ? ((bcc) bcbVar.l.get(i)).l : ((bcc) bcbVar.l.get(i)).m;
    }
}
