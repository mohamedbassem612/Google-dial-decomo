package androidx.media3.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class TrackSelectionView extends android.widget.LinearLayout {
    public final android.widget.CheckedTextView a;
    public final android.widget.CheckedTextView b;
    public final java.util.List c;
    public final java.util.Map d;
    public boolean e;
    private final int f;
    private final android.view.LayoutInflater g;
    private final defpackage.gr h;

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        this.g = layoutInflaterFrom;
        defpackage.gr grVar = new defpackage.gr(this, 3);
        this.h = grVar;
        ahvr.ci(getResources());
        this.c = new java.util.ArrayList();
        this.d = new java.util.HashMap();
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(2132018601);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(grVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(2131624199, (android.view.ViewGroup) this, false));
        android.widget.CheckedTextView checkedTextView2 = (android.widget.CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(2132018600);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(grVar);
        addView(checkedTextView2);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(android.content.Context context) {
        this(context, null);
    }
}
