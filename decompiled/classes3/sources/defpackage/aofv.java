package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aofv {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aofv(aofu aofuVar, aogm aogmVar) {
        this.b = aofuVar;
        ahvr.cj(aogmVar, "frameWriter");
        this.c = aogmVar;
        this.a = 65535;
        this.d = new aoft(this, 0, 65535, (aofs) null);
    }

    public static int e(android.app.Activity activity, android.content.res.Configuration configuration, int i) {
        return configuration != null ? aesg.l(activity.getResources().getDisplayMetrics(), configuration.screenHeightDp) : i;
    }

    public static int f(android.app.Activity activity, android.content.res.Configuration configuration, int i) {
        return configuration != null ? aesg.l(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp) : i;
    }

    public static final int j(android.app.Activity activity, boolean z, int i) {
        return i - (z ? activity.getResources().getDimensionPixelOffset(2131166141) + dwn.e(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(activity.getWindowManager())), baa$.ExternalSyntheticApiModelOutline1.m() | baa$.ExternalSyntheticApiModelOutline1.m$1())).e : activity.getResources().getDimensionPixelOffset(2131166149) << 1);
    }

    public static final akjh k(akjx akjxVar) {
        int i = akjxVar.c;
        if (i == 2) {
            return (akjh) akjxVar.d;
        }
        if (i != 6) {
            throw new java.lang.IllegalArgumentException("PromoUi can't be built using a DialogBuilder.");
        }
        akjh akjhVar = ((defpackage.akju) akjxVar.d).d;
        return akjhVar == null ? akjh.a : akjhVar;
    }

    public static final android.widget.FrameLayout l(android.view.View view) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
        frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2, 1));
        return frameLayout;
    }

    private static void m(boolean z, android.widget.LinearLayout linearLayout, int i) {
        int i2 = 0;
        while (i2 < linearLayout.getChildCount()) {
            android.view.View childAt = linearLayout.getChildAt(i2);
            boolean z2 = i2 == linearLayout.getChildCount() + (-1);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.setMarginEnd((z || z2) ? 0 : i);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = (!z || z2) ? 0 : i;
            i2++;
        }
    }

    private static void n(android.view.View view, int i) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    private static final boolean o(akjh akjhVar) {
        int iAQ;
        return ((akjhVar.b & 256) == 0 || (iAQ = a.aQ(akjhVar.k)) == 0 || iAQ != 3) ? false : true;
    }

    private static final void p(android.view.ViewGroup viewGroup, boolean z) {
        android.view.View view = (androidx.core.widget.NestedScrollView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624149, viewGroup, false);
        view.setScrollbarFadingEnabled(true);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        if (z) {
            android.view.View viewFindViewById = viewGroup.findViewById(2131427967);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(2131427966);
            android.view.View viewFindViewById2 = viewGroup.findViewById(2131427964);
            viewFindViewById2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
            viewGroup2.removeView(viewFindViewById2);
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
            viewGroup.removeView(viewFindViewById);
            viewGroup.removeView(viewGroup2);
            linearLayout.addView(viewFindViewById);
            linearLayout.addView(viewGroup2);
            viewGroup.addView(viewFindViewById2);
        } else {
            android.view.View viewFindViewById3 = viewGroup.findViewById(2131427973);
            android.view.View viewFindViewById4 = viewGroup.findViewById(2131427962);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.removeView(viewFindViewById4);
            linearLayout.addView(viewFindViewById3);
            linearLayout.addView(viewFindViewById4);
        }
        view.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(view, 0, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    public final void a(boolean z, aoft aoftVar, apoy apoyVar, boolean z2) {
        ahvr.cj(apoyVar, "source");
        int iB = aoftVar.b();
        boolean zD = aoftVar.d();
        int i = (int) apoyVar.b;
        if (zD) {
            aoftVar.a.fQ(apoyVar, (int) apoyVar.b);
            aoftVar.d |= z;
        } else if (iB >= i) {
            aoftVar.c(apoyVar, i, z);
        } else {
            if (iB > 0) {
                aoftVar.c(apoyVar, iB, false);
            }
            aoftVar.a.fQ(apoyVar, (int) apoyVar.b);
            aoftVar.d |= z;
        }
        if (z2) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aogm, java.lang.Object] */
    public final void b() {
        try {
            this.c.d();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aofu, java.lang.Object] */
    public final void c() {
        ?? r0 = this.b;
        aoft[] aoftVarArrS = r0.s();
        java.util.Collections.shuffle(java.util.Arrays.asList(aoftVarArrS));
        int length = aoftVarArrS.length;
        int i = ((aoft) this.d).b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) java.lang.Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                aoft aoftVar = aoftVarArrS[i3];
                int iMin = java.lang.Math.min(i, java.lang.Math.min(aoftVar.a(), iCeil));
                if (iMin > 0) {
                    aoftVar.c += iMin;
                    i -= iMin;
                }
                if (aoftVar.a() > 0) {
                    aoftVarArrS[i2] = aoftVar;
                    i2++;
                }
            }
            length = i2;
        }
        xm xmVar = new xm((short[]) null);
        for (aoft aoftVar2 : r0.s()) {
            aoftVar2.f(aoftVar2.c, xmVar);
            aoftVar2.c = 0;
        }
        if (xmVar.e()) {
            b();
        }
    }

    public final void d(aoft aoftVar, int i) {
        if (aoftVar == null) {
            ((aoft) this.d).e(i);
            c();
            return;
        }
        aoftVar.e(i);
        xm xmVar = new xm((short[]) null);
        aoftVar.f(aoftVar.b(), xmVar);
        if (xmVar.e()) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [adzn, java.lang.Object] */
    public final android.view.View g(android.app.Activity activity, akjx akjxVar, defpackage.akkc akkcVar, akjh akjhVar, java.util.List list) {
        java.lang.String str;
        java.util.Iterator it;
        android.widget.Button button;
        android.widget.Button button2;
        boolean z;
        int i;
        int iAQ = a.aQ(akjxVar.h);
        if (iAQ == 0) {
            iAQ = 1;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(activity);
        int iAQ2 = a.aQ(akjhVar.k);
        if (iAQ2 == 0) {
            iAQ2 = 1;
        }
        android.view.View viewInflate = layoutInflaterFrom.inflate(iAQ2 + (-1) != 1 ? 2131624151 : 2131624150, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131427973);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(2131427962);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(2131427964);
        textView.setText(akjhVar.c);
        java.lang.String str2 = akjhVar.d;
        if (akjhVar.e) {
            textView2.setText(((defpackage.afpl) this.b).t(str2));
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        } else {
            textView2.setText(str2);
        }
        if ((akjhVar.b & 8) != 0) {
            akjg akjgVarB = akjg.b(akjhVar.f);
            if (akjgVarB == null) {
                akjgVarB = akjg.a;
            }
            if (akjgVarB.ordinal() != 1) {
                textView.setTextAppearance(2132083911);
            } else {
                textView.setTextAppearance(2132083912);
            }
        }
        if (o(akjhVar)) {
            float dimension = activity.getResources().getDimension(2131166145);
            ((com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.dialogs.RoundedCornersImageView) viewInflate.findViewById(2131427967)).a(dimension, dimension, 0.0f, 0.0f);
        }
        int iAQ3 = a.aQ(akjhVar.k);
        if (iAQ3 == 0 || iAQ3 == 1) {
            n(textView, 8388611);
        }
        boolean z2 = iAQ == 3 && afsg.a();
        aooh.f(activity, "context");
        aooh.f(akkcVar, "theme");
        defpackage.aciy aciyVarN = defpackage.abxl.n(activity, akkcVar, iAQ == 3 && afsg.a());
        akje akjeVarB = akje.b(akjhVar.h);
        if (akjeVarB == null) {
            akjeVarB = akje.a;
        }
        akje akjeVar = akje.b;
        java.util.Iterator it2 = akjhVar.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                this.a = activity.getResources().getDimensionPixelOffset(2131166142);
                akje akjeVarB2 = akje.b(akjhVar.h);
                if (akjeVarB2 == null) {
                    akjeVarB2 = akje.a;
                }
                if (akjeVarB2.ordinal() != 1) {
                    linearLayout.setOrientation(0);
                    m(false, linearLayout, this.a);
                } else {
                    linearLayout.setOrientation(1);
                    m(true, linearLayout, this.a);
                }
                akjd akjdVarB = akjd.b(akjhVar.i);
                if (akjdVarB == null) {
                    akjdVarB = akjd.a;
                }
                n(linearLayout, akjdVarB.ordinal() != 2 ? 8388613 : 1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int iC = akky.c(akjhVar.l);
                if (iC == 0) {
                    iC = 1;
                }
                int i2 = iC - 1;
                if (i2 == 4) {
                    viewInflate.setBackgroundResource(2131231136);
                    arrayList.add(viewInflate);
                } else if (i2 == 6) {
                    viewInflate.setBackgroundResource(2131231137);
                    arrayList.add(viewInflate);
                    float dimension2 = activity.getResources().getDimension(2131166140);
                    int i3 = dzs.a;
                    viewInflate.setElevation(dimension2);
                }
                if (akkcVar == defpackage.akkc.UNSPECIFIED) {
                    break;
                }
                if (z2 && aciyVarN != null) {
                    textView.setTextColor(aciyVarN.d);
                    textView2.setTextColor(aciyVarN.e);
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((android.view.View) arrayList.get(i4)).getBackground().setTint(aciyVarN.c);
                    }
                    break;
                }
                akkd akkdVar = (akkd) defpackage.acjh.a(akkcVar, akjhVar.j).d();
                if (akkdVar != null) {
                    akiv akivVar = akkdVar.d;
                    if (akivVar == null) {
                        akivVar = akiv.a;
                    }
                    defpackage.amml ammlVar = akivVar.c;
                    if (ammlVar == null) {
                        ammlVar = defpackage.amml.a;
                    }
                    textView.setTextColor(aesg.m(ammlVar));
                    defpackage.amml ammlVar2 = akivVar.d;
                    if (ammlVar2 == null) {
                        ammlVar2 = defpackage.amml.a;
                    }
                    textView2.setTextColor(aesg.m(ammlVar2));
                    defpackage.amml ammlVar3 = akivVar.e;
                    if (ammlVar3 == null) {
                        ammlVar3 = defpackage.amml.a;
                    }
                    int iM = aesg.m(ammlVar3);
                    int size2 = arrayList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((android.view.View) arrayList.get(i5)).getBackground().setTint(iM);
                    }
                    break;
                }
                break;
            }
            akjc akjcVar = (akjc) it2.next();
            if (akkcVar == defpackage.akkc.UNSPECIFIED) {
                int iAe = a.ae(akjcVar.i);
                if (iAe == 0) {
                    i = 2131624262;
                    z = false;
                } else {
                    if (iAe == 2) {
                        button2 = (android.widget.Button) layoutInflaterFrom.inflate(2131624148, (android.view.ViewGroup) linearLayout, false);
                    } else {
                        z = false;
                        i = 2131624262;
                    }
                    it = it2;
                }
                button2 = (android.widget.Button) layoutInflaterFrom.inflate(i, linearLayout, z);
                it = it2;
            } else if (!z2 || aciyVarN == null) {
                it = it2;
                akkd akkdVar2 = (akkd) defpackage.acjh.a(akkcVar, akjcVar.h).d();
                if (akkdVar2 != null) {
                    akiv akivVar2 = akkdVar2.d;
                    if (akivVar2 == null) {
                        akivVar2 = akiv.a;
                    }
                    if ((akivVar2.b & 4) != 0) {
                        button = (android.widget.Button) layoutInflaterFrom.inflate(2131624148, (android.view.ViewGroup) linearLayout, false);
                        defpackage.amml ammlVar4 = akivVar2.e;
                        if (ammlVar4 == null) {
                            ammlVar4 = defpackage.amml.a;
                        }
                        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(aesg.m(ammlVar4));
                        int i6 = dzs.a;
                        button.setBackgroundTintList(colorStateListValueOf);
                    } else {
                        button = (android.widget.Button) layoutInflaterFrom.inflate(2131624262, (android.view.ViewGroup) linearLayout, false);
                    }
                    defpackage.amml ammlVar5 = akivVar2.c;
                    if (ammlVar5 == null) {
                        ammlVar5 = defpackage.amml.a;
                    }
                    button.setTextColor(aesg.m(ammlVar5));
                    button2 = button;
                }
            } else {
                int iAe2 = a.ae(akjcVar.i);
                it = it2;
                if (iAe2 != 0 && iAe2 == 2) {
                    button2 = (android.widget.Button) layoutInflaterFrom.inflate(2131624148, (android.view.ViewGroup) linearLayout, false);
                    android.content.res.ColorStateList colorStateListValueOf2 = android.content.res.ColorStateList.valueOf(aciyVarN.a);
                    int i7 = dzs.a;
                    button2.setBackgroundTintList(colorStateListValueOf2);
                    button2.setTextColor(aciyVarN.b);
                } else {
                    button2 = (android.widget.Button) layoutInflaterFrom.inflate(2131624262, (android.view.ViewGroup) linearLayout, false);
                    button2.setTextColor(aciyVarN.a);
                }
            }
            button2.setText(akjcVar.f);
            button2.setTag(2131428316, akjcVar);
            list.add(button2);
            if (akjeVarB == akjeVar) {
                linearLayout.addView(button2);
            } else {
                linearLayout.addView(button2, 0);
            }
            it2 = it;
            viewInflate = null;
            break;
        }
        if (viewInflate != null) {
            if (akkcVar != defpackage.akkc.UNSPECIFIED) {
                akkd akkdVar3 = (akkd) defpackage.acjh.a(akkcVar, akjhVar.j).d();
                if (akkdVar3 != null) {
                    akjk akjkVar = akkdVar3.e;
                    if (akjkVar == null) {
                        akjkVar = akjk.a;
                    }
                    str = akjkVar.b == 1 ? (java.lang.String) akjkVar.c : "";
                }
            } else {
                str = null;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(2131427967);
                android.content.Context context = (android.content.Context) this.d;
                int iB = defpackage.acka.b(akjhVar, context);
                int iA = defpackage.acka.a(akjhVar, context);
                java.lang.Object obj = this.c;
                aooh.f(imageView, "imageView");
                aooh.f(str, "mediaUrl");
                defpackage.wsk wskVar = (defpackage.wsk) obj;
                wskVar.a.b((defpackage.vqf) wskVar.b, imageView, new defpackage.aefu(str, iB, iA));
            }
            return viewInflate;
        }
        return null;
    }

    public final void h(android.app.Dialog dialog, akjh akjhVar, android.app.Activity activity, android.view.View view, int i, int i2) {
        int iMin;
        int i3;
        int iAQ;
        boolean zO = o(akjhVar);
        com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.dialogs.MaxDimensionsLinearLayout maxDimensionsLinearLayout = (com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.dialogs.MaxDimensionsLinearLayout) view.findViewById(2131427965);
        boolean z = dialog instanceof defpackage.afqy;
        int iJ = j(activity, z, i2);
        maxDimensionsLinearLayout.a = iJ;
        maxDimensionsLinearLayout.requestLayout();
        float f = i;
        if (z) {
            float f2 = activity.getResources().getDisplayMetrics().density;
            iMin = (int) (java.lang.Math.min((int) (f / f2), 640) * f2);
        } else {
            android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            aooh.f(displayMetrics, "displayMetrics");
            float f3 = f / displayMetrics.density;
            int i4 = (f3 < 600.0f ? 1 : f3 < 840.0f ? 2 : 3) - 1;
            iMin = java.lang.Math.min(i4 != 1 ? i4 != 2 ? activity.getResources().getDimensionPixelOffset(2131166151) : activity.getResources().getDimensionPixelOffset(2131166152) : activity.getResources().getDimensionPixelOffset(2131166153), i - (activity.getResources().getDimensionPixelOffset(2131166149) << 1));
        }
        if (z) {
            maxDimensionsLinearLayout.b = iMin;
            maxDimensionsLinearLayout.requestLayout();
        } else if (dialog.getWindow() != null) {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = iMin;
            layoutParams.height = -2;
            dialog.getWindow().setAttributes(layoutParams);
        }
        int dimensionPixelOffset = iMin - (activity.getResources().getDimensionPixelOffset(2131166144) << 1);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(2131427966);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(2131427964);
        if (linearLayout.getChildCount() > 1 && linearLayout.getOrientation() == 0) {
            linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, 0), android.view.View.MeasureSpec.makeMeasureSpec(iJ, 0));
            if (linearLayout.getMeasuredWidth() > dimensionPixelOffset) {
                linearLayout.setOrientation(1);
                int childCount = linearLayout.getChildCount();
                android.view.View[] viewArr = new android.view.View[childCount];
                for (int i5 = 0; i5 < childCount; i5++) {
                    viewArr[i5] = linearLayout.getChildAt(0);
                    linearLayout.removeViewAt(0);
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    linearLayout.addView(viewArr[i6], 0);
                }
                m(true, linearLayout, this.a);
                n(linearLayout, 1);
            }
        }
        viewGroup.measure(android.view.View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(iJ, 0));
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (!zO) {
            if ((akjhVar.b & 256) == 0 || (iAQ = a.aQ(akjhVar.k)) == 0 || iAQ != 2) {
                i3 = 0;
            } else {
                int dimensionPixelOffset2 = ((android.content.Context) this.d).getResources().getDimensionPixelOffset(2131166147);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelOffset2, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                i3 = ((android.view.ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin + dimensionPixelOffset2;
            }
            if (measuredHeight + i3 > iJ) {
                p(viewGroup, false);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewGroup.findViewById(2131427964);
        linearLayout2.measure(android.view.View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, 0), android.view.View.MeasureSpec.makeMeasureSpec(iJ, 0));
        int measuredHeight2 = linearLayout2.getMeasuredHeight();
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427967);
        int i7 = iJ - measuredHeight;
        int dimensionPixelOffset3 = imageView.getContext().getResources().getDimensionPixelOffset(2131166148);
        if (i7 >= dimensionPixelOffset3) {
            imageView.setMaxHeight(i7);
        } else {
            imageView.setMaxHeight(java.lang.Math.max(dimensionPixelOffset3, (int) (((double) (iJ - measuredHeight2)) * 0.5d)));
            p(maxDimensionsLinearLayout, true);
        }
    }

    public final void i(android.app.Activity activity, android.app.Dialog dialog, android.content.res.Configuration configuration, akjh akjhVar, android.view.View view) {
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        int height = viewFindViewById.getHeight();
        int width = viewFindViewById.getWidth();
        if (height == 0) {
            viewFindViewById.post(new acjp(this, dialog, akjhVar, activity, view, configuration, viewFindViewById));
        } else {
            h(dialog, akjhVar, activity, view, f(activity, configuration, width), e(activity, configuration, height));
        }
    }

    public aofv(android.content.Context context, defpackage.wsk wskVar, defpackage.afpl afplVar) {
        this.d = context;
        this.c = wskVar;
        this.b = afplVar;
    }
}
