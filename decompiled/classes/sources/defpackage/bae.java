package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bae implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bae(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0354 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0356 A[LOOP:2: B:153:0x031d->B:167:0x0356, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x03dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x03df A[Catch: all -> 0x0413, LOOP:4: B:185:0x03a7->B:200:0x03df, LOOP_END, TryCatch #0 {, blocks: (B:178:0x037d, B:180:0x0390, B:182:0x0399, B:185:0x03a7, B:187:0x03b2, B:188:0x03b8, B:190:0x03bc, B:192:0x03c2, B:194:0x03cb, B:196:0x03d4, B:197:0x03d7, B:200:0x03df, B:209:0x0402, B:201:0x03e3, B:202:0x03e7, B:204:0x03ed, B:206:0x03f5, B:208:0x03fe), top: B:226:0x037d }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cmi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cmj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [czq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [czq, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cjx cjxVar;
        java.lang.Object obj3;
        defpackage.clk clkVar;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.lang.Object obj4;
        java.lang.Object objBT;
        defpackage.aosb aosbVarC = null;
        aowvVar = null;
        aowvVar = null;
        aowvVar = null;
        defpackage.aowv aowvVar = null;
        switch (this.$cid) {
            case 0:
                return new defpackage.dpn(((long) this.a.a(0, (int) (((defpackage.dpp) obj).a >> 32), (defpackage.dpq) obj2)) << 32);
            case 1:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                float fFloatValue2 = ((java.lang.Float) obj2).floatValue();
                java.lang.Object obj5 = this.a;
                defpackage.aoov.an(((defpackage.cmv) obj5).M(), null, 0, new apb((defpackage.apd) obj5, fFloatValue, fFloatValue2, (defpackage.aoln) null), 3);
                return java.lang.Boolean.TRUE;
            case 2:
                return new defpackage.dpn(((long) ((defpackage.cmn) this.a).a(0, (int) (((defpackage.dpp) obj).a & 4294967295L))) & 4294967295L);
            case 3:
                return new defpackage.dpn(this.a.a(0L, ((defpackage.dpp) obj).a, (defpackage.dpq) obj2));
            case 4:
                char c = 7;
                java.util.Set set = (java.util.Set) obj;
                java.lang.Object obj6 = this.a;
                synchronized (((defpackage.cds) obj6).b) {
                    if (((defpackage.cdm) ((defpackage.cds) obj6).k.c()).compareTo(defpackage.cdm.e) >= 0) {
                        defpackage.ady adyVar = ((defpackage.cds) obj6).l;
                        if (set instanceof defpackage.cff) {
                            defpackage.ady adyVar2 = ((defpackage.cff) set).a;
                            java.lang.Object[] objArr = adyVar2.b;
                            long[] jArr = adyVar2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = (~(i - length)) >>> 31;
                                        int i3 = 0;
                                        while (true) {
                                            int i4 = 8 - i2;
                                            if (i3 < i4) {
                                                if ((j & 255) < 128) {
                                                    java.lang.Object obj7 = objArr[(i << 3) + i3];
                                                    if (!(obj7 instanceof defpackage.cls) || ((defpackage.cls) obj7).j(1)) {
                                                        adyVar.j(obj7);
                                                    }
                                                }
                                                j >>= 8;
                                                i3++;
                                            } else if (i4 == 8) {
                                                if (i != length) {
                                                    i++;
                                                    c = 7;
                                                }
                                            }
                                        }
                                    } else if (i != length) {
                                        i++;
                                        c = 7;
                                    }
                                }
                            }
                        } else {
                            for (java.lang.Object obj8 : set) {
                                if (!(obj8 instanceof defpackage.cls) || ((defpackage.cls) obj8).j(1)) {
                                    adyVar.j(obj8);
                                }
                            }
                        }
                        aosbVarC = ((defpackage.cds) obj6).C();
                    }
                    break;
                }
                if (aosbVarC != null) {
                    aosbVarC.w(defpackage.aojh.a);
                }
                return defpackage.aojh.a;
            case 5:
                java.util.Set set2 = (java.util.Set) obj;
                java.lang.Object obj9 = this.a;
                synchronized (((defpackage.cee) obj9).f) {
                    defpackage.ady adyVar3 = ((defpackage.cec) obj9).d;
                    if (adyVar3 != null) {
                        java.lang.Object[] objArr2 = adyVar3.b;
                        long[] jArr2 = adyVar3.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = (~(i5 - length2)) >>> 31;
                                    int i7 = 0;
                                    while (true) {
                                        int i8 = 8 - i6;
                                        if (i7 < i8) {
                                            if ((j2 & 255) >= 128 || !set2.contains(objArr2[(i5 << 3) + i7])) {
                                                j2 >>= 8;
                                                i7++;
                                            } else {
                                                aowvVar = ((defpackage.cec) obj9).c;
                                            }
                                        } else if (i8 == 8) {
                                            if (i5 != length2) {
                                                i5++;
                                            }
                                        }
                                    }
                                } else if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                    } else if (defpackage.ajsz.cj(set2, ((defpackage.cec) obj9).a)) {
                        aowvVar = ((defpackage.cec) obj9).c;
                    }
                }
                if (aowvVar != null) {
                    aowvVar.b(defpackage.aojh.a);
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.a(obj);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                this.a.a(obj);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cjs cjsVar = (defpackage.cjs) obj;
                java.util.List list = (java.util.List) this.a.a(cjsVar, obj2);
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    java.lang.Object obj10 = list.get(i9);
                    if (obj10 != null && (cjxVar = cjsVar.b) != null && !cjxVar.e(obj10)) {
                        throw new java.lang.IllegalArgumentException("item at index " + i9 + " can't be saved: " + obj10);
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new java.util.ArrayList(list);
            case 9:
                java.util.Set set3 = (java.util.Set) obj;
                do {
                    obj3 = this.a;
                    clkVar = (defpackage.clk) obj3;
                    atomicReference = clkVar.b;
                    obj4 = atomicReference.get();
                    if (obj4 == null) {
                        objBT = set3;
                    } else if (obj4 instanceof java.util.Set) {
                        objBT = java.util.Arrays.asList(obj4, set3);
                        defpackage.aooh.e(objBT, "asList(...)");
                    } else {
                        if (!(obj4 instanceof java.util.List)) {
                            defpackage.cax.a("Unexpected notification");
                            throw new defpackage.aoiq();
                        }
                        java.util.List listSingletonList = java.util.Collections.singletonList(set3);
                        defpackage.aooh.e(listSingletonList, "singletonList(...)");
                        objBT = defpackage.ajsz.bT((java.util.Collection) obj4, listSingletonList);
                    }
                } while (!defpackage.anty.Q(atomicReference, obj4, objBT));
                if (clkVar.f()) {
                    clkVar.a.a(new defpackage.bpa(obj3, 6));
                }
                return defpackage.aojh.a;
            case 10:
                ((defpackage.cnn) this.a).m(((java.lang.Integer) obj).intValue(), (defpackage.dij) obj2);
                return defpackage.aojh.a;
            case 11:
                defpackage.dbk dbkVar = (defpackage.dbk) obj;
                defpackage.cxy cxyVar = dbkVar.x;
                java.lang.Object obj11 = this.a;
                if (cxyVar == null) {
                    defpackage.cxy cxyVar2 = new defpackage.cxy(dbkVar, ((defpackage.adnp) obj11).a);
                    dbkVar.x = cxyVar2;
                    cxyVar = cxyVar2;
                }
                defpackage.adnp adnpVar = (defpackage.adnp) obj11;
                adnpVar.e = cxyVar;
                adnpVar.a().j();
                defpackage.cxy cxyVarA = adnpVar.a();
                ?? r0 = adnpVar.a;
                if (cxyVarA.c != r0) {
                    cxyVarA.c = r0;
                    cxyVarA.k(false);
                    cxyVarA.a.W(false, true, true);
                }
                return defpackage.aojh.a;
            case 12:
                ((defpackage.adnp) this.a).a().b = (defpackage.caz) obj2;
                return defpackage.aojh.a;
            case 13:
                defpackage.cxy cxyVarA2 = ((defpackage.adnp) this.a).a();
                ((defpackage.dbk) obj).ac(new defpackage.cxu(cxyVarA2, (defpackage.aonn) obj2, cxyVarA2.k));
                return defpackage.aojh.a;
            case 14:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    ((defpackage.ddl) this.a).b(cavVar, 0);
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 15:
                defpackage.aaha aahaVar = (defpackage.aaha) obj;
                defpackage.aaha aahaVar2 = (defpackage.aaha) obj2;
                if (aahaVar == null) {
                    defpackage.aooh.i("prependHint");
                }
                if (aahaVar2 == null) {
                    defpackage.aooh.i("appendHint");
                }
                defpackage.gds gdsVar = (defpackage.gds) this.a;
                if (defpackage.dzn.o(gdsVar, (defpackage.gds) aahaVar.b, defpackage.gac.b)) {
                    aahaVar.g(gdsVar);
                }
                if (defpackage.dzn.o(gdsVar, (defpackage.gds) aahaVar2.b, defpackage.gac.c)) {
                    aahaVar2.g(gdsVar);
                }
                return defpackage.aojh.a;
            case 16:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    java.lang.Object obj12 = this.a;
                    if (obj12 == null) {
                        defpackage.aooh.i("<this>");
                    }
                    defpackage.kcq.c(null, defpackage.den.bc(0.0f, obj12 == defpackage.lpv.a ? 0.0f : 64.0f, 0.0f, 0.0f, 13), null, null, null, cavVar2, 0);
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.cbd cbdVar = defpackage.lpx.a;
                    android.content.Context context = (android.content.Context) cavVar3.e(defpackage.dep.b);
                    android.content.res.Configuration configuration = (android.content.res.Configuration) cavVar3.e(defpackage.dep.a);
                    java.lang.Object objG = cavVar3.g();
                    java.lang.Object obj13 = defpackage.cau.a;
                    if (objG == obj13) {
                        objG = ((defpackage.lpw) defpackage.agab.aH(context, defpackage.lpw.class)).ce();
                        cavVar3.w(objG);
                    }
                    defpackage.tec tecVar = (defpackage.tec) objG;
                    boolean zB = cavVar3.B(configuration);
                    java.lang.Object objG2 = cavVar3.g();
                    if (zB || objG2 == obj13) {
                        objG2 = configuration.smallestScreenWidthDp >= 600 ? defpackage.lpv.c : tecVar.a(context) ? defpackage.lpv.a : defpackage.lpv.b;
                        cavVar3.w(objG2);
                    }
                    defpackage.lpv lpvVar = (defpackage.lpv) objG2;
                    defpackage.den.ac(new defpackage.cdj[]{defpackage.abjc.a.b(((defpackage.kbk) this.a).h), defpackage.lpx.a.b(lpvVar)}, defpackage.cfo.j(138137309, new defpackage.bae(lpvVar, 18), cavVar3), cavVar3, 48);
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    defpackage.gus.aG(true, false, defpackage.cfo.j(-730297090, new defpackage.bae(this.a, 16), cavVar4), cavVar4, 390, 2);
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.cav cavVar5 = (defpackage.cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    defpackage.kcq.p((defpackage.kgm) this.a, cavVar5, 0);
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            default:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.lang.IllegalStateException("This ContentObserver should not propagate changes itself.");
                }
                java.lang.Object obj14 = this.a;
                defpackage.aojh aojhVar = defpackage.aojh.a;
                java.lang.Object objB = ((defpackage.aowj) obj14).b(aojhVar);
                if (defpackage.aowm.c(objB) || (objB instanceof defpackage.aowk)) {
                    return aojhVar;
                }
                throw new java.lang.IllegalStateException("trySend failed unexpectedly on a non-closed channel with conflated buffer.");
        }
    }
}
