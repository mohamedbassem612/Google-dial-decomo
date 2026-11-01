package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bpa implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bpa(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x037c A[LOOP:8: B:158:0x034b->B:169:0x037c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:342:0x037f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [dan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dan, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        defpackage.bzq bzqVar;
        int i;
        int i2;
        int i3;
        defpackage.dbu dbuVarD;
        defpackage.czb cyyVar;
        char c = 7;
        int i4 = 8;
        defpackage.adq adqVar = null;
        adqVar = null;
        defpackage.adq adqVar2 = null;
        cyyVar = null;
        cyyVar = null;
        defpackage.czb cyyVar2 = null;
        int i5 = 1;
        int i6 = 0;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.a;
                defpackage.bry bryVar = ((defpackage.bqv) defpackage.cfo.G(r0, defpackage.bqx.a)).d;
                defpackage.kaw kawVar = (defpackage.kaw) defpackage.cfo.G(r0, defpackage.bsw.a);
                defpackage.bsu bsuVar = (defpackage.bsu) defpackage.cfo.G(r0, defpackage.bsw.b);
                defpackage.bpc bpcVar = (defpackage.bpc) r0;
                defpackage.bzx bzxVar = bpcVar.i;
                if (bzxVar != null && defpackage.aooh.n(bpcVar.l, kawVar) && defpackage.aooh.n(bpcVar.g, bsuVar) && defpackage.aooh.n(bpcVar.h, bryVar)) {
                    return bzxVar;
                }
                defpackage.bzv bzvVar = bpcVar.d ? new defpackage.bzv() : bzu.a;
                if (bpcVar.e) {
                    java.lang.Object obj = kawVar.a;
                    bzqVar = new defpackage.bzq();
                } else {
                    bzqVar = bzp.a;
                }
                defpackage.bzx bzxVar2 = new defpackage.bzx(bpcVar.a, bpcVar.b, bpcVar.j, bzvVar, bzqVar, new defpackage.bzs(), new defpackage.bzm());
                bpcVar.i = bzxVar2;
                bpcVar.l = kawVar;
                bpcVar.g = bsuVar;
                bpcVar.h = bryVar;
                return bzxVar2;
            case 1:
                ?? r1 = this.a;
                if (((defpackage.bsu) defpackage.cfo.G(r1, defpackage.bsw.b)) == null) {
                    defpackage.bpc bpcVar2 = (defpackage.bpc) r1;
                    defpackage.dao daoVar = bpcVar2.f;
                    if (daoVar != null) {
                        ((defpackage.dap) r1).U(daoVar);
                    }
                    bpcVar2.f = null;
                } else {
                    defpackage.bpc bpcVar3 = (defpackage.bpc) r1;
                    if (bpcVar3.f == null) {
                        defpackage.kaw kawVar2 = bpcVar3.m;
                        defpackage.aomy aomyVar = bpcVar3.k;
                        defpackage.alm almVar = defpackage.bzh.a;
                        defpackage.dap dapVar = new defpackage.dap(kawVar2, aomyVar);
                        ((defpackage.dap) r1).V(dapVar);
                        bpcVar3.f = dapVar;
                    }
                }
                return defpackage.aojh.a;
            case 2:
                ((defpackage.cds) this.a).E();
                return defpackage.aojh.a;
            case 3:
                ((defpackage.cds) this.a).E();
                return defpackage.aojh.a;
            case 4:
                defpackage.cjs cjsVar = (defpackage.cjs) this.a;
                defpackage.ckb ckbVar = cjsVar.a;
                java.lang.Object obj2 = cjsVar.d;
                if (obj2 != null) {
                    return ckbVar.b(cjsVar, obj2);
                }
                throw new java.lang.IllegalArgumentException("Value should be initialized");
            case 5:
                defpackage.kaw kawVar3 = ((defpackage.cka) this.a).a;
                if (kawVar3 == null) {
                    return null;
                }
                android.os.Bundle bundleR = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(new defpackage.aoiu[0], 0));
                kawVar3.af(bundleR);
                if (bundleR.isEmpty()) {
                    return null;
                }
                return bundleR;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.a;
                while (true) {
                    defpackage.clk clkVar = (defpackage.clk) obj3;
                    synchronized (clkVar.e) {
                        try {
                            if (((defpackage.clk) obj3).c) {
                                i = i4;
                            } else {
                                ((defpackage.clk) obj3).c = true;
                                try {
                                    defpackage.cfc cfcVar = ((defpackage.clk) obj3).d;
                                    java.lang.Object[] objArr = cfcVar.a;
                                    int i7 = cfcVar.b;
                                    int i8 = i6;
                                    while (i8 < i7) {
                                        defpackage.clj cljVar = (defpackage.clj) objArr[i8];
                                        defpackage.ady adyVar = cljVar.i;
                                        defpackage.aonj aonjVar = cljVar.a;
                                        java.lang.Object[] objArr2 = adyVar.b;
                                        long[] jArr = adyVar.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i9 = i6;
                                            i2 = i7;
                                            while (true) {
                                                long j = jArr[i9];
                                                int i10 = i4;
                                                int i11 = i9;
                                                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i12 = i11 - length;
                                                    int i13 = 0;
                                                    while (true) {
                                                        int i14 = 8 - ((~i12) >>> 31);
                                                        if (i13 < i14) {
                                                            if ((j & 255) < 128) {
                                                                aonjVar.a(objArr2[(i11 << 3) + i13]);
                                                            }
                                                            j >>= i10;
                                                            i13++;
                                                        } else {
                                                            i3 = i10;
                                                            if (i14 == i3) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i3 = i10;
                                                }
                                                if (i11 != length) {
                                                    i9 = i11 + 1;
                                                    i4 = i3;
                                                    c = 7;
                                                }
                                            }
                                        } else {
                                            i2 = i7;
                                            i3 = i4;
                                        }
                                        adyVar.d();
                                        i8++;
                                        i7 = i2;
                                        i4 = i3;
                                        i6 = 0;
                                        c = 7;
                                    }
                                    i = i4;
                                    ((defpackage.clk) obj3).c = false;
                                } catch (java.lang.Throwable th) {
                                    ((defpackage.clk) obj3).c = false;
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!clkVar.f()) {
                        return defpackage.aojh.a;
                    }
                    i4 = i;
                    i6 = 0;
                    c = 7;
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.cuq) this.a).d;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.cuu) this.a).f();
            case 9:
                defpackage.dbk dbkVarK = ((defpackage.dbk) this.a).k();
                if (dbkVarK == null) {
                    defpackage.aooh.g();
                }
                return dbkVarK.o();
            case 10:
                defpackage.cxy cxyVarA = ((defpackage.adnp) this.a).a();
                defpackage.dbk dbkVar = cxyVarA.a;
                if (cxyVarA.i != dbkVar.v().size()) {
                    defpackage.adw adwVar = cxyVarA.l;
                    java.lang.Object[] objArr3 = adwVar.c;
                    long[] jArr2 = adwVar.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j2 = jArr2[i15];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = i15 - length2;
                                int i17 = 0;
                                while (true) {
                                    int i18 = 8 - ((~i16) >>> 31);
                                    if (i17 < i18) {
                                        if ((j2 & 255) < 128) {
                                            ((defpackage.cxq) objArr3[(i15 << 3) + i17]).c = true;
                                        }
                                        j2 >>= 8;
                                        i17++;
                                    } else if (i18 == 8) {
                                        if (i15 != length2) {
                                            i15++;
                                        }
                                    }
                                }
                            } else if (i15 != length2) {
                                i15++;
                            }
                        }
                    }
                    if (dbkVar.j != null) {
                        if (!dbkVar.aj()) {
                            dbkVar.U(false, true, true);
                        }
                    } else if (!dbkVar.ak()) {
                        dbkVar.W(false, true, true);
                    }
                }
                return defpackage.aojh.a;
            case 11:
                ((defpackage.dbk) this.a).w.d();
                return defpackage.aojh.a;
            case 12:
                defpackage.dbv dbvVar = (defpackage.dbv) this.a;
                dbvVar.f.g = 0;
                defpackage.cfc cfcVarJ = dbvVar.r().j();
                java.lang.Object[] objArr4 = cfcVarJ.a;
                int i19 = cfcVarJ.b;
                for (int i20 = 0; i20 < i19; i20++) {
                    defpackage.dbv dbvVar2 = ((defpackage.dbk) objArr4[i20]).w.p;
                    if (dbvVar2 == null) {
                        defpackage.aooh.g();
                    }
                    dbvVar2.h = dbvVar2.i;
                    dbvVar2.i = Integer.MAX_VALUE;
                    if (dbvVar2.y == 2) {
                        dbvVar2.y = 3;
                    }
                }
                dbvVar.l(new defpackage.ckc(12));
                defpackage.dbu dbuVar = ((defpackage.daz) dbvVar.k()).g;
                if (dbuVar == null) {
                    throw new java.lang.IllegalStateException("Expected lookahead delegate");
                }
                java.util.List listU = dbvVar.r().u();
                int size = listU.size();
                for (int i21 = 0; i21 < size; i21++) {
                    defpackage.dbk dbkVar2 = (defpackage.dbk) listU.get(i21);
                    defpackage.dbu dbuVarD2 = dbkVar2.p().D();
                    if (dbuVarD2 != null) {
                        if (dbuVarD2.n) {
                            if (adqVar == null) {
                                adqVar = new defpackage.adq(16);
                            }
                            adqVar.q(dbkVar2);
                        }
                        dbuVarD2.n = dbuVar.n;
                    }
                }
                dbuVar.L().i();
                java.util.List listU2 = dbvVar.r().u();
                int size2 = listU2.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    defpackage.dbk dbkVar3 = (defpackage.dbk) listU2.get(i22);
                    boolean z = adqVar != null && adqVar.e(dbkVar3);
                    defpackage.dbu dbuVarD3 = dbkVar3.p().D();
                    if (dbuVarD3 != null) {
                        dbuVarD3.n = z;
                    }
                }
                defpackage.cfc cfcVarJ2 = dbvVar.r().j();
                java.lang.Object[] objArr5 = cfcVarJ2.a;
                int i23 = cfcVarJ2.b;
                while (i6 < i23) {
                    defpackage.dbv dbvVar3 = ((defpackage.dbk) objArr5[i6]).w.p;
                    if (dbvVar3 == null) {
                        defpackage.aooh.g();
                    }
                    int i24 = dbvVar3.h;
                    int i25 = dbvVar3.i;
                    if (i24 != i25 && i25 == Integer.MAX_VALUE) {
                        dbvVar3.u(true);
                    }
                    i6++;
                }
                dbvVar.l(new defpackage.ckc(13));
                return defpackage.aojh.a;
            case 13:
                defpackage.dbv dbvVar4 = (defpackage.dbv) this.a;
                defpackage.dbu dbuVarD4 = dbvVar4.t().D();
                if (dbuVarD4 == null) {
                    defpackage.aooh.g();
                }
                dbuVarD4.v(dbvVar4.v);
                return defpackage.aojh.a;
            case 14:
                defpackage.dbv dbvVar5 = (defpackage.dbv) this.a;
                if (defpackage.cfo.s(dbvVar5.r()) || dbvVar5.f.c) {
                    defpackage.dck dckVar = dbvVar5.t().A;
                    if (dckVar != null) {
                        cyyVar2 = dckVar.o;
                    }
                } else {
                    defpackage.dck dckVar2 = dbvVar5.t().A;
                    if (dckVar2 != null && (dbuVarD = dckVar2.D()) != null) {
                        cyyVar2 = dbuVarD.o;
                    }
                }
                if (cyyVar2 == null) {
                    cyyVar2 = new defpackage.cyy(defpackage.dbn.a(dbvVar5.r()));
                }
                defpackage.dbu dbuVarD5 = dbvVar5.t().D();
                if (dbuVarD5 == null) {
                    defpackage.aooh.g();
                }
                cyyVar2.t(dbuVarD5, dbvVar5.m, 0.0f);
                return defpackage.aojh.a;
            case 15:
                defpackage.dbx dbxVar = (defpackage.dbx) this.a;
                dbxVar.s().v(dbxVar.z);
                return defpackage.aojh.a;
            case 16:
                defpackage.dbx dbxVar2 = (defpackage.dbx) this.a;
                dbxVar2.f.h = 0;
                defpackage.cfc cfcVarJ3 = dbxVar2.r().j();
                java.lang.Object[] objArr6 = cfcVarJ3.a;
                int i26 = cfcVarJ3.b;
                for (int i27 = 0; i27 < i26; i27++) {
                    defpackage.dbx dbxVarN = ((defpackage.dbk) objArr6[i27]).n();
                    dbxVarN.h = dbxVarN.i;
                    dbxVarN.i = Integer.MAX_VALUE;
                    dbxVarN.t = false;
                    if (dbxVarN.G == 2) {
                        dbxVarN.G = 3;
                    }
                }
                dbxVar2.l(new defpackage.ckc(14));
                if (dbxVar2.k().n) {
                    java.util.List listU3 = dbxVar2.r().u();
                    int size3 = listU3.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        defpackage.dbk dbkVar4 = (defpackage.dbk) listU3.get(i28);
                        if (dbkVar4.p().n) {
                            if (adqVar2 == null) {
                                adqVar2 = new defpackage.adq(16);
                            }
                            adqVar2.q(dbkVar4);
                        }
                        dbkVar4.p().n = dbxVar2.k().n;
                    }
                }
                dbxVar2.k().L().i();
                if (dbxVar2.k().n) {
                    java.util.List listU4 = dbxVar2.r().u();
                    int size4 = listU4.size();
                    for (int i29 = 0; i29 < size4; i29++) {
                        defpackage.dbk dbkVar5 = (defpackage.dbk) listU4.get(i29);
                        dbkVar5.p().n = adqVar2 != null && adqVar2.e(dbkVar5);
                    }
                }
                defpackage.dbk dbkVarR = dbxVar2.r();
                defpackage.cfc cfcVarJ4 = dbkVarR.j();
                java.lang.Object[] objArr7 = cfcVarJ4.a;
                int i30 = cfcVarJ4.b;
                for (int i31 = 0; i31 < i30; i31++) {
                    defpackage.dbk dbkVar6 = (defpackage.dbk) objArr7[i31];
                    if (dbkVar6.n().h != dbkVar6.f()) {
                        dbkVarR.P();
                        dbkVarR.F();
                        if (dbkVar6.f() == Integer.MAX_VALUE) {
                            if (dbkVar6.w.c || defpackage.cfo.s(dbkVar6)) {
                                defpackage.dbv dbvVarM = dbkVar6.m();
                                if (dbvVarM == null) {
                                    defpackage.aooh.g();
                                }
                                dbvVarM.u(false);
                            }
                            dbkVar6.n().C();
                        }
                    }
                }
                dbxVar2.l(new defpackage.ckc(15));
                return defpackage.aojh.a;
            case 17:
                defpackage.dbx dbxVar3 = (defpackage.dbx) this.a;
                defpackage.dck dckVar3 = dbxVar3.s().A;
                if (dckVar3 == null || (cyyVar = dckVar3.o) == null) {
                    cyyVar = new defpackage.cyy(defpackage.dbn.a(dbxVar3.r()));
                }
                defpackage.aonj aonjVar2 = dbxVar3.C;
                defpackage.cso csoVar = dbxVar3.D;
                if (csoVar != null) {
                    cyyVar.w(dbxVar3.s(), dbxVar3.E, csoVar, dbxVar3.F);
                } else if (aonjVar2 == null) {
                    cyyVar.t(dbxVar3.s(), dbxVar3.E, dbxVar3.F);
                } else {
                    cyyVar.v(dbxVar3.s(), dbxVar3.E, dbxVar3.F, aonjVar2);
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.dck dckVar4 = (defpackage.dck) this.a;
                defpackage.cqf cqfVar = dckVar4.J;
                if (cqfVar == null) {
                    defpackage.aooh.g();
                }
                dckVar4.ak(cqfVar, dckVar4.I);
                return defpackage.aojh.a;
            case 19:
                defpackage.dck dckVar5 = ((defpackage.dck) this.a).A;
                if (dckVar5 != null) {
                    dckVar5.am();
                }
                return defpackage.aojh.a;
            default:
                java.lang.Object obj4 = this.a;
                if (((defpackage.deg) obj4).isAttachedToWindow()) {
                    if (defpackage.deg.c == null) {
                        defpackage.aafk aafkVar = new defpackage.aafk(i5);
                        defpackage.deg.c = aafkVar;
                        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
                        try {
                            if (defpackage.deg.a == null) {
                                defpackage.deg.a = java.lang.Class.forName("android.os.SystemProperties");
                            }
                            if (defpackage.deg.b == null) {
                                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                                java.lang.Class cls = defpackage.deg.a;
                                defpackage.deg.b = cls != null ? cls.getDeclaredMethod("addChangeCallback", java.lang.Runnable.class) : null;
                            }
                            java.lang.reflect.Method method = defpackage.deg.b;
                            if (method != null) {
                                method.invoke(null, aafkVar);
                            }
                            break;
                        } catch (java.lang.Throwable unused) {
                        }
                        android.os.StrictMode.setVmPolicy(vmPolicy);
                    }
                    defpackage.adq adqVar3 = defpackage.deg.G;
                    synchronized (adqVar3) {
                        if (!adqVar3.e(obj4)) {
                            adqVar3.q(obj4);
                        }
                        break;
                    }
                }
                return defpackage.aojh.a;
        }
    }
}
