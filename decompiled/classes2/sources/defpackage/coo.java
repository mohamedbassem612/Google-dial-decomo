package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class coo extends aoof implements aomy {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, defpackage.biv.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x04ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x04ef A[LOOP:4: B:166:0x04c0->B:176:0x04ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x04f2 A[SYNTHETIC] */
    public final /* synthetic */ java.lang.Object a() {
        dce dceVar;
        char c;
        defpackage.jth jthVarS;
        defpackage.jth jthVarS2;
        defpackage.jth jthVarS3;
        ajcq ajcqVarA = null;
        switch (this.$cid) {
            case 0:
                cop copVar = (cop) this.e;
                cou couVar = (cou) copVar.c;
                cpg cpgVarB = couVar.b();
                char c2 = 7;
                if (cpgVarB == null) {
                    ady adyVar = (ady) copVar.e;
                    java.lang.Object[] objArr = adyVar.b;
                    long[] jArr = adyVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << c2) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (i3 < i2) {
                                    if ((j & 255) < 128) {
                                        ((com) objArr[(i << 3) + i3]).b(cpe.d);
                                    }
                                    j >>= 8;
                                    i3++;
                                    c2 = c2;
                                }
                                c = c2;
                                if (i2 == 8) {
                                }
                            } else {
                                c = c2;
                            }
                            if (i != length) {
                                i++;
                                c2 = c;
                            }
                        }
                    }
                } else if (((cmv) cpgVarB).D) {
                    if (((ady) copVar.d).a(cpgVarB)) {
                        cpgVarB.g();
                    }
                    cpe cpeVarE = cpgVarB.e();
                    if (!((cmv) cpgVarB).t.D) {
                        cwh.d("visitAncestors called on an unattached node");
                    }
                    com comVar = ((cmv) cpgVarB).t;
                    dbk dbkVarA = cfo.A(cpgVarB);
                    int i4 = 0;
                    while (dbkVarA != null) {
                        if ((dbkVarA.v.f.v & 5120) != 0) {
                            while (comVar != null) {
                                int i5 = ((cmv) comVar).u;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & 1024) != 0) {
                                        i4++;
                                    }
                                    if (comVar instanceof com) {
                                        ady adyVar2 = (ady) copVar.e;
                                        if (adyVar2.a(comVar)) {
                                            if (i4 <= 1) {
                                                comVar.b(cpeVarE);
                                            } else {
                                                comVar.b(cpe.b);
                                            }
                                            adyVar2.l(comVar);
                                        }
                                    }
                                }
                                comVar = ((cmv) comVar).w;
                            }
                        }
                        dbkVarA = dbkVarA.k();
                        comVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
                    }
                    ady adyVar3 = (ady) copVar.e;
                    java.lang.Object[] objArr2 = adyVar3.b;
                    long[] jArr2 = adyVar3.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((com) objArr2[(i6 << 3) + i8]).b(cpe.d);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (couVar.b() == null || couVar.c.e() == cpe.d) {
                    couVar.e();
                }
                ((ady) copVar.d).d();
                ((ady) copVar.e).d();
                copVar.a = false;
                return aojh.a;
            case 1:
                return ((defpackage.biv) this.e).b();
            case 2:
                ((pzm) this.e).b();
                return aojh.a;
            case 3:
                defpackage.izm izmVar = (defpackage.izm) this.e;
                izmVar.d.o(rmx.xM);
                izmVar.b.H().finish();
                return aojh.a;
            case 4:
                ((defpackage.jao) this.e).e();
                return aojh.a;
            case 5:
                ((defpackage.jao) this.e).e();
                return aojh.a;
            case 6:
                ((defpackage.jar) this.e).e();
                return aojh.a;
            case 7:
                ((defpackage.jar) this.e).e();
                return aojh.a;
            case 8:
                defpackage.jat jatVar = (defpackage.jat) this.e;
                jatVar.b.o(rmx.xS);
                ipc ipcVar = jatVar.c;
                ryg rygVarAU = pez.aU(rvq.a.m());
                ryg rygVarAS = pez.aS(rvo.a.m());
                rygVarAS.k(rvc.J);
                akzx akzxVarM = rvg.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                akzxVarM.b.b = true;
                rvg rvgVarP = akzxVarM.p();
                aooh.e(rvgVarP, "build(...)");
                rvg rvgVar = rvgVarP;
                aooh.f(rvgVar, "value");
                akzx akzxVar = (akzx) rygVarAS.a;
                akzxVar.u();
                rvo rvoVar = akzxVar.b;
                j$.util.Objects.requireNonNull(rvgVar);
                rvoVar.c = rvgVar;
                rvoVar.b = 9;
                rygVarAU.o(rygVarAS.i());
                android.content.Intent intentAddFlags = ipcVar.aL(rygVarAU.n()).addFlags(268435456);
                aooh.e(intentAddFlags, "addFlags(...)");
                ahqx.l(jatVar.a, intentAddFlags);
                return aojh.a;
            case 9:
                defpackage.jtn jtnVar = (defpackage.jtn) this.e;
                defpackage.jtl jtlVarA = jtnVar.a();
                if (jtlVarA != null && (jthVarS = jtlVarA.s()) != null) {
                    jtnVar.b.i(zoe.N(aosv.F(jtnVar.d, 0, new defpackage.jlk(jthVarS, (aoln) null, 13), 3)), jtnVar.e);
                }
                return aojh.a;
            case 10:
                defpackage.jtn jtnVar2 = (defpackage.jtn) this.e;
                defpackage.jtl jtlVarA2 = jtnVar2.a();
                if (jtlVarA2 != null && (jthVarS2 = jtlVarA2.s()) != null) {
                    jtnVar2.b.i(zoe.N(aosv.F(jtnVar2.d, 0, new defpackage.jlk(jthVarS2, (aoln) null, 14, (byte[]) null), 3)), jtnVar2.e);
                }
                return aojh.a;
            case 11:
                defpackage.jtn jtnVar3 = (defpackage.jtn) this.e;
                defpackage.jtl jtlVarA3 = jtnVar3.a();
                if (jtlVarA3 != null && (jthVarS3 = jtlVarA3.s()) != null) {
                    jtnVar3.b.i(zoe.N(aosv.F(jtnVar3.d, 0, new defpackage.jlk(jthVarS3, (aoln) null, 15, (char[]) null), 3)), jtnVar3.e);
                }
                return aojh.a;
            case 12:
                return ((defpackage.kgt) this.e).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.ksv ksvVar = (defpackage.ksv) this.e;
                aimz aimzVar = defpackage.ksv.a;
                if (ksvVar.i == 3) {
                    ksvVar.i = 5;
                    ksvVar.e.o(rmx.AY);
                    ksvVar.l.i((java.lang.String) null).b(mce.hY);
                }
                ksvVar.b.finish();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.nts ntsVar = (defpackage.nts) this.e;
                defpackage.mto mtoVarB = ntsVar.b();
                defpackage.nbw nbwVar = mtoVarB != null ? mtoVarB.b : null;
                if (nbwVar != null && nbwVar.ordinal() == 1) {
                    ntsVar.d(mce.bS);
                }
                if (ntsVar.c() != null) {
                    agtj agtjVar = ntsVar.c;
                    defpackage.nbv nbvVarC = ntsVar.c();
                    agtjVar.i(zoe.N(nbvVarC != null ? nbvVarC.a(ruc.bp, new defpackage.kqu(nbvVarC, (aoln) null, 9)) : null), ntsVar.h);
                } else {
                    ntsVar.d(mce.cr);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.nts ntsVar2 = (defpackage.nts) this.e;
                defpackage.mto mtoVarB2 = ntsVar2.b();
                defpackage.nbw nbwVar2 = mtoVarB2 != null ? mtoVarB2.b : null;
                if (nbwVar2 != null) {
                    int iOrdinal = nbwVar2.ordinal();
                    if (iOrdinal == 1) {
                        ntsVar2.d(mce.bU);
                    } else if (iOrdinal == 2) {
                        ntsVar2.d(mce.bV);
                    } else if (iOrdinal == 3) {
                        ntsVar2.d(mce.bW);
                    }
                }
                if (ntsVar2.c() != null) {
                    agtj agtjVar2 = ntsVar2.c;
                    defpackage.nbv nbvVarC2 = ntsVar2.c();
                    agtjVar2.i(zoe.N(nbvVarC2 != null ? nbvVarC2.a(ruc.bo, new defpackage.nbt(nbvVarC2, null)) : null), ntsVar2.g);
                } else {
                    ntsVar2.d(mce.cr);
                }
                return aojh.a;
            case 16:
                defpackage.nts ntsVar3 = (defpackage.nts) this.e;
                defpackage.nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "openGoogleTermsOfService", 256, "DobbyInCallFragmentPeer.kt").v("open google terms of service link");
                defpackage.ntk ntkVar = ntsVar3.b;
                java.lang.String strY = ntkVar.Y(2132018435);
                aooh.e(strY, "getString(...)");
                android.net.Uri uri = android.net.Uri.parse(strY);
                aooh.e(uri, "parse(...)");
                afsq.G(ntkVar, new android.content.Intent("android.intent.action.VIEW", uri));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.nts ntsVar4 = (defpackage.nts) this.e;
                defpackage.nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "onLlmGeneratedContentDisclaimerDialogDismissed", 244, "DobbyInCallFragmentPeer.kt").v("LLM generated content disclaimer dialog dismissed");
                if (ntsVar4.c() != null) {
                    agtj agtjVar3 = ntsVar4.c;
                    defpackage.nbv nbvVarC3 = ntsVar4.c();
                    agtjVar3.i(zoe.N(nbvVarC3 != null ? nbvVarC3.a(ruc.bs, new defpackage.kqu(nbvVarC3, (aoln) null, 12, (char[]) null)) : null), ntsVar4.i);
                } else {
                    ntsVar4.d(mce.cr);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.nts ntsVar5 = (defpackage.nts) this.e;
                defpackage.nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "openGenerativeAiTermsOfService", 263, "DobbyInCallFragmentPeer.kt").v("open Generative AI terms of service link");
                defpackage.ntk ntkVar2 = ntsVar5.b;
                java.lang.String strY2 = ntkVar2.Y(2132018437);
                aooh.e(strY2, "getString(...)");
                android.net.Uri uri2 = android.net.Uri.parse(strY2);
                aooh.e(uri2, "parse(...)");
                afsq.G(ntkVar2, new android.content.Intent("android.intent.action.VIEW", uri2));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.nts ntsVar6 = (defpackage.nts) this.e;
                defpackage.nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "onLlmGeneratedContentConsentDialogConfirmButtonClicked", 269, "DobbyInCallFragmentPeer.kt").v("LLM generated content consent dialog confirmed");
                aoov.an(ntsVar6.d, (aolr) null, 0, new nto(ntsVar6, (aoln) null, 2, (byte[]) null), 3);
                if (ntsVar6.c() != null) {
                    agtj agtjVar4 = ntsVar6.c;
                    defpackage.nbv nbvVarC4 = ntsVar6.c();
                    if (nbvVarC4 != null) {
                        ajyi ajyiVarF = akky.F(mnq.a.a(2132018433, 2132018431, 2132018434, 2132018435).p());
                        ajyiVarF.ad();
                        java.util.List listBb = ajsz.bb(new java.lang.Integer[]{2132018436, 2132018781, 2132018437, 2132018432, java.lang.Integer.valueOf(android.R.string.cancel)});
                        aooh.f(listBb, "values");
                        akzx akzxVar2 = (akzx) ajyiVarF.a;
                        akzxVar2.u();
                        akld akldVar = akzxVar2.b;
                        akldVar.b();
                        akyl.i(listBb, akldVar.b);
                        akld akldVarAb = ajyiVarF.ab();
                        aooh.f(akldVarAb, "androidTextDetails");
                        ajcqVarA = nbvVarC4.a(ruc.br, new defpackage.bhp(nbvVarC4, akldVarAb, (aoln) null, 17));
                    }
                    agtjVar4.i(zoe.N(ajcqVarA), ntsVar6.j);
                } else {
                    ntsVar6.d(mce.cr);
                }
                ntsVar6.e();
                return aojh.a;
            default:
                defpackage.nts ntsVar7 = (defpackage.nts) this.e;
                defpackage.nts.a.b().l("com/android/dialer/dobby/impl/ui/DobbyInCallFragmentPeer", "onLlmGeneratedContentConsentDialogCancelButtonClicked", 287, "DobbyInCallFragmentPeer.kt").v("LLM generated content consent dialog canceled");
                aoov.an(ntsVar7.d, (aolr) null, 0, new nto(ntsVar7, (aoln) null, 0), 3);
                ntsVar7.e();
                return aojh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i) {
        super(0, obj, cop.class, "invalidateNodes", "invalidateNodes()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, char[] cArr) {
        super(0, obj, pzm.class, "stopDtmf", "stopDtmf()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, short[] sArr) {
        super(0, obj, defpackage.izm.class, "onBackClick", "onBackClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, defpackage.jao.class, "launchFeatureSettings", "launchFeatureSettings$third_party_java_src_android_app_dialer_java_com_android_dialer_beesly_impl_settings_promo_promo()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, float[] fArr) {
        super(0, obj, defpackage.jar.class, "launchFeatureSettings", "launchFeatureSettings$third_party_java_src_android_app_dialer_java_com_android_dialer_beesly_impl_settings_promo_promo()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, char[][] cArr) {
        super(0, obj, defpackage.jat.class, "launchFeatureSettings", "launchFeatureSettings$third_party_java_src_android_app_dialer_java_com_android_dialer_beesly_impl_settings_promo_promo()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, short[][] sArr) {
        super(0, obj, defpackage.jtn.class, "handleCloseButtonClick", "handleCloseButtonClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, int[][] iArr) {
        super(0, obj, defpackage.jtn.class, "handleNegativeButtonClick", "handleNegativeButtonClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, boolean[][] zArr) {
        super(0, obj, defpackage.jtn.class, "handlePositiveButtonClick", "handlePositiveButtonClick()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, float[][] fArr) {
        super(0, obj, defpackage.kgt.class, "createFragment", "createFragment()Landroid/support/v4/app/Fragment;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, byte[][][] bArr) {
        super(0, obj, defpackage.ksv.class, "onClose", "onClose()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, char[][][] cArr) {
        super(0, obj, defpackage.nts.class, "onEndCallButtonClicked", "onEndCallButtonClicked()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, short[][][] sArr) {
        super(0, obj, defpackage.nts.class, "onJoinCallButtonClicked", "onJoinCallButtonClicked()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, int[][][] iArr) {
        super(0, obj, defpackage.nts.class, "openGoogleTermsOfService", "openGoogleTermsOfService()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, boolean[][][] zArr) {
        super(0, obj, defpackage.nts.class, "onLlmGeneratedContentDisclaimerDialogDismissed", "onLlmGeneratedContentDisclaimerDialogDismissed()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, float[][][] fArr) {
        super(0, obj, defpackage.nts.class, "openGenerativeAiTermsOfService", "openGenerativeAiTermsOfService()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(0, obj, defpackage.nts.class, "onLlmGeneratedContentConsentDialogConfirmButtonClicked", "onLlmGeneratedContentConsentDialogConfirmButtonClicked()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coo(java.lang.Object obj, int i, char[] cArr, byte[] bArr) {
        super(0, obj, defpackage.nts.class, "onLlmGeneratedContentConsentDialogCancelButtonClicked", "onLlmGeneratedContentConsentDialogCancelButtonClicked()V", 0);
        this.$cid = i;
    }
}
