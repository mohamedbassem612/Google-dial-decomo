package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lyi {
    public static final aimz a = aimz.i("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer");
    static final long b;
    public final aoin A;
    public final aeki B;
    public final zjm C;
    public final gpd D;
    public final defpackage.ni E;
    public final pgi F;
    public final pgi G;
    public final rai H;
    public final aogc I;
    private final ojo J;
    private final ssq K;
    private final aoin L;
    private final gpd M;
    private final aeqx N;
    private final zjm O;
    private final zjm P;
    private final tkl Q;
    private final defpackage.vk R;
    public final agzc d;
    public final defpackage.lzt e;
    public final boolean f;
    public kiu g;
    public com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsToolbar h;
    public defpackage.lxt i;
    public final da m;
    public final defpackage.lyb n;
    public final agsm o;
    public final jys p;
    public final mau q;
    public final rlv r;
    public final ahpz s;
    public final ajct t;
    public final aoin u;
    public final defpackage.jyb w;
    public final aoin x;
    public final aoin y;
    public final aoin z;
    public final defpackage.lyh c = new defpackage.lyh(this);
    public boolean j = false;
    public final java.lang.Runnable k = new defpackage.lye(this, 1);
    final defpackage.mf l = new defpackage.lzg();
    public j$.util.Optional v = j$.util.Optional.empty();

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        b = 3000L;
    }

    public lyi(defpackage.lyc lycVar, az azVar, defpackage.lyb lybVar, agsm agsmVar, pgi pgiVar, jys jysVar, mau mauVar, rlv rlvVar, ahpz ahpzVar, ajct ajctVar, aeqx aeqxVar, gpd gpdVar, zjm zjmVar, ojo ojoVar, ssq ssqVar, zjm zjmVar2, defpackage.ni niVar, agzc agzcVar, aeki aekiVar, gpd gpdVar2, defpackage.lzt lztVar, aogc aogcVar, aoin aoinVar, aoin aoinVar2, tkl tklVar, rai raiVar, defpackage.vk vkVar, pgi pgiVar2, zjm zjmVar3, defpackage.jyb jybVar, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        kiu kiuVar = lycVar.c;
        this.g = kiuVar == null ? kiu.a : kiuVar;
        this.f = lycVar.d;
        this.m = (da) azVar;
        this.n = lybVar;
        this.o = agsmVar;
        this.F = pgiVar;
        this.p = jysVar;
        this.q = mauVar;
        this.r = rlvVar;
        this.s = ahpzVar;
        this.t = ajctVar;
        this.N = aeqxVar;
        this.M = gpdVar;
        this.C = zjmVar;
        this.J = ojoVar;
        this.K = ssqVar;
        this.O = zjmVar2;
        this.E = niVar;
        this.d = agzcVar;
        this.B = aekiVar;
        this.e = lztVar;
        this.D = gpdVar2;
        this.I = aogcVar;
        this.L = aoinVar;
        this.Q = tklVar;
        this.u = aoinVar2;
        this.H = raiVar;
        this.R = vkVar;
        this.G = pgiVar2;
        this.P = zjmVar3;
        this.w = jybVar;
        this.x = aoinVar3;
        this.y = aoinVar4;
        this.z = aoinVar5;
        this.A = aoinVar6;
    }

    public static defpackage.lyb b(kiu kiuVar, boolean z) {
        akzx akzxVarM = defpackage.lyc.a.m();
        akzxVarM.u();
        defpackage.lyc lycVar = (defpackage.lyc) akzxVarM.b;
        j$.util.Objects.requireNonNull(kiuVar);
        lycVar.c = kiuVar;
        lycVar.b |= 1;
        akzxVarM.u();
        defpackage.lyc lycVar2 = (defpackage.lyc) akzxVarM.b;
        lycVar2.b |= 2;
        lycVar2.d = z;
        defpackage.lyc lycVar3 = (defpackage.lyc) akzxVarM.p();
        defpackage.lyb lybVar = new defpackage.lyb();
        amxr.g(lybVar);
        ahgl.b(lybVar, lycVar3);
        return lybVar;
    }

    private final void j(com.google.android.material.button.MaterialButton materialButton, defpackage.mao maoVar) {
        materialButton.m(this.m.getDrawable(maoVar.c));
        j$.util.Optional optional = maoVar.b;
        if (optional.isPresent()) {
            materialButton.setContentDescription((java.lang.CharSequence) optional.orElseThrow());
        } else {
            materialButton.setContentDescription(maoVar.a);
        }
        materialButton.setOnClickListener(maoVar.e);
    }

    private final void k(android.widget.ImageView imageView, defpackage.mao maoVar) {
        imageView.setImageDrawable(this.m.getDrawable(maoVar.c));
        j$.util.Optional optional = maoVar.b;
        if (optional.isPresent()) {
            imageView.setContentDescription((java.lang.CharSequence) optional.orElseThrow());
        } else {
            imageView.setContentDescription(maoVar.a);
        }
        imageView.setEnabled(maoVar.d);
        imageView.setOnClickListener(maoVar.e);
    }

    private final void l(com.google.android.material.button.MaterialButton materialButton, j$.util.Optional optional) {
        defpackage.khd khdVar = (defpackage.khd) optional.orElse((java.lang.Object) null);
        int i = 8;
        if (khdVar == null) {
            materialButton.setVisibility(8);
            return;
        }
        materialButton.setVisibility(0);
        materialButton.m(khdVar.a());
        materialButton.setContentDescription(khdVar.b(this.N.d(this.g, true).toString()));
        materialButton.setOnClickListener(new defpackage.jjg(this, khdVar, i));
    }

    private final void m(android.widget.ImageView imageView, j$.util.Optional optional) {
        defpackage.khd khdVar = (defpackage.khd) optional.orElse((java.lang.Object) null);
        if (khdVar == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setEnabled(true);
        imageView.setImageDrawable(khdVar.a());
        imageView.setContentDescription(khdVar.b(this.N.d(this.g, true).toString()));
        imageView.setOnClickListener(new defpackage.jjg(this, khdVar, 7));
    }

    private final boolean n() {
        if (!this.g.g.isEmpty()) {
            defpackage.kiw kiwVar = this.g.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (!kiwVar.j) {
                kiu kiuVar = this.g;
                if (kiuVar.i == 1) {
                    defpackage.kiw kiwVar2 = kiuVar.r;
                    if (kiwVar2 == null) {
                        kiwVar2 = defpackage.kiw.a;
                    }
                    if (!kiwVar2.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean o() {
        tkl tklVar = this.Q;
        return tklVar.u(this.g) || tklVar.t(this.g);
    }

    public final android.support.v7.widget.RecyclerView a() {
        return ((aw) this.n).Q.findViewById(2131428773);
    }

    public final defpackage.lyn c() {
        java.lang.String strI;
        kgu kguVarB;
        aeqx aeqxVar = this.N;
        kiu kiuVar = this.g;
        if (!((java.lang.Boolean) aeqxVar.a.a()).booleanValue() || (kguVarB = aeqxVar.b(kiuVar)) == null) {
            defpackage.kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (kiwVar.r) {
                strI = kiuVar.h;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                defpackage.kiw kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (kiwVar2.j) {
                    arrayList.add(((android.content.Context) aeqxVar.b).getText(2132019474));
                } else if (((tkk) aeqxVar.f).a() && ((tkl) aeqxVar.m).t(kiuVar)) {
                    arrayList.add(aeqxVar.f(kiuVar));
                } else if (((tkl) aeqxVar.m).v(kiuVar)) {
                    arrayList.add(yee.c((android.content.Context) aeqxVar.b));
                } else {
                    j$.util.Optional optionalC = aeqxVar.c(kiuVar);
                    if (optionalC.isPresent()) {
                        arrayList.add((java.lang.CharSequence) optionalC.orElseThrow());
                    }
                    arrayList.add(aeqxVar.e(kiuVar));
                }
                if (((rsr) aeqxVar.i).r(kiuVar.i).isPresent()) {
                    strI = aeqx.i(arrayList);
                } else {
                    java.lang.Object obj = aeqxVar.g;
                    defpackage.kiw kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = defpackage.kiw.a;
                    }
                    if (android.text.TextUtils.isEmpty(((kaw) obj).a(kiwVar3)) || kiuVar.h.isEmpty()) {
                        strI = aeqx.i(arrayList);
                    } else {
                        arrayList.add(kiuVar.h);
                        strI = aeqx.i(arrayList);
                    }
                }
            }
        } else {
            strI = kguVarB.e;
        }
        akzx akzxVarM = defpackage.lyn.a.m();
        boolean z = true;
        akzx akzxVarA = this.M.a(this.g, 1);
        akzxVarM.u();
        defpackage.lyn lynVar = (defpackage.lyn) akzxVarM.b;
        abwd abwdVarP = akzxVarA.p();
        j$.util.Objects.requireNonNull(abwdVarP);
        lynVar.c = abwdVarP;
        lynVar.b |= 1;
        java.lang.String string = aeqxVar.d(this.g, true).toString();
        akzxVarM.u();
        defpackage.lyn lynVar2 = (defpackage.lyn) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        lynVar2.b |= 2;
        lynVar2.d = string;
        akzxVarM.u();
        defpackage.lyn lynVar3 = (defpackage.lyn) akzxVarM.b;
        j$.util.Objects.requireNonNull(strI);
        lynVar3.b |= 4;
        lynVar3.e = strI;
        kiu kiuVar2 = this.g;
        tkl tklVar = this.Q;
        if (!tklVar.t(kiuVar2) && !tklVar.v(kiuVar2)) {
            z = false;
        }
        akzxVarM.u();
        defpackage.lyn lynVar4 = (defpackage.lyn) akzxVarM.b;
        lynVar4.b |= 8;
        lynVar4.f = z;
        return (defpackage.lyn) akzxVarM.p();
    }

    public final void d(long j) {
        defpackage.lzt lztVar = this.e;
        aooh.f(lztVar, "state");
        lztVar.f.add(java.lang.Long.valueOf(j));
        this.F.t();
        this.r.n(rmw.hl);
        aify aifyVarP = aify.p(java.lang.String.valueOf(j));
        defpackage.joy joyVar = new defpackage.joy(4);
        rsr rsrVar = new rsr();
        rsrVar.aC(new kaw("_id").aF(aifyVarP));
        rsr rsrVarAB = rsrVar.aB();
        java.lang.Object obj = rsrVarAB.b;
        java.lang.Object obj2 = rsrVarAB.a;
        ojo ojoVar = this.J;
        ajcq ajcqVarE = ojoVar.e(android.provider.CallLog.Calls.CONTENT_URI, (java.lang.String) obj, (java.lang.String[]) obj2);
        android.content.Context context = this.m;
        defpackage.lpa.a(context.a(), "Delete call history").b(context, ajcqVarE, joyVar, new defpackage.jox(9));
    }

    public final void e() {
        defpackage.lyb lybVar = this.n;
        u uVar = new u(lybVar.J());
        ((bw) uVar).i = 8197;
        uVar.k(lybVar);
        uVar.c();
        ahvr.g(defpackage.lyj.a, this.m);
    }

    public final void f(defpackage.lzl lzlVar) {
        defpackage.lyb lybVar = this.n;
        android.view.View viewFindViewById = ((aw) lybVar).Q.findViewById(2131427581);
        kiu kiuVar = this.g;
        kgz kgzVar = (kgz) this.P.g().orElse((java.lang.Object) null);
        if (kgzVar != null && kgzVar.b(kiuVar) != null) {
            defpackage.vk vkVar = this.R;
            kiu kiuVar2 = this.g;
            aooh.f(kiuVar2, "coalescedRow");
            aigf aigfVarK = ((zzx) vkVar.a).k();
            aooh.e(aigfVarK, "get(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : aigfVarK.entrySet()) {
                defpackage.lzi lziVar = (defpackage.lzi) entry.getKey();
                defpackage.khd khdVarA = ((defpackage.lzh) ((aoin) entry.getValue()).a()).a(kiuVar2);
                aoiu aoiuVar = khdVarA != null ? new aoiu(lziVar, khdVarA) : null;
                if (aoiuVar != null) {
                    arrayList.add(aoiuVar);
                }
            }
            java.util.Map mapAR = ajsz.aR(arrayList);
            l((com.google.android.material.button.MaterialButton) ((aw) lybVar).Q.findViewById(2131429442), j$.util.Optional.ofNullable((defpackage.khd) mapAR.get(defpackage.lzi.a)));
            l((com.google.android.material.button.MaterialButton) ((aw) lybVar).Q.findViewById(2131429385), j$.util.Optional.ofNullable((defpackage.khd) mapAR.get(defpackage.lzi.b)));
            m((android.widget.ImageView) ((aw) lybVar).Q.findViewById(2131429020), j$.util.Optional.empty());
            m((android.widget.ImageView) ((aw) lybVar).Q.findViewById(2131428118), j$.util.Optional.empty());
            viewFindViewById.setVisibility(0);
            viewFindViewById.requestLayout();
            return;
        }
        kiu kiuVar3 = this.g;
        if (kiuVar3.i == 1) {
            defpackage.kiw kiwVar = kiuVar3.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            if (!kiwVar.r) {
                kiu kiuVar4 = this.g;
                defpackage.kiw kiwVar2 = kiuVar4.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (!kiwVar2.j && !kiuVar4.g.isEmpty()) {
                    mau mauVar = this.q;
                    kiu kiuVar5 = this.g;
                    wgi wgiVar = lzlVar.b;
                    defpackage.mao maoVarK = mauVar.k(kiuVar5, true, wgiVar, defpackage.nwt.CONVERSATION_HISTORY_CALL_DETAILS);
                    if (!((java.lang.Boolean) this.L.a()).booleanValue()) {
                        k((android.widget.ImageView) ((aw) lybVar).Q.findViewById(2131429020), maoVarK);
                        android.widget.TextView textView = (android.widget.TextView) ((aw) lybVar).Q.findViewById(2131429021);
                        textView.setText(maoVarK.a);
                        boolean z = maoVarK.d;
                        textView.setEnabled(z);
                        if (z) {
                            this.r.n(rmw.eY);
                        }
                    } else if (maoVarK.d) {
                        k((android.widget.ImageView) ((aw) lybVar).Q.findViewById(2131429020), maoVarK);
                        android.widget.TextView textView2 = (android.widget.TextView) ((aw) lybVar).Q.findViewById(2131429021);
                        textView2.setText(maoVarK.a);
                        textView2.setEnabled(true);
                        this.r.n(rmw.eY);
                    } else {
                        ((aw) lybVar).Q.findViewById(2131429019).setVisibility(8);
                    }
                    defpackage.mao maoVarL = mauVar.l(this.g, true, wgiVar);
                    com.google.android.material.button.MaterialButton materialButtonFindViewById = ((aw) lybVar).Q.findViewById(2131429442);
                    android.view.View viewFindViewById2 = ((aw) lybVar).Q.findViewById(2131428818);
                    android.view.View viewFindViewById3 = ((aw) lybVar).Q.findViewById(2131428855);
                    if (lzlVar.a) {
                        materialButtonFindViewById.setVisibility(8);
                        viewFindViewById2.setVisibility(0);
                        defpackage.mao maoVarI = mauVar.i(this.g, true);
                        j((com.google.android.material.button.MaterialButton) ((aw) lybVar).Q.findViewById(2131428816), maoVarI);
                        ((android.widget.TextView) ((aw) lybVar).Q.findViewById(2131428817)).setText(maoVarI.a);
                        viewFindViewById3.setVisibility(0);
                        j((com.google.android.material.button.MaterialButton) ((aw) lybVar).Q.findViewById(2131428853), maoVarL);
                    } else {
                        viewFindViewById2.setVisibility(8);
                        viewFindViewById3.setVisibility(8);
                        materialButtonFindViewById.m(this.m.getDrawable(maoVarL.c));
                        materialButtonFindViewById.setVisibility(0);
                        j$.util.Optional optional = maoVarL.b;
                        if (optional.isPresent()) {
                            materialButtonFindViewById.setContentDescription((java.lang.CharSequence) optional.orElseThrow());
                        } else {
                            materialButtonFindViewById.setContentDescription(maoVarL.a);
                        }
                        materialButtonFindViewById.setOnClickListener(maoVarL.e);
                    }
                    defpackage.mao maoVarE = mauVar.e(this.g, true);
                    k((android.widget.ImageView) ((aw) lybVar).Q.findViewById(2131428118), maoVarE);
                    android.widget.TextView textView3 = (android.widget.TextView) ((aw) lybVar).Q.findViewById(2131428119);
                    textView3.setText(maoVarE.a);
                    textView3.setEnabled(maoVarE.d);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.requestLayout();
                    return;
                }
            }
        }
        int iMax = java.lang.Math.max(viewFindViewById.getPaddingBottom(), this.m.getApplicationContext().getResources().getDimensionPixelSize(2131167215));
        viewFindViewById.setVisibility(8);
        viewFindViewById.requestLayout();
        android.support.v7.widget.RecyclerView recyclerViewA = a();
        recyclerViewA.setPadding(recyclerViewA.getPaddingLeft(), recyclerViewA.getPaddingTop(), recyclerViewA.getPaddingRight(), iMax);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:136:0x0213  */
    /* JADX WARN: Code duplicated, block: B:149:0x0239  */
    /* JADX WARN: Code duplicated, block: B:151:0x0243  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x025d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0264  */
    /* JADX WARN: Code duplicated, block: B:167:0x0274  */
    /* JADX WARN: Code duplicated, block: B:170:0x027c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0280  */
    /* JADX WARN: Code duplicated, block: B:175:0x0286  */
    /* JADX WARN: Code duplicated, block: B:178:0x0290  */
    /* JADX WARN: Code duplicated, block: B:183:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x015e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    public final void g(android.view.Menu menu) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        android.view.MenuItem menuItemFindItem;
        defpackage.kiw kiwVar;
        boolean z6;
        android.view.MenuItem menuItemFindItem2;
        zjm zjmVar;
        kiu kiuVar;
        defpackage.kiw kiwVar2;
        defpackage.kiw kiwVar3;
        rmt rmtVarB;
        defpackage.kiw kiwVar4;
        rmt rmtVarB2;
        rmt rmtVar;
        jvv jvvVar;
        defpackage.kiw kiwVar5;
        rmt rmtVarB3;
        zag zagVar;
        zag zagVar2;
        zai zaiVar;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean zIsEmpty = this.g.g.isEmpty();
        boolean z10 = !zIsEmpty;
        menu.findItem(2131427891).setVisible(z10);
        menu.findItem(2131427893).setVisible(z10);
        kiu kiuVar2 = this.g;
        boolean z11 = false;
        if (this.K.c(kiuVar2.g, kiuVar2.i)) {
            kiu kiuVar3 = this.g;
            if (kiuVar3.s) {
                z = false;
            } else {
                defpackage.kiw kiwVar6 = kiuVar3.r;
                if (kiwVar6 == null) {
                    kiwVar6 = defpackage.kiw.a;
                }
                if (kiwVar6.r) {
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        android.view.MenuItem menuItemFindItem3 = menu.findItem(2131427863);
        if (menuItemFindItem3 != null) {
            if (z) {
                defpackage.kiw kiwVar7 = this.g.r;
                if (kiwVar7 == null) {
                    kiwVar7 = defpackage.kiw.a;
                }
                if (kiwVar7.j || !o()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            } else {
                z9 = false;
            }
            menuItemFindItem3.setVisible(z9);
        }
        android.view.MenuItem menuItemFindItem4 = menu.findItem(2131427899);
        if (menuItemFindItem4 != null) {
            if (z) {
                defpackage.kiw kiwVar8 = this.g.r;
                if (kiwVar8 == null) {
                    kiwVar8 = defpackage.kiw.a;
                }
                if (kiwVar8.j) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            menuItemFindItem4.setVisible(z8);
        }
        android.view.MenuItem menuItemFindItem5 = menu.findItem(2131427862);
        defpackage.kiw kiwVar9 = this.g.r;
        if (kiwVar9 == null) {
            kiwVar9 = defpackage.kiw.a;
        }
        rmt rmtVarB4 = rmt.b(kiwVar9.o);
        if (rmtVarB4 == null) {
            rmtVarB4 = rmt.a;
        }
        boolean zEquals = rmtVarB4.equals(rmt.b);
        if (zIsEmpty || zEquals) {
            z2 = false;
        } else {
            kiu kiuVar4 = this.g;
            defpackage.kiw kiwVar10 = kiuVar4.r;
            if (kiwVar10 == null) {
                kiwVar10 = defpackage.kiw.a;
            }
            if (kiwVar10.r || kiuVar4.s) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        menuItemFindItem5.setVisible(z2);
        android.view.MenuItem menuItemFindItem6 = menu.findItem(2131427898);
        tkl tklVar = this.Q;
        boolean zU = tklVar.u(this.g);
        menuItemFindItem6.setVisible(false);
        boolean zT = tklVar.t(this.g);
        android.view.MenuItem menuItemFindItem7 = menu.findItem(2131427895);
        if (z) {
            if (zEquals || !zT) {
                z3 = false;
                z4 = true;
            } else {
                z3 = true;
            }
            menuItemFindItem7.setVisible(z3);
            android.view.MenuItem menuItemFindItem8 = menu.findItem(2131427896);
            if (z4 || zEquals || !zU || zT) {
                z5 = false;
            } else {
                z5 = true;
            }
            menuItemFindItem8.setVisible(z5);
            menuItemFindItem = menu.findItem(2131427864);
            kiwVar = this.g.r;
            if (kiwVar == null) {
                kiwVar = defpackage.kiw.a;
            }
            boolean z12 = kiwVar.j;
            if (!zEquals || zU) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (menuItemFindItem != null) {
                if (z4 || ((z12 && !z6) || o())) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                menuItemFindItem.setVisible(z7);
            }
            menuItemFindItem2 = menu.findItem(2131427887);
            android.view.MenuItem menuItemFindItem9 = menu.findItem(2131427889);
            android.view.MenuItem menuItemFindItem10 = menu.findItem(2131427888);
            android.view.MenuItem menuItemFindItem11 = menu.findItem(2131427890);
            menuItemFindItem2.setVisible(false);
            menuItemFindItem9.setVisible(false);
            menuItemFindItem10.setVisible(false);
            menuItemFindItem11.setVisible(false);
            zjmVar = this.C;
            if (zjmVar.g().isPresent()) {
                java.lang.Object obj = ((rsr) zjmVar.g().orElseThrow()).a;
                kiwVar3 = this.g.r;
                if (kiwVar3 == null) {
                    kiwVar3 = defpackage.kiw.a;
                }
                rmtVarB = rmt.b(kiwVar3.o);
                if (rmtVarB == null) {
                    rmtVarB = rmt.a;
                }
                if ((!defpackage.hhv.i(rmtVarB) || rmtVarB.equals(rmt.m)) && n()) {
                    menuItemFindItem2.setTitle(2132017902).setVisible(true);
                } else {
                    zjm zjmVar2 = this.O;
                    if (zjmVar2.g().isPresent()) {
                        jvv jvvVar2 = (jvv) zjmVar2.g().orElseThrow();
                        defpackage.kiw kiwVar11 = this.g.r;
                        if (kiwVar11 == null) {
                            kiwVar11 = defpackage.kiw.a;
                        }
                        rmt rmtVarB5 = rmt.b(kiwVar11.o);
                        if (rmtVarB5 == null) {
                            rmtVarB5 = rmt.a;
                        }
                        if (rmtVarB5.equals(rmt.a)) {
                            zag zagVar3 = kiwVar11.u;
                            if (zagVar3 == null) {
                                zagVar3 = zag.a;
                            }
                            if (jvvVar2.e(zagVar3)) {
                                zag zagVar4 = kiwVar11.u;
                                if (zagVar4 == null) {
                                    zagVar4 = zag.a;
                                }
                                zai zaiVar2 = zagVar4.c;
                                if (zaiVar2 == null) {
                                    zaiVar2 = zai.a;
                                }
                                if (jvvVar2.d(zaiVar2) && n()) {
                                    menuItemFindItem9.setTitle(2132017902).setVisible(true);
                                } else {
                                    kiwVar4 = this.g.r;
                                    if (kiwVar4 == null) {
                                        kiwVar4 = defpackage.kiw.a;
                                    }
                                    rmtVarB2 = rmt.b(kiwVar4.o);
                                    if (rmtVarB2 == null) {
                                        rmtVarB2 = rmt.a;
                                    }
                                    rmtVar = rmt.a;
                                    if (!rmtVarB2.equals(rmtVar)) {
                                        if (zjmVar2.g().isPresent()) {
                                            jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                            kiwVar5 = this.g.r;
                                            if (kiwVar5 == null) {
                                                kiwVar5 = defpackage.kiw.a;
                                            }
                                            rmtVarB3 = rmt.b(kiwVar5.o);
                                            if (rmtVarB3 == null) {
                                                rmtVarB3 = rmtVar;
                                            }
                                            if (rmtVarB3.equals(rmtVar)) {
                                                zagVar = kiwVar5.u;
                                                if (zagVar == null) {
                                                    zagVar = zag.a;
                                                }
                                                if (jvvVar.e(zagVar)) {
                                                    zagVar2 = kiwVar5.u;
                                                    if (zagVar2 == null) {
                                                        zagVar2 = zag.a;
                                                    }
                                                    zaiVar = zagVar2.c;
                                                    if (zaiVar == null) {
                                                        zaiVar = zai.a;
                                                    }
                                                    if (zaiVar.equals(zai.a)) {
                                                        menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zjmVar2.g().isPresent()) {
                                        jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                        kiwVar5 = this.g.r;
                                        if (kiwVar5 == null) {
                                            kiwVar5 = defpackage.kiw.a;
                                        }
                                        rmtVarB3 = rmt.b(kiwVar5.o);
                                        if (rmtVarB3 == null) {
                                            rmtVarB3 = rmtVar;
                                        }
                                        if (rmtVarB3.equals(rmtVar)) {
                                            zagVar = kiwVar5.u;
                                            if (zagVar == null) {
                                                zagVar = zag.a;
                                            }
                                            if (jvvVar.e(zagVar)) {
                                                zagVar2 = kiwVar5.u;
                                                if (zagVar2 == null) {
                                                    zagVar2 = zag.a;
                                                }
                                                zaiVar = zagVar2.c;
                                                if (zaiVar == null) {
                                                    zaiVar = zai.a;
                                                }
                                                if (zaiVar.equals(zai.a)) {
                                                    menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                kiwVar4 = this.g.r;
                                if (kiwVar4 == null) {
                                    kiwVar4 = defpackage.kiw.a;
                                }
                                rmtVarB2 = rmt.b(kiwVar4.o);
                                if (rmtVarB2 == null) {
                                    rmtVarB2 = rmt.a;
                                }
                                rmtVar = rmt.a;
                                if (!rmtVarB2.equals(rmtVar)) {
                                    if (zjmVar2.g().isPresent()) {
                                        jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                        kiwVar5 = this.g.r;
                                        if (kiwVar5 == null) {
                                            kiwVar5 = defpackage.kiw.a;
                                        }
                                        rmtVarB3 = rmt.b(kiwVar5.o);
                                        if (rmtVarB3 == null) {
                                            rmtVarB3 = rmtVar;
                                        }
                                        if (rmtVarB3.equals(rmtVar)) {
                                            zagVar = kiwVar5.u;
                                            if (zagVar == null) {
                                                zagVar = zag.a;
                                            }
                                            if (jvvVar.e(zagVar)) {
                                                zagVar2 = kiwVar5.u;
                                                if (zagVar2 == null) {
                                                    zagVar2 = zag.a;
                                                }
                                                zaiVar = zagVar2.c;
                                                if (zaiVar == null) {
                                                    zaiVar = zai.a;
                                                }
                                                if (zaiVar.equals(zai.a)) {
                                                    menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                                }
                                            }
                                        }
                                    }
                                } else if (zjmVar2.g().isPresent()) {
                                    jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                    kiwVar5 = this.g.r;
                                    if (kiwVar5 == null) {
                                        kiwVar5 = defpackage.kiw.a;
                                    }
                                    rmtVarB3 = rmt.b(kiwVar5.o);
                                    if (rmtVarB3 == null) {
                                        rmtVarB3 = rmtVar;
                                    }
                                    if (rmtVarB3.equals(rmtVar)) {
                                        zagVar = kiwVar5.u;
                                        if (zagVar == null) {
                                            zagVar = zag.a;
                                        }
                                        if (jvvVar.e(zagVar)) {
                                            zagVar2 = kiwVar5.u;
                                            if (zagVar2 == null) {
                                                zagVar2 = zag.a;
                                            }
                                            zaiVar = zagVar2.c;
                                            if (zaiVar == null) {
                                                zaiVar = zai.a;
                                            }
                                            if (zaiVar.equals(zai.a)) {
                                                menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            kiwVar4 = this.g.r;
                            if (kiwVar4 == null) {
                                kiwVar4 = defpackage.kiw.a;
                            }
                            rmtVarB2 = rmt.b(kiwVar4.o);
                            if (rmtVarB2 == null) {
                                rmtVarB2 = rmt.a;
                            }
                            rmtVar = rmt.a;
                            if (!rmtVarB2.equals(rmtVar) && kiwVar4.A) {
                                zag zagVar5 = kiwVar4.u;
                                if (zagVar5 == null) {
                                    zagVar5 = zag.a;
                                }
                                zai zaiVar3 = zagVar5.c;
                                if (zaiVar3 == null) {
                                    zaiVar3 = zai.a;
                                }
                                if (zaiVar3.equals(zai.a) && n()) {
                                    menuItemFindItem10.setTitle(2132017902).setVisible(true);
                                } else if (zjmVar2.g().isPresent()) {
                                    jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                    kiwVar5 = this.g.r;
                                    if (kiwVar5 == null) {
                                        kiwVar5 = defpackage.kiw.a;
                                    }
                                    rmtVarB3 = rmt.b(kiwVar5.o);
                                    if (rmtVarB3 == null) {
                                        rmtVarB3 = rmtVar;
                                    }
                                    if (rmtVarB3.equals(rmtVar)) {
                                        zagVar = kiwVar5.u;
                                        if (zagVar == null) {
                                            zagVar = zag.a;
                                        }
                                        if (jvvVar.e(zagVar)) {
                                            zagVar2 = kiwVar5.u;
                                            if (zagVar2 == null) {
                                                zagVar2 = zag.a;
                                            }
                                            zaiVar = zagVar2.c;
                                            if (zaiVar == null) {
                                                zaiVar = zai.a;
                                            }
                                            if (zaiVar.equals(zai.a)) {
                                                menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                            }
                                        }
                                    }
                                }
                            } else if (zjmVar2.g().isPresent()) {
                                jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                kiwVar5 = this.g.r;
                                if (kiwVar5 == null) {
                                    kiwVar5 = defpackage.kiw.a;
                                }
                                rmtVarB3 = rmt.b(kiwVar5.o);
                                if (rmtVarB3 == null) {
                                    rmtVarB3 = rmtVar;
                                }
                                if (rmtVarB3.equals(rmtVar) && !kiwVar5.A && (kiwVar5.y || kiwVar5.B)) {
                                    zagVar = kiwVar5.u;
                                    if (zagVar == null) {
                                        zagVar = zag.a;
                                    }
                                    if (jvvVar.e(zagVar)) {
                                        zagVar2 = kiwVar5.u;
                                        if (zagVar2 == null) {
                                            zagVar2 = zag.a;
                                        }
                                        zaiVar = zagVar2.c;
                                        if (zaiVar == null) {
                                            zaiVar = zai.a;
                                        }
                                        if (zaiVar.equals(zai.a) && n()) {
                                            menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        kiwVar4 = this.g.r;
                        if (kiwVar4 == null) {
                            kiwVar4 = defpackage.kiw.a;
                        }
                        rmtVarB2 = rmt.b(kiwVar4.o);
                        if (rmtVarB2 == null) {
                            rmtVarB2 = rmt.a;
                        }
                        rmtVar = rmt.a;
                        if (!rmtVarB2.equals(rmtVar)) {
                            if (zjmVar2.g().isPresent()) {
                                jvvVar = (jvv) zjmVar2.g().orElseThrow();
                                kiwVar5 = this.g.r;
                                if (kiwVar5 == null) {
                                    kiwVar5 = defpackage.kiw.a;
                                }
                                rmtVarB3 = rmt.b(kiwVar5.o);
                                if (rmtVarB3 == null) {
                                    rmtVarB3 = rmtVar;
                                }
                                if (rmtVarB3.equals(rmtVar)) {
                                    zagVar = kiwVar5.u;
                                    if (zagVar == null) {
                                        zagVar = zag.a;
                                    }
                                    if (jvvVar.e(zagVar)) {
                                        zagVar2 = kiwVar5.u;
                                        if (zagVar2 == null) {
                                            zagVar2 = zag.a;
                                        }
                                        zaiVar = zagVar2.c;
                                        if (zaiVar == null) {
                                            zaiVar = zai.a;
                                        }
                                        if (zaiVar.equals(zai.a)) {
                                            menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                        }
                                    }
                                }
                            }
                        } else if (zjmVar2.g().isPresent()) {
                            jvvVar = (jvv) zjmVar2.g().orElseThrow();
                            kiwVar5 = this.g.r;
                            if (kiwVar5 == null) {
                                kiwVar5 = defpackage.kiw.a;
                            }
                            rmtVarB3 = rmt.b(kiwVar5.o);
                            if (rmtVarB3 == null) {
                                rmtVarB3 = rmtVar;
                            }
                            if (rmtVarB3.equals(rmtVar)) {
                                zagVar = kiwVar5.u;
                                if (zagVar == null) {
                                    zagVar = zag.a;
                                }
                                if (jvvVar.e(zagVar)) {
                                    zagVar2 = kiwVar5.u;
                                    if (zagVar2 == null) {
                                        zagVar2 = zag.a;
                                    }
                                    zaiVar = zagVar2.c;
                                    if (zaiVar == null) {
                                        zaiVar = zai.a;
                                    }
                                    if (zaiVar.equals(zai.a)) {
                                        menuItemFindItem11.setTitle(2132017902).setVisible(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            android.view.MenuItem menuItemFindItem12 = menu.findItem(2131427897);
            kiuVar = this.g;
            if (kiuVar.i == 1) {
                kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = defpackage.kiw.a;
                }
                if (!kiwVar2.r && !kiuVar.s && this.q.p(kiuVar)) {
                    z11 = true;
                }
            }
            menuItemFindItem12.setVisible(z11);
        }
        z3 = false;
        z4 = z3;
        menuItemFindItem7.setVisible(z3);
        android.view.MenuItem menuItemFindItem13 = menu.findItem(2131427896);
        if (z4) {
            z5 = false;
        } else {
            z5 = false;
        }
        menuItemFindItem13.setVisible(z5);
        menuItemFindItem = menu.findItem(2131427864);
        kiwVar = this.g.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        boolean z13 = kiwVar.j;
        if (zEquals) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (menuItemFindItem != null) {
            if (z4) {
                z7 = false;
            } else {
                z7 = false;
            }
            menuItemFindItem.setVisible(z7);
        }
        menuItemFindItem2 = menu.findItem(2131427887);
        android.view.MenuItem menuItemFindItem14 = menu.findItem(2131427889);
        android.view.MenuItem menuItemFindItem15 = menu.findItem(2131427888);
        android.view.MenuItem menuItemFindItem16 = menu.findItem(2131427890);
        menuItemFindItem2.setVisible(false);
        menuItemFindItem14.setVisible(false);
        menuItemFindItem15.setVisible(false);
        menuItemFindItem16.setVisible(false);
        zjmVar = this.C;
        if (zjmVar.g().isPresent()) {
            java.lang.Object obj2 = ((rsr) zjmVar.g().orElseThrow()).a;
            kiwVar3 = this.g.r;
            if (kiwVar3 == null) {
                kiwVar3 = defpackage.kiw.a;
            }
            rmtVarB = rmt.b(kiwVar3.o);
            if (rmtVarB == null) {
                rmtVarB = rmt.a;
            }
            if (defpackage.hhv.i(rmtVarB)) {
                menuItemFindItem2.setTitle(2132017902).setVisible(true);
            } else {
                menuItemFindItem2.setTitle(2132017902).setVisible(true);
            }
        }
        android.view.MenuItem menuItemFindItem17 = menu.findItem(2131427897);
        kiuVar = this.g;
        if (kiuVar.i == 1) {
            kiwVar2 = kiuVar.r;
            if (kiwVar2 == null) {
                kiwVar2 = defpackage.kiw.a;
            }
            if (!kiwVar2.r) {
                z11 = true;
            }
        }
        menuItemFindItem17.setVisible(z11);
    }

    public final void h() {
        da daVar = this.m;
        if (daVar.isFinishing() || daVar.isDestroyed()) {
            a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer", "updateUiForCoalescedRow", 406, "ConversationHistoryCallDetailsFragmentPeer.java").v("updateUiForCoalescedRow called after activity is destroyed and before fragment detached from activity");
            return;
        }
        this.h.E(c());
        this.F.t();
        defpackage.lxt lxtVar = this.i;
        if (lxtVar != null) {
            lxtVar.x(lxtVar.g.a);
        }
    }

    public final boolean i() {
        return this.f && rhx.b(this.m);
    }
}
