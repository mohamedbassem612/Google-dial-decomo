package com.android.dialer.timekeeper.histogram;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class HistogramView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final aify j = aify.r(13, 19, 24);
    private static final aify v = aify.r(5, 7, 7);
    private final android.widget.LinearLayout A;
    private final android.widget.ImageView B;
    private j$.util.Optional C;
    private defpackage.agci D;
    private boolean E;
    public final java.lang.String[] k;
    public final java.lang.String[] l;
    public final com.google.android.material.tabs.TabLayout m;
    public final android.widget.LinearLayout n;
    public final android.widget.LinearLayout o;
    public final android.widget.ImageView p;
    public final android.widget.TextView q;
    public int r;
    public android.support.v7.widget.AppCompatImageView s;
    public j$.util.Optional t;
    public j$.util.Optional u;
    private final java.lang.String[] w;
    private final java.text.SimpleDateFormat x;
    private final java.text.SimpleDateFormat y;
    private final android.widget.LinearLayout z;

    /* JADX INFO: compiled from: PG */
    public final class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new gec(15);
        int a;
        int b;
        boolean c;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistogramView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        com.google.android.material.tabs.TabLayout tabLayout;
        super(context, attributeSet, i);
        this.w = new java.text.DateFormatSymbols().getShortWeekdays();
        this.k = new java.text.DateFormatSymbols().getWeekdays();
        this.l = getResources().getStringArray(2130903040);
        this.x = new java.text.SimpleDateFormat("h a", java.util.Locale.getDefault());
        this.y = new java.text.SimpleDateFormat("ha", java.util.Locale.getDefault());
        this.C = j$.util.Optional.empty();
        this.r = -1;
        this.t = j$.util.Optional.empty();
        this.u = j$.util.Optional.empty();
        this.E = false;
        int i2 = 1;
        android.view.LayoutInflater.from(context).inflate(2131624265, (android.view.ViewGroup) this, true);
        ((use) agab.aH(context, use.class)).mv();
        this.n = (android.widget.LinearLayout) findViewById(2131427549);
        this.z = (android.widget.LinearLayout) findViewById(2131429035);
        this.A = (android.widget.LinearLayout) findViewById(2131429281);
        this.o = (android.widget.LinearLayout) findViewById(2131428917);
        this.p = (android.widget.ImageView) findViewById(2131428918);
        this.q = (android.widget.TextView) findViewById(2131428919);
        this.B = (android.widget.ImageView) findViewById(2131428335);
        this.m = (com.google.android.material.tabs.TabLayout) findViewById(2131427920);
        while (true) {
            tabLayout = this.m;
            if (i2 > 7) {
                break;
            }
            defpackage.agcm agcmVarD = tabLayout.d();
            agcmVarD.d(n() ? this.l[i2].toUpperCase(java.util.Locale.getDefault()) : this.w[i2].toUpperCase(java.util.Locale.getDefault()));
            agcmVarD.c(this.k[i2]);
            tabLayout.f(agcmVarD);
            i2++;
        }
        tabLayout.addOnLayoutChangeListener(new defpackage.qns(this, 4));
        if (n()) {
            android.view.ViewGroup.LayoutParams layoutParams = (dtv) this.m.getLayoutParams();
            ((dtv) layoutParams).leftMargin = 0;
            ((dtv) layoutParams).rightMargin = 0;
            this.m.setLayoutParams(layoutParams);
        }
    }

    private final boolean n() {
        return getResources().getDisplayMetrics().densityDpi > aa$.ExternalSyntheticApiModelOutline1.m() || getResources().getConfiguration().fontScale > 1.0f;
    }

    public final int e(boolean z) {
        return z ? getContext().getColor(2131099730) : urg.c(getContext(), 2130968715);
    }

    public final int f(boolean z) {
        return z ? urg.c(getContext(), 2130968716) : urg.c(getContext(), 2130968717);
    }

    public final int g(boolean z) {
        return z ? urg.c(getContext(), 2130968710) : urg.c(getContext(), 2130968711);
    }

    public final int h(float f) {
        return (int) ((f * aa$.ExternalSyntheticApiModelOutline1.m()) / getResources().getDisplayMetrics().densityDpi);
    }

    public final void i() {
        if (this.C.isPresent()) {
            android.widget.ImageView imageView = this.B;
            imageView.measure(0, 0);
            imageView.getLocationOnScreen(new int[2]);
            ((android.widget.PopupWindow) this.C.orElseThrow()).showAsDropDown(imageView);
        }
    }

    public final void j(int i, int i2) {
        android.content.Context context = getContext();
        android.content.res.TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(2130903054);
        int iH = h(typedArrayObtainTypedArray.getDimension(i2, 0.0f));
        typedArrayObtainTypedArray.recycle();
        int iIntValue = ((java.lang.Integer) j.get(i2)).intValue();
        int iIntValue2 = ((java.lang.Integer) v.get(i2)).intValue();
        android.widget.LinearLayout linearLayout = this.z;
        linearLayout.removeAllViews();
        android.widget.LinearLayout linearLayout2 = this.A;
        linearLayout2.removeAllViews();
        int i3 = iH * 3;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i3, h(context.getResources().getDimension(2131167434)));
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i3, -2);
        for (int i4 = 0; i4 < iIntValue2; i4++) {
            android.support.v7.widget.AppCompatImageView appCompatImageView = new android.support.v7.widget.AppCompatImageView(context);
            appCompatImageView.setLayoutParams(layoutParams);
            appCompatImageView.setImageDrawable(context.getDrawable(2131232153));
            linearLayout.addView(appCompatImageView);
            android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(context);
            appCompatTextView.setLayoutParams(layoutParams2);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextAppearance(context, 2132083252);
            int i5 = i + (i4 * 3) + (iIntValue == 24 ? 2 : 0);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(11, i5);
            java.lang.String str = this.y.format(calendar.getTime());
            appCompatTextView.setText(str.substring(0, str.length() - 1).toLowerCase(java.util.Locale.getDefault()));
            appCompatTextView.setImportantForAccessibility(2);
            linearLayout2.addView(appCompatTextView);
        }
        if (iIntValue == 24) {
            linearLayout.setPaddingRelative(0, 0, iH, 0);
            linearLayout2.setPaddingRelative(0, 0, iH, 0);
        } else {
            linearLayout.setPaddingRelative(0, 0, 0, 0);
            linearLayout2.setPaddingRelative(0, 0, 0, 0);
        }
    }

    public final java.lang.String k(java.util.Map map, int i, defpackage.vqu vquVar) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, i);
        java.lang.String str = this.x.format(calendar.getTime());
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        boolean zContainsKey = map.containsKey(numValueOf);
        java.lang.String[] strArr = this.w;
        if (!zContainsKey) {
            return ((android.content.Context) vquVar.a).getString(2132018869, strArr[this.r], str);
        }
        java.lang.String str2 = strArr[this.r];
        defpackage.urv urvVar = ((defpackage.urw) map.get(numValueOf)).c;
        if (urvVar == null) {
            urvVar = defpackage.urv.a;
        }
        int i2 = urvVar.d / 60;
        return ((android.content.Context) vquVar.a).getString(2132018867, str2, str, java.lang.Integer.valueOf(i2));
    }

    public final void l(android.support.v7.widget.AppCompatImageView appCompatImageView, java.util.Map map, defpackage.vqu vquVar) {
        java.lang.Integer num = (java.lang.Integer) appCompatImageView.getTag(2131428337);
        int iIntValue = num.intValue();
        boolean zContainsKey = map.containsKey(num);
        appCompatImageView.setImageTintList(android.content.res.ColorStateList.valueOf(zContainsKey ? urg.c(getContext(), 2130968713) : urg.c(getContext(), 2130968712)));
        android.support.v7.widget.AppCompatImageView appCompatImageView2 = this.s;
        if (appCompatImageView2 != null) {
            java.lang.Integer num2 = (java.lang.Integer) appCompatImageView2.getTag(2131428337);
            num2.intValue();
            this.s.setImageTintList(android.content.res.ColorStateList.valueOf(g(map.containsKey(num2))));
        }
        android.widget.LinearLayout linearLayout = this.o;
        linearLayout.setBackgroundTintList(android.content.res.ColorStateList.valueOf(e(zContainsKey)));
        this.p.setImageTintList(android.content.res.ColorStateList.valueOf(f(zContainsKey)));
        android.widget.TextView textView = this.q;
        textView.setTextColor(f(zContainsKey));
        java.lang.String strK = k(map, iIntValue, vquVar);
        textView.setText(strK);
        linearLayout.setContentDescription(strK);
        this.s = appCompatImageView;
        this.t = j$.util.Optional.of(java.lang.Integer.valueOf(this.n.indexOfChild(appCompatImageView)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(j$.util.Optional optional, defpackage.vqu vquVar, defpackage.abtr abtrVar) {
        this.u = j$.util.Optional.of(abtrVar);
        if (!optional.isPresent()) {
            ((java.util.concurrent.atomic.AtomicBoolean) abtrVar.f).set(false);
            ((java.util.concurrent.atomic.AtomicInteger) abtrVar.b).set(0);
            ((java.util.concurrent.atomic.AtomicInteger) abtrVar.d).set(0);
            ((java.util.concurrent.atomic.AtomicInteger) abtrVar.c).set(0);
            this.t = j$.util.Optional.empty();
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428336);
        android.content.Context context = (android.content.Context) vquVar.a;
        textView.setText(context.getString(2132018871));
        android.widget.TextView textView2 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(2131624264, (android.view.ViewGroup) this, false);
        textView2.setText(context.getString(2132018870));
        android.graphics.drawable.Drawable drawable = getContext().getDrawable(2131231904);
        drawable.setTint(urg.c(getContext(), 2130969107));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(getContext());
        popupWindow.setContentView(textView2);
        popupWindow.setBackgroundDrawable(drawable);
        popupWindow.setElevation(getContext().getResources().getDimensionPixelSize(2131166158));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        textView2.setOnClickListener(new defpackage.szl(popupWindow, 9, (byte[]) null));
        this.C = j$.util.Optional.of(popupWindow);
        this.B.setOnClickListener(new defpackage.qgq(this, abtrVar, 14));
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(((defpackage.ury) optional.orElseThrow()).d);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j$.time.Instant.now().toEpochMilli());
        defpackage.agci agciVar = this.D;
        if (agciVar != null) {
            this.m.i(agciVar);
        }
        defpackage.usd usdVar = new defpackage.usd(this, mapUnmodifiableMap, calendar, vquVar, abtrVar);
        this.D = usdVar;
        com.google.android.material.tabs.TabLayout tabLayout = this.m;
        tabLayout.e(usdVar);
        tabLayout.j(tabLayout.c(calendar.get(7) - 1), true);
        ((java.util.concurrent.atomic.AtomicBoolean) abtrVar.f).set(true);
        ((java.util.concurrent.atomic.AtomicInteger) abtrVar.b).set(0);
        ((java.util.concurrent.atomic.AtomicInteger) abtrVar.d).set(0);
        ((java.util.concurrent.atomic.AtomicInteger) abtrVar.c).set(0);
        this.E = true;
    }

    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.widget.LinearLayout linearLayout;
        com.android.dialer.timekeeper.histogram.HistogramView.SavedState savedState = (com.android.dialer.timekeeper.histogram.HistogramView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.E) {
            int i = savedState.a;
            com.google.android.material.tabs.TabLayout tabLayout = this.m;
            if (tabLayout != null) {
                tabLayout.j(tabLayout.c(i), true);
            }
            int i2 = savedState.b;
            if (i2 != -1 && (linearLayout = this.n) != null && linearLayout.getChildAt(i2) != null && linearLayout.getChildAt(i2) != this.s) {
                linearLayout.getChildAt(i2).performClick();
            }
            if (savedState.c) {
                i();
            }
        }
    }

    public final android.os.Parcelable onSaveInstanceState() {
        com.android.dialer.timekeeper.histogram.HistogramView.SavedState savedState = new com.android.dialer.timekeeper.histogram.HistogramView.SavedState(super.onSaveInstanceState());
        savedState.a = this.r - 1;
        savedState.b = ((java.lang.Integer) this.t.orElse(-1)).intValue();
        boolean z = false;
        if (this.C.isPresent() && ((android.widget.PopupWindow) this.C.orElseThrow()).isShowing()) {
            z = true;
        }
        savedState.c = z;
        return savedState;
    }

    public HistogramView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HistogramView(android.content.Context context) {
        this(context, null);
    }
}
