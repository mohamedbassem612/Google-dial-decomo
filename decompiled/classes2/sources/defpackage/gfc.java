package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gfc extends ld {
    public final android.graphics.drawable.Drawable s;
    public android.content.res.ColorStateList t;
    public boolean u;
    public boolean v;
    private final android.util.SparseArray w;

    public gfc(android.view.View view) {
        super(view);
        android.util.SparseArray sparseArray = new android.util.SparseArray(4);
        this.w = sparseArray;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(2131428353, view.findViewById(2131428353));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.s = view.getBackground();
        if (textView != null) {
            this.t = textView.getTextColors();
        }
    }

    public final android.view.View C(int i) {
        android.util.SparseArray sparseArray = this.w;
        android.view.View viewFindViewById = (android.view.View) sparseArray.get(i);
        if (viewFindViewById == null && (viewFindViewById = this.a.findViewById(i)) != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
