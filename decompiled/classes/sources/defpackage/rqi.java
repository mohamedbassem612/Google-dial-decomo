package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/ui/MainFragmentPeer");
    public final defpackage.zjm A;
    public final defpackage.zjm B;
    public final defpackage.zjm C;
    public final defpackage.zzx D;
    public final defpackage.ajwr E;
    public final defpackage.zzx F;
    public final defpackage.ahda G;
    private final defpackage.gpd H;
    private final defpackage.ahda I;
    public final defpackage.rpv b;
    public final defpackage.rkg c;
    public final defpackage.rpj d;
    public final defpackage.agsm e;
    public final defpackage.agtj f;
    public final defpackage.ahpz g;
    public final defpackage.rlv h;
    public final java.util.Map i;
    public final defpackage.ruc j;
    public final defpackage.zjp k;
    public final defpackage.aoin l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public java.util.List q;
    public defpackage.dwn r;
    public final java.util.List s;
    public final defpackage.aigf t;
    public final defpackage.agye u;
    public final defpackage.rqf v;
    public final defpackage.rqg w;
    public final defpackage.rqa x;
    public final defpackage.rqb y;
    public final defpackage.rqd z;

    public rqi(defpackage.rpv rpvVar, defpackage.rkg rkgVar, defpackage.rpj rpjVar, defpackage.zjm zjmVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zjm zjmVar2, defpackage.zjm zjmVar3, defpackage.agsm agsmVar, defpackage.ajwr ajwrVar, defpackage.agtj agtjVar, defpackage.ahda ahdaVar, defpackage.ahpz ahpzVar, defpackage.ahda ahdaVar2, defpackage.rlv rlvVar, defpackage.gpd gpdVar, defpackage.ojo ojoVar, defpackage.zzx zzxVar3, java.util.Map map, defpackage.ruc rucVar, defpackage.zjp zjpVar, defpackage.aoin aoinVar) {
        if (rpjVar == null) {
            defpackage.aooh.i("mainFragmentDataService");
        }
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        if (ajwrVar == null) {
            defpackage.aooh.i("subscriptionMixin");
        }
        if (agtjVar == null) {
            defpackage.aooh.i("futuresMixin");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (zjpVar == null) {
            defpackage.aooh.i("cachedTelecomManager");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableChocolateChip");
        }
        this.b = rpvVar;
        this.c = rkgVar;
        this.d = rpjVar;
        this.A = zjmVar;
        this.F = zzxVar;
        this.B = zjmVar2;
        this.C = zjmVar3;
        this.e = agsmVar;
        this.E = ajwrVar;
        this.f = agtjVar;
        this.I = ahdaVar;
        this.g = ahpzVar;
        this.G = ahdaVar2;
        this.h = rlvVar;
        this.H = gpdVar;
        this.D = zzxVar3;
        this.i = map;
        this.j = rucVar;
        this.k = zjpVar;
        this.l = aoinVar;
        this.q = defpackage.aokc.a;
        java.util.Collection collectionValues = zzxVar.k().values();
        defpackage.aooh.e(collectionValues, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.rnv) ((defpackage.aoin) it.next()).a()).d());
        }
        this.s = arrayList;
        this.t = zzxVar2.k();
        this.u = new defpackage.rqh(this);
        this.v = new defpackage.rqf();
        this.w = new defpackage.rqg();
        this.x = new defpackage.rqa();
        this.y = new defpackage.rqb(this);
        this.z = new defpackage.rqd(this);
    }

    public static final void h(defpackage.bw bwVar, defpackage.aw awVar) {
        bwVar.j(awVar);
        bwVar.l(awVar, defpackage.emq.d);
    }

    public static final com.google.android.material.navigation.NavigationView i(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(2131428494);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        return (com.google.android.material.navigation.NavigationView) viewFindViewById;
    }

    public static final androidx.drawerlayout.widget.DrawerLayout j(android.view.View view) {
        int i = defpackage.dzs.a;
        java.lang.Object objB = defpackage.dzo.b(view, 2131428496);
        defpackage.aooh.e(objB, "requireViewById(...)");
        if (objB == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout");
        }
        return (androidx.drawerlayout.widget.DrawerLayout) objB;
    }

    private final defpackage.rnv k(defpackage.roc rocVar) {
        defpackage.rnv rnvVar;
        defpackage.aoin aoinVar = (defpackage.aoin) this.F.k().get(rocVar);
        if (aoinVar != null && (rnvVar = (defpackage.rnv) aoinVar.a()) != null) {
            return rnvVar;
        }
        java.lang.String str = java.lang.String.format("MainScreenFeatureProvider for tab %s is not provided", java.util.Arrays.copyOf(new java.lang.Object[]{rocVar.name()}, 1));
        defpackage.aooh.e(str, "format(...)");
        throw new java.util.NoSuchElementException(str);
    }

    private final java.lang.String l(defpackage.roc rocVar) {
        return k(rocVar).c();
    }

    private final void m(defpackage.afwx afwxVar, final defpackage.afwx afwxVar2) {
        if (afwxVar != null) {
            afwxVar.setVisibility(8);
        }
        afwxVar2.setVisibility(0);
        afwxVar2.d = new defpackage.ahsi(this.I, afwxVar2, new defpackage.afww() { // from class: rpx
            @Override // defpackage.afww
            public final void a(android.view.MenuItem menuItem) {
                defpackage.roc rocVar;
                defpackage.mce mceVar;
                int i = afwxVar2.b.f;
                defpackage.fv fvVar = (defpackage.fv) menuItem;
                int i2 = fvVar.a;
                if (i2 != i) {
                    defpackage.rqi rqiVar = this;
                    if (i2 == 2131429212) {
                        rocVar = defpackage.roc.CALL_LOG_TAB_KEY;
                    } else if (i2 == 2131429217) {
                        rocVar = defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY;
                    } else if (i2 == 2131429214) {
                        rocVar = defpackage.roc.DIALPAD_KEY;
                    } else {
                        if (!((java.lang.Boolean) rqiVar.l.a()).booleanValue() || i2 != 2131429213) {
                            java.lang.String str = java.lang.String.format("No such item as %s", java.util.Arrays.copyOf(new java.lang.Object[]{fvVar.d}, 1));
                            defpackage.aooh.e(str, "format(...)");
                            throw new java.lang.IllegalArgumentException(str);
                        }
                        rocVar = defpackage.roc.CHOCOLATE_CHIP_KEY;
                    }
                    ((defpackage.aimw) defpackage.rqi.a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "setUpNavigationBarItemSelectedListener$<anonymous>", 617, "MainFragmentPeer.kt")).y("selected %s tab in the bottom navigation bar", rocVar);
                    defpackage.roc rocVar2 = defpackage.roc.CALL_LOG_TAB_KEY;
                    if (rocVar == rocVar2) {
                        rqiVar.h.n(defpackage.rmw.MAIN_SWITCH_TAB_TO_CALL_LOG);
                    } else if (rocVar == defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY) {
                        rqiVar.h.n(defpackage.rmw.MAIN_SWITCH_TAB_TO_VOICEMAIL);
                    } else if (rocVar == defpackage.roc.DIALPAD_KEY) {
                        rqiVar.h.o(defpackage.rmx.MAIN_SWITCH_TAB_TO_DIALPAD);
                    } else {
                        if (!((java.lang.Boolean) rqiVar.l.a()).booleanValue() || rocVar != defpackage.roc.CHOCOLATE_CHIP_KEY) {
                            java.lang.String str2 = java.lang.String.format("Invalid tab: %s", java.util.Arrays.copyOf(new java.lang.Object[]{rocVar.name()}, 1));
                            defpackage.aooh.e(str2, "format(...)");
                            throw new java.lang.IllegalArgumentException(str2);
                        }
                        rqiVar.h.n(defpackage.rmw.MAIN_SWITCH_TAB_TO_CONTACTS);
                    }
                    if (rocVar == rocVar2) {
                        mceVar = defpackage.mce.USER_CLICKED_RECENTS_ON_NAV_BAR;
                    } else if (rocVar == defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY) {
                        mceVar = defpackage.mce.USER_CLICKED_VOICEMAIL_ON_NAV_BAR;
                    } else if (rocVar == defpackage.roc.DIALPAD_KEY) {
                        mceVar = defpackage.mce.USER_CLICKED_DIALPAD_ON_NAV_BAR;
                    } else {
                        if (!((java.lang.Boolean) rqiVar.l.a()).booleanValue() || rocVar != defpackage.roc.CHOCOLATE_CHIP_KEY) {
                            java.lang.String str3 = java.lang.String.format("Invalid tab %s", java.util.Arrays.copyOf(new java.lang.Object[]{rocVar.name()}, 1));
                            defpackage.aooh.e(str3, "format(...)");
                            throw new java.lang.IllegalArgumentException(str3);
                        }
                        mceVar = defpackage.mce.USER_CLICKED_CONTACTS_ON_NAV_BAR;
                    }
                    rqiVar.e(mceVar);
                    rqiVar.f.i(zoe.N(rqiVar.d.b(rocVar)), rqiVar.v);
                }
            }
        });
    }

    public final int a(defpackage.roc rocVar) {
        if (rocVar == defpackage.roc.CALL_LOG_TAB_KEY) {
            return 2131429212;
        }
        if (rocVar == defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY) {
            return 2131429217;
        }
        if (rocVar == defpackage.roc.DIALPAD_KEY) {
            return 2131429214;
        }
        if (((java.lang.Boolean) this.l.a()).booleanValue() && rocVar == defpackage.roc.CHOCOLATE_CHIP_KEY) {
            return 2131429213;
        }
        java.lang.String str = java.lang.String.format("No such tab key as %s", java.util.Arrays.copyOf(new java.lang.Object[]{rocVar.name()}, 1));
        defpackage.aooh.e(str, "format(...)");
        throw new java.lang.IllegalArgumentException(str);
    }

    public final defpackage.afwx b(android.view.View view) {
        if (!this.c.c(this.b.H()) || view.findViewById(2131428574) == null) {
            int i = defpackage.dzs.a;
            java.lang.Object objB = defpackage.dzo.b(view, 2131428571);
            if (objB == null) {
                defpackage.aooh.g();
            }
            return (defpackage.afwx) objB;
        }
        int i2 = defpackage.dzs.a;
        java.lang.Object objB2 = defpackage.dzo.b(view, 2131428574);
        if (objB2 == null) {
            defpackage.aooh.g();
        }
        return (defpackage.afwx) objB2;
    }

    public final void c(android.view.View view, defpackage.dwn dwnVar) {
        boolean z = b(view) instanceof com.google.android.material.navigationrail.NavigationRailView;
        int i = defpackage.dzs.a;
        java.lang.Object objB = defpackage.dzo.b(view, 2131429215);
        defpackage.aooh.e(objB, "requireViewById(...)");
        android.view.View view2 = (android.view.View) objB;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        defpackage.az azVarG = this.b.G();
        android.view.View viewFindViewById = azVarG != null ? azVarG.findViewById(2131427422) : null;
        marginLayoutParams.topMargin = (viewFindViewById == null || viewFindViewById.getVisibility() != 0) ? dwnVar.c : 0;
        if (z) {
            marginLayoutParams.bottomMargin = dwnVar.e;
        }
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = dwnVar.d;
        view2.setLayoutParams(marginLayoutParams);
    }

    public final void d() {
        ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "inflateNavigationMenu", 983, "MainFragmentPeer.kt")).v("enter");
        this.p = true;
        defpackage.aful afulVar = i(this.b.N()).g;
        defpackage.aooh.e(afulVar, "getMenu(...)");
        afulVar.clear();
        for (defpackage.aoiu aoiuVar : this.q) {
            defpackage.rnz rnzVar = (defpackage.rnz) aoiuVar.a;
            defpackage.rny rnyVar = (defpackage.rny) aoiuVar.b;
            android.view.MenuItem menuItemAdd = afulVar.add(rnyVar.e);
            menuItemAdd.setTitle(rnyVar.c);
            menuItemAdd.setIcon(rnyVar.d);
            defpackage.aooh.c(menuItemAdd);
            int i = rnyVar.f;
            java.lang.String strName = rnzVar.name();
            if (i < 0) {
                throw new java.lang.IllegalStateException(defpackage.a.bk(strName, "badgeNumber of ", " is negative"));
            }
            menuItemAdd.setActionView(2131624317);
            if (i == 0) {
                android.view.View actionView = menuItemAdd.getActionView();
                if (actionView != null) {
                    actionView.setVisibility(8);
                }
            } else {
                android.view.View actionView2 = menuItemAdd.getActionView();
                if (actionView2 != null) {
                    ((android.widget.TextView) actionView2.findViewById(2131428519)).setText(java.lang.String.valueOf(i));
                }
                android.view.View actionView3 = menuItemAdd.getActionView();
                if (actionView3 != null) {
                    actionView3.setVisibility(0);
                }
            }
            menuItemAdd.setOnMenuItemClickListener(new ahps(this.g, new rpw(this, rnzVar, 0)));
        }
    }

    public final void e(defpackage.mce mceVar) {
        this.H.i(null).b(mceVar);
    }

    public final void f(android.view.View view) {
        ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "setUpNavigationBarView", 532, "MainFragmentPeer.kt")).v("enter");
        int i = defpackage.dzs.a;
        java.lang.Object objB = defpackage.dzo.b(view, 2131428571);
        defpackage.aooh.e(objB, "requireViewById(...)");
        defpackage.afwx afwxVar = (defpackage.afwx) objB;
        if (!this.c.c(this.b.H())) {
            android.view.View viewFindViewById = view.findViewById(2131428498);
            if (viewFindViewById != null) {
                android.view.ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                defpackage.dtv dtvVar = (defpackage.dtv) layoutParams;
                dtvVar.s = -1;
                dtvVar.t = 0;
                viewFindViewById.setLayoutParams(dtvVar);
            }
            m((defpackage.afwx) view.findViewById(2131428574), afwxVar);
            return;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(2131428575);
        if (viewStub != null) {
            android.view.View viewInflate = viewStub.inflate();
            if (viewInflate == null) {
                defpackage.aooh.h("null cannot be cast to non-null type com.google.android.material.navigation.NavigationBarView");
            }
            defpackage.afwx afwxVar2 = (defpackage.afwx) viewInflate;
            if (this.C.g().isPresent()) {
                defpackage.afwn afwnVar = afwxVar2.a;
                afwnVar.clear();
                defpackage.afwn afwnVar2 = afwxVar.a;
                int size = afwnVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    android.view.MenuItem item = afwnVar2.getItem(i2);
                    android.view.MenuItem menuItemC = afwnVar.c(item.getGroupId(), item.getItemId(), item.getOrder(), item.getTitle());
                    menuItemC.setIcon(item.getIcon());
                    menuItemC.setVisible(item.isVisible());
                    menuItemC.setEnabled(item.isEnabled());
                    menuItemC.setChecked(item.isChecked());
                    defpackage.fv fvVar = (defpackage.fv) menuItemC;
                    fvVar.a(rs$.ExternalSyntheticApiModelOutline0.m(item));
                    fvVar.b(rs$.ExternalSyntheticApiModelOutline0.m$1(item));
                }
            }
            java.lang.Object objB2 = defpackage.dzo.b(view, 2131428498);
            defpackage.aooh.e(objB2, "requireViewById(...)");
            android.view.View view2 = (android.view.View) objB2;
            android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            defpackage.dtv dtvVar2 = (defpackage.dtv) layoutParams2;
            dtvVar2.s = 2131428574;
            dtvVar2.t = -1;
            view2.setLayoutParams(dtvVar2);
        }
        defpackage.afwx afwxVar3 = (defpackage.afwx) view.findViewById(2131428574);
        if (afwxVar3 == null) {
            m(null, afwxVar);
        } else {
            m(afwxVar, afwxVar3);
            this.h.o(defpackage.rmx.DISPLAY_MAIN_ACTIVITY_AS_EMBEDDING);
        }
    }

    /* JADX WARN: Type inference failed for: r8v37, types: [boolean, int] */
    public final void g(defpackage.roc rocVar, boolean z) {
        defpackage.rmw rmwVar;
        android.view.View view;
        com.google.android.material.search.SearchView searchViewFindViewById;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "showMainScreen", 753, "MainFragmentPeer.kt")).y("showing main screen for selectedTab %s", rocVar);
        defpackage.rpv rpvVar = this.b;
        defpackage.aw awVarE = rpvVar.I().e(l(rocVar));
        if (awVarE == null) {
            awVarE = k(rocVar).a();
        }
        defpackage.zzx zzxVar = this.F;
        defpackage.aigf aigfVarK = zzxVar.k();
        defpackage.aooh.e(aigfVarK, "get(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : aigfVarK.entrySet()) {
            defpackage.aw awVarE2 = rpvVar.I().e(((defpackage.rnv) ((defpackage.aoin) entry.getValue()).a()).c());
            defpackage.aoiu aoiuVar = (awVarE2 == null || !awVarE2.aK()) ? null : new defpackage.aoiu(entry.getKey(), awVarE2);
            if (aoiuVar != null) {
                arrayList.add(aoiuVar);
            }
        }
        defpackage.aoiu aoiuVar2 = (defpackage.aoiu) (arrayList.isEmpty() ? null : arrayList.get(0));
        if (aoiuVar2 != null) {
            java.lang.Object obj = aoiuVar2.b;
            ?? CompareTo = ((defpackage.roc) aoiuVar2.a).compareTo(rocVar) >>> 31;
            ((defpackage.aw) obj).aw(new ageb((boolean) CompareTo));
            awVarE.av(new ageb((boolean) CompareTo));
            defpackage.aw awVarE3 = rpvVar.I().e("search_fragment_tag");
            if (awVarE3 != null) {
                awVarE3.aw(new ageb((boolean) CompareTo));
                awVarE3.av(new ageb((boolean) CompareTo));
            }
        }
        defpackage.aw awVarD = ((defpackage.rru) this.B.g().orElseThrow()).b.I().d(2131428892);
        if ((awVarD instanceof defpackage.rro) && (view = ((defpackage.rro) awVarD).Q) != null && (searchViewFindViewById = view.findViewById(2131428887)) != null) {
            searchViewFindViewById.e(false);
        }
        defpackage.u uVar = new defpackage.u(rpvVar.I());
        defpackage.aw awVarD2 = rpvVar.I().d(2131427930);
        if (awVarD2 != null) {
            uVar.k(awVarD2);
        }
        defpackage.aw awVarE4 = rpvVar.I().e("search_fragment_tag");
        if (awVarE4 == null) {
            awVarE4 = new defpackage.rqo();
            defpackage.amxr.g(awVarE4);
        }
        if (z) {
            uVar.m(awVarE4);
        } else {
            androidx.drawerlayout.widget.DrawerLayout drawerLayoutJ = j(rpvVar.N());
            if (drawerLayoutJ.s()) {
                drawerLayoutJ.p();
            }
            uVar.j(awVarE4);
        }
        defpackage.aigf aigfVarK2 = zzxVar.k();
        defpackage.aooh.e(aigfVarK2, "get(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : aigfVarK2.entrySet()) {
            if (entry2.getKey() != rocVar) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(((defpackage.rnv) ((defpackage.aoin) ((java.util.Map.Entry) it.next()).getValue()).a()).c());
        }
        for (java.lang.String str : arrayList2) {
            defpackage.aw awVarE5 = rpvVar.I().e(str);
            if (awVarE5 != null) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "hideUnselectedTabFragments$<anonymous>", 1156, "MainFragmentPeer.kt")).y("hiding fragment %s", str);
                h(uVar, awVarE5);
            }
        }
        java.lang.String strL = l(rocVar);
        defpackage.aw awVarE6 = rpvVar.I().e(strL);
        if (awVarE6 != null) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "showOrAdd", 1204, "MainFragmentPeer.kt")).y("show fragment %s", strL);
            defpackage.aw awVarE7 = rpvVar.I().e(strL);
            if (awVarE7 != null) {
                uVar.m(awVarE7);
                uVar.l(awVarE7, defpackage.emq.e);
            } else {
                uVar.e(2131429215, awVarE6, strL, 1);
            }
        } else {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "showOrAdd", 1209, "MainFragmentPeer.kt")).y("add fragment %s", strL);
            uVar.e(2131429215, awVarE, strL, 1);
        }
        uVar.s();
        defpackage.aw awVarD3 = rpvVar.I().d(2131428892);
        if (awVarD3 != null) {
            uVar.k(awVarD3);
        }
        uVar.c();
        if (this.m || this.n) {
            return;
        }
        if (rocVar == defpackage.roc.CALL_LOG_TAB_KEY) {
            rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_CALL_LOG;
        } else if (rocVar == defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY) {
            rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_VOICEMAIL;
        } else if (rocVar == defpackage.roc.DIALPAD_KEY) {
            rmwVar = null;
        } else {
            if (!((java.lang.Boolean) this.l.a()).booleanValue() || rocVar != defpackage.roc.CHOCOLATE_CHIP_KEY) {
                java.lang.String str2 = java.lang.String.format("Invalid tab: %s", java.util.Arrays.copyOf(new java.lang.Object[]{rocVar.name()}, 1));
                defpackage.aooh.e(str2, "format(...)");
                throw new java.lang.IllegalArgumentException(str2);
            }
            rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_CONTACTS;
        }
        if (rmwVar != null) {
            this.h.n(rmwVar);
        }
    }
}
