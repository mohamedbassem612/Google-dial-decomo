package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifq {
    public static final aimz a = aimz.i("com/android/dialer/audioplayback/impl/ui/AudioPlaybackViewPeer");
    public final android.content.Context b;
    public final aw c;
    public final iez d;
    public final ifi e;
    public final android.widget.TextView f;
    public final android.widget.ImageButton g;
    public final android.widget.ImageButton h;
    public final android.widget.ImageButton i;
    public final ifa j;
    public defpackage.iek k;
    public boolean l;
    public long m;
    public java.lang.Long n;
    public defpackage.ieg o;
    public final com.google.android.material.slider.Slider p;
    public final gpd q;
    private final com.android.dialer.audioplayback.impl.ui.AudioPlaybackView r;
    private final rlv s;
    private final aoin t;
    private final android.widget.TextView u;
    private final android.widget.ImageButton v;
    private float w;
    private final int x;
    private final ajwr y;
    private final rai z;

    /* JADX WARN: Multi-variable type inference failed */
    public ifq(ahda ahdaVar, android.content.Context context, com.android.dialer.audioplayback.impl.ui.AudioPlaybackView audioPlaybackView, aw awVar, ajwr ajwrVar, iez iezVar, aazc aazcVar, rlv rlvVar, gpd gpdVar, ifi ifiVar, int i, aoin aoinVar) {
        aooh.f(awVar, "fragment");
        aooh.f(iezVar, "audioPlayer");
        aooh.f(aazcVar, "clock");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aoinVar, "enableCallLogInCompose");
        this.b = context;
        this.r = audioPlaybackView;
        this.c = awVar;
        this.y = ajwrVar;
        this.d = iezVar;
        this.s = rlvVar;
        this.q = gpdVar;
        this.e = ifiVar;
        this.x = 3;
        this.t = aoinVar;
        com.android.dialer.audioplayback.impl.ui.AudioPlaybackView.inflate(audioPlaybackView.getContext(), 2131624000, audioPlaybackView);
        android.view.View viewFindViewById = audioPlaybackView.findViewById(2131428690);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.u = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = audioPlaybackView.findViewById(2131428691);
        aooh.e(viewFindViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById2;
        this.f = textView;
        android.view.View viewFindViewById3 = audioPlaybackView.findViewById(2131428689);
        aooh.e(viewFindViewById3, "findViewById(...)");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewFindViewById3;
        this.g = imageButton;
        android.view.View viewFindViewById4 = audioPlaybackView.findViewById(2131428694);
        aooh.e(viewFindViewById4, "findViewById(...)");
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) viewFindViewById4;
        this.h = imageButton2;
        android.view.View viewFindViewById5 = audioPlaybackView.findViewById(2131428697);
        aooh.e(viewFindViewById5, "findViewById(...)");
        android.widget.ImageButton imageButton3 = (android.widget.ImageButton) viewFindViewById5;
        this.v = imageButton3;
        android.view.View viewFindViewById6 = audioPlaybackView.findViewById(2131428687);
        aooh.e(viewFindViewById6, "findViewById(...)");
        android.widget.ImageButton imageButton4 = (android.widget.ImageButton) viewFindViewById6;
        this.i = imageButton4;
        imageButton4.setLayoutDirection(3);
        dzs.h(imageButton4, defpackage.ebc.c, context.getString(2132017446), (ebo) null);
        i(textView, 0L);
        com.google.android.material.slider.Slider sliderFindViewById = audioPlaybackView.findViewById(2131428695);
        aooh.e(sliderFindViewById, "findViewById(...)");
        com.google.android.material.slider.Slider slider = sliderFindViewById;
        this.p = slider;
        slider.getViewTreeObserver().addOnDrawListener(new acmk(this, 1));
        ((agbj) slider).f.add(new rai(this, (byte[]) null));
        rai raiVar = new rai(this, (byte[]) null);
        this.z = raiVar;
        ((agbj) slider).e.add(raiVar);
        this.j = new defpackage.ifj(new ahsa(ahdaVar, new defpackage.ifp(this)), this);
        audioPlaybackView.addOnAttachStateChangeListener(new defpackage.gk(this, 2));
        ajwrVar.g(imageButton3, new defpackage.ifo());
        ajwrVar.g(imageButton4, new defpackage.ifk());
        ajwrVar.g(imageButton, new defpackage.ifm());
        ajwrVar.g(imageButton2, new defpackage.ifn());
        ajwrVar.g(audioPlaybackView, new defpackage.ifl());
    }

    public static final java.lang.String f(long j) {
        long j2 = aorh.a;
        long jB = aooh.B(j, aorj.c);
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "%01d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(aorh.h(jB) % 100), java.lang.Integer.valueOf(aorh.d(jB))}, 2));
        aooh.e(str, "format(...)");
        return str;
    }

    private final void h(long j) {
        c(j);
        i(this.f, j);
    }

    private static final void i(android.widget.TextView textView, long j) {
        textView.setText(f(j));
    }

    public final void a(defpackage.ied iedVar, boolean z) {
        iez iezVar = this.d;
        if (!iezVar.s(iedVar)) {
            b(0L);
            return;
        }
        if (!z) {
            b(iezVar.c());
            return;
        }
        long jC = iezVar.c();
        this.m = jC;
        this.n = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
        android.widget.ImageButton imageButton = this.v;
        imageButton.setImageResource(2131231528);
        imageButton.setContentDescription(this.b.getString(2132017450));
        h(jC);
    }

    public final void b(long j) {
        this.n = null;
        android.widget.ImageButton imageButton = this.v;
        imageButton.setImageResource(2131231561);
        imageButton.setContentDescription(this.b.getString(2132017451));
        h(j);
    }

    public final void c(long j) {
        com.google.android.material.slider.Slider slider = this.p;
        slider.o(aooc.y(j, (long) ((agbj) slider).h, (long) ((agbj) slider).i));
        d(slider.n());
    }

    public final void d(float f) {
        java.lang.String string = this.b.getString(2132017449, java.lang.Integer.valueOf(aooc.w((int) ((f / this.w) * 100.0f), 0, 100)));
        aooh.e(string, "getString(...)");
        this.p.setStateDescription(string);
    }

    public final void e(long j) {
        android.widget.TextView textView = this.u;
        i(textView, j);
        long j2 = aorh.a;
        long jB = aooh.B(j, aorj.c);
        long jH = aorh.h(jB);
        int iD = aorh.d(jB);
        android.content.Context context = this.b;
        java.lang.String quantityString = context.getResources().getQuantityString(2131886097, iD, java.lang.Integer.valueOf(iD));
        aooh.e(quantityString, "getQuantityString(...)");
        if (jH != 0) {
            int i = (int) jH;
            java.lang.String quantityString2 = context.getResources().getQuantityString(2131886096, i, java.lang.Integer.valueOf(i));
            aooh.e(quantityString2, "getQuantityString(...)");
            if (iD == 0) {
                quantityString = quantityString2;
            } else {
                quantityString = context.getString(2132017454, quantityString2, quantityString);
                aooh.e(quantityString, "getString(...)");
            }
        }
        textView.setContentDescription(quantityString);
        com.google.android.material.slider.Slider slider = this.p;
        float f = j;
        ((agbj) slider).i = java.lang.Math.max(1.0f, f);
        ((agbj) slider).k = true;
        slider.postInvalidate();
        this.w = f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    public final void g(int i) {
        defpackage.iec iecVarB;
        defpackage.iek iekVar = this.k;
        if (iekVar == null) {
            iecVarB = defpackage.iec.UNKNOWN;
        } else {
            defpackage.ied iedVar = iekVar.c;
            if (iedVar == null) {
                iedVar = defpackage.ied.a;
            }
            if (iedVar != null) {
                iecVarB = defpackage.iec.b(iedVar.e);
                if (iecVarB == null) {
                    iecVarB = defpackage.iec.UNRECOGNIZED;
                }
            } else {
                iecVarB = defpackage.iec.UNKNOWN;
            }
        }
        rlv rlvVar = this.s;
        vaa vaaVarQ = akky.Q(amod.a.m());
        vaaVarQ.an(iecVarB);
        vaaVarQ.ao(i);
        rlvVar.c(vaaVarQ.am());
    }
}
