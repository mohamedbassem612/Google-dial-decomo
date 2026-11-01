package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vys {
    private final defpackage.ahey a;
    private final com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView b;
    private final android.widget.TextView c;
    private final android.widget.TextView d;
    private final android.widget.QuickContactBadge e;
    private final android.widget.TextView f;
    private final android.widget.TextView g;
    private final androidx.core.widget.NestedScrollView h;
    private final android.view.View i;
    private final android.view.View j;
    private final android.view.ViewGroup k;
    private final android.view.View l;
    private final android.view.View m;
    private final android.view.View n;
    private final android.view.View o;
    private final android.view.View p;
    private defpackage.vyr q;
    private final com.android.dialer.widget.errorcontentview.ErrorContentView r;
    private final ops s;
    private final gpd t;

    /* JADX WARN: Multi-variable type inference failed */
    public vys(defpackage.ahey aheyVar, com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView voicemailDetailView, ops opsVar, gpd gpdVar) {
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.a = aheyVar;
        this.b = voicemailDetailView;
        this.s = opsVar;
        this.t = gpdVar;
        com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView.inflate(voicemailDetailView.getContext(), 2131624014, voicemailDetailView);
        android.view.View viewFindViewById = voicemailDetailView.findViewById(2131429486);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.d = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = voicemailDetailView.findViewById(2131429485);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.e = (android.widget.QuickContactBadge) viewFindViewById2;
        android.view.View viewFindViewById3 = voicemailDetailView.findViewById(2131429496);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.f = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = voicemailDetailView.findViewById(2131429497);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.g = (android.widget.TextView) viewFindViewById4;
        androidx.core.widget.NestedScrollView nestedScrollViewFindViewById = voicemailDetailView.findViewById(2131429495);
        aooh.e(nestedScrollViewFindViewById, "findViewById(...)");
        this.h = nestedScrollViewFindViewById;
        android.view.View viewFindViewById5 = voicemailDetailView.findViewById(2131429480);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.i = viewFindViewById5;
        android.view.View viewFindViewById6 = voicemailDetailView.findViewById(2131429487);
        aooh.e(viewFindViewById6, "findViewById(...)");
        this.j = viewFindViewById6;
        android.view.View viewFindViewById7 = voicemailDetailView.findViewById(2131429483);
        aooh.e(viewFindViewById7, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById7;
        this.k = viewGroup;
        android.view.View viewFindViewById8 = voicemailDetailView.findViewById(2131429489);
        aooh.e(viewFindViewById8, "findViewById(...)");
        this.l = viewFindViewById8;
        android.view.View viewFindViewById9 = voicemailDetailView.findViewById(2131429492);
        aooh.e(viewFindViewById9, "findViewById(...)");
        this.m = viewFindViewById9;
        android.view.View viewFindViewById10 = voicemailDetailView.findViewById(2131429490);
        aooh.e(viewFindViewById10, "findViewById(...)");
        this.n = viewFindViewById10;
        android.view.View viewFindViewById11 = voicemailDetailView.findViewById(2131429481);
        aooh.e(viewFindViewById11, "findViewById(...)");
        this.o = viewFindViewById11;
        android.view.View viewFindViewById12 = voicemailDetailView.findViewById(2131429484);
        aooh.e(viewFindViewById12, "findViewById(...)");
        this.c = (android.widget.TextView) viewFindViewById12;
        android.view.View viewFindViewById13 = voicemailDetailView.findViewById(2131429488);
        aooh.e(viewFindViewById13, "findViewById(...)");
        this.p = viewFindViewById13;
        android.view.View viewFindViewById14 = voicemailDetailView.findViewById(2131429464);
        aooh.e(viewFindViewById14, "findViewById(...)");
        this.r = (com.android.dialer.widget.errorcontentview.ErrorContentView) viewFindViewById14;
        viewFindViewById5.setVisibility(8);
        viewFindViewById6.setVisibility(0);
        hgz.c(hgz.a(aheyVar, viewGroup), wsc.ao());
    }

    private final void b(android.view.View view, aonj aonjVar) {
        view.setVisibility(aonjVar != null ? 0 : 8);
        if (aonjVar != null) {
            view.setOnClickListener(new defpackage.vxa(aonjVar, 6));
        }
        if (aooh.n(view, this.m)) {
            android.view.View viewFindViewById = this.b.findViewById(2131429400);
            aooh.e(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(view.getVisibility() != 0 ? 8 : 0);
        } else if (aooh.n(view, this.n)) {
            android.view.View viewFindViewById2 = this.b.findViewById(2131428967);
            aooh.e(viewFindViewById2, "findViewById(...)");
            viewFindViewById2.setVisibility(view.getVisibility() != 0 ? 8 : 0);
        }
    }

    private final void c() {
        hgz.f(hgz.a(this.a, this.k));
    }

    private static final void d(android.widget.TextView textView, java.lang.String str) {
        int i = 8;
        if (str != null && str.length() != 0) {
            i = 0;
        }
        textView.setVisibility(i);
        textView.setText(str);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[Catch: all -> 0x01c2, TryCatch #0 {all -> 0x01c2, blocks: (B:3:0x000c, B:7:0x0016, B:11:0x0020, B:15:0x002d, B:17:0x0033, B:18:0x0038, B:21:0x0040, B:22:0x0059, B:23:0x005e, B:24:0x005f, B:26:0x0078, B:29:0x008c, B:32:0x00b4, B:33:0x00b9, B:34:0x00ba, B:35:0x00c1, B:36:0x00c2, B:38:0x00d1, B:40:0x00d8, B:42:0x00e7, B:44:0x00ef, B:46:0x00fe, B:48:0x0106, B:50:0x0115, B:52:0x011c, B:56:0x012b, B:61:0x0136, B:64:0x0154, B:65:0x0157, B:66:0x016a, B:68:0x0170, B:70:0x017e, B:71:0x0197, B:28:0x0087), top: B:80:0x000c }] */
    public final void a(defpackage.vyr vyrVar) {
        ahoq ahoqVarW = ahvr.W(1050, "VoicemailDetailViewPeer_bind");
        try {
            android.view.View view = this.j;
            view.setVisibility(vyrVar == null ? 0 : 8);
            android.view.View view2 = this.i;
            view2.setVisibility(vyrVar != null ? 0 : 8);
            com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView = this.r;
            errorContentView.setVisibility(true != (vyrVar instanceof defpackage.vyo) ? 8 : 0);
            if (vyrVar == null) {
                c();
            } else {
                int iAl = wsc.al(vyrVar);
                if (iAl == 0) {
                    defpackage.vyq vyqVar = (defpackage.vyq) vyrVar;
                    hgz.c(hgz.a(this.a, this.k), wsc.an(vyqVar.h));
                    defpackage.vyr vyrVar2 = this.q;
                    if (vyrVar2 instanceof defpackage.vyq) {
                        long j = vyqVar.a;
                        aooh.d(vyrVar2, "null cannot be cast to non-null type com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailModel.VoicemailEntryModel");
                        if (j != ((defpackage.vyq) vyrVar2).a) {
                            this.h.scrollTo(0, 0);
                        }
                    } else {
                        this.h.scrollTo(0, 0);
                    }
                    this.q = vyqVar;
                    this.d.setText(vyqVar.b);
                    this.s.h(this.e, vyqVar.c, false);
                    d(this.f, vyqVar.d);
                    d(this.g, vyqVar.e);
                    int iAl2 = wsc.al(vyqVar);
                    if (iAl2 != 0) {
                        if (iAl2 == 1) {
                            throw new aoit("An operation is not implemented.");
                        }
                        throw new aois();
                    }
                    android.view.View view3 = this.l;
                    java.util.Map map = vyqVar.f;
                    oqx oqxVar = (oqx) map.get(defpackage.vyp.a);
                    int i = 5;
                    b(view3, oqxVar != null ? new defpackage.sba(oqxVar, 5, (float[]) null) : null);
                    android.view.View view4 = this.m;
                    oqx oqxVar2 = (oqx) map.get(defpackage.vyp.b);
                    b(view4, oqxVar2 != null ? new defpackage.sba(oqxVar2, 6, (float[]) null) : null);
                    android.view.View view5 = this.n;
                    oqx oqxVar3 = (oqx) map.get(defpackage.vyp.e);
                    b(view5, oqxVar3 != null ? new defpackage.sba(oqxVar3, 7, (float[]) null) : null);
                    android.view.View view6 = this.o;
                    oqx oqxVar4 = (oqx) map.get(defpackage.vyp.c);
                    b(view6, oqxVar4 != null ? new defpackage.sba(oqxVar4, 8, (float[]) null) : null);
                    android.widget.TextView textView = this.c;
                    java.lang.String str = vyqVar.g;
                    textView.setText(str);
                    if ((textView.getVisibility() == 0) != (str != null)) {
                        glh glhVar = new glh((byte[]) null);
                        glhVar.T(300L);
                        glhVar.V(textView);
                        android.view.ViewParent parent = textView.getParent();
                        aooh.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        gld.b((android.view.ViewGroup) parent, glhVar);
                        textView.setVisibility(str != null ? 0 : 8);
                    }
                    com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView voicemailDetailView = this.b;
                    ft ftVar = new ft(voicemailDetailView.getContext());
                    java.util.Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        oqx oqxVar5 = (oqx) ((java.util.Map.Entry) it.next()).getValue();
                        if (oqxVar5 != null) {
                            fv fvVarC = ftVar.c(0, 0, 0, oqxVar5.b());
                            fvVarC.setIcon(oqxVar5.a());
                            fvVarC.l = new defpackage.afri(oqxVar5, 1);
                        }
                    }
                    android.content.Context context = voicemailDetailView.getContext();
                    android.view.View view7 = this.p;
                    gc gcVar = new gc(context, ftVar, view7, false, 2130970239, 0);
                    gcVar.d(true);
                    view7.setOnClickListener(new defpackage.vxa(gcVar, i));
                    this.t.i((java.lang.String) null).b(mce.dx);
                } else {
                    if (iAl != 1) {
                        throw new aois();
                    }
                    c();
                    view.setVisibility(8);
                    view2.setVisibility(8);
                    errorContentView.setVisibility(0);
                    errorContentView.y().a(((defpackage.vyo) vyrVar).a);
                }
            }
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
}
