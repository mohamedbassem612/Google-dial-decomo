package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tkd extends aw implements android.view.View.OnTouchListener, epb {
    public static final aimz a = aimz.i("com/android/dialer/searchfragment/list/SearchFragment");
    private ajcq aD;
    private lpa aE;
    private lpa aF;
    private lpa aG;
    private defpackage.tjn aH;
    private zjm aJ;
    private zjm aK;
    private gpd aL;
    private ahbv aM;
    private acxg aN;
    public android.support.v7.widget.RecyclerView ak;
    public defpackage.tjv al;
    public java.lang.String am;
    public lpa ap;
    private defpackage.thu aq;
    private j$.util.Optional ar;
    private nwu as;
    private com.android.dialer.widget.emptycontentview.EmptyContentView at;
    private ajcq av;
    private long ax;
    private boolean ay;
    public rlv b;
    public ruc c;
    public defpackage.tja d;
    public android.view.inputmethod.InputMethodManager e;
    private java.lang.String au = "";
    private int aI = 1;
    private boolean aw = false;
    private j$.util.Optional az = j$.util.Optional.empty();
    private boolean aA = false;
    public j$.util.Optional an = j$.util.Optional.empty();
    public j$.util.Optional ao = j$.util.Optional.empty();
    private final java.util.List aB = new java.util.ArrayList();
    private final java.lang.Runnable aC = new defpackage.sxq(this, 13);

    private final aify aY() {
        android.content.Context contextZ = z();
        boolean z = false;
        boolean z2 = !android.text.TextUtils.isEmpty(this.au) && android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vwb.j(contextZ, this.au));
        boolean zT = t();
        if (zT && !z2) {
            z = true;
        }
        if (android.text.TextUtils.isEmpty(this.au) || this.au.length() == 1 || z) {
            return aike.a;
        }
        boolean zC = uyb.c(contextZ);
        a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "getActions", 961, "SearchFragment.java").M("isRegularSearch: %b, isImsVideoEnabled: %b, isDialableNumber: %b", java.lang.Boolean.valueOf(zT), java.lang.Boolean.valueOf(zC), java.lang.Boolean.valueOf(z2));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!zT) {
            arrayList.add(1);
            arrayList.add(2);
        } else if (z2) {
            arrayList.add(5);
        }
        if (zC) {
            arrayList.add(4);
        }
        arrayList.add(3);
        return aify.n(arrayList);
    }

    private final void aZ() {
        this.c.j(ruc.I);
    }

    private final void ba() {
        this.at.setVisibility(8);
        this.ak.setVisibility(0);
        this.aw = false;
        bb();
    }

    private final void bb() {
        epc.a(this).e(2, this);
    }

    private final void bc() {
        if (android.text.TextUtils.isEmpty(this.au)) {
            this.al.x(null);
        } else if (X() != null) {
            epc.a(this).f(3, this);
        }
    }

    private final void bd() {
        defpackage.amrg amrgVar;
        if (android.text.TextUtils.isEmpty(this.au)) {
            return;
        }
        ajcq ajcqVar = this.av;
        if (ajcqVar != null && !ajcqVar.isDone()) {
            this.av.cancel(true);
        }
        android.content.Context contextZ = z();
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final boolean z = this.aI == 3;
        final int length = this.au.length();
        boolean zT = t();
        defpackage.thu thuVar = this.aq;
        if (zT) {
            this.av = thuVar.a(this.au);
            amrgVar = defpackage.amrg.SEARCH_DATA_SOURCE_CONTACT_RETRIEVER;
        } else {
            this.av = thuVar.b(this.au);
            amrgVar = defpackage.amrg.SEARCH_DATA_SOURCE_SMARTDIAL_TABLE;
        }
        final defpackage.amrg amrgVar2 = amrgVar;
        this.aF.b(contextZ, this.av, new lot() { // from class: tjx
            public final void a(java.lang.Object obj) {
                final defpackage.tkd tkdVar = this.a;
                final long j = jElapsedRealtime;
                final int i = length;
                final defpackage.thv thvVar = (defpackage.thv) obj;
                final boolean z2 = z;
                final defpackage.amrg amrgVar3 = amrgVar2;
                tkdVar.G().runOnUiThread(new java.lang.Runnable() { // from class: tjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        defpackage.tkd tkdVar2 = tkdVar;
                        rlv rlvVar = tkdVar2.b;
                        akzx akzxVarM = amrh.a.m();
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j;
                        akzxVarM.u();
                        amrh amrhVar = akzxVarM.b;
                        amrhVar.b |= 2;
                        amrhVar.d = (int) jElapsedRealtime2;
                        akzxVarM.u();
                        amrh amrhVar2 = akzxVarM.b;
                        amrhVar2.b |= 1;
                        amrhVar2.c = i;
                        aify aifyVar = thvVar.a;
                        int i2 = ((aike) aifyVar).d;
                        akzxVarM.u();
                        amrh amrhVar3 = akzxVarM.b;
                        amrhVar3.b |= 4;
                        amrhVar3.e = i2;
                        akzxVarM.u();
                        amrh amrhVar4 = akzxVarM.b;
                        amrhVar4.b |= 16;
                        amrhVar4.g = z2;
                        akzxVarM.u();
                        amrh amrhVar5 = akzxVarM.b;
                        amrhVar5.h = amrgVar3.e;
                        amrhVar5.b |= 32;
                        akzxVarM.u();
                        amrh amrhVar6 = akzxVarM.b;
                        amrhVar6.b |= 8;
                        amrhVar6.f = false;
                        rlvVar.s(akzxVarM.p());
                        tkdVar2.c.m(ruc.I);
                        tkdVar2.al.C(aifyVar, 1);
                        if (aifyVar.isEmpty()) {
                            tkdVar2.s(j$.util.OptionalInt.empty());
                        } else {
                            tkdVar2.s(j$.util.OptionalInt.of(2132020316));
                        }
                    }
                });
            }
        }, new defpackage.taw(this, 7));
    }

    private final void be() {
        defpackage.thu thuVar;
        android.content.Context contextZ = z();
        if (!android.text.TextUtils.isEmpty(this.au) || contextZ == null || !zqz.a(contextZ, "android.permission.READ_CONTACTS")) {
            ajcq ajcqVar = this.aD;
            if (ajcqVar != null && !ajcqVar.isDone()) {
                this.aD.cancel(true);
            }
            this.al.C(aike.a, 2);
            return;
        }
        ajcq ajcqVar2 = this.aD;
        if ((ajcqVar2 == null || ajcqVar2.isDone()) && (thuVar = this.aq) != null) {
            ajcq ajcqVarC = thuVar.c();
            this.aD = ajcqVarC;
            this.aE.b(contextZ, ajcqVarC, new kll(this, 14), new defpackage.taw(this, 8));
        }
    }

    private final void bf(mce mceVar) {
        this.aL.i((java.lang.String) null).b(mceVar);
    }

    private final void bg() {
        ruc rucVar = this.c;
        if (rucVar != null) {
            rucVar.j(ruc.H);
        }
        this.ax = android.os.SystemClock.elapsedRealtime();
    }

    private final void bh() {
        this.at.g(2132019477);
        this.at.e(2132019755, new defpackage.szl(this, 6, (byte[]) null));
        this.at.f(2131951704);
        this.at.setVisibility(0);
        this.ak.setVisibility(8);
        this.aw = true;
        epc.a(this).b(2);
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate = layoutInflater.inflate(2131624257, viewGroup, false);
        if (bundle != null) {
            this.aA = bundle.getBoolean("previously_started_from_dial_intent", false);
            if (bundle.containsKey("key_time_keeper_saved_state")) {
                this.an = j$.util.Optional.of(bundle.getParcelable("key_time_keeper_saved_state"));
            }
        }
        android.content.Context contextZ = z();
        tkc tkcVarAg = snl.ag(contextZ);
        this.aq = tkcVarAg.ch();
        this.aL = tkcVarAg.nJ();
        this.b = tkcVarAg.bs();
        this.c = tkcVarAg.bu();
        this.aJ = tkcVarAg.mX();
        this.d = tkcVarAg.ci();
        this.ar = tkcVarAg.ne().g();
        this.aK = tkcVarAg.nc();
        this.aM = tkcVarAg.oM();
        this.aN = tkcVarAg.oW();
        tkcVarAg.je();
        this.as = tkcVarAg.aR();
        this.e = (android.view.inputmethod.InputMethodManager) contextZ.getSystemService("input_method");
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428897);
        this.ak = recyclerViewFindViewById;
        this.c.d(recyclerViewFindViewById, ruc.x);
        this.aH = new defpackage.tjn(new defpackage.aprf(this));
        this.d.e = !t();
        defpackage.tjv tjvVar = new defpackage.tjv(G(), new defpackage.tjw(), this, this.aH, this.d, tkcVarAg.jJ(), tkcVarAg.tC(), this.aM);
        this.al = tjvVar;
        tjvVar.y(this.au, this.am);
        this.al.z(aY());
        this.at = (com.android.dialer.widget.emptycontentview.EmptyContentView) viewInflate.findViewById(2131428112);
        this.ak.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        this.ak.Y(this.al);
        this.ak.setOnTouchListener(this);
        this.ak.au(new defpackage.tka(this));
        this.at.setOnTouchListener(this);
        this.aE = lpa.a(I(), "SearchFragment.suggestedContactsQueryLoading");
        this.aF = lpa.a(I(), "SearchFragment.enhancedSearchLoading");
        this.aG = lpa.a(I(), "SearchFragment.wifiCallingIconsConfigForNonDefaultCp2Loading");
        this.ap = lpa.a(I(), "SearchFragment.timeKeeperDetailsLoading");
        if (zqz.a(contextZ, "android.permission.READ_CONTACTS")) {
            bb();
        } else {
            bh();
        }
        if (bundle != null) {
            this.al.t(3);
            aW(bundle.getString("key_query"), hmr.e(bundle.getInt("key_call_initiation_type")));
            if (bundle.containsKey("key_expanded_position")) {
                this.az = j$.util.Optional.of(java.lang.Integer.valueOf(bundle.getInt("key_expanded_position")));
                this.aH.e(bundle.getInt("key_expanded_position"));
            }
            if (bundle.containsKey("key_rtt_configuration_cache")) {
                this.d.d = tcp.b(bundle.getInt("key_rtt_configuration_cache"));
            }
        }
        return viewInflate;
    }

    public final /* bridge */ /* synthetic */ void a(epl eplVar, java.lang.Object obj) {
        java.util.ArrayList arrayList;
        android.database.Cursor cursor = (android.database.Cursor) obj;
        a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "onLoadFinished", 431, "SearchFragment.java").y("Loader finished: %s", eplVar);
        if (cursor != null && !(eplVar instanceof defpackage.tij) && !(cursor instanceof defpackage.tht)) {
            throw new java.lang.IllegalStateException("Cursors must implement SearchCursor");
        }
        if (eplVar instanceof defpackage.thl) {
            this.c.o(ruc.A);
            this.al.w((defpackage.thk) cursor);
            return;
        }
        if (eplVar instanceof defpackage.tig) {
            this.c.o(ruc.z);
            this.al.x((defpackage.tif) cursor);
            return;
        }
        if (!(eplVar instanceof defpackage.tij)) {
            throw new java.lang.IllegalStateException("Invalid loader: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(eplVar))));
        }
        this.c.o(ruc.y);
        java.util.List list = this.aB;
        list.clear();
        aimz aimzVar = defpackage.tij.o;
        if (cursor == null) {
            defpackage.tij.o.b().l("com/android/dialer/searchfragment/cp2/extendeddirectories/DirectoryCursorLoader", "toDirectories", 91, "DirectoryCursorLoader.java").v("Cursor was null");
            arrayList = new java.util.ArrayList();
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                boolean z = false;
                long j = cursor.getInt(0);
                java.lang.String string = cursor.getString(1);
                if (cursor.getInt(2) != 0) {
                    z = true;
                }
                arrayList2.add(new defpackage.tii(j, string, z));
            }
            arrayList = arrayList2;
        }
        list.addAll(arrayList);
        bc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View$OnTouchListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, usa] */
    public final boolean aU(java.lang.String str) {
        if (str == null) {
            this.am = null;
            return false;
        }
        j$.util.Optional optionalG = this.aK.g();
        defpackage.qgz qgzVar = new defpackage.qgz(this, str, 12);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            ?? r2 = qgzVar.b;
            java.lang.Object obj2 = qgzVar.a;
            ucm ucmVar = (ucm) obj;
            defpackage.tkd tkdVar = (defpackage.tkd) r2;
            if (!j$.util.Objects.equals(tkdVar.am, obj2)) {
                tkdVar.f();
            }
            aw awVar = (aw) r2;
            com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) awVar.Q.findViewById(2131429282);
            com.android.dialer.timekeeper.histogram.HistogramView histogramView2 = histogramView;
            if (histogramView == null) {
                com.android.dialer.timekeeper.histogram.HistogramView histogramView3 = (com.android.dialer.timekeeper.histogram.HistogramView) ((android.view.ViewStub) awVar.Q.findViewById(2131429283)).inflate();
                histogramView3.setOnTouchListener(r2);
                histogramView2 = histogramView3;
            }
            java.lang.String str2 = (java.lang.String) obj2;
            int length = str2.replaceAll("[^0-9]", "").length();
            if (length == 10 || length == 11) {
                tkdVar.ap.b(awVar.z(), ucmVar.c.a(str2), new defpackage.tjz(tkdVar, histogramView2, ucmVar), new jox(20));
            } else {
                histogramView2.m(j$.util.Optional.empty(), (defpackage.vqu) ucmVar.a, (defpackage.abtr) ucmVar.b);
            }
        }
        boolean z = !j$.util.Objects.equals(this.am, str);
        this.am = str;
        return z;
    }

    public final void aV(java.lang.String str, int i, int i2, defpackage.abvz abvzVar, boolean z) {
        if (abvzVar != null && (abvzVar.b & 1) != 0) {
            java.lang.String str2 = abvzVar.c;
            if (this.aI == 3) {
                rmw rmwVar = rmw.jA;
                if (defpackage.ths.f(this.au, str2, z())) {
                    rmwVar = rmw.jz;
                }
                this.b.n(rmwVar);
            }
        }
        akzx akzxVarM = jxb.b.m();
        int i3 = this.aI;
        akzxVarM.u();
        jxb jxbVar = akzxVarM.b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        jxbVar.d = i4;
        jxbVar.c |= 1;
        akzxVarM.u();
        jxb jxbVar2 = akzxVarM.b;
        jxbVar2.c |= 2;
        jxbVar2.e = i;
        int length = this.au.length();
        akzxVarM.u();
        jxb jxbVar3 = akzxVarM.b;
        jxbVar3.c |= 4;
        jxbVar3.f = length;
        akzxVarM.u();
        jxb jxbVar4 = akzxVarM.b;
        jxbVar4.c |= 1024;
        jxbVar4.l = true;
        ruc rucVar = this.c;
        if (rucVar != null) {
            rucVar.m(ruc.H);
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.ax;
        akzxVarM.u();
        jxb jxbVar5 = akzxVarM.b;
        jxbVar5.c |= 2048;
        jxbVar5.m = jElapsedRealtime;
        akzxVarM.u();
        jxb jxbVar6 = akzxVarM.b;
        jxbVar6.c |= 131072;
        jxbVar6.s = z;
        jxb jxbVarP = akzxVarM.p();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(str);
        amdxVar.m(jxbVarP);
        amdxVar.l(true);
        amdxVar.o(abvzVar);
        if (i2 == 3) {
            amdxVar.q(true);
        } else if (i2 == 2) {
            amdxVar.p(true);
        }
        this.aN.w((defpackage.zrx) amdxVar.a);
        ahvr.i(new defpackage.tjr(), this);
    }

    final void aW(java.lang.String str, int i) {
        defpackage.tjn tjnVar = this.aH;
        if (tjnVar != null) {
            tjnVar.b();
            tjnVar.c = j$.util.OptionalInt.empty();
            tjnVar.e = j$.util.Optional.empty();
            tjnVar.a = null;
            tjnVar.b = null;
        }
        if (i == 7) {
            aU(null);
        }
        this.au = str;
        this.aI = i;
        defpackage.tjv tjvVar = this.al;
        if (tjvVar == null || z() == null) {
            return;
        }
        tjvVar.y(str, this.am);
        this.al.z(aY());
        be();
        aZ();
        bd();
        if (android.text.TextUtils.isEmpty(this.au)) {
            this.al.w(null);
        } else if (X() != null) {
            epc.a(this).f(4, this);
        }
        bc();
    }

    public final void aX(java.lang.String str, int i, boolean z) {
        boolean z2 = this.ay;
        java.lang.String str2 = this.au;
        if (z2) {
            if (str2.equals(str) && !z && this.aI == i && i == 3) {
                return;
            }
        } else if (!str2.isEmpty() || this.az.isPresent()) {
            return;
        }
        aW(str, i);
    }

    public final void ai() {
        super.ai();
        mni.cw().removeCallbacks(this.aC);
    }

    public final void aj(boolean z) {
        if (G() == null) {
            a.bI(a.d(), "null activity", "com/android/dialer/searchfragment/list/SearchFragment", "onHiddenChanged", (char) 851, "SearchFragment.java", zct.b);
            return;
        }
        if (z) {
            return;
        }
        bg();
        boolean zA = zqz.a(z(), "android.permission.READ_CONTACTS");
        boolean z2 = this.aw;
        if (zA) {
            if (z2) {
                ba();
            }
            be();
        } else if (!z2) {
            bh();
        }
        if (!zA) {
            return;
        }
        be();
    }

    public final void am(int i, java.lang.String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            be();
            ba();
        }
    }

    public final void an() {
        super.an();
        boolean z = true;
        this.ay = true;
        bg();
        android.content.Intent intent = G().getIntent();
        if (!this.aA && ((intent == null || !"android.intent.action.DIAL".equals(intent.getAction())) && !"android.intent.action.VIEW".equals(intent.getAction()))) {
            z = false;
        }
        this.aA = z;
        j$.util.Optional optionalG = this.aJ.g();
        if (optionalG.isPresent()) {
            lpa.a(I(), "SearchFragment.rttConfigurationLoading").b(z(), ((tcv) ((aogc) optionalG.orElseThrow()).a).a(), new kll(this, 16), new defpackage.taw(this, 6));
        } else {
            this.d.d = tcp.e;
        }
        if (this.ar.isPresent()) {
            this.aG.b(z(), ((zzx) this.ar.orElseThrow()).r(), new kll(this, 15), new jox(19));
        }
        aZ();
        bd();
    }

    public final void b(epl eplVar) {
        a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "onLoaderReset", 459, "SearchFragment.java").y("Loader reset: %s", eplVar);
        if (eplVar instanceof defpackage.thl) {
            this.al.w(null);
        } else if (eplVar instanceof defpackage.tig) {
            this.al.x(null);
        }
    }

    public final /* bridge */ /* synthetic */ epl c(int i) {
        a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "onCreateLoader", 409, "SearchFragment.java").w("loading cursor: %d", i);
        android.content.Context contextZ = z();
        if (i == 4) {
            this.c.k(ruc.A);
            return new defpackage.thl(contextZ, this.au);
        }
        if (i == 2) {
            this.c.k(ruc.y);
            return new defpackage.tij(contextZ);
        }
        if (i != 3) {
            throw new java.lang.IllegalStateException(a.bj(i, "Invalid loader id: "));
        }
        this.c.k(ruc.z);
        return new defpackage.tig(contextZ, this.au, this.aB, snl.ag(contextZ).aZ());
    }

    public final void f() {
        com.android.dialer.timekeeper.histogram.HistogramView histogramView = (com.android.dialer.timekeeper.histogram.HistogramView) ((aw) this).Q.findViewById(2131429282);
        if (histogramView == null || histogramView.getVisibility() != 0) {
            return;
        }
        j$.util.Optional optionalG = this.aK.g();
        defpackage.qgz qgzVar = new defpackage.qgz(this, histogramView, 10);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            java.lang.Object obj2 = qgzVar.b;
            java.lang.Object obj3 = qgzVar.a;
            java.lang.Object obj4 = ((ucm) obj).b;
            java.lang.String str = ((defpackage.tkd) obj2).am;
            akzx akzxVarM = defpackage.usb.a.m();
            com.android.dialer.timekeeper.histogram.HistogramView histogramView2 = (com.android.dialer.timekeeper.histogram.HistogramView) obj3;
            int iS = histogramView2.u.isPresent() ? ((defpackage.abtr) histogramView2.u.orElseThrow()).s(2) : 0;
            akzxVarM.u();
            defpackage.usb usbVar = (defpackage.usb) akzxVarM.b;
            usbVar.b |= 4;
            usbVar.e = iS;
            int iS2 = histogramView2.u.isPresent() ? ((defpackage.abtr) histogramView2.u.orElseThrow()).s(3) : 0;
            akzxVarM.u();
            defpackage.usb usbVar2 = (defpackage.usb) akzxVarM.b;
            usbVar2.b |= 8;
            usbVar2.f = iS2;
            int iS3 = histogramView2.u.isPresent() ? ((defpackage.abtr) histogramView2.u.orElseThrow()).s(4) : 0;
            akzxVarM.u();
            defpackage.usb usbVar3 = (defpackage.usb) akzxVarM.b;
            usbVar3.b |= 16;
            usbVar3.g = iS3;
            ((defpackage.abtr) obj4).u(5, str, (defpackage.usb) akzxVarM.p());
        }
    }

    public final void k(android.os.Bundle bundle) {
        int i = this.aI;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("key_call_initiation_type", i2);
        bundle.putString("key_query", this.au);
        bundle.putBoolean("previously_started_from_dial_intent", this.aA);
        defpackage.tjn tjnVar = this.aH;
        if (tjnVar != null && tjnVar.c.isPresent()) {
            j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(this.aH.c.getAsInt()));
            this.az = optionalOf;
            bundle.putInt("key_expanded_position", ((java.lang.Integer) optionalOf.orElseThrow()).intValue());
        }
        android.view.View view = ((aw) this).Q;
        com.android.dialer.timekeeper.histogram.HistogramView histogramView = view != null ? (com.android.dialer.timekeeper.histogram.HistogramView) view.findViewById(2131429282) : null;
        if (histogramView != null && histogramView.isShown()) {
            bundle.putParcelable("key_time_keeper_saved_state", histogramView.onSaveInstanceState());
        }
        j$.util.Optional optional = this.ao;
        defpackage.ubv ubvVar = new defpackage.ubv(bundle, 1);
        if (true == optional.isPresent()) {
            ((android.os.Bundle) ubvVar.a).putInt("key_rtt_configuration_cache", ((tcp) optional.get()).f);
        }
    }

    public final void m() {
        defpackage.tjn tjnVar = this.aH;
        if (tjnVar != null) {
            tjnVar.b();
        }
        f();
        this.ay = false;
        super.m();
    }

    public final void n(android.os.Bundle bundle) {
        super.n(bundle);
        if (bundle != null) {
            if (epc.a(this).d() || this.ak.ak()) {
                this.al.u(new defpackage.tkb(this));
            } else {
                this.al.t(2);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "onTouch", 997, "SearchFragment.java").v("No onTouch callback when using modernized main.");
        return false;
    }

    public final void p(java.lang.String str, int i) {
        ahok ahokVarF = snl.ag(z()).fi().f(885, "SearchFragment_placeDuoCall");
        try {
            if (this.al.A(i) && this.al.b(i) == 5) {
                bf(mce.es);
            } else if (this.al.B(i) - 1 != 1) {
                bf(mce.eu);
            } else {
                bf(mce.et);
            }
            this.b.n(rmw.eu);
            this.as.k(str, nwt.j);
            ahvr.i(new defpackage.tjr(), this);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void q(java.lang.String str, int i, boolean z) {
        if (this.al.A(i) && this.al.b(i) == 5) {
            bf(mce.dt);
        } else if (this.al.B(i) == 2) {
            bf(mce.du);
        } else {
            bf(mce.dv);
        }
        this.b.n(rmw.ew);
        aV(str, i, 3, null, z);
    }

    public final void r(java.lang.String str, int i, defpackage.abvz abvzVar, boolean z) {
        if (this.al.A(i) && this.al.b(i) == 5) {
            bf(mce.bL);
        } else if (this.al.B(i) == 2) {
            bf(mce.I);
        } else {
            bf(mce.H);
        }
        aV(str, i, 1, abvzVar, z);
    }

    public final void s(j$.util.OptionalInt optionalInt) {
        if (!optionalInt.isPresent()) {
            dzs.k(this.ak, (java.lang.CharSequence) null);
            a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "setA11yPaneTitle", 1191, "SearchFragment.java").v("Setting accessibility pane title to null");
        } else {
            java.lang.String string = z().getResources().getString(optionalInt.getAsInt());
            dzs.k(this.ak, string);
            a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "setA11yPaneTitle", 1196, "SearchFragment.java").y("Setting accessibility pane title to %s", string);
        }
    }

    final boolean t() {
        return this.aI == 7;
    }
}
