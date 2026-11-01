package android.support.v7.view.menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements android.widget.AbsListView.SelectionBoundsAdjuster, gf {
    public fv a;
    public android.widget.ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private android.widget.ImageView f;
    private android.widget.RadioButton g;
    private android.widget.TextView h;
    private android.widget.CheckBox i;
    private android.widget.TextView j;
    private android.widget.ImageView k;
    private android.widget.LinearLayout l;
    private android.graphics.drawable.Drawable m;
    private int n;
    private android.content.Context o;
    private android.graphics.drawable.Drawable p;
    private android.view.LayoutInflater q;

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ajxw ajxwVarD = ajxw.D(getContext(), attributeSet, ef.s, i, 0);
        this.m = ajxwVarD.t(5);
        this.n = ajxwVarD.r(1, -1);
        this.c = ajxwVarD.y(7, false);
        this.o = context;
        this.p = ajxwVarD.t(8);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, 2130969317, 0);
        this.d = typedArrayObtainStyledAttributes.hasValue(0);
        ajxwVarD.x();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.view.LayoutInflater b() {
        android.view.LayoutInflater layoutInflater = this.q;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.q = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private final void c(android.view.View view, int i) {
        android.widget.LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public final fv a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup, gf] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.CheckBox] */
    public final void f(fv fvVar) {
        android.widget.CompoundButton compoundButton;
        android.widget.CompoundButton compoundButton2;
        ?? r5;
        android.widget.ImageView imageView;
        java.lang.String string;
        this.a = fvVar;
        setVisibility(true != fvVar.isVisible() ? 8 : 0);
        java.lang.CharSequence charSequenceF = fvVar.f((gf) this);
        android.widget.TextView textView = this.h;
        if (charSequenceF != null) {
            textView.setText(charSequenceF);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (textView.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean zIsCheckable = fvVar.isCheckable();
        if (zIsCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    android.widget.RadioButton radioButton = (android.widget.RadioButton) b().inflate(2131623955, (android.view.ViewGroup) this, false);
                    this.g = radioButton;
                    c(radioButton, -1);
                }
                compoundButton = this.g;
                android.widget.CheckBox checkBox = this.i;
                compoundButton2 = checkBox;
                r5 = checkBox;
            } else {
                if (this.i == null) {
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) b().inflate(2131623952, (android.view.ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2, -1);
                }
                compoundButton = this.i;
                compoundButton2 = this.g;
                r5 = compoundButton;
            }
            if (zIsCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (r5 != 0) {
                    r5.setVisibility(8);
                }
                android.widget.RadioButton radioButton2 = this.g;
                if (radioButton2 != null) {
                    radioButton2.setVisibility(8);
                }
            }
        }
        boolean zT = fvVar.t();
        fvVar.e();
        int i = (zT && this.a.t()) ? 0 : 8;
        if (i == 0) {
            android.widget.TextView textView2 = this.j;
            fv fvVar2 = this.a;
            char cE = fvVar2.e();
            if (cE == 0) {
                string = "";
            } else {
                ft ftVar = fvVar2.j;
                android.content.Context context = ftVar.a;
                android.content.res.Resources resources = context.getResources();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.view.ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2132017262));
                }
                int i2 = ftVar.z() ? fvVar2.i : fvVar2.g;
                fv.g(sb, i2, 65536, resources.getString(2132017258));
                fv.g(sb, i2, 4096, resources.getString(2132017254));
                fv.g(sb, i2, 2, resources.getString(2132017253));
                fv.g(sb, i2, 1, resources.getString(2132017259));
                fv.g(sb, i2, 4, resources.getString(2132017261));
                fv.g(sb, i2, 8, resources.getString(2132017257));
                if (cE == '\b') {
                    sb.append(resources.getString(2132017255));
                } else if (cE == '\n') {
                    sb.append(resources.getString(2132017256));
                } else if (cE != ' ') {
                    sb.append(cE);
                } else {
                    sb.append(resources.getString(2132017260));
                }
                string = sb.toString();
            }
            textView2.setText(string);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        android.graphics.drawable.Drawable icon = fvVar.getIcon();
        ft ftVar2 = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) b().inflate(2131623953, (android.view.ViewGroup) this, false);
                this.f = imageView2;
                c(imageView2, 0);
            }
            if (icon != null || this.c) {
                android.widget.ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(fvVar.isEnabled());
        boolean zHasSubMenu = fvVar.hasSubMenu();
        android.widget.ImageView imageView4 = this.k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != zHasSubMenu ? 8 : 0);
        }
        setContentDescription(fvVar.m);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.m);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131429285);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (android.widget.TextView) findViewById(2131428941);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(2131429039);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (android.widget.ImageView) findViewById(2131428313);
        this.l = (android.widget.LinearLayout) findViewById(2131427854);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969771);
    }
}
