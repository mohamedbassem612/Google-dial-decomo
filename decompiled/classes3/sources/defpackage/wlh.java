package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wlh extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.wll f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlh(defpackage.wll wllVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = wllVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x019b  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x01e0 A[PHI: r1 r2 r4 r5 r11 r14
      0x01e0: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v24 java.lang.Object) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r2v6 java.lang.Object) = (r2v5 java.lang.Object), (r2v37 java.lang.Object) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r4v10 aosy) = (r4v22 aosy), (r4v23 aosy) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v18 aolu) = (r5v17 aolu), (r5v27 aolu) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v7 int) = (r11v6 int), (r11v17 int) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r14v3 java.util.List) = (r14v2 java.util.List), (r14v8 java.util.List) binds: [B:33:0x01de, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x0213  */
    /* JADX WARN: Code duplicated, block: B:42:0x021a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0232  */
    /* JADX WARN: Code duplicated, block: B:48:0x024b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0270  */
    /* JADX WARN: Code duplicated, block: B:54:0x027a  */
    /* JADX WARN: Code duplicated, block: B:57:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        java.util.List arrayList;
        java.lang.Object objAm;
        java.lang.Object objAm2;
        int i;
        java.lang.Object objA;
        aolu aoluVar;
        aosy aosyVar;
        java.lang.Object obj2;
        java.lang.Object objA2;
        java.lang.Object obj3;
        aosy aosyVar2;
        defpackage.wpu wpuVar;
        java.lang.Object objA3;
        aosy aosyVar3;
        java.lang.Object objA4;
        aosy aosyVar4;
        nzb nzbVar;
        java.lang.Object objA5;
        nzb nzbVar2;
        java.util.List list;
        int iAd;
        int iAd2;
        int i2;
        aolu aoluVar2 = aolu.a;
        int i3 = this.e;
        if (i3 == 0) {
            aooc.af(obj);
            aoss aossVar = (aoss) this.g;
            arrayList = new java.util.ArrayList();
            defpackage.wll wllVar = this.f;
            ajcq ajcqVar = wllVar.g.b;
            aooh.e(ajcqVar, "getDirection(...)");
            aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.wcj(ajcqVar, (aoln) null, 9, (byte[]) null), 3);
            aosyVarAm.p(new lwl(ajcqVar, 17));
            ajcq ajcqVarB = wllVar.f.b();
            aosy aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.wcj(ajcqVarB, (aoln) null, 10, (char[]) null), 3);
            aosyVarAm2.p(new lwl(ajcqVarB, 18));
            java.lang.String str = wllVar.c;
            aooh.f(str, "callId");
            defpackage.wjo wjoVar = wllVar.e;
            ajcq ajcqVarF = aosv.F(wjoVar.c, 0, new defpackage.vjf(wjoVar, str, (aoln) null, 12), 3);
            aosy aosyVarAm3 = aoov.am(aossVar, 0, new defpackage.wcj(ajcqVarF, (aoln) null, 11, (short[]) null), 3);
            aosyVarAm3.p(new lwl(ajcqVarF, 19));
            aosy aosyVarAm4 = aoov.am(aossVar, 0, new defpackage.wcj(wllVar, (aoln) null, 8), 3);
            objAm = aoov.am(aossVar, 0, new defpackage.ryd(wllVar, aosyVarAm4, (aoln) null, 7), 3);
            objAm2 = aoov.am(aossVar, 0, new defpackage.ryd(wllVar, aosyVarAm4, (aoln) null, 8, (byte[]) null), 3);
            if (wllVar.h.a().size() > 1) {
                defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 91, "XatuPreconditions.kt").y("current call [%s] is not the only ongoing call", str);
                arrayList.add(defpackage.amth.MORE_THAN_ONE_ONGOING_CALL);
            }
            this.g = arrayList;
            this.a = aosyVarAm2;
            this.b = aosyVarAm3;
            this.c = objAm;
            this.d = objAm2;
            i = 1;
            this.e = 1;
            objA = aosyVarAm.a(this);
            aoluVar = aoluVar2;
            if (objA != aoluVar) {
                aosyVar = aosyVarAm2;
                obj2 = aosyVarAm3;
            }
            return aoluVar;
        }
        if (i3 == 1) {
            objAm2 = this.d;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.b;
            aosyVar = (aosy) this.a;
            arrayList = (java.util.List) this.g;
            aooc.af(obj);
            objA = obj;
            objAm = obj4;
            i = 1;
            aoluVar = aoluVar2;
            obj2 = obj5;
        } else {
            if (i3 == 2) {
                objAm2 = this.c;
                java.lang.Object obj6 = this.b;
                aosy aosyVar5 = (aosy) this.a;
                java.util.List list2 = (java.util.List) this.g;
                aooc.af(obj);
                aoluVar = aoluVar2;
                aosyVar2 = aosyVar5;
                i = 1;
                objA2 = obj;
                arrayList = list2;
                obj3 = obj6;
                wpuVar = (defpackage.wpu) objA2;
                if (wpuVar == defpackage.wpu.UNKNOWN) {
                    defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 102, "XatuPreconditions.kt").v("enrollment status unknown");
                    arrayList.add(defpackage.amth.UNKNOWN_ENROLLMENT_STATUS);
                }
                if (wpuVar == defpackage.wpu.USER_OPTED_OUT) {
                    defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 107, "XatuPreconditions.kt").v("xatu disabled by user in settings");
                    arrayList.add(defpackage.amth.USER_OPTED_OUT);
                }
                this.g = arrayList;
                this.a = obj3;
                this.b = objAm2;
                this.c = null;
                this.e = 3;
                objA3 = aosyVar2.a(this);
                aosyVar3 = obj3;
                if (objA3 != aoluVar) {
                    if (!((java.lang.Boolean) objA3).booleanValue()) {
                        defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 112, "XatuPreconditions.kt").y("pipeline is not ready for [%s]", this.f.c);
                        arrayList.add(defpackage.amth.PIPELINE_RUNNER_PRECONDITION_CHECK_FAILED);
                    }
                    this.g = arrayList;
                    this.a = objAm2;
                    this.b = null;
                    this.e = 4;
                    objA4 = aosyVar3.a(this);
                    if (objA4 != aoluVar) {
                        aosyVar4 = objAm2;
                        nzbVar = (nzb) objA4;
                        if (!nzbVar.c) {
                            aimw aimwVarL = defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 120, "XatuPreconditions.kt");
                            defpackage.wll wllVar2 = this.f;
                            iAd = mni.ad(nzbVar.d);
                            if (iAd == 0) {
                                iAd = i;
                            }
                            aimwVarL.G("unsupported number for [%s], reason: %d", wllVar2.c, iAd - 1);
                            arrayList.add(defpackage.amth.UNSUPPORTED_NUMBER);
                        }
                        if (this.f.b.isTouchExplorationEnabled()) {
                            defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 129, "XatuPreconditions.kt").v("A11y screen reader enabled");
                            arrayList.add(defpackage.amth.SCREEN_READER_ENABLED);
                        }
                        this.g = arrayList;
                        this.a = nzbVar;
                        this.e = 5;
                        objA5 = aosyVar4.a(this);
                        if (objA5 != aoluVar) {
                            nzbVar2 = nzbVar;
                            list = arrayList;
                        }
                    }
                }
                return aoluVar;
            }
            if (i3 == 3) {
                objAm2 = this.b;
                aosy aosyVar6 = (aosy) this.a;
                java.util.List list3 = (java.util.List) this.g;
                aooc.af(obj);
                arrayList = list3;
                i = 1;
                aoluVar = aoluVar2;
                objA3 = obj;
                aosyVar3 = aosyVar6;
                if (!((java.lang.Boolean) objA3).booleanValue()) {
                    defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 112, "XatuPreconditions.kt").y("pipeline is not ready for [%s]", this.f.c);
                    arrayList.add(defpackage.amth.PIPELINE_RUNNER_PRECONDITION_CHECK_FAILED);
                }
                this.g = arrayList;
                this.a = objAm2;
                this.b = null;
                this.e = 4;
                objA4 = aosyVar3.a(this);
                if (objA4 != aoluVar) {
                    aosyVar4 = objAm2;
                    nzbVar = (nzb) objA4;
                    if (!nzbVar.c) {
                        aimw aimwVarL2 = defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 120, "XatuPreconditions.kt");
                        defpackage.wll wllVar3 = this.f;
                        iAd = mni.ad(nzbVar.d);
                        if (iAd == 0) {
                            iAd = i;
                        }
                        aimwVarL2.G("unsupported number for [%s], reason: %d", wllVar3.c, iAd - 1);
                        arrayList.add(defpackage.amth.UNSUPPORTED_NUMBER);
                    }
                    if (this.f.b.isTouchExplorationEnabled()) {
                        defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 129, "XatuPreconditions.kt").v("A11y screen reader enabled");
                        arrayList.add(defpackage.amth.SCREEN_READER_ENABLED);
                    }
                    this.g = arrayList;
                    this.a = nzbVar;
                    this.e = 5;
                    objA5 = aosyVar4.a(this);
                    if (objA5 != aoluVar) {
                        nzbVar2 = nzbVar;
                        list = arrayList;
                    }
                }
                return aoluVar;
            }
            java.lang.Object obj7 = this.a;
            if (i3 == 4) {
                java.util.List list4 = (java.util.List) this.g;
                aooc.af(obj);
                arrayList = list4;
                i = 1;
                aoluVar = aoluVar2;
                objA4 = obj;
                aosyVar4 = (aosy) obj7;
                nzbVar = (nzb) objA4;
                if (!nzbVar.c) {
                    aimw aimwVarL3 = defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 120, "XatuPreconditions.kt");
                    defpackage.wll wllVar4 = this.f;
                    iAd = mni.ad(nzbVar.d);
                    if (iAd == 0) {
                        iAd = i;
                    }
                    aimwVarL3.G("unsupported number for [%s], reason: %d", wllVar4.c, iAd - 1);
                    arrayList.add(defpackage.amth.UNSUPPORTED_NUMBER);
                }
                if (this.f.b.isTouchExplorationEnabled()) {
                    defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 129, "XatuPreconditions.kt").v("A11y screen reader enabled");
                    arrayList.add(defpackage.amth.SCREEN_READER_ENABLED);
                }
                this.g = arrayList;
                this.a = nzbVar;
                this.e = 5;
                objA5 = aosyVar4.a(this);
                if (objA5 != aoluVar) {
                    nzbVar2 = nzbVar;
                    list = arrayList;
                }
                return aoluVar;
            }
            nzbVar2 = (nzb) obj7;
            list = (java.util.List) this.g;
            aooc.af(obj);
            objA5 = obj;
            i = 1;
        }
        if (((java.lang.Boolean) objA5).booleanValue()) {
            defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 134, "XatuPreconditions.kt").y("current call [%s] is an active Hedwig call", this.f.c);
            list.add(defpackage.amth.HEDWIG_ACTIVE);
        }
        defpackage.wll wllVar5 = this.f;
        defpackage.vel velVar = new defpackage.vel(list, 13);
        defpackage.voc vocVar = wllVar5.d.h;
        java.lang.String str2 = wllVar5.c;
        vocVar.f(str2, velVar);
        iAd2 = mni.ad(nzbVar2.d);
        if (iAd2 == 0) {
            i2 = i;
        } else {
            i2 = iAd2;
        }
        vocVar.f(str2, new defpackage.tbn(i2, 3));
        return java.lang.Boolean.valueOf(list.isEmpty());
        if (objA != defpackage.zmy.b) {
            defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 96, "XatuPreconditions.kt").y("[%s] is not an outgoing call", this.f.c);
            arrayList.add(defpackage.amth.NOT_AN_OUTGOING_CALL);
        }
        this.g = arrayList;
        this.a = obj2;
        this.b = objAm;
        this.c = objAm2;
        this.d = null;
        this.e = 2;
        objA2 = aosyVar.a(this);
        if (objA2 != aoluVar) {
            obj3 = objAm;
            aosyVar2 = obj2;
            wpuVar = (defpackage.wpu) objA2;
            if (wpuVar == defpackage.wpu.UNKNOWN) {
                defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 102, "XatuPreconditions.kt").v("enrollment status unknown");
                arrayList.add(defpackage.amth.UNKNOWN_ENROLLMENT_STATUS);
            }
            if (wpuVar == defpackage.wpu.USER_OPTED_OUT) {
                defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 107, "XatuPreconditions.kt").v("xatu disabled by user in settings");
                arrayList.add(defpackage.amth.USER_OPTED_OUT);
            }
            this.g = arrayList;
            this.a = obj3;
            this.b = objAm2;
            this.c = null;
            this.e = 3;
            objA3 = aosyVar2.a(this);
            aosyVar3 = obj3;
            if (objA3 != aoluVar) {
                if (!((java.lang.Boolean) objA3).booleanValue()) {
                    defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 112, "XatuPreconditions.kt").y("pipeline is not ready for [%s]", this.f.c);
                    arrayList.add(defpackage.amth.PIPELINE_RUNNER_PRECONDITION_CHECK_FAILED);
                }
                this.g = arrayList;
                this.a = objAm2;
                this.b = null;
                this.e = 4;
                objA4 = aosyVar3.a(this);
                if (objA4 != aoluVar) {
                    aosyVar4 = objAm2;
                    nzbVar = (nzb) objA4;
                    if (!nzbVar.c) {
                        aimw aimwVarL4 = defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 120, "XatuPreconditions.kt");
                        defpackage.wll wllVar6 = this.f;
                        iAd = mni.ad(nzbVar.d);
                        if (iAd == 0) {
                            iAd = i;
                        }
                        aimwVarL4.G("unsupported number for [%s], reason: %d", wllVar6.c, iAd - 1);
                        arrayList.add(defpackage.amth.UNSUPPORTED_NUMBER);
                    }
                    if (this.f.b.isTouchExplorationEnabled()) {
                        defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 129, "XatuPreconditions.kt").v("A11y screen reader enabled");
                        arrayList.add(defpackage.amth.SCREEN_READER_ENABLED);
                    }
                    this.g = arrayList;
                    this.a = nzbVar;
                    this.e = 5;
                    objA5 = aosyVar4.a(this);
                    if (objA5 != aoluVar) {
                        nzbVar2 = nzbVar;
                        list = arrayList;
                        if (((java.lang.Boolean) objA5).booleanValue()) {
                            defpackage.wll.a.b().l("com/android/dialer/xatu/impl/service/XatuPreconditions", "arePreconditionsSatisfied$<anonymous>", 134, "XatuPreconditions.kt").y("current call [%s] is an active Hedwig call", this.f.c);
                            list.add(defpackage.amth.HEDWIG_ACTIVE);
                        }
                        defpackage.wll wllVar7 = this.f;
                        defpackage.vel velVar2 = new defpackage.vel(list, 13);
                        defpackage.voc vocVar2 = wllVar7.d.h;
                        java.lang.String str3 = wllVar7.c;
                        vocVar2.f(str3, velVar2);
                        iAd2 = mni.ad(nzbVar2.d);
                        if (iAd2 == 0) {
                            i2 = i;
                        } else {
                            i2 = iAd2;
                        }
                        vocVar2.f(str3, new defpackage.tbn(i2, 3));
                        return java.lang.Boolean.valueOf(list.isEmpty());
                    }
                }
            }
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.wlh wlhVar = new defpackage.wlh(this.f, aolnVar);
        wlhVar.g = obj;
        return wlhVar;
    }
}
