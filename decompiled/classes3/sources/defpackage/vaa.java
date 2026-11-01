package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vaa {
    public final java.lang.Object a;

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public vaa(android.net.Uri uri) {
        org.json.JSONObject jSONObject;
        if (uri == null) {
            jSONObject = new org.json.JSONObject();
        } else {
            if (!defpackage.abxl.d(uri)) {
                throw new java.lang.IllegalArgumentException("URI must be a encoded contact URI.");
            }
            java.lang.String encodedFragment = uri.getEncodedFragment();
            if (encodedFragment != null) {
                jSONObject = new org.json.JSONObject(encodedFragment);
            } else {
                jSONObject = new org.json.JSONObject();
            }
        }
        this.a = jSONObject;
    }

    public static final void J(boolean z) {
        if (z) {
            return;
        }
        aaoo.as(new java.lang.IllegalStateException());
    }

    public static defpackage.vaa ak(int i) {
        akzx akzxVarM = aiwc.a.m();
        akzxVarM.u();
        aiwc aiwcVar = akzxVarM.b;
        aiwcVar.b |= 8;
        aiwcVar.d = i;
        return new defpackage.vaa(akzxVarM, (int[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void A(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        aooh.f(str, "parentType");
        aooh.f(str2, "childType");
        ?? r1 = this.a;
        java.lang.Object acaVar = r1.get(str);
        if (acaVar == null) {
            acaVar = new aca();
            r1.put(str, acaVar);
        }
        java.util.Map map = (java.util.Map) acaVar;
        java.lang.Object accVar = map.get(str2);
        if (accVar == null) {
            accVar = new acc(0);
            map.put(str2, accVar);
        }
        ((java.util.Set) accVar).add(str3);
    }

    public final void B(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Set set;
        aooh.f(str, "parentType");
        aooh.f(str2, "childType");
        aec aecVar = (aec) this.a;
        java.util.Map map = (java.util.Map) aecVar.get(str);
        if (map == null || (set = (java.util.Set) map.get(str2)) == null) {
            return;
        }
        set.remove(str3);
        if (set.isEmpty()) {
            map.remove(str2);
            if (map.isEmpty()) {
                aecVar.remove(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final akxp C(java.lang.String str) {
        java.lang.Object objComputeIfAbsent = j$.util.Map.-EL.computeIfAbsent((java.util.Map) this.a, str, new defpackage.vxb(defpackage.aden.a, 20));
        aooh.e(objComputeIfAbsent, "computeIfAbsent(...)");
        return (akxp) objComputeIfAbsent;
    }

    public final ajcq D(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return ((anpu) this.a).b(ahqx.i(callable), executor);
    }

    public final ajcq E(ajas ajasVar, java.util.concurrent.Executor executor) {
        return ((anpu) this.a).c(ahqx.b(ajasVar), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adba, java.lang.Object] */
    public final void F(int i, defpackage.acvu acvuVar) {
        this.a.m(i, acvuVar.d, acvuVar.f, acvuVar.s, acvuVar.t);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Set] */
    public final void G(java.lang.Object obj) {
        ?? r7 = this.a;
        if (r7.isEmpty()) {
            return;
        }
        if (android.util.Log.isLoggable("GIL", 2)) {
            android.util.Log.v("GIL", "Inserted: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        java.util.Iterator it = r7.iterator();
        while (it.hasNext()) {
            defpackage.acmz acmzVar = (defpackage.acmz) ((defpackage.aprf) it.next()).a;
            acmzVar.f.y();
            defpackage.acmd acmdVar = (defpackage.acmd) obj;
            defpackage.acmx acmxVar = acmdVar.a;
            if (acmxVar instanceof defpackage.acml) {
                defpackage.acml acmlVar = (defpackage.acml) acmxVar;
                if (!acmdVar.c.bU(defpackage.acot.a)) {
                    acmlVar.o(false);
                } else if (!acmxVar.m()) {
                    acmlVar.o(true);
                }
            }
            defpackage.acnb acnbVar = acmzVar.c;
            defpackage.acmx acmxVar2 = acmdVar.a;
            akzz akzzVar = acmdVar.c;
            aiwc aiwcVar = akzzVar.b.d;
            if (aiwcVar == null) {
                aiwcVar = aiwc.a;
            }
            if ((aiwcVar.b & 2048) != 0) {
                int iP = acmxVar2.p();
                int iAS = a.aS(akzzVar.b.e);
                if ((iAS != 0 ? iAS : 1) != iP) {
                    int i = akzzVar.b.e;
                    if (acnbVar.c(acmdVar, iP)) {
                    }
                }
            } else {
                acnbVar.a.add(obj);
            }
            acmzVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void H(java.lang.Object obj) {
        ?? r11 = this.a;
        if (r11.isEmpty()) {
            return;
        }
        if (android.util.Log.isLoggable("GIL", 2)) {
            android.util.Log.v("GIL", "Removed: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        for (defpackage.aprf aprfVar : r11) {
            defpackage.acmd acmdVar = (defpackage.acmd) obj;
            ?? r3 = acmdVar.d.a;
            if (!r3.isEmpty()) {
                if (android.util.Log.isLoggable("GIL", 2)) {
                    android.util.Log.v("GIL", "ImpressionCleared: ".concat(obj.toString()));
                }
                java.util.Iterator it = r3.iterator();
                while (it.hasNext()) {
                    defpackage.acmz acmzVar = (defpackage.acmz) ((defpackage.aprf) it.next()).a;
                    acmzVar.f.y();
                    defpackage.acnb acnbVar = acmzVar.c;
                    boolean z = acnbVar.h;
                    java.util.Map map = acnbVar.f;
                    java.util.Collection collection = (java.util.Collection) map.remove(obj);
                    if (collection != null) {
                        collection.clear();
                        acnbVar.g = collection;
                    }
                    if (acmdVar.c()) {
                        defpackage.acmx acmxVar = acmdVar.a;
                        java.lang.Object objC = acmxVar.c();
                        if (acmxVar.m() || (objC != null && ((defpackage.acmd) objC).c())) {
                            java.util.Collection collection2 = (java.util.Collection) map.get(objC);
                            if (collection2 != null) {
                                collection2.add(acmdVar.a());
                            } else {
                                java.util.Collection arrayList = acnbVar.g;
                                if (arrayList != null) {
                                    acnbVar.g = null;
                                } else {
                                    if (android.util.Log.isLoggable("GIL", 2)) {
                                        android.util.Log.v("GIL", "Array Alloc for Removal");
                                    }
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(acmdVar.a());
                                map.put(objC, arrayList);
                            }
                        }
                    }
                    acnbVar.a.remove(obj);
                    acnbVar.b.remove(obj);
                    if (!map.isEmpty()) {
                        acmzVar.b();
                    }
                }
            }
            akzz akzzVar = acmdVar.c;
            aiwc aiwcVar = akzzVar.b.d;
            if (aiwcVar == null) {
                aiwcVar = aiwc.a;
            }
            akzx akzxVarP = aiwcVar.p();
            akzxVarP.u();
            aiwc aiwcVar2 = akzxVarP.b;
            aiwcVar2.e = null;
            aiwcVar2.b &= -2049;
            akzxVarP.u();
            aiwc aiwcVar3 = akzxVarP.b;
            aiwcVar3.b &= -2;
            aiwcVar3.c = -1;
            aiwc aiwcVarP = akzxVarP.p();
            akzzVar.u();
            acmi acmiVar = akzzVar.b;
            j$.util.Objects.requireNonNull(aiwcVarP);
            acmiVar.d = aiwcVarP;
            acmiVar.b |= 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean I() {
        return !this.a.isEmpty();
    }

    public final void K(int i, defpackage.acmb[] acmbVarArr, acmc[] acmcVarArr, aonn aonnVar, aonn aonnVar2, cav cavVar, int i2, int i3) {
        aonn aonnVar3;
        defpackage.acmd acmdVar;
        boolean z;
        aomy aomyVar;
        aooh.f(aonnVar2, "content");
        cbt cbtVarB = cavVar.b(-1554603852);
        int i4 = (i2 & 6) == 0 ? (true != cbtVarB.z(i) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? cbtVarB.B((java.lang.Object) null) : cbtVarB.D((java.lang.Object) null)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cbtVarB.D(acmbVarArr) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != cbtVarB.D(acmcVarArr) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != cbtVarB.D((java.lang.Object) null) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != cbtVarB.D((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != cbtVarB.C(false) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            aonnVar3 = aonnVar;
            i4 |= true != cbtVarB.D(aonnVar3) ? 4194304 : 8388608;
        } else {
            aonnVar3 = aonnVar;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != ((134217728 & i2) == 0 ? cbtVarB.B((java.lang.Object) null) : cbtVarB.D((java.lang.Object) null)) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != cbtVarB.D(aonnVar2) ? 268435456 : 536870912;
        }
        int i5 = i4;
        int i6 = (i3 & 6) == 0 ? i3 | (true != cbtVarB.B(this) ? 2 : 4) : i3;
        if (cbtVarB.H(((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i5 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            cbtVarB.u(674337548);
            cbd cbdVar = defpackage.acmw.a;
            int length = acmcVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    cbd cbdVar2 = defpackage.acmw.a;
                    if (cbtVarB.e(cbdVar2) == null) {
                        cbtVarB.u(-570056321);
                        android.view.View view = (android.view.View) cbtVarB.e(dep.f);
                        defpackage.acmd acmdVarB = null;
                        while (view != null) {
                            acmdVarB = defpackage.acml.b(view);
                            if (acmdVarB != null || view.getId() == 16908290) {
                                break;
                            }
                            java.lang.Object parent = view.getParent();
                            view = parent instanceof android.view.View ? (android.view.View) parent : null;
                        }
                        cbtVar.W(false);
                        acmdVar = acmdVarB;
                        break;
                    }
                    cbtVarB.u(-570177035);
                    acmdVar = (defpackage.acmd) cbtVarB.e(cbdVar2);
                    cbtVar.W(false);
                    break;
                }
                java.lang.Object obj = acmcVarArr[i7].a;
                if ((obj instanceof defpackage.acos) && ((defpackage.acos) obj).d) {
                    cbtVarB.u(-570308692);
                    cbtVar.W(false);
                    acmdVar = null;
                    break;
                }
                i7++;
            }
            cbtVar.W(false);
            cbtVarB.u(-569091849);
            boolean zB = cbtVarB.B(new defpackage.acmu(i, acmbVarArr, acmcVarArr));
            java.lang.Object objR = cbtVar.R();
            int i8 = 14;
            if (zB || objR == cau.a) {
                z = false;
                defpackage.acma acmaVar = new defpackage.acma(ak(i), new defpackage.ymu(i8), (defpackage.vaa) this.a);
                int length2 = acmbVarArr.length;
                for (int i9 = 0; i9 < length2; i9 = 1) {
                    acmaVar.a(acmbVarArr[0]);
                }
                for (acmc acmcVar : acmcVarArr) {
                    acmaVar.b(acmcVar);
                }
                objR = (defpackage.acmd) acmaVar.a.apply(acmaVar.c(acmaVar.b));
                cbtVar.ab(objR);
            } else {
                z = false;
            }
            defpackage.acmd acmdVar2 = (defpackage.acmd) objR;
            cbtVar.W(z);
            den.ab(defpackage.acmw.a.b(acmdVar2), aonnVar2, cbtVarB, (i5 >> 24) & 112);
            boolean zD = cbtVarB.D(acmdVar) | cbtVarB.D(acmdVar2);
            boolean z2 = (i5 & 29360128) == 8388608;
            boolean z3 = (i5 & 14) == 4;
            boolean z4 = (i5 & 3670016) == 1048576;
            boolean z5 = (i6 & 14) == 4;
            java.lang.Object objR2 = cbtVar.R();
            if ((zD | z2 | z3 | z4 | z5) || objR2 == cau.a) {
                objR2 = new defpackage.acms(acmdVar, acmdVar2, aonnVar3, i, 0);
                cbtVar.ab(objR2);
            }
            aomy aomyVar2 = (aomy) objR2;
            aooh.c(acmdVar2);
            defpackage.acmv acmvVar = new defpackage.acmv(acmdVar, acmdVar2);
            boolean zD2 = cbtVarB.D(acmdVar) | cbtVarB.D(acmdVar2);
            java.lang.Object objR3 = cbtVar.R();
            if (((zD2 || z2) || z3) || objR3 == cau.a) {
                aomyVar = aomyVar2;
                defpackage.acms acmsVar = new defpackage.acms(acmdVar, acmdVar2, aonnVar, i, 2);
                cbtVar.ab(acmsVar);
                objR3 = acmsVar;
            } else {
                aomyVar = aomyVar2;
            }
            aomy aomyVar3 = (aomy) objR3;
            boolean z6 = true;
            boolean zC = cbtVarB.C(true) | cbtVarB.B(aomyVar);
            if ((i5 & 112) != 32 && ((i5 & 64) == 0 || !cbtVarB.D((java.lang.Object) null))) {
                z6 = false;
            }
            boolean zD3 = zC | z6 | cbtVarB.D(acmvVar) | z4 | z5 | cbtVarB.B(aomyVar3);
            java.lang.Object objR4 = cbtVar.R();
            if (zD3 || objR4 == cau.a) {
                objR4 = new defpackage.abdu(aomyVar, aomyVar3, 10, null);
                cbtVar.ab(objR4);
            }
            cbp.c(acmvVar, (aonj) objR4, cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acmt(this, i, acmbVarArr, acmcVarArr, aonnVar, aonnVar2, i2, i3, 0);
        }
    }

    public final void L(int i, defpackage.acmb[] acmbVarArr, acmc[] acmcVarArr, aonn aonnVar, aonn aonnVar2, cav cavVar, int i2, int i3) {
        int i4;
        defpackage.acmb[] acmbVarArr2;
        acmc[] acmcVarArr2;
        aonn aonnVar3;
        acmc[] acmcVarArr3;
        int i5;
        aonn aonnVar4;
        aooh.f(aonnVar2, "content");
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(-2099895634);
        if (i6 == 0) {
            i4 = (true != cbtVarB.z(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = 16;
            if ((i3 & 2) == 0) {
                acmbVarArr2 = acmbVarArr;
                if (cbtVarB.D(acmbVarArr2)) {
                    i7 = 32;
                }
            } else {
                acmbVarArr2 = acmbVarArr;
            }
            i4 |= i7;
        } else {
            acmbVarArr2 = acmbVarArr;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            if ((i3 & 4) == 0) {
                acmcVarArr2 = acmcVarArr;
                if (cbtVarB.D(acmcVarArr2)) {
                    i8 = 256;
                }
            } else {
                acmcVarArr2 = acmcVarArr;
            }
            i4 |= i8;
        } else {
            acmcVarArr2 = acmcVarArr;
        }
        int i9 = i4 | 1797120;
        if ((12582912 & i2) == 0) {
            i9 |= true != cbtVarB.D(aonnVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i9 |= true != cbtVarB.B(this) ? 33554432 : 67108864;
        }
        if (cbtVarB.H((38347923 & i9) != 38347922, i9 & 1)) {
            int i10 = i3 & 4;
            int i11 = i3 & 2;
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) == 0 || cbtVarB.E()) {
                if (i11 != 0) {
                    i9 &= -113;
                    acmbVarArr2 = new defpackage.acmb[0];
                }
                if (i10 != 0) {
                    acmcVarArr3 = new acmc[0];
                    i9 &= -897;
                } else {
                    acmcVarArr3 = acmcVarArr2;
                }
                java.lang.Object objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = new defpackage.xpf(12);
                    cbtVar.ab(objR);
                }
                acmc[] acmcVarArr4 = acmcVarArr3;
                i5 = i9;
                aonnVar4 = (aonn) objR;
                acmcVarArr2 = acmcVarArr4;
            } else {
                cbtVarB.s();
                if (i11 != 0) {
                    i9 &= -113;
                }
                if (i10 != 0) {
                    i9 &= -897;
                }
                i5 = i9;
                aonnVar4 = aonnVar;
            }
            cbtVarB.l();
            int i12 = i5 << 3;
            defpackage.acmb[] acmbVarArr3 = acmbVarArr2;
            acmc[] acmcVarArr5 = acmcVarArr2;
            aonn aonnVar5 = aonnVar4;
            K(i, acmbVarArr3, acmcVarArr5, aonnVar5, aonnVar2, cbtVarB, ((i5 << 6) & 1879048192) | (i5 & 14) | 100663344 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), (i5 >> 24) & 14);
            aonnVar3 = aonnVar5;
            acmcVarArr2 = acmcVarArr5;
            acmbVarArr2 = acmbVarArr3;
        } else {
            cbtVarB.s();
            aonnVar3 = aonnVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acmt(this, i, acmbVarArr2, acmcVarArr2, aonnVar3, aonnVar2, i2, i3, 1, null);
        }
    }

    public final /* synthetic */ defpackage.abxn M() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxn) aladVarP;
    }

    public final void N(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxn abxnVar = (defpackage.abxn) akzxVar.b;
        defpackage.abxn abxnVar2 = defpackage.abxn.a;
        j$.util.Objects.requireNonNull(str);
        abxnVar.b |= 1;
        abxnVar.c = str;
    }

    public final void O(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxn abxnVar = (defpackage.abxn) akzxVar.b;
        defpackage.abxn abxnVar2 = defpackage.abxn.a;
        j$.util.Objects.requireNonNull(str);
        abxnVar.b |= 8;
        abxnVar.f = str;
    }

    public final void P(defpackage.abxt abxtVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxn abxnVar = (defpackage.abxn) akzxVar.b;
        defpackage.abxn abxnVar2 = defpackage.abxn.a;
        j$.util.Objects.requireNonNull(abxtVar);
        abxnVar.d = abxtVar;
        abxnVar.b |= 2;
    }

    public final void Q(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxn abxnVar = (defpackage.abxn) akzxVar.b;
        defpackage.abxn abxnVar2 = defpackage.abxn.a;
        abxnVar.g = a.T(i);
        abxnVar.b |= 16;
    }

    public final void R(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxn abxnVar = (defpackage.abxn) akzxVar.b;
        defpackage.abxn abxnVar2 = defpackage.abxn.a;
        abxnVar.e = i - 2;
        abxnVar.b |= 4;
    }

    public final /* synthetic */ defpackage.abvz S() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abvz) aladVarP;
    }

    public final void T(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVar.b;
        defpackage.abvz abvzVar2 = defpackage.abvz.a;
        j$.util.Objects.requireNonNull(str);
        abvzVar.b |= 2;
        abvzVar.d = str;
    }

    public final void U(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVar.b;
        defpackage.abvz abvzVar2 = defpackage.abvz.a;
        j$.util.Objects.requireNonNull(str);
        abvzVar.b |= 1;
        abvzVar.c = str;
    }

    public final void V(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVar.b;
        defpackage.abvz abvzVar2 = defpackage.abvz.a;
        j$.util.Objects.requireNonNull(str);
        abvzVar.b |= 4;
        abvzVar.e = str;
    }

    public final android.net.Uri W() throws org.json.JSONException {
        android.net.Uri.Builder builderAppendQueryParameter = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("directory", "9223372036854775807");
        java.lang.Object obj = this.a;
        try {
            ((org.json.JSONObject) obj).getInt("display_name_source");
        } catch (org.json.JSONException unused) {
            aooh.c(((org.json.JSONObject) obj).put("display_name_source", 0));
        }
        try {
            ((org.json.JSONObject) obj).getJSONObject("vnd.android.cursor.item/contact");
        } catch (org.json.JSONException unused2) {
            ((org.json.JSONObject) obj).put("vnd.android.cursor.item/contact", new org.json.JSONObject());
        }
        android.net.Uri uriBuild = builderAppendQueryParameter.encodedFragment(((org.json.JSONObject) obj).toString()).build();
        aooh.e(uriBuild, "build(...)");
        return uriBuild;
    }

    public final void X(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2;
        org.json.JSONArray jSONArray;
        aooh.f(jSONObject, "data");
        try {
            jSONObject2 = ((org.json.JSONObject) this.a).getJSONObject("vnd.android.cursor.item/contact");
        } catch (org.json.JSONException unused) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            ((org.json.JSONObject) this.a).put("vnd.android.cursor.item/contact", jSONObject3);
            jSONObject2 = jSONObject3;
        }
        aooh.c(jSONObject2);
        try {
            jSONArray = jSONObject2.getJSONArray(str);
        } catch (org.json.JSONException unused2) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONObject2.put(str, jSONArray2);
            jSONArray = jSONArray2;
        }
        aooh.c(jSONArray);
        jSONArray.put(jSONObject);
    }

    public final void Y(defpackage.abvq abvqVar) throws org.json.JSONException {
        aooh.f(abvqVar, "metadata");
        ((org.json.JSONObject) this.a).put("com.google.android.contacts.DIALER_CALL_LOG_METADATA", android.util.Base64.encodeToString(abvqVar.i(), 11));
    }

    public final void Z(java.lang.String str, int i) throws org.json.JSONException {
        aooh.f(str, "displayName");
        org.json.JSONObject jSONObject = (org.json.JSONObject) this.a;
        jSONObject.put("display_name", str);
        jSONObject.put("display_name_alt", (java.lang.Object) null);
        jSONObject.put("display_name_source", i);
    }

    public final /* synthetic */ vcp a() {
        vcp vcpVarP = ((akzx) this.a).p();
        aooh.e(vcpVarP, "build(...)");
        return vcpVarP;
    }

    public final void aA(double d) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alra alraVar = (defpackage.alra) akzxVar.b;
        defpackage.alra alraVar2 = defpackage.alra.a;
        alraVar.b |= 2;
        alraVar.d = d;
    }

    public final void aB(defpackage.alrb alrbVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alra alraVar = (defpackage.alra) akzxVar.b;
        defpackage.alra alraVar2 = defpackage.alra.a;
        alraVar.c = alrbVar.f;
        alraVar.b |= 1;
    }

    public final /* synthetic */ alqh aC() {
        alqh alqhVarP = ((akzx) this.a).p();
        aooh.e(alqhVarP, "build(...)");
        return alqhVarP;
    }

    public final void aD(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqh alqhVar = akzxVar.b;
        alqh alqhVar2 = alqh.a;
        j$.util.Objects.requireNonNull(str);
        alqhVar.b = str;
    }

    public final /* synthetic */ alqo aE() {
        alqo alqoVarP = ((akzx) this.a).p();
        aooh.e(alqoVarP, "build(...)");
        return alqoVarP;
    }

    public final void aF(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqo alqoVar = akzxVar.b;
        alqo alqoVar2 = alqo.a;
        j$.util.Objects.requireNonNull(str);
        alqoVar.b |= 1;
        alqoVar.c = str;
    }

    public final void aG(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        alqo alqoVar = akzxVar.b;
        alqo alqoVar2 = alqo.a;
        alqoVar.e = i - 1;
        alqoVar.b |= 16;
    }

    public final /* synthetic */ void aH(apdi apdiVar, java.lang.Object obj) {
        aooh.f(apdiVar, "extension");
        aooh.f(obj, "value");
        ((akzz) this.a).bV(apdiVar, obj);
    }

    public final void aa(java.lang.String str, java.lang.Integer num) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("data1", str);
        jSONObject.put("data2", num);
        jSONObject.put("data3", (java.lang.Object) null);
        jSONObject.put("data4", (java.lang.Object) null);
        X("vnd.android.cursor.item/phone_v2", jSONObject);
    }

    public final /* synthetic */ defpackage.abdr ab() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abdr) aladVarP;
    }

    public final void ac(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abdr abdrVar = (defpackage.abdr) akzxVar.b;
        defpackage.abdr abdrVar2 = defpackage.abdr.a;
        j$.util.Objects.requireNonNull(str);
        abdrVar.b |= 256;
        abdrVar.j = str;
    }

    public final void ad(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abdr abdrVar = (defpackage.abdr) akzxVar.b;
        defpackage.abdr abdrVar2 = defpackage.abdr.a;
        j$.util.Objects.requireNonNull(str);
        abdrVar.b |= 128;
        abdrVar.i = str;
    }

    public final void ae(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abdr abdrVar = (defpackage.abdr) akzxVar.b;
        defpackage.abdr abdrVar2 = defpackage.abdr.a;
        abdrVar.b |= 16;
        abdrVar.f = j;
    }

    public final void af(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abdr abdrVar = (defpackage.abdr) akzxVar.b;
        defpackage.abdr abdrVar2 = defpackage.abdr.a;
        j$.util.Objects.requireNonNull(str);
        abdrVar.b |= 4;
        abdrVar.d = str;
    }

    public final void ag() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abdr abdrVar = (defpackage.abdr) akzxVar.b;
        defpackage.abdr abdrVar2 = defpackage.abdr.a;
        abdrVar.b |= 4096;
        abdrVar.n = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [abbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [abbp, java.lang.Object] */
    public final java.lang.Object ah(defpackage.abbm abbmVar, aoln aolnVar) {
        defpackage.abbu abbuVar;
        if (aolnVar instanceof defpackage.abbu) {
            abbuVar = (defpackage.abbu) aolnVar;
            int i = abbuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                abbuVar.b = i - Integer.MIN_VALUE;
            } else {
                abbuVar = new defpackage.abbu(this, aolnVar);
            }
        } else {
            abbuVar = new defpackage.abbu(this, aolnVar);
        }
        java.lang.Object objA = abbuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = abbuVar.b;
        if (i2 == 0) {
            aooc.af(objA);
            ?? r6 = this.a;
            abbuVar.b = 1;
            objA = r6.a(abbmVar, abbuVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        return new defpackage.abbw((defpackage.abbo) objA, this.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object ai(defpackage.abbm abbmVar, aoln aolnVar) throws aois {
        defpackage.abbj abbjVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.abbj) {
            abbjVar = (defpackage.abbj) aolnVar;
            int i = abbjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abbjVar.c = i - Integer.MIN_VALUE;
            } else {
                abbjVar = new defpackage.abbj(this, aolnVar);
            }
        } else {
            abbjVar = new defpackage.abbj(this, aolnVar);
        }
        java.lang.Object abcaVar = abbjVar.b;
        java.lang.Object obj2 = aolu.a;
        int i2 = abbjVar.c;
        int i3 = 1;
        if (i2 == 0) {
            aooc.af(abcaVar);
            j$.util.Objects.checkIndex(0, 3);
            if (abbmVar != null) {
                byte[] bArr = null;
                if (abbmVar instanceof defpackage.abbk) {
                    java.util.List list = ((defpackage.abbk) abbmVar).c;
                    java.lang.Object obj3 = this.a;
                    abbjVar.a = abbmVar;
                    abbjVar.c = 1;
                    defpackage.ulw ulwVar = (defpackage.ulw) obj3;
                    java.lang.Object objOrElse = ((j$.util.Optional) ulwVar.b).orElse(new afsq((char[]) null));
                    if (objOrElse == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    afsq afsqVar = (afsq) objOrElse;
                    j$.util.Objects.checkIndex(0, 3);
                    defpackage.aelu aeluVar = (defpackage.aelu) ulwVar.a;
                    defpackage.abdu abduVar = new defpackage.abdu(aeluVar.a, aeluVar.b, i3, bArr);
                    defpackage.afpl afplVar = new defpackage.afpl((char[]) null, (byte[]) null);
                    abduVar.a(afplVar);
                    defpackage.afpl afplVar2 = new defpackage.afpl((java.util.Map) afplVar.a, (java.util.Map) afplVar.b);
                    java.lang.Object obj4 = ulwVar.c;
                    aooh.f(obj4, "uriLoader");
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(afsq.cI((defpackage.ajyu) it.next()));
                    }
                    abcaVar = new defpackage.abca(new defpackage.abck(new com.google.android.libraries.abuse.hades.tartarus.core.E((com.google.android.libraries.abuse.hades.tartarus.core.C[]) arrayList.toArray(new com.google.android.libraries.abuse.hades.tartarus.core.C[0]), afplVar2, afsqVar, (j$.util.Optional) obj4)));
                    obj = abbmVar;
                    if (abcaVar == obj2) {
                        return obj2;
                    }
                } else if (abbmVar instanceof defpackage.abbl) {
                    throw null;
                }
            }
            throw new aois();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj5 = abbjVar.a;
        aooc.af(abcaVar);
        obj = obj5;
        defpackage.abbm abbmVar2 = (defpackage.abbm) obj;
        return new defpackage.abbn((defpackage.abca) abcaVar, abbmVar2.D(), abbmVar2.C());
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    public final void aj(android.os.IBinder iBinder) {
        defpackage.aaxn aaxnVar;
        ?? r10 = this.a;
        synchronized (r10) {
            if (iBinder == null) {
                aaxnVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                aaxnVar = iInterfaceQueryLocalInterface instanceof defpackage.aaxn ? (defpackage.aaxn) iInterfaceQueryLocalInterface : new defpackage.aaxn(iBinder);
            }
            defpackage.aaxx aaxxVar = new defpackage.aaxx();
            for (java.util.Map.Entry entry : r10.entrySet()) {
                defpackage.aayd aaydVar = (defpackage.aayd) entry.getValue();
                try {
                    com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable addListenerRequest = new com.google.android.gms.wearable.internal.AddListenerRequest(aaydVar);
                    android.os.Parcel parcelEP = aaxnVar.eP();
                    yld.f(parcelEP, aaxxVar);
                    yld.d(parcelEP, addListenerRequest);
                    aaxnVar.eR(16, parcelEP);
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        android.util.Log.d("WearableClient", "onPostInitHandler: added: " + java.lang.String.valueOf(entry.getKey()) + '/' + java.lang.String.valueOf(aaydVar));
                    }
                } catch (android.os.RemoteException unused) {
                    android.util.Log.w("WearableClient", "onPostInitHandler: Didn't add: " + java.lang.String.valueOf(entry.getKey()) + '/' + java.lang.String.valueOf(aaydVar));
                }
            }
        }
    }

    public final /* synthetic */ amoj al() {
        amoj amojVarP = ((akzx) this.a).p();
        aooh.e(amojVarP, "build(...)");
        return amojVarP;
    }

    public final /* synthetic */ amod am() {
        amod amodVarP = ((akzx) this.a).p();
        aooh.e(amodVarP, "build(...)");
        return amodVarP;
    }

    public final void an(iec iecVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amod amodVar = akzxVar.b;
        amod amodVar2 = amod.a;
        amodVar.c = iecVar.a();
        amodVar.b |= 1;
    }

    public final void ao(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        amod amodVar = akzxVar.b;
        amod amodVar2 = amod.a;
        amodVar.d = i - 1;
        amodVar.b |= 2;
    }

    public final /* synthetic */ defpackage.amml ap() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amml) aladVarP;
    }

    public final void aq(akzv akzvVar) {
        aooh.f(akzvVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amml ammlVar = (defpackage.amml) akzxVar.b;
        defpackage.amml ammlVar2 = defpackage.amml.a;
        j$.util.Objects.requireNonNull(akzvVar);
        ammlVar.f = akzvVar;
        ammlVar.b |= 1;
    }

    public final void ar(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amml ammlVar = (defpackage.amml) akzxVar.b;
        defpackage.amml ammlVar2 = defpackage.amml.a;
        ammlVar.e = f;
    }

    public final void as(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amml ammlVar = (defpackage.amml) akzxVar.b;
        defpackage.amml ammlVar2 = defpackage.amml.a;
        ammlVar.d = f;
    }

    public final void at(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amml ammlVar = (defpackage.amml) akzxVar.b;
        defpackage.amml ammlVar2 = defpackage.amml.a;
        ammlVar.c = f;
    }

    public final /* synthetic */ ambk au() {
        ambk ambkVarP = ((akzx) this.a).p();
        aooh.e(ambkVarP, "build(...)");
        return ambkVarP;
    }

    public final /* synthetic */ alyf av() {
        alyf alyfVarP = ((akzx) this.a).p();
        aooh.e(alyfVarP, "build(...)");
        return alyfVarP;
    }

    public final /* synthetic */ alwy aw() {
        alwy alwyVarP = ((akzx) this.a).p();
        aooh.e(alwyVarP, "build(...)");
        return alwyVarP;
    }

    public final /* synthetic */ alwp ax() {
        alwp alwpVarP = ((akzx) this.a).p();
        aooh.e(alwpVarP, "build(...)");
        return alwpVarP;
    }

    public final /* synthetic */ alrk ay() {
        alrk alrkVarP = ((akzx) this.a).p();
        aooh.e(alrkVarP, "build(...)");
        return alrkVarP;
    }

    public final /* synthetic */ defpackage.alra az() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alra) aladVarP;
    }

    public final void b(defpackage.vbs vbsVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vcp vcpVar = akzxVar.b;
        vcp vcpVar2 = vcp.a;
        vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
        vcpVar.b = 1;
    }

    public final void c(defpackage.vbw vbwVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vcp vcpVar = akzxVar.b;
        vcp vcpVar2 = vcp.a;
        vcpVar.c = java.lang.Integer.valueOf(vbwVar.a());
        vcpVar.b = 3;
    }

    public final void d(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        ailj ailjVarK = ((zzx) this.a).e().k();
        aooh.e(ailjVarK, "iterator(...)");
        while (ailjVarK.hasNext()) {
            vde vdeVar = (vde) ailjVarK.next();
            aooh.f(phoneAccountHandle, "phoneAccountHandle");
            vde.a.b().l("com/android/dialer/voicemail/service/impl/carriermapping/VvmCarrierNameCache", "onSimRemoved", 47, "VvmCarrierNameCache.kt").y("sim removed, invalidating cache for %s", phoneAccountHandle);
            vdeVar.b.remove(phoneAccountHandle);
        }
    }

    public final /* synthetic */ vcq e() {
        vcq vcqVarP = ((akzx) this.a).p();
        aooh.e(vcqVarP, "build(...)");
        return vcqVarP;
    }

    public final void f() {
        ((android.animation.TimeAnimator) this.a).end();
    }

    public final void g(android.animation.TimeAnimator.TimeListener timeListener) {
        ((android.animation.TimeAnimator) this.a).setTimeListener(timeListener);
    }

    public final j$.util.Optional h(defpackage.uyq uyqVar) {
        j$.util.Optional optionalE = ((zpm) this.a).e(uyqVar.c);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((defpackage.uyn) ((defpackage.apqr) optionalE.get()).a(defpackage.uyn.class)).lA()) : optionalE;
    }

    public final java.lang.Object i(java.util.Locale locale, aoln aolnVar) {
        return ((defpackage.uxc) this.a).a(locale, aolnVar);
    }

    public final /* synthetic */ defpackage.uww j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uww) aladVarP;
    }

    public final void k(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uww uwwVar = (defpackage.uww) akzxVar.b;
        defpackage.uww uwwVar2 = defpackage.uww.a;
        j$.util.Objects.requireNonNull(str);
        uwwVar.b |= 1;
        uwwVar.c = str;
    }

    public final void l(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uww uwwVar = (defpackage.uww) akzxVar.b;
        defpackage.uww uwwVar2 = defpackage.uww.a;
        uwwVar.d = a.T(i);
    }

    public final /* synthetic */ defpackage.uhl m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uhl) aladVarP;
    }

    public final void n(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uhl uhlVar = (defpackage.uhl) akzxVar.b;
        defpackage.uhl uhlVar2 = defpackage.uhl.a;
        uhlVar.b = z;
    }

    public final /* synthetic */ defpackage.ufu o() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ufu) aladVarP;
    }

    public final void p(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ufu ufuVar = (defpackage.ufu) akzxVar.b;
        defpackage.ufu ufuVar2 = defpackage.ufu.a;
        ufuVar.g = i - 1;
        ufuVar.b |= 32;
    }

    public final /* synthetic */ defpackage.ufh q() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ufh) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object r(aoln aolnVar) {
        defpackage.ufe ufeVar;
        if (aolnVar instanceof defpackage.ufe) {
            ufeVar = (defpackage.ufe) aolnVar;
            int i = ufeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufeVar.b = i - Integer.MIN_VALUE;
            } else {
                ufeVar = new defpackage.ufe(this, aolnVar);
            }
        } else {
            ufeVar = new defpackage.ufe(this, aolnVar);
        }
        java.lang.Object objAu = ufeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ufeVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.a.b();
            ufeVar.b = 1;
            objAu = aoov.au(aoxhVarB, ufeVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        return new java.lang.Long(((defpackage.ufh) objAu).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object s(aoln aolnVar) {
        defpackage.uff uffVar;
        if (aolnVar instanceof defpackage.uff) {
            uffVar = (defpackage.uff) aolnVar;
            int i = uffVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uffVar.b = i - Integer.MIN_VALUE;
            } else {
                uffVar = new defpackage.uff(this, aolnVar);
            }
        } else {
            uffVar = new defpackage.uff(this, aolnVar);
        }
        java.lang.Object objAu = uffVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uffVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.a.b();
            uffVar.b = 1;
            objAu = aoov.au(aoxhVarB, uffVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        return new java.lang.Long(((defpackage.ufh) objAu).c);
    }

    public final /* synthetic */ defpackage.ucu t() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ucu) aladVarP;
    }

    public final void u(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucu ucuVar = (defpackage.ucu) akzxVar.b;
        defpackage.ucu ucuVar2 = defpackage.ucu.a;
        ucuVar.b |= 1;
        ucuVar.c = j;
    }

    public final void v(aivr aivrVar) {
        aooh.f(aivrVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucu ucuVar = (defpackage.ucu) akzxVar.b;
        defpackage.ucu ucuVar2 = defpackage.ucu.a;
        j$.util.Objects.requireNonNull(aivrVar);
        ucuVar.j = aivrVar;
        ucuVar.b |= 256;
    }

    public final /* synthetic */ defpackage.tyz w() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tyz) aladVarP;
    }

    public final void x(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyz tyzVar = (defpackage.tyz) akzxVar.b;
        defpackage.tyz tyzVar2 = defpackage.tyz.a;
        j$.util.Objects.requireNonNull(str);
        tyzVar.c = str;
    }

    public final void y(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyz tyzVar = (defpackage.tyz) akzxVar.b;
        defpackage.tyz tyzVar2 = defpackage.tyz.a;
        tyzVar.d = i - 2;
    }

    public final java.util.Set z(java.lang.String str) {
        aooh.f(str, "parentType");
        java.util.Map map = (java.util.Map) ((aec) this.a).get(str);
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    public vaa(defpackage.abbp abbpVar) {
        aooh.f(abbpVar, "backend");
        this.a = abbpVar;
    }

    public vaa(ajml ajmlVar) {
        aooh.f(ajmlVar, "callScopedPrefetchedSpamStatusCache");
        this.a = ajmlVar;
    }

    public vaa(ecx ecxVar, aoss aossVar) {
        aooh.f(ecxVar, "dataStore");
        aooh.f(aossVar, "lightweightScope");
        this.a = ecxVar;
    }

    public vaa(java.lang.Object obj) {
        this.a = obj;
    }

    public vaa(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vaa(defpackage.uxc uxcVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = uxcVar;
    }

    public vaa(short[] sArr) {
        this.a = ahwt.a;
    }

    public vaa() {
        this.a = new android.animation.TimeAnimator();
    }

    public vaa(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public vaa(char[] cArr) {
        this.a = new java.util.HashMap();
    }

    public vaa(aazm aazmVar, defpackage.ulw ulwVar) {
        aooh.f(aazmVar, "encHelper");
        this.a = ulwVar;
    }

    private vaa(akzx akzxVar, int[] iArr) {
        ahvr.bN(akzxVar.b.d != 0, "VeIdentifier must be non-zero");
        this.a = akzxVar;
    }

    public vaa(defpackage.vaa vaaVar, defpackage.acmz acmzVar) {
        aooh.f(vaaVar, "veContext");
        aooh.f(acmzVar, "autoImpressionLogger");
        this.a = vaaVar;
        aooh.e(java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap()), "newSetFromMap(...)");
    }

    public vaa(byte[] bArr, byte[] bArr2) {
        this.a = new aca();
    }

    public vaa(byte[] bArr) {
        this.a = new aca();
    }
}
