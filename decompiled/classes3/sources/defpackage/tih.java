package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tih extends ld implements android.view.View.OnClickListener {
    public static final aimz s = aimz.i("com/android/dialer/searchfragment/cp2/extendeddirectories/Cp2ExtendedDirectoryContactViewHolder");
    public final defpackage.tjn A;
    public final defpackage.tja B;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView C;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton D;
    public int E;
    public android.app.Activity F;
    public defpackage.wgg G;
    public aify H;
    public final defpackage.tkd I;
    public final defpackage.uzx J;
    public final wsc K;
    public final android.content.Context t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final android.widget.QuickContactBadge w;
    public final android.widget.ImageView x;
    public final android.widget.Space y;
    public java.lang.String z;

    /* JADX WARN: Multi-variable type inference failed */
    public tih(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, defpackage.tkd tkdVar, defpackage.tjn tjnVar, defpackage.tja tjaVar, defpackage.uzx uzxVar, wsc wscVar) {
        super(expandableSheetView);
        this.H = aike.a;
        expandableSheetView.setOnClickListener(this);
        android.widget.QuickContactBadge quickContactBadge = (android.widget.QuickContactBadge) expandableSheetView.findViewById(2131428670);
        this.w = quickContactBadge;
        this.u = (android.widget.TextView) expandableSheetView.findViewById(2131428721);
        this.v = (android.widget.TextView) expandableSheetView.findViewById(2131428901);
        this.x = (android.widget.ImageView) expandableSheetView.findViewById(2131429517);
        this.D = (com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton) expandableSheetView.findViewById(2131427711);
        this.y = (android.widget.Space) expandableSheetView.findViewById(2131428124);
        this.t = expandableSheetView.getContext();
        this.C = expandableSheetView;
        this.I = tkdVar;
        this.A = tjnVar;
        this.B = tjaVar;
        this.J = uzxVar;
        this.K = wscVar;
        quickContactBadge.setOnClickListener(new defpackage.qgq(this, tjaVar, 7));
        expandableSheetView.setOnTouchListener(new klw(this, 6));
        expandableSheetView.setOnLongClickListener(new defpackage.tid(this, expandableSheetView, 2));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.tjn tjnVar = this.A;
        boolean zF = tjnVar.f(this.E);
        com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = this.C;
        if (zF) {
            tjnVar.a(expandableSheetView, this.E);
        } else {
            tjnVar.c(expandableSheetView, this.E);
            this.B.a(this.F, this.z, expandableSheetView.f);
        }
    }
}
