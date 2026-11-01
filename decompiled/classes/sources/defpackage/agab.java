package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class agab {
    private static java.lang.String a;
    private static java.lang.Boolean b;
    public static java.lang.String l;
    public static java.lang.Boolean m;

    public agab(byte[] bArr, byte[] bArr2) {
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
    }

    public static int A(android.content.Context context) {
        android.content.res.Resources.Theme theme = context.getTheme();
        android.util.TypedValue typedValueX = x(theme, 2130970041);
        float dimension = Float.NaN;
        if (typedValueX != null && typedValueX.type == 5) {
            dimension = typedValueX.getDimension(theme.getResources().getDisplayMetrics());
        }
        return java.lang.Float.isNaN(dimension) ? (int) context.getResources().getDimension(2131167139) : (int) dimension;
    }

    public static boolean B(android.content.Context context) {
        return z(context.getTheme(), 2130969602, false);
    }

    public static android.animation.TimeInterpolator C(android.content.Context context, int i, android.animation.TimeInterpolator timeInterpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(typedValue.string);
        if (!n(strValueOf, "cubic-bezier") && !n(strValueOf, "path")) {
            return android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (n(strValueOf, "cubic-bezier")) {
            java.lang.String[] strArrSplit = j(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return new android.view.animation.PathInterpolator(g(strArrSplit, 0), g(strArrSplit, 1), g(strArrSplit, 2), g(strArrSplit, 3));
            }
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!n(strValueOf, "path")) {
            throw new java.lang.IllegalArgumentException("Invalid motion easing type: ".concat(java.lang.String.valueOf(strValueOf)));
        }
        java.lang.String strJ = j(strValueOf, "path");
        android.graphics.Path path = new android.graphics.Path();
        try {
            defpackage.dvf.c(defpackage.dvf.d(strJ), path);
            return new android.view.animation.PathInterpolator(path);
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.RuntimeException("Error in parsing ".concat(java.lang.String.valueOf(strJ)), e);
        }
    }

    public static eka D(android.content.Context context, int i) {
        android.util.TypedValue typedValueW = w(context, 2130970093);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = typedValueW == null ? context.obtainStyledAttributes(null, afwe.a, 0, i) : context.obtainStyledAttributes(typedValueW.resourceId, afwe.a);
        eka ekaVar = new eka();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new java.lang.IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            ekaVar.e(f);
            ekaVar.c(f2);
            typedArrayObtainStyledAttributes.recycle();
            return ekaVar;
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static float E(android.content.Context context, int i) {
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static android.graphics.Rect F(android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new android.graphics.Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static android.view.ViewGroup G(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof android.view.ViewGroup)) {
            return null;
        }
        return (android.view.ViewGroup) rootView;
    }

    public static android.view.inputmethod.InputMethodManager H(android.view.View view) {
        return (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    public static void I(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void J(android.view.View view, defpackage.afvo afvoVar) {
        defpackage.rpz rpzVar = new defpackage.rpz(afvoVar, new defpackage.afvp(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()), 2);
        int i = defpackage.dzs.a;
        defpackage.dzk.o(view, rpzVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new defpackage.afvn());
        }
    }

    public static void K(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean L(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    public static android.graphics.Rect M(android.view.View view) {
        return new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void N(android.view.Window window, boolean z) {
        window.getDecorView();
        new ni(window).g(z);
    }

    public static android.app.Activity O(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static android.content.res.ColorStateList P(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return android.content.res.ColorStateList.valueOf(((android.graphics.drawable.ColorDrawable) drawable).getColor());
        }
        if (da$.ExternalSyntheticApiModelOutline0.m(drawable)) {
            return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(drawable));
        }
        return null;
    }

    public static android.graphics.PorterDuffColorFilter Q(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static android.graphics.drawable.Drawable R(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i != -1 && i2 == -1) {
            i2 = -1;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static void S(android.graphics.drawable.Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static int[] T(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = 16842912;
                return iArrCopyOf;
            }
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
            i++;
        }
    }

    public static android.graphics.drawable.Drawable U(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            return drawableMutate;
        }
        drawableMutate.setTintMode(mode);
        return drawableMutate;
    }

    public static android.util.AttributeSet V(android.content.Context context, int i) {
        int next;
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    if (android.text.TextUtils.equals(xml.getName(), "badge")) {
                        return android.util.Xml.asAttributeSet(xml);
                    }
                    throw new org.xmlpull.v1.XmlPullParserException(defpackage.a.bk("badge", "Must have a <", "> start tag"));
                }
            } while (next != 1);
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException e) {
            android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("Can't load badge resource ID #0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static int W(int i, int i2) {
        return defpackage.dwm.h(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }

    public static int X(android.view.View view, int i) {
        return ac(view.getContext(), y(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int Y(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValueX = x(context.getTheme(), i);
        java.lang.Integer numValueOf = typedValueX != null ? java.lang.Integer.valueOf(ac(context, typedValueX)) : null;
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int Z(android.content.Context context, int i, java.lang.String str) {
        return ac(context, y(context, i, str));
    }

    public static boolean aA(defpackage.ahpj ahpjVar) {
        return ahpjVar.f() != java.lang.Thread.currentThread();
    }

    public static defpackage.ahlc aB(defpackage.ahkw ahkwVar, defpackage.aoin aoinVar) {
        defpackage.ahvr.bZ(aoinVar != null, "Every SyncletBinding must have a non-null Synclet.");
        return new defpackage.ahlc(true, ahkwVar, aoinVar);
    }

    public static java.lang.Object aC(defpackage.amyq amyqVar, java.lang.Class cls) {
        try {
            defpackage.amyp amypVarB = amyqVar.b();
            if (amypVarB instanceof defpackage.amxj) {
                defpackage.amxj amxjVar = (defpackage.amxj) amypVarB;
                if (!(amyqVar instanceof defpackage.aw)) {
                    return cls.cast(amxjVar.f());
                }
            }
            return cls.cast(amypVarB.B());
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        }
    }

    public static void aD(android.content.Intent intent, android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (intent.getPackage() == null || !intent.getPackage().equals(applicationContext.getPackageName())) {
            return;
        }
        defpackage.ahqx.k(intent);
    }

    public static java.util.Locale aE(defpackage.aw awVar) {
        android.os.Bundle bundle = awVar.m;
        if (bundle == null) {
            return null;
        }
        return (java.util.Locale) bundle.getSerializable("com.google.apps.tiktok.inject.peer.EXTRA_LOCALE");
    }

    public static long aF(long j) {
        return java.lang.Math.max(0L, java.lang.System.currentTimeMillis() - java.lang.Math.max(0L, android.os.SystemClock.elapsedRealtime() - j));
    }

    public static long aG() {
        defpackage.ahyn ahynVarA = defpackage.aeug.a;
        if (ahynVarA == null) {
            ahynVarA = defpackage.aeug.a();
            defpackage.aeug.a = ahynVarA;
        }
        return ahynVarA.f() ? ((java.lang.Long) ahynVarA.b()).longValue() : aa$.ExternalSyntheticApiModelOutline1.m();
    }

    public static java.lang.Object aH(android.content.Context context, java.lang.Class cls) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (cls == null) {
            defpackage.aooh.i("singletonEntryPoint");
        }
        android.content.ComponentCallbacks2 componentCallbacks2AA = defpackage.anty.aA(context.getApplicationContext());
        defpackage.aooh.e(componentCallbacks2AA, "getApplication(...)");
        if (!(componentCallbacks2AA instanceof defpackage.amyp)) {
            java.lang.Class<?> cls2 = componentCallbacks2AA.getClass();
            java.util.Objects.toString(cls2);
            throw new java.lang.IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(java.lang.String.valueOf(cls2)));
        }
        try {
            java.lang.Object objCast = cls.cast(((defpackage.amyp) componentCallbacks2AA).B());
            if (objCast == null) {
                defpackage.aooh.g();
            }
            return objCast;
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static void aI() {
        java.lang.System.exit(0);
        throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static defpackage.ahcd aJ(defpackage.ahax ahaxVar, defpackage.akzx akzxVar, defpackage.aezn aeznVar) {
        defpackage.aooh.f(ahaxVar, "<this>");
        defpackage.aooh.f(aeznVar, "sharedStorageInfo");
        if (aeznVar.d) {
            java.lang.String str = ahaxVar.d;
            defpackage.aooh.e(str, "getSnapshotToken(...)");
            if (str.length() != 0) {
                java.lang.String str2 = ahaxVar.d;
                akzxVar.u();
                defpackage.aexf aexfVar = (defpackage.aexf) akzxVar.b;
                defpackage.aexf aexfVar2 = defpackage.aexf.a;
                j$.util.Objects.requireNonNull(str2);
                aexfVar.b |= 1;
                aexfVar.c = str2;
            }
        } else {
            java.lang.String str3 = ahaxVar.d;
            akzxVar.u();
            defpackage.aexf aexfVar3 = (defpackage.aexf) akzxVar.b;
            defpackage.aexf aexfVar4 = defpackage.aexf.a;
            j$.util.Objects.requireNonNull(str3);
            aexfVar3.b |= 1;
            aexfVar3.c = str3;
        }
        java.lang.String str4 = ahaxVar.c;
        defpackage.aooh.e(str4, "getServerToken(...)");
        defpackage.akzc akzcVar = (ahaxVar.b & 4) != 0 ? ahaxVar.e : null;
        long j = ahaxVar.i;
        defpackage.alad aladVarP = akzxVar.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return new defpackage.ahcd(str4, akzcVar, j, (defpackage.aexf) aladVarP);
    }

    public static void aK(defpackage.ajcq ajcqVar, java.lang.String str) {
        defpackage.agsl agslVar = new defpackage.agsl(str, 2);
        long j = defpackage.ahqx.a;
        defpackage.sqh sqhVar = new defpackage.sqh(defpackage.ahns.c(false), agslVar, 2);
        ajcqVar.c(new defpackage.ajcc(ajcqVar, sqhVar), defpackage.ajbm.INSTANCE);
    }

    public static defpackage.ajcq aL(java.util.List list) {
        defpackage.aooh.f(list, "futures");
        return defpackage.ahvr.ah(list).p(new defpackage.nya(list, 18), defpackage.ajbm.INSTANCE);
    }

    public static java.lang.String aM(java.util.Map map, ahcg ahcgVar) {
        java.lang.String strA = ahcgVar.a();
        if (defpackage.aoov.G(strA, "#", false)) {
            throw new java.lang.IllegalStateException("Subpackages should be provided without their base package: ".concat(java.lang.String.valueOf(strA)));
        }
        java.lang.String str = (java.lang.String) map.get(strA);
        return str != null ? defpackage.a.bE(str, (byte) 35, strA) : strA;
    }

    public static /* synthetic */ java.lang.String aN(java.util.Map map, defpackage.ahch ahchVar) {
        java.lang.String strA = ahchVar.a();
        if (defpackage.aoov.G(strA, "#", false)) {
            throw new java.lang.IllegalStateException("Subpackages should be provided without their base package: ".concat(strA));
        }
        java.lang.String str = (java.lang.String) map.get(strA);
        return str != null ? defpackage.a.bE(str, (byte) 35, strA) : strA;
    }

    public static defpackage.ahbb aO(boolean z) {
        return z ? defpackage.ahbb.a : defpackage.ahbb.b;
    }

    public static defpackage.ahbb aP(final double d) {
        return new defpackage.ahbb(new defpackage.aomy() { // from class: ahba
            @Override // defpackage.aomy
            public final java.lang.Object a() {
                return java.lang.Double.valueOf(d);
            }
        }, 3, null, false);
    }

    public static defpackage.ahbb aQ(final long j) {
        return new defpackage.ahbb(new defpackage.aomy() { // from class: ahaz
            @Override // defpackage.aomy
            public final java.lang.Object a() {
                return java.lang.Long.valueOf(j);
            }
        }, 1, null, false);
    }

    public static defpackage.ahbb aR(defpackage.aomy aomyVar, defpackage.albh albhVar) {
        if (albhVar == null) {
            defpackage.aooh.i("defaultInstance");
        }
        return new defpackage.ahbb(aomyVar, 6, albhVar, false);
    }

    public static defpackage.ahbb aS(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        return new defpackage.ahbb(new defpackage.acik(str, 5), 4, null, false);
    }

    public static boolean aT(defpackage.adag adagVar, j$.util.Optional optional) {
        if (adagVar.r()) {
            return true;
        }
        optional.isPresent();
        return false;
    }

    public static /* synthetic */ java.lang.String aU(int i) {
        switch (i) {
            case 1:
                return "LONG_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "DOUBLE_VALUE";
            case 4:
                return "STRING_VALUE";
            case 5:
                return "BYTES_VALUE";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PROTO_VALUE";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "FLAGVALUE_NOT_SET";
            default:
                return "null";
        }
    }

    public static int aV(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            default:
                return 0;
        }
    }

    public static defpackage.ajcq aW(defpackage.ajcq ajcqVar) {
        defpackage.agqh agqhVar = new defpackage.agqh(2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), agqhVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return ajamVar;
    }

    public static defpackage.ajcq aX() {
        return defpackage.aiql.y(new java.lang.UnsupportedOperationException("A NoAccountWorker or AccountWorker used by a TikTokWorkSpec with setExpedited() must override getForegroundInfoAsync() in order to support API levels < 31."));
    }

    public static java.lang.String aY(java.lang.String str, defpackage.ahyn ahynVar) {
        defpackage.aooh.f(str, "defaultName");
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void aZ(java.lang.Object obj) throws java.lang.Exception {
        if (obj instanceof java.lang.AutoCloseable) {
            obj.close();
        } else if (obj instanceof java.util.concurrent.ExecutorService) {
            defpackage.anty.aj((java.util.concurrent.ExecutorService) obj);
        } else {
            if (!(obj instanceof android.content.ContentProviderClient)) {
                throw new java.lang.IllegalArgumentException();
            }
            ((android.content.ContentProviderClient) obj).release();
        }
    }

    public static int aa(android.view.View view, int i, int i2) {
        return Y(view.getContext(), i, i2);
    }

    public static int ab(int i, int i2, float f) {
        return defpackage.dwm.g(defpackage.dwm.h(i2, java.lang.Math.round(android.graphics.Color.alpha(i2) * f)), i);
    }

    public static int ac(android.content.Context context, android.util.TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public static boolean ad(int i) {
        return i != 0 && defpackage.dwm.b(i) > 0.5d;
    }

    public static void ae(android.os.StrictMode.ThreadPolicy threadPolicy) {
        android.os.StrictMode.setThreadPolicy(threadPolicy);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            new android.os.Handler(android.os.Looper.myLooper()).postAtFrontOfQueue(new defpackage.aetv(threadPolicy, 16));
        }
    }

    public static android.net.Uri af(android.net.Uri uri, java.lang.String str) {
        return uri.buildUpon().path(java.lang.String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static void ag(defpackage.afhh afhhVar, java.util.HashMap map) {
        java.lang.String strA = afhhVar.a();
        defpackage.ahvr.bR(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, afhhVar);
    }

    public static void ah(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static java.io.File ai(android.net.Uri uri) throws defpackage.afex {
        if (!uri.getScheme().equals("file")) {
            throw new defpackage.afex("Scheme must be 'file'");
        }
        if (!android.text.TextUtils.isEmpty(uri.getQuery())) {
            throw new defpackage.afex("Did not expect uri to have query");
        }
        if (android.text.TextUtils.isEmpty(uri.getAuthority())) {
            return new java.io.File(uri.getPath());
        }
        throw new defpackage.afex("Did not expect uri to have authority");
    }

    public static android.net.Uri aj(android.net.Uri.Builder builder, defpackage.aift aiftVar) {
        return builder.encodedFragment(defpackage.affh.a(aiftVar.g())).build();
    }

    public static java.io.File ak(android.content.Context context) {
        return al(aa$.ExternalSyntheticApiModelOutline1.m(context)).getParentFile();
    }

    public static java.io.File al(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        if (filesDir == null) {
            android.os.SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new java.lang.IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    @java.lang.Deprecated
    public static void am(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void an(java.util.Map map) {
        defpackage.ailj ailjVarK = ((defpackage.aikg) ((defpackage.aikj) map).entrySet()).iterator();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1260, (java.lang.String) entry.getKey(), defpackage.ahot.a, true);
            try {
                ((defpackage.afam) ((defpackage.aoin) entry.getValue()).a()).a();
                ahoqVarX.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static boolean ao() {
        java.lang.Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(aa$.ExternalSyntheticApiModelOutline1.m(android.os.Process.myUid()));
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static java.lang.String ap() {
        java.lang.String str = a;
        if (str != null) {
            return str;
        }
        java.lang.String strM = ft$.ExternalSyntheticApiModelOutline0.m();
        a = strM;
        return strM;
    }

    public static void aq(defpackage.ajcq ajcqVar) {
        ajcqVar.c(new defpackage.abqg(ajcqVar, 12), defpackage.ajbm.INSTANCE);
    }

    public static /* synthetic */ boolean ar(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, java.lang.Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int as(int i) {
        if (i == 0) {
            return 6;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 5;
        }
        return 4;
    }

    public static int at(int i) {
        return i == 1 ? defpackage.alau.a() : i - 2;
    }

    public static void au(java.util.logging.Level level, java.util.concurrent.Executor executor, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        executor.execute(defpackage.ahqx.h(new abb(level, th, str, objArr, 12)));
    }

    public static android.content.res.ColorStateList av(android.content.Context context, defpackage.ajxw ajxwVar, int i) {
        int iR;
        android.content.res.ColorStateList colorStateListA;
        return (!ajxwVar.z(i) || (iR = ajxwVar.r(i, 0)) == 0 || (colorStateListA = defpackage.dwk.a(context.getResources(), iR, context.getTheme())) == null) ? ajxwVar.s(i) : colorStateListA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static boolean aw() throws afeb {
        defpackage.ahpj ahpjVar = ((defpackage.ahpe) defpackage.ahns.d.get()).c;
        if (ahpjVar == null || defpackage.aooh.n(ahpjVar, defpackage.ahoo.a)) {
            return true;
        }
        if (!(ahpjVar instanceof defpackage.ahpd) || !((defpackage.ahpd) ahpjVar).a()) {
            return false;
        }
        if (!defpackage.afec.h(java.lang.Thread.currentThread())) {
            return true;
        }
        defpackage.afec.c();
        return true;
    }

    public static void ax(defpackage.ahpj ahpjVar) {
        android.os.Trace.beginSection(defpackage.ahns.i(ahpjVar.d()));
    }

    public static void ay(defpackage.ahpj ahpjVar) {
        if (aA(ahpjVar) || ahpjVar.b() == null) {
            android.os.Trace.beginSection(ahpjVar.e());
            ax(ahpjVar);
        } else {
            ay(ahpjVar.b());
            ax(ahpjVar);
        }
    }

    public static void az(defpackage.ahpj ahpjVar) {
        if (aA(ahpjVar) || ahpjVar.b() == null) {
            android.os.Trace.endSection();
            android.os.Trace.endSection();
        } else {
            android.os.Trace.endSection();
            az(ahpjVar.b());
        }
    }

    public static boolean bA(android.content.Context context, java.lang.String str) {
        return defpackage.dvx.c(context, str) == 0;
    }

    public static boolean bB(android.content.Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static int bC(defpackage.aeco aecoVar) {
        defpackage.aooh.f(aecoVar, "experimentSource");
        return aecoVar.d;
    }

    public static int bD(aecp aecpVar) {
        defpackage.aooh.f(aecpVar, "experimentType");
        return aecpVar.d;
    }

    public static long bE(j$.time.Instant instant) {
        defpackage.aooh.f(instant, "instant");
        return instant.toEpochMilli();
    }

    public static defpackage.aihd bF(java.lang.String str) {
        defpackage.aegl aeglVar;
        if (str == null) {
            defpackage.aooh.i("notificationChannelString");
        }
        java.util.List listS = defpackage.aoov.S(str, new java.lang.String[]{","}, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listS, 10));
        java.util.Iterator it = listS.iterator();
        while (it.hasNext()) {
            int i = java.lang.Integer.parseInt((java.lang.String) it.next());
            defpackage.aegl[] aeglVarArrValues = defpackage.aegl.values();
            int length = aeglVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aeglVar = null;
                    break;
                }
                aeglVar = aeglVarArrValues[i2];
                if (aeglVar.c == i) {
                    break;
                }
                i2++;
            }
            if (aeglVar == null) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Notification channel ", " is not supported."));
            }
            arrayList.add(aeglVar);
        }
        defpackage.aihd aihdVarO = defpackage.aihd.o(arrayList);
        defpackage.aooh.e(aihdVarO, "copyOf(...)");
        return aihdVarO;
    }

    public static java.lang.String bG(defpackage.aihd aihdVar) {
        defpackage.aooh.f(aihdVar, "notificationChannels");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aihdVar, 10));
        java.util.Iterator<E> it = aihdVar.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((defpackage.aegl) it.next()).c));
        }
        return defpackage.ajsz.cr(arrayList, ",", null, null, null, 62);
    }

    public static int bH(int i) {
        int[] iArrBT = bT();
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArrBT[i3];
            if (i4 == 0) {
                throw null;
            }
            if (i4 == i) {
                i2 = i4;
                break;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Account type ", " is not supported."));
    }

    public static int bI(int i) {
        if (i == 0) {
            defpackage.aooh.i("accountType");
            i = 0;
        }
        if (i != 0) {
            return i;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aegf, java.lang.Object] */
    public static defpackage.aegf bJ(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.aduw aduwVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aduwVar, "targetType");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        if (aduwVar.a()) {
            if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                throw new java.lang.IllegalStateException("GnpRegistrationDataProvider must be provided for non-unified FCM registrations");
            }
        } else {
            if (!aduwVar.b()) {
                throw new java.lang.IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
            }
            ahynVar = ahynVar2;
        }
        return ((defpackage.ahys) ahynVar).a;
    }

    public static int bK(defpackage.akrj akrjVar, java.util.List list, java.util.Map map) {
        defpackage.aooh.f(list, "accountsToRegister");
        defpackage.aooh.f(map, "allGnpAccounts");
        int iIntValue = 0;
        if (akrjVar != null) {
            defpackage.ajyk ajykVarAg = defpackage.ajsz.ag(akrjVar.L());
            defpackage.akzx akzxVar = (defpackage.akzx) ajykVarAg.b;
            akzxVar.u();
            defpackage.akrj akrjVar2 = (defpackage.akrj) akzxVar.b;
            akrjVar2.b &= -5;
            akrjVar2.e = 0;
            akzxVar.u();
            defpackage.akrj akrjVar3 = (defpackage.akrj) akzxVar.b;
            akrjVar3.b &= -17;
            akrjVar3.h = defpackage.akrj.a.h;
            defpackage.alct alctVarR = ajykVarAg.R();
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alctVarR, 10));
            java.util.Iterator<E> it = alctVarR.iterator();
            while (it.hasNext()) {
                defpackage.ajyk ajykVarAf = defpackage.ajsz.af(((defpackage.akri) it.next()).L());
                defpackage.akzx akzxVar2 = (defpackage.akzx) ajykVarAf.b;
                akzxVar2.u();
                defpackage.akri akriVar = (defpackage.akri) akzxVar2.b;
                akriVar.b &= -2;
                defpackage.akri akriVar2 = defpackage.akri.a;
                akriVar.c = akriVar2.c;
                akzxVar2.u();
                defpackage.akri akriVar3 = (defpackage.akri) akzxVar2.b;
                akriVar3.d = null;
                akriVar3.b &= -3;
                akzxVar2.u();
                defpackage.akri akriVar4 = (defpackage.akri) akzxVar2.b;
                akriVar4.b &= -17;
                akriVar4.g = akriVar2.g;
                arrayList.add(ajykVarAf.N());
            }
            java.util.List listBX = defpackage.ajsz.bX(arrayList, new defpackage.beg(17));
            ajykVarAg.R();
            ajykVarAg.T();
            ajykVarAg.R();
            ajykVarAg.S(listBX);
            int iHashCode = ajykVarAg.Q().hashCode();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(((com.google.android.libraries.notifications.platform.registration.AccountRepresentation) it2.next()).a().hashCode()));
            }
            java.util.Iterator it3 = defpackage.ajsz.bW(arrayList2).iterator();
            while (it3.hasNext()) {
                iHashCode = (iHashCode * 53) + ((java.lang.Number) it3.next()).intValue();
            }
            java.util.ArrayList<com.google.android.libraries.notifications.platform.registration.DelegatedGaia> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList3, 10));
            for (com.google.android.libraries.notifications.platform.registration.DelegatedGaia delegatedGaia : arrayList3) {
                int iHashCode2 = delegatedGaia.a.hashCode() * 53;
                defpackage.aduy aduyVar = (defpackage.aduy) map.get(delegatedGaia);
                java.lang.String str = aduyVar != null ? aduyVar.d : null;
                arrayList4.add(java.lang.Integer.valueOf(iHashCode2 + (str != null ? str.hashCode() : 0)));
            }
            java.util.Iterator it4 = defpackage.ajsz.bW(arrayList4).iterator();
            iIntValue = iHashCode;
            while (it4.hasNext()) {
                iIntValue = (iIntValue * 53) + ((java.lang.Number) it4.next()).intValue();
            }
        }
        return iIntValue;
    }

    public static defpackage.adzy bL(defpackage.aegd aegdVar) {
        defpackage.aooh.f(aegdVar, "<this>");
        j$.util.Objects.checkIndex(0, 8);
        if (aegdVar != null) {
            if (aegdVar instanceof defpackage.aegh) {
                return defpackage.adzy.SIGNED_IN;
            }
            if ((aegdVar instanceof defpackage.aegk) || (aegdVar instanceof defpackage.aegj)) {
                return defpackage.adzy.SIGNED_OUT_ZWIEBACK;
            }
            if (aegdVar instanceof aegi) {
                return defpackage.adzy.SIGNED_OUT_YOUTUBE_VISITOR;
            }
            if (aegdVar instanceof aega) {
                return defpackage.adzy.SIGNED_IN_FITBIT;
            }
            if ((aegdVar instanceof aefz) || (aegdVar instanceof defpackage.aege)) {
                return defpackage.adzy.UNKNOWN;
            }
        }
        throw new defpackage.aois();
    }

    public static java.lang.String bM(defpackage.aduy aduyVar, int i) {
        java.lang.String strValueOf;
        if (aduyVar == null || (strValueOf = java.lang.String.valueOf(aduyVar.a)) == null) {
            strValueOf = "no_account";
        }
        return defpackage.a.bu(i, strValueOf, "GNP_SDK_JOB::", "::");
    }

    public static void bN(java.lang.String str, defpackage.aduu aduuVar) {
        defpackage.aooh.f(str, "jobId");
        defpackage.aooh.f(aduuVar, "gnpConfig");
    }

    public static boolean bO(android.content.Context context, defpackage.aefv aefvVar, defpackage.aduu aduuVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        aefvVar.a(context);
        return defpackage.ango.a.eZ().f() && aduuVar.j;
    }

    public static defpackage.adxz bP(defpackage.adut adutVar) {
        defpackage.aooh.f(adutVar, "<this>");
        int iOrdinal = adutVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.adxz.a;
        }
        if (iOrdinal == 1) {
            return defpackage.adxz.e;
        }
        if (iOrdinal == 2) {
            return defpackage.adxz.b;
        }
        if (iOrdinal == 3) {
            return defpackage.adxz.c;
        }
        if (iOrdinal == 4) {
            return defpackage.adxz.f;
        }
        throw new defpackage.aois();
    }

    public static java.lang.Object bQ(defpackage.apdp apdpVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.adxv adxvVar = new defpackage.adxv(apdpVar);
        return aolnVar.u().get(adxvVar) != null ? aonjVar.a(aolnVar) : defpackage.aoov.aj(new defpackage.adxu(adxvVar), new defpackage.adxw(apdpVar, aonjVar, (defpackage.aoln) null, 0), aolnVar);
    }

    public static void bR(defpackage.ajcq ajcqVar, java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        defpackage.aiql.I(ajcqVar, new defpackage.adxt(consumer, consumer2), defpackage.ajbm.INSTANCE);
    }

    public static /* synthetic */ defpackage.tvn bS(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.tvn(akzxVar);
    }

    public static int[] bT() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int bU(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        if (accountRepresentation == null) {
            defpackage.aooh.i("<this>");
        }
        j$.util.Objects.checkIndex(0, 6);
        if (accountRepresentation != null) {
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                return 1;
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                return 2;
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor) {
                return 3;
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
                return 4;
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
                return 5;
            }
        }
        throw new defpackage.aois();
    }

    public static defpackage.adtz bV(java.util.List list, defpackage.aiof aiofVar) {
        defpackage.aooh.f(list, "<this>");
        defpackage.aooh.f(aiofVar, "logger");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            adud adudVar = (defpackage.adtz) it.next();
            j$.util.Objects.checkIndex(0, 3);
            if (adudVar != null) {
                if (adudVar instanceof adua) {
                    ((defpackage.aiob) ((defpackage.aiob) aiofVar.d()).k(((adua) adudVar).b())).v("Logging permanent failure in syncAllAccounts");
                    arrayList.add(adudVar);
                } else if (adudVar instanceof adud) {
                    ((defpackage.aiob) ((defpackage.aiob) aiofVar.d()).k(adudVar.b())).v("Logging transient failure in syncAllAccounts");
                    arrayList2.add(adudVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            adua aduaVar = (adua) defpackage.ajsz.bE(arrayList);
            return new adtw(aduaVar.b(), aduaVar.a());
        }
        if (arrayList2.isEmpty()) {
            return new defpackage.adub(defpackage.aojh.a);
        }
        adud adudVar2 = (adud) defpackage.ajsz.bE(arrayList2);
        return new adtx(adudVar2.b(), adudVar2.a());
    }

    public static defpackage.adtz bW(defpackage.adtz adtzVar) {
        defpackage.aooh.f(adtzVar, "<this>");
        return bX(adtzVar, new acsb(14));
    }

    public static defpackage.adtz bX(defpackage.adtz adtzVar, defpackage.aonj aonjVar) {
        defpackage.aooh.f(adtzVar, "<this>");
        int iR = defpackage.anty.R(adtzVar);
        if (iR == 0) {
            return new defpackage.adub(aonjVar.a(((defpackage.adub) adtzVar).a));
        }
        if (iR != 1) {
            throw new defpackage.aois();
        }
        return adtzVar;
    }

    public static defpackage.adty bY(defpackage.adtz adtzVar) {
        int iB = defpackage.a.b(adtzVar);
        if (iB == 0) {
            return null;
        }
        if (iB == 1) {
            return ((defpackage.adtv) adtzVar).a();
        }
        throw new defpackage.aois();
    }

    public static java.lang.Object bZ(defpackage.adtz adtzVar) {
        if (adtzVar instanceof defpackage.adub) {
            return ((defpackage.adub) adtzVar).a;
        }
        return null;
    }

    public static defpackage.aify ba(android.database.Cursor cursor, defpackage.aonj aonjVar) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        if (cursor.moveToFirst()) {
            do {
                aiftVar.i(aonjVar.a(new aguo(cursor)));
            } while (cursor.moveToNext());
        }
        defpackage.aify aifyVarH = aiftVar.g();
        defpackage.aooh.e(aifyVarH, "build(...)");
        return aifyVarH;
    }

    public static java.lang.Object bb(defpackage.aolr aolrVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new agty(aolrVar, aonjVar, (defpackage.aoln) null), aolnVar);
    }

    public static defpackage.ajcq bc(defpackage.ajcq ajcqVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        defpackage.ajcr ajcrVar = new defpackage.ajcr(callable);
        ajcqVar.c(ajcrVar, executor);
        ajcrVar.c(new defpackage.abqu(ajcrVar, ajcqVar, 12), defpackage.ajbm.INSTANCE);
        return ajcrVar;
    }

    public static void bd(java.lang.String str, defpackage.agoq agoqVar, java.util.Map map) {
        java.lang.Object objComputeIfAbsent = j$.util.Map.-EL.computeIfAbsent(map, str, new defpackage.okq(new defpackage.rou(14), 10));
        defpackage.aooh.e(objComputeIfAbsent, "computeIfAbsent(...)");
        java.util.Map map2 = (java.util.Map) objComputeIfAbsent;
        if (map2.containsKey(agoqVar.g)) {
            throw new java.lang.IllegalStateException("Found 2 accounts with the same account name.");
        }
        map2.put(agoqVar.g, agoqVar);
    }

    public static /* synthetic */ defpackage.zzx be(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.zzx(akzxVar);
    }

    public static /* synthetic */ defpackage.zzx bf(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.zzx(akzxVar);
    }

    public static /* synthetic */ defpackage.zzx bg(defpackage.akzz akzzVar) {
        defpackage.aooh.f(akzzVar, "builder");
        return new defpackage.zzx(akzzVar);
    }

    public static java.lang.Object bh(defpackage.aewi aewiVar) {
        try {
            return aewiVar.a();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return aewiVar.a();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static long bi(android.os.health.HealthStats healthStats, int i) {
        if (healthStats == null || !aa$.ExternalSyntheticApiModelOutline1.m$4(healthStats, i)) {
            return 0L;
        }
        return aa$.ExternalSyntheticApiModelOutline1.m(healthStats, i);
    }

    public static java.util.List bj(android.os.health.HealthStats healthStats, int i) {
        return (healthStats == null || !aa$.ExternalSyntheticApiModelOutline1.m$2(healthStats, i)) ? java.util.Collections.EMPTY_LIST : defpackage.aeqn.a.d(aa$.ExternalSyntheticApiModelOutline1.m$1(healthStats, i));
    }

    public static java.util.Map bk(android.os.health.HealthStats healthStats, int i) {
        return (healthStats == null || !aa$.ExternalSyntheticApiModelOutline1.m$1(healthStats, i)) ? java.util.Collections.EMPTY_MAP : aa$.ExternalSyntheticApiModelOutline1.m$2(healthStats, i);
    }

    public static defpackage.apel bl(java.lang.String str) {
        defpackage.akzx akzxVarM = defpackage.apel.a.m();
        akzxVarM.u();
        defpackage.apel apelVar = (defpackage.apel) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        apelVar.b |= 2;
        apelVar.d = str;
        return (defpackage.apel) akzxVarM.r();
    }

    public static defpackage.apeq bm(android.os.health.HealthStats healthStats, int i) {
        if (healthStats == null || !aa$.ExternalSyntheticApiModelOutline1.m$3(healthStats, i)) {
            return null;
        }
        return bo(null, aa$.ExternalSyntheticApiModelOutline1.m(healthStats, i));
    }

    public static defpackage.apeq bn(defpackage.apeq apeqVar, defpackage.apeq apeqVar2) {
        if (apeqVar == null || apeqVar2 == null) {
            return apeqVar;
        }
        int i = apeqVar.c - apeqVar2.c;
        long j = apeqVar.d - apeqVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        defpackage.akzx akzxVarM = defpackage.apeq.a.m();
        if ((apeqVar.b & 4) != 0) {
            defpackage.apel apelVar = apeqVar.e;
            if (apelVar == null) {
                apelVar = defpackage.apel.a;
            }
            akzxVarM.u();
            defpackage.apeq apeqVar3 = (defpackage.apeq) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVar);
            apeqVar3.e = apelVar;
            apeqVar3.b |= 4;
        }
        akzxVarM.u();
        defpackage.apeq apeqVar4 = (defpackage.apeq) akzxVarM.b;
        apeqVar4.b |= 1;
        apeqVar4.c = i;
        akzxVarM.u();
        defpackage.apeq apeqVar5 = (defpackage.apeq) akzxVarM.b;
        apeqVar5.b |= 2;
        apeqVar5.d = j;
        return (defpackage.apeq) akzxVarM.r();
    }

    public static defpackage.apeq bo(java.lang.String str, android.os.health.TimerStat timerStat) {
        defpackage.akzx akzxVarM = defpackage.apeq.a.m();
        int iM = aa$.ExternalSyntheticApiModelOutline1.m(timerStat);
        akzxVarM.u();
        defpackage.apeq apeqVar = (defpackage.apeq) akzxVarM.b;
        apeqVar.b |= 1;
        apeqVar.c = iM;
        long jM = aa$.ExternalSyntheticApiModelOutline1.m(timerStat);
        akzxVarM.u();
        defpackage.apeq apeqVar2 = (defpackage.apeq) akzxVarM.b;
        apeqVar2.b |= 2;
        apeqVar2.d = jM;
        if (apeqVar2.c < 0) {
            akzxVarM.u();
            defpackage.apeq apeqVar3 = (defpackage.apeq) akzxVarM.b;
            apeqVar3.b |= 1;
            apeqVar3.c = 0;
        }
        if (str != null) {
            defpackage.akzx akzxVarM2 = defpackage.apel.a.m();
            akzxVarM2.u();
            defpackage.apel apelVar = (defpackage.apel) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            apelVar.b |= 2;
            apelVar.d = str;
            defpackage.apel apelVar2 = (defpackage.apel) akzxVarM2.r();
            akzxVarM.u();
            defpackage.apeq apeqVar4 = (defpackage.apeq) akzxVarM.b;
            j$.util.Objects.requireNonNull(apelVar2);
            apeqVar4.e = apelVar2;
            apeqVar4.b |= 4;
        }
        defpackage.apeq apeqVar5 = (defpackage.apeq) akzxVarM.b;
        if (apeqVar5.c == 0 && apeqVar5.d == 0) {
            return null;
        }
        return (defpackage.apeq) akzxVarM.r();
    }

    public static boolean bp(defpackage.apem apemVar) {
        if (apemVar != null) {
            return apemVar.c.size() == 0 && apemVar.d.size() == 0;
        }
        return true;
    }

    public static boolean bq(defpackage.apeo apeoVar) {
        if (apeoVar != null) {
            return apeoVar.c <= 0 && apeoVar.d <= 0 && apeoVar.e <= 0 && apeoVar.f <= 0 && apeoVar.g <= 0 && apeoVar.h <= 0;
        }
        return true;
    }

    public static boolean br(defpackage.apep apepVar) {
        if (apepVar != null) {
            return ((long) apepVar.c) <= 0 && ((long) apepVar.d) <= 0;
        }
        return true;
    }

    public static boolean bs(defpackage.aper aperVar) {
        if (aperVar != null) {
            return aperVar.d <= 0 && aperVar.e <= 0 && aperVar.f <= 0 && aperVar.g <= 0 && aperVar.h.size() == 0 && aperVar.i.size() == 0 && aperVar.j.size() == 0 && aperVar.k.size() == 0 && aperVar.l.size() == 0 && aperVar.m.size() == 0 && aperVar.o.size() == 0 && aperVar.p.size() == 0 && aperVar.q.size() == 0 && aperVar.r.size() == 0 && aperVar.s <= 0 && aperVar.t <= 0 && aperVar.u <= 0 && aperVar.v <= 0 && aperVar.w <= 0 && aperVar.x <= 0 && aperVar.y <= 0 && aperVar.z <= 0 && aperVar.A <= 0 && aperVar.B <= 0 && aperVar.C <= 0 && aperVar.D <= 0 && aperVar.E <= 0 && aperVar.F <= 0 && aperVar.H <= 0 && aperVar.Y <= 0 && aperVar.Z <= 0 && aperVar.aa <= 0 && aperVar.ab <= 0 && aperVar.ac <= 0 && aperVar.ad <= 0 && aperVar.ae <= 0 && aperVar.af <= 0 && aperVar.ag <= 0 && aperVar.ah <= 0 && aperVar.ai <= 0 && aperVar.aj <= 0 && aperVar.ak <= 0 && aperVar.al <= 0 && aperVar.am <= 0 && aperVar.ao <= 0 && aperVar.ap <= 0 && aperVar.aq <= 0;
        }
        return true;
    }

    public static void bt(defpackage.akzx akzxVar, defpackage.aeqh aeqhVar) {
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).h);
        for (int i = 0; i < ((defpackage.aper) akzxVar.b).h.size(); i++) {
            akzxVar.bH(i, aeqhVar.b(akzxVar.br(i)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).i);
        for (int i2 = 0; i2 < ((defpackage.aper) akzxVar.b).i.size(); i2++) {
            akzxVar.bI(i2, aeqhVar.b(akzxVar.bs(i2)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).j);
        for (int i3 = 0; i3 < ((defpackage.aper) akzxVar.b).j.size(); i3++) {
            akzxVar.bJ(i3, aeqhVar.b(akzxVar.bt(i3)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).k);
        for (int i4 = 0; i4 < ((defpackage.aper) akzxVar.b).k.size(); i4++) {
            akzxVar.bG(i4, aeqhVar.b(akzxVar.bq(i4)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).l);
        for (int i5 = 0; i5 < ((defpackage.aper) akzxVar.b).l.size(); i5++) {
            akzxVar.bF(i5, aeqhVar.b(akzxVar.bp(i5)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).m);
        for (int i6 = 0; i6 < ((defpackage.aper) akzxVar.b).m.size(); i6++) {
            akzxVar.bD(i6, aeqhVar.b(akzxVar.bn(i6)));
        }
        j$.util.DesugarCollections.unmodifiableList(((defpackage.aper) akzxVar.b).o);
        for (int i7 = 0; i7 < ((defpackage.aper) akzxVar.b).o.size(); i7++) {
            akzxVar.bE(i7, aeqhVar.b(akzxVar.bo(i7)));
        }
    }

    public static defpackage.aepy bu(defpackage.ahyn ahynVar, defpackage.aoin aoinVar) {
        return (defpackage.aepy) ((defpackage.aoin) ahynVar.d(aoinVar)).a();
    }

    public static /* synthetic */ java.lang.String bv(int i) {
        return i != 1 ? "MENAGERIE" : "MDI";
    }

    public static java.util.Map bw(defpackage.aegd aegdVar) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        aegdVar.b(aigbVar);
        return aigbVar.e(true);
    }

    public static com.google.android.libraries.notifications.platform.registration.AccountRepresentation bx(java.lang.String str) {
        return (str == null || str.length() == 0) ? com.google.android.libraries.notifications.platform.registration.Zwieback.a : new com.google.android.libraries.notifications.platform.registration.Gaia(str);
    }

    public static boolean by(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        j$.util.Objects.checkIndex(0, 6);
        if ((accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Gaia) || (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) || (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Fitbit)) {
            return false;
        }
        if ((accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) || (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor)) {
            return true;
        }
        throw new defpackage.aois();
    }

    public static void bz(defpackage.akzx akzxVar, int i, boolean z) {
        if (((defpackage.aktb) akzxVar.b).b.size() <= 0) {
            if (!z) {
                return;
            }
            while (((defpackage.aktb) akzxVar.b).b.size() <= 0) {
                akzxVar.u();
                defpackage.aktb aktbVar = (defpackage.aktb) akzxVar.b;
                aktbVar.b();
                aktbVar.b.g(0L);
            }
        }
        long jA = ((defpackage.aktb) akzxVar.b).b.a(0);
        long j = 1 << i;
        long j2 = z ? jA | j : jA & (~j);
        akzxVar.u();
        defpackage.aktb aktbVar2 = (defpackage.aktb) akzxVar.b;
        aktbVar2.b();
        aktbVar2.b.e(0, j2);
    }

    public static java.util.concurrent.ThreadFactory cA(java.lang.String str, java.util.concurrent.ThreadFactory threadFactory) {
        defpackage.annk annkVar = new defpackage.annk(null, null, null);
        annkVar.n(true);
        annkVar.o(str.concat(" Thread #%d"));
        annkVar.c = threadFactory;
        return defpackage.annk.p(annkVar);
    }

    public static long cB(long j) {
        float[] fArr = {f, 0.0f, 0.0f};
        defpackage.dwm.k(defpackage.cfd.L(j), fArr);
        float f = fArr[0] - 3.0f;
        return f >= 0.0f ? defpackage.cfd.M(defpackage.dwm.d(fArr)) : j;
    }

    public static long cC(long j, float f) {
        float[] fArr = new float[3];
        defpackage.dwm.k(defpackage.cfd.L(j), fArr);
        fArr[2] = java.lang.Math.max(f, fArr[2]);
        return defpackage.cfd.M(defpackage.dwm.d(fArr));
    }

    public static defpackage.absl cD(defpackage.adae adaeVar, defpackage.absg absgVar) {
        return absgVar.c ? adaeVar.C(absgVar) : defpackage.absl.a;
    }

    public static defpackage.afhf cE(java.lang.String str, defpackage.ajcq ajcqVar, defpackage.albh albhVar, defpackage.akzq akzqVar, java.util.concurrent.Executor executor, defpackage.ahyn ahynVar, defpackage.aogc aogcVar) {
        return new defpackage.afhf(new defpackage.afhc(str, ajcqVar, new defpackage.afhk(albhVar, akzqVar), executor, aogcVar, ahynVar, new defpackage.ahnx()), new defpackage.ajcm(""), true);
    }

    private static defpackage.bfx cF(defpackage.bfx bfxVar) {
        return defpackage.bfx.d(bfxVar, null, null, new defpackage.bfz(0.0f), new defpackage.bfz(0.0f), 3);
    }

    public static java.lang.String ca(defpackage.adtz adtzVar) {
        j$.util.Objects.checkIndex(0, 4);
        if (adtzVar instanceof defpackage.adub) {
            return "SUCCESS";
        }
        if (adtzVar instanceof adud) {
            return "TRANSIENT_FAILURE";
        }
        if (adtzVar instanceof adua) {
            return "PERMANENT_FAILURE";
        }
        throw new defpackage.aois();
    }

    public static java.lang.Throwable cb(defpackage.adtz adtzVar) {
        int iB = defpackage.a.b(adtzVar);
        if (iB == 0) {
            return null;
        }
        if (iB == 1) {
            return ((defpackage.adtv) adtzVar).b();
        }
        throw new defpackage.aois();
    }

    public static /* synthetic */ java.lang.String cc(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "CANCELED";
            case 3:
                return "INVALID_REQUEST";
            case 4:
                return "HTTP_ERROR";
            case 5:
                return "REQUEST_ERROR";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESPONSE_OPEN_ERROR";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "RESPONSE_CLOSE_ERROR";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "NETWORK_IO_ERROR";
            case 9:
                return "DISK_IO_ERROR";
            case 10:
                return "FILE_SYSTEM_ERROR";
            case 11:
                return "UNKNOWN_IO_ERROR";
            default:
                return "null";
        }
    }

    public static /* synthetic */ java.lang.String cd(int i) {
        if (i == 1) {
            return "MALFORMED";
        }
        if (i == 2) {
            return "UNKNOWN_OPTION";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVALID_PAYLOAD";
        }
        return "INVALID_ENCODING";
    }

    public static defpackage.aify ce(adrr adrrVar, boolean z) {
        java.lang.String str;
        defpackage.aify aifyVar = adrrVar.a;
        j$.util.Optional optionalEmpty = aifyVar.isEmpty() ? j$.util.Optional.empty() : j$.util.Optional.of((adrq) aifyVar.get(0));
        if (optionalEmpty.isEmpty() || ((adrq) optionalEmpty.get()).a.isEmpty()) {
            return defpackage.aike.a;
        }
        java.lang.Object obj = optionalEmpty.get();
        adoh adohVar = new adoh();
        adohVar.b(j$.util.Optional.empty());
        adohVar.d(j$.util.Optional.empty());
        adohVar.c(j$.util.Optional.empty());
        adohVar.a(j$.util.Optional.empty());
        adrq adrqVar = (adrq) obj;
        adohVar.a = adrqVar.a;
        adohVar.b = z;
        adohVar.f = adrrVar.b;
        adohVar.h = (byte) 3;
        adohVar.c(adrrVar.c);
        adohVar.b(adrqVar.b);
        adohVar.a(adrrVar.d);
        adohVar.d(adrrVar.e);
        if (adohVar.h == 3 && (str = adohVar.a) != null) {
            adoi adoiVar = new adoi(str, adohVar.b, adohVar.c, adohVar.d, adohVar.e, adohVar.f, adohVar.g);
            j$.util.Objects.requireNonNull(adoiVar);
            return defpackage.aify.p(new adnx(adoiVar));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (adohVar.a == null) {
            sb.append(" transcript");
        }
        if ((adohVar.h & 1) == 0) {
            sb.append(" isFinal");
        }
        if ((adohVar.h & 2) == 0) {
            sb.append(" resultReceivedTime");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static defpackage.adib cf(int i) {
        defpackage.adia adiaVar = new defpackage.adia();
        adiaVar.d(false);
        adiaVar.b(false);
        adiaVar.e((i & 8) > 0);
        adiaVar.c((i & 16) > 0);
        adiaVar.d((i & 32) > 0);
        adiaVar.b((i & 64) > 0);
        return adiaVar.a();
    }

    public static int cg(defpackage.adib adibVar, int i) {
        defpackage.adhd adhdVar = (defpackage.adhd) adibVar;
        if (adhdVar.a) {
            i |= 8;
        }
        if (adhdVar.b) {
            i |= 16;
        }
        if (adhdVar.c) {
            i |= 32;
        }
        return adhdVar.d ? i | 64 : i;
    }

    public static long ch(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        return packManifest.l() == null ? packManifest.d() : packManifest.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static defpackage.adkn ci(java.lang.String str) {
        switch (str.hashCode()) {
            case -1140680715:
                if (str.equals("adler32")) {
                    return adko.a;
                }
                return null;
            case -903629273:
                if (str.equals("sha256")) {
                    return adkt.a;
                }
                return null;
            case 107902:
                if (str.equals("md5")) {
                    return defpackage.adkr.a;
                }
                return null;
            case 94921523:
                if (str.equals("crc32")) {
                    return defpackage.adkp.a;
                }
                return null;
            default:
                return null;
        }
    }

    public static long cj(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        long jMax = 0;
        while (it.hasNext()) {
            defpackage.adju adjuVar = (defpackage.adju) it.next();
            defpackage.adjc adjcVarC = adjuVar.c();
            int iB = adjcVarC.b();
            if (iB == 1 || iB == 2) {
                jMax += java.lang.Math.max(adjuVar.b(), adjcVarC.e());
            }
        }
        return jMax;
    }

    public static long ck(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        long jB = 0;
        while (it.hasNext()) {
            defpackage.adju adjuVar = (defpackage.adju) it.next();
            if (adjuVar.b.exists()) {
                jB += adjuVar.b();
            }
        }
        return jB;
    }

    public static java.lang.String cl(java.lang.Object obj) {
        if (obj == null) {
            return "-";
        }
        return (obj instanceof defpackage.adhp ? ((defpackage.adhp) obj).a() : obj.getClass().getSimpleName()) + ':' + obj.hashCode();
    }

    static int cm(java.lang.String str, int i) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        int iIndexOf = str.indexOf(10, i);
        return iIndexOf == -1 ? (-1) + length : iIndexOf;
    }

    public static adhj cn(java.lang.String str, int i) {
        int iCm = cm(str, i);
        adhj adhjVar = null;
        while (iCm > 0) {
            int length = iCm >= str.length() ? str.length() - 1 : iCm;
            int i2 = i;
            while (i2 <= length && java.lang.Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            if (i2 <= i || i2 > length - 2 || str.charAt(i2) != 'a' || str.charAt(i2 + 1) != 't' || !java.lang.Character.isWhitespace(str.charAt(i2 + 2))) {
                if (adhjVar != null) {
                    break;
                }
            } else {
                if (adhjVar == null) {
                    adhjVar = new adhj();
                    adhjVar.a = i;
                    adhjVar.c = str;
                }
                adhjVar.b = iCm;
            }
            i = iCm + 1;
            iCm = cm(str, i);
        }
        return adhjVar;
    }

    public static java.lang.String co(java.lang.Throwable th, int i) {
        java.lang.String str = th.getClass().getName() + ": " + th.getMessage();
        java.lang.Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + co(cause, i + 1);
    }

    public static java.lang.Throwable cp(java.lang.Throwable th) {
        java.lang.Throwable cause = th.getCause();
        if (cause == null) {
            return th;
        }
        java.lang.Class<?> cls = th.getClass();
        return (cls.equals(java.util.concurrent.ExecutionException.class) || cls.equals(defpackage.aitx.class)) ? cp(cause) : th;
    }

    public static void cq(android.content.res.AssetManager assetManager, java.lang.String str, java.io.File file) {
        defpackage.aism aismVar = new defpackage.aism();
        try {
            java.io.InputStream inputStreamOpen = assetManager.open(str);
            aismVar.c(inputStreamOpen);
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
            aismVar.c(bufferedOutputStream);
            defpackage.aisk.a(inputStreamOpen, bufferedOutputStream);
            aismVar.close();
        } catch (java.lang.Throwable th) {
            try {
                throw aismVar.a(th);
            } catch (java.lang.Throwable th2) {
                aismVar.close();
                throw th2;
            }
        }
    }

    public static /* synthetic */ java.lang.String cr(int i) {
        if (i == 1) {
            return "NETWORK_STATE_CONNECTED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NETWORK_STATE_ANY";
        }
        return "NETWORK_STATE_UNMETERED";
    }

    public static /* synthetic */ defpackage.acuu cs() {
        defpackage.akzx akzxVarM = defpackage.acuu.a.m();
        akzxVarM.u();
        defpackage.acuu acuuVar = (defpackage.acuu) akzxVarM.b;
        acuuVar.b |= 1;
        acuuVar.c = true;
        akzxVarM.u();
        defpackage.acuu acuuVar2 = (defpackage.acuu) akzxVarM.b;
        acuuVar2.b |= 2;
        acuuVar2.d = true;
        akzxVarM.u();
        defpackage.acuu acuuVar3 = (defpackage.acuu) akzxVarM.b;
        acuuVar3.b |= 4;
        acuuVar3.e = false;
        return (defpackage.acuu) akzxVarM.r();
    }

    public static defpackage.crd ct(defpackage.bti btiVar, int i) {
        if (btiVar == null) {
            defpackage.aooh.i("$this$fromToken");
        }
        if (i == 1) {
            return btiVar.e;
        }
        if (i == 2) {
            return btiVar.g;
        }
        if (i == 3) {
            return cF(btiVar.e);
        }
        if (i == 4) {
            return btiVar.a;
        }
        if (i == 5) {
            return cF(btiVar.a);
        }
        if (i == 6) {
            return defpackage.bge.a;
        }
        if (i == 7) {
            return btiVar.d;
        }
        if (i == 8) {
            return defpackage.bfx.d(btiVar.d, new defpackage.bfz(0.0f), null, null, new defpackage.bfz(0.0f), 6);
        }
        if (i == 9) {
            return btiVar.f;
        }
        if (i == 10) {
            return defpackage.bfx.d(btiVar.d, null, new defpackage.bfz(0.0f), new defpackage.bfz(0.0f), null, 9);
        }
        if (i == 11) {
            return cF(btiVar.d);
        }
        if (i == 12) {
            return btiVar.c;
        }
        return i == 13 ? defpackage.cqz.a : btiVar.b;
    }

    public static /* synthetic */ defpackage.adae cu(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.adae(akzxVar);
    }

    public static /* synthetic */ defpackage.adae cv(defpackage.akzz akzzVar) {
        if (akzzVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.adae(akzzVar);
    }

    public static /* synthetic */ defpackage.adae cw(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.adae(akzxVar);
    }

    public static int cx(ammo ammoVar) {
        defpackage.aooh.f(ammoVar, "timeOfDay");
        return (ammoVar.b * 60) + ammoVar.c;
    }

    public static java.lang.String cy(java.lang.String str, java.lang.Object... objArr) {
        defpackage.aooh.f(objArr, "optionalFormatArgs");
        int length = objArr.length;
        if (length == 0) {
            return str;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        defpackage.aooh.e(str2, "format(...)");
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public static java.util.concurrent.ExecutorService cz(defpackage.absg absgVar, defpackage.abri abriVar, java.util.concurrent.ThreadFactory threadFactory, defpackage.absl abslVar, defpackage.abrn abrnVar) {
        abrh abrhVar = new abrh(threadFactory);
        java.util.Set set = abriVar.d;
        synchronized (set) {
            set.add(abrhVar);
        }
        defpackage.ahys ahysVar = new defpackage.ahys(abrhVar);
        boolean z = absgVar.c;
        ?? r4 = ahysVar.a;
        ?? absnVar = z ? new absn((java.util.concurrent.ThreadFactory) r4, abslVar, 0) : r4;
        ?? afjlVar = absnVar;
        if (absgVar.d != defpackage.absi.a) {
            afjlVar = new afjl((java.util.concurrent.ThreadFactory) absnVar, 1);
        }
        defpackage.aitw aitwVar = new defpackage.aitw(absgVar.b, afjlVar, new defpackage.ddv(abslVar, 19), new defpackage.ddv(abslVar, 20));
        j$.util.Objects.requireNonNull(aitwVar);
        return new abrf((abrj) ((defpackage.ahys) abriVar.a).a, abrnVar, abriVar.b, abriVar.c, (abrh) r4, abriVar.d, aitwVar, new aprf(aitwVar));
    }

    public static void e(android.view.View view, float f) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof defpackage.agaf) {
            ((defpackage.agaf) background).Q(f);
        }
    }

    public static void f(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background instanceof defpackage.agaf) {
            h(view, (defpackage.agaf) background);
        }
    }

    private static float g(java.lang.String[] strArr, int i) {
        float f = java.lang.Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new java.lang.IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static void h(android.view.View view, defpackage.agaf agafVar) {
        defpackage.afsr afsrVar = agafVar.q.b;
        if (afsrVar == null || !afsrVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            elevation += ((android.view.View) parent).getElevation();
        }
        agafVar.T(elevation);
    }

    public static defpackage.agab i(int i) {
        return i != 1 ? new defpackage.agaj() : new agaa();
    }

    private static java.lang.String j(java.lang.String str, java.lang.String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static float k(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int l(android.content.Context context, android.content.res.TypedArray typedArray, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int m(android.content.res.TypedArray typedArray, int i, int i2) {
        return !typedArray.hasValue(i) ? i2 : i;
    }

    private static boolean n(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static android.content.res.ColorStateList o(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateListA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA = defpackage.dwk.a(context.getResources(), resourceId, context.getTheme())) == null) ? typedArray.getColorStateList(i) : colorStateListA;
    }

    public static android.graphics.drawable.Drawable p(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.graphics.drawable.Drawable drawableBO;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableBO = defpackage.den.bO(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableBO;
    }

    public static boolean q(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean r(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static afza s(android.content.Context context, android.content.res.TypedArray typedArray) {
        int resourceId;
        if (!typedArray.hasValue(0) || (resourceId = typedArray.getResourceId(0, 0)) == 0) {
            return null;
        }
        return new afza(context, resourceId);
    }

    public static int t(android.content.Context context, int i) {
        if (i != 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, defpackage.afyx.a);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                return complexUnit == 2 ? java.lang.Math.round(android.util.TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : android.util.TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            }
        }
        return 0;
    }

    public static int u(android.content.Context context, int i, int i2) {
        return v(context.getTheme(), i, i2);
    }

    public static int v(android.content.res.Resources.Theme theme, int i, int i2) {
        android.util.TypedValue typedValueX = x(theme, i);
        return (typedValueX == null || typedValueX.type != 16) ? i2 : typedValueX.data;
    }

    public static android.util.TypedValue w(android.content.Context context, int i) {
        return x(context.getTheme(), i);
    }

    public static android.util.TypedValue x(android.content.res.Resources.Theme theme, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static android.util.TypedValue y(android.content.Context context, int i, java.lang.String str) {
        android.util.TypedValue typedValueX = x(context.getTheme(), i);
        if (typedValueX != null) {
            return typedValueX;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean z(android.content.res.Resources.Theme theme, int i, boolean z) {
        android.util.TypedValue typedValueX = x(theme, i);
        if (typedValueX == null || typedValueX.type != 18) {
            return z;
        }
        return typedValueX.data != 0;
    }

    public float a(float f) {
        return 1.0f;
    }

    public void c(float f, float f2, float f3, defpackage.agav agavVar) {
        agavVar.d(f, 0.0f);
    }

    public boolean d() {
        return false;
    }

    public agab(int[] iArr) {
    }

    public agab() {
    }

    public agab(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        new java.util.Random();
    }

    public agab(defpackage.aduu aduuVar) {
        if (aduuVar == null) {
            defpackage.aooh.i("gnpConfig");
        }
    }

    public void b(defpackage.agav agavVar, float f, float f2) {
    }
}
