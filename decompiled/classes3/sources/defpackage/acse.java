package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acse implements defpackage.acru {
    public static final defpackage.acse a = new defpackage.acse();
    private static final amnk b = amnk.a;
    private static final aku c = new aku(1.0f, 300.0f, (java.lang.Object) null);
    private static final aku d = new aku(1.0f, 300.0f, (java.lang.Object) null);
    private static final aku e = new aku(1.0f, 300.0f, (java.lang.Object) null);

    @Override // defpackage.acrs
    public final defpackage.acrc a(int i, boolean z, long j, bor borVar, aomy aomyVar, aomy aomyVar2, int i2, float f, float f2, java.util.Map map) {
        java.util.Map map2;
        long j2;
        long j3;
        aooh.f(map, "overrides");
        if (z) {
            java.util.Map map3 = defpackage.acsc.a;
            map2 = defpackage.acsc.a;
        } else {
            java.util.Map map4 = defpackage.acsd.a;
            map2 = defpackage.acsd.a;
        }
        defpackage.acrk acrkVarB = (defpackage.acrk) map2.get(new defpackage.acro(i));
        if (acrkVarB == null) {
            return null;
        }
        ajml ajmlVar = (ajml) map.get(new defpackage.acro(i));
        int i3 = acrkVarB.x;
        int iMin = java.lang.Math.min(i2, i3);
        if (ajmlVar != null) {
            if (afsq.aS(ajmlVar) != null) {
                java.lang.Integer numAS = afsq.aS(ajmlVar);
                aooh.c(numAS);
                int iIntValue = numAS.intValue();
                acrkVarB = defpackage.acrk.b(acrkVarB, afsq.aM(acrkVarB.p, iIntValue), afsq.aM(acrkVarB.q, iIntValue), afsq.aM(acrkVarB.r, iIntValue), afsq.aM(acrkVarB.s, iIntValue), afsq.aM(acrkVarB.t, iIntValue), afsq.aM(acrkVarB.u, iIntValue), afsq.aM(acrkVarB.v, iIntValue), 0, 12615679);
            }
            long j4 = ajmlVar.a;
            java.lang.Float f3 = (java.lang.Float) ajmlVar.a("blurFactor");
            float fFloatValue = f3 != null ? f3.floatValue() : acrkVarB.n;
            java.lang.Float f4 = (java.lang.Float) ajmlVar.a("apertureBlurFactor");
            float fFloatValue2 = f4 != null ? f4.floatValue() : acrkVarB.o;
            java.lang.Float f5 = (java.lang.Float) ajmlVar.a("thickStrokeRatio");
            float fFloatValue3 = f5 != null ? f5.floatValue() : acrkVarB.h;
            java.lang.Float f6 = (java.lang.Float) ajmlVar.a("thinStrokeRatio");
            float fFloatValue4 = f6 != null ? f6.floatValue() : acrkVarB.i;
            java.lang.Float f7 = (java.lang.Float) ajmlVar.a("thickAmplitude");
            float fFloatValue5 = f7 != null ? f7.floatValue() : acrkVarB.j;
            java.lang.Float f8 = (java.lang.Float) ajmlVar.a("thinAmplitude");
            float fFloatValue6 = f8 != null ? f8.floatValue() : acrkVarB.k;
            defpackage.acrt acrtVar = (defpackage.acrt) ajmlVar.a("rotationMode");
            if (acrtVar == null) {
                acrtVar = acrkVarB.a;
            }
            defpackage.acrt acrtVar2 = acrtVar;
            java.lang.Float f9 = (java.lang.Float) ajmlVar.a("largeRotationBaseOffset");
            float fFloatValue7 = f9 != null ? f9.floatValue() : acrkVarB.d;
            java.lang.Float f10 = (java.lang.Float) ajmlVar.a("apertureMaskAngle");
            float fFloatValue8 = f10 != null ? f10.floatValue() : acrkVarB.b;
            aiq aiqVar = (aiq) ajmlVar.a("sweepOffsetSpec");
            if (aiqVar == null) {
                aiqVar = acrkVarB.q;
            }
            aiq aiqVar2 = aiqVar;
            aiq aiqVar3 = (aiq) ajmlVar.a("sweepApertureMultiplierSpec");
            if (aiqVar3 == null) {
                aiqVar3 = acrkVarB.r;
            }
            aiq aiqVar4 = aiqVar3;
            aiq aiqVar5 = (aiq) ajmlVar.a("sweepYVarianceSpec");
            if (aiqVar5 == null) {
                aiqVar5 = acrkVarB.s;
            }
            aiq aiqVar6 = aiqVar5;
            java.lang.Float f11 = (java.lang.Float) ajmlVar.a("rotationBase");
            float fFloatValue9 = f11 != null ? f11.floatValue() : acrkVarB.c;
            java.lang.Float f12 = (java.lang.Float) ajmlVar.a("smallRotationBaseOffset");
            float fFloatValue10 = f12 != null ? f12.floatValue() : acrkVarB.e;
            java.lang.Float f13 = (java.lang.Float) ajmlVar.a("energyOffset");
            float fFloatValue11 = f13 != null ? f13.floatValue() : acrkVarB.f;
            java.lang.Float f14 = (java.lang.Float) ajmlVar.a("apertureMaskOffset");
            float fFloatValue12 = f14 != null ? f14.floatValue() : acrkVarB.g;
            java.lang.Float f15 = (java.lang.Float) ajmlVar.a("thickSegmentLengthFactor");
            float fFloatValue13 = f15 != null ? f15.floatValue() : acrkVarB.l;
            java.lang.Float f16 = (java.lang.Float) ajmlVar.a("thinSegmentLengthFactor");
            float fFloatValue14 = f16 != null ? f16.floatValue() : acrkVarB.m;
            aiq aiqVar7 = (aiq) ajmlVar.a("rotationSpec");
            if (aiqVar7 == null) {
                aiqVar7 = acrkVarB.p;
            }
            aiq aiqVar8 = aiqVar7;
            aiq aiqVar9 = (aiq) ajmlVar.a("distortionSpec");
            if (aiqVar9 == null) {
                aiqVar9 = acrkVarB.t;
            }
            aiq aiqVar10 = aiqVar9;
            aiq aiqVar11 = (aiq) ajmlVar.a("wobbleSpec");
            if (aiqVar11 == null) {
                aiqVar11 = acrkVarB.u;
            }
            aiq aiqVar12 = aiqVar11;
            aiq aiqVar13 = (aiq) ajmlVar.a("oscillatingSpec");
            if (aiqVar13 == null) {
                aiqVar13 = acrkVarB.v;
            }
            acrkVarB = defpackage.acrk.a(acrtVar2, fFloatValue8, fFloatValue9, fFloatValue7, fFloatValue10, fFloatValue11, fFloatValue12, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue13, fFloatValue14, fFloatValue, fFloatValue2, aiqVar8, aiqVar2, aiqVar4, aiqVar6, aiqVar10, aiqVar12, aiqVar13, j4, iMin);
        } else if (iMin != i3) {
            acrkVarB = defpackage.acrk.b(acrkVarB, null, null, null, null, null, null, null, iMin, 8388607);
        }
        long j5 = acrkVarB.w;
        if (true == anty.ah(j5, cfd.S())) {
            j5 = j;
        }
        cqg[] cqgVarArrAL = afsq.aL(j5, borVar, b);
        if (!a.x(i, 4) || cqgVarArrAL.length < 4) {
            j2 = cqgVarArrAL[0].a;
            j3 = cqgVarArrAL[1].a;
        } else {
            j2 = cqgVarArrAL[2].a;
            j3 = cqgVarArrAL[3].a;
        }
        aoiu aoiuVar = new aoiu(new cqg(j2), new cqg(j3));
        aomy abnaVar = a.x(i, 5) ? new defpackage.abna(11) : aomyVar2;
        float f17 = acrkVarB.b;
        float f18 = acrkVarB.c;
        float f19 = acrkVarB.d;
        float f20 = acrkVarB.e;
        defpackage.acrt acrtVar3 = acrkVarB.a;
        aoiu aoiuVar2 = defpackage.acsf.a;
        float fFloatValue15 = ((java.lang.Number) aoiuVar2.a).floatValue();
        float fFloatValue16 = ((java.lang.Number) aoiuVar2.b).floatValue();
        float f21 = acrkVarB.f;
        float f22 = (1.0f - f21) * fFloatValue15;
        float f23 = f21 * fFloatValue16;
        aoiu aoiuVar3 = defpackage.acsf.b;
        float fFloatValue17 = ((java.lang.Number) aoiuVar3.a).floatValue();
        float fFloatValue18 = ((java.lang.Number) aoiuVar3.b).floatValue();
        float f24 = acrkVarB.g;
        float f25 = (1.0f - f24) * fFloatValue17;
        float f26 = f24 * fFloatValue18;
        aoiu aoiuVar4 = defpackage.acsf.c;
        float fFloatValue19 = ((java.lang.Number) aoiuVar4.a).floatValue();
        float fFloatValue20 = ((java.lang.Number) aoiuVar4.b).floatValue();
        float f27 = acrkVarB.h;
        float f28 = (1.0f - f27) * fFloatValue19;
        float f29 = f27 * fFloatValue20;
        aoiu aoiuVar5 = defpackage.acsf.d;
        float fFloatValue21 = ((java.lang.Number) aoiuVar5.a).floatValue();
        float fFloatValue22 = ((java.lang.Number) aoiuVar5.b).floatValue();
        float f30 = acrkVarB.i;
        float f31 = (1.0f - f30) * fFloatValue21;
        float f32 = f30 * fFloatValue22;
        aoiu aoiuVar6 = defpackage.acsf.e;
        float fFloatValue23 = ((java.lang.Number) aoiuVar6.a).floatValue();
        float fFloatValue24 = ((java.lang.Number) aoiuVar6.b).floatValue();
        float f33 = acrkVarB.j;
        float f34 = (1.0f - f33) * fFloatValue23;
        float f35 = f33 * fFloatValue24;
        aoiu aoiuVar7 = defpackage.acsf.f;
        float fFloatValue25 = ((java.lang.Number) aoiuVar7.a).floatValue();
        float fFloatValue26 = ((java.lang.Number) aoiuVar7.b).floatValue();
        float f36 = acrkVarB.k;
        float f37 = (1.0f - f36) * fFloatValue25;
        float f38 = f36 * fFloatValue26;
        aoiu aoiuVar8 = defpackage.acsf.g;
        float fFloatValue27 = ((java.lang.Number) aoiuVar8.a).floatValue();
        float fFloatValue28 = ((java.lang.Number) aoiuVar8.b).floatValue();
        float f39 = acrkVarB.l;
        float f40 = (1.0f - f39) * fFloatValue27;
        float f41 = f39 * fFloatValue28;
        aoiu aoiuVar9 = defpackage.acsf.h;
        float fFloatValue29 = ((java.lang.Number) aoiuVar9.a).floatValue();
        float fFloatValue30 = ((java.lang.Number) aoiuVar9.b).floatValue();
        float f42 = acrkVarB.m;
        float f43 = (1.0f - f42) * fFloatValue29;
        float f44 = f42 * fFloatValue30;
        aiq aiqVar14 = acrkVarB.p;
        aiq aiqVar15 = acrkVarB.q;
        aiq aiqVar16 = acrkVarB.r;
        aiq aiqVar17 = acrkVarB.s;
        float f45 = f40 + f41;
        float f46 = f37 + f38;
        float f47 = f31 + f32;
        float f48 = f28 + f29;
        float f49 = f25 + f26;
        float f50 = f22 + f23;
        aiq aiqVar18 = acrkVarB.t;
        aiq aiqVar19 = acrkVarB.u;
        aiq aiqVar20 = acrkVarB.v;
        boolean zX = a.x(i, 5);
        int i4 = acrkVarB.x;
        return new defpackage.acsa(aoiuVar, aomyVar, abnaVar, new defpackage.abmn(acrkVarB, 11), new defpackage.abmn(acrkVarB, 12), f17, f18, f19, f20, acrtVar3, f50, f49, f48, f47, f34 + f35, f46, f45, f43 + f44, c, d, e, aiqVar14, aiqVar18, aiqVar19, aiqVar20, aiqVar15, aiqVar16, aiqVar17, f, f2, zX, i4);
    }

    @Override // defpackage.acrs
    public final /* synthetic */ boolean b() {
        return true;
    }
}
