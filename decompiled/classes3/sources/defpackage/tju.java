package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tju extends ld implements android.view.View.OnClickListener {
    private static final aimz z = aimz.i("com/android/dialer/searchfragment/list/SearchActionViewHolder");
    private final rlv A;
    private final defpackage.tkd B;
    public final android.content.Context s;
    public final android.widget.ImageView t;
    public final android.widget.TextView u;
    public int v;
    public int w;
    public java.lang.String x;
    public wgi y;

    public tju(android.view.View view, defpackage.tkd tkdVar) {
        super(view);
        android.content.Context context = view.getContext();
        this.s = context;
        this.t = (android.widget.ImageView) view.findViewById(2131428881);
        this.u = (android.widget.TextView) view.findViewById(2131428882);
        this.B = tkdVar;
        view.setOnClickListener(this);
        this.A = ((tjt) agab.aH(context, tjt.class)).bt();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.v;
        switch (i) {
            case 1:
                this.A.n(rmw.eO);
                java.lang.String str = this.x;
                android.content.Intent type = new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/contact");
                wsc.aU(type, str);
                z.b().l("com/android/dialer/searchfragment/list/SearchActionViewHolder", "onClick", 181, "SearchActionViewHolder.java").y("Create new Contact with number: %s", this.x);
                defpackage.uxw.b(this.s, type, 2132017288);
                return;
            case 2:
                this.A.n(rmw.eS);
                java.lang.String str2 = this.x;
                android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                intent.setType("vnd.android.cursor.item/contact");
                wsc.aU(intent, str2);
                z.b().l("com/android/dialer/searchfragment/list/SearchActionViewHolder", "onClick", 174, "SearchActionViewHolder.java").y("Add to Contact with number: %s", this.x);
                defpackage.uxw.b(this.s, intent, 2132017291);
                return;
            case 3:
                defpackage.uxw.b(this.s, wsc.aT(this.x), 2132017288);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.A.n(rmw.ey);
                this.B.q(this.x, this.w, this.y.d);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.B.r(this.x, this.w, null, this.y.c);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.B.p(this.x, this.w);
                return;
            default:
                throw new java.lang.IllegalStateException(a.bj(i, "Invalid action: "));
        }
    }
}
