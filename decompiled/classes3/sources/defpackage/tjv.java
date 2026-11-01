package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjv extends kh {
    private static final aimz e = aimz.i("com/android/dialer/searchfragment/list/SearchAdapter");
    private final defpackage.tjw f;
    private final android.app.Activity g;
    private final defpackage.tjn h;
    private final defpackage.tja i;
    private java.lang.String k;
    private final aigf l;
    private final aigf m;
    private final defpackage.tkd n;
    private final defpackage.uzx o;
    private final ahbv p;
    private final wsc q;
    private java.lang.String j = "";
    public wgi a = wgi.a;

    public tjv(android.app.Activity activity, defpackage.tjw tjwVar, defpackage.tkd tkdVar, defpackage.tjn tjnVar, defpackage.tja tjaVar, defpackage.uzx uzxVar, wsc wscVar, ahbv ahbvVar) {
        aigf aigfVar = aikj.b;
        this.l = aigfVar;
        this.m = aigfVar;
        this.g = activity;
        this.f = tjwVar;
        this.n = tkdVar;
        this.h = tjnVar;
        this.i = tjaVar;
        this.o = uzxVar;
        this.q = wscVar;
        this.p = ahbvVar;
    }

    private static boolean D(int i) {
        return i == 1 || i == 3 || i == 9;
    }

    final boolean A(int i) {
        return i < this.f.a();
    }

    final int B(int i) {
        try {
            defpackage.tjw tjwVar = this.f;
            java.lang.Object obj = tjwVar.a;
            defpackage.tht thtVarB = null;
            if (obj != null && ((defpackage.tik) obj).a() > 0) {
                thtVarB = tjwVar.b(i);
            }
            if (thtVarB instanceof defpackage.tik) {
                return ((defpackage.tik) thtVarB).d;
            }
        } catch (java.lang.IllegalStateException e2) {
            a.by(e.b(), "getCursorTypeAt did not return a valid cursor.", "com/android/dialer/searchfragment/list/SearchAdapter", "getCursorTypeAt", (char) 321, "SearchAdapter.java", e2);
        }
        return 1;
    }

    public final void C(aify aifyVar, int i) {
        ahvr.ci(aifyVar);
        defpackage.tik tikVar = new defpackage.tik(this.g, aifyVar, i);
        defpackage.tjw tjwVar = this.f;
        if (tjwVar.a != tikVar) {
            tjwVar.a = tikVar;
            e();
        }
    }

    public final int a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final int b(int i) {
        defpackage.tjw tjwVar = this.f;
        int iA = tjwVar.a();
        if (i >= iA) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Invalid position: %d, cursor count: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iA)));
        }
        if (i >= iA - tjwVar.d.size()) {
            return 5;
        }
        defpackage.tht thtVarB = tjwVar.b(i);
        thtVarB.getClass();
        if (thtVarB instanceof defpackage.tik) {
            if (thtVarB.c()) {
                return 1;
            }
            defpackage.tin tinVarD = ((defpackage.tik) thtVarB).d();
            return (tinVarD != null && tinVarD.t == 3 && tinVarD.o.isPresent()) ? 7 : 6;
        }
        if (thtVarB == tjwVar.b) {
            return !thtVarB.c() ? 8 : 9;
        }
        if (thtVarB == tjwVar.c) {
            return !thtVarB.c() ? 4 : 3;
        }
        throw new java.lang.IllegalStateException("No valid row type.");
    }

    public final ld d(android.view.ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
            case 3:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.tjs(android.view.LayoutInflater.from(this.g).inflate(2131624263, viewGroup, false));
            case 2:
                return new defpackage.tie((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) android.view.LayoutInflater.from(this.g).inflate(2131624193, viewGroup, false), this.n, this.h, this.i, this.o, this.q);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.tih((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) android.view.LayoutInflater.from(this.g).inflate(2131624193, viewGroup, false), this.n, this.h, this.i, this.o, this.q);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.tju(android.view.LayoutInflater.from(this.g).inflate(2131624417, viewGroup, false), this.n);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.app.Activity activity = this.g;
                return new defpackage.tio((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) android.view.LayoutInflater.from(activity).inflate(2131624193, viewGroup, false), this.n, this.h, this.i, this.o, this.q);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.app.Activity activity2 = this.g;
                return new defpackage.tio((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) android.view.LayoutInflater.from(activity2).inflate(2131624191, viewGroup, false), this.n, this.h, this.i, this.o, this.q);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.thn((com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) android.view.LayoutInflater.from(this.g).inflate(2131624193, viewGroup, false), this.n, this.h, this.i, this.o, this.q);
            default:
                throw new java.lang.IllegalStateException(a.bj(i, "Invalid RowType: "));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void m(ld ldVar, int i) {
        int i2;
        int i3;
        java.lang.CharSequence charSequenceC;
        int i4;
        android.widget.TextView textView;
        java.lang.String str = "";
        if (ldVar instanceof defpackage.tio) {
            defpackage.tik tikVar = (defpackage.tik) this.f.b(i);
            defpackage.tio tioVar = (defpackage.tio) ldVar;
            android.app.Activity activity = this.g;
            defpackage.tin tinVarD = tikVar.d();
            java.lang.String str2 = this.j;
            tioVar.I = activity;
            tioVar.D = i;
            java.lang.String str3 = tinVarD.d;
            tioVar.E = str3;
            tioVar.F = (java.lang.String) tinVarD.e.orElse(tioVar.E);
            wgi wgiVar = tinVarD.p;
            tioVar.G = wgiVar;
            android.content.Context context = tioVar.z;
            java.lang.String strCo = ahvr.co(tinVarD.a(context));
            j$.util.Optional optionalBU = mni.bU(context.getResources(), tinVarD.b, tinVarD.c);
            if (true == optionalBU.isPresent()) {
                optionalBU = j$.util.Optional.ofNullable((java.lang.String) optionalBU.get());
            }
            java.lang.String str4 = (java.lang.String) optionalBU.orElse("");
            akzx akzxVarM = defpackage.abvz.a.m();
            akzxVarM.u();
            defpackage.abvz abvzVar = (defpackage.abvz) akzxVarM.b;
            j$.util.Objects.requireNonNull(strCo);
            abvzVar.b |= 1;
            abvzVar.c = strCo;
            akzxVarM.u();
            defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            abvzVar2.b |= 2;
            abvzVar2.d = str4;
            java.lang.String string = android.text.TextUtils.isEmpty(str4) ? tioVar.E : context.getString(2132017873, str4, tioVar.E);
            tioVar.u.setText(pez.aq(context, defpackage.tiq.a(str2, strCo, context)));
            if (android.text.TextUtils.isEmpty(tioVar.E)) {
                tioVar.v.setText("");
            } else {
                tioVar.v.setText(pez.aq(context, defpackage.tiq.c(str2, string, context)));
            }
            com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton = tioVar.x;
            primaryActionButton.setVisibility(0);
            tioVar.y.setVisibility(8);
            java.lang.String str5 = tinVarD.i;
            if (str5 != null) {
                akzxVarM.u();
                defpackage.abvz abvzVar3 = (defpackage.abvz) akzxVarM.b;
                j$.util.Objects.requireNonNull(str5);
                abvzVar3.b |= 4;
                abvzVar3.e = str5;
            }
            luu.b(context).c(tioVar.t, android.provider.ContactsContract.Contacts.getLookupUri(tinVarD.l, tinVarD.j), tinVarD.h, str5 == null ? null : android.net.Uri.parse(str5), strCo);
            defpackage.abvz abvzVar4 = (defpackage.abvz) akzxVarM.p();
            j$.util.Optional optional = tinVarD.o;
            if (tinVarD.t == 3 && optional.isPresent() && (textView = tioVar.w) != null) {
                textView.setText(pez.aq(context, defpackage.tiq.b(str2, (java.lang.String) optional.orElseThrow(), context)));
            }
            defpackage.tjn tjnVar = tioVar.A;
            if (tjnVar.f(i)) {
                com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = tioVar.B;
                tjnVar.d(expandableSheetView);
                expandableSheetView.f();
            } else {
                tioVar.B.e();
            }
            defpackage.wdi wdiVar = new defpackage.wdi();
            wdiVar.e = tioVar.L;
            wdiVar.f(str3);
            wdiVar.g(i);
            wdiVar.d(abvzVar4);
            wdiVar.e(tinVarD.k);
            tioVar.H = wdiVar.c();
            defpackage.tja tjaVar = tioVar.C;
            com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView2 = tioVar.B;
            com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView = expandableSheetView2.f;
            nwx nwxVar = tinVarD.r;
            if (!tjaVar.c.a().equals(nwv.d) || nwxVar.equals(nwx.b)) {
                dialerExpandedSheetView.a = false;
            } else {
                dialerExpandedSheetView.a = true;
            }
            tjaVar.c(activity, primaryActionButton, expandableSheetView2.f, tioVar.H, wgiVar);
            if (tjnVar.f(i)) {
                java.lang.String str6 = tioVar.E;
                java.lang.String str7 = tioVar.F;
                defpackage.tiv tivVar = tioVar.H;
                wgi wgiVar2 = tioVar.G;
                tjaVar.f(activity, str6, expandableSheetView2.f);
            }
            tioVar.K = aike.a;
        } else if (ldVar instanceof defpackage.tie) {
            defpackage.tke tkeVar = (defpackage.tke) this.f.b(i);
            defpackage.tie tieVar = (defpackage.tie) ldVar;
            android.app.Activity activity2 = this.g;
            java.lang.String str8 = this.j;
            java.lang.String string2 = tkeVar.getString(0);
            wgi wgiVar3 = tkeVar instanceof defpackage.tke ? (wgi) this.m.getOrDefault(string2, wgi.a) : (wgi) this.l.getOrDefault(string2, wgi.a);
            tieVar.E = activity2;
            tieVar.z = tkeVar.getString(3);
            tieVar.D = i;
            android.content.Context context2 = tieVar.y;
            int i5 = defpackage.thq.a;
            lvo lvoVarA = ((thp) agab.aH(context2, thp.class)).iz().a();
            int iOrdinal = lvoVarA.ordinal();
            if (iOrdinal == 0) {
                i4 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new java.lang.AssertionError(java.lang.String.format("Unsupported display order: %s", lvoVarA));
                }
                i4 = 5;
            }
            java.lang.String string3 = tkeVar.getString(i4);
            j$.util.Optional optionalBU2 = mni.bU(context2.getResources(), tkeVar.getInt(1), tkeVar.getString(2));
            if (true == optionalBU2.isPresent()) {
                optionalBU2 = j$.util.Optional.ofNullable((java.lang.String) optionalBU2.get());
            }
            java.lang.String str9 = (java.lang.String) optionalBU2.orElse("");
            akzx akzxVarM2 = defpackage.abvz.a.m();
            akzxVarM2.u();
            defpackage.abvz abvzVar5 = (defpackage.abvz) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string3);
            abvzVar5.b |= 1;
            abvzVar5.c = string3;
            akzxVarM2.u();
            defpackage.abvz abvzVar6 = (defpackage.abvz) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str9);
            abvzVar6.b |= 2;
            abvzVar6.d = str9;
            java.lang.String string4 = android.text.TextUtils.isEmpty(str9) ? tieVar.z : context2.getString(2132017873, str9, tieVar.z);
            int iC = urg.c(context2, 2130969072);
            android.widget.TextView textView2 = tieVar.u;
            textView2.setText(pez.aq(context2, defpackage.thr.a(str8, string3, context2, iC)));
            tieVar.v.setText(pez.aq(context2, defpackage.thr.b(str8, string4, iC)));
            textView2.setVisibility(0);
            android.widget.QuickContactBadge quickContactBadge = tieVar.t;
            quickContactBadge.setVisibility(0);
            akzx akzxVarM3 = defpackage.abwd.a.m();
            akzxVarM3.u();
            defpackage.abwd abwdVar = (defpackage.abwd) akzxVarM3.b;
            j$.util.Objects.requireNonNull(string3);
            abwdVar.b |= 1;
            abwdVar.c = string3;
            java.lang.String str10 = tieVar.z;
            akzxVarM3.u();
            defpackage.abwd abwdVar2 = (defpackage.abwd) akzxVarM3.b;
            j$.util.Objects.requireNonNull(str10);
            abwdVar2.b |= 2;
            abwdVar2.d = str10;
            long j = tkeVar.getLong(6);
            akzxVarM3.u();
            defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVarM3.b;
            abwdVar3.b |= 8;
            abwdVar3.f = j;
            java.lang.String string5 = tkeVar.getString(7);
            if (string5 != null) {
                akzxVarM3.u();
                defpackage.abwd abwdVar4 = (defpackage.abwd) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string5);
                abwdVar4.b |= 4;
                abwdVar4.e = string5;
            }
            defpackage.abwd abwdVar5 = (defpackage.abwd) akzxVarM3.p();
            akzxVarM2.u();
            defpackage.abvz abvzVar7 = (defpackage.abvz) akzxVarM2.b;
            j$.util.Objects.requireNonNull(abwdVar5);
            abvzVar7.f = abwdVar5;
            abvzVar7.b |= 8;
            luu.b(context2).c(quickContactBadge, android.provider.ContactsContract.Contacts.getLookupUri(tkeVar.getLong(0), tkeVar.getString(8)), tkeVar.getLong(6), string5 == null ? null : android.net.Uri.parse(string5), string3);
            defpackage.abvz abvzVar8 = (defpackage.abvz) akzxVarM2.p();
            defpackage.tjn tjnVar2 = tieVar.A;
            if (tjnVar2.f(i)) {
                com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView3 = tieVar.C;
                tjnVar2.d(expandableSheetView3);
                expandableSheetView3.f();
            } else {
                tieVar.C.e();
            }
            int i6 = tkeVar.getInt(9);
            defpackage.wdi wdiVar2 = new defpackage.wdi();
            wdiVar2.e = tieVar.H;
            wdiVar2.f(tieVar.z);
            wdiVar2.g(i);
            wdiVar2.d(abvzVar8);
            wdiVar2.e(i6);
            defpackage.tiv tivVarC = wdiVar2.c();
            defpackage.tja tjaVar2 = tieVar.B;
            com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton2 = tieVar.w;
            com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView4 = tieVar.C;
            tjaVar2.c(activity2, primaryActionButton2, expandableSheetView4.f, tivVarC, wgiVar3);
            if (tjnVar2.f(i)) {
                tjaVar2.a(activity2, tieVar.z, expandableSheetView4.f);
            }
            primaryActionButton2.setVisibility(0);
            tieVar.x.setVisibility(8);
            tieVar.G = aike.a;
        } else if (ldVar instanceof defpackage.thn) {
            defpackage.thn thnVar = (defpackage.thn) ldVar;
            android.app.Activity activity3 = this.g;
            defpackage.thk thkVar = (defpackage.thk) this.f.b(i);
            java.lang.String str11 = this.j;
            wgi wgiVar4 = this.a;
            thnVar.E = activity3;
            thnVar.D = i;
            thnVar.x = thkVar.getString(12);
            if (thnVar.x == null) {
                thnVar.x = thkVar.getString(11);
            }
            android.content.Context context3 = thnVar.t;
            thnVar.u.setText(pez.aq(context3, defpackage.thr.b(str11, thnVar.x, urg.c(context3, 2130969072))));
            android.widget.TextView textView3 = thnVar.v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string6 = thkVar.getString(10);
            if (!android.text.TextUtils.isEmpty(string6)) {
                arrayList.add(string6);
            }
            long j2 = thkVar.getLong(3);
            aazc aazcVar = thnVar.J;
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            if (epochMilli - j2 < 3600000) {
                charSequenceC = android.text.format.DateUtils.getRelativeTimeSpanString(j2, epochMilli, 60000L, 262144).toString().replace(".", "");
            } else if (j2 + 86400000 > epochMilli) {
                charSequenceC = android.text.format.DateUtils.formatDateTime(context3, j2, 1);
            } else if (j2 + 604800000 > epochMilli) {
                charSequenceC = defpackage.thn.D(android.text.format.DateUtils.formatDateTime(context3, j2, 2));
            } else {
                charSequenceC = j2 + 31449600000L > epochMilli ? defpackage.thn.C(context3, j2, false) : defpackage.thn.C(context3, j2, true);
            }
            arrayList.add(charSequenceC);
            textView3.setText(android.text.TextUtils.join(" • ", arrayList));
            akzx akzxVarM4 = defpackage.abvz.a.m();
            java.lang.String strC = dxt.a().c(thnVar.x);
            akzxVarM4.u();
            defpackage.abvz abvzVar9 = (defpackage.abvz) akzxVarM4.b;
            j$.util.Objects.requireNonNull(strC);
            abvzVar9.b |= 1;
            abvzVar9.c = strC;
            defpackage.abvz abvzVar10 = (defpackage.abvz) akzxVarM4.p();
            luu.b(context3).c(thnVar.w, (android.net.Uri) null, 0L, (android.net.Uri) null, thnVar.x);
            defpackage.tjn tjnVar3 = thnVar.y;
            if (tjnVar3.f(i)) {
                com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView5 = thnVar.A;
                tjnVar3.d(expandableSheetView5);
                expandableSheetView5.f();
            } else {
                thnVar.A.e();
            }
            defpackage.alib alibVar = new defpackage.alib();
            alibVar.i(abvzVar10);
            java.lang.String str12 = thnVar.x;
            alibVar.a = str12;
            alibVar.j(str12);
            alibVar.k(i);
            alibVar.l(thnVar.H);
            alibVar.h(true);
            defpackage.tiw tiwVarG = alibVar.g();
            defpackage.tja tjaVar3 = thnVar.z;
            com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton3 = thnVar.B;
            com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView6 = thnVar.A;
            tjaVar3.d(activity3, primaryActionButton3, expandableSheetView6.f, tiwVarG, wgiVar4);
            if (tjnVar3.f(i)) {
                tjaVar3.a(activity3, thnVar.x, expandableSheetView6.f);
            }
            primaryActionButton3.setVisibility(0);
            thnVar.C.setVisibility(8);
            thnVar.G = aike.a;
        } else if (ldVar instanceof defpackage.tih) {
            defpackage.tih tihVar = (defpackage.tih) ldVar;
            android.app.Activity activity4 = this.g;
            defpackage.tif tifVar = (defpackage.tif) this.f.b(i);
            java.lang.String str13 = this.j;
            wgi wgiVar5 = this.a;
            tihVar.F = activity4;
            tihVar.z = tifVar.getString(3);
            tihVar.E = i;
            java.lang.String string7 = tifVar.getString(4);
            if (android.text.TextUtils.isEmpty(string7) && (string7 = tifVar.getString(13)) == null) {
                java.lang.String str14 = tihVar.z;
                java.lang.String country = java.util.Locale.getDefault().getCountry();
                java.lang.String strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber(str14);
                string7 = android.telephony.PhoneNumberUtils.formatNumberToE164(strNormalizeNumber, country);
                if (string7 == null) {
                    string7 = strNormalizeNumber;
                }
            }
            try {
                j$.util.Optional optionalBU3 = mni.bU(tihVar.t.getResources(), tifVar.getInt(1), tifVar.getString(2));
                if (true == optionalBU3.isPresent()) {
                    optionalBU3 = j$.util.Optional.ofNullable((java.lang.String) optionalBU3.get());
                }
                str = (java.lang.String) optionalBU3.orElse("");
            } catch (java.lang.NumberFormatException unused) {
                defpackage.tih.s.b().l("com/android/dialer/searchfragment/cp2/extendeddirectories/Cp2ExtendedDirectoryContactViewHolder", "getLabel", 247, "Cp2ExtendedDirectoryContactViewHolder.java").v("Invalid number format for Projections.PHONE_TYPE_INDEX.");
            }
            java.lang.String string8 = android.text.TextUtils.isEmpty(str) ? tihVar.z : tihVar.t.getString(2132017873, str, tihVar.z);
            android.content.Context context4 = tihVar.t;
            int iC2 = urg.c(context4, 2130969072);
            android.widget.TextView textView4 = tihVar.u;
            textView4.setText(pez.aq(context4, defpackage.thr.a(str13, string7, context4, iC2)));
            tihVar.v.setText(pez.aq(context4, defpackage.thr.b(str13, string8, iC2)));
            if (defpackage.sns.e(tifVar.a())) {
                tihVar.x.setVisibility(0);
            } else {
                tihVar.x.setVisibility(8);
            }
            akzx akzxVarM5 = defpackage.abvz.a.m();
            akzxVarM5.u();
            defpackage.abvz abvzVar11 = (defpackage.abvz) akzxVarM5.b;
            j$.util.Objects.requireNonNull(string7);
            abvzVar11.b |= 1;
            abvzVar11.c = string7;
            akzxVarM5.u();
            defpackage.abvz abvzVar12 = (defpackage.abvz) akzxVarM5.b;
            j$.util.Objects.requireNonNull(str);
            abvzVar12.b |= 2;
            abvzVar12.d = str;
            textView4.setVisibility(0);
            android.widget.QuickContactBadge quickContactBadge2 = tihVar.w;
            quickContactBadge2.setVisibility(0);
            java.lang.String string9 = tifVar.getString(7);
            if (string9 != null) {
                akzxVarM5.u();
                defpackage.abvz abvzVar13 = (defpackage.abvz) akzxVarM5.b;
                j$.util.Objects.requireNonNull(string9);
                abvzVar13.b |= 4;
                abvzVar13.e = string9;
            }
            java.lang.String str15 = string7;
            luu.b(context4).c(quickContactBadge2, android.net.Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, tifVar.getString(8)).buildUpon().appendQueryParameter("directory", java.lang.String.valueOf(tifVar.a())).build(), tifVar.getLong(6), string9 == null ? null : android.net.Uri.parse(string9), str15);
            defpackage.abvz abvzVar14 = (defpackage.abvz) akzxVarM5.p();
            defpackage.tjn tjnVar4 = tihVar.A;
            if (tjnVar4.f(i)) {
                com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView7 = tihVar.C;
                tjnVar4.d(expandableSheetView7);
                expandableSheetView7.f();
            } else {
                tihVar.C.e();
            }
            defpackage.alib alibVar2 = new defpackage.alib();
            alibVar2.i(abvzVar14);
            alibVar2.a = str15;
            alibVar2.j(tihVar.z);
            alibVar2.k(i);
            alibVar2.l(tihVar.I);
            alibVar2.h(false);
            defpackage.tiw tiwVarG2 = alibVar2.g();
            defpackage.tja tjaVar4 = tihVar.B;
            com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton primaryActionButton4 = tihVar.D;
            com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView8 = tihVar.C;
            tjaVar4.d(activity4, primaryActionButton4, expandableSheetView8.f, tiwVarG2, wgiVar5);
            if (tjnVar4.f(i)) {
                tjaVar4.a(activity4, tihVar.z, expandableSheetView8.f);
            }
            tihVar.y.setVisibility(8);
            primaryActionButton4.setVisibility(0);
            tihVar.H = aike.a;
        } else if (ldVar instanceof defpackage.tjs) {
            ((defpackage.tjs) ldVar).s.setText(this.f.b(i).b());
            dzs.j(ldVar.a, true);
        } else {
            if (!(ldVar instanceof defpackage.tju)) {
                throw new java.lang.IllegalStateException("Invalid ViewHolder: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ldVar))));
            }
            defpackage.tju tjuVar = (defpackage.tju) ldVar;
            defpackage.tjw tjwVar = this.f;
            int iIntValue = ((java.lang.Integer) tjwVar.d.get((i - tjwVar.a()) + tjwVar.d.size())).intValue();
            java.lang.String str16 = android.text.TextUtils.isEmpty(this.k) ? this.j : this.k;
            wgi wgiVar6 = this.a;
            tjuVar.v = iIntValue;
            tjuVar.w = i;
            tjuVar.x = str16;
            tjuVar.y = wgiVar6;
            switch (iIntValue) {
                case 1:
                    tjuVar.u.setText(2132020049);
                    tjuVar.t.setImageResource(2131231981);
                    break;
                case 2:
                    tjuVar.u.setText(2132020048);
                    tjuVar.t.setImageResource(2131231981);
                    break;
                case 3:
                    tjuVar.u.setText(2132020054);
                    tjuVar.t.setImageResource(2131231435);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    if (wgiVar6.d) {
                        tjuVar.u.setContentDescription(tjuVar.s.getString(2132020050));
                        i2 = 2131231081;
                    } else {
                        i2 = 2131231080;
                    }
                    tjuVar.u.setText(2132020052);
                    tjuVar.t.setImageResource(i2);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    android.widget.TextView textView5 = tjuVar.u;
                    android.content.Context context5 = tjuVar.s;
                    textView5.setText(pez.aq(context5, context5.getString(2132020053, str16)));
                    if (wgiVar6.c) {
                        textView5.setContentDescription(context5.getString(2132020051, str16));
                        i3 = 2131231083;
                    } else {
                        i3 = 2131231060;
                    }
                    tjuVar.t.setImageResource(i3);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    break;
                default:
                    throw new java.lang.IllegalStateException(a.bj(iIntValue, "Invalid action: "));
            }
        }
        java.lang.Object obj = ldVar.a;
        if (obj instanceof com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) {
            com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView9 = (com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView) obj;
            boolean zD = i == 0 ? true : D(b(i - 1));
            boolean zD2 = i == a() + (-1) ? true : D(b(i + 1));
            ahbv ahbvVar = this.p;
            expandableSheetView9.setBackgroundDrawable(ahbvVar.A(new inx(zD, zD2)));
            android.view.ViewGroup.LayoutParams layoutParams = expandableSheetView9.getLayoutParams();
            aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(ahbvVar.z(), 0, ahbvVar.z(), ((java.lang.Number) ahbvVar.b.a()).intValue());
            expandableSheetView9.findViewById(2131428208).setPadding(0, 0, 0, expandableSheetView9.getContext().getResources().getDimensionPixelSize(2131167353));
        }
    }

    final void w(defpackage.thk thkVar) {
        defpackage.tjw tjwVar = this.f;
        if (thkVar != tjwVar.b) {
            if (thkVar == null) {
                thkVar = null;
            }
            tjwVar.b = thkVar;
            e();
        }
    }

    final void x(defpackage.tif tifVar) {
        defpackage.tjw tjwVar = this.f;
        if (tifVar != tjwVar.c) {
            if (tifVar == null) {
                tifVar = null;
            }
            tjwVar.c = tifVar;
            e();
        }
    }

    final void y(java.lang.String str, java.lang.String str2) {
        this.j = str;
        this.k = str2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    final void z(java.util.List list) {
        defpackage.tjw tjwVar = this.f;
        if (tjwVar.d.equals(list)) {
            return;
        }
        tjwVar.d = list;
        e();
    }
}
