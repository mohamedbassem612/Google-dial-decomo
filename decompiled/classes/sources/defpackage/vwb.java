package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vwb {
    static java.lang.Integer d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public vwb(defpackage.aoss aossVar, defpackage.aazc aazcVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aazcVar, "clock");
        this.a = aossVar;
        this.b = new defpackage.ahda((byte[]) null);
    }

    public static int c(android.content.Context context, java.lang.String str, int i) {
        while (i > 0) {
            int i2 = i - 1;
            if (tvp.e(context, java.lang.Character.toLowerCase(str.charAt(i))) && !tvp.e(context, java.lang.Character.toLowerCase(str.charAt(i2)))) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    public static int d(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        int i;
        str2 = str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        h(sb, str.length());
        int length = str.length();
        int length2 = str2.length();
        if (length >= length2 && length2 != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i2 < length && i3 < length2) {
                char cB = tvp.b(context, str.charAt(i2));
                if (tvp.e(context, cB)) {
                    if (tvp.d(context, cB)) {
                        cB = tvp.a(context, cB);
                    }
                    if (cB != str2.charAt(i3)) {
                        if (i3 == 0 || tvp.e(context, tvp.b(context, str.charAt(i2 - 1)))) {
                            while (i2 < length && tvp.e(context, tvp.b(context, str.charAt(i2)))) {
                                i2++;
                            }
                            i2++;
                        }
                        i5 = i2;
                        i2 = i5;
                        i3 = 0;
                        i4 = 0;
                    } else {
                        if (i3 == length2 - 1) {
                            int iC = c(context, str, i5);
                            arrayList.add(new tvu(i5, length2 + i5 + i4, iC));
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                i(sb, (tvu) arrayList.get(i6));
                            }
                            return i5 - iC;
                        }
                        int i7 = i2 + 1;
                        int i8 = i3 + 1;
                        if (i3 <= 0) {
                            int i9 = i2;
                            while (i9 < length && tvp.e(context, tvp.b(context, str.charAt(i9)))) {
                                i9++;
                            }
                            if (i9 < length - 1) {
                                int i10 = i9 + 1;
                                java.lang.String strSubstring = str.substring(i10);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                i = length;
                                if (d(context, strSubstring, str2.substring(i8), arrayList3) >= 0) {
                                    int size2 = arrayList3.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        tvu tvuVar = (tvu) arrayList3.get(i11);
                                        tvuVar.a += i10;
                                        tvuVar.b += i10;
                                        tvuVar.c += i10;
                                    }
                                    arrayList3.add(0, new tvu(i2, i7, c(context, str, i2)));
                                    arrayList2 = arrayList3;
                                }
                            } else {
                                i = length;
                            }
                        } else {
                            i = length;
                        }
                        i2 = i7;
                        i3 = i8;
                    }
                } else {
                    i = length;
                    i2++;
                    if (i3 == 0) {
                        i5 = i2;
                    } else {
                        i4++;
                    }
                }
                length = i;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    i(sb, (tvu) arrayList.get(i12));
                }
                int i13 = ((tvu) arrayList.get(0)).a;
                return i13 - c(context, str, i13);
            }
        }
        return -1;
    }

    public static tvu e(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            int i2 = i;
            int i3 = i2;
            int i4 = 0;
            while (i < str.length() && i4 != str2.length()) {
                char cCharAt = str.charAt(i);
                if (tvp.f(context, cCharAt)) {
                    if (cCharAt == str2.charAt(i4)) {
                        i4++;
                    }
                } else if (i4 == 0) {
                    if (i2 != 0) {
                        i2++;
                    }
                    i4 = 0;
                }
                i3++;
                i++;
            }
            return new tvu(i2, i3, i2);
        }
        return null;
    }

    public static tvu f(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(str.length());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (tvp.f(context, cCharAt)) {
                    arrayList.add(java.lang.Integer.valueOf(i4));
                    sb.append(cCharAt);
                    if (i4 == i) {
                        i2 = i3;
                    }
                    i3++;
                }
            }
            arrayList.add(java.lang.Integer.valueOf(str.length()));
            int iIndexOf = sb.toString().indexOf(str2, i2);
            if (iIndexOf != -1) {
                int iIntValue = ((java.lang.Integer) arrayList.get(iIndexOf)).intValue();
                return new tvu(iIntValue, ((java.lang.Integer) arrayList.get(iIndexOf + str2.length())).intValue(), c(context, str, iIntValue));
            }
        }
        return null;
    }

    public static java.lang.String g(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        for (int i = 0; i < str.length(); i++) {
            char lowerCase = java.lang.Character.toLowerCase(str.charAt(i));
            if (tvp.f(context, lowerCase)) {
                sb.append(lowerCase);
            } else if (tvp.d(context, lowerCase)) {
                sb.append(tvp.a(context, lowerCase));
            } else {
                sb.append('$');
            }
        }
        return sb.toString();
    }

    public static void h(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('0');
        }
    }

    public static void i(java.lang.StringBuilder sb, tvu tvuVar) {
        int i = tvuVar.a;
        while (i < tvuVar.b) {
            int i2 = i + 1;
            sb.replace(i, i2, "1");
            i = i2;
        }
    }

    public static java.lang.String j(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (tvp.f(context, cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final boolean q(int i, int i2) {
        return t(i) && t(i2);
    }

    private final int s(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        android.view.View view = (android.view.View) this.a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (android.util.Log.isLoggable("ViewTarget", 4)) {
            android.util.Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        android.content.Context context = view.getContext();
        java.lang.Integer numValueOf = d;
        if (numValueOf == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            defpackage.anty.aI(windowManager, "Argument must not be null");
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean t(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(uks uksVar, defpackage.aoln aolnVar) {
        ukt uktVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (aolnVar instanceof ukt) {
            uktVar = (ukt) aolnVar;
            int i = uktVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uktVar.c = i - Integer.MIN_VALUE;
            } else {
                uktVar = new ukt(this, aolnVar);
            }
        } else {
            uktVar = new ukt(this, aolnVar);
        }
        java.lang.Object obj3 = uktVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uktVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj3);
            obj = this.a;
            uktVar.a = uksVar;
            defpackage.apdp apdpVar = (defpackage.apdp) obj;
            uktVar.d = apdpVar;
            uktVar.c = 1;
            if (apdpVar.b(uktVar) == aoluVar) {
                obj2 = uksVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = uktVar.d;
            java.lang.Object obj4 = uktVar.a;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            obj2 = obj4;
        }
        try {
            obj2 = uksVar;
            this.c = obj2;
            ((defpackage.aogc) this.b).s(defpackage.ajcm.a, ukh.a);
            return defpackage.aojh.a;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    public final void b() {
        ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(true);
    }

    public final void k() {
        defpackage.ahvr.bY(((j$.util.Optional) this.c).isPresent());
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((rge) this.b).N().findViewById(2131429445);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            android.view.View childAt = linearLayout.getChildAt(i);
            if (((rfo) ((j$.util.Optional) this.c).orElseThrow()).c) {
                childAt.setClickable(true);
                childAt.setAlpha(1.0f);
            } else {
                childAt.setClickable(false);
                childAt.setAlpha(0.38f);
            }
        }
    }

    public final java.io.File l() {
        java.lang.Object obj;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) this.a);
            }
            obj = this.c;
        }
        return (java.io.File) obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abyb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [abyb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [abyf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [abyf, java.lang.Object] */
    public final void m(java.lang.Object obj) {
        afpl afplVar;
        android.view.View view;
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            afpl afplVar2 = (afpl) obj2;
            for (afpl afplVar3 : afplVar2.b) {
                java.lang.Object obj3 = afplVar3.b;
                if (obj3 == null) {
                    view = null;
                } else {
                    ?? r4 = ((vqf) afplVar3.a).a;
                    view = ((abxz) obj3).a;
                    r4.b(view, (abya) null);
                }
                if (view != null) {
                    arrayList.add(view);
                }
            }
            afplVar2.a.b(arrayList);
        }
        this.c = null;
        if (obj != null) {
            ?? r0 = this.a;
            ?? r2 = this.b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(r2, 10));
            for (vqf vqfVar : r2) {
                ?? r5 = vqfVar.a;
                abya abyaVarA = r5.a(obj);
                if (abyaVarA == null) {
                    afplVar = new afpl(vqfVar, (abxz) null);
                } else {
                    android.view.View viewA = r0.a(abyaVarA);
                    if (viewA == null) {
                        afplVar = new afpl(vqfVar, (abxz) null);
                    } else {
                        r5.b(viewA, abyaVarA);
                        afplVar = new afpl(vqfVar, new abxz(viewA, abyaVarA, defpackage.aojh.a));
                    }
                }
                arrayList2.add(afplVar);
            }
            this.c = new afpl((java.lang.Object) r0, arrayList2, (byte[]) null);
        }
    }

    public final int n() {
        android.view.View view = (android.view.View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return s(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int o() {
        android.view.View view = (android.view.View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return s(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void p() {
        android.view.ViewTreeObserver viewTreeObserver = ((android.view.View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoss, java.lang.Object] */
    public final java.lang.Object r(defpackage.snl snlVar, defpackage.aoln aolnVar) {
        java.lang.Object objA = defpackage.ahvr.ag(this.a, (defpackage.ahda) this.b, new defpackage.roz(this, snlVar, (defpackage.aoln) null, 4)).a(aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    public vwb(java.util.List list, abyb abybVar) {
        this.b = list;
        this.a = abybVar;
    }

    public vwb() {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public vwb(android.content.Context context) {
        this.b = new java.lang.Object();
        this.a = context.getApplicationContext();
    }

    public vwb(android.view.View view) {
        this.b = new java.util.ArrayList();
        this.a = view;
    }

    public vwb(rhx rhxVar, rge rgeVar) {
        this.c = j$.util.Optional.empty();
        this.a = rhxVar;
        this.b = rgeVar;
    }

    public vwb(rhx rhxVar, rhe rheVar) {
        this.c = j$.util.Optional.empty();
        this.a = rhxVar;
        this.b = rheVar;
    }

    public vwb(com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity archivedVisualVoicemailActivity, defpackage.urs ursVar) {
        this.a = archivedVisualVoicemailActivity;
        this.b = ursVar;
    }

    public vwb(tvv tvvVar) {
        this.a = new java.util.ArrayList();
        this.b = tvvVar;
    }

    public vwb(defpackage.aogc aogcVar) {
        defpackage.aooh.f(aogcVar, "updatePropagator");
        this.b = aogcVar;
        this.a = new defpackage.apdp();
        this.c = uko.b;
    }
}
