package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ldj extends ld {
    public final android.content.res.ColorStateList A;
    public final android.content.res.ColorStateList B;
    public final android.widget.TextView s;
    public final android.content.res.Resources t;
    public final android.widget.ImageView u;
    public final android.view.View v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;
    public final int y;
    public final int z;

    public ldj(android.view.View view) {
        super(view);
        this.v = view.findViewById(2131427687);
        this.s = (android.widget.TextView) view.findViewById(2131427686);
        this.u = (android.widget.ImageView) view.findViewById(2131427685);
        this.w = (android.widget.TextView) view.findViewById(2131427688);
        this.x = (android.widget.TextView) view.findViewById(2131427690);
        this.t = view.getResources();
        this.y = C(2130969015);
        this.z = C(2130969013);
        this.A = android.content.res.ColorStateList.valueOf(C(2130969014));
        this.B = android.content.res.ColorStateList.valueOf(C(2130969012));
    }

    private final int C(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.a.getContext().getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }
}
