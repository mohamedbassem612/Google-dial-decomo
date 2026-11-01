package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afnp implements aonj {
    public final /* synthetic */ defpackage.afov a;
    public final /* synthetic */ aonj b;
    public final /* synthetic */ aonj c;
    public final /* synthetic */ defpackage.afow d;
    public final /* synthetic */ ccp e;
    public final /* synthetic */ fvx f;

    public /* synthetic */ afnp(defpackage.afov afovVar, aonj aonjVar, fvx fvxVar, aonj aonjVar2, defpackage.afow afowVar, ccp ccpVar) {
        this.a = afovVar;
        this.b = aonjVar;
        this.f = fvxVar;
        this.c = aonjVar2;
        this.d = afowVar;
        this.e = ccpVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        fwf fwfVar = (fwf) obj;
        aimz aimzVar = defpackage.afny.a;
        aooh.f(fwfVar, "$this$NavHost");
        final defpackage.afov afovVar = this.a;
        final aonj aonjVar = this.b;
        final fvx fvxVar = this.f;
        final aonj aonjVar2 = this.c;
        final defpackage.afow afowVar = this.d;
        final ccp ccpVar = this.e;
        hgt.K(fwfVar, "GooglePhotosHome", new cja(382328318, true, new aonp() { // from class: afnm
            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                cav cavVar = (cav) obj4;
                ((java.lang.Integer) obj5).intValue();
                aimz aimzVar2 = defpackage.afny.a;
                aooh.f((aer) obj2, "$this$composable");
                aooh.f((fvs) obj3, "it");
                ccpVar.b(dfa.f(2132019652, cavVar));
                fvx fvxVar2 = fvxVar;
                boolean zD = cavVar.D(fvxVar2);
                java.lang.Object objG = cavVar.g();
                if (zD || objG == cau.a) {
                    objG = new defpackage.abph(fvxVar2, 12);
                    cavVar.w(objG);
                }
                defpackage.afow afowVar2 = afowVar;
                aonj aonjVar3 = aonjVar2;
                defpackage.afny.f(afovVar, aonjVar, (aonj) objG, aonjVar3, afowVar2, cavVar, 0);
                return aojh.a;
            }
        }));
        final int i = 0;
        hgt.K(fwfVar, "AllPhotos", new cja(1476304757, true, new aonp() { // from class: afnn
            /* JADX WARN: Type inference failed for: r0v3, types: [aomy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v11, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v25, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v1, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v6, types: [aonj, java.lang.Object] */
            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                int i2;
                int i3 = i;
                if (i3 == 0) {
                    cav cavVar = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar2 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar));
                    java.lang.Object obj6 = afovVar;
                    aozh aozhVar = ((defpackage.afok) ((defpackage.afov) obj6).d).a;
                    boolean zD = cavVar.D(obj6);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == cau.a) {
                        objG = new atf(obj6, 2, (char[]) null);
                        cavVar.w(objG);
                    }
                    defpackage.afny.j(aozhVar, (aonn) objG, aonjVar2, "allPhotosScreen", 89727, cavVar, 27648);
                    return aojh.a;
                }
                if (i3 == 1) {
                    aer aerVar = (aer) obj2;
                    boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    aooh.f(aerVar, "$this$AnimatedContent");
                    if ((iIntValue & 6) == 0) {
                        i2 = (true == ((iIntValue & 8) == 0 ? cavVar2.B(aerVar) : cavVar2.D(aerVar)) ? 4 : 2) | iIntValue;
                    } else {
                        i2 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i2 |= true != cavVar2.C(zBooleanValue) ? 16 : 32;
                    }
                    if (cavVar2.H((i2 & 147) != 146, i2 & 1)) {
                        if (zBooleanValue) {
                            ?? r10 = afovVar;
                            cavVar2.u(-935028665);
                            r10.a(aerVar, cavVar2, java.lang.Integer.valueOf(i2 & 14));
                            cavVar2.o();
                        } else {
                            ?? r5 = aonjVar2;
                            cavVar2.u(-934960930);
                            if (r5 == 0) {
                                cavVar2.u(-934960931);
                            } else {
                                cavVar2.u(-934960930);
                                r5.a(aerVar, cavVar2, java.lang.Integer.valueOf(i2 & 14));
                            }
                            cavVar2.o();
                            cavVar2.o();
                        }
                        ?? r0 = ccpVar;
                        if (r0 != 0) {
                            java.lang.Object objF = aerVar.a().f();
                            afr afrVar = afr.b;
                            boolean z = objF == afrVar && aerVar.a().h() == afrVar;
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                            boolean zC = cavVar2.C(z) | ((i2 & 112) == 32) | cavVar2.B((java.lang.Object) r0);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zC || objG2 == cau.a) {
                                objG2 = new lpj(z, zBooleanValue, (aomy) r0, (aoln) null);
                                cavVar2.w(objG2);
                            }
                            cbp.g(boolValueOf, (aonn) objG2, cavVar2);
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
                if (i3 == 2) {
                    cav cavVar3 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar3 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar3));
                    java.lang.Object obj7 = afovVar;
                    aozh aozhVar2 = ((defpackage.afok) ((defpackage.afov) obj7).c).a;
                    boolean zD2 = cavVar3.D(obj7);
                    java.lang.Object objG3 = cavVar3.g();
                    if (zD2 || objG3 == cau.a) {
                        objG3 = new atf(obj7, 3, (short[]) null);
                        cavVar3.w(objG3);
                    }
                    defpackage.afny.j(aozhVar2, (aonn) objG3, aonjVar2, "meClusterScreen", 89749, cavVar3, 27648);
                    return aojh.a;
                }
                if (i3 == 3) {
                    cav cavVar4 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar4 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar4));
                    java.lang.Object obj8 = afovVar;
                    aozh aozhVar3 = ((defpackage.afod) ((defpackage.afov) obj8).e).b;
                    boolean zD3 = cavVar4.D(obj8);
                    java.lang.Object objG4 = cavVar4.g();
                    if (zD3 || objG4 == cau.a) {
                        objG4 = new atf(obj8, 4, (int[]) null);
                        cavVar4.w(objG4);
                    }
                    defpackage.afny.e(aozhVar3, (aonn) objG4, aonjVar2, cavVar4, 0);
                    return aojh.a;
                }
                fvs fvsVar = (fvs) obj3;
                cav cavVar5 = (cav) obj4;
                ((java.lang.Integer) obj5).intValue();
                aimz aimzVar5 = defpackage.afny.a;
                aooh.f((aer) obj2, "$this$composable");
                aooh.f(fvsVar, "it");
                ccpVar.b(dfa.f(2132019623, cavVar5));
                java.lang.Object objA = ((enr) fvsVar.h.a()).a("clusterId");
                aooh.c(objA);
                java.lang.String str = (java.lang.String) objA;
                java.lang.Object obj9 = afovVar;
                boolean zD4 = cavVar5.D(obj9) | cavVar5.B(str);
                java.lang.Object objG5 = cavVar5.g();
                if (zD4 || objG5 == cau.a) {
                    objG5 = new defpackage.afnv((defpackage.afov) obj9, str, null);
                    cavVar5.w(objG5);
                }
                ?? r9 = aonjVar2;
                aooh.f(str, "clusterId");
                defpackage.wyw wywVar = ((defpackage.afov) obj9).k;
                aooh.f(str, "clusterId");
                defpackage.afny.j(wywVar.c(str).e(), (aonn) objG5, r9, "clusterScreen", 89734, cavVar5, 27648);
                return aojh.a;
            }
        }));
        final int i2 = 2;
        hgt.K(fwfVar, "MePhotos", new cja(-1392877706, true, new aonp() { // from class: afnn
            /* JADX WARN: Type inference failed for: r0v3, types: [aomy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v11, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v25, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v1, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v6, types: [aonj, java.lang.Object] */
            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                int i3;
                int i4 = i2;
                if (i4 == 0) {
                    cav cavVar = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar2 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar));
                    java.lang.Object obj6 = afovVar;
                    aozh aozhVar = ((defpackage.afok) ((defpackage.afov) obj6).d).a;
                    boolean zD = cavVar.D(obj6);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == cau.a) {
                        objG = new atf(obj6, 2, (char[]) null);
                        cavVar.w(objG);
                    }
                    defpackage.afny.j(aozhVar, (aonn) objG, aonjVar2, "allPhotosScreen", 89727, cavVar, 27648);
                    return aojh.a;
                }
                if (i4 == 1) {
                    aer aerVar = (aer) obj2;
                    boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    aooh.f(aerVar, "$this$AnimatedContent");
                    if ((iIntValue & 6) == 0) {
                        i3 = (true == ((iIntValue & 8) == 0 ? cavVar2.B(aerVar) : cavVar2.D(aerVar)) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i3 |= true != cavVar2.C(zBooleanValue) ? 16 : 32;
                    }
                    if (cavVar2.H((i3 & 147) != 146, i3 & 1)) {
                        if (zBooleanValue) {
                            ?? r10 = afovVar;
                            cavVar2.u(-935028665);
                            r10.a(aerVar, cavVar2, java.lang.Integer.valueOf(i3 & 14));
                            cavVar2.o();
                        } else {
                            ?? r5 = aonjVar2;
                            cavVar2.u(-934960930);
                            if (r5 == 0) {
                                cavVar2.u(-934960931);
                            } else {
                                cavVar2.u(-934960930);
                                r5.a(aerVar, cavVar2, java.lang.Integer.valueOf(i3 & 14));
                            }
                            cavVar2.o();
                            cavVar2.o();
                        }
                        ?? r0 = ccpVar;
                        if (r0 != 0) {
                            java.lang.Object objF = aerVar.a().f();
                            afr afrVar = afr.b;
                            boolean z = objF == afrVar && aerVar.a().h() == afrVar;
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                            boolean zC = cavVar2.C(z) | ((i3 & 112) == 32) | cavVar2.B((java.lang.Object) r0);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zC || objG2 == cau.a) {
                                objG2 = new lpj(z, zBooleanValue, (aomy) r0, (aoln) null);
                                cavVar2.w(objG2);
                            }
                            cbp.g(boolValueOf, (aonn) objG2, cavVar2);
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
                if (i4 == 2) {
                    cav cavVar3 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar3 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar3));
                    java.lang.Object obj7 = afovVar;
                    aozh aozhVar2 = ((defpackage.afok) ((defpackage.afov) obj7).c).a;
                    boolean zD2 = cavVar3.D(obj7);
                    java.lang.Object objG3 = cavVar3.g();
                    if (zD2 || objG3 == cau.a) {
                        objG3 = new atf(obj7, 3, (short[]) null);
                        cavVar3.w(objG3);
                    }
                    defpackage.afny.j(aozhVar2, (aonn) objG3, aonjVar2, "meClusterScreen", 89749, cavVar3, 27648);
                    return aojh.a;
                }
                if (i4 == 3) {
                    cav cavVar4 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar4 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar4));
                    java.lang.Object obj8 = afovVar;
                    aozh aozhVar3 = ((defpackage.afod) ((defpackage.afov) obj8).e).b;
                    boolean zD3 = cavVar4.D(obj8);
                    java.lang.Object objG4 = cavVar4.g();
                    if (zD3 || objG4 == cau.a) {
                        objG4 = new atf(obj8, 4, (int[]) null);
                        cavVar4.w(objG4);
                    }
                    defpackage.afny.e(aozhVar3, (aonn) objG4, aonjVar2, cavVar4, 0);
                    return aojh.a;
                }
                fvs fvsVar = (fvs) obj3;
                cav cavVar5 = (cav) obj4;
                ((java.lang.Integer) obj5).intValue();
                aimz aimzVar5 = defpackage.afny.a;
                aooh.f((aer) obj2, "$this$composable");
                aooh.f(fvsVar, "it");
                ccpVar.b(dfa.f(2132019623, cavVar5));
                java.lang.Object objA = ((enr) fvsVar.h.a()).a("clusterId");
                aooh.c(objA);
                java.lang.String str = (java.lang.String) objA;
                java.lang.Object obj9 = afovVar;
                boolean zD4 = cavVar5.D(obj9) | cavVar5.B(str);
                java.lang.Object objG5 = cavVar5.g();
                if (zD4 || objG5 == cau.a) {
                    objG5 = new defpackage.afnv((defpackage.afov) obj9, str, null);
                    cavVar5.w(objG5);
                }
                ?? r9 = aonjVar2;
                aooh.f(str, "clusterId");
                defpackage.wyw wywVar = ((defpackage.afov) obj9).k;
                aooh.f(str, "clusterId");
                defpackage.afny.j(wywVar.c(str).e(), (aonn) objG5, r9, "clusterScreen", 89734, cavVar5, 27648);
                return aojh.a;
            }
        }));
        final int i3 = 3;
        hgt.K(fwfVar, "Clusters", new cja(32907127, true, new aonp() { // from class: afnn
            /* JADX WARN: Type inference failed for: r0v3, types: [aomy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v11, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v25, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v1, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v6, types: [aonj, java.lang.Object] */
            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                int i4;
                int i5 = i3;
                if (i5 == 0) {
                    cav cavVar = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar2 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar));
                    java.lang.Object obj6 = afovVar;
                    aozh aozhVar = ((defpackage.afok) ((defpackage.afov) obj6).d).a;
                    boolean zD = cavVar.D(obj6);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == cau.a) {
                        objG = new atf(obj6, 2, (char[]) null);
                        cavVar.w(objG);
                    }
                    defpackage.afny.j(aozhVar, (aonn) objG, aonjVar, "allPhotosScreen", 89727, cavVar, 27648);
                    return aojh.a;
                }
                if (i5 == 1) {
                    aer aerVar = (aer) obj2;
                    boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    aooh.f(aerVar, "$this$AnimatedContent");
                    if ((iIntValue & 6) == 0) {
                        i4 = (true == ((iIntValue & 8) == 0 ? cavVar2.B(aerVar) : cavVar2.D(aerVar)) ? 4 : 2) | iIntValue;
                    } else {
                        i4 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i4 |= true != cavVar2.C(zBooleanValue) ? 16 : 32;
                    }
                    if (cavVar2.H((i4 & 147) != 146, i4 & 1)) {
                        if (zBooleanValue) {
                            ?? r10 = afovVar;
                            cavVar2.u(-935028665);
                            r10.a(aerVar, cavVar2, java.lang.Integer.valueOf(i4 & 14));
                            cavVar2.o();
                        } else {
                            ?? r5 = aonjVar;
                            cavVar2.u(-934960930);
                            if (r5 == 0) {
                                cavVar2.u(-934960931);
                            } else {
                                cavVar2.u(-934960930);
                                r5.a(aerVar, cavVar2, java.lang.Integer.valueOf(i4 & 14));
                            }
                            cavVar2.o();
                            cavVar2.o();
                        }
                        ?? r0 = ccpVar;
                        if (r0 != 0) {
                            java.lang.Object objF = aerVar.a().f();
                            afr afrVar = afr.b;
                            boolean z = objF == afrVar && aerVar.a().h() == afrVar;
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                            boolean zC = cavVar2.C(z) | ((i4 & 112) == 32) | cavVar2.B((java.lang.Object) r0);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zC || objG2 == cau.a) {
                                objG2 = new lpj(z, zBooleanValue, (aomy) r0, (aoln) null);
                                cavVar2.w(objG2);
                            }
                            cbp.g(boolValueOf, (aonn) objG2, cavVar2);
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
                if (i5 == 2) {
                    cav cavVar3 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar3 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar3));
                    java.lang.Object obj7 = afovVar;
                    aozh aozhVar2 = ((defpackage.afok) ((defpackage.afov) obj7).c).a;
                    boolean zD2 = cavVar3.D(obj7);
                    java.lang.Object objG3 = cavVar3.g();
                    if (zD2 || objG3 == cau.a) {
                        objG3 = new atf(obj7, 3, (short[]) null);
                        cavVar3.w(objG3);
                    }
                    defpackage.afny.j(aozhVar2, (aonn) objG3, aonjVar, "meClusterScreen", 89749, cavVar3, 27648);
                    return aojh.a;
                }
                if (i5 == 3) {
                    cav cavVar4 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar4 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar4));
                    java.lang.Object obj8 = afovVar;
                    aozh aozhVar3 = ((defpackage.afod) ((defpackage.afov) obj8).e).b;
                    boolean zD3 = cavVar4.D(obj8);
                    java.lang.Object objG4 = cavVar4.g();
                    if (zD3 || objG4 == cau.a) {
                        objG4 = new atf(obj8, 4, (int[]) null);
                        cavVar4.w(objG4);
                    }
                    defpackage.afny.e(aozhVar3, (aonn) objG4, aonjVar, cavVar4, 0);
                    return aojh.a;
                }
                fvs fvsVar = (fvs) obj3;
                cav cavVar5 = (cav) obj4;
                ((java.lang.Integer) obj5).intValue();
                aimz aimzVar5 = defpackage.afny.a;
                aooh.f((aer) obj2, "$this$composable");
                aooh.f(fvsVar, "it");
                ccpVar.b(dfa.f(2132019623, cavVar5));
                java.lang.Object objA = ((enr) fvsVar.h.a()).a("clusterId");
                aooh.c(objA);
                java.lang.String str = (java.lang.String) objA;
                java.lang.Object obj9 = afovVar;
                boolean zD4 = cavVar5.D(obj9) | cavVar5.B(str);
                java.lang.Object objG5 = cavVar5.g();
                if (zD4 || objG5 == cau.a) {
                    objG5 = new defpackage.afnv((defpackage.afov) obj9, str, null);
                    cavVar5.w(objG5);
                }
                ?? r9 = aonjVar;
                aooh.f(str, "clusterId");
                defpackage.wyw wywVar = ((defpackage.afov) obj9).k;
                aooh.f(str, "clusterId");
                defpackage.afny.j(wywVar.c(str).e(), (aonn) objG5, r9, "clusterScreen", 89734, cavVar5, 27648);
                return aojh.a;
            }
        }));
        final int i4 = 4;
        hgt.K(fwfVar, "Cluster/{clusterId}", new cja(1458691960, true, new aonp() { // from class: afnn
            /* JADX WARN: Type inference failed for: r0v3, types: [aomy, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v11, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v1, types: [aonj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v25, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v1, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [ccp, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [aono, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v6, types: [aonj, java.lang.Object] */
            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                int i5;
                int i6 = i4;
                if (i6 == 0) {
                    cav cavVar = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar2 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar));
                    java.lang.Object obj6 = afovVar;
                    aozh aozhVar = ((defpackage.afok) ((defpackage.afov) obj6).d).a;
                    boolean zD = cavVar.D(obj6);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == cau.a) {
                        objG = new atf(obj6, 2, (char[]) null);
                        cavVar.w(objG);
                    }
                    defpackage.afny.j(aozhVar, (aonn) objG, aonjVar2, "allPhotosScreen", 89727, cavVar, 27648);
                    return aojh.a;
                }
                if (i6 == 1) {
                    aer aerVar = (aer) obj2;
                    boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    aooh.f(aerVar, "$this$AnimatedContent");
                    if ((iIntValue & 6) == 0) {
                        i5 = (true == ((iIntValue & 8) == 0 ? cavVar2.B(aerVar) : cavVar2.D(aerVar)) ? 4 : 2) | iIntValue;
                    } else {
                        i5 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i5 |= true != cavVar2.C(zBooleanValue) ? 16 : 32;
                    }
                    if (cavVar2.H((i5 & 147) != 146, i5 & 1)) {
                        if (zBooleanValue) {
                            ?? r10 = afovVar;
                            cavVar2.u(-935028665);
                            r10.a(aerVar, cavVar2, java.lang.Integer.valueOf(i5 & 14));
                            cavVar2.o();
                        } else {
                            ?? r5 = aonjVar2;
                            cavVar2.u(-934960930);
                            if (r5 == 0) {
                                cavVar2.u(-934960931);
                            } else {
                                cavVar2.u(-934960930);
                                r5.a(aerVar, cavVar2, java.lang.Integer.valueOf(i5 & 14));
                            }
                            cavVar2.o();
                            cavVar2.o();
                        }
                        ?? r0 = ccpVar;
                        if (r0 != 0) {
                            java.lang.Object objF = aerVar.a().f();
                            afr afrVar = afr.b;
                            boolean z = objF == afrVar && aerVar.a().h() == afrVar;
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                            boolean zC = cavVar2.C(z) | ((i5 & 112) == 32) | cavVar2.B((java.lang.Object) r0);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zC || objG2 == cau.a) {
                                objG2 = new lpj(z, zBooleanValue, (aomy) r0, (aoln) null);
                                cavVar2.w(objG2);
                            }
                            cbp.g(boolValueOf, (aonn) objG2, cavVar2);
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
                if (i6 == 2) {
                    cav cavVar3 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar3 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar3));
                    java.lang.Object obj7 = afovVar;
                    aozh aozhVar2 = ((defpackage.afok) ((defpackage.afov) obj7).c).a;
                    boolean zD2 = cavVar3.D(obj7);
                    java.lang.Object objG3 = cavVar3.g();
                    if (zD2 || objG3 == cau.a) {
                        objG3 = new atf(obj7, 3, (short[]) null);
                        cavVar3.w(objG3);
                    }
                    defpackage.afny.j(aozhVar2, (aonn) objG3, aonjVar2, "meClusterScreen", 89749, cavVar3, 27648);
                    return aojh.a;
                }
                if (i6 == 3) {
                    cav cavVar4 = (cav) obj4;
                    ((java.lang.Integer) obj5).intValue();
                    aimz aimzVar4 = defpackage.afny.a;
                    aooh.f((aer) obj2, "$this$composable");
                    aooh.f((fvs) obj3, "it");
                    ccpVar.b(dfa.f(2132019623, cavVar4));
                    java.lang.Object obj8 = afovVar;
                    aozh aozhVar3 = ((defpackage.afod) ((defpackage.afov) obj8).e).b;
                    boolean zD3 = cavVar4.D(obj8);
                    java.lang.Object objG4 = cavVar4.g();
                    if (zD3 || objG4 == cau.a) {
                        objG4 = new atf(obj8, 4, (int[]) null);
                        cavVar4.w(objG4);
                    }
                    defpackage.afny.e(aozhVar3, (aonn) objG4, aonjVar2, cavVar4, 0);
                    return aojh.a;
                }
                fvs fvsVar = (fvs) obj3;
                cav cavVar5 = (cav) obj4;
                ((java.lang.Integer) obj5).intValue();
                aimz aimzVar5 = defpackage.afny.a;
                aooh.f((aer) obj2, "$this$composable");
                aooh.f(fvsVar, "it");
                ccpVar.b(dfa.f(2132019623, cavVar5));
                java.lang.Object objA = ((enr) fvsVar.h.a()).a("clusterId");
                aooh.c(objA);
                java.lang.String str = (java.lang.String) objA;
                java.lang.Object obj9 = afovVar;
                boolean zD4 = cavVar5.D(obj9) | cavVar5.B(str);
                java.lang.Object objG5 = cavVar5.g();
                if (zD4 || objG5 == cau.a) {
                    objG5 = new defpackage.afnv((defpackage.afov) obj9, str, null);
                    cavVar5.w(objG5);
                }
                ?? r9 = aonjVar2;
                aooh.f(str, "clusterId");
                defpackage.wyw wywVar = ((defpackage.afov) obj9).k;
                aooh.f(str, "clusterId");
                defpackage.afny.j(wywVar.c(str).e(), (aonn) objG5, r9, "clusterScreen", 89734, cavVar5, 27648);
                return aojh.a;
            }
        }));
        return aojh.a;
    }
}
