package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thn extends ld implements android.view.View.OnClickListener {
    public static final aimz s = aimz.i("com/android/dialer/searchfragment/calllog/CallLogViewHolder");
    public final com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView A;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton B;
    public final android.widget.Space C;
    public int D;
    public android.app.Activity E;
    public defpackage.wgg F;
    public aify G;
    public final defpackage.tkd H;
    public final defpackage.uzx I;
    public final aazc J;
    public final wsc K;
    public final android.content.Context t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final android.widget.QuickContactBadge w;
    public java.lang.String x;
    public final defpackage.tjn y;
    public final defpackage.tja z;

    /* JADX WARN: Multi-variable type inference failed */
    public thn(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, defpackage.tkd tkdVar, defpackage.tjn tjnVar, defpackage.tja tjaVar, defpackage.uzx uzxVar, wsc wscVar) {
        super(expandableSheetView);
        this.G = aike.a;
        expandableSheetView.setOnClickListener(this);
        android.widget.QuickContactBadge quickContactBadge = (android.widget.QuickContactBadge) expandableSheetView.findViewById(2131428670);
        this.w = quickContactBadge;
        this.u = (android.widget.TextView) expandableSheetView.findViewById(2131428721);
        this.v = (android.widget.TextView) expandableSheetView.findViewById(2131428901);
        android.content.Context context = expandableSheetView.getContext();
        this.t = context;
        this.A = expandableSheetView;
        this.B = (com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton) expandableSheetView.findViewById(2131427711);
        this.C = (android.widget.Space) expandableSheetView.findViewById(2131428124);
        this.J = ((thm) agab.aH(context, thm.class)).mv();
        this.H = tkdVar;
        this.y = tjnVar;
        this.z = tjaVar;
        this.I = uzxVar;
        this.K = wscVar;
        quickContactBadge.setOnClickListener(new defpackage.qgq(this, tjaVar, 5));
        expandableSheetView.setOnTouchListener(new klw(this, 4));
        expandableSheetView.setOnLongClickListener(new defpackage.tid(this, expandableSheetView, 1));
    }

    public static java.lang.CharSequence C(android.content.Context context, long j, boolean z) {
        return D(android.text.format.DateUtils.formatDateTime(context, j, true != z ? 24 : 16));
    }

    public static java.lang.String D(java.lang.CharSequence charSequence) {
        return fh$.ExternalSyntheticApiModelOutline0.m(java.util.Locale.getDefault(), charSequence.toString(), fh$.ExternalSyntheticApiModelOutline0.m(), 256);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.tjn tjnVar = this.y;
        boolean zF = tjnVar.f(this.D);
        com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = this.A;
        if (zF) {
            tjnVar.a(expandableSheetView, this.D);
        } else {
            tjnVar.c(expandableSheetView, this.D);
            this.z.a(this.E, this.x, expandableSheetView.f);
        }
    }
}
