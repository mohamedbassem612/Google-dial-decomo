package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tea extends ld {
    public final android.content.res.ColorStateList A;
    public final android.widget.TextView s;
    public final android.content.res.Resources t;
    public final android.widget.ImageView u;
    public final android.view.View v;
    public final android.widget.TextView w;
    public final int x;
    public final int y;
    public final android.content.res.ColorStateList z;

    public tea(android.view.View view) {
        super(view);
        this.v = view.findViewById(2131428824);
        this.s = (android.widget.TextView) view.findViewById(2131428823);
        this.u = (android.widget.ImageView) view.findViewById(2131428819);
        this.w = (android.widget.TextView) view.findViewById(2131428826);
        this.t = view.getResources();
        this.x = C(2130969015);
        this.y = C(2130969013);
        this.z = android.content.res.ColorStateList.valueOf(C(2130969014));
        this.A = android.content.res.ColorStateList.valueOf(C(2130969012));
    }

    private final int C(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.a.getContext().getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }
}
