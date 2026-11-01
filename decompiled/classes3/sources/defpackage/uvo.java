package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvo {
    public static final aimz a = aimz.i("com/android/dialer/transcriptaudiofeedback/impl/FeedbackMainFragmentPeer");
    public final android.content.Context b;
    public final defpackage.uvl c;
    public final defpackage.uwp d;
    public final rlv e;
    public final defpackage.utu f;
    public final agtj g;
    public final defpackage.uvk h;
    public final defpackage.agzc i;
    public final defpackage.ulw l;
    public final defpackage.uyg m;
    private final agsm n;
    private final zzx p;
    private final defpackage.uss q;
    private j$.util.Optional o = j$.util.Optional.empty();
    public final agtk j = new defpackage.uvm(this);
    public final defpackage.agza k = new defpackage.uvn(this, 0);

    public uvo(android.content.Context context, defpackage.utu utuVar, agsm agsmVar, defpackage.ulw ulwVar, defpackage.uvl uvlVar, defpackage.uwp uwpVar, defpackage.uyg uygVar, rlv rlvVar, agtj agtjVar, defpackage.uvk uvkVar, zzx zzxVar, defpackage.agzc agzcVar, defpackage.uss ussVar) {
        this.b = context;
        this.n = agsmVar;
        this.l = ulwVar;
        this.d = uwpVar;
        this.m = uygVar;
        this.e = rlvVar;
        this.f = utuVar;
        this.c = uvlVar;
        this.g = agtjVar;
        this.h = uvkVar;
        this.p = zzxVar;
        this.i = agzcVar;
        this.q = ussVar;
    }

    final void a(boolean z) {
        defpackage.utu utuVar = this.f;
        this.d.a(utuVar.e);
        if (z) {
            this.n.k(this.l.a(utuVar.c));
        }
        j$.util.Optional optional = this.o;
        if (true == optional.isPresent()) {
            ((android.app.Dialog) optional.get()).dismiss();
        }
        defpackage.uvl uvlVar = this.c;
        uvlVar.G().finish();
        uvlVar.G().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b() {
        if (this.o.isPresent()) {
            return;
        }
        agtj agtjVar = this.g;
        defpackage.uss ussVar = this.q;
        defpackage.utu utuVar = this.f;
        java.lang.Object obj = ussVar.d;
        defpackage.zlr zlrVar = (defpackage.zlr) obj;
        agtjVar.i(defpackage.zoe.N(ahvr.I(ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) zlrVar.a).k().f()).map(new defpackage.uvi(obj, utuVar.c, 2)).collect(aido.a)), new defpackage.uev(defpackage.uts.a.m(), 20), (java.util.concurrent.Executor) zlrVar.c), new uhj(ussVar, utuVar, 10, (byte[]) null), (java.util.concurrent.Executor) ussVar.a)), this.j);
        defpackage.afsn afsnVar = new defpackage.afsn(this.c.G(), 0);
        afsnVar.z();
        j$.util.Optional optionalOf = j$.util.Optional.of(afsnVar.create());
        this.o = optionalOf;
        ((android.app.Dialog) optionalOf.orElseThrow()).show();
    }

    public final void c(defpackage.utr utrVar) {
        int i;
        int iAP;
        int iAP2;
        defpackage.uvl uvlVar = this.c;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) uvlVar.N().findViewById(2131428252);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) uvlVar.N().findViewById(2131428250);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        if ((utrVar.b & 1) != 0) {
            defpackage.uty utyVarB = defpackage.uty.b(utrVar.c);
            if (utyVarB == null) {
                utyVarB = defpackage.uty.UNKNOWN;
            }
            optionalEmpty = j$.util.Optional.of(utyVarB);
        }
        defpackage.utu utuVar = this.f;
        int iAP3 = a.aP(utuVar.f);
        int i2 = (iAP3 != 0 ? iAP3 : 1) - 1;
        if (i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            if (utrVar.e) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
            viewGroup2.setVisibility(8);
        } else {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(8);
        }
        u uVar = new u(uvlVar.I());
        defpackage.uvv uvvVar = new defpackage.uvv();
        amxr.g(uvvVar);
        ahgl.b(uvvVar, utuVar);
        uVar.q(2131428259, uvvVar, "feedback_transcript_fragment_tag");
        uVar.c();
        if (!utrVar.d) {
            u uVar2 = new u(uvlVar.I());
            defpackage.uvq uvqVar = new defpackage.uvq();
            amxr.g(uvqVar);
            ahgl.b(uvqVar, utuVar);
            uVar2.q(2131428258, uvqVar, "feedback_recording_fragment_tag");
            uVar2.c();
        }
        com.android.dialer.widget.DialerToolbar dialerToolbar = (com.android.dialer.widget.DialerToolbar) uvlVar.H().findViewById(2131428248);
        if (viewGroup.getVisibility() == 0 || optionalEmpty.isPresent()) {
            dialerToolbar.setElevation(0.0f);
        }
        dialerToolbar.setBackgroundColor(urg.c(uvlVar.A(), 2130969107));
        if (optionalEmpty.isPresent() && (((iAP = a.aP((i = utuVar.f))) == 0 || iAP != 4) && ((iAP2 = a.aP(i)) == 0 || iAP2 != 5))) {
            j$.util.Optional optionalI = ((defpackage.utx) ((aoin) this.p.k().get(optionalEmpty.orElseThrow())).a()).i(utuVar.c);
            ahvr.bY(optionalI.isPresent());
            u uVar3 = new u(uvlVar.I());
            uVar3.q(2131428751, (aw) optionalI.orElseThrow(), "feedback_quick_survey_tag");
            uVar3.c();
        }
        uvlVar.N().setVisibility(0);
    }
}
