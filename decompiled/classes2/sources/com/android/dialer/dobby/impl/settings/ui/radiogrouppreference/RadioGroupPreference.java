package com.android.dialer.dobby.impl.settings.ui.radiogrouppreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class RadioGroupPreference extends androidx.preference.Preference {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/settings/ui/radiogrouppreference/RadioGroupPreference");
    private final java.lang.String b;
    private java.util.List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioGroupPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        java.lang.String strK;
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        new java.util.LinkedHashMap();
        this.c = aokc.a;
        ad();
        this.A = 2131624399;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.npu.a, i, i2);
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            strK = k(typedArrayObtainStyledAttributes, 18);
            aooh.d(strK, "null cannot be cast to non-null type kotlin.String");
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            strK = k(typedArrayObtainStyledAttributes, 11);
            aooh.d(strK, "null cannot be cast to non-null type kotlin.String");
        } else {
            strK = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.b = strK;
    }

    protected static final java.lang.String k(android.content.res.TypedArray typedArray, int i) {
        aooh.f(typedArray, "a");
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        aooh.f(gfcVar, "holder");
        super.a(gfcVar);
        java.util.List list = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ajsz.bQ(arrayList).size();
        list.size();
        java.util.List list2 = this.c;
        java.lang.String str = this.b;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (str == null) {
            str = "";
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/settings/ui/radiogrouppreference/RadioGroupPreference$Companion", "cleanUpSelectedItem", 181, "RadioGroupPreference.kt").y("Invalid selected items, default item [%s] is selected instead.", str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = list2.iterator();
        if (it3.hasNext()) {
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            defpackage.npv npvVar = (defpackage.npv) it4.next();
            java.lang.String str2 = npvVar.a;
            java.lang.String str3 = npvVar.b;
            java.lang.String str4 = npvVar.c;
            boolean z = npvVar.d;
            throw null;
        }
        this.c = arrayList3;
        java.util.Iterator it5 = arrayList3.iterator();
        if (it5.hasNext()) {
            throw null;
        }
    }

    @Override // androidx.preference.Preference
    public final /* bridge */ /* synthetic */ java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return k(typedArray, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioGroupPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioGroupPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioGroupPreference(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ RadioGroupPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
