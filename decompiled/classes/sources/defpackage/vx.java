package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vx {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public vx(java.util.List list, java.util.List list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((java.lang.Integer) list.get(i)).intValue();
            ((float[]) this.b)[i] = ((java.lang.Float) list2.get(i)).floatValue();
        }
    }

    public static final boolean B(java.lang.String str, java.lang.String str2) {
        return androidx.core.content.FileProvider.a(str).startsWith(androidx.core.content.FileProvider.a(str2) + '/');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    private final void J(java.lang.String str) {
        ?? r0 = this.a;
        if (r0 != 0 && !r0.contains(str)) {
            throw new java.lang.IllegalStateException("Can't access key outside migration: ".concat(str));
        }
    }

    public static final boolean i(android.text.method.KeyListener keyListener) {
        return !(keyListener instanceof android.text.method.NumberKeyListener);
    }

    public static final android.text.method.KeyListener j(android.text.method.KeyListener keyListener) {
        if (!i(keyListener) || (keyListener instanceof ekh)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !(keyListener instanceof android.text.method.NumberKeyListener) ? new ekh(keyListener) : keyListener;
    }

    public static /* synthetic */ java.util.List z(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(j$.util.Objects.requireNonNull(objArr[0]));
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public final java.io.File A(android.net.Uri uri) {
        java.lang.String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            java.util.Objects.toString(uri);
            throw new java.lang.IllegalArgumentException("Unable to find path from root: ".concat(java.lang.String.valueOf(uri)));
        }
        java.lang.String strDecode = android.net.Uri.decode(encodedPath.substring(1, iIndexOf));
        java.lang.String strDecode2 = android.net.Uri.decode(encodedPath.substring(iIndexOf + 1));
        java.io.File file = (java.io.File) ((java.util.HashMap) this.a).get(strDecode);
        if (file == null) {
            java.util.Objects.toString(uri);
            throw new java.lang.IllegalArgumentException("Unable to find configured root for ".concat(java.lang.String.valueOf(uri)));
        }
        java.io.File file2 = new java.io.File(file, strDecode2);
        try {
            java.io.File canonicalFile = file2.getCanonicalFile();
            if (B(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new java.lang.SecurityException("Resolved path jumped beyond configured root");
        } catch (java.io.IOException unused) {
            file2.toString();
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    public final void C() {
        synchronized (this.b) {
            ((defpackage.adw) this.a).k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final defpackage.cye D() {
        return (defpackage.cye) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final bzg E(defpackage.bze bzeVar) {
        return (bzg) this.b.get(bzeVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void F(defpackage.bze bzeVar) {
        ?? r0 = this.b;
        bzg bzgVar = (bzg) r0.get(bzeVar);
        if (bzgVar != null) {
        }
        r0.remove(bzeVar);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aonn, java.lang.Object] */
    public final void G(defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2102125731);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            this.b.a(cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(this, i, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aono, java.lang.Object] */
    public final void H(oq oqVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(945127568);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(oqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(this) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            this.a.a(oqVar, cavVarB, java.lang.Integer.valueOf(i2 & 14));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new amv(this, oqVar, i, 17, (byte[]) null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void I(amwp amwpVar) {
        int i = amwpVar.a;
        if (i != 0) {
            this.a.execute(new eyd((dvl) this.b, i, 1));
        } else {
            java.lang.Object obj = amwpVar.b;
            this.a.execute(new defpackage.ad((dvl) this.b, (android.graphics.Typeface) obj, 16));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final androidx.car.app.model.ActionStrip a() {
        if (this.a.isEmpty()) {
            throw new java.lang.IllegalStateException("Action strip must contain at least one action");
        }
        return new androidx.car.app.model.ActionStrip(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void b(androidx.car.app.model.Action action) {
        int type = ((androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action)).getType();
        if (type != 1 && this.b.contains(java.lang.Integer.valueOf(type))) {
            java.util.Objects.toString(action);
            throw new java.lang.IllegalArgumentException("Duplicated action types are disallowed: ".concat(java.lang.String.valueOf(action)));
        }
        androidx.car.app.model.CarText title = action.getTitle();
        if (title != null) {
            zl.a.a(title);
        }
        this.b.add(java.lang.Integer.valueOf(type));
        this.a.add(action);
    }

    public final void c(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = (android.content.Intent) this.a;
        intent.setData(uri);
        context.startActivity(intent, (android.os.Bundle) this.b);
    }

    public final void d(of ofVar) {
        java.lang.Object obj = this.a;
        if (obj != null) {
            ((defpackage.fxy) obj).e(ofVar.d);
            return;
        }
        java.lang.Object obj2 = this.b;
        if (obj2 == null) {
            throw new java.lang.IllegalStateException("Unreachable");
        }
        ((defpackage.nf) obj2).c(ofVar.c);
    }

    public final void e(of ofVar) {
        if (this.a != null) {
            ofVar.d.f();
        } else {
            if (this.b == null) {
                throw new java.lang.IllegalStateException("Unreachable");
            }
            ofVar.c.e();
        }
    }

    public final void f() {
        ((android.util.SparseIntArray) this.b).clear();
    }

    public final void g() {
        ((android.util.SparseIntArray) this.a).clear();
    }

    public final void h(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.widget.EditText) this.b).getContext().obtainStyledAttributes(attributeSet, defpackage.ef.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ekk ekkVar = (ekk) ((defpackage.vx) this.a).b;
            if (ekkVar.a != z) {
                ekkVar.a = z;
                if (z) {
                    synchronized (defpackage.ekb.a) {
                        defpackage.ekb ekbVar = defpackage.ekb.b;
                        defpackage.dzk.v(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                    throw null;
                }
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final android.view.inputmethod.InputConnection k(android.view.inputmethod.InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof ekg) ? new ekg((android.widget.TextView) ((defpackage.vx) this.a).a, inputConnection) : inputConnection;
    }

    public final void l(bhd bhdVar) {
        ((defpackage.adq) this.a).q(bhdVar);
    }

    public final void m() {
        ((defpackage.adq) this.a).q(bhh.b);
    }

    public final boolean n() {
        return (((defpackage.cei) this.b).c() & 1) != 0;
    }

    public final boolean o() {
        return (((defpackage.cei) this.b).c() & 2) != 0;
    }

    public final boolean p() {
        return (((defpackage.cei) this.b).c() & 4) != 0;
    }

    public final long q() {
        return defpackage.mni.bj(((cwg) this.a).a(Float.MAX_VALUE), ((cwg) this.b).a(Float.MAX_VALUE));
    }

    public final void r(long j, long j2) {
        ((cwg) this.a).b(j, java.lang.Float.intBitsToFloat((int) (j2 >> 32)));
        ((cwg) this.b).b(j, java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void s(aox aoxVar, defpackage.cav cavVar, int i) {
        int i2 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-798501095);
        int i3 = i2 == 0 ? (true != cavVarB.B(aoxVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(this) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            java.util.List listC = ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).c();
            int size = listC.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((defpackage.aono) listC.get(i4)).a(aoxVar, cavVarB, java.lang.Integer.valueOf(i3 & 14));
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new amv(this, aoxVar, i, 2, (byte[]) null);
        }
    }

    public final void u(java.lang.Runnable runnable) {
        ((android.view.Choreographer) this.b).postFrameCallback(new ejj(runnable));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int v(java.lang.String str, int i) {
        J(str);
        return this.b.getInt(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean w(java.lang.String str, boolean z) {
        J(str);
        return this.b.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long x(java.lang.String str) {
        J(str);
        return this.b.getLong(str, 0L);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final java.lang.String y(java.lang.String str) {
        J(str);
        return this.b.getString(str, "");
    }

    public vx(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public vx(android.content.SharedPreferences sharedPreferences, java.util.Set set) {
        defpackage.aooh.f(sharedPreferences, "prefs");
        this.b = sharedPreferences;
        this.a = set;
    }

    public vx(android.view.animation.Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public vx(dvl dvlVar, java.util.concurrent.Executor executor) {
        this.b = dvlVar;
        this.a = executor;
    }

    public vx(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public vx(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public vx(java.lang.Object obj, java.lang.Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public vx(android.animation.Animator animator) {
        this.a = null;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public vx(android.widget.EditText editText) {
        this.b = editText;
        this.a = new defpackage.vx(editText, (byte[]) null);
    }

    public vx(defpackage.aont aontVar) {
        this.b = aontVar;
        this.a = new androidx.compose.runtime.snapshots.SnapshotStateList();
    }

    public vx(java.lang.String str) {
        this.a = new java.util.HashMap();
        this.b = str;
    }

    public vx(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public vx(short[] sArr) {
        this.b = android.view.Choreographer.getInstance();
        this.a = android.os.Looper.myLooper();
    }

    public vx(byte[] bArr) {
        this.a = new android.util.SparseIntArray();
        this.b = new android.util.SparseIntArray();
    }

    public vx(byte[] bArr, byte[] bArr2) {
        this.a = new cwg(true, 2);
        this.b = new cwg(true, 2);
    }

    public vx(android.widget.EditText editText, byte[] bArr) {
        this.a = editText;
        ekk ekkVar = new ekk(editText);
        this.b = ekkVar;
        editText.addTextChangedListener(ekkVar);
        editText.setEditableFactory(ekf.a());
    }

    public vx(defpackage.fxy fxyVar, defpackage.nf nfVar) {
        this.a = fxyVar;
        this.b = nfVar;
        if ((fxyVar == null ? nfVar : fxyVar) == null) {
            throw new java.lang.IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public vx(defpackage.kaw kawVar) {
        this.a = kawVar;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    }

    public vx() {
        this.a = new java.util.ArrayList();
        this.b = new java.util.HashSet();
    }

    public vx(char[] cArr) {
        this.a = new defpackage.adq(16);
        this.b = new defpackage.adq(16);
    }

    public vx(defpackage.aiq aiqVar) {
        this.a = aiqVar;
        this.b = new java.util.ArrayList();
    }

    public vx(char[] cArr, byte[] bArr) {
        this.b = new java.util.LinkedHashMap();
        this.a = new java.util.LinkedHashMap();
    }

    public vx(defpackage.dbk dbkVar, defpackage.cye cyeVar) {
        this.a = dbkVar;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(cyeVar, defpackage.cdu.c);
    }

    public vx(byte[] bArr, char[] cArr) {
        this.b = new java.lang.Object();
        this.a = new defpackage.adw(6);
    }
}
