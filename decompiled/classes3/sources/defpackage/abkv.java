package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abkv implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abkv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0332 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0334 A[LOOP:0: B:101:0x0301->B:112:0x0334, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0370 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0372 A[LOOP:2: B:119:0x0343->B:130:0x0372, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0374  */
    /* JADX WARN: Code duplicated, block: B:135:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object next;
        java.lang.String str;
        aoiu aoiuVar;
        java.lang.String str2;
        java.lang.Object next2;
        java.lang.String str3;
        java.lang.String str4;
        switch (this.$cid) {
            case 0:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                java.lang.Integer num2 = (java.lang.Integer) obj2;
                num2.intValue();
                this.a.a(num, num2);
                return aojh.a;
            case 1:
                java.lang.Integer num3 = (java.lang.Integer) obj;
                num3.intValue();
                java.lang.Integer num4 = (java.lang.Integer) obj2;
                num4.intValue();
                this.a.a(num3, num4);
                return aojh.a;
            case 2:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    float f = ((dpi) cavVar.e(bqd.c)).a;
                    cmw cmwVarJ = azm.j(azm.b(cmw.c, 1.0f), f, f, Float.NaN, Float.NaN);
                    cye cyeVarB = awo.b(cmh.e, false);
                    int iM = anty.M(cavVar.a());
                    cje cjeVarM = cavVar.M();
                    cmw cmwVarM = cfo.m(cavVar, cmwVarJ);
                    aomy aomyVar = dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    ?? r0 = this.a;
                    cev.c(cavVar, cyeVarB, dam.e);
                    cev.c(cavVar, cjeVarM, dam.d);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar, dam.g);
                    cev.c(cavVar, cmwVarM, dam.c);
                    r0.a(cavVar, 0);
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 3:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.ablz ablzVar = (defpackage.ablz) this.a;
                    afsq.aR(ablzVar.e, (cmw) null, ablzVar.b, (bvp) null, cavVar2, 48);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    aaoo.L(((defpackage.ablw) this.a).b, (cmw) null, (bsp) null, cavVar3, 48);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return aehj.T(1.0f, (java.lang.String) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    cmw cmwVarD = azm.d(cmw.c, 1.0f);
                    cye cyeVarB2 = awo.b(cmh.a, true);
                    int iM2 = anty.M(cavVar4.a());
                    cje cjeVarM2 = cavVar4.M();
                    cmw cmwVarM2 = cfo.m(cavVar4, cmwVarD);
                    aomy aomyVar2 = dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    ?? r1 = this.a;
                    cev.c(cavVar4, cyeVarB2, dam.e);
                    cev.c(cavVar4, cjeVarM2, dam.d);
                    cev.c(cavVar4, java.lang.Integer.valueOf(iM2), dam.f);
                    cev.b(cavVar4, dam.g);
                    cev.c(cavVar4, cmwVarM2, dam.c);
                    r1.a(cavVar4, 0);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    ?? r2 = this.a;
                    if (r2 == 0) {
                        cavVar5.u(1335874970);
                    } else {
                        cavVar5.u(-2035117241);
                        r2.a(cavVar5, 0);
                    }
                    cavVar5.o();
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return a.t((aonn) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                csj csjVar = (csj) obj;
                aooh.f(csjVar, "<this>");
                den.R(csjVar, ((btw) this.a).b, csjVar.dl(acqr.d) / 2.0f, ((cpm) obj2).a, (den) null, 120);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                ((defpackage.acsl) this.a).g.h(fFloatValue);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return a.t((aonn) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                int i = iIntValue6 & 3;
                int i2 = iIntValue6 & 1;
                aimz aimzVar = defpackage.afny.a;
                if (cavVar6.H(i != 2, i2)) {
                    java.lang.String str5 = (java.lang.String) this.a.a();
                    cmt cmtVar = cmw.c;
                    java.lang.Object objG = cavVar6.g();
                    if (objG == cau.a) {
                        objG = new defpackage.acsb(19);
                        cavVar6.w(objG);
                    }
                    abrz.k(str5, dig.b(cmtVar, false, (aonj) objG), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar6, 0, 0, 262140);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            default:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                aooh.f(charSequence, "$this$DelimitedRangesSequence");
                ?? r3 = this.a;
                if (r3.size() == 1) {
                    java.lang.String str6 = (java.lang.String) ajsz.bL((java.lang.Iterable) r3);
                    int iW = aoov.w(charSequence, str6, iIntValue7, false);
                    if (iW < 0) {
                        aoiuVar = null;
                    } else {
                        aoiuVar = new aoiu(java.lang.Integer.valueOf(iW), str6);
                    }
                } else {
                    aopq aopqVar = new aopq(aooc.t(iIntValue7, 0), charSequence.length());
                    boolean z = charSequence instanceof java.lang.String;
                    int i3 = ((aopo) aopqVar).a;
                    if (z) {
                        int i4 = ((aopo) aopqVar).b;
                        int i5 = ((aopo) aopqVar).c;
                        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                            aoiuVar = null;
                        } else {
                            int i6 = i3;
                            while (true) {
                                java.util.Iterator it = r3.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (java.lang.String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (java.lang.String) next2;
                                    if (str3 != null) {
                                        aoiuVar = new aoiu(java.lang.Integer.valueOf(i6), str3);
                                    } else if (i6 != i4) {
                                        i6 += i5;
                                    } else {
                                        aoiuVar = null;
                                    }
                                } while (!aoov.t(str4, 0, (java.lang.String) charSequence, i6, str4.length(), false));
                                str3 = (java.lang.String) next2;
                                if (str3 != null) {
                                    aoiuVar = new aoiu(java.lang.Integer.valueOf(i6), str3);
                                } else if (i6 != i4) {
                                    i6 += i5;
                                } else {
                                    aoiuVar = null;
                                }
                            }
                        }
                    } else {
                        int i7 = ((aopo) aopqVar).b;
                        int i8 = ((aopo) aopqVar).c;
                        if ((i8 <= 0 || i3 > i7) && (i8 >= 0 || i7 > i3)) {
                            aoiuVar = null;
                        } else {
                            int i9 = i3;
                            while (true) {
                                java.util.Iterator it2 = r3.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        str2 = (java.lang.String) next;
                                    } else {
                                        next = null;
                                    }
                                    str = (java.lang.String) next;
                                    if (str != null) {
                                        aoiuVar = new aoiu(java.lang.Integer.valueOf(i9), str);
                                    } else if (i9 != i7) {
                                        i9 += i8;
                                    } else {
                                        aoiuVar = null;
                                    }
                                } while (!aoov.I(str2, 0, charSequence, i9, str2.length(), false));
                                str = (java.lang.String) next;
                                if (str != null) {
                                    aoiuVar = new aoiu(java.lang.Integer.valueOf(i9), str);
                                } else if (i9 != i7) {
                                    i9 += i8;
                                } else {
                                    aoiuVar = null;
                                }
                            }
                        }
                    }
                }
                if (aoiuVar != null) {
                    return new aoiu(aoiuVar.a, java.lang.Integer.valueOf(((java.lang.String) aoiuVar.b).length()));
                }
                return null;
        }
    }
}
