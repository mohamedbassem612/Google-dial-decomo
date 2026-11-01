package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zjn implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zjn(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [abko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v100, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [crd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v51, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
        defpackage.abax ajbgVar;
        float f;
        java.lang.Object next;
        float f2;
        float fR;
        defpackage.abmo abmoVar;
        float f3 = 0.0f;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj2;
                aooh.f((android.telecom.PhoneAccountHandle) obj, "<unused var>");
                return (optional == null || optional.isEmpty()) ? j$.util.Optional.ofNullable(((zjp) this.a).b.getPhoneAccount((android.telecom.PhoneAccountHandle) this.b)) : optional;
            case 1:
                java.lang.Object obj3 = this.b;
                defpackage.vjg vjgVar = (defpackage.vjg) this.a;
                ajbgVar = new ajbg(aosv.F(vjgVar.c, 0, new defpackage.ugg(vjgVar, (android.telecom.PhoneAccountHandle) obj3, (defpackage.vgs) obj2, (aoln) null, 12), 3));
                break;
            case 2:
                defpackage.ajyt ajytVar = (defpackage.ajyt) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                aooh.f(ajytVar, "builder");
                ?? r4 = this.b;
                int iA = r4 != 0 ? ajytVar.a(r4) : 0;
                ?? r0 = this.a;
                int iA2 = r0 != 0 ? ajytVar.a(r0) : 0;
                aooh.f(ajytVar, "builder");
                ajytVar.l(5);
                mni.bu(ajytVar, iA);
                mni.bv(ajytVar, 0);
                aooh.f(ajytVar, "builder");
                aooh.f(ajytVar, "builder");
                ajytVar.o(4, iA2);
                int iBt = mni.bt(ajytVar);
                aooh.f(ajytVar, "builder");
                ajytVar.l(9);
                mni.bu(ajytVar, iBt);
                int iBt2 = mni.bt(ajytVar);
                a.bc(ajytVar);
                aooh.f(ajytVar, "builder");
                ajytVar.o(3, iBt2);
                ajbgVar = new defpackage.abax(a.aZ(ajytVar, a.ba(ajytVar, iIntValue), 655364, mni.bt(ajytVar)));
                break;
            case 3:
                defpackage.ajyt ajytVar2 = (defpackage.ajyt) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                aooh.f(ajytVar2, "builder");
                int iA3 = ajytVar2.a(this.b);
                int iA4 = ajytVar2.a(this.a);
                aooh.f(ajytVar2, "builder");
                ajytVar2.l(2);
                mni.bv(ajytVar2, iA4);
                mni.bu(ajytVar2, iA3);
                int iBt3 = mni.bt(ajytVar2);
                aooh.f(ajytVar2, "builder");
                ajytVar2.l(9);
                aooh.f(ajytVar2, "builder");
                ajytVar2.o(2, iBt3);
                int iBt4 = mni.bt(ajytVar2);
                a.bc(ajytVar2);
                mni.bu(ajytVar2, iBt4);
                ajbgVar = new defpackage.abax(a.aZ(ajytVar2, a.ba(ajytVar2, iIntValue2), 262152, mni.bt(ajytVar2)));
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cav cavVar = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    aaoo.W(aehj.aL((abja) this.b, cavVar), (java.lang.String) this.a, (cmw) null, 0L, cavVar, 0, 12);
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                ((apx) this.b).a(fFloatValue, ((java.lang.Float) obj2).floatValue());
                ((defpackage.aooq) this.a).a = fFloatValue;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                cav cavVar2 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    aaoo.W(aehj.aL((abja) this.b, cavVar2), (java.lang.String) this.a, azm.g(cmw.c, 24.0f), 0L, cavVar2, 384, 8);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                cav cavVar3 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    abrz.k(((abis) this.a).c, (cmw) null, ((cqg) this.b.a()).a, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar3, 0, 0, 262138);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cav cavVar4 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    ?? r3 = this.b;
                    ?? r1 = this.a;
                    cmt cmtVar = cmw.c;
                    cmw cmwVarBE = afsq.bE(den.x(azm.c(cmtVar, 1.0f), "monogram_root_node"), r1.a(), new dib(5));
                    if (r3 != 0) {
                        if (r1 instanceof defpackage.abjq) {
                            throw null;
                        }
                        cmwVarBE = cmwVarBE.a(cfd.K(cmtVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) r3, true, 0, 1042431));
                    }
                    cye cyeVarB = awo.b(cmh.a, false);
                    int iM = anty.M(cavVar4.a());
                    cje cjeVarM = cavVar4.M();
                    cmw cmwVarM = cfo.m(cavVar4, cmwVarBE);
                    aomy aomyVar = dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar);
                    } else {
                        cavVar4.x();
                    }
                    cev.c(cavVar4, cyeVarB, dam.e);
                    cev.c(cavVar4, cjeVarM, dam.d);
                    cev.c(cavVar4, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar4, dam.g);
                    cev.c(cavVar4, cmwVarM, dam.c);
                    j$.util.Objects.checkIndex(0, 4);
                    if (r1 instanceof abjr) {
                        cavVar4.u(-2070111757);
                        aehj.am((abjr) r1, cavVar4, 0);
                        cavVar4.o();
                    } else if (r1 instanceof abkp) {
                        cavVar4.u(-2070109643);
                        aehj.at((abkp) r1, cavVar4, 0);
                        cavVar4.o();
                    } else {
                        if (!(r1 instanceof defpackage.abjq)) {
                            cavVar4.u(-2070113167);
                            cavVar4.o();
                            throw new aois();
                        }
                        cavVar4.u(-2070107533);
                        aehj.aw((defpackage.abjq) r1, cavVar4, 0);
                        cavVar4.o();
                    }
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                cvm cvmVar = (cvm) obj;
                cpm cpmVar = (cpm) obj2;
                aooh.f(cvmVar, "change");
                cvmVar.b();
                this.a.a(cvmVar, cpmVar);
                long j = cpmVar.a;
                agii agiiVar = (agii) this.b;
                agiiVar.g(agiiVar.d() + agii.k(j));
                baz bazVarJ = agiiVar.j();
                if (bazVarJ != null) {
                    float fI = agiiVar.i(bazVarJ) + agiiVar.e();
                    int i = bazVarJ.h;
                    bbh bbhVar = (bbh) agiiVar.b;
                    java.util.List list = bbhVar.j().k;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    float f4 = i + fI;
                    float f5 = fI + f4;
                    for (java.lang.Object obj4 : list) {
                        if (((baz) obj4).a <= agiiVar.a) {
                            arrayList.add(obj4);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            baz bazVar = (baz) next;
                            int i2 = agiiVar.i(bazVar);
                            f = f3;
                            int i3 = (int) (0.5f * f5);
                            if (i3 > agiiVar.i(bazVar) + bazVar.h || i2 > i3 || bazVarJ.a == bazVar.a) {
                                f3 = f;
                            }
                        } else {
                            f = f3;
                            next = null;
                        }
                    }
                    baz bazVar2 = (baz) next;
                    if (bazVar2 != null) {
                        int i4 = bazVarJ.a;
                        if (i4 == bbhVar.b() || bazVar2.a == bbhVar.b()) {
                            int iB = bbhVar.b();
                            int iC = bbhVar.c();
                            if (bbhVar.h()) {
                                aoov.an(((bay) bbhVar.f.a()).f, (aolr) null, 0, new ahb(bbhVar, (aoln) null, 17), 3);
                            }
                            bbhVar.i(iB, iC, false);
                        }
                        ?? r2 = agiiVar.j;
                        int i5 = bazVar2.a;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i5);
                        r2.a(numValueOf, numValueOf2);
                        agiiVar.b(numValueOf2);
                    } else {
                        if (agiiVar.d() > f) {
                            f2 = f;
                            fR = aooc.q(f4 - bbhVar.j().m, f2);
                        } else {
                            f2 = f;
                            fR = agiiVar.d() < f2 ? aooc.r(fI - bbhVar.j().l, f2) : f2;
                        }
                        if (fR != f2) {
                            agiiVar.d.b(java.lang.Float.valueOf(fR));
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return aehj.S(1.0f, (java.lang.String) this.b, (java.util.List) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                cav cavVar5 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    afsq.bm(new defpackage.abfr((java.lang.String) this.b, this.a), (cmw) null, 0L, 0L, (dot) null, 0, false, 0, (dkz) null, cavVar5, 0, 1022);
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.agiz agizVar = (defpackage.agiz) obj;
                aooh.f(agizVar, "state");
                aooh.f((java.util.Map) obj2, "<unused var>");
                ccp ccpVar = defpackage.agiz.a;
                int iOrdinal = agizVar.ordinal();
                if (iOrdinal == 0) {
                    abmoVar = defpackage.abmo.a;
                } else if (iOrdinal == 1) {
                    abmoVar = defpackage.abmo.b;
                } else if (iOrdinal == 2) {
                    abmoVar = defpackage.abmo.c;
                } else {
                    if (iOrdinal != 3) {
                        throw new aois();
                    }
                    abmoVar = defpackage.abmo.d;
                }
                this.a.a(abmoVar);
                int iOrdinal2 = agizVar.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        this.b.b(defpackage.agiz.LOOP);
                    } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                        throw new aois();
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                cav cavVar6 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    bvt.b(((defpackage.aciw) this.a).c, defpackage.abxl.k(cmw.c, this.b), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar6, 0, 0, 262140);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                cav cavVar7 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    java.lang.String str = ((defpackage.aciw) this.a).b;
                    bvt.b(str, str.length() == 0 ? azm.e(cmw.c, 0.0f) : defpackage.abxl.k(cmw.c, this.b), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar7, 0, 0, 262140);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 15:
                cav cavVar8 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    den.ac(new cdj[]{boy.a.b(new cqg(abrz.t(25, cavVar8))), bvt.a.b(this.b)}, cfo.j(-316778847, new defpackage.abkv(this.a, 8), cavVar8), cavVar8, 48);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 16:
                cav cavVar9 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    den.ac(new cdj[]{boy.a.b(new cqg(abrz.t(25, cavVar9))), bvt.a.b(this.b)}, cfo.j(1879444447, new defpackage.abkv(this.a, 7), cavVar9), cavVar9, 48);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 17:
                cav cavVar10 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    ?? r5 = this.a;
                    java.lang.Object obj5 = this.b;
                    cavVar10.u(-1036443243);
                    cavVar10.o();
                    den.ac(new cdj[]{bmi.a.b(acqb.a), bmf.a.b(obj5), bos.a.b(java.lang.Boolean.FALSE)}, (aonn) r5, cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case 18:
                cav cavVar11 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                int i6 = iIntValue13 & 3;
                int i7 = iIntValue13 & 1;
                cbd cbdVar = defpackage.afmu.a;
                if (cavVar11.H(i6 != 2, i7)) {
                    java.lang.Object objE = cavVar11.e(defpackage.acmw.a);
                    if (objE == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    this.a.a(new defpackage.afpl((defpackage.acmd) objE, (defpackage.acmg) this.b), cavVar11, 0);
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case 19:
                cav cavVar12 = (cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                int i8 = iIntValue14 & 3;
                int i9 = iIntValue14 & 1;
                aimz aimzVar = defpackage.afny.a;
                if (cavVar12.H(i8 != 2, i9)) {
                    java.lang.Object obj6 = this.b;
                    java.lang.Object obj7 = this.a;
                    boolean zD = cavVar12.D(obj7) | cavVar12.D(obj6);
                    java.lang.Object objG = cavVar12.g();
                    if (zD || objG == cau.a) {
                        objG = new afne((fvx) obj7, (android.app.Activity) obj6);
                        cavVar12.w(objG);
                    }
                    aaoo.aC((aomy) objG, (cmw) null, false, (bpw) null, (kaw) null, (crd) null, defpackage.afnb.a, cavVar12, 1572864, 62);
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            default:
                aolr aolrVar = (aolp) obj2;
                aooh.f((aojh) obj, "<unused var>");
                aooh.f(aolrVar, "element");
                aoor aoorVar = (aoor) this.b;
                int i10 = aoorVar.a;
                aoorVar.a = i10 + 1;
                ((aolr[]) this.a)[i10] = aolrVar;
                return aojh.a;
        }
        return ajbgVar;
    }

    public /* synthetic */ zjn(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
