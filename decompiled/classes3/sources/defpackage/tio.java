package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tio extends ld implements android.view.View.OnClickListener {
    public static final aimz s = aimz.i("com/android/dialer/searchfragment/enhancedsearch/EnhancedCp2DefaultDirectoryContactViewHolder");
    public final defpackage.tjn A;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView B;
    public final defpackage.tja C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public wgi G;
    public defpackage.tiv H;
    public android.app.Activity I;
    public defpackage.wgg J;
    public aify K;
    public final defpackage.tkd L;
    public final defpackage.uzx M;
    public final wsc N;
    public final android.widget.QuickContactBadge t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton x;
    public final android.widget.Space y;
    public final android.content.Context z;

    /* JADX WARN: Multi-variable type inference failed */
    public tio(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, defpackage.tkd tkdVar, defpackage.tjn tjnVar, defpackage.tja tjaVar, defpackage.uzx uzxVar, wsc wscVar) {
        super(expandableSheetView);
        this.K = aike.a;
        this.L = tkdVar;
        this.A = tjnVar;
        this.C = tjaVar;
        this.M = uzxVar;
        this.N = wscVar;
        expandableSheetView.setOnClickListener(this);
        expandableSheetView.setOnTouchListener(new klw(this, 7));
        expandableSheetView.setOnLongClickListener(new defpackage.tid(this, expandableSheetView, 3));
        android.widget.QuickContactBadge quickContactBadge = (android.widget.QuickContactBadge) expandableSheetView.findViewById(2131428670);
        this.t = quickContactBadge;
        this.u = (android.widget.TextView) expandableSheetView.findViewById(2131428721);
        this.v = (android.widget.TextView) expandableSheetView.findViewById(2131428901);
        this.w = (android.widget.TextView) expandableSheetView.findViewById(2131428644);
        this.x = (com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton) expandableSheetView.findViewById(2131427711);
        this.B = expandableSheetView;
        this.y = (android.widget.Space) expandableSheetView.findViewById(2131428124);
        this.z = expandableSheetView.getContext();
        quickContactBadge.setOnClickListener(new defpackage.qgq(this, tjaVar, 8));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.tjn tjnVar = this.A;
        boolean zF = tjnVar.f(this.D);
        com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = this.B;
        if (zF) {
            tjnVar.a(expandableSheetView, this.D);
        } else {
            tjnVar.c(expandableSheetView, this.D);
            this.C.f(this.I, this.E, expandableSheetView.f);
        }
    }
}
