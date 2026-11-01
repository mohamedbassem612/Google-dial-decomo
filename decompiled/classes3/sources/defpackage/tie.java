package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class tie extends ld implements android.view.View.OnClickListener {
    public static final aimz s = aimz.i("com/android/dialer/searchfragment/cp2/defaultdirectory/Cp2DefaultDirectoryContactViewHolder");
    public final defpackage.tjn A;
    public final defpackage.tja B;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView C;
    public int D;
    public android.app.Activity E;
    public defpackage.wgg F;
    public aify G;
    public final defpackage.tkd H;
    public final defpackage.uzx I;
    public final wsc J;
    public final android.widget.QuickContactBadge t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton w;
    public final android.widget.Space x;
    public final android.content.Context y;
    public java.lang.String z;

    /* JADX WARN: Multi-variable type inference failed */
    public tie(com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView, defpackage.tkd tkdVar, defpackage.tjn tjnVar, defpackage.tja tjaVar, defpackage.uzx uzxVar, wsc wscVar) {
        super(expandableSheetView);
        this.G = aike.a;
        this.H = tkdVar;
        this.A = tjnVar;
        this.B = tjaVar;
        expandableSheetView.setOnClickListener(this);
        android.widget.QuickContactBadge quickContactBadge = (android.widget.QuickContactBadge) expandableSheetView.findViewById(2131428670);
        this.t = quickContactBadge;
        this.u = (android.widget.TextView) expandableSheetView.findViewById(2131428721);
        this.v = (android.widget.TextView) expandableSheetView.findViewById(2131428901);
        this.w = (com.android.dialer.searchfragment.enhancedsearch.menu.PrimaryActionButton) expandableSheetView.findViewById(2131427711);
        this.x = (android.widget.Space) expandableSheetView.findViewById(2131428124);
        this.C = expandableSheetView;
        this.I = uzxVar;
        this.J = wscVar;
        this.y = expandableSheetView.getContext();
        quickContactBadge.setOnClickListener(new defpackage.qgq(this, tjaVar, 6));
        expandableSheetView.setOnTouchListener(new klw(this, 5));
        expandableSheetView.setOnLongClickListener(new defpackage.tid(this, expandableSheetView, 0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.tjn tjnVar = this.A;
        boolean zF = tjnVar.f(this.D);
        com.android.dialer.searchfragment.enhancedsearch.menu.ExpandableSheetView expandableSheetView = this.C;
        if (zF) {
            tjnVar.a(expandableSheetView, this.D);
        } else {
            tjnVar.c(expandableSheetView, this.D);
            this.B.a(this.E, this.z, expandableSheetView.f);
        }
    }
}
