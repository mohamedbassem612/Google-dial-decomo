package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vxq {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer");
    public final defpackage.ahan A;
    public aify C;
    public aify D;
    public j$.util.Optional E;
    public j$.util.Optional F;
    public boolean G;
    public boolean H;
    public boolean I;
    public j$.util.Optional J;
    public java.util.Set K;
    public j$.util.Optional L;
    public j$.util.Optional M;
    public boolean N;
    public final java.util.Set O;
    public final defpackage.vxp P;
    public final aoin Q;
    public final aoin R;
    public boolean S;
    public agxi T;
    public final agye U;
    public final defpackage.vul V;
    public final vvl W;
    public final defpackage.vvb X;
    public final cop Y;
    public final defpackage.voc Z;
    public final zjm aa;
    public final gpd ab;
    public final ajwr ac;
    public final ahbv ad;
    private final aoin ae;
    private final aoin af;
    private final defpackage.ahdv ag;
    private final aogc ah;
    public final android.content.Context b;
    public final defpackage.ahey c;
    public final defpackage.vwz d;
    public final defpackage.vyg e;
    public final vtv f;
    public final az g;
    public final agsm h;
    public final agtj i;
    public final ahpz j;
    public final rwq k;
    public final ruc l;
    public final rlv m;
    public final vdo n;
    public final ojo o;
    public final vvz p;
    public final defpackage.ahao x;
    public final defpackage.ahao y;
    public final defpackage.ahao z;
    public final agtk q = new defpackage.vxg(this);
    public final agtk r = new defpackage.vxh(this);
    public final agtk s = new defpackage.vxi(this);
    public final agtk t = new defpackage.vxj(this);
    public final agtk u = new defpackage.vxk(this);
    public final agtk v = new defpackage.vxl(this);
    public final agtk w = new defpackage.vxm(this);
    public j$.util.Optional B = j$.util.Optional.empty();

    public vxq(android.content.Context context, defpackage.ahey aheyVar, defpackage.vwz vwzVar, defpackage.vyg vygVar, vtv vtvVar, defpackage.vul vulVar, az azVar, agsm agsmVar, ajwr ajwrVar, agtj agtjVar, ahpz ahpzVar, vvl vvlVar, rwq rwqVar, aoin aoinVar, defpackage.voc vocVar, aogc aogcVar, ruc rucVar, rlv rlvVar, zjm zjmVar, defpackage.ahdv ahdvVar, gpd gpdVar, vdo vdoVar, defpackage.vvb vvbVar, ojo ojoVar, cop copVar, vvz vvzVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, ahbv ahbvVar) {
        aify aifyVar = aike.a;
        this.C = aifyVar;
        this.D = aifyVar;
        this.E = j$.util.Optional.empty();
        this.F = j$.util.Optional.empty();
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = j$.util.Optional.empty();
        this.K = new java.util.HashSet();
        this.L = j$.util.Optional.empty();
        this.M = j$.util.Optional.empty();
        this.N = false;
        this.O = new java.util.HashSet();
        this.P = new defpackage.vxp(this);
        this.S = false;
        this.U = new defpackage.vxn(this);
        this.b = context;
        this.c = aheyVar;
        this.d = vwzVar;
        this.e = vygVar;
        this.f = vtvVar;
        this.V = vulVar;
        this.g = azVar;
        this.h = agsmVar;
        this.ac = ajwrVar;
        this.i = agtjVar;
        this.j = ahpzVar;
        this.W = vvlVar;
        this.k = rwqVar;
        this.ae = aoinVar;
        this.Z = vocVar;
        this.ah = aogcVar;
        this.l = rucVar;
        this.m = rlvVar;
        this.aa = zjmVar;
        this.ag = ahdvVar;
        this.ab = gpdVar;
        this.n = vdoVar;
        this.X = vvbVar;
        this.o = ojoVar;
        this.Y = copVar;
        this.p = vvzVar;
        this.Q = aoinVar2;
        this.R = aoinVar3;
        this.af = aoinVar4;
        this.ad = ahbvVar;
        this.x = new defpackage.vyb(ahbvVar);
        this.y = new defpackage.vwj();
        this.z = new defpackage.vyk(ahbvVar);
        this.A = new defpackage.ahan(new vuj(this, 11), new defpackage.ahyd(new vrx(10), ahxr.a), new defpackage.ahaj(new defpackage.ahah(1)));
    }

    private final boolean B() {
        if (!this.F.isPresent()) {
            return false;
        }
        if (!this.D.isEmpty()) {
            j$.util.Optional optionalOfNullable = this.F;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.vtx) optionalOfNullable.get()).i));
            }
            if (!((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static android.net.Uri a(defpackage.uzo uzoVar) {
        defpackage.uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = defpackage.uzn.a;
        }
        return android.net.Uri.parse(uznVar.f);
    }

    public final void A(int i) {
        if (!this.E.isPresent()) {
            a.bI(a.c().m(aioa.b), "missing model, promo should not be shown in the first place", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "onPromoActionClicked", (char) 1845, "VisualVoicemailFragmentPeer.java", zct.b);
            return;
        }
        j$.util.Optional optional = this.E;
        defpackage.pqj pqjVar = new defpackage.pqj(this, i, 2);
        int i2 = 1;
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = pqjVar.b;
            int i3 = pqjVar.a;
            if (i3 == 0) {
                throw null;
            }
            int i4 = i3 - 1;
            if (i4 == 0) {
                defpackage.vub vubVar = (defpackage.vub) obj;
                ((defpackage.vxq) obj2).W.k(vubVar.f, vubVar.g);
                return;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    defpackage.vub vubVar2 = (defpackage.vub) obj;
                    ((defpackage.vxq) obj2).W.m(vubVar2.f, vubVar2.g);
                    return;
                } else {
                    defpackage.vub vubVar3 = (defpackage.vub) obj;
                    ((defpackage.vxq) obj2).W.l(vubVar3.f, vubVar3.g);
                    return;
                }
            }
            defpackage.vxq vxqVar = (defpackage.vxq) obj2;
            int i5 = 0;
            if (((defpackage.vub) vxqVar.E.orElseThrow()).g.equals("vvm_type_vvm3") && !((defpackage.vub) vxqVar.E.orElseThrow()).h) {
                a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "showDeclineTosDialog", 1877, "VisualVoicemailFragmentPeer.java").v("PIN_NOT_SET, showing set PIN dialog");
                defpackage.afsn afsnVar = new defpackage.afsn(vxqVar.d.G(), 0);
                afsnVar.r(2132020711);
                ahpz ahpzVar = vxqVar.j;
                afsnVar.w(2132020712, new defpackage.ahpt(ahpzVar, 1037, "Clicked positive button in set PIN before decline dialog for voicemail", new defpackage.vxe(vxqVar, i2)));
                afsnVar.t(android.R.string.cancel, new defpackage.ahpt(ahpzVar, 1038, "Clicked negative button in set PIN before decline dialog for voicemail", new defpackage.rjt(3)));
                afsnVar.p(true);
                afsnVar.a();
                return;
            }
            a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "showDeclineTosDialog", 1881, "VisualVoicemailFragmentPeer.java").v("showing decline ToS dialog");
            defpackage.afsn afsnVar2 = new defpackage.afsn(vxqVar.d.G(), 0);
            afsnVar2.x(2132020550);
            afsnVar2.r(true != ((defpackage.vub) vxqVar.E.orElseThrow()).g.equals("vvm_type_vvm3") ? 2132018304 : 2132020709);
            ahpz ahpzVar2 = vxqVar.j;
            afsnVar2.w(2132018303, new defpackage.ahpt(ahpzVar2, 1035, "Clicked positive button in decline ToS dialog for voicemail", new defpackage.vxe(vxqVar, i5)));
            afsnVar2.t(android.R.string.cancel, new defpackage.ahpt(ahpzVar2, 1036, "Clicked negative button in decline ToS dialog for voicemail", new defpackage.rjt(5)));
            afsnVar2.p(true);
            afsnVar2.a();
        }
    }

    public final android.view.View b() {
        return ((aw) this.d).Q.findViewById(2131428956);
    }

    public final j$.util.Optional c(long j) {
        aify aifyVar = this.D;
        int size = aifyVar.size();
        int i = 0;
        while (i < size) {
            defpackage.uzo uzoVar = (defpackage.uzo) aifyVar.get(i);
            kiu kiuVar = uzoVar.d;
            if (kiuVar == null) {
                kiuVar = kiu.a;
            }
            i++;
            if (kiuVar.d == j) {
                return j$.util.Optional.of(uzoVar);
            }
        }
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional d() {
        return !this.L.isPresent() ? j$.util.Optional.empty() : c(((defpackage.vxo) this.L.orElseThrow()).a);
    }

    public final j$.util.Optional e() {
        return j$.util.Optional.ofNullable((com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView) this.d.N().findViewById(2131429460));
    }

    public final j$.util.Optional f(long j) {
        aify aifyVar = this.D;
        int size = aifyVar.size();
        int i = 0;
        while (i < size) {
            defpackage.uzo uzoVar = (defpackage.uzo) aifyVar.get(i);
            kiu kiuVar = uzoVar.d;
            if (kiuVar == null) {
                kiuVar = kiu.a;
            }
            i++;
            if (kiuVar.d == j) {
                defpackage.uzn uznVar = uzoVar.c;
                if (uznVar == null) {
                    uznVar = defpackage.uzn.a;
                }
                return j$.util.Optional.of(uznVar.f);
            }
        }
        return j$.util.Optional.empty();
    }

    public final void g(java.util.List list) {
        a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "archiveVoicemails", 1200, "VisualVoicemailFragmentPeer.java").w("Archiving %d voicemails", list.size());
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(list).map(new defpackage.vxb(this, 3)).filter(new vgb(13)).map(new defpackage.vun(6)).collect(aido.a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = aifyVar.iterator();
        while (true) {
            vva vvaVar = this.f;
            byte[] bArr = null;
            if (!it.hasNext()) {
                this.i.j(defpackage.zoe.N(ahvr.ah(arrayList).p(ahqx.b(new defpackage.vfm(vvaVar, arrayList, 8, bArr)), vvaVar.g)), new defpackage.zoe("Failed to archive the selected voicemails!"), this.q);
                return;
            }
            android.net.Uri uri = (android.net.Uri) it.next();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("archived", "1");
            arrayList.add(vvaVar.d.f(uri, contentValues, (java.lang.String) null, (java.lang.String[]) null));
        }
    }

    public final void h(long j) {
        java.util.Set set = this.O;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        if (set.remove(lValueOf)) {
            l(mce.dV);
            this.m.n(rmw.eC);
            if (set.isEmpty()) {
                j$.util.Optional optional = this.J;
                if (true == optional.isPresent()) {
                    ((android.view.ActionMode) optional.get()).finish();
                }
            }
        } else {
            l(mce.dU);
            this.m.n(rmw.eB);
            set.add(lValueOf);
        }
        s();
    }

    public final void i(int i) {
        this.M = j$.util.Optional.of(this.b.getString(i));
        w();
        v();
    }

    public final void j() {
        this.M = j$.util.Optional.empty();
        w();
        v();
    }

    public final void k(mcd mcdVar) {
        this.ab.i((java.lang.String) null).a(mcdVar);
    }

    public final void l(mce mceVar) {
        this.ab.i((java.lang.String) null).b(mceVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rlv] */
    public final void m() {
        j$.util.Optional optionalD = d();
        if (!optionalD.isPresent()) {
            a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "playVoicemailForExpandedEntry", 1350, "VisualVoicemailFragmentPeer.java").v("entry is no longer expanded");
            return;
        }
        cop copVar = this.Y;
        ied iedVarAm = wsc.am((defpackage.uzo) optionalD.orElseThrow());
        aooh.f(iedVarAm, "audioInfo");
        ?? r1 = copVar.b;
        defpackage.vaa vaaVarQ = akky.Q(amod.a.m());
        iec iecVarB = iec.b(iedVarAm.e);
        if (iecVarB == null) {
            iecVarB = iec.j;
        }
        vaaVarQ.an(iecVarB);
        vaaVarQ.ao(12);
        r1.c(vaaVarQ.am());
        ((iez) copVar.e).l(iedVarAm);
    }

    public final void n(java.util.Set set) {
        if (!set.isEmpty() || this.P.a) {
            a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "restoreActionMode", 1598, "VisualVoicemailFragmentPeer.java").v("restore action mode");
            t(false);
            s();
            w();
        }
    }

    public final void o(java.lang.Runnable runnable) {
        this.ah.aF(this.d.N().findViewById(2131428773), runnable);
    }

    public final void p(android.view.View view, boolean z) {
        if (z) {
            android.view.View viewFindViewById = view.findViewById(2131428773);
            viewFindViewById.setPaddingRelative(viewFindViewById.getPaddingStart(), this.b.getResources().getDimensionPixelSize(2131167351), viewFindViewById.getPaddingEnd(), viewFindViewById.getPaddingBottom());
        }
    }

    public final void q(java.util.List list) {
        az azVar = this.g;
        defpackage.vwz vwzVar = this.d;
        android.view.View viewInflate = android.view.View.inflate(azVar, 2131624237, null);
        defpackage.afsn afsnVar = new defpackage.afsn(vwzVar.G(), 0);
        afsnVar.p(true);
        afsnVar.A(viewInflate);
        afsnVar.v(new nwi(this, 3));
        defpackage.vxd vxdVar = new defpackage.vxd(this, list, viewInflate, 0);
        ahpz ahpzVar = this.j;
        afsnVar.w(2132020851, new defpackage.ahpt(ahpzVar, 1033, "Clicked positive button in archive voicemail dialog for voicemail", vxdVar));
        afsnVar.t(2132020836, new defpackage.ahpt(ahpzVar, 1034, "Clicked negative button in archive voicemail dialog for voicemail", new defpackage.rjt(4)));
        afsnVar.a();
        this.I = true;
    }

    public final void r(long j, boolean z) {
        ahoq ahoqVarW = ahvr.W(1039, "VisualVoicemailFragmentPeer_toggleExpand");
        try {
            if (this.L.isPresent() && j == ((defpackage.vxo) this.L.orElseThrow()).a) {
                this.L = j$.util.Optional.empty();
            } else {
                this.L = j$.util.Optional.of(new defpackage.vxo(j, z));
                this.m.n(rmw.W);
            }
            j();
            j$.util.Optional optionalD = d();
            defpackage.vxc vxcVar = new defpackage.vxc(this, 0);
            if (true == optionalD.isPresent()) {
                java.lang.Object obj = optionalD.get();
                java.lang.Object obj2 = vxcVar.a;
                kiu kiuVar = ((defpackage.uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                if (!kiuVar.j) {
                    agtj agtjVar = ((defpackage.vxq) obj2).i;
                    vtv vtvVar = ((defpackage.vxq) obj2).f;
                    defpackage.uzn uznVar = ((defpackage.uzo) obj).c;
                    if (uznVar == null) {
                        uznVar = defpackage.uzn.a;
                    }
                    agtjVar.j(defpackage.zoe.N(vtvVar.d(android.net.Uri.parse(uznVar.f))), new defpackage.zoe("failed to mark voicemail as read"), ((defpackage.vxq) obj2).q);
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void s() {
        if (this.J.isPresent()) {
            android.view.ActionMode actionMode = (android.view.ActionMode) this.J.orElseThrow();
            az azVar = this.g;
            java.util.Set set = this.O;
            actionMode.setTitle(azVar.getResources().getString(2132020835, java.lang.Integer.toString(set.size())));
            ((android.view.ActionMode) this.J.orElseThrow()).getMenu().findItem(2131427402).setEnabled(!set.isEmpty());
            android.view.MenuItem menuItemFindItem = ((android.view.ActionMode) this.J.orElseThrow()).getMenu().findItem(2131427400);
            if (menuItemFindItem == null || !menuItemFindItem.isVisible()) {
                return;
            }
            menuItemFindItem.setEnabled(!set.isEmpty());
        }
    }

    public final void t(boolean z) {
        if (this.J.isPresent()) {
            if (z) {
                this.m.n(rmw.eA);
            }
        } else {
            rlv rlvVar = this.m;
            if (z) {
                rlvVar.n(rmw.ez);
            } else {
                rlvVar.n(rmw.eL);
            }
            this.J = j$.util.Optional.of(((aw) this.d).Q.findViewById(2131428773).startActionMode(this.P));
        }
    }

    public final void u(j$.util.Optional optional) {
        this.E = optional;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((aw) this.d).Q.findViewById(2131428536);
        byte[] bArr = null;
        defpackage.vub vubVar = (defpackage.vub) optional.orElse((java.lang.Object) null);
        if (vubVar == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        ((android.widget.TextView) viewGroup.findViewById(2131429308)).setText(vubVar.a);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(2131429307);
        textView.setText(vubVar.b);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(2131429472);
        textView2.setText(vubVar.d.a);
        ahpz ahpzVar = this.j;
        textView2.setOnClickListener(new defpackage.ahpp(ahpzVar, 1040, "Clicked voicemail_tos_button_decline button", new defpackage.qgq(this, vubVar, 16, bArr), 0));
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(2131429471);
        textView3.setText(vubVar.e.a);
        textView3.setOnClickListener(new defpackage.ahpp(ahpzVar, 1041, "Clicked voicemail_tos_button_accept button", new defpackage.qgq(this, vubVar, 17, bArr), 0));
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(2131429467);
        imageView.setImageResource(vubVar.c);
        imageView.setVisibility(0);
    }

    public final void v() {
        ahoq ahoqVar;
        java.lang.Throwable th;
        j$.util.Optional optionalOfNullable;
        ahoq ahoqVar2;
        j$.util.Optional optional;
        defpackage.uzo uzoVar;
        java.util.LinkedHashMap linkedHashMap;
        int i;
        java.util.List listA;
        java.lang.String str = "getRawNumber(...)";
        ahoq ahoqVarW = ahvr.W(1042, "VisualVoicemailFragmentPeer_updateVoicemailDetailViewIfPresent");
        try {
            j$.util.Optional optionalE = e();
            if (optionalE.isPresent()) {
                j$.util.Optional optionalD = d();
                if (true != optionalD.isPresent()) {
                    optionalOfNullable = optionalD;
                } else {
                    kiu kiuVar = ((defpackage.uzo) optionalD.get()).d;
                    if (kiuVar == null) {
                        try {
                            kiuVar = kiu.a;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            ahoqVar = ahoqVarW;
                        }
                    }
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Long.valueOf(kiuVar.d));
                }
                defpackage.vyr vyqVar = null;
                if (B()) {
                    j$.util.Optional optionalOfNullable2 = this.F;
                    j$.util.Objects.requireNonNull(this.ag);
                    if (true == optionalOfNullable2.isPresent()) {
                        java.lang.Object obj = optionalOfNullable2.get();
                        akzx akzxVarM = defpackage.wei.a.m();
                        aooh.f(akzxVarM, "builder");
                        java.lang.String str2 = ((defpackage.vtx) obj).e;
                        aooh.e(str2, "getDescription(...)");
                        aooh.f(str2, "value");
                        akzxVarM.u();
                        defpackage.wei weiVar = (defpackage.wei) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str2);
                        weiVar.c = str2;
                        java.lang.String str3 = ((defpackage.vtx) obj).j;
                        aooh.e(str3, "getDescriptionLinkText(...)");
                        aooh.f(str3, "value");
                        akzxVarM.u();
                        defpackage.wei weiVar2 = (defpackage.wei) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str3);
                        weiVar2.g = str3;
                        defpackage.weh wehVar = defpackage.weh.a;
                        defpackage.uzx uzxVarAd = wsc.ad(wehVar.m());
                        defpackage.vtw vtwVar = ((defpackage.vtx) obj).f;
                        if (vtwVar == null) {
                            vtwVar = defpackage.vtw.a;
                        }
                        java.lang.String str4 = vtwVar.d;
                        aooh.e(str4, "getText(...)");
                        uzxVarAd.i(str4);
                        defpackage.weh wehVarH = uzxVarAd.h();
                        aooh.f(wehVarH, "value");
                        akzxVarM.u();
                        defpackage.wei weiVar3 = (defpackage.wei) akzxVarM.b;
                        j$.util.Objects.requireNonNull(wehVarH);
                        weiVar3.e = wehVarH;
                        weiVar3.b |= 2;
                        defpackage.vtw vtwVar2 = ((defpackage.vtx) obj).g;
                        if (vtwVar2 == null) {
                            vtwVar2 = defpackage.vtw.a;
                        }
                        java.lang.String str5 = vtwVar2.d;
                        aooh.e(str5, "getText(...)");
                        if (str5.length() > 0) {
                            defpackage.uzx uzxVarAd2 = wsc.ad(wehVar.m());
                            defpackage.vtw vtwVar3 = ((defpackage.vtx) obj).g;
                            if (vtwVar3 == null) {
                                vtwVar3 = defpackage.vtw.a;
                            }
                            java.lang.String str6 = vtwVar3.d;
                            aooh.e(str6, "getText(...)");
                            uzxVarAd2.i(str6);
                            defpackage.weh wehVarH2 = uzxVarAd2.h();
                            aooh.f(wehVarH2, "value");
                            akzxVarM.u();
                            defpackage.wei weiVar4 = (defpackage.wei) akzxVarM.b;
                            j$.util.Objects.requireNonNull(wehVarH2);
                            weiVar4.f = wehVarH2;
                            weiVar4.b |= 4;
                        }
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        optionalOfNullable2 = j$.util.Optional.ofNullable(new defpackage.vyo((defpackage.wei) aladVarP));
                    }
                    vyqVar = (defpackage.vyr) optionalOfNullable2.orElse((java.lang.Object) null);
                } else {
                    if (optionalOfNullable.isPresent() && !this.K.contains(optionalOfNullable.orElseThrow())) {
                        defpackage.ahdv ahdvVar = this.ag;
                        defpackage.uzo uzoVar2 = (defpackage.uzo) optionalD.orElseThrow();
                        java.lang.String str7 = (java.lang.String) this.M.orElse((java.lang.Object) null);
                        aooh.f(uzoVar2, "voicemailEntry");
                        kiu kiuVar2 = uzoVar2.d;
                        if (kiuVar2 == null) {
                            kiuVar2 = kiu.a;
                        }
                        long j = kiuVar2.d;
                        java.lang.Object obj2 = ahdvVar.e;
                        kiu kiuVar3 = uzoVar2.d;
                        if (kiuVar3 == null) {
                            kiuVar3 = kiu.a;
                        }
                        java.lang.String string = ((aeqx) obj2).d(kiuVar3, true).toString();
                        java.lang.Object obj3 = ahdvVar.c;
                        kiu kiuVar4 = uzoVar2.d;
                        if (kiuVar4 == null) {
                            kiuVar4 = kiu.a;
                        }
                        alad aladVarP2 = ((gpd) obj3).a(kiuVar4, 1).p();
                        aooh.e(aladVarP2, "build(...)");
                        defpackage.abwd abwdVar = (defpackage.abwd) aladVarP2;
                        defpackage.uzn uznVar = uzoVar2.c;
                        if (uznVar == null) {
                            uznVar = defpackage.uzn.a;
                        }
                        java.lang.String str8 = uznVar.d;
                        aooh.e(str8, "getTranscription(...)");
                        java.lang.String string2 = aoov.x(str8).toString();
                        java.lang.Object obj4 = ahdvVar.f;
                        defpackage.uzn uznVar2 = uzoVar2.c;
                        if (uznVar2 == null) {
                            uznVar2 = defpackage.uzn.a;
                        }
                        defpackage.uzm uzmVarB = defpackage.uzm.b(uznVar2.e);
                        if (uzmVarB == null) {
                            uzmVarB = defpackage.uzm.UNKNOWN;
                        }
                        java.lang.String strB = ((defpackage.vxz) obj4).b(uzmVarB);
                        kiu kiuVar5 = uzoVar2.d;
                        if (kiuVar5 == null) {
                            kiuVar5 = kiu.a;
                        }
                        aooh.e(kiuVar5, "getCoalescedRow(...)");
                        java.lang.String str9 = kiuVar5.g;
                        aooh.e(str9, "getRawNumber(...)");
                        int i2 = 0;
                        while (true) {
                            if (i2 < str9.length()) {
                                if (!android.telephony.PhoneNumberUtils.isDialable(str9.charAt(i2))) {
                                    try {
                                        i2++;
                                        str = str;
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                    }
                                } else if (((ssq) ahdvVar.g).c(kiuVar5.g, kiuVar5.i)) {
                                    java.util.List listBZ = ajsz.bZ(defpackage.vyp.i);
                                    int i3 = 4;
                                    char c = 16;
                                    linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(listBZ, 10)), 16));
                                    for (java.lang.Object obj5 : listBZ) {
                                        defpackage.vyp vypVar = (defpackage.vyp) obj5;
                                        char c2 = c;
                                        ahoq ahoqVar3 = ahoqVarW;
                                        java.lang.Object obj6 = ahdvVar.d;
                                        akzx akzxVarM2 = oqy.a.m();
                                        aooh.f(akzxVarM2, "builder");
                                        akzxVarM2.u();
                                        j$.util.Optional optional2 = optionalE;
                                        oqy oqyVar = akzxVarM2.b;
                                        defpackage.uzo uzoVar3 = uzoVar2;
                                        oqyVar.u = 2;
                                        oqyVar.b |= 262144;
                                        java.lang.String str10 = kiuVar5.g;
                                        aooh.e(str10, str);
                                        aooh.f(str10, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar2 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str10);
                                        java.lang.String str11 = str;
                                        oqyVar2.b |= 1;
                                        oqyVar2.c = str10;
                                        hkd hkdVar = kiuVar5.f;
                                        if (hkdVar == null) {
                                            hkdVar = hkd.a;
                                        }
                                        java.lang.String str12 = hkdVar.c;
                                        aooh.e(str12, "getNormalizedNumber(...)");
                                        aooh.f(str12, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar3 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str12);
                                        oqyVar3.b |= 2;
                                        oqyVar3.d = str12;
                                        java.lang.String str13 = kiuVar5.h;
                                        aooh.e(str13, "getFormattedNumber(...)");
                                        aooh.f(str13, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar4 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str13);
                                        oqyVar4.b |= 4;
                                        oqyVar4.e = str13;
                                        hkd hkdVar2 = kiuVar5.f;
                                        if (hkdVar2 == null) {
                                            hkdVar2 = hkd.a;
                                        }
                                        java.lang.String str14 = hkdVar2.d;
                                        aooh.e(str14, "getCountryIso(...)");
                                        aooh.f(str14, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar5 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str14);
                                        oqyVar5.b |= 8;
                                        oqyVar5.f = str14;
                                        java.lang.Object obj7 = ahdvVar.b;
                                        kiw kiwVar = kiuVar5.r;
                                        if (kiwVar == null) {
                                            kiwVar = kiw.a;
                                        }
                                        java.lang.String strA = ((kaw) obj7).a(kiwVar);
                                        aooh.e(strA, "getDisplayName(...)");
                                        aooh.f(strA, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar6 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(strA);
                                        oqyVar6.b |= 16;
                                        oqyVar6.g = strA;
                                        int i4 = kiuVar5.q;
                                        akzxVarM2.u();
                                        oqy oqyVar7 = akzxVarM2.b;
                                        oqyVar7.b |= 32;
                                        oqyVar7.h = i4;
                                        int i5 = kiuVar5.o;
                                        akzxVarM2.u();
                                        oqy oqyVar8 = akzxVarM2.b;
                                        oqyVar8.b |= 64;
                                        oqyVar8.i = i5;
                                        kiw kiwVar2 = kiuVar5.r;
                                        if (kiwVar2 == null) {
                                            kiwVar2 = kiw.a;
                                        }
                                        java.lang.String str15 = kiwVar2.g;
                                        aooh.e(str15, "getLookupUri(...)");
                                        aooh.f(str15, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar9 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str15);
                                        oqyVar9.b |= 128;
                                        oqyVar9.j = str15;
                                        java.lang.String str16 = kiuVar5.m;
                                        aooh.e(str16, "getPhoneAccountComponentName(...)");
                                        aooh.f(str16, "value");
                                        akzxVarM2.u();
                                        oqy oqyVar10 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str16);
                                        oqyVar10.b |= 256;
                                        oqyVar10.k = str16;
                                        kiw kiwVar3 = kiuVar5.r;
                                        if (kiwVar3 == null) {
                                            kiwVar3 = kiw.a;
                                        }
                                        java.lang.String str17 = kiwVar3.g;
                                        aooh.e(str17, "getLookupUri(...)");
                                        boolean z = str17.length() > 0;
                                        akzxVarM2.u();
                                        oqy oqyVar11 = akzxVarM2.b;
                                        oqyVar11.b |= 512;
                                        oqyVar11.l = z;
                                        kiw kiwVar4 = kiuVar5.r;
                                        if (kiwVar4 == null) {
                                            kiwVar4 = kiw.a;
                                        }
                                        boolean z2 = kiwVar4.p;
                                        akzxVarM2.u();
                                        oqy oqyVar12 = akzxVarM2.b;
                                        oqyVar12.b |= 1024;
                                        oqyVar12.m = z2;
                                        kiw kiwVar5 = kiuVar5.r;
                                        if (kiwVar5 == null) {
                                            kiwVar5 = kiw.a;
                                        }
                                        boolean z3 = kiwVar5.j;
                                        akzxVarM2.u();
                                        oqy oqyVar13 = akzxVarM2.b;
                                        oqyVar13.b |= 2048;
                                        oqyVar13.n = z3;
                                        kiw kiwVar6 = kiuVar5.r;
                                        if (kiwVar6 == null) {
                                            kiwVar6 = kiw.a;
                                        }
                                        boolean z4 = kiwVar6.r;
                                        akzxVarM2.u();
                                        oqy oqyVar14 = akzxVarM2.b;
                                        oqyVar14.b |= 32768;
                                        oqyVar14.r = z4;
                                        boolean zV = ((tkl) ahdvVar.a).v(kiuVar5);
                                        akzxVarM2.u();
                                        oqy oqyVar15 = akzxVarM2.b;
                                        oqyVar15.b |= 4096;
                                        oqyVar15.o = zV;
                                        boolean z5 = kiuVar5.s;
                                        akzxVarM2.u();
                                        oqy oqyVar16 = akzxVarM2.b;
                                        oqyVar16.b |= 8192;
                                        oqyVar16.p = z5;
                                        kiw kiwVar7 = kiuVar5.r;
                                        if (kiwVar7 == null) {
                                            kiwVar7 = kiw.a;
                                        }
                                        rmt rmtVarB = rmt.b(kiwVar7.o);
                                        if (rmtVarB == null) {
                                            rmtVarB = rmt.a;
                                        }
                                        akzxVarM2.u();
                                        oqy oqyVar17 = akzxVarM2.b;
                                        oqyVar17.q = rmtVarB.q;
                                        oqyVar17.b |= 16384;
                                        int i6 = kiuVar5.y;
                                        akzxVarM2.u();
                                        oqy oqyVar18 = akzxVarM2.b;
                                        oqyVar18.b |= 65536;
                                        oqyVar18.s = i6;
                                        oqy oqyVarP = akzxVarM2.p();
                                        aooh.e(oqyVarP, "build(...)");
                                        orc orcVar = new orc((android.content.Context) obj6, oqyVarP);
                                        switch (vypVar.ordinal()) {
                                            case 0:
                                                i = i3;
                                                orcVar.n(j$.util.Optional.of(mce.O));
                                                listA = orcVar.a();
                                                break;
                                            case 1:
                                                i = i3;
                                                orcVar.m();
                                                listA = orcVar.a();
                                                break;
                                            case 2:
                                                i = i3;
                                                orcVar.p();
                                                listA = orcVar.a();
                                                break;
                                            case 3:
                                                i = i3;
                                                orcVar.o();
                                                listA = orcVar.a();
                                                break;
                                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                                i = i3;
                                                orcVar.l();
                                                listA = orcVar.a();
                                                break;
                                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                                i = i3;
                                                listA = aokc.a;
                                                break;
                                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                                i = i3;
                                                orcVar.q(i);
                                                listA = orcVar.a();
                                                break;
                                            default:
                                                throw new aois();
                                        }
                                        linkedHashMap.put(obj5, (oqx) ajsz.bG(listA));
                                        i3 = i;
                                        c = c2;
                                        ahoqVarW = ahoqVar3;
                                        optionalE = optional2;
                                        uzoVar2 = uzoVar3;
                                        str = str11;
                                    }
                                    ahoqVar2 = ahoqVarW;
                                    optional = optionalE;
                                    uzoVar = uzoVar2;
                                }
                                th = th;
                                try {
                                    ahoqVar.close();
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                            ahoqVar2 = ahoqVarW;
                            optional = optionalE;
                            uzoVar = uzoVar2;
                            linkedHashMap = aokd.a;
                            break;
                        }
                        vyqVar = new defpackage.vyq(j, string, abwdVar, string2, strB, linkedHashMap, str7, wsc.am(uzoVar));
                    }
                    ((com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView) optional.orElseThrow()).y().a(vyqVar);
                }
                ahoqVar2 = ahoqVarW;
                optional = optionalE;
                ((com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView) optional.orElseThrow()).y().a(vyqVar);
            } else {
                ahoqVar2 = ahoqVarW;
            }
            ahoqVar2.close();
        } catch (java.lang.Throwable th5) {
            th = th5;
            ahoqVar = ahoqVarW;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02d3  */
    public final void w() {
        android.content.Intent intent;
        android.support.v7.widget.RecyclerView recyclerViewFindViewById;
        boolean z;
        defpackage.vwz vwzVar = this.d;
        android.support.v7.widget.RecyclerView recyclerViewFindViewById2 = vwzVar.N().findViewById(2131428773);
        int i = 2;
        if (!B()) {
            recyclerViewFindViewById2.setVisibility(0);
            if (y()) {
                android.widget.ImageView imageView = (android.widget.ImageView) vwzVar.N().findViewById(2131428141);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                android.view.View viewFindViewById = vwzVar.N().findViewById(2131428304);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
            }
            j$.util.stream.Stream[] streamArr = new j$.util.stream.Stream[2];
            j$.util.Optional optionalOfNullable = this.F;
            if (true == optionalOfNullable.isPresent()) {
                java.lang.Object obj = optionalOfNullable.get();
                defpackage.vyh vyhVarA = defpackage.vyj.a();
                vyhVarA.b = j$.util.Optional.of(obj);
                optionalOfNullable = j$.util.Optional.ofNullable(vyhVarA.a());
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(j$.util.stream.Stream.-CC.of((defpackage.vyj) optionalOfNullable.get()));
            }
            streamArr[0] = (j$.util.stream.Stream) optionalOfNullable.orElse(j$.util.stream.Stream.-CC.empty());
            streamArr[1] = j$.util.Collection.-EL.stream(this.D).filter(new vpl(this, 10)).map(new defpackage.vxb(this, i));
            aify aifyVar = (aify) j$.util.stream.Stream.-CC.of(streamArr).flatMap(j$.util.function.Function.-CC.identity()).collect(aido.a);
            aift aiftVar = new aift(4);
            int i2 = 0;
            while (i2 < aifyVar.size()) {
                defpackage.vyj vyjVar = (defpackage.vyj) aifyVar.get(i2);
                kiu kiuVar = vyjVar.a.d;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                kit kitVarB = kit.b(kiuVar.v);
                if (kitVarB == null) {
                    kitVarB = kit.a;
                }
                boolean z2 = i2 == 0 || kitVarB != kit.a;
                int i3 = i2 + 1;
                if (i2 == aifyVar.size() - 1) {
                    z = true;
                } else {
                    kiu kiuVar2 = ((defpackage.vyj) aifyVar.get(i3)).a.d;
                    if (kiuVar2 == null) {
                        kiuVar2 = kiu.a;
                    }
                    kit kitVarB2 = kit.b(kiuVar2.v);
                    if (kitVarB2 == null) {
                        kitVarB2 = kit.a;
                    }
                    if (kitVarB2 == kit.a) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                defpackage.vyh vyhVar = new defpackage.vyh(vyjVar);
                vyhVar.f = new defpackage.vxy(z2, z);
                aiftVar.i(vyhVar.a());
                i2 = i3;
            }
            aike aikeVarH = aiftVar.h();
            defpackage.ahan ahanVar = this.A;
            afec.c();
            if (aikeVarH == null) {
                aike aikeVar = ahanVar.f;
                int i4 = aikeVar == null ? 0 : aikeVar.d;
                ahanVar.f = null;
                ahanVar.k(0, i4);
            } else {
                aify aifyVar2 = ahanVar.f;
                if (aifyVar2 == null) {
                    ahanVar.f = aikeVarH;
                    ahanVar.j(0, ahanVar.f.d);
                } else {
                    ahanVar.f = aikeVarH;
                    int i5 = aikeVarH.d;
                    int i6 = ((aike) aifyVar2).d;
                    if (i6 > i5) {
                        ahanVar.k(i5, i6 - i5);
                    } else if (i6 < i5) {
                        ahanVar.j(i6, i5 - i6);
                    }
                    int iMin = java.lang.Math.min(i6, i5);
                    ahanVar.e.a(aifyVar2.b(0, iMin), ahanVar.f.b(0, iMin), ahanVar.a, ahanVar);
                }
            }
            if (((java.lang.Boolean) this.af.a()).booleanValue() && (intent = this.g.getIntent()) != null && (intent.getBooleanExtra("EXTRA_MARK_ALL_NEW_VOICEMAILS_AS_OLD", false) || intent.getBooleanExtra("EXTRA_CLEAR_NEW_VOICEMAILS", false))) {
                a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer", "scrollVoicemailListToTopIfNeeded", 1507, "VisualVoicemailFragmentPeer.java").v("Scrolling voicemail list to the new voicemail (top) because launched from notification");
                intent.removeExtra("EXTRA_MARK_ALL_NEW_VOICEMAILS_AS_OLD");
                intent.removeExtra("EXTRA_CLEAR_NEW_VOICEMAILS");
                android.view.View view = ((aw) vwzVar).Q;
                if (view != null && (recyclerViewFindViewById = view.findViewById(2131428773)) != null) {
                    recyclerViewFindViewById.W(0);
                }
            }
            o(new defpackage.vet(this, 6));
            return;
        }
        recyclerViewFindViewById2.setVisibility(8);
        j$.util.Optional optional = this.F;
        defpackage.vxf vxfVar = new defpackage.vxf(this);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            defpackage.vxq vxqVar = vxfVar.a;
            vxqVar.u(j$.util.Optional.empty());
            if (vxqVar.y()) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) vxqVar.d.N().findViewById(2131428141);
                imageView2.setImageResource(2131231152);
                imageView2.setVisibility(0);
                j$.util.Optional optionalE = vxqVar.e();
                if (optionalE.isPresent()) {
                    ((com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView) optionalE.orElseThrow()).y().a(null);
                    return;
                }
                return;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) vxqVar.d.N().findViewById(2131428304);
            frameLayout.setVisibility(0);
            com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView = (com.android.dialer.widget.errorcontentview.ErrorContentView) frameLayout.findViewById(2131428139);
            if (errorContentView != null) {
                akzx akzxVarM = defpackage.wei.a.m();
                defpackage.vtx vtxVar = (defpackage.vtx) obj2;
                java.lang.String str = vtxVar.d;
                akzxVarM.u();
                defpackage.wei weiVar = (defpackage.wei) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                weiVar.b |= 1;
                weiVar.d = str;
                java.lang.String str2 = vtxVar.e;
                akzxVarM.u();
                defpackage.wei weiVar2 = (defpackage.wei) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                weiVar2.c = str2;
                java.lang.String str3 = vtxVar.j;
                akzxVarM.u();
                defpackage.wei weiVar3 = (defpackage.wei) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                weiVar3.g = str3;
                defpackage.weh wehVar = defpackage.weh.a;
                akzx akzxVarM2 = wehVar.m();
                defpackage.vtw vtwVar = vtxVar.f;
                if (vtwVar == null) {
                    vtwVar = defpackage.vtw.a;
                }
                java.lang.String str4 = vtwVar.d;
                akzxVarM2.u();
                defpackage.weh wehVar2 = (defpackage.weh) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                wehVar2.b = str4;
                akzxVarM.u();
                defpackage.wei weiVar4 = (defpackage.wei) akzxVarM.b;
                defpackage.weh wehVar3 = (defpackage.weh) akzxVarM2.p();
                j$.util.Objects.requireNonNull(wehVar3);
                weiVar4.e = wehVar3;
                weiVar4.b |= 2;
                akzx akzxVarM3 = wehVar.m();
                defpackage.vtw vtwVar2 = vtxVar.g;
                if (vtwVar2 == null) {
                    vtwVar2 = defpackage.vtw.a;
                }
                java.lang.String str5 = vtwVar2.d;
                akzxVarM3.u();
                defpackage.weh wehVar4 = (defpackage.weh) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str5);
                wehVar4.b = str5;
                akzxVarM.u();
                defpackage.wei weiVar5 = (defpackage.wei) akzxVarM.b;
                defpackage.weh wehVar5 = (defpackage.weh) akzxVarM3.p();
                j$.util.Objects.requireNonNull(wehVar5);
                weiVar5.f = wehVar5;
                weiVar5.b |= 4;
                errorContentView.y().a((defpackage.wei) akzxVarM.p());
                return;
            }
            defpackage.ahey aheyVar = vxqVar.c;
            akzx akzxVarM4 = defpackage.wei.a.m();
            defpackage.vtx vtxVar2 = (defpackage.vtx) obj2;
            java.lang.String str6 = vtxVar2.d;
            akzxVarM4.u();
            defpackage.wei weiVar6 = (defpackage.wei) akzxVarM4.b;
            j$.util.Objects.requireNonNull(str6);
            weiVar6.b |= 1;
            weiVar6.d = str6;
            java.lang.String str7 = vtxVar2.e;
            akzxVarM4.u();
            defpackage.wei weiVar7 = (defpackage.wei) akzxVarM4.b;
            j$.util.Objects.requireNonNull(str7);
            weiVar7.c = str7;
            java.lang.String str8 = vtxVar2.j;
            akzxVarM4.u();
            defpackage.wei weiVar8 = (defpackage.wei) akzxVarM4.b;
            j$.util.Objects.requireNonNull(str8);
            weiVar8.g = str8;
            defpackage.weh wehVar6 = defpackage.weh.a;
            akzx akzxVarM5 = wehVar6.m();
            defpackage.vtw vtwVar3 = vtxVar2.f;
            if (vtwVar3 == null) {
                vtwVar3 = defpackage.vtw.a;
            }
            java.lang.String str9 = vtwVar3.d;
            akzxVarM5.u();
            defpackage.weh wehVar7 = (defpackage.weh) akzxVarM5.b;
            j$.util.Objects.requireNonNull(str9);
            wehVar7.b = str9;
            akzxVarM4.u();
            defpackage.wei weiVar9 = (defpackage.wei) akzxVarM4.b;
            defpackage.weh wehVar8 = (defpackage.weh) akzxVarM5.p();
            j$.util.Objects.requireNonNull(wehVar8);
            weiVar9.e = wehVar8;
            weiVar9.b |= 2;
            akzx akzxVarM6 = wehVar6.m();
            defpackage.vtw vtwVar4 = vtxVar2.g;
            if (vtwVar4 == null) {
                vtwVar4 = defpackage.vtw.a;
            }
            java.lang.String str10 = vtwVar4.d;
            akzxVarM6.u();
            defpackage.weh wehVar9 = (defpackage.weh) akzxVarM6.b;
            j$.util.Objects.requireNonNull(str10);
            wehVar9.b = str10;
            akzxVarM4.u();
            defpackage.wei weiVar10 = (defpackage.wei) akzxVarM4.b;
            defpackage.weh wehVar10 = (defpackage.weh) akzxVarM6.p();
            j$.util.Objects.requireNonNull(wehVar10);
            weiVar10.f = wehVar10;
            weiVar10.b |= 4;
            defpackage.wei weiVar11 = (defpackage.wei) akzxVarM4.p();
            aooh.f(weiVar11, "initialModel");
            com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView2 = new com.android.dialer.widget.errorcontentview.ErrorContentView(aheyVar);
            errorContentView2.y().a(weiVar11);
            errorContentView2.setId(2131428139);
            frameLayout.addView(errorContentView2);
        }
    }

    public final boolean x(long j) {
        return this.L.isPresent() && ((defpackage.vxo) this.L.orElseThrow()).a == j;
    }

    public final boolean y() {
        return defpackage.rhx.b(this.b);
    }

    public final boolean z() {
        return ((java.lang.Boolean) this.ae.a()).booleanValue() && !this.e.c;
    }
}
