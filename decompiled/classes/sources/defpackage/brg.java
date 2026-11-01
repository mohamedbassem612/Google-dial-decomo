package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class brg implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ brg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dhg */
    /* JADX WARN: Code duplicated, block: B:137:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0371 A[Catch: all -> 0x0392, LOOP:3: B:127:0x033e->B:138:0x0371, LOOP_END, TryCatch #0 {, blocks: (B:124:0x0324, B:127:0x033e, B:129:0x034e, B:130:0x0351, B:132:0x0358, B:134:0x0361, B:135:0x0369, B:138:0x0371, B:139:0x0374, B:141:0x037a, B:143:0x0380), top: B:224:0x0324 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [cav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws org.xmlpull.v1.XmlPullParserException, dhg, java.io.IOException {
        izx izxVar;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i = iIntValue & 3;
                int i2 = iIntValue & 1;
                int i3 = brj.a;
                if (cavVar.H(i != 2, i2)) {
                    defpackage.cmj cmjVar = defpackage.cmh.e;
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
                    int iM = defpackage.anty.M(cavVar.a());
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
                    java.lang.Object obj3 = this.a;
                    defpackage.cev.c(cavVar, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar, defpackage.dam.g);
                    defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
                    cavVar.u(2073076341);
                    brj.b(defpackage.cfo.j(-271126914, new ant(obj3, 4), cavVar), cavVar, 6);
                    cavVar.o();
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                int i4 = iIntValue2 & 3;
                int i5 = iIntValue2 & 1;
                int i6 = brj.a;
                if (cavVar2.H(i4 != 2, i5)) {
                    defpackage.cmw cmwVarM2 = defpackage.azm.m(defpackage.cmw.c, 24.0f, 0.0f, 2);
                    defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM2 = defpackage.anty.M(cavVar2.a());
                    defpackage.cje cjeVarM2 = cavVar2.M();
                    defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar2, cmwVarM2);
                    defpackage.aomy aomyVar2 = defpackage.dam.a;
                    cavVar2.L();
                    cavVar2.v();
                    if (cavVar2.F()) {
                        cavVar2.j(aomyVar2);
                    } else {
                        cavVar2.x();
                    }
                    ?? r0 = this.a;
                    defpackage.cev.c(cavVar2, cyeVarB2, defpackage.dam.e);
                    defpackage.cev.c(cavVar2, cjeVarM2, defpackage.dam.d);
                    defpackage.cev.c(cavVar2, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                    defpackage.cev.b(cavVar2, defpackage.dam.g);
                    defpackage.cev.c(cavVar2, cmwVarM3, defpackage.dam.c);
                    r0.a(cavVar2, 0);
                    cavVar2.n();
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.cmt cmtVar2 = defpackage.cmw.c;
                    java.lang.Object objG = cavVar3.g();
                    if (objG == defpackage.cau.a) {
                        objG = new bpr(9);
                        cavVar3.w(objG);
                    }
                    defpackage.cmw cmwVarB = defpackage.dig.b(cmtVar2, false, (defpackage.aonj) objG);
                    defpackage.cye cyeVarB3 = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM3 = defpackage.anty.M(cavVar3.a());
                    defpackage.cje cjeVarM3 = cavVar3.M();
                    defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar3, cmwVarB);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar3.L();
                    cavVar3.v();
                    if (cavVar3.F()) {
                        cavVar3.j(aomyVar3);
                    } else {
                        cavVar3.x();
                    }
                    ?? r1 = this.a;
                    defpackage.cev.c(cavVar3, cyeVarB3, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarM3, defpackage.dam.d);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf(iM3), defpackage.dam.f);
                    defpackage.cev.b(cavVar3, defpackage.dam.g);
                    defpackage.cev.c(cavVar3, cmwVarM4, defpackage.dam.c);
                    ((defpackage.aonn) r1.a()).a(cavVar3, 0);
                    cavVar3.n();
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i7 = iIntValue4 & 1;
                boolean z3 = (iIntValue4 & 3) != 2;
                int i8 = bto.a;
                if (cavVar4.H(z3, i7)) {
                    defpackage.bvt.b((java.lang.String) this.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar4, 0, 0, 262142);
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 4:
                ((apx) this.a).a(((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
                return defpackage.aojh.a;
            case 5:
                defpackage.cav cavVar5 = (defpackage.cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    defpackage.bvt.b(((but) this.a).b.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar5, 0, 0, 262142);
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Set set = (java.util.Set) obj;
                defpackage.aoot aootVar = new defpackage.aoot();
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.cee) obj4).f) {
                    defpackage.adw adwVar = ((cco) obj4).a;
                    defpackage.afx afxVar = new defpackage.afx((java.lang.Object) set, obj4, (java.lang.Object) aootVar, 12, (short[]) null);
                    defpackage.aoov.f(afxVar, 1);
                    java.lang.Object[] objArr = adwVar.b;
                    long[] jArr = adwVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = i9 - length;
                                int i11 = 0;
                                while (true) {
                                    int i12 = 8 - ((~i10) >>> 31);
                                    if (i11 < i12) {
                                        if ((255 & j) < 128) {
                                            afxVar.a(objArr[(i9 << 3) + i11]);
                                        }
                                        j >>= 8;
                                        i11++;
                                    } else if (i12 == 8) {
                                        if (i9 != length) {
                                            i9++;
                                        }
                                    }
                                }
                            } else if (i9 != length) {
                                i9++;
                            }
                        }
                    }
                    java.util.List list = (java.util.List) aootVar.a;
                    if (list != null) {
                        int size = list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ((defpackage.aowv) list.get(i13)).b(defpackage.aojh.a);
                        }
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cmw cmwVar = (defpackage.cmw) obj;
                defpackage.cmw cmwVarL = (defpackage.cmu) obj2;
                if (cmwVarL instanceof defpackage.cmr) {
                    ?? r2 = this.a;
                    defpackage.aono aonoVar = ((defpackage.cmr) cmwVarL).a;
                    defpackage.aoov.f(aonoVar, 3);
                    cmwVarL = defpackage.cfo.l(r2, (defpackage.cmw) aonoVar.a(defpackage.cmw.c, r2, 0));
                }
                return cmwVar.a(cmwVarL);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Float.valueOf(defpackage.wi.f((defpackage.czb) obj, false, (defpackage.czi[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case 9:
                return java.lang.Float.valueOf(defpackage.wi.f((defpackage.czb) obj, true, (defpackage.czi[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case 10:
                defpackage.cav cavVar6 = (defpackage.cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    ?? r3 = this.a;
                    int size2 = r3.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        defpackage.aonn aonnVar = (defpackage.aonn) r3.get(i14);
                        long jA = cavVar6.a();
                        long j2 = jA ^ (jA >>> 32);
                        defpackage.aomy aomyVar4 = defpackage.dam.b;
                        cavVar6.L();
                        cavVar6.v();
                        if (cavVar6.F()) {
                            cavVar6.j(aomyVar4);
                        } else {
                            cavVar6.x();
                        }
                        defpackage.cev.c(cavVar6, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
                        aonnVar.a(cavVar6, 0);
                        cavVar6.n();
                    }
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            case 11:
                return java.lang.Float.valueOf(defpackage.wi.f((defpackage.czb) obj, false, (defpackage.czi[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case 12:
                return java.lang.Float.valueOf(defpackage.wi.f((defpackage.czb) obj, true, (defpackage.czi[]) this.a, ((java.lang.Float) obj2).floatValue()));
            case 13:
                defpackage.cav cavVar7 = (defpackage.cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                    java.lang.Object objG2 = cavVar7.g();
                    if (objG2 == defpackage.cau.a) {
                        objG2 = new dkq(9);
                        cavVar7.w(objG2);
                    }
                    dpm.f(defpackage.dig.b(cmtVar3, false, (defpackage.aonj) objG2), (defpackage.aonn) this.a.a(), cavVar7, 0);
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
            case 14:
                android.app.Activity activity = (android.app.Activity) obj;
                android.content.Intent intent = (android.content.Intent) obj2;
                defpackage.aooh.f(activity, "first");
                defpackage.aooh.f(intent, "second");
                ?? r4 = this.a;
                if (!(r4 instanceof java.util.Collection) || !r4.isEmpty()) {
                    java.util.Iterator it = r4.iterator();
                    while (it.hasNext()) {
                        if (((defpackage.gpp) it.next()).a(activity, intent)) {
                            z2 = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z2);
            case 15:
                android.app.Activity activity2 = (android.app.Activity) obj;
                android.app.Activity activity3 = (android.app.Activity) obj2;
                defpackage.aooh.f(activity2, "first");
                defpackage.aooh.f(activity3, "second");
                ?? r5 = this.a;
                if (!(r5 instanceof java.util.Collection) || !r5.isEmpty()) {
                    java.util.Iterator it2 = r5.iterator();
                    while (it2.hasNext()) {
                        if (((defpackage.gpp) it2.next()).b(activity2, activity3)) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 16:
                ixc ixcVar = (ixc) obj;
                ixd ixdVar = (ixd) obj2;
                defpackage.aooh.f(ixcVar, "type");
                defpackage.aooh.f(ixdVar, "model");
                int iOrdinal = ixcVar.ordinal();
                java.lang.Object obj5 = this.a;
                if (iOrdinal == 0) {
                    ixe ixeVar = ixdVar.b == 1 ? (ixe) ixdVar.c : ixe.a;
                    defpackage.aooh.e(ixeVar, "getBotGreeting(...)");
                    izxVar = new izx(new hpc(obj5, ixeVar, 8, (byte[]) null), 6);
                } else {
                    if (iOrdinal != 1) {
                        return new izx((defpackage.aomy) null, 7);
                    }
                    ixf ixfVar = ixdVar.b == 2 ? (ixf) ixdVar.c : ixf.a;
                    defpackage.aooh.e(ixfVar, "getCustomGreeting(...)");
                    izxVar = new izx(new hpc(obj5, ixfVar, 5, (byte[]) null), new hpc(obj5, ixfVar, 6, (byte[]) null), new hpc(obj5, ixfVar, 7, (byte[]) null));
                }
                return izxVar;
            case 17:
                defpackage.cav cavVar8 = (defpackage.cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    defpackage.gus.aG(false, false, defpackage.cfo.j(-185000477, new defpackage.brg(this.a, 18), cavVar8), cavVar8, 384, 3);
                } else {
                    cavVar8.s();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.cav cavVar9 = (defpackage.cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    hhe.x((izq) this.a, (defpackage.cmw) null, cavVar9, 0);
                } else {
                    cavVar9.s();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.cav cavVar10 = (defpackage.cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    java.lang.Object obj6 = this.a;
                    iyi iyiVar = (iyi) obj6;
                    ixu ixuVar = (ixu) iyiVar.l.a();
                    int i15 = iyiVar.b.dX().getConfiguration().orientation;
                    boolean z4 = ixuVar.d;
                    defpackage.ixh ixhVar = ixuVar.c;
                    if (ixhVar == null) {
                        ixhVar = defpackage.ixh.a;
                    }
                    boolean z5 = i15 == 2;
                    defpackage.aooh.e(ixhVar, "getGreetingsData(...)");
                    defpackage.den.ab(defpackage.abjc.a.b(iyiVar.w), defpackage.cfo.j(-938170140, new defpackage.brg(new izq(z5, z4, iyiVar.a(ixhVar), new hll(obj6, 7), new hpc(obj6, ixuVar, 4, (byte[]) null)), 17), cavVar10), cavVar10, 48);
                } else {
                    cavVar10.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar11 = (defpackage.cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    defpackage.cmw cmwVarAY = defpackage.den.aY(this.a, 24.0f);
                    defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.k, cavVar11, 48);
                    int iM4 = defpackage.anty.M(cavVar11.a());
                    defpackage.cje cjeVarM4 = cavVar11.M();
                    defpackage.cmw cmwVarM5 = defpackage.cfo.m(cavVar11, cmwVarAY);
                    defpackage.aomy aomyVar5 = defpackage.dam.a;
                    cavVar11.L();
                    cavVar11.v();
                    if (cavVar11.F()) {
                        cavVar11.j(aomyVar5);
                    } else {
                        cavVar11.x();
                    }
                    defpackage.cev.c(cavVar11, cyeVarA, defpackage.dam.e);
                    defpackage.cev.c(cavVar11, cjeVarM4, defpackage.dam.d);
                    defpackage.cev.c(cavVar11, java.lang.Integer.valueOf(iM4), defpackage.dam.f);
                    defpackage.cev.b(cavVar11, defpackage.dam.g);
                    defpackage.cev.c(cavVar11, cmwVarM5, defpackage.dam.c);
                    defpackage.css cssVarK = defpackage.wv.k(2131230929, cavVar11, 0);
                    java.lang.String strF = defpackage.dfa.f(2132017555, cavVar11);
                    defpackage.cmt cmtVar4 = defpackage.cmw.c;
                    defpackage.rd.f(cssVarK, strF, defpackage.den.ba(cmtVar4, 0.0f, 8.0f, 0.0f, 24.0f), null, null, 0.0f, cavVar11, 392, 120);
                    defpackage.abrz.k(defpackage.dfa.f(2132017556, cavVar11), defpackage.den.aZ(cmtVar4, 40.0f, 0.0f), defpackage.den.ak(cavVar11).f, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar11).h, cavVar11, 48, 0, 130040);
                    cavVar11.n();
                } else {
                    cavVar11.s();
                }
                return defpackage.aojh.a;
        }
    }
}
