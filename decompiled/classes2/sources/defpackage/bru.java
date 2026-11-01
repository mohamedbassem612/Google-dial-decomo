package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bru implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ bru(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, java.util.Collection] */
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.ali aliVar;
        aoub aoubVar;
        aoub aoubVar2;
        defpackage.ali aliVar2 = null;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                ((defpackage.brq) obj2).show();
                aliVar = new defpackage.ali(obj2, 5);
                break;
            case 1:
                this.a.a();
                return aojh.a;
            case 2:
                this.a.a();
                return aojh.a;
            case 3:
                java.lang.Object obj3 = this.a;
                cra craVar = (cra) obj;
                int i = defpackage.bto.a;
                defpackage.btt bttVar = (defpackage.btt) obj3;
                float fC = bttVar.d.c();
                float fB = bttVar.d.p().b();
                float f = fC < fB ? fB - fC : 0.0f;
                craVar.x(f > 0.0f ? (java.lang.Float.intBitsToFloat((int) (craVar.p & 4294967295L)) + f) / java.lang.Float.intBitsToFloat((int) (craVar.p & 4294967295L)) : 1.0f);
                craVar.B(mni.bj(0.5f, 0.0f));
                return aojh.a;
            case 4:
                java.lang.Object obj4 = this.a;
                cra craVar2 = (cra) obj;
                int i2 = defpackage.bto.a;
                defpackage.btt bttVar2 = (defpackage.btt) obj4;
                float fC2 = bttVar2.d.c();
                float fB2 = bttVar2.d.p().b();
                float f2 = fC2 < fB2 ? fB2 - fC2 : 0.0f;
                craVar2.x(f2 > 0.0f ? 1.0f / ((java.lang.Float.intBitsToFloat((int) (craVar2.p & 4294967295L)) + f2) / java.lang.Float.intBitsToFloat((int) (craVar2.p & 4294967295L))) : 1.0f);
                craVar2.B(mni.bj(0.5f, 0.0f));
                return aojh.a;
            case 5:
                java.lang.Object obj5 = this.a;
                defpackage.buc bucVar = defpackage.buc.a;
                return mni.bp((czc) obj5, (czb) obj);
            case 6:
                long j = ((dpp) obj).a;
                defpackage.bun bunVar = (defpackage.bun) this.a;
                bunVar.i.h((int) (j >> 32));
                bunVar.j.h((int) (j & 4294967295L));
                return aojh.a;
            case 7:
                return java.lang.Boolean.valueOf(aooh.n(((defpackage.bpl) obj).a, this.a));
            case 8:
                aliVar = (djg) obj;
                java.lang.Object obj6 = ((djg) aliVar).a;
                cbd cbdVar = bvt.a;
                djd djdVar = (djd) obj6;
                boolean z = djdVar instanceof defpackage.djv;
                java.lang.Object obj7 = this.a;
                if (z) {
                    defpackage.djv djvVar = (defpackage.djv) djdVar;
                    if (djvVar.b == null) {
                        if (aliVar == null) {
                            aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>");
                        } else {
                            aliVar2 = aliVar;
                        }
                        return djg.a(aliVar2, new defpackage.djv(djvVar.a, (defpackage.dkx) obj7), 0, 14);
                    }
                }
                if (djdVar instanceof defpackage.dju) {
                    defpackage.dju djuVar = (defpackage.dju) djdVar;
                    if (djuVar.b == null) {
                        if (aliVar == null) {
                            aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Clickable>");
                        } else {
                            aliVar2 = aliVar;
                        }
                        return djg.a(aliVar2, new defpackage.dju(djuVar.a, (defpackage.dkx) obj7, djuVar.c), 0, 14);
                    }
                }
                break;
            case 9:
                ayy ayyVar = defpackage.bwh.a;
                this.a.b(new cpm(((cxi) obj).l(0L)));
                return aojh.a;
            case 10:
                diq diqVar = (diq) obj;
                java.lang.Object obj8 = this.a;
                ayy ayyVar2 = defpackage.bwh.a;
                dfb.l(diqVar, 1);
                dfb.m(diqVar, (java.lang.String) obj8);
                return aojh.a;
            case 11:
                ayy ayyVar3 = defpackage.bwh.a;
                this.a.b((cxi) obj);
                return aojh.a;
            case 12:
                diq diqVar2 = (diq) obj;
                aiq aiqVar = defpackage.bws.a;
                float fS = aooc.s(((java.lang.Number) this.a.a()).floatValue(), 0.0f, 1.0f);
                if (true == java.lang.Float.isNaN(fS)) {
                    fS = 0.0f;
                }
                dfb.n(diqVar2, new defpackage.dia(fS, new aopm(0.0f, 1.0f)));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.bxn) this.a).m.h(((java.lang.Number) ((aii) obj).d()).floatValue() % 1.0f);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aliVar = new defpackage.ali(this.a, 6);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                diq diqVar3 = (diq) obj;
                dfb.l(diqVar3, 1);
                dfb.m(diqVar3, (java.lang.String) this.a);
                return aojh.a;
            case 16:
                defpackage.cnw cnwVar = (defpackage.cnw) obj;
                java.lang.Object obj9 = this.a;
                final defpackage.byf byfVar = (defpackage.byf) obj9;
                float fFloatValue = ((java.lang.Number) byfVar.n.a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                defpackage.bxn bxnVar = (defpackage.bxn) obj9;
                final float fA = bxnVar.e * cnwVar.a();
                final float fA2 = bxnVar.f * cnwVar.a();
                float f3 = fFloatValue > 1.0f ? 1.0f : fFloatValue;
                int iA = dpi.a(0.0f, 0.0f);
                float fFloatValue2 = ((java.lang.Number) byfVar.o.a(java.lang.Float.valueOf(f3))).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                aii aiiVar = byfVar.p;
                float f4 = fFloatValue2 <= 1.0f ? fFloatValue2 : 1.0f;
                if (aiiVar == null) {
                    byfVar.p = aij.a(f4);
                    byfVar.r.h(f4);
                }
                if (((cmv) obj9).D) {
                    aii aiiVar2 = byfVar.p;
                    aooh.c(aiiVar2);
                    if (((java.lang.Number) aiiVar2.c()).floatValue() != f4 && ((aoubVar2 = byfVar.q) == null || aoubVar2.x())) {
                        byfVar.q = aoov.an(byfVar.M(), (aolr) null, 0, new defpackage.bvw(byfVar, f4, (aoln) null, 2), 3);
                    }
                }
                defpackage.bxz bxzVar = bxnVar.h;
                long jN = cnwVar.n();
                float f5 = bxnVar.c.a;
                aoub aoubVar3 = byfVar.q;
                if (fA2 <= 0.0f) {
                    throw new java.lang.IllegalArgumentException("Wavelength should be greater than zero");
                }
                if (!cpp.c(jN, bxzVar.a) || fA2 != bxzVar.b) {
                    int iMax = java.lang.Math.max(5, (int) java.lang.Math.round((((double) ((cpp.a(jN) / 2.0f) - (f5 / 2.0f))) * 6.283185307179586d) / ((double) fA2)));
                    cei ceiVar = bxzVar.e;
                    if (iMax != ceiVar.c()) {
                        bxzVar.c = defpackage.avo.r(iMax).c();
                        bxzVar.d = defpackage.avo.s(iMax, 0.0f, 0.75f, new defpackage.elk(0.35f, 0.4f), new defpackage.elk(0.5f, 0.0f), 226).c();
                        if (aoubVar3 != null) {
                            defpackage.ely elyVar = bxzVar.c;
                            aooh.c(elyVar);
                            defpackage.ely elyVar2 = bxzVar.d;
                            aooh.c(elyVar2);
                            bxzVar.f = new izg(elyVar, elyVar2);
                        }
                    }
                    bxzVar.a = new cpp(jN);
                    bxzVar.b = fA2;
                    ceiVar.h(iMax);
                } else if (aoubVar3 != null && bxzVar.f == null) {
                    defpackage.ely elyVar3 = bxzVar.c;
                    aooh.c(elyVar3);
                    defpackage.ely elyVar4 = bxzVar.d;
                    aooh.c(elyVar4);
                    bxzVar.f = new izg(elyVar3, elyVar4);
                }
                int i3 = bxnVar.l;
                cei ceiVar2 = bxzVar.e;
                if (i3 != ceiVar2.c()) {
                    bxnVar.l = aooc.t(ceiVar2.c(), 5);
                }
                if (f4 > 0.0f && ((aoubVar = bxnVar.k) == null || aoubVar.x())) {
                    bxnVar.e();
                }
                final boolean z2 = iA > 0;
                final float f6 = f3;
                return cnwVar.q(new aonj() { // from class: byc
                    /* JADX WARN: Code duplicated, block: B:38:0x0154  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0166  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0187  */
                    /* JADX WARN: Code duplicated, block: B:48:0x018b  */
                    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0196  */
                    /* JADX WARN: Code duplicated, block: B:55:0x01a9  */
                    /* JADX WARN: Code duplicated, block: B:56:0x020e  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0219  */
                    /* JADX WARN: Code duplicated, block: B:67:0x0254  */
                    /* JADX WARN: Code duplicated, block: B:75:0x0277  */
                    public final java.lang.Object a(java.lang.Object obj10) {
                        boolean z3;
                        defpackage.bxy bxyVar;
                        float f7;
                        boolean z4;
                        float f8;
                        cpx cpxVar;
                        cpx cpxVar2;
                        float f9;
                        float f10;
                        float f11;
                        float f12;
                        float f13;
                        float f14;
                        long j2;
                        long j3;
                        csm csmVar;
                        csj csjVar;
                        csj csjVar2 = (dbm) obj10;
                        defpackage.byf byfVar2 = byfVar;
                        float fC3 = byfVar2.r.c();
                        long jO = csjVar2.o();
                        defpackage.byd bydVar = new defpackage.byd(byfVar2);
                        defpackage.bye byeVar = new defpackage.bye(byfVar2);
                        boolean z5 = z2;
                        float fC4 = (fC3 <= 0.0f || !z5) ? 0.0f : byfVar2.m.c();
                        defpackage.bxy bxyVar2 = byfVar2.i;
                        float f15 = fA;
                        float f16 = fA2;
                        csm csmVar2 = byfVar2.c;
                        csm csmVar3 = byfVar2.d;
                        if (anty.ah(bxyVar2.c, jO) && bxyVar2.a == fC3 && bxyVar2.b == f16 && aooh.n(bxyVar2.g, csmVar2) && aooh.n(bxyVar2.h, csmVar3) && bxyVar2.e == f15) {
                            if (bxyVar2.k == z3) {
                                z3 = z5;
                                f7 = fC4;
                                bxyVar = bxyVar2;
                                z4 = false;
                            }
                            if (!anty.ah(bxyVar.c, 9205357640488583168L)) {
                                throw new java.lang.IllegalArgumentException("updateDrawPaths was called before updateFullPaths");
                            }
                            f8 = f6;
                            if (z4 || bxyVar.d != f8 || bxyVar.f != f7) {
                                cpxVar = bxyVar.r;
                                cpxVar.l();
                                cpxVar2 = bxyVar.q;
                                cpxVar2.l();
                                float f17 = bxyVar.i;
                                f9 = f17 * 0.0f;
                                f10 = f17 * f8;
                                float fMin = java.lang.Math.min(f10, bxyVar.e);
                                float fMin2 = java.lang.Math.min(f10, bxyVar.n);
                                f11 = fMin2 + fMin2 + fMin;
                                if (bxyVar.k) {
                                    if (f7 < 0.0f) {
                                        f13 = 0.0f;
                                    } else {
                                        f13 = f7;
                                    }
                                    if (f13 > 1.0f) {
                                        f13 = 1.0f;
                                    }
                                    float f18 = bxyVar.i * f13;
                                    bxyVar.s.d(f9 + f18, f10 + f18, cpxVar2);
                                    f14 = (f13 * 360.0f) % 360.0f;
                                    if (f14 != 0.0f) {
                                        cpn cpnVarB = bxyVar.o.b();
                                        cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB.b() & 4294967295L)))) & 4294967295L));
                                        float[] fArr = bxyVar.m;
                                        cqt.c(fArr);
                                        cqt.d(fArr, -f14);
                                        cpxVar2.n(fArr);
                                        cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB.b() & 4294967295L)))) & 4294967295L));
                                    }
                                } else {
                                    bxyVar.s.d(f9, f10, cpxVar2);
                                }
                                f12 = bxyVar.j;
                                if (f12 > 0.0f) {
                                    bxyVar.t.d((f8 * f12) + f11, f12 - f11, cpxVar);
                                }
                                bxyVar.d = f8;
                                bxyVar.f = f7;
                            }
                            j2 = byfVar2.a;
                            j3 = byfVar2.b;
                            csmVar = byfVar2.c;
                            csm csmVar4 = byfVar2.d;
                            if (!anty.ah(j3, cfd.M(0)) || anty.ah(j3, cfd.S())) {
                                csjVar = csjVar2;
                            } else {
                                csjVar = csjVar2;
                                den.S(csjVar, bxyVar.r, j3, csmVar4, 52);
                            }
                            if (!anty.ah(j2, cfd.M(0)) && !anty.ah(j2, cfd.S())) {
                                den.S(csjVar, bxyVar.q, j2, csmVar, 52);
                            }
                            return aojh.a;
                        }
                        z3 = z5;
                        z3 = z5;
                        float f19 = fC4;
                        boolean zX = a.x(csmVar2.c, 0);
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jO & 4294967295L));
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jO >> 32));
                        bxyVar2.n = (!(zX && a.x(csmVar3.c, 0)) && fIntBitsToFloat <= fIntBitsToFloat2) ? java.lang.Math.max(csmVar2.a / 2.0f, csmVar3.a / 2.0f) : 0.0f;
                        float[] fArr2 = bxyVar2.l;
                        cqt.c(fArr2);
                        float f20 = csmVar2.a;
                        cqt.g(fArr2, fIntBitsToFloat2 - f20, fIntBitsToFloat - f20);
                        cpx cpxVar3 = bxyVar2.o;
                        cpxVar3.l();
                        java.lang.Float fValueOf = java.lang.Float.valueOf(fC3);
                        java.lang.Float fValueOf2 = java.lang.Float.valueOf(f16);
                        java.lang.Float fValueOf3 = java.lang.Float.valueOf(f20);
                        bxyVar = bxyVar2;
                        f7 = f19;
                        boolean z6 = z3;
                        bydVar.a(fValueOf, fValueOf2, fValueOf3, new cpp(jO), java.lang.Boolean.valueOf(z3), cpxVar3);
                        defpackage.bxy.a(cpxVar3, jO, fArr2);
                        defpackage.ni niVar = bxyVar.s;
                        niVar.c(cpxVar3, true);
                        bxyVar.i = z6 ? niVar.b() / 2.0f : niVar.b();
                        cpx cpxVar4 = bxyVar.p;
                        cpxVar4.l();
                        z4 = true;
                        byeVar.a(fValueOf, fValueOf2, fValueOf3, new cpp(jO), cpxVar4);
                        defpackage.bxy.a(cpxVar4, jO, fArr2);
                        defpackage.ni niVar2 = bxyVar.t;
                        niVar2.c(cpxVar4, true);
                        bxyVar.j = niVar2.b();
                        bxyVar.c = jO;
                        bxyVar.a = fC3;
                        bxyVar.b = f16;
                        bxyVar.g = csmVar2;
                        bxyVar.h = csmVar3;
                        bxyVar.e = f15;
                        bxyVar.k = z6;
                        if (!anty.ah(bxyVar.c, 9205357640488583168L)) {
                            throw new java.lang.IllegalArgumentException("updateDrawPaths was called before updateFullPaths");
                        }
                        f8 = f6;
                        if (z4) {
                            cpxVar = bxyVar.r;
                            cpxVar.l();
                            cpxVar2 = bxyVar.q;
                            cpxVar2.l();
                            float f110 = bxyVar.i;
                            f9 = f110 * 0.0f;
                            f10 = f110 * f8;
                            float fMin3 = java.lang.Math.min(f10, bxyVar.e);
                            float fMin4 = java.lang.Math.min(f10, bxyVar.n);
                            f11 = fMin4 + fMin4 + fMin3;
                            if (bxyVar.k) {
                                if (f7 < 0.0f) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f7;
                                }
                                if (f13 > 1.0f) {
                                    f13 = 1.0f;
                                }
                                float f111 = bxyVar.i * f13;
                                bxyVar.s.d(f9 + f111, f10 + f111, cpxVar2);
                                f14 = (f13 * 360.0f) % 360.0f;
                                if (f14 != 0.0f) {
                                    cpn cpnVarB2 = bxyVar.o.b();
                                    cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB2.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB2.b() & 4294967295L)))) & 4294967295L));
                                    float[] fArr3 = bxyVar.m;
                                    cqt.c(fArr3);
                                    cqt.d(fArr3, -f14);
                                    cpxVar2.n(fArr3);
                                    cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB2.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB2.b() & 4294967295L)))) & 4294967295L));
                                }
                            } else {
                                bxyVar.s.d(f9, f10, cpxVar2);
                            }
                            f12 = bxyVar.j;
                            if (f12 > 0.0f) {
                                bxyVar.t.d((f8 * f12) + f11, f12 - f11, cpxVar);
                            }
                            bxyVar.d = f8;
                            bxyVar.f = f7;
                        } else {
                            cpxVar = bxyVar.r;
                            cpxVar.l();
                            cpxVar2 = bxyVar.q;
                            cpxVar2.l();
                            float f112 = bxyVar.i;
                            f9 = f112 * 0.0f;
                            f10 = f112 * f8;
                            float fMin5 = java.lang.Math.min(f10, bxyVar.e);
                            float fMin6 = java.lang.Math.min(f10, bxyVar.n);
                            f11 = fMin6 + fMin6 + fMin5;
                            if (bxyVar.k) {
                                if (f7 < 0.0f) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f7;
                                }
                                if (f13 > 1.0f) {
                                    f13 = 1.0f;
                                }
                                float f113 = bxyVar.i * f13;
                                bxyVar.s.d(f9 + f113, f10 + f113, cpxVar2);
                                f14 = (f13 * 360.0f) % 360.0f;
                                if (f14 != 0.0f) {
                                    cpn cpnVarB3 = bxyVar.o.b();
                                    cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB3.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cpnVarB3.b() & 4294967295L)))) & 4294967295L));
                                    float[] fArr4 = bxyVar.m;
                                    cqt.c(fArr4);
                                    cqt.d(fArr4, -f14);
                                    cpxVar2.n(fArr4);
                                    cpxVar2.o((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB3.b() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cpnVarB3.b() & 4294967295L)))) & 4294967295L));
                                }
                            } else {
                                bxyVar.s.d(f9, f10, cpxVar2);
                            }
                            f12 = bxyVar.j;
                            if (f12 > 0.0f) {
                                bxyVar.t.d((f8 * f12) + f11, f12 - f11, cpxVar);
                            }
                            bxyVar.d = f8;
                            bxyVar.f = f7;
                        }
                        j2 = byfVar2.a;
                        j3 = byfVar2.b;
                        csmVar = byfVar2.c;
                        csm csmVar5 = byfVar2.d;
                        if (anty.ah(j3, cfd.M(0))) {
                            csjVar = csjVar2;
                        } else {
                            csjVar = csjVar2;
                        }
                        if (!anty.ah(j2, cfd.M(0))) {
                            den.S(csjVar, bxyVar.q, j2, csmVar, 52);
                        }
                        return aojh.a;
                    }
                });
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.byf) this.a).r.h(((java.lang.Number) ((aii) obj).d()).floatValue());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return java.lang.Boolean.valueOf(aooh.n(((vx) obj).a, this.a));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Integer.valueOf(((cfm) this.a).d(cfd.c(((defpackage.cck) obj).g)));
            default:
                return java.lang.Boolean.valueOf(this.a.contains(obj));
        }
        return aliVar;
    }
}
