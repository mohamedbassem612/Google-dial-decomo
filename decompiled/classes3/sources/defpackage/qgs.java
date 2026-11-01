package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgs extends android.widget.PopupWindow {
    public final zmq a;
    public final qgr b;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton c;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton d;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton e;
    public final com.android.dialer.incall.rtt.ui.RttCheckableButton f;
    private final zms g;

    public qgs(zmq zmqVar, zms zmsVar, android.content.Context context, qgr qgrVar) {
        super(context, (android.util.AttributeSet) null, 0, 2132083498);
        this.a = zmqVar;
        this.g = zmsVar;
        this.b = qgrVar;
        android.view.View viewInflate = android.view.View.inflate(context, 2131623995, null);
        setContentView(viewInflate);
        setOnDismissListener(new kd(this, 3, (byte[]) null));
        setFocusable(true);
        setWidth(context.getResources().getDimensionPixelSize(2131167339));
        viewInflate.findViewById(2131427503).setOnClickListener(new nti(this, 18));
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131427504);
        this.c = rttCheckableButton;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton2 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131427507);
        this.d = rttCheckableButton2;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton3 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131427506);
        this.e = rttCheckableButton3;
        com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton4 = (com.android.dialer.incall.rtt.ui.RttCheckableButton) viewInflate.findViewById(2131427505);
        this.f = rttCheckableButton4;
        b(rttCheckableButton, defpackage.zmw.ROUTE_BLUETOOTH);
        b(rttCheckableButton2, defpackage.zmw.ROUTE_SPEAKER);
        b(rttCheckableButton3, defpackage.zmw.ROUTE_WIRED_HEADSET);
        b(rttCheckableButton4, defpackage.zmw.ROUTE_EARPIECE);
    }

    private final void b(com.android.dialer.incall.rtt.ui.RttCheckableButton rttCheckableButton, defpackage.zmw zmwVar) {
        zms zmsVar = this.g;
        if (!zmsVar.c().contains(zmwVar)) {
            rttCheckableButton.setVisibility(8);
        } else if (zmsVar.a() == zmwVar) {
            rttCheckableButton.c(true);
        }
        rttCheckableButton.setOnClickListener(new defpackage.qgq(this, zmwVar, 0));
    }

    public final void a(defpackage.qgo qgoVar) {
        if (qgoVar == null || !qgoVar.c || (qgoVar.b & 8) == 0) {
            return;
        }
        this.c.setText(qgoVar.f);
    }
}
