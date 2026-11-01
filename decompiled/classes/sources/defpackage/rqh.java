package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqh implements defpackage.agye {
    final /* synthetic */ defpackage.rqi a;

    public rqh(defpackage.rqi rqiVar) {
        this.a = rqiVar;
    }

    @Override // defpackage.agye
    public final void a(java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.aooh.f(th, "t");
        ((defpackage.aimw) ((defpackage.aimw) defpackage.rqi.a.c()).k(th).l("com/android/dialer/main/impl/ui/MainFragmentPeer$subscriptionCallbacks$<anonymous>", "onError", 176, "MainFragmentPeer.kt")).v("couldn't load MainFragmentDataModel.");
        throw th;
    }

    @Override // defpackage.agye
    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.aimz aimzVar;
        java.lang.String str;
        java.lang.Object next;
        defpackage.roc rocVarB;
        defpackage.rnz rnzVar;
        rrf rroVar;
        rrf rrfVarBe;
        defpackage.rpf rpfVar = (defpackage.rpf) obj;
        if (rpfVar == null) {
            defpackage.aooh.i("dataModel");
        }
        defpackage.aimz aimzVar2 = defpackage.rqi.a;
        ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer$subscriptionCallbacks$<anonymous>", "onNewData", 162, "MainFragmentPeer.kt")).v("enter");
        final defpackage.rqi rqiVar = this.a;
        if (rpfVar.e) {
            rpp.aU().r(rqiVar.b.I(), "device_incompatible_dialog");
            rqiVar.d.e();
        }
        defpackage.rpe rpeVar = rpfVar.f;
        if (rpeVar == null) {
            rpeVar = defpackage.rpe.a;
        }
        defpackage.aooh.e(rpeVar, "getSelectedUiType(...)");
        int iX = defpackage.a.X(rpeVar.b);
        if (iX == 0) {
            throw null;
        }
        int i = iX - 1;
        if (i != 0) {
            if (i == 1) {
                rqiVar.z.f(true);
                defpackage.akzx akzxVarM = rrt.a.m();
                if (akzxVarM == null) {
                    defpackage.aooh.i("builder");
                }
                defpackage.rpe rpeVar2 = rpfVar.f;
                if (rpeVar2 == null) {
                    rpeVar2 = defpackage.rpe.a;
                }
                int iAR = defpackage.a.aR((rpeVar2.b == 2 ? (defpackage.rpd) rpeVar2.c : defpackage.rpd.a).c);
                if (iAR == 0) {
                    iAR = 1;
                }
                akzxVarM.u();
                akzxVarM.b.c = iAR == 1 ? defpackage.alau.a() : iAR - 2;
                defpackage.rpe rpeVar3 = rpfVar.f;
                if (rpeVar3 == null) {
                    rpeVar3 = defpackage.rpe.a;
                }
                java.lang.String str2 = (rpeVar3.b == 2 ? (defpackage.rpd) rpeVar3.c : defpackage.rpd.a).d;
                defpackage.aooh.e(str2, "getInput(...)");
                if (str2 == null) {
                    defpackage.aooh.i("value");
                }
                akzxVarM.u();
                rrt rrtVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                rrtVar.b |= 1;
                rrtVar.d = str2;
                defpackage.rpe rpeVar4 = rpfVar.f;
                defpackage.rpe rpeVar5 = rpeVar4 == null ? defpackage.rpe.a : rpeVar4;
                aimzVar = aimzVar2;
                if (((rpeVar5.b == 2 ? (defpackage.rpd) rpeVar5.c : defpackage.rpd.a).b & 2) != 0) {
                    if (rpeVar4 == null) {
                        rpeVar4 = defpackage.rpe.a;
                    }
                    defpackage.alcf alcfVar = (rpeVar4.b == 2 ? (defpackage.rpd) rpeVar4.c : defpackage.rpd.a).e;
                    if (alcfVar == null) {
                        alcfVar = defpackage.alcf.a;
                    }
                    defpackage.aooh.e(alcfVar, "getIntentTimestamp(...)");
                    if (alcfVar == null) {
                        defpackage.aooh.i("value");
                    }
                    akzxVarM.u();
                    rrt rrtVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(alcfVar);
                    rrtVar2.e = alcfVar;
                    rrtVar2.b |= 2;
                }
                rrt rrtVarR = akzxVarM.r();
                defpackage.aooh.e(rrtVarR, "build(...)");
                rrt rrtVar3 = rrtVarR;
                defpackage.rpv rpvVar = rqiVar.b;
                defpackage.aw awVarD = rpvVar.I().d(2131428892);
                if (!rqiVar.c.c(rpvVar.H())) {
                    if (awVarD == null) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "showOrUpdateSearchContainerFragment", 861, "MainFragmentPeer.kt")).v("creating new search container");
                        defpackage.rru rruVar = (defpackage.rru) rqiVar.B.g().orElseThrow();
                        defpackage.aooh.f(rrtVar3, "searchContainerArgs");
                        str = "No value is set for oneof UiType.";
                        ((defpackage.aimw) defpackage.rru.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchContainerImpl", "createSearchContainerFragment", 18, "SearchContainerImpl.kt")).v("enter");
                        int iAR2 = defpackage.a.aR(rrtVar3.c);
                        if (iAR2 == 0) {
                            iAR2 = 1;
                        }
                        int i2 = iAR2 - 2;
                        if (i2 == 1) {
                            if (rruVar.c.a()) {
                                java.lang.String str3 = rrtVar3.d;
                                defpackage.aooh.e(str3, "getInput(...)");
                                defpackage.aooh.f(str3, "input");
                                rroVar = new rrl();
                                defpackage.amxr.g(rroVar);
                                defpackage.ahgl.c(rroVar, str3);
                            } else {
                                java.lang.String str4 = rrtVar3.d;
                                defpackage.aooh.e(str4, "getInput(...)");
                                defpackage.aooh.f(str4, "input");
                                rroVar = new defpackage.rro();
                                defpackage.amxr.g(rroVar);
                                defpackage.ahgl.c(rroVar, str4);
                            }
                            rrfVarBe = rroVar;
                        } else {
                            if (i2 != 2) {
                                java.lang.String str5 = java.lang.String.format("invalid SearchMode %s", java.util.Arrays.copyOf(new java.lang.Object[]{defpackage.pez.ba(iAR2)}, 1));
                                defpackage.aooh.e(str5, "format(...)");
                                throw new java.lang.IllegalArgumentException(str5);
                            }
                            if (rruVar.c.a()) {
                                rrh rrhVar = rri.a;
                                rrfVarBe = defpackage.pez.bc(defpackage.rru.a(rrtVar3));
                            } else {
                                defpackage.aimz aimzVar3 = rqz.a;
                                rrfVarBe = defpackage.pez.be(defpackage.rru.a(rrtVar3));
                            }
                        }
                        defpackage.u uVar = new defpackage.u(rpvVar.I());
                        defpackage.aw awVarD2 = rpvVar.I().d(2131427930);
                        if (awVarD2 != null) {
                            uVar.k(awVarD2);
                        }
                        defpackage.aigf aigfVarK = rqiVar.F.k();
                        defpackage.aooh.e(aigfVarK, "get(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(aigfVarK.size());
                        java.util.Iterator it = aigfVarK.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add(((defpackage.rnv) ((defpackage.aoin) ((java.util.Map.Entry) it.next()).getValue()).a()).c());
                        }
                        java.util.Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            defpackage.aw awVarE = rpvVar.I().e((java.lang.String) it2.next());
                            if (awVarE != null && !awVarE.aH()) {
                                defpackage.rqi.h(uVar, awVarE);
                            }
                        }
                        uVar.r(2130772008, 2130772009);
                        uVar.q(2131428892, rrfVarBe, null);
                        uVar.c();
                    } else {
                        str = "No value is set for oneof UiType.";
                        if (((rpeVar.b == 2 ? (defpackage.rpd) rpeVar.c : defpackage.rpd.a).b & 2) != 0) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "showOrUpdateSearchContainerFragment", 882, "MainFragmentPeer.kt")).v("update existing search container");
                            defpackage.rru rruVar2 = (defpackage.rru) rqiVar.B.g().orElseThrow();
                            defpackage.aooh.f(rrtVar3, "searchContainerArgs");
                            ((defpackage.aimw) defpackage.rru.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchContainerImpl", "update", 42, "SearchContainerImpl.kt")).v("enter");
                            defpackage.aw awVar = rruVar2.b;
                            rrf rrfVarD = awVar.I().d(2131428892);
                            if (rruVar2.c.a()) {
                                if (rrfVarD instanceof rrf) {
                                    rrfVarD.s().e(defpackage.rru.a(rrtVar3));
                                } else {
                                    defpackage.u uVar2 = new defpackage.u(awVar.I());
                                    rrh rrhVar2 = rri.a;
                                    uVar2.q(2131428892, defpackage.pez.bc(defpackage.rru.a(rrtVar3)), null);
                                    uVar2.c();
                                }
                            } else if (rrfVarD instanceof rqu) {
                                ((rqu) rrfVarD).c().e(defpackage.rru.a(rrtVar3));
                            } else {
                                defpackage.u uVar3 = new defpackage.u(awVar.I());
                                defpackage.aimz aimzVar4 = rqz.a;
                                uVar3.q(2131428892, defpackage.pez.be(defpackage.rru.a(rrtVar3)), null);
                                uVar3.c();
                            }
                        }
                    }
                }
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new java.lang.IllegalStateException("No value is set for oneof UiType.");
                    }
                    throw new defpackage.aois();
                }
                defpackage.rpv rpvVar2 = rqiVar.b;
                if (rpvVar2.I().e("default_dialer_prompt_fragment") == null) {
                    defpackage.aw awVarA = ((defpackage.mhy) rqiVar.A.g().orElseThrow()).a();
                    defpackage.u uVar4 = new defpackage.u(rpvVar2.I());
                    uVar4.q(2131427930, awVarA, "default_dialer_prompt_fragment");
                    defpackage.aigf aigfVarK2 = rqiVar.F.k();
                    defpackage.aooh.e(aigfVarK2, "get(...)");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(aigfVarK2.size());
                    java.util.Iterator it3 = aigfVarK2.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((defpackage.rnv) ((defpackage.aoin) ((java.util.Map.Entry) it3.next()).getValue()).a()).c());
                    }
                    java.util.Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        defpackage.aw awVarE2 = rpvVar2.I().e((java.lang.String) it4.next());
                        if (awVarE2 != null) {
                            uVar4.j(awVarE2);
                            uVar4.l(awVarE2, defpackage.emq.c);
                        }
                    }
                    defpackage.aw awVarD3 = rpvVar2.I().d(2131428892);
                    if (awVarD3 != null) {
                        uVar4.k(awVarD3);
                    }
                    uVar4.c();
                }
                aimzVar = aimzVar2;
            }
            str = "No value is set for oneof UiType.";
        } else {
            aimzVar = aimzVar2;
            str = "No value is set for oneof UiType.";
            defpackage.rpe rpeVar6 = rpfVar.f;
            if (rpeVar6 == null) {
                rpeVar6 = defpackage.rpe.a;
            }
            defpackage.roc rocVarB2 = defpackage.roc.b((rpeVar6.b == 1 ? (defpackage.rpc) rpeVar6.c : defpackage.rpc.a).b);
            if (rocVarB2 == null) {
                rocVarB2 = defpackage.roc.UNRECOGNIZED;
            }
            rqiVar.z.f(rocVarB2 != defpackage.roc.CALL_LOG_TAB_KEY);
            defpackage.alat alatVar = rpfVar.d;
            defpackage.aooh.e(alatVar, "getTabsInfoList(...)");
            java.util.Iterator<E> it5 = alatVar.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                rocVarB = defpackage.roc.b(((defpackage.rob) next).c);
                if (rocVarB == null) {
                    rocVarB = defpackage.roc.UNRECOGNIZED;
                }
            } while (rocVarB != rocVarB2);
            defpackage.rob robVar = (defpackage.rob) next;
            rqiVar.g(rocVarB2, robVar != null ? robVar.f : true);
        }
        defpackage.rpe rpeVar7 = rpfVar.f;
        if (rpeVar7 == null) {
            rpeVar7 = defpackage.rpe.a;
        }
        defpackage.aooh.e(rpeVar7, "getSelectedUiType(...)");
        defpackage.rpv rpvVar3 = rqiVar.b;
        android.view.View viewN = rpvVar3.N();
        int iX2 = defpackage.a.X(rpeVar7.b);
        int i3 = iX2 - 1;
        if (iX2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            int i4 = defpackage.dzs.a;
            java.lang.Object objB = defpackage.dzo.b(viewN, 2131428496);
            defpackage.aooh.e(objB, "requireViewById(...)");
            ((android.view.View) objB).setVisibility(0);
            java.lang.Object objB2 = defpackage.dzo.b(viewN, 2131428892);
            defpackage.aooh.e(objB2, "requireViewById(...)");
            ((android.view.View) objB2).setVisibility(8);
            java.lang.Object objB3 = defpackage.dzo.b(viewN, 2131427930);
            defpackage.aooh.e(objB3, "requireViewById(...)");
            ((android.view.View) objB3).setVisibility(8);
        } else if (i3 == 1) {
            int i5 = defpackage.dzs.a;
            java.lang.Object objB4 = defpackage.dzo.b(viewN, 2131428496);
            defpackage.aooh.e(objB4, "requireViewById(...)");
            ((android.view.View) objB4).setVisibility(8);
            java.lang.Object objB5 = defpackage.dzo.b(viewN, 2131428892);
            defpackage.aooh.e(objB5, "requireViewById(...)");
            ((android.view.View) objB5).setVisibility(0);
            java.lang.Object objB6 = defpackage.dzo.b(viewN, 2131427930);
            defpackage.aooh.e(objB6, "requireViewById(...)");
            ((android.view.View) objB6).setVisibility(8);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    throw new java.lang.IllegalStateException(str);
                }
                throw new defpackage.aois();
            }
            int i6 = defpackage.dzs.a;
            java.lang.Object objB7 = defpackage.dzo.b(viewN, 2131428496);
            defpackage.aooh.e(objB7, "requireViewById(...)");
            ((android.view.View) objB7).setVisibility(8);
            java.lang.Object objB8 = defpackage.dzo.b(viewN, 2131428892);
            defpackage.aooh.e(objB8, "requireViewById(...)");
            ((android.view.View) objB8).setVisibility(8);
            java.lang.Object objB9 = defpackage.dzo.b(viewN, 2131427930);
            defpackage.aooh.e(objB9, "requireViewById(...)");
            ((android.view.View) objB9).setVisibility(0);
        }
        defpackage.alat<defpackage.rny> alatVar2 = rpfVar.h;
        defpackage.aooh.e(alatVar2, "getNavMenuItemsList(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(alatVar2, 10));
        for (defpackage.rny rnyVar : alatVar2) {
            switch (rnyVar.b) {
                case 0:
                    rnzVar = defpackage.rnz.UNKNOWN_NAV_MENU_ITEM_KEY;
                    break;
                case 1:
                    rnzVar = defpackage.rnz.CONTACTS_NAV_MENU_KEY;
                    break;
                case 2:
                    rnzVar = defpackage.rnz.SETTINGS_NAV_MENU_KEY;
                    break;
                case 3:
                    rnzVar = defpackage.rnz.CLEAR_CALL_HISTORY_NAV_MENU_KEY;
                    break;
                case 4:
                    rnzVar = defpackage.rnz.CALL_HISTORY_NAV_MENU_KEY;
                    break;
                case 5:
                    rnzVar = defpackage.rnz.CALL_DIAGNOSTICS_NAV_MENU_KEY;
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    rnzVar = defpackage.rnz.HELP_AND_FEEDBACK_NAV_MENU_KEY;
                    break;
                default:
                    rnzVar = null;
                    break;
            }
            if (rnzVar == null) {
                rnzVar = defpackage.rnz.UNRECOGNIZED;
            }
            arrayList3.add(new defpackage.aoiu(rnzVar, rnyVar));
        }
        rqiVar.q = arrayList3;
        if (rqiVar.p) {
            rqiVar.d();
        }
        defpackage.rpe rpeVar8 = rpfVar.f;
        if (rpeVar8 == null) {
            rpeVar8 = defpackage.rpe.a;
        }
        if (rpeVar8.b == 1) {
            defpackage.afwx afwxVarB = rqiVar.b(rpvVar3.N());
            for (defpackage.rob robVar2 : rpfVar.d) {
                defpackage.roc rocVarB3 = defpackage.roc.b(robVar2.c);
                if (rocVarB3 == null) {
                    rocVarB3 = defpackage.roc.UNRECOGNIZED;
                }
                boolean z = robVar2.d;
                android.view.MenuItem menuItemFindItem = afwxVarB.a.findItem(rqiVar.a(rocVarB3));
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible(z);
                }
            }
            defpackage.alat alatVar3 = rpfVar.d;
            defpackage.aooh.e(alatVar3, "getTabsInfoList(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : alatVar3) {
                defpackage.rob robVar3 = (defpackage.rob) obj2;
                defpackage.roc rocVarB4 = defpackage.roc.b(robVar3.c);
                if (rocVarB4 == null) {
                    rocVarB4 = defpackage.roc.UNRECOGNIZED;
                }
                if (rocVarB4 == defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY && robVar3.d) {
                    arrayList4.add(obj2);
                }
            }
            if (defpackage.ajsz.ci(arrayList4)) {
                rqiVar.h.n(defpackage.rmw.MAIN_VVM_TAB_VISIBLE);
            }
            defpackage.rpe rpeVar9 = rpfVar.f;
            if (rpeVar9 == null) {
                rpeVar9 = defpackage.rpe.a;
            }
            defpackage.roc rocVarB5 = defpackage.roc.b((rpeVar9.b == 1 ? (defpackage.rpc) rpeVar9.c : defpackage.rpc.a).b);
            if (rocVarB5 == null) {
                rocVarB5 = defpackage.roc.UNRECOGNIZED;
            }
            rqiVar.b(rpvVar3.N()).a.findItem(rqiVar.a(rocVarB5)).setChecked(true);
            defpackage.afwx afwxVarB2 = rqiVar.b(rpvVar3.N());
            for (defpackage.rob robVar4 : rpfVar.d) {
                defpackage.roc rocVarB6 = defpackage.roc.b(robVar4.c);
                if (rocVarB6 == null) {
                    rocVarB6 = defpackage.roc.UNRECOGNIZED;
                }
                int i7 = robVar4.e;
                if (i7 < 0) {
                    java.lang.String str6 = java.lang.String.format("badgeNumber of %s is negative", java.util.Arrays.copyOf(new java.lang.Object[]{rocVarB6.name()}, 1));
                    defpackage.aooh.e(str6, "format(...)");
                    throw new java.lang.IllegalStateException(str6);
                }
                if (i7 == 0) {
                    int iA = rqiVar.a(rocVarB6);
                    defpackage.afwq afwqVar = afwxVarB2.b;
                    defpackage.afwm afwmVarE = afwqVar.e(iA);
                    if (afwmVarE != null) {
                        afwmVarE.d();
                    }
                    afwqVar.q.put(iA, null);
                } else {
                    int iA2 = rqiVar.a(rocVarB6);
                    defpackage.afwq afwqVar2 = afwxVarB2.b;
                    android.util.SparseArray sparseArray = afwqVar2.q;
                    defpackage.afpu afpuVar = (defpackage.afpu) sparseArray.get(iA2);
                    if (afpuVar == null) {
                        defpackage.afpu afpuVar2 = new defpackage.afpu(afwqVar2.getContext(), null);
                        sparseArray.put(iA2, afpuVar2);
                        afpuVar = afpuVar2;
                    }
                    defpackage.afwm afwmVarE2 = afwqVar2.e(iA2);
                    if (afwmVarE2 != null) {
                        afwmVarE2.q(afpuVar);
                    }
                    int iC = defpackage.urg.c(afwxVarB2.getContext(), 2130969113);
                    afpv afpvVar = afpuVar.c;
                    com.google.android.material.badge.BadgeState.State state = afpvVar.a;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
                    state.b = numValueOf;
                    com.google.android.material.badge.BadgeState.State state2 = afpvVar.b;
                    state2.b = numValueOf;
                    afpuVar.e();
                    int iC2 = defpackage.urg.c(afwxVarB2.getContext(), 2130969054);
                    if (afpuVar.b.a.getColor() != iC2) {
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iC2);
                        state.c = numValueOf2;
                        state2.c = numValueOf2;
                        afpuVar.g();
                    }
                    int iMax = java.lang.Math.max(0, i7);
                    if (afpvVar.h() != iMax) {
                        state.k = iMax;
                        state2.k = iMax;
                        if (!afpuVar.l()) {
                            afpuVar.f();
                        }
                    }
                }
            }
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "updateMenuInFragment", 1105, "MainFragmentPeer.kt")).v("updating search menu in the SearchBarFragment");
        java.lang.Object objB10 = defpackage.dzo.b(rpvVar3.N(), 2131428885);
        defpackage.aooh.e(objB10, "requireViewById(...)");
        android.view.Menu menuF = ((com.google.android.material.search.SearchBar) objB10).f();
        if (menuF == null) {
            defpackage.aooh.g();
        }
        if (menuF.size() == 0) {
            java.lang.Object objB11 = defpackage.dzo.b(rpvVar3.N(), 2131428885);
            defpackage.aooh.e(objB11, "requireViewById(...)");
            com.google.android.material.search.SearchBar searchBar = (com.google.android.material.search.SearchBar) objB11;
            searchBar.f().clear();
            java.util.Map map = rqiVar.i;
            java.util.TreeMap treeMap = new java.util.TreeMap(new defpackage.beg(10));
            treeMap.putAll(map);
            java.util.ArrayList<defpackage.rql> arrayList5 = new java.util.ArrayList(treeMap.size());
            java.util.Iterator it6 = treeMap.entrySet().iterator();
            while (it6.hasNext()) {
                arrayList5.add((defpackage.rql) ((java.util.Map.Entry) it6.next()).getValue());
            }
            for (defpackage.rql rqlVar : arrayList5) {
                searchBar.o(2131755023);
                android.view.MenuItem menuItemFindItem2 = searchBar.f().findItem(2131427429);
                defpackage.aooh.e(menuItemFindItem2, "findItem(...)");
                if (menuItemFindItem2 == null) {
                    defpackage.aooh.i("menuItem");
                }
            }
            final defpackage.ahda ahdaVar = rqiVar.G;
            final defpackage.lv lvVar = new defpackage.lv() { // from class: rpy
                @Override // defpackage.lv
                public final boolean a(android.view.MenuItem menuItem) {
                    java.lang.Object next2;
                    defpackage.aikj aikjVar = (defpackage.aikj) rqiVar.i;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(aikjVar.d);
                    defpackage.ailj it7 = ((defpackage.aikg) aikjVar.entrySet()).iterator();
                    while (it7.hasNext()) {
                        arrayList6.add((defpackage.rql) ((java.util.Map.Entry) it7.next()).getValue());
                    }
                    java.util.Iterator it8 = arrayList6.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it8.next();
                    } while (((defpackage.fv) menuItem).a != 2131427429);
                    defpackage.rql rqlVar2 = (defpackage.rql) next2;
                    if (rqlVar2 == null) {
                        return false;
                    }
                    rqlVar2.a();
                    return true;
                }
            };
            searchBar.u = new defpackage.lv() { // from class: ahsp
                public final /* synthetic */ java.lang.String a = "clicked search bar menu item";

                @Override // defpackage.lv
                public final boolean a(android.view.MenuItem menuItem) {
                    defpackage.ahok ahokVarF = ((defpackage.ahpz) ahdaVar.a).f(1479, this.a);
                    try {
                        boolean zA = lvVar.a(menuItem);
                        ahokVarF.close();
                        return zA;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahokVarF.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
        }
        java.util.Set setCf = defpackage.ajsz.cf(new defpackage.alam(rpfVar.g, defpackage.rpf.a));
        defpackage.ailj it7 = ((defpackage.aikg) ((defpackage.aikj) rqiVar.i).entrySet()).iterator();
        while (it7.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
            defpackage.rnx rnxVar = (defpackage.rnx) entry.getKey();
            menuF.findItem(2131427429).setVisible(setCf.contains(rnxVar));
        }
        rqiVar.n = true;
        defpackage.dwn dwnVar = rqiVar.r;
        if (dwnVar != null) {
            rqiVar.c(rpvVar3.N(), dwnVar);
        }
    }

    @Override // defpackage.agye
    public final /* synthetic */ void c() {
    }
}
