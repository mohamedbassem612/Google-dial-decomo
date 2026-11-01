package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aflh extends android.widget.LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final aify c = aify.t(2131232238, 2131231141, 2131231888, 2131232094, 2131232239);
    public defpackage.aflg a;
    private defpackage.amix d;

    public aflh(android.content.Context context) {
        super(context);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(2131624644, (android.view.ViewGroup) this, true);
    }

    public static void c(android.view.ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public static void d(android.view.ViewGroup viewGroup, int i, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((android.widget.ImageView) viewGroup.getChildAt(i2).findViewById(2131429190)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static boolean f(android.view.MotionEvent motionEvent, android.view.View view) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    private final android.graphics.drawable.Drawable g(int i, int i2) {
        return aehj.F(getContext().getDrawable(i), getContext(), i2);
    }

    private static void h(android.widget.TextView textView, java.lang.String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void i(android.view.View view, int i, int i2, int i3) {
        java.lang.String string;
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(getContext().getResources().getConfiguration()), 0));
        java.lang.String str = numberFormat.format(i);
        java.lang.String str2 = numberFormat.format(i2);
        java.lang.String string2 = getContext().getString(2132020343, str, str2);
        if (i3 == 4) {
            string2 = getResources().getQuantityString(2131886111, i, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            i3 = 4;
        }
        if (i == 1) {
            string2 = string2 + ' ' + this.d.e;
        } else if (i == i2) {
            string2 = string2 + ' ' + this.d.f;
        }
        if (i3 == 3) {
            android.content.Context context = getContext();
            if (i == 1) {
                string = getContext().getString(2132020365);
            } else if (i == 2) {
                string = getContext().getString(2132020356);
            } else if (i == 3) {
                string = getContext().getString(2132020341);
            } else if (i != 4) {
                string = i != 5 ? "" : getContext().getString(2132020366);
            } else {
                string = getContext().getString(2132020357);
            }
            string2 = context.getString(2132020355, str, str2, string);
        }
        view.setContentDescription(string2);
    }

    public final int a() {
        return agab.aa(this, 2130970731, b(2131102920));
    }

    public final int b(int i) {
        return getContext().getColor(i);
    }

    public final void e(defpackage.amix amixVar) {
        this.d = amixVar;
        int i = amixVar.c;
        final int i2 = 2;
        if (i < 2 || i > 7) {
            throw new java.lang.IllegalArgumentException("Number of ratings must be between 2 and 7.");
        }
        int iAb = a.ab(amixVar.b);
        if (iAb == 0 || iAb != 6) {
            h((android.widget.TextView) findViewById(2131429193), amixVar.e);
            h((android.widget.TextView) findViewById(2131429189), amixVar.f);
        }
        int i3 = amixVar.b;
        int iAb2 = a.ab(i3);
        int i4 = 2131429190;
        int i5 = 2131429191;
        int i6 = 2131624646;
        int i7 = -2;
        int i8 = 2131102937;
        final int i9 = 1;
        final int i10 = 0;
        if (iAb2 != 0 && iAb2 == 3) {
            final android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(2131429192);
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
            aike aikeVar = c;
            int i11 = aikeVar.d;
            final int i12 = 0;
            while (i12 < i11) {
                android.view.View viewInflate = layoutInflaterFrom.inflate(i6, viewGroup, false);
                if (i12 == 0) {
                    viewInflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    i12 = 0;
                }
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewInflate.findViewById(i5);
                android.widget.ImageView imageView = (android.widget.ImageView) frameLayout.findViewById(i4);
                imageView.setImageDrawable(aehj.F(getContext().getDrawable(((java.lang.Integer) aikeVar.get(i12)).intValue()), getContext(), b(i8)));
                i12++;
                imageView.setTag(java.lang.Integer.valueOf(i12));
                i(imageView, i12, i11, 3);
                frameLayout.setOnTouchListener(new defpackage.afld(this, frameLayout, imageView, 0));
                frameLayout.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: afle
                    public final /* synthetic */ defpackage.aflh a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i13 = i10;
                        if (i13 == 0) {
                            defpackage.aflh.c(viewGroup);
                            new android.os.Handler().postDelayed(new eyd(this.a, i12, 18), 250L);
                            return;
                        }
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        if (i13 != 1) {
                            defpackage.aflh.c(viewGroup2);
                            new android.os.Handler().postDelayed(new eyd(this.a, i12, 16), 250L);
                            return;
                        }
                        defpackage.aflh.c(viewGroup2);
                        new android.os.Handler().postDelayed(new eyd(this.a, i12, 17), 250L);
                    }
                });
                viewGroup.addView(viewInflate);
                i4 = 2131429190;
                i5 = 2131429191;
                i6 = 2131624646;
                i8 = 2131102937;
            }
            return;
        }
        int iAb3 = a.ab(i3);
        if (iAb3 != 0 && iAb3 == 5) {
            final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(2131429192);
            android.view.LayoutInflater layoutInflaterFrom2 = android.view.LayoutInflater.from(getContext());
            int i13 = this.d.c;
            final int i14 = 0;
            while (i14 < i13) {
                android.view.View viewInflate2 = layoutInflaterFrom2.inflate(2131624647, viewGroup2, false);
                if (i14 == 0) {
                    viewInflate2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    i14 = 0;
                }
                final android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) viewInflate2.findViewById(2131429195);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131167844);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                final com.google.android.material.card.MaterialCardView materialCardView = (com.google.android.material.card.MaterialCardView) frameLayout2.findViewById(2131429194);
                int dimension = (int) getResources().getDimension(2131167845);
                android.view.ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final android.widget.TextView textView = (android.widget.TextView) materialCardView.findViewById(2131429196);
                i14++;
                textView.setTag(java.lang.Integer.valueOf(i14));
                textView.setText(java.lang.String.valueOf(i14));
                i(textView, i14, i13, 5);
                frameLayout2.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: aflc
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        android.widget.FrameLayout frameLayout3 = frameLayout2;
                        defpackage.aflh aflhVar = this.a;
                        com.google.android.material.card.MaterialCardView materialCardView2 = materialCardView;
                        android.widget.TextView textView2 = textView;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (!defpackage.aflh.f(motionEvent, view)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            materialCardView2.c(aflhVar.a());
                            textView2.setTextColor(aflhVar.b(2131102948));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout3.isPressed()) {
                                return true;
                            }
                            frameLayout3.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (defpackage.aflh.f(motionEvent, view)) {
                            return true;
                        }
                        frameLayout3.setPressed(false);
                        materialCardView2.c(aflhVar.b(2131101149));
                        textView2.setTextColor(aflhVar.b(2131102943));
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: afle
                    public final /* synthetic */ defpackage.aflh a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i15 = i9;
                        if (i15 == 0) {
                            defpackage.aflh.c(viewGroup2);
                            new android.os.Handler().postDelayed(new eyd(this.a, i14, 18), 250L);
                            return;
                        }
                        android.view.ViewGroup viewGroup3 = viewGroup2;
                        if (i15 != 1) {
                            defpackage.aflh.c(viewGroup3);
                            new android.os.Handler().postDelayed(new eyd(this.a, i14, 16), 250L);
                            return;
                        }
                        defpackage.aflh.c(viewGroup3);
                        new android.os.Handler().postDelayed(new eyd(this.a, i14, 17), 250L);
                    }
                });
                viewGroup2.addView(viewInflate2);
            }
            return;
        }
        int iAb4 = a.ab(i3);
        if (iAb4 == 0 || iAb4 != 4) {
            int iAb5 = a.ab(i3);
            if (iAb5 == 0 || iAb5 != 6) {
                return;
            }
            int iB = b(2131102937);
            android.graphics.drawable.Drawable drawableG = g(2131232061, iB);
            android.graphics.drawable.Drawable drawableG2 = g(2131232060, iB);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(2131429192);
            linearLayout.setGravity(17);
            android.view.View viewInflate3 = android.view.LayoutInflater.from(getContext()).inflate(2131624648, (android.view.ViewGroup) linearLayout, false);
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewInflate3.findViewById(2131429198);
            imageView2.setImageDrawable(drawableG);
            imageView2.setContentDescription(this.d.e);
            byte[] bArr = null;
            imageView2.setOnClickListener(new defpackage.wgf(this, linearLayout, 14, bArr));
            android.widget.ImageView imageView3 = (android.widget.ImageView) viewInflate3.findViewById(2131429197);
            imageView3.setImageDrawable(drawableG2);
            imageView3.setContentDescription(this.d.f);
            imageView3.setOnClickListener(new defpackage.wgf(this, linearLayout, 15, bArr));
            linearLayout.addView(viewInflate3);
            return;
        }
        int iA = a();
        android.graphics.drawable.Drawable drawableG3 = g(2131232058, b(2131102937));
        final android.graphics.drawable.Drawable drawableG4 = g(2131232059, iA);
        final android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(2131429192);
        android.view.LayoutInflater layoutInflaterFrom3 = android.view.LayoutInflater.from(getContext());
        int i15 = this.d.c;
        final int i16 = 0;
        while (i16 < i15) {
            android.view.View viewInflate4 = layoutInflaterFrom3.inflate(2131624646, viewGroup3, false);
            if (i16 == 0) {
                viewInflate4.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i7, i7));
                i16 = 0;
            }
            final android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) viewInflate4.findViewById(2131429191);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131167843);
            viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
            android.widget.ImageView imageView4 = (android.widget.ImageView) frameLayout3.findViewById(2131429190);
            imageView4.setImageDrawable(drawableG3);
            i16++;
            imageView4.setTag(java.lang.Integer.valueOf(i16));
            i(imageView4, i16, i15, 4);
            final android.graphics.drawable.Drawable drawable = drawableG3;
            frameLayout3.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: aflf
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    int i17 = defpackage.aflh.b;
                    android.view.ViewGroup viewGroup4 = viewGroup3;
                    android.widget.FrameLayout frameLayout4 = frameLayout3;
                    int i18 = i16;
                    android.graphics.drawable.Drawable drawable2 = drawable;
                    int action = motionEvent.getAction();
                    android.graphics.drawable.Drawable drawable3 = drawableG4;
                    if (action == 0) {
                        if (!defpackage.aflh.f(motionEvent, view)) {
                            return true;
                        }
                        frameLayout4.setPressed(true);
                        defpackage.aflh.d(viewGroup4, i18, drawable2, drawable3);
                        return true;
                    }
                    if (action == 1) {
                        if (!frameLayout4.isPressed()) {
                            return true;
                        }
                        frameLayout4.performClick();
                        defpackage.aflh.d(viewGroup4, i18, drawable2, drawable3);
                        return true;
                    }
                    if (action != 2) {
                        return false;
                    }
                    if (defpackage.aflh.f(motionEvent, view)) {
                        return true;
                    }
                    frameLayout4.setPressed(false);
                    defpackage.aflh.d(viewGroup4, 0, drawable2, drawable3);
                    return true;
                }
            });
            frameLayout3.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: afle
                public final /* synthetic */ defpackage.aflh a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = i2;
                    if (i17 == 0) {
                        defpackage.aflh.c(viewGroup3);
                        new android.os.Handler().postDelayed(new eyd(this.a, i16, 18), 250L);
                        return;
                    }
                    android.view.ViewGroup viewGroup4 = viewGroup3;
                    if (i17 != 1) {
                        defpackage.aflh.c(viewGroup4);
                        new android.os.Handler().postDelayed(new eyd(this.a, i16, 16), 250L);
                        return;
                    }
                    defpackage.aflh.c(viewGroup4);
                    new android.os.Handler().postDelayed(new eyd(this.a, i16, 17), 250L);
                }
            });
            viewGroup3.addView(viewInflate4);
            drawableG3 = drawable;
            i7 = -2;
        }
    }
}
