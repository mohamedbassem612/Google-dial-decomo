package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pnb {
    public static final aimz a = aimz.i("com/android/dialer/incall/contactgrid/ContactGridSubscriber");
    public final android.content.Context b;
    public final rlv c;
    public boolean d;
    public defpackage.pnd e;
    public defpackage.pom f;
    public boolean g;
    public final java.util.Set h;
    public java.util.Set i;
    public java.lang.Long j;
    public final zpm k;
    public final gpd l;
    public final aogc m;
    private final defpackage.pnp n;
    private final aoin o;
    private final tec p;
    private final aoin q;
    private final oph r;
    private final defpackage.pna s;
    private final ops t;
    private final ajwr u;

    public pnb(android.content.Context context, aazc aazcVar, ops opsVar, defpackage.pnp pnpVar, ajwr ajwrVar, zpm zpmVar, aoin aoinVar, aogc aogcVar, gat gatVar, gpd gpdVar, rlv rlvVar, tec tecVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(ajwrVar, "subscriptionMixin");
        aooh.f(zpmVar, "callScopes");
        aooh.f(aoinVar, "hideDefaultAvatarIncallOnePlusProvider");
        aooh.f(gatVar, "placeOutgoingCallInteractionContextRegistry");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar2, "enableFlippablesVideoCalling");
        this.b = context;
        this.t = opsVar;
        this.n = pnpVar;
        this.u = ajwrVar;
        this.k = zpmVar;
        this.o = aoinVar;
        this.m = aogcVar;
        this.l = gpdVar;
        this.c = rlvVar;
        this.p = tecVar;
        this.q = aoinVar2;
        this.f = new defpackage.pom(null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, 524287);
        this.r = oph.a();
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.pmz.class);
        aooh.e(enumSetNoneOf, "noneOf(...)");
        this.h = enumSetNoneOf;
        this.i = aoke.a;
        this.s = new defpackage.pna(this);
    }

    public static final boolean o(defpackage.zpo zpoVar) {
        return zpoVar == defpackage.zpo.c || zpoVar == defpackage.zpo.i;
    }

    private final android.widget.ImageView p() {
        j$.util.Optional optional = d().h;
        aooh.e(optional, "avatarImageView(...)");
        return (android.widget.ImageView) aooh.q(optional);
    }

    public final android.view.View a() {
        j$.util.Optional optional = d().a;
        aooh.e(optional, "contactGridLayout(...)");
        return (android.view.View) aooh.q(optional);
    }

    public final android.widget.TextView b() {
        j$.util.Optional optional;
        defpackage.pnd pndVar = this.e;
        if (pndVar == null || (optional = pndVar.b) == null) {
            return null;
        }
        return (android.widget.TextView) aooh.q(optional);
    }

    public final defpackage.pmy c(java.lang.String str) {
        j$.util.Optional optionalE = this.k.e(str);
        aooh.e(optionalE, "get(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
        if (apqrVar != null) {
            return (defpackage.pmy) apqrVar.a(defpackage.pmy.class);
        }
        return null;
    }

    public final defpackage.pnd d() {
        defpackage.pnd pndVar = this.e;
        if (pndVar != null) {
            return pndVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public final void e() {
        android.view.View viewA = a();
        if (viewA != null) {
            viewA.setVisibility(8);
        }
    }

    public final void f(mce mceVar, java.lang.String str) {
        this.l.i(str).b(mceVar);
    }

    public final void g(java.lang.String str) {
        f(mce.gR, str);
        h(str, qbc.fG, null, false);
    }

    public final void h(java.lang.String str, qbc qbcVar, defpackage.pmz pmzVar, boolean z) {
        defpackage.pmy pmyVarC = c(str);
        if (pmyVarC != null) {
            if (z) {
                pmyVarC.cp().c(qbcVar);
            } else {
                pmyVarC.cp().a(qbcVar);
            }
            if (pmzVar != null) {
                this.h.add(pmzVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aonj, java.lang.Object] */
    public final void i() {
        j$.util.Optional optional = d().f;
        defpackage.pmv pmvVar = new defpackage.pmv(new opy(this, 19), 0);
        if (true == optional.isPresent()) {
            pmvVar.a.a(optional.get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aonj, java.lang.Object] */
    public final void j(defpackage.pnd pndVar) {
        ahoq ahoqVarW = ahvr.W(491, "ContactGridSubscriber_setViews");
        try {
            this.e = pndVar;
            j$.util.Optional optional = pndVar.c;
            defpackage.pmv pmvVar = new defpackage.pmv(new defpackage.pmu(5), 7);
            if (true == optional.isPresent()) {
                pmvVar.a.a(optional.get());
            }
            j$.util.Optional optional2 = pndVar.d;
            defpackage.pmv pmvVar2 = new defpackage.pmv(new defpackage.pmu(6), 8);
            if (true == optional2.isPresent()) {
                pmvVar2.a.a(optional2.get());
            }
            l(this.f);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    public final void k() {
        lme lmeVar = new lme(20);
        defpackage.pnp pnpVar = this.n;
        defpackage.pnm pnmVar = new defpackage.pnm(pnpVar);
        defpackage.ulw ulwVar = (defpackage.ulw) pnpVar.c.b;
        zpy zpyVar = (zpy) ulwVar.a.a();
        zpyVar.getClass();
        ((aazc) ulwVar.b.a()).getClass();
        ajct ajctVar = (ajct) ulwVar.c.a();
        ajctVar.getClass();
        this.u.n(new defpackage.zpv(zpyVar, ajctVar, defpackage.pno.class, lmeVar, pnmVar), this.s);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0080 A[Catch: all -> 0x062f, TryCatch #3 {all -> 0x062f, blocks: (B:3:0x0011, B:5:0x0030, B:6:0x0039, B:8:0x004f, B:10:0x0055, B:12:0x0059, B:13:0x0060, B:15:0x0067, B:17:0x006d, B:19:0x007c, B:20:0x0080, B:14:0x0064, B:21:0x0090, B:23:0x0096, B:25:0x009c, B:26:0x00cf, B:30:0x00f9, B:32:0x0114, B:33:0x011d, B:34:0x0143, B:36:0x0149, B:38:0x015a, B:45:0x0170, B:47:0x0174, B:49:0x017a, B:51:0x0190, B:52:0x0199, B:54:0x01af, B:55:0x01b8, B:57:0x01ce, B:58:0x01d8, B:60:0x01ee, B:61:0x01f7, B:63:0x020d, B:64:0x0216, B:66:0x022e, B:67:0x0237, B:69:0x024f, B:70:0x0258, B:72:0x026f, B:73:0x0278, B:76:0x0286, B:78:0x029c, B:79:0x02a5, B:81:0x02bb, B:82:0x02c4, B:84:0x02c8, B:86:0x02e0, B:87:0x02e9, B:89:0x0301, B:105:0x03ab, B:107:0x03af, B:109:0x03c9, B:110:0x03d2, B:112:0x03ec, B:113:0x03f5, B:115:0x040f, B:122:0x045d, B:124:0x0477, B:125:0x0480, B:127:0x049a, B:128:0x04a3, B:130:0x04b6, B:132:0x04c1, B:133:0x04c8, B:134:0x04e3, B:136:0x04e9, B:138:0x04f7, B:139:0x04f9, B:140:0x04fd, B:142:0x050b, B:143:0x051a, B:145:0x0520, B:147:0x053e, B:149:0x0546, B:162:0x0560, B:169:0x056c, B:186:0x05c8, B:170:0x0584, B:171:0x0589, B:173:0x058c, B:175:0x0596, B:178:0x059d, B:180:0x05a7, B:181:0x05b2, B:183:0x05b7, B:185:0x05c1, B:188:0x05d0, B:189:0x05d1, B:190:0x05d5, B:192:0x05db, B:199:0x0617, B:200:0x0626, B:193:0x05e5, B:195:0x05fd, B:116:0x0419, B:118:0x0433, B:119:0x043c, B:121:0x0454, B:90:0x030c, B:92:0x0322, B:93:0x032b, B:95:0x0341, B:96:0x034b, B:98:0x0363, B:99:0x036c, B:101:0x0383, B:102:0x038c, B:104:0x03a2, B:205:0x062b, B:206:0x062e, B:27:0x00d7, B:29:0x00f0, B:203:0x0629), top: B:219:0x0011, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v57, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [aonj, java.lang.Object] */
    public final void l(defpackage.pom pomVar) {
        android.content.Context context;
        int i;
        aooh.f(pomVar, "data");
        ahoq ahoqVarW = ahvr.W(493, "ContactGridSubscriber_updateUi");
        try {
            this.j = pomVar.b;
            j$.util.Optional optional = d().b;
            defpackage.pmv pmvVar = new defpackage.pmv(new oen(pomVar, this, 15, (byte[]) null), 6);
            if (true == optional.isPresent()) {
                pmvVar.a.a(optional.get());
            }
            j$.util.Optional optional2 = d().g;
            aooh.e(optional2, "validationIconImageView(...)");
            android.widget.ImageView imageView = (android.widget.ImageView) aooh.q(optional2);
            if (imageView != null) {
                defpackage.pol polVar = pomVar.d;
                if (polVar.b) {
                    java.lang.Integer num = polVar.c;
                    if (num != null) {
                        imageView.setImageResource(num.intValue());
                    }
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                defpackage.poh pohVar = pomVar.i;
                if (pohVar != defpackage.poh.c) {
                    android.content.Context context2 = imageView.getContext();
                    aooh.e(context2, "getContext(...)");
                    if (m(pohVar, context2)) {
                        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(this.b.getColor(2131099860)));
                    } else {
                        imageView.clearColorFilter();
                    }
                } else {
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(this.b.getColor(2131099860)));
                }
            }
            android.widget.ImageView imageViewP = p();
            if (imageViewP != null && n()) {
                ops opsVar = this.t;
                defpackage.abwd abwdVar = pomVar.c.a;
                oph ophVar = this.r;
                defpackage.ahhk ahhkVarD = opsVar.d(opsVar.c(imageViewP, abwdVar), abwdVar);
                int iBp = wsc.bp(opsVar.c, defpackage.urp.DURATION_SHORT_3);
                defpackage.ycp ycpVar = new defpackage.ycp();
                defpackage.yfd yfdVar = new defpackage.yfd(iBp);
                anty.aI(yfdVar, "Argument must not be null");
                ycpVar.a = yfdVar;
                defpackage.ahhk ahhkVarAa = ahhkVarD.h(ycpVar);
                opsVar.i(ahhkVarAa, abwdVar, ophVar, false);
                ahhkVarAa.m(imageViewP);
            }
            ahoq ahoqVarW2 = ahvr.W(492, "ContactGridSubscriber_updateMiddleRow");
            try {
                j$.util.Optional optional3 = d().c;
                defpackage.pmv pmvVar2 = new defpackage.pmv(new oen(pomVar, this, 14, (byte[]) null), 5);
                if (true == optional3.isPresent()) {
                    pmvVar2.a.a(optional3.get());
                }
                ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                j$.util.Optional optional4 = d().d;
                defpackage.pmt pmtVar = new defpackage.pmt(new oen(pomVar, this, 10, (byte[]) null), 5);
                if (true == optional4.isPresent()) {
                    pmtVar.a.a(optional4.get());
                }
                defpackage.poh pohVar2 = pomVar.i;
                java.util.Iterator it = ajsz.bb(new j$.util.Optional[]{d().d, d().n, d().k}).iterator();
                do {
                    if (!it.hasNext()) {
                        context = null;
                        break;
                    }
                    j$.util.Optional optional5 = (j$.util.Optional) it.next();
                    aooh.c(optional5);
                    android.view.View view = (android.view.View) aooh.q(optional5);
                    context = view != null ? view.getContext() : null;
                } while (context == null);
                if (context != null) {
                    if (pohVar2 == defpackage.poh.c || m(pohVar2, context)) {
                        j$.util.Optional optional6 = d().d;
                        defpackage.pmt pmtVar2 = new defpackage.pmt(new oou(19), 15);
                        if (true == optional6.isPresent()) {
                            pmtVar2.a.a(optional6.get());
                        }
                        j$.util.Optional optional7 = d().n;
                        defpackage.pmt pmtVar3 = new defpackage.pmt(new defpackage.pmu(0), 16);
                        if (true == optional7.isPresent()) {
                            pmtVar3.a.a(optional7.get());
                        }
                        j$.util.Optional optional8 = d().k;
                        defpackage.pmt pmtVar4 = new defpackage.pmt(new defpackage.pmu(2), 17);
                        if (true == optional8.isPresent()) {
                            pmtVar4.a.a(optional8.get());
                        }
                    } else {
                        j$.util.Optional optional9 = d().d;
                        defpackage.pmt pmtVar5 = new defpackage.pmt(new defpackage.pmu(3), 18);
                        if (true == optional9.isPresent()) {
                            pmtVar5.a.a(optional9.get());
                        }
                        j$.util.Optional optional10 = d().n;
                        defpackage.pmt pmtVar6 = new defpackage.pmt(new oou(11), 1);
                        if (true == optional10.isPresent()) {
                            pmtVar6.a.a(optional10.get());
                        }
                        j$.util.Optional optional11 = d().k;
                        defpackage.pmt pmtVar7 = new defpackage.pmt(new oou(12), 0);
                        if (true == optional11.isPresent()) {
                            pmtVar7.a.a(optional11.get());
                        }
                    }
                }
                j$.util.Optional optional12 = d().i;
                defpackage.pmt pmtVar8 = new defpackage.pmt(new opy(pomVar, 14), 2);
                if (true == optional12.isPresent()) {
                    pmtVar8.a.a(optional12.get());
                }
                j$.util.Optional optional13 = d().k;
                defpackage.pmt pmtVar9 = new defpackage.pmt(new opy(pomVar, 15), 3);
                if (true == optional13.isPresent()) {
                    pmtVar9.a.a(optional13.get());
                }
                defpackage.pog pogVar = pomVar.f;
                java.lang.CharSequence charSequence = pogVar.a;
                int i2 = 4;
                if (!pogVar.e || charSequence == null) {
                    j$.util.Optional optional14 = d().j;
                    defpackage.pmt pmtVar10 = new defpackage.pmt(new oou(14), 4);
                    if (true == optional14.isPresent()) {
                        pmtVar10.a.a(optional14.get());
                    }
                    j$.util.Optional optional15 = d().e;
                    defpackage.pmt pmtVar11 = new defpackage.pmt(new oou(15), 6);
                    if (true == optional15.isPresent()) {
                        pmtVar11.a.a(optional15.get());
                    }
                    j$.util.Optional optional16 = d().l;
                    defpackage.pmt pmtVar12 = new defpackage.pmt(new oou(16), 7);
                    if (true == optional16.isPresent()) {
                        pmtVar12.a.a(optional16.get());
                    }
                } else {
                    j$.util.Optional optional17 = d().j;
                    defpackage.pmt pmtVar13 = new defpackage.pmt(new oou(13), 19);
                    if (true == optional17.isPresent()) {
                        pmtVar13.a.a(optional17.get());
                    }
                    j$.util.Optional optional18 = d().e;
                    defpackage.pmv pmvVar3 = new defpackage.pmv(new defpackage.pmu(4), i2);
                    if (true == optional18.isPresent()) {
                        pmvVar3.a.a(optional18.get());
                    }
                    if (pogVar.c) {
                        j$.util.Optional optional19 = d().l;
                        defpackage.pmv pmvVar4 = new defpackage.pmv(new defpackage.pmu(7), 10);
                        if (true == optional19.isPresent()) {
                            pmvVar4.a.a(optional19.get());
                        }
                        j$.util.Optional optional20 = d().a;
                        defpackage.oys oysVar = new defpackage.oys(new oen(this, charSequence, 7), 14);
                        if (true == optional20.isPresent()) {
                            oysVar.a.a(optional20.get());
                        }
                    } else {
                        j$.util.Optional optional21 = d().l;
                        defpackage.oys oysVar2 = new defpackage.oys(new oou(7), 15);
                        if (true == optional21.isPresent()) {
                            oysVar2.a.a(optional21.get());
                        }
                        j$.util.Optional optional22 = d().e;
                        defpackage.pmt pmtVar14 = new defpackage.pmt(new opy(charSequence, 16), 12);
                        if (true == optional22.isPresent()) {
                            pmtVar14.a.a(optional22.get());
                        }
                    }
                }
                if (pogVar.c) {
                    j$.util.Optional optional23 = d().m;
                    defpackage.pmt pmtVar15 = new defpackage.pmt(new oou(17), 8);
                    if (true == optional23.isPresent()) {
                        pmtVar15.a.a(optional23.get());
                    }
                    j$.util.Optional optional24 = d().l;
                    defpackage.pmt pmtVar16 = new defpackage.pmt(new oou(18), 9);
                    if (true == optional24.isPresent()) {
                        pmtVar16.a.a(optional24.get());
                    }
                    j$.util.Optional optional25 = d().n;
                    defpackage.pmt pmtVar17 = new defpackage.pmt(new oen(this, pomVar, 11), 10);
                    if (true == optional25.isPresent()) {
                        pmtVar17.a.a(optional25.get());
                    }
                } else {
                    j$.util.Optional optional26 = d().l;
                    defpackage.pmt pmtVar18 = new defpackage.pmt(new oou(20), 11);
                    if (true == optional26.isPresent()) {
                        pmtVar18.a.a(optional26.get());
                    }
                    j$.util.Optional optional27 = d().n;
                    defpackage.pmt pmtVar19 = new defpackage.pmt(new defpackage.pmu(1), 13);
                    if (true == optional27.isPresent()) {
                        pmtVar19.a.a(optional27.get());
                    }
                }
                j$.util.Optional optional28 = d().o;
                defpackage.pmt pmtVar20 = new defpackage.pmt(new mkm(pomVar, pohVar2, this, 4, (short[]) null), 14);
                if (true == optional28.isPresent()) {
                    pmtVar20.a.a(optional28.get());
                }
                j$.util.Optional optional29 = d().f;
                defpackage.pmv pmvVar5 = new defpackage.pmv(new oen(pomVar, this, 13, (byte[]) null), 3);
                if (true == optional29.isPresent()) {
                    pmvVar5.a.a(optional29.get());
                }
                j$.util.Optional optional30 = d().p;
                aooh.e(optional30, "indicatorsContainerView(...)");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) aooh.q(optional30);
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                    java.util.List<defpackage.png> list = pomVar.o;
                    if (list.isEmpty()) {
                        linearLayout.setVisibility(8);
                    } else {
                        linearLayout.setVisibility(0);
                        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(linearLayout.getContext());
                        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            defpackage.pnf pnfVarB = defpackage.pnf.b(((defpackage.png) it2.next()).e);
                            if (pnfVarB == null) {
                                pnfVarB = defpackage.pnf.UNRECOGNIZED;
                            }
                            arrayList.add(pnfVarB);
                        }
                        if (arrayList.size() != ajsz.cf(arrayList).size()) {
                            throw new java.lang.IllegalStateException("Found duplicated indicators: ".concat(ajsz.cr(arrayList, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 63)));
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
                        for (defpackage.png pngVar : list) {
                            aooh.c(layoutInflaterFrom);
                            com.airbnb.lottie.LottieAnimationView lottieAnimationViewInflate = layoutInflaterFrom.inflate(2131624104, (android.view.ViewGroup) linearLayout, false);
                            aooh.d(lottieAnimationViewInflate, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                            com.airbnb.lottie.LottieAnimationView lottieAnimationView = lottieAnimationViewInflate;
                            int i3 = pngVar.g;
                            lottieAnimationView.setContentDescription(i3 != 0 ? this.b.getString(i3) : null);
                            int i4 = pngVar.c;
                            if (i4 == 0) {
                                i = i2;
                            } else if (i4 == 2) {
                                i = 1;
                            } else if (i4 != 5) {
                                i = i4 != 7 ? 0 : 3;
                            } else {
                                i = 2;
                            }
                            if (i == 0) {
                                throw null;
                            }
                            int i5 = i - 1;
                            if (i5 == 0) {
                                lottieAnimationView.setImageDrawable(this.b.getDrawable(i4 == 2 ? ((java.lang.Integer) pngVar.d).intValue() : 0));
                            } else if (i5 == 1) {
                                lottieAnimationView.h(i4 == 5 ? ((java.lang.Integer) pngVar.d).intValue() : 0);
                                lottieAnimationView.p(-1);
                                lottieAnimationView.e();
                            } else if (i5 == 2) {
                                lottieAnimationView.setImageResource(i4 == 7 ? ((java.lang.Integer) pngVar.d).intValue() : 0);
                            } else {
                                if (i5 != 3) {
                                    throw new aois();
                                }
                                a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "toLottieAnimationView$<anonymous>", 1030, "ContactGridSubscriber.kt").v("no indicator resource set");
                            }
                            arrayList2.add(lottieAnimationView);
                            i2 = 4;
                        }
                        java.util.Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            linearLayout.addView((com.airbnb.lottie.LottieAnimationView) it3.next());
                        }
                    }
                }
                j$.util.Optional optional31 = d().n;
                defpackage.oys oysVar3 = new defpackage.oys(new oen(this, pomVar, 8), 16);
                if (true == optional31.isPresent()) {
                    oysVar3.a.a(optional31.get());
                }
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVarW2, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVarW, th3);
                throw th4;
            }
        }
    }

    public final boolean m(defpackage.poh pohVar, android.content.Context context) {
        if (pohVar == defpackage.poh.d) {
            return ((java.lang.Boolean) this.q.a()).booleanValue() || !this.p.a(context);
        }
        return false;
    }

    public final boolean n() {
        android.widget.ImageView imageViewP = p();
        if (imageViewP == null) {
            return false;
        }
        j$.util.Optional optional = d().c;
        aooh.e(optional, "middleRow(...)");
        android.widget.TextView textView = (android.widget.TextView) aooh.q(optional);
        if (textView != null && textView.getVisibility() == 8) {
            imageViewP.setVisibility(8);
            return false;
        }
        int i = this.f.c.a.b;
        if ((i & 4) == 0 && (i & 8) == 0 && ((java.lang.Boolean) this.o.a()).booleanValue()) {
            imageViewP.setVisibility(8);
            return false;
        }
        imageViewP.setVisibility(0);
        return true;
    }
}
