package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class usd implements defpackage.agci {
    final /* synthetic */ java.util.Map a;
    final /* synthetic */ java.util.Calendar b;
    final /* synthetic */ com.android.dialer.timekeeper.histogram.HistogramView c;
    final /* synthetic */ defpackage.abtr d;
    final /* synthetic */ defpackage.vqu e;

    public usd(com.android.dialer.timekeeper.histogram.HistogramView histogramView, java.util.Map map, java.util.Calendar calendar, defpackage.vqu vquVar, defpackage.abtr abtrVar) {
        this.a = map;
        this.b = calendar;
        this.e = vquVar;
        this.d = abtrVar;
        j$.util.Objects.requireNonNull(histogramView);
        this.c = histogramView;
    }

    @Override // defpackage.agch
    public final void a(defpackage.agcm agcmVar) {
        b(agcmVar);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.ViewGroup, com.android.dialer.timekeeper.histogram.HistogramView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.agch
    public final void b(defpackage.agcm agcmVar) {
        int i;
        int iMax;
        defpackage.usd usdVar = this;
        int i2 = agcmVar.c;
        ahvr.bZ(i2 != -1, "failed to get tab position");
        ?? r6 = usdVar.c;
        r6.r = i2 + 1;
        r6.t = j$.util.Optional.empty();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(r6.r);
        java.util.Map map = usdVar.a;
        if (map.containsKey(numValueOf)) {
            defpackage.urx urxVar = (defpackage.urx) map.get(java.lang.Integer.valueOf(r6.r));
            java.util.Calendar calendar = usdVar.b;
            defpackage.vqu vquVar = usdVar.e;
            defpackage.abtr abtrVar = usdVar.d;
            int i3 = calendar.get(11);
            java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(urxVar.b);
            if (!mapUnmodifiableMap.isEmpty()) {
                int iIntValue = ((java.lang.Integer) java.util.Collections.min(mapUnmodifiableMap.keySet())).intValue();
                final int iIntValue2 = (((java.lang.Integer) java.util.Collections.max(mapUnmodifiableMap.keySet())).intValue() - iIntValue) + 1;
                aike aikeVar = com.android.dialer.timekeeper.histogram.HistogramView.j;
                int asInt = j$.util.stream.IntStream.-CC.range(0, aikeVar.d).filter(new java.util.function.IntPredicate() { // from class: usc
                    @Override // java.util.function.IntPredicate
                    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
                        return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
                    }

                    @Override // java.util.function.IntPredicate
                    public final /* synthetic */ java.util.function.IntPredicate negate() {
                        return j$.util.function.IntPredicate.-CC.$default$negate(this);
                    }

                    @Override // java.util.function.IntPredicate
                    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
                        return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
                    }

                    @Override // java.util.function.IntPredicate
                    public final boolean test(int i4) {
                        return ((java.lang.Integer) com.android.dialer.timekeeper.histogram.HistogramView.j.get(i4)).intValue() >= iIntValue2;
                    }
                }).findFirst().getAsInt();
                int iIntValue3 = ((java.lang.Integer) aikeVar.get(asInt)).intValue();
                int iMax2 = java.lang.Math.max(iIntValue - ((iIntValue3 - iIntValue2) / 2), 0);
                int i4 = iMax2 + iIntValue3;
                if (i4 > 24) {
                    iMax2 = 24 - iIntValue3;
                    i = 24;
                } else {
                    i = i4;
                }
                android.content.Context context = r6.getContext();
                android.content.res.TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(2130903054);
                int iH = r6.h(typedArrayObtainTypedArray.getDimension(asInt, 0.0f));
                typedArrayObtainTypedArray.recycle();
                android.content.res.TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(2130903053);
                int iH2 = r6.h(typedArrayObtainTypedArray2.getDimension(asInt, 0.0f));
                typedArrayObtainTypedArray2.recycle();
                int iH3 = r6.h(context.getResources().getDimension(2131165339));
                int iH4 = r6.h(context.getResources().getDimension(2131165340));
                android.widget.LinearLayout linearLayout = r6.n;
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                int i5 = iMax2;
                while (i5 < i) {
                    android.widget.LinearLayout linearLayout2 = linearLayout;
                    android.support.v7.widget.AppCompatImageView appCompatImageView = new android.support.v7.widget.AppCompatImageView(context);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i5);
                    int i6 = iH3;
                    appCompatImageView.setTag(2131428337, numValueOf2);
                    appCompatImageView.setContentDescription(r6.k(mapUnmodifiableMap, i5, vquVar));
                    int i7 = i;
                    int i8 = i5;
                    int i9 = i3;
                    appCompatImageView.setOnClickListener(new mar((android.view.ViewGroup) r6, mapUnmodifiableMap, vquVar, abtrVar, 2));
                    if (mapUnmodifiableMap.containsKey(numValueOf2)) {
                        defpackage.urv urvVar = ((defpackage.urw) mapUnmodifiableMap.get(numValueOf2)).c;
                        if (urvVar == null) {
                            urvVar = defpackage.urv.a;
                        }
                        iMax = java.lang.Math.max((urvVar.d * i6) / 3600, iH4);
                    } else {
                        iMax = iH4;
                    }
                    appCompatImageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(iH, i6));
                    appCompatImageView.setPadding(iH2, i6 - iMax, iH2, 0);
                    appCompatImageView.setImageDrawable(context.getDrawable(2131230928));
                    appCompatImageView.setImageTintList(android.content.res.ColorStateList.valueOf(r6.g(mapUnmodifiableMap.containsKey(numValueOf2))));
                    linearLayout2.addView(appCompatImageView);
                    linearLayout = linearLayout2;
                    iH3 = i6;
                    i = i7;
                    i3 = i9;
                    i5 = i8 + 1;
                }
                int i10 = i3;
                int i11 = i;
                android.widget.LinearLayout linearLayout3 = linearLayout;
                dtv layoutParams = linearLayout3.getLayoutParams();
                layoutParams.height = iH3;
                linearLayout3.setLayoutParams(layoutParams);
                r6.j(iMax2, asInt);
                android.support.v7.widget.AppCompatImageView childAt = linearLayout3.getChildAt((i10 < iMax2 || i10 >= i11) ? 0 : i10 - iMax2);
                if (!childAt.equals(r6.s)) {
                    r6.l(childAt, mapUnmodifiableMap, vquVar);
                }
                usdVar = this;
            }
        } else {
            defpackage.vqu vquVar2 = usdVar.e;
            r6.n.setVisibility(4);
            android.widget.LinearLayout linearLayout4 = r6.o;
            linearLayout4.setBackgroundTintList(android.content.res.ColorStateList.valueOf(r6.e(false)));
            r6.p.setImageTintList(android.content.res.ColorStateList.valueOf(r6.f(false)));
            android.widget.TextView textView = r6.q;
            textView.setTextColor(r6.f(false));
            java.lang.String string = ((android.content.Context) vquVar2.a).getString(2132018868, r6.k[r6.r]);
            textView.setText(string);
            linearLayout4.setContentDescription(string);
            r6.j(0, 0);
        }
        usdVar.d.t(2);
    }

    @Override // defpackage.agch
    public final void c() {
    }
}
