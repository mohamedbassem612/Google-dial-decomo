package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qhv extends android.widget.PopupWindow {
    public final defpackage.qgw a;
    public final android.view.View b;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton c;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton d;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton e;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton f;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton g;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton h;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton i;
    public final boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final gpd n;
    private final com.android.dialer.incall.rtt.ui.RttCheckableButton o;

    public qhv(defpackage.qgw qgwVar, android.view.View view, gpd gpdVar, boolean z) {
        super(qgwVar.z(), (android.util.AttributeSet) null, 0, 2132083498);
        this.a = qgwVar;
        this.b = view;
        this.n = gpdVar;
        this.j = z;
        android.view.View viewInflate = android.view.View.inflate(qgwVar.G(), 2131624358, null);
        setContentView(viewInflate);
        setOnDismissListener(new kd(this, 4, (byte[]) null));
        setFocusable(true);
        setWidth(qgwVar.z().getResources().getDimensionPixelSize(2131167339));
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428524);
        this.c = rttCheckableButton;
        rttCheckableButton.b = this;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton2 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428525);
        this.d = rttCheckableButton2;
        rttCheckableButton2.b = this;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton3 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428522);
        this.e = rttCheckableButton3;
        rttCheckableButton3.b = this;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton4 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428516);
        this.o = rttCheckableButton4;
        int i = 3;
        rttCheckableButton4.setOnClickListener(new defpackage.qht(qgwVar, i));
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton5 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428526);
        this.f = rttCheckableButton5;
        rttCheckableButton5.setOnClickListener(new defpackage.qgq(this, qgwVar, i, null));
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton6 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428521);
        this.g = rttCheckableButton6;
        rttCheckableButton6.b = this;
        this.h = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428520);
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton7 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131428523);
        this.i = rttCheckableButton7;
        rttCheckableButton7.b = this;
    }

    final void a(boolean z) {
        this.o.setVisibility(true != z ? 8 : 0);
    }

    final void b(boolean z) {
        if (this.l) {
            this.g.c(z);
            this.n.i((java.lang.String) null).b(z ? mce.bh : mce.bk);
        }
    }

    final void c(boolean z) {
        this.m = z;
        int i = true != z ? 0 : 8;
        this.c.setVisibility(i);
        this.o.setVisibility(i);
    }
}
