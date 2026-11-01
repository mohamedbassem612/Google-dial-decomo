package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class geu extends kh {
    public java.util.List a;
    private final androidx.preference.PreferenceGroup e;
    private java.util.List f;
    private final java.util.List g;
    private final java.lang.Runnable i = new defpackage.fkh(this, 6);
    private final android.os.Handler h = new android.os.Handler(android.os.Looper.getMainLooper());

    public geu(androidx.preference.PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.E = this;
        this.f = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        if (preferenceGroup instanceof androidx.preference.PreferenceScreen) {
            r(((androidx.preference.PreferenceScreen) preferenceGroup).e);
        } else {
            r(true);
        }
        x();
    }

    private final void A(java.util.List list, androidx.preference.PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            java.util.Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            androidx.preference.Preference preferenceN = preferenceGroup.n(i);
            list.add(preferenceN);
            defpackage.get getVar = new defpackage.get(preferenceN);
            java.util.List list2 = this.g;
            if (!list2.contains(getVar)) {
                list2.add(getVar);
            }
            if (preferenceN instanceof androidx.preference.PreferenceGroup) {
                androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preferenceN;
                if (preferenceGroup2.q()) {
                    A(list, preferenceGroup2);
                }
            }
            preferenceN.E = this;
        }
    }

    private static final boolean B(androidx.preference.PreferenceGroup preferenceGroup) {
        return preferenceGroup.d != Integer.MAX_VALUE;
    }

    private final java.util.List z(androidx.preference.PreferenceGroup preferenceGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            androidx.preference.Preference preferenceN = preferenceGroup.n(i2);
            if (preferenceN.x) {
                if (!B(preferenceGroup) || i < preferenceGroup.d) {
                    arrayList.add(preferenceN);
                } else {
                    arrayList2.add(preferenceN);
                }
                if (preferenceN instanceof androidx.preference.PreferenceGroup) {
                    androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preferenceN;
                    if (!preferenceGroup2.q()) {
                        continue;
                    } else {
                        if (B(preferenceGroup) && B(preferenceGroup2)) {
                            throw new java.lang.IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (androidx.preference.Preference preference : z(preferenceGroup2)) {
                            if (!B(preferenceGroup) || i < preferenceGroup.d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (B(preferenceGroup) && i > preferenceGroup.d) {
            defpackage.geb gebVar = new defpackage.geb(preferenceGroup.j, arrayList2, preferenceGroup.dN());
            gebVar.o = new defpackage.ges(this, preferenceGroup);
            arrayList.add(gebVar);
        }
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final int b(int i) {
        defpackage.get getVar = new defpackage.get(w(i));
        java.util.List list = this.g;
        int iIndexOf = list.indexOf(getVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(getVar);
        return size;
    }

    public final long c(int i) {
        if (((kh) this).c) {
            return w(i).dN();
        }
        return -1L;
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        defpackage.get getVar = (defpackage.get) this.g.get(i);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, defpackage.gfd.a);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = den.bO(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        android.view.View viewInflate = layoutInflaterFrom.inflate(getVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = getVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new defpackage.gfc(viewInflate);
    }

    public final /* bridge */ /* synthetic */ void m(ld ldVar, int i) {
        defpackage.gfc gfcVar = (defpackage.gfc) ldVar;
        android.view.View view = gfcVar.a;
        androidx.preference.Preference preferenceW = w(i);
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.Drawable drawable = gfcVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        android.widget.TextView textView = (android.widget.TextView) gfcVar.C(android.R.id.title);
        if (textView != null && gfcVar.t != null && !textView.getTextColors().equals(gfcVar.t)) {
            textView.setTextColor(gfcVar.t);
        }
        preferenceW.a(gfcVar);
    }

    public final androidx.preference.Preference w(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (androidx.preference.Preference) this.a.get(i);
    }

    public final void x() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((androidx.preference.Preference) it.next()).E = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f.size());
        this.f = arrayList;
        androidx.preference.PreferenceGroup preferenceGroup = this.e;
        A(arrayList, preferenceGroup);
        this.a = z(preferenceGroup);
        gez gezVar = preferenceGroup.k;
        e();
        for (androidx.preference.Preference preference : this.f) {
        }
    }

    public final void y() {
        android.os.Handler handler = this.h;
        java.lang.Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
