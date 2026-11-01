package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umr extends al {
    public static final aimz ak = aimz.i("com/android/dialer/speeddial/DisambigDialog");
    public java.util.List al;
    public android.widget.LinearLayout am;
    public android.widget.CheckBox an;
    public android.view.View ao;
    private final java.util.Set ap = new acc(0);
    private defpackage.upt aq;
    private jxb ar;

    public static void aX(defpackage.upt uptVar, bo boVar, jxb jxbVar) {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "showNow", 105, "DisambigDialog.java").v("create and initialize DisambigDialog");
        defpackage.umr umrVar = new defpackage.umr();
        akzx akzxVarP = jxbVar.p();
        akzxVarP.u();
        jxb jxbVar2 = akzxVarP.b;
        jxbVar2.d = 20;
        jxbVar2.c |= 1;
        umrVar.ar = akzxVarP.p();
        umrVar.aq = uptVar;
        umrVar.al = uptVar.l;
        umrVar.r(boVar, "disambig_dialog");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    private final void aY(android.widget.LinearLayout linearLayout, java.util.List list) {
        android.view.View viewInflate = G().getLayoutInflater().inflate(2131624159, (android.view.ViewGroup) linearLayout, false);
        if (((defpackage.upl) list.get(0)).e.isEmpty()) {
            viewInflate.findViewById(2131428012).setVisibility(8);
        } else {
            ((android.widget.TextView) viewInflate.findViewById(2131428012)).setText(((defpackage.upl) list.get(0)).e);
        }
        ((android.widget.TextView) viewInflate.findViewById(2131428013)).setText(pez.aq(z(), ((defpackage.upl) list.get(0)).c));
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(2131428017);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewInflate.findViewById(2131428014);
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewInflate.findViewById(2131428018);
        java.util.Iterator it = list.iterator();
        boolean z = true;
        defpackage.upl uplVar = null;
        while (it.hasNext()) {
            defpackage.upl uplVar2 = (defpackage.upl) it.next();
            int i = uplVar2.f;
            defpackage.upk upkVarB = defpackage.upk.b(i);
            if (upkVarB == null) {
                upkVarB = defpackage.upk.UNRECOGNIZED;
            }
            if (upkVarB == defpackage.upk.RTT) {
                imageView2.setOnClickListener(new defpackage.qgq(this, uplVar2, 9));
                imageView2.setVisibility(0);
            } else {
                defpackage.upk upkVarB2 = defpackage.upk.b(i);
                if (upkVarB2 == null) {
                    upkVarB2 = defpackage.upk.UNRECOGNIZED;
                }
                defpackage.upk upkVar = defpackage.upk.IMS_VIDEO;
                if (upkVarB2 != upkVar) {
                    defpackage.upk upkVarB3 = defpackage.upk.b(i);
                    if (upkVarB3 == null) {
                        upkVarB3 = defpackage.upk.UNRECOGNIZED;
                    }
                    if (upkVarB3 != defpackage.upk.DUO) {
                        wgi wgiVar = this.aq.n;
                        if (wgiVar == null) {
                            wgiVar = wgi.a;
                        }
                        if (wgiVar.c) {
                            imageView3.setImageResource(2131231083);
                            imageView3.setContentDescription(Y(2132017237));
                        }
                        uplVar = uplVar2;
                    }
                }
                imageView.setOnClickListener(new defpackage.ahpp(wsc.bB(z()).fi(), 922, "DisambigDialog_clickVideoOption", new defpackage.qgq(this, uplVar2, 10), 0));
                defpackage.upk upkVarB4 = defpackage.upk.b(uplVar2.f);
                if (upkVarB4 == null) {
                    upkVarB4 = defpackage.upk.UNRECOGNIZED;
                }
                if (upkVarB4 == upkVar) {
                    wgi wgiVar2 = this.aq.n;
                    if (wgiVar2 == null) {
                        wgiVar2 = wgi.a;
                    }
                    if (wgiVar2.d) {
                        imageView.setImageResource(2131231081);
                        imageView.setContentDescription(Y(2132017236));
                    }
                }
                if (((java.lang.Boolean) wsc.bB(z()).hM().a()).booleanValue()) {
                    defpackage.upk upkVarB5 = defpackage.upk.b(uplVar2.f);
                    if (upkVarB5 == null) {
                        upkVarB5 = defpackage.upk.UNRECOGNIZED;
                    }
                    if (upkVarB5.equals(upkVar)) {
                        imageView.setVisibility(0);
                    } else {
                        defpackage.upk upkVarB6 = defpackage.upk.b(uplVar2.f);
                        if (upkVarB6 == null) {
                            upkVarB6 = defpackage.upk.UNRECOGNIZED;
                        }
                        if (upkVarB6.equals(defpackage.upk.DUO) && uplVar2.g) {
                            imageView.setVisibility(0);
                        }
                    }
                } else {
                    imageView.setVisibility(0);
                }
            }
            z = false;
        }
        android.view.View viewFindViewById = viewInflate.findViewById(2131428643);
        android.view.View viewFindViewById2 = viewInflate.findViewById(2131428016);
        if (z) {
            if (uplVar != null) {
                viewFindViewById.setClickable(true);
                viewFindViewById.setOnClickListener(new defpackage.qgq(this, uplVar, 11));
            }
            imageView3.setBackground(null);
            imageView3.setClickable(false);
            viewFindViewById2.setBackground(null);
            viewFindViewById2.setClickable(false);
        } else {
            if (uplVar != null) {
                viewFindViewById2.setClickable(true);
                viewFindViewById2.setOnClickListener(new defpackage.qgq(this, uplVar, 12));
                imageView3.setClickable(true);
                imageView3.setOnClickListener(new defpackage.qgq(this, uplVar, 13));
            }
            viewFindViewById.setBackground(null);
            viewFindViewById.setClickable(false);
        }
        linearLayout.addView(viewInflate);
    }

    private final void aZ(mce mceVar) {
        wsc.bB(z()).nJ().i((java.lang.String) null).b(mceVar);
    }

    private static void ba(android.content.Context context, defpackage.upt uptVar, defpackage.upl uplVar) {
        ajcq ajcqVarEU = wsc.bB(context).fF().eU(ahqx.i(new defpackage.tbb(context, uptVar, uplVar, 8)));
        ahvr.J(ajcqVarEU, ahqx.f(new defpackage.uwo(uplVar, 1)), wsc.bB(context).fF());
        wsc.bB(context).qb().s(ajcqVarEU, upn.a);
    }

    public final void aU(defpackage.upl uplVar) {
        if (this.an.isChecked()) {
            wsc.bB(z()).bt().n(rmw.iZ);
            ba(z().getApplicationContext(), this.aq, uplVar);
        }
        akzx akzxVarM = defpackage.abvz.a.m();
        java.lang.String str = this.aq.e;
        akzxVarM.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        abvzVar.b |= 1;
        abvzVar.c = str;
        java.lang.String str2 = this.aq.j;
        akzxVarM.u();
        defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        abvzVar2.b |= 4;
        abvzVar2.e = str2;
        java.lang.String str3 = uplVar.e;
        akzxVarM.u();
        defpackage.abvz abvzVar3 = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        abvzVar3.b |= 2;
        abvzVar3.d = str3;
        defpackage.abvz abvzVar4 = (defpackage.abvz) akzxVarM.p();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(uplVar.c);
        amdxVar.m(this.ar);
        amdxVar.o(abvzVar4);
        amdxVar.l(true);
        amdxVar.p(true);
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onRttOptionClicked", 375, "DisambigDialog.java").v("dismiss DisambigDialog");
        super.s(false, false);
        wsc.bB(z()).oW().w((defpackage.zrx) amdxVar.a);
    }

    public final void aV(defpackage.upl uplVar) {
        defpackage.upk upkVarB = defpackage.upk.b(uplVar.f);
        if (upkVarB == null) {
            upkVarB = defpackage.upk.UNRECOGNIZED;
        }
        if (upkVarB == defpackage.upk.IMS_VIDEO) {
            aZ(mce.dr);
            wsc.bB(z()).bt().o(rmx.ig);
        }
        defpackage.upk upkVarB2 = defpackage.upk.b(uplVar.f);
        if (upkVarB2 == null) {
            upkVarB2 = defpackage.upk.UNRECOGNIZED;
        }
        defpackage.upk upkVar = defpackage.upk.DUO;
        if (upkVarB2 == upkVar) {
            aZ(mce.ey);
            wsc.bB(z()).bt().n(rmw.io);
        }
        if (this.an.isChecked()) {
            wsc.bB(z()).bt().n(rmw.iX);
            ba(z().getApplicationContext(), this.aq, uplVar);
        }
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onVideoOptionClicked", 404, "DisambigDialog.java").v("dismiss DisambigDialog");
        super.s(false, false);
        defpackage.upk upkVarB3 = defpackage.upk.b(uplVar.f);
        if (upkVarB3 == null) {
            upkVarB3 = defpackage.upk.UNRECOGNIZED;
        }
        if (upkVarB3.equals(upkVar)) {
            wsc.bB(z()).aS().k(uplVar.c, nwt.e);
            return;
        }
        acxg acxgVarOW = wsc.bB(z()).oW();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(uplVar.c);
        akzx akzxVarP = this.ar.p();
        wgi wgiVar = this.aq.n;
        if (wgiVar == null) {
            wgiVar = wgi.a;
        }
        boolean z = wgiVar.d;
        akzxVarP.u();
        jxb jxbVar = akzxVarP.b;
        jxbVar.c |= 131072;
        jxbVar.s = z;
        amdxVar.m((jxb) akzxVarP.p());
        amdxVar.l(true);
        amdxVar.q(true);
        acxgVarOW.w((defpackage.zrx) amdxVar.a);
    }

    public final void aW(defpackage.upl uplVar) {
        if (this.an.isChecked()) {
            wsc.bB(z()).bt().n(rmw.iY);
            ba(z().getApplicationContext(), this.aq, uplVar);
        }
        aZ(mce.M);
        akzx akzxVarM = defpackage.abvz.a.m();
        java.lang.String str = this.aq.e;
        akzxVarM.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        abvzVar.b |= 1;
        abvzVar.c = str;
        java.lang.String str2 = this.aq.j;
        akzxVarM.u();
        defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        abvzVar2.b |= 4;
        abvzVar2.e = str2;
        java.lang.String str3 = uplVar.e;
        akzxVarM.u();
        defpackage.abvz abvzVar3 = (defpackage.abvz) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        abvzVar3.b |= 2;
        abvzVar3.d = str3;
        defpackage.abvz abvzVar4 = (defpackage.abvz) akzxVarM.p();
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onVoiceOptionClicked", 446, "DisambigDialog.java").v("dismiss DisambigDialog");
        super.s(false, false);
        acxg acxgVarOW = wsc.bB(z()).oW();
        defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
        amdxVar.s(uplVar.c);
        akzx akzxVarP = this.ar.p();
        wgi wgiVar = this.aq.n;
        if (wgiVar == null) {
            wgiVar = wgi.a;
        }
        boolean z = wgiVar.c;
        akzxVarP.u();
        jxb jxbVar = akzxVarP.b;
        jxbVar.c |= 131072;
        jxbVar.s = z;
        amdxVar.m((jxb) akzxVarP.p());
        amdxVar.o(abvzVar4);
        amdxVar.l(true);
        acxgVarOW.w((defpackage.zrx) amdxVar.a);
    }

    public final void an() {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onResume", 193, "DisambigDialog.java").v("enter");
        super.an();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        G().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ((al) this).d.getWindow().setLayout(displayMetrics.widthPixels - (z().getResources().getDimensionPixelSize(2131165654) << 1), -2);
    }

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onCreateDialog", 162, "DisambigDialog.java").v("enter");
        android.view.View viewInflate = android.view.View.inflate(G(), 2131624158, null);
        this.ao = viewInflate;
        this.am = (android.widget.LinearLayout) viewInflate.findViewById(2131427786);
        this.an = (android.widget.CheckBox) this.ao.findViewById(2131428780);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.am.findViewById(2131427786);
        java.util.List<defpackage.upl> list = this.al;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.upl uplVar : list) {
            if (this.ap.add(uplVar.c) && !arrayList.isEmpty()) {
                aY(linearLayout, arrayList);
                arrayList.clear();
            }
            arrayList.add(uplVar);
        }
        if (!arrayList.isEmpty()) {
            aY(linearLayout, arrayList);
        }
        ((android.widget.TextView) this.ao.findViewById(2131428010)).setText(z().getString(2132020244, this.aq.e));
        defpackage.afsn afsnVar = new defpackage.afsn(G(), 0);
        afsnVar.A(this.ao);
        afsnVar.b = new android.graphics.drawable.ColorDrawable(0);
        int iAS = wsc.aS(G());
        afsnVar.m(iAS);
        afsnVar.l(iAS);
        if (bundle == null) {
            aZ(mce.N);
        }
        return afsnVar.create();
    }

    public final void h(android.os.Bundle bundle) {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onCreate", 119, "DisambigDialog.java").v("enter");
        super.h(bundle);
        if (bundle != null) {
            try {
                this.ar = defpackage.akmr.m(bundle, "DisambigDialog_CallSpecificAppData", jxb.b, akzq.a());
            } catch (alaz e) {
                ak.c().k(e).l("com/android/dialer/speeddial/DisambigDialog", "onCreate", 131, "DisambigDialog.java").y("failed to parse callSpecificAppData: %s", e.getMessage());
            }
            try {
                this.aq = defpackage.akmr.m(bundle, "DisambigDialog_SpeedDialUiItem", defpackage.upt.a, akzq.a());
            } catch (alaz e2) {
                a.bq(ak.c(), "failed to parse SpeedDialUiItem", "com/android/dialer/speeddial/DisambigDialog", "onCreate", (char) 143, "DisambigDialog.java", e2, zct.b);
            }
            try {
                this.al = defpackage.akmr.r(bundle, "DisambigDialog_Channels", defpackage.upl.a, akzq.a());
            } catch (alaz e3) {
                a.bq(ak.c(), "failed to parse channels", "com/android/dialer/speeddial/DisambigDialog", "onCreate", (char) 154, "DisambigDialog.java", e3, zct.b);
            }
        }
    }

    public final void k(android.os.Bundle bundle) {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onSaveInstanceState", 216, "DisambigDialog.java").v("enter");
        super.k(bundle);
        defpackage.akmr.u(bundle, "DisambigDialog_SpeedDialUiItem", this.aq);
        defpackage.akmr.u(bundle, "DisambigDialog_CallSpecificAppData", this.ar);
        defpackage.akmr.v(bundle, "DisambigDialog_Channels", this.al);
    }

    public final void m() {
        ak.b().l("com/android/dialer/speeddial/DisambigDialog", "onStop", 210, "DisambigDialog.java").v("enter");
        super.m();
    }
}
