package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lok extends ld implements android.view.View.OnClickListener {
    public final ops A;
    public final ahbv B;
    private final rai C;
    public final rlv s;
    public final android.content.Context t;
    public final android.widget.TextView u;
    public final android.widget.TextView v;
    public final android.widget.QuickContactBadge w;
    public android.net.Uri x;
    public long y;
    public final android.view.View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lok(rlv rlvVar, ops opsVar, ahbv ahbvVar, android.view.View view, rai raiVar) {
        super(view);
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(view, "itemView");
        aooh.f(raiVar, "onContactSelectedListener");
        this.s = rlvVar;
        this.A = opsVar;
        this.B = ahbvVar;
        this.C = raiVar;
        android.content.Context context = view.getContext();
        aooh.e(context, "getContext(...)");
        this.t = context;
        android.view.View viewFindViewById = view.findViewById(2131427770);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.z = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        android.view.View viewFindViewById2 = view.findViewById(2131427818);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.u = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131427819);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.v = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(2131428670);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.w = (android.widget.QuickContactBadge) viewFindViewById4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        aooh.f(view, "v");
        android.net.Uri uri = this.x;
        if (uri != null) {
            rai raiVar = this.C;
            aooh.f(this.w, "photo");
            defpackage.loi loiVar = (defpackage.loi) raiVar.a;
            loiVar.q = uri;
            defpackage.lom lomVar = loiVar.p;
            if (lomVar != null) {
                lomVar.y(true != loiVar.s ? null : uri);
            }
            loiVar.n.j(new zoe(loiVar.m.d.a()), new zoe(uri), loiVar.v);
        }
    }
}
