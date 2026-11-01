package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klc extends kh {
    private static final aimz n = aimz.i("com/android/dialer/calllog/ui/CallLogAdapter");
    private final ahbv A;
    private final defpackage.ni B;
    private final rai C;
    public final rlv a;
    public final defpackage.kmf e;
    public defpackage.kdf f;
    public final java.util.Map g;
    public int h;
    public final zzx i;
    public final zjm j;
    public final qqo k;
    public final zzx l;
    public final defpackage.hsj m;
    private final tec o;
    private final aoin p;
    private final nwu q;
    private final ruc r;
    private final az s;
    private final aw t;
    private java.util.List u;
    private final aoir v;
    private final aoir w;
    private final aoir x;
    private final defpackage.acu y;
    private final ahda z;

    public klc(ahbv ahbvVar, defpackage.ni niVar, rai raiVar, tec tecVar, aoin aoinVar, zzx zzxVar, rlv rlvVar, nwu nwuVar, ruc rucVar, zzx zzxVar2, zjm zjmVar, ahda ahdaVar, az azVar, aw awVar, defpackage.kmf kmfVar, defpackage.kdf kdfVar, defpackage.hsj hsjVar) {
        aooh.f(niVar, "callLogFragmentRetainedState");
        aooh.f(raiVar, "conversationHistoryViewHolderFactory");
        aooh.f(aoinVar, "enableFlippablesRecentTab");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(rucVar, "metrics");
        aooh.f(awVar, "fragment");
        aooh.f(kmfVar, "dropdownMenuAnimator");
        aooh.f(hsjVar, "realtimeRowProcessor");
        this.A = ahbvVar;
        this.B = niVar;
        this.C = raiVar;
        this.o = tecVar;
        this.p = aoinVar;
        this.l = zzxVar;
        this.a = rlvVar;
        this.q = nwuVar;
        this.r = rucVar;
        this.i = zzxVar2;
        this.j = zjmVar;
        this.z = ahdaVar;
        this.s = azVar;
        this.t = awVar;
        this.e = kmfVar;
        this.f = kdfVar;
        this.m = hsjVar;
        this.k = new qqo();
        this.g = new java.util.LinkedHashMap();
        this.y = new defpackage.acu(6);
        this.v = aooc.ah(3, new defpackage.kgq(this, 2));
        this.w = aooc.ah(3, new defpackage.kgq(this, 3));
        this.x = aooc.ah(3, new defpackage.kgq(this, 4));
        x(this.f);
        r(true);
    }

    private final ld A(aenj aenjVar, int i, android.view.ViewGroup viewGroup) {
        ruc rucVar = this.r;
        rucVar.j(aenjVar);
        android.view.View viewInflate = android.view.LayoutInflater.from(this.t.z()).inflate(i, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        hir hirVar = (hir) this.C.a;
        defpackage.him himVar = hirVar.a;
        aeqx aeqxVarMy = himVar.my();
        defpackage.hip hipVar = himVar.a;
        defpackage.kol kolVar = (defpackage.kol) hipVar.hY.a();
        amyz amyzVar = hipVar.dk;
        tkl tklVarOx = himVar.ox();
        kdd kddVar = (kdd) amyzVar.a();
        rsr rsrVar = (rsr) hipVar.hZ.a();
        gpd gpdVar = (gpd) himVar.fD.a();
        tec tecVarK = hipVar.K();
        amyz amyzVar2 = himVar.Fx;
        zjm zjmVarMZ = himVar.mZ();
        ops opsVar = (ops) himVar.BM.a();
        defpackage.hip.bZ();
        defpackage.kma kmaVar = new defpackage.kma(aeqxVarMy, kolVar, tklVarOx, kddVar, rsrVar, gpdVar, tecVarK, amyzVar2, zjmVarMZ, opsVar, (rlv) himVar.fq.a(), (sou) himVar.vr.a(), himVar.jC(), (ssq) himVar.qE.a(), new rsr(new zzx(hirVar.b.m)), (ahpz) himVar.bb.a(), himVar.oN(), (ajcu) himVar.aN.a(), this.s, this, viewInflate);
        rucVar.m(aenjVar);
        return kmaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    private final kgc B() {
        ?? r3;
        java.lang.Object next;
        java.lang.Object obj;
        j$.util.Optional optional = this.f.d;
        aooh.e(optional, "getFilterState(...)");
        defpackage.kgo kgoVar = (defpackage.kgo) aooh.q(optional);
        if (kgoVar != null) {
            obj = kgoVar.c;
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = obj;
            return null;
        }
        r3 = obj;
        java.util.Iterator it = r3.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((defpackage.kgb) next).b);
        defpackage.kgb kgbVar = (defpackage.kgb) next;
        if (kgbVar != null) {
            return kgbVar.a;
        }
        return null;
    }

    private final java.util.List C() {
        return (java.util.List) this.x.a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    private final void D(com.google.android.material.card.MaterialCardView materialCardView, int i) {
        boolean z;
        boolean z2;
        if (materialCardView != null) {
            java.util.List list = null;
            if (i == 0) {
                z = true;
            } else {
                java.util.List list2 = this.u;
                if (list2 == null) {
                    aooh.j("items");
                    list2 = null;
                }
                if (((defpackage.kmw) list2.get(i - 1)).b() >= 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (i != a() - 1) {
                java.util.List list3 = this.u;
                if (list3 == null) {
                    aooh.j("items");
                } else {
                    list = list3;
                }
                z2 = ((defpackage.kmw) list.get(i + 1)).b() < 0;
            }
            this.A.C(materialCardView, new defpackage.inx(z, z2));
            if (G()) {
                boolean zIsActivated = materialCardView.isActivated();
                az azVar = this.s;
                if (zIsActivated) {
                    materialCardView.c(dwm.h(urg.c(azVar, 2130969114), 40));
                } else {
                    materialCardView.c(urg.c(azVar, 2130969011));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
    private final void E(aenj aenjVar, defpackage.kdc kdcVar, ld ldVar, int i) {
        ajcq ajcqVarO;
        ruc rucVar = this.r;
        rucVar.j(aenjVar);
        kiu kiuVar = kdcVar.a;
        this.y.c(kiuVar.d, i);
        aooh.d(ldVar, "null cannot be cast to non-null type com.android.dialer.calllog.ui.ConversationHistoryViewHolder");
        defpackage.kma kmaVar = (defpackage.kma) ldVar;
        aigf aigfVar = this.f.c;
        java.lang.Long lValueOf = java.lang.Long.valueOf(kiuVar.d);
        wgi wgiVar = wgi.a;
        wgi wgiVarG = (wgi) aigfVar.getOrDefault(lValueOf, wgiVar);
        if (wgiVarG == null) {
            wgiVarG = wsc.ac(wgiVar.m()).g();
        }
        java.util.Map map = this.g;
        java.lang.Boolean boolValueOf = (java.lang.Boolean) map.get(kiuVar.m);
        if (boolValueOf == null) {
            n.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "isDuoAccount", 541, "CallLogAdapter.kt").v("No isDuoAccount found in cache, inserting");
            boolValueOf = java.lang.Boolean.valueOf(this.q.m(kiuVar.m, kiuVar.n));
            map.put(kiuVar.m, boolValueOf);
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        alad aladVarP = z().p();
        aooh.e(aladVarP, "build(...)");
        defpackage.knb knbVar = (defpackage.knb) aladVarP;
        aooh.f(kdcVar, "callLogUiModel");
        aooh.f(wgiVarG, "wifiCallingIconsConfig");
        aooh.f(knbVar, "savedPageState");
        kmaVar.D = kmaVar.u.a(kiuVar);
        kmaVar.G = wgiVarG;
        kmaVar.E = zBooleanValue;
        kmaVar.F = knbVar;
        if (kmaVar.J()) {
            com.google.android.material.card.MaterialCardView materialCardView = kmaVar.z;
            alad aladVarP2 = kmaVar.y.z().p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.kna knaVar = ((defpackage.knb) aladVarP2).c;
            if (knaVar == null) {
                knaVar = defpackage.kna.a;
            }
            kiu kiuVar2 = knaVar.c;
            if (kiuVar2 == null) {
                kiuVar2 = kiu.a;
            }
            materialCardView.setActivated(kiuVar2.d == kmaVar.E().d);
        }
        kmaVar.G();
        defpackage.hsj hsjVar = kmaVar.y.m;
        kiu kiuVarE = kmaVar.E();
        defpackage.hkd hkdVar = kiuVarE.f;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        spn spnVar = (spn) hsjVar.f.get(hkdVar);
        if (spnVar != null) {
            ajcqVarO = aiql.z(hsjVar.b(spnVar, kiuVarE));
        } else {
            ajcq ajcqVarC = ((sqo) hsjVar.a).c(hkdVar);
            java.lang.Object obj = hsjVar.c;
            java.lang.String str = hkdVar.c;
            aooh.f(str, "normalizedNumber");
            rsr rsrVar = (rsr) obj;
            ajcq ajcqVarH = ahvr.H(aosv.F((aoss) rsrVar.a, 0, new rka(rsrVar, str, (aoln) null, 17), 3), new defpackage.jvq(9), ajbm.a);
            ajcq ajcqVarC2 = ((srv) hsjVar.b).c(hkdVar);
            ajcqVarO = ahvr.ai(new ajcq[]{ajcqVarC, ajcqVarC2, ajcqVarH}).o(new defpackage.kxy(hsjVar, ajcqVarH, ajcqVarC, ajcqVarC2, kiuVarE, 1), (java.util.concurrent.Executor) hsjVar.d);
        }
        ahvr.J(ajcqVarO, new defpackage.kly(kmaVar, kmaVar.E()), kmaVar.w);
        dzs.j(ldVar.a, false);
        rucVar.m(aenjVar);
    }

    private final boolean F() {
        return ((java.lang.Boolean) this.p.a()).booleanValue() && this.o.a(this.s);
    }

    private final boolean G() {
        return rhx.b(this.s);
    }

    public final int a() {
        java.util.List list = this.u;
        if (list == null) {
            aooh.j("items");
            list = null;
        }
        return list.size();
    }

    public final int b(int i) {
        java.util.List list = this.u;
        if (list == null) {
            aooh.j("items");
            list = null;
        }
        return ((defpackage.kmw) list.get(i)).a();
    }

    public final long c(int i) {
        java.util.List list = this.u;
        if (list == null) {
            aooh.j("items");
            list = null;
        }
        return ((defpackage.kmw) list.get(i)).b();
    }

    public final ld d(android.view.ViewGroup viewGroup, int i) {
        if (i == -1000) {
            az azVar = this.s;
            int i2 = defpackage.kmj.v;
            android.view.View viewInflate = android.view.LayoutInflater.from(azVar).inflate(2131624246, viewGroup, false);
            aooh.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewInflate;
            frameLayout.setId(android.view.View.generateViewId());
            return new defpackage.kmj(frameLayout, azVar);
        }
        if (i == 2) {
            return A(ruc.bB, 2131624117, viewGroup);
        }
        if (i == 3) {
            return A(ruc.bE, 2131624118, viewGroup);
        }
        switch (i) {
            case -6:
                return new defpackage.kmi(new androidx.compose.ui.platform.ComposeView(this.s, (android.util.AttributeSet) null, 0, 6, (aooc) null), this.z);
            case -5:
                android.view.View viewInflate2 = android.view.LayoutInflater.from(this.s).inflate(2131624052, viewGroup, false);
                aooh.e(viewInflate2, "inflate(...)");
                return new ld(viewInflate2, (byte[]) null);
            case -4:
                if (((defpackage.hgt) this.v.a()) == null) {
                    throw new java.lang.IllegalStateException("should not be null");
                }
                android.content.Context contextZ = this.t.z();
                if (contextZ != null) {
                    return new defpackage.kmi(new androidx.compose.ui.platform.ComposeView(contextZ, (android.util.AttributeSet) null, 0, 6, (aooc) null));
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case -3:
            case -2:
            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                return new defpackage.aham(android.view.LayoutInflater.from(this.s).inflate(true != F() ? 2131624002 : 2131624055, viewGroup, false), null, null, null);
            default:
                throw new java.lang.UnsupportedOperationException(a.bj(i, "Unsupported view type: "));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void m(ld ldVar, int i) throws aois {
        aooh.f(ldVar, "viewHolder");
        this.h = (int) java.lang.Math.max(this.h, i);
        java.util.List list = this.u;
        if (list == null) {
            aooh.j("items");
            list = null;
        }
        defpackage.kmw kmwVar = (defpackage.kmw) list.get(i);
        int i2 = 10;
        j$.util.Objects.checkIndex(0, 10);
        if (kmwVar != null) {
            int i3 = 1;
            if (kmwVar instanceof defpackage.kmt) {
                ((defpackage.aham) ldVar).C(2132019466);
                dzs.j(ldVar.a, true);
                return;
            }
            if (kmwVar instanceof defpackage.kmu) {
                ((defpackage.aham) ldVar).C(2132019467);
                dzs.j(ldVar.a, true);
                return;
            }
            if (kmwVar instanceof defpackage.kms) {
                ((defpackage.aham) ldVar).C(2132019465);
                dzs.j(ldVar.a, true);
                return;
            }
            if (kmwVar instanceof defpackage.kmr) {
                ((defpackage.kmj) ldVar).u = (defpackage.kmr) kmwVar;
                return;
            }
            if (kmwVar instanceof defpackage.kmm) {
                E(ruc.bz, ((defpackage.kmm) kmwVar).a, ldVar, i);
                android.view.View view = ldVar.a;
                D(view instanceof com.google.android.material.card.MaterialCardView ? (com.google.android.material.card.MaterialCardView) view : null, i);
                return;
            } else if (kmwVar instanceof defpackage.kmn) {
                E(ruc.bA, ((defpackage.kmn) kmwVar).a, ldVar, i);
                android.view.View view2 = ldVar.a;
                D(view2 instanceof com.google.android.material.card.MaterialCardView ? (com.google.android.material.card.MaterialCardView) view2 : null, i);
                return;
            } else if (kmwVar instanceof defpackage.kmq) {
                defpackage.kmi kmiVar = (defpackage.kmi) ldVar;
                kmiVar.s.a(new cja(1331490942, true, new defpackage.dqv((defpackage.kmq) kmwVar, kmiVar, i2)));
                return;
            } else {
                if (kmwVar instanceof defpackage.kmv) {
                    return;
                }
                if (kmwVar instanceof defpackage.kmo) {
                    defpackage.kmi kmiVar2 = (defpackage.kmi) ldVar;
                    kmiVar2.s.a(new cja(-531177960, true, new defpackage.kmh(kmiVar2, i3)));
                    return;
                }
            }
        }
        throw new aois();
    }

    public final void o(ld ldVar) {
        if (ldVar instanceof defpackage.kmj) {
            defpackage.kmj kmjVar = (defpackage.kmj) ldVar;
            defpackage.kmr kmrVar = kmjVar.u;
            if (kmrVar == null) {
                throw new java.lang.IllegalArgumentException("attachFragment must not be called before the data is bound");
            }
            az azVar = kmjVar.t;
            java.lang.String str = kmrVar.b;
            bo boVarA = azVar.a();
            java.lang.Object objE = boVarA.e(str);
            if (objE == null) {
                objE = kmrVar.a.a();
            }
            aw awVar = (aw) objE;
            android.view.View view = awVar.Q;
            if (!awVar.aG()) {
                if (azVar.isFinishing() || azVar.isChangingConfigurations() || azVar.a().ac()) {
                    return;
                }
                u uVar = new u(boVarA);
                uVar.q(kmjVar.s.getId(), awVar, str);
                uVar.c();
                return;
            }
            android.view.ViewParent parent = view != null ? view.getParent() : null;
            android.widget.FrameLayout frameLayout = kmjVar.s;
            if (aooh.n(parent, frameLayout)) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            android.view.ViewParent parent2 = view != null ? view.getParent() : null;
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            frameLayout.addView(view);
        }
    }

    public final void w() {
        this.k.a++;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    public final void x(defpackage.kdf kdfVar) {
        java.util.List listAY;
        kgc kgcVarB;
        kit kitVarB;
        int iOrdinal;
        defpackage.kmw kmwVar;
        this.f = kdfVar;
        j$.util.Optional optional = kdfVar.d;
        aooh.e(optional, "getFilterState(...)");
        defpackage.kgo kgoVar = (defpackage.kgo) aooh.q(optional);
        ?? r2 = kgoVar != null ? kgoVar.c : 0;
        if (r2 != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r2, 10));
            for (defpackage.kgb kgbVar : r2) {
                arrayList.add(new defpackage.kmp(kgbVar.c, kgbVar.b, kgbVar.a));
            }
            listAY = ajsz.aY(new defpackage.kmq(arrayList));
        } else {
            listAY = aokc.a;
        }
        aimz aimzVar = n;
        aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "fragmentIntegrationsData", 253, "CallLogAdapter.kt").w("found %d fragment integrations", C().size());
        java.util.List listC = C();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listC, 10));
        int i = 0;
        for (java.util.Iterator it = listC.iterator(); it.hasNext(); it = it) {
            java.lang.Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ajsz.bh();
            }
            defpackage.kgt kgtVar = (defpackage.kgt) next;
            aooh.c(kgtVar);
            arrayList2.add(new defpackage.kmr(new defpackage.coo(kgtVar, 12, (float[][]) null), kgtVar.c(), (-1000) - ((long) i)));
            i = i2;
        }
        java.util.List<defpackage.kdc> listB = this.f.b();
        if (F()) {
            aooh.c(listB);
        } else {
            j$.util.Optional optional2 = this.f.d;
            aooh.e(optional2, "getFilterState(...)");
            defpackage.kgo kgoVar2 = (defpackage.kgo) aooh.q(optional2);
            if ((kgoVar2 != null ? kgoVar2.c : null) == null || (kgcVarB = B()) == null) {
                aooh.c(listB);
            } else {
                kfy kfyVar = (kfy) ((java.util.Map) this.w.a()).get(kgcVarB);
                if (kfyVar == null) {
                    throw new java.lang.IllegalStateException("must not be null");
                }
                aooh.c(listB);
                listB = kfyVar.b(listB);
            }
        }
        java.util.List arrayList3 = new java.util.ArrayList();
        boolean zF = F();
        int i3 = 0;
        for (defpackage.kdc kdcVar : listB) {
            int i4 = i3 + 1;
            if (i3 == 0) {
                kitVarB = kit.b(kdcVar.a.v);
                if (kitVarB == null) {
                    kitVarB = kit.a;
                }
                iOrdinal = kitVarB.ordinal();
                if (iOrdinal != 1) {
                    kmwVar = defpackage.kmt.a;
                } else if (iOrdinal != 2) {
                    kmwVar = defpackage.kmu.a;
                } else {
                    if (iOrdinal == 3) {
                        throw new java.lang.IllegalArgumentException("unsupported date group");
                    }
                    kmwVar = defpackage.kms.a;
                }
                arrayList3.add(kmwVar);
            } else {
                kit kitVarB2 = kit.b(kdcVar.a.v);
                if (kitVarB2 == null) {
                    kitVarB2 = kit.a;
                }
                kit kitVarB3 = kit.b(((defpackage.kdc) listB.get(i3 - 1)).a.v);
                if (kitVarB3 == null) {
                    kitVarB3 = kit.a;
                }
                if (kitVarB2 != kitVarB3) {
                    kitVarB = kit.b(kdcVar.a.v);
                    if (kitVarB == null) {
                        kitVarB = kit.a;
                    }
                    iOrdinal = kitVarB.ordinal();
                    if (iOrdinal != 1) {
                        kmwVar = defpackage.kmt.a;
                    } else if (iOrdinal != 2) {
                        kmwVar = defpackage.kmu.a;
                    } else {
                        if (iOrdinal == 3) {
                            throw new java.lang.IllegalArgumentException("unsupported date group");
                        }
                        kmwVar = defpackage.kms.a;
                    }
                    arrayList3.add(kmwVar);
                }
            }
            arrayList3.add(zF ? new defpackage.kmn(kdcVar) : new defpackage.kmm(kdcVar));
            i3 = i4;
        }
        aify aifyVarB = kdfVar.b();
        kgc kgcVarB2 = B();
        if (F()) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 150, "CallLogAdapter.kt").v("displaying only calls on the cover screen");
        } else if (kdfVar.e) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 156, "CallLogAdapter.kt").v("will display only filters and calls because it's the initial load");
            arrayList3 = ajsz.bT(listAY, arrayList3);
        } else if (aifyVarB.isEmpty()) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 164, "CallLogAdapter.kt").v("displaying filters, fragment integrations, and empty call log message/button");
            arrayList3 = ajsz.bU(ajsz.bT(listAY, arrayList2), defpackage.kmo.a);
        } else if (kgcVarB2 == null || kgcVarB2 == kgc.a) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 170, "CallLogAdapter.kt").v("displaying everything: filters, fragment integrations, and calls");
            arrayList3 = ajsz.bT(ajsz.bT(listAY, arrayList2), arrayList3);
        } else if (arrayList3.isEmpty()) {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 176, "CallLogAdapter.kt").v("displaying filters and empty calls result since no calls were found");
            arrayList3 = ajsz.bU(listAY, defpackage.kmv.a);
        } else {
            aimzVar.b().l("com/android/dialer/calllog/ui/CallLogAdapter", "setItems", 182, "CallLogAdapter.kt").v("displaying filters and selected calls");
            arrayList3 = ajsz.bT(listAY, arrayList3);
        }
        this.u = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [aonj, java.lang.Object] */
    public final void y(kiu kiuVar) {
        j$.util.Optional optionalEmpty;
        aooh.f(kiuVar, "coalescedRow");
        if (G()) {
            defpackage.kna knaVar = ((defpackage.knb) z().b).c;
            if (knaVar == null) {
                knaVar = defpackage.kna.a;
            }
            if ((knaVar.b & 2) != 0) {
                defpackage.kna knaVar2 = ((defpackage.knb) z().b).c;
                if (knaVar2 == null) {
                    knaVar2 = defpackage.kna.a;
                }
                kiu kiuVar2 = knaVar2.c;
                if (kiuVar2 == null) {
                    kiuVar2 = kiu.a;
                }
                aooh.e(kiuVar2, "getCoalescedRow(...)");
                defpackage.acu acuVar = this.y;
                int iA = acuVar.a(kiuVar2.d);
                optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(iA >= 0 ? acuVar.c[iA] : -1));
                aooh.e(optionalEmpty, "of(...)");
            } else {
                optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
            }
            defpackage.jrs jrsVar = new defpackage.jrs(new defpackage.jpi(this, 17), 19);
            if (true == optionalEmpty.isPresent()) {
                jrsVar.a.a(optionalEmpty.get());
            }
        }
        akzx akzxVarZ = z();
        akzx akzxVarM = defpackage.kna.a.m();
        akzxVarM.u();
        defpackage.kna knaVar3 = (defpackage.kna) akzxVarM.b;
        j$.util.Objects.requireNonNull(kiuVar);
        knaVar3.c = kiuVar;
        knaVar3.b |= 2;
        akzxVarZ.u();
        defpackage.knb knbVar = (defpackage.knb) akzxVarZ.b;
        defpackage.kna knaVar4 = (defpackage.kna) akzxVarM.p();
        defpackage.knb knbVar2 = defpackage.knb.a;
        j$.util.Objects.requireNonNull(knaVar4);
        knbVar.c = knaVar4;
        knbVar.b |= 1;
    }

    public final akzx z() {
        return (akzx) this.B.a;
    }
}
