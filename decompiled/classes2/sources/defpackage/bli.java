package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bli implements aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bli(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, ske] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, teu] */
    /* JADX WARN: Type inference failed for: r0v32, types: [aonp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, tgy] */
    /* JADX WARN: Type inference failed for: r1v77, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        cpp cppVar;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                cav cavVar = (cav) obj2;
                ((java.lang.Integer) obj3).intValue();
                ait aitVar = defpackage.blk.a;
                cavVar.u(759876635);
                java.lang.Object objG = cavVar.g();
                java.lang.Object obj4 = cau.a;
                if (objG == obj4) {
                    ?? r2 = this.a;
                    ajxw ajxwVar = ceo.a;
                    cbk cbkVar = new cbk((aomy) r2, (cen) null);
                    cavVar.w(cbkVar);
                    objG = cbkVar;
                }
                cer cerVar = (cer) objG;
                java.lang.Object objG2 = cavVar.g();
                if (objG2 == obj4) {
                    objG2 = new aii(new cpm(defpackage.blk.a(cerVar)), defpackage.blk.d, new cpm(defpackage.blk.b), "Animatable");
                    cavVar.w(objG2);
                }
                aii aiiVar = (aii) objG2;
                aojh aojhVar = aojh.a;
                boolean zD = cavVar.D(aiiVar);
                java.lang.Object objG3 = cavVar.g();
                if (zD || objG3 == obj4) {
                    objG3 = new defpackage.blj(cerVar, aiiVar, (aoln) null, 0);
                    cavVar.w(objG3);
                }
                cbp.g(aojhVar, (aonn) objG3, cavVar);
                air airVar = aiiVar.b;
                boolean zB = cavVar.B(airVar);
                java.lang.Object objG4 = cavVar.g();
                if (zB || objG4 == obj4) {
                    objG4 = new defpackage.bhl(airVar, 20);
                    cavVar.w(objG4);
                }
                cmw cmwVar = (cmw) this.b.a((aomy) objG4);
                cavVar.o();
                return cmwVar;
            case 1:
                cav cavVar2 = (cav) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                int i = iIntValue & 17;
                int i2 = iIntValue & 1;
                defpackage.aox aoxVar = defpackage.apa.a;
                if (cavVar2.H(i != 16, i2)) {
                    java.lang.Object objG5 = cavVar2.g();
                    if (objG5 == cau.a) {
                        objG5 = new vx(defpackage.aow.a);
                        cavVar2.w(objG5);
                    }
                    java.lang.Object obj5 = this.a;
                    ?? r0 = this.b;
                    vx vxVar = (vx) objG5;
                    ((androidx.compose.runtime.snapshots.SnapshotStateList) vxVar.a).clear();
                    r0.a(vxVar);
                    vxVar.s((defpackage.aox) obj5, cavVar2, 0);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 2:
                cav cavVar3 = (cav) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                int i3 = iIntValue2 & 17;
                int i4 = iIntValue2 & 1;
                ayy ayyVar = defpackage.bmm.a;
                if (cavVar3.H(i3 != 16, i4)) {
                    den.ab(dfo.j.b(this.a), (aonn) this.b, cavVar3, 8);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case 3:
                defpackage.afe afeVar = (defpackage.afe) obj;
                cav cavVar4 = (cav) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                aooh.f(afeVar, "$this$ExpandableEntry");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == ((iIntValue3 & 8) == 0 ? cavVar4.B(afeVar) : cavVar4.D(afeVar)) ? 4 : 2;
                }
                if (cavVar4.H((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    defpackage.jlr.v((ahj) this.a, (defpackage.kbx) this.b, afeVar, cavVar4, (iIntValue3 << 6) & 896);
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case 4:
                cav cavVar5 = (cav) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                aooh.f((azj) obj, "$this$BottomAppBar");
                if (cavVar5.H((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    java.lang.Object obj6 = this.b;
                    java.lang.Object obj7 = this.a;
                    cmw cmwVarD = azm.d(cmw.c, 1.0f);
                    boolean z2 = !((ryq) obj7).h;
                    boolean zB2 = cavVar5.B(obj7) | cavVar5.z(((java.lang.Enum) obj6).ordinal());
                    java.lang.Object objG6 = cavVar5.g();
                    if (zB2 || objG6 == cau.a) {
                        objG6 = new qza(obj7, obj6, 6, (byte[]) null);
                        cavVar5.w(objG6);
                    }
                    aaoo.ak((aomy) objG6, cmwVarD, z2, (crd) null, (bni) null, (defpackage.bnm) null, (amu) null, (ayy) null, cfo.j(767312635, new ped(obj7, 4), cavVar5), cavVar5, 805306416, 504);
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 5:
                cav cavVar6 = (cav) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                java.util.List list = sme.a;
                aooh.f((defpackage.afe) obj, "$this$AnimatedVisibility");
                if (cavVar6.H((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    bvo.b(den.x(azm.d(cmw.c, 1.0f), "font_style_custom_typography_menu"), den.am(cavVar6).e, den.ak(cavVar6).p, 0L, 0.0f, 0.0f, (amu) null, cfo.j(1774727741, new slr((ske) this.a, (smu) this.b), cavVar6), cavVar6, 120);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case 6:
                cmw cmwVar2 = (cmw) obj;
                cav cavVar7 = (cav) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                aooh.f(cmwVar2, "modifier");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= true == cavVar7.B(cmwVar2) ? 4 : 2;
                }
                if (cavVar7.H((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    snl.aB(cmwVar2, ((tfn) this.a).a, (aonn) this.b, cavVar7, iIntValue6 & 14);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 7:
                defpackage.afe afeVar2 = (defpackage.afe) obj;
                cav cavVar8 = (cav) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                aooh.f(afeVar2, "$this$ExpandableEntry");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true == ((iIntValue7 & 8) == 0 ? cavVar8.B(afeVar2) : cavVar8.D(afeVar2)) ? 4 : 2;
                }
                if (cavVar8.H((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    snl.az(afeVar2, ((tfn) this.a).c, (aonn) this.b, cavVar8, iIntValue7 & 14);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 8:
                cav cavVar9 = (cav) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                aooh.f((nf) obj, "$this$item");
                if (cavVar9.H((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    ((tgf) this.a).c(dfa.f(((java.lang.Integer) this.b).intValue(), cavVar9), (cmw) null, cavVar9, 0);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 9:
                cav cavVar10 = (cav) obj2;
                int iIntValue9 = ((java.lang.Integer) obj3).intValue();
                aooh.f((nf) obj, "$this$item");
                if (cavVar10.H((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    this.a.g((tgy) this.b, ten.a, cavVar10);
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case 10:
                defpackage.afe afeVar3 = (defpackage.afe) obj;
                cav cavVar11 = (cav) obj2;
                int iIntValue10 = ((java.lang.Integer) obj3).intValue();
                aooh.f(afeVar3, "$this$AnimatedVisibility");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= true == ((iIntValue10 & 8) == 0 ? cavVar11.B(afeVar3) : cavVar11.D(afeVar3)) ? 4 : 2;
                }
                if (cavVar11.H((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    java.lang.Object obj8 = ((xp) this.a).a;
                    if (obj8 == null) {
                        cavVar11.u(-612868097);
                    } else {
                        ?? r1 = this.b;
                        cavVar11.u(-612868096);
                        r1.a(afeVar3, obj8, cavVar11, java.lang.Integer.valueOf(iIntValue10 & 14));
                    }
                    cavVar11.o();
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case 11:
                cav cavVar12 = (cav) obj2;
                int iIntValue11 = ((java.lang.Integer) obj3).intValue();
                aooh.f((defpackage.afe) obj, "$this$AnimatedVisibility");
                if (cavVar12.H((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    this.b.a(((abef) this.a).a, cavVar12, 0);
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case 12:
                azj azjVar = (azj) obj;
                cav cavVar13 = (cav) obj2;
                int iIntValue12 = ((java.lang.Integer) obj3).intValue();
                aooh.f(azjVar, "$this$BannerHeader");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true == cavVar13.B(azjVar) ? 4 : 2;
                }
                if (cavVar13.H((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    ?? r3 = this.b;
                    aehj.bw(azjVar, (java.lang.String) this.a, (cmw) null, 0L, cavVar13, iIntValue12 & 14);
                    aehj.bv((aomy) r3, (cmw) null, 0L, cavVar13, 0);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                cpm cpmVar = (cpm) obj2;
                ((java.lang.Float) obj3).floatValue();
                defpackage.abjn abjnVar = (defpackage.abjn) this.a;
                cpp cppVar2 = abjnVar.c;
                if (cppVar2 != null && (cppVar = abjnVar.d) != null) {
                    this.b.a(aehj.az(aehj.aE(abjnVar.a(), fFloatValue, cpmVar.a, cppVar2.a, cppVar.a), 1.0f / abjnVar.a));
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                cav cavVar14 = (cav) obj2;
                int iIntValue13 = ((java.lang.Integer) obj3).intValue();
                aooh.f((defpackage.afe) obj, "$this$AnimatedVisibility");
                if (cavVar14.H((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    java.lang.Object obj9 = this.a;
                    java.lang.Object obj10 = this.b;
                    defpackage.abof abofVar = (defpackage.abof) obj9;
                    java.lang.Boolean bool = abofVar.f;
                    if (bool != null) {
                        bool.booleanValue();
                    } else {
                        z = ((abom) obj10).a;
                    }
                    abts.C((abom) obj10, abofVar, (cmw) null, z, cavVar14, 0);
                } else {
                    cavVar14.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                cav cavVar15 = (cav) obj2;
                int iIntValue14 = ((java.lang.Integer) obj3).intValue();
                aooh.f((defpackage.afe) obj, "$this$AnimatedVisibility");
                if (cavVar15.H((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    ?? r4 = this.a;
                    java.util.List list2 = (java.util.List) r4.a();
                    aooh.f(list2, "items");
                    aehj.bc(new abiv(list2), azm.d(cmw.c, 1.0f), 0, (ayy) null, 0L, false, cavVar15, 48);
                } else {
                    cavVar15.s();
                }
                return aojh.a;
            case 16:
                cav cavVar16 = (cav) obj2;
                int iIntValue15 = ((java.lang.Integer) obj3).intValue();
                aooh.f((azj) obj, "$this$TextButton");
                if (cavVar16.H((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    bvt.b(((aciv) this.a).a, (cmw) null, ((aoos) this.b).a, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar16, 0, 0, 262138);
                } else {
                    cavVar16.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                cav cavVar17 = (cav) obj2;
                int iIntValue16 = ((java.lang.Integer) obj3).intValue();
                long j = defpackage.acqr.a;
                aooh.f((defpackage.bun) obj, "it");
                if (cavVar17.H((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    defpackage.acqp.a.b((kaw) this.a, null, (defpackage.btw) this.b, 0L, cavVar17, 196608);
                } else {
                    cavVar17.s();
                }
                return aojh.a;
            default:
                aoil.e((aonj) this.b, this.a, (aolr) obj3);
                return aojh.a;
        }
    }

    public /* synthetic */ bli(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
