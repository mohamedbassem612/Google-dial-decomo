package com.android.dialer.voicemail.settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RecordVoicemailGreetingActivity extends urd {
    public static final aimz n = aimz.i("com/android/dialer/voicemail/settings/RecordVoicemailGreetingActivity");
    private android.animation.TimeAnimator A;
    private final na B;
    private final na C;
    public android.view.View o;
    public android.app.ProgressDialog p;
    public android.widget.TextView q;
    public defpackage.vol r;
    public com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer s;
    public rlv t;
    public ahpz u;
    public final na v;
    public final aigf w;
    final aify x;
    private lpa y;
    private lpa z;

    public RecordVoicemailGreetingActivity() {
        defpackage.vos vosVar = new defpackage.vos(this);
        this.B = vosVar;
        defpackage.vot votVar = new defpackage.vot(this);
        this.v = votVar;
        defpackage.vou vouVar = new defpackage.vou(this);
        this.C = vouVar;
        this.w = aigf.m(defpackage.voj.a, vouVar, defpackage.voj.b, vosVar, defpackage.voj.d, vosVar);
        this.x = aify.r(vouVar, votVar, vosVar);
    }

    private final void C(int i, int i2) {
        this.q.setText(wsc.aC(getBaseContext(), i, i2));
        android.widget.TextView textView = this.q;
        android.content.Context baseContext = getBaseContext();
        java.lang.String strAB = wsc.aB(baseContext, i2);
        if (i != 0) {
            strAB = baseContext.getString(2132020931, wsc.aB(baseContext, i), strAB);
        }
        textView.setContentDescription(strAB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        defpackage.afsn afsnVar = new defpackage.afsn(this, 0);
        afsnVar.x(2132019833);
        afsnVar.r(2132019835);
        afsnVar.w(2132019834, new ktq(this, 19));
        afsnVar.t(2132019831, new ktq(this, 20));
        cy cyVarCreate = afsnVar.create();
        cyVarCreate.setOnShowListener(new jlg(this, 14));
        cyVarCreate.show();
    }

    public final void B() {
        int iOrdinal = ((defpackage.voj) this.r.b.d()).ordinal();
        if (iOrdinal == 0) {
            this.q.setText(2132017994);
            this.q.setContentDescription(getString(2132017994));
            return;
        }
        if (iOrdinal == 1) {
            C(this.r.a(), this.r.i);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                C(this.r.a(), this.r.j);
                return;
            } else if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    int i = this.r.j;
                    C(i, i);
                    return;
                }
                return;
            }
        }
        C(0, this.r.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [aoss, java.lang.Object] */
    protected final void onCreate(android.os.Bundle bundle) {
        ajcq ajcqVarH;
        super.onCreate(bundle);
        final int i = 2;
        if (wsc.ax(this).jE().a(this) || isInMultiWindowMode()) {
            setRequestedOrientation(2);
        }
        setContentView(2131623975);
        this.t = wsc.ax(this).bt();
        this.u = wsc.ax(this).fi();
        com.android.dialer.widget.DialerToolbar dialerToolbar = (com.android.dialer.widget.DialerToolbar) findViewById(2131429294);
        k(dialerToolbar);
        dialerToolbar.F();
        dialerToolbar.E(2132019850);
        this.p = new android.app.ProgressDialog(this);
        this.y = lpa.a(a(), "RecordVoicemailGreetingActivity.uploadResultListener");
        this.z = lpa.a(a(), "RecordVoicemailGreetingActivity.maxDurationResultListener");
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) getIntent().getParcelableExtra("phone_account_handle");
        this.o = findViewById(2131428294);
        this.q = (android.widget.TextView) findViewById(2131428416);
        android.animation.TimeAnimator timeAnimator = new android.animation.TimeAnimator();
        this.A = timeAnimator;
        timeAnimator.setTimeListener(new defpackage.vqi(this, 1));
        byte[] bArr = null;
        findViewById(2131428776).setOnClickListener(new defpackage.szl(this, 14, bArr));
        findViewById(2131428857).setOnClickListener(new defpackage.ahpp(this.u, 997, "Save button clicked", new defpackage.szl(this, 15, bArr), 0));
        defpackage.vol volVar = (defpackage.vol) new eog(S(), new defpackage.vov(this)).a(defpackage.vol.class);
        this.r = volVar;
        volVar.n.g(this, new enh() { // from class: vog
            public final void a(java.lang.Object obj) {
                int i2 = i;
                if (i2 == 0) {
                } else if (i2 != 1) {
                }
            }
        });
        this.r.b.g(this, new defpackage.vor(this, 0));
        com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer = (com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer) findViewById(2131428765);
        this.s = recordLottieViewContainer;
        recordLottieViewContainer.setOnClickListener(new defpackage.szl(this, 16, bArr));
        com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer2 = this.s;
        recordLottieViewContainer2.f = new defpackage.aprf(this);
        defpackage.vol volVar2 = this.r;
        recordLottieViewContainer2.e = volVar2.j;
        lpa lpaVar = this.z;
        if (j$.util.Objects.equals(volVar2.l, phoneAccountHandle)) {
            ajcqVarH = ajcm.a;
        } else {
            volVar2.l = phoneAccountHandle;
            defpackage.uyg uygVar = volVar2.p;
            aooh.f(phoneAccountHandle, "phoneAccountHandle");
            ajcqVarH = ahvr.H(aosv.F((aoss) uygVar.a, 0, new defpackage.vjf(uygVar, phoneAccountHandle, (aoln) null, 5), 3), new defpackage.vmb(volVar2, 9), volVar2.f);
        }
        lpaVar.b(this, ajcqVarH, new kll(this, 18), new defpackage.xah(1));
        fc().c(this.C);
        fc().c(this.B);
        fc().c(this.v);
        android.view.View viewFindViewById = findViewById(2131428769);
        ahpr ahprVar = new ahpr(this.u, 998, "record_greeting_apply_window_insets_compat", new izf(12));
        int i2 = dzs.a;
        dzk.o(viewFindViewById, ahprVar);
    }

    public final void onWindowFocusChanged(boolean z) {
        defpackage.voj vojVar;
        if (!z && ((vojVar = (defpackage.voj) this.r.b.d()) == defpackage.voj.b || vojVar == defpackage.voj.d)) {
            this.r.h();
        }
        super.onWindowFocusChanged(z);
    }

    public final void w() {
        j$.lang.Iterable.-EL.forEach(this.x, new defpackage.uwm(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        this.t.n(rmw.cg);
        this.v.f(false);
        this.p.setMessage(getString(2132019848));
        this.p.setProgressStyle(0);
        this.p.show();
        lpa lpaVar = this.y;
        defpackage.vol volVar = this.r;
        lpaVar.b(this, ahrv.g(ahvr.F(new defpackage.vdp(volVar, 18), volVar.g)).i(ahqx.c(new defpackage.vmq(volVar, 12)), volVar.f), new kll(this, 17), new defpackage.taw(this, 9));
    }

    public final void y(boolean z) {
        android.animation.TimeAnimator timeAnimator = this.A;
        if (z) {
            timeAnimator.start();
        } else if (timeAnimator.isStarted()) {
            this.A.end();
        }
        B();
    }

    public final void z(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }
}
