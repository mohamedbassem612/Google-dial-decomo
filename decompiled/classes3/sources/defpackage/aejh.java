package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejh extends ld {
    public final android.widget.ImageView s;
    public final android.widget.TextView t;
    public final int u;
    public final defpackage.aelt v;
    public final com.google.android.libraries.onegoogle.actions.SimpleActionView w;

    public aejh(android.content.Context context, defpackage.aelt aeltVar, android.view.ViewGroup viewGroup) {
        super(android.view.LayoutInflater.from(context).inflate(2131623971, viewGroup, false));
        android.view.View view = this.a;
        this.w = (com.google.android.libraries.onegoogle.actions.SimpleActionView) view;
        this.v = aeltVar;
        this.s = (android.widget.ImageView) view.findViewById(2131428351);
        this.t = (android.widget.TextView) this.a.findViewById(2131429240);
        this.u = aehj.o(context, 2130970143);
    }
}
