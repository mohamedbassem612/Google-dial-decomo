package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxw {
    private static java.lang.ref.WeakReference d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public ajxw(defpackage.emw emwVar, defpackage.emq emqVar) {
        enz enjVar;
        if (emwVar == null) {
            defpackage.aooh.i("observer");
        }
        this.a = emwVar;
        this.c = emqVar;
        defpackage.enb enbVar = defpackage.enb.a;
        if (emwVar == null) {
            defpackage.aooh.i("object");
        }
        boolean z = emwVar instanceof defpackage.emv;
        boolean z2 = emwVar instanceof defpackage.emj;
        if (z && z2) {
            enjVar = new defpackage.emk((defpackage.emj) emwVar, (defpackage.emv) emwVar);
        } else if (z2) {
            enjVar = new defpackage.emk((defpackage.emj) emwVar, null);
        } else if (z) {
            enjVar = (defpackage.emv) emwVar;
        } else {
            java.lang.Class<?> cls = emwVar.getClass();
            if (defpackage.enb.a.a(cls) == 2) {
                java.lang.Object obj = defpackage.enb.b.get(cls);
                if (obj == null) {
                    defpackage.aooh.g();
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() == 1) {
                    enjVar = new enz(defpackage.enb.b((java.lang.reflect.Constructor) list.get(0), emwVar), 0);
                } else {
                    int size = list.size();
                    emm[] emmVarArr = new emm[size];
                    for (int i = 0; i < size; i++) {
                        emmVarArr[i] = defpackage.enb.b((java.lang.reflect.Constructor) list.get(i), emwVar);
                    }
                    enjVar = new enz(emmVarArr, 1);
                }
            } else {
                enjVar = new enj(emwVar);
            }
        }
        this.b = enjVar;
    }

    public static defpackage.ajxw C(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        return new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static defpackage.ajxw D(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[Catch: all -> 0x005b, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:5:0x000d, B:7:0x0025, B:9:0x002d, B:11:0x0038, B:13:0x0041, B:15:0x0049, B:16:0x004f, B:17:0x0052, B:19:0x0054), top: B:31:0x000d, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    private final synchronized void E() {
        defpackage.gou gouVar = new defpackage.gou(this.a, this.b);
        java.lang.Object obj = gouVar.d;
        synchronized (obj) {
            try {
                ((java.util.ArrayDeque) obj).clear();
                java.lang.String string = gouVar.e.getString((java.lang.String) gouVar.c, "");
                if (!android.text.TextUtils.isEmpty(string)) {
                    ?? r3 = gouVar.b;
                    if (string.contains(r3)) {
                        java.lang.String[] strArrSplit = string.split((java.lang.String) r3, -1);
                        if (strArrSplit.length == 0) {
                            android.util.Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (java.lang.String str : strArrSplit) {
                            if (!android.text.TextUtils.isEmpty(str)) {
                                ((java.util.ArrayDeque) obj).add(str);
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.c = gouVar;
    }

    public static synchronized defpackage.ajxw b(android.content.Context context, java.util.concurrent.Executor executor) {
        defpackage.ajxw ajxwVar;
        java.lang.ref.WeakReference weakReference = d;
        ajxwVar = weakReference != null ? (defpackage.ajxw) weakReference.get() : null;
        if (ajxwVar == null) {
            ajxwVar = new defpackage.ajxw(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            ajxwVar.E();
            d = new java.lang.ref.WeakReference(ajxwVar);
        }
        return ajxwVar;
    }

    public final int A(int i) {
        return ((android.content.res.TypedArray) this.b).getColor(i, 0);
    }

    public final float B(int i) {
        return ((android.content.res.TypedArray) this.b).getDimension(i, -1.0f);
    }

    final synchronized defpackage.ajxv a() {
        java.lang.String str;
        java.lang.Object obj = ((defpackage.gou) this.c).d;
        synchronized (obj) {
            try {
                str = (java.lang.String) ((java.util.ArrayDeque) obj).peek();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        int i = defpackage.ajxv.d;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                return new defpackage.ajxv(strArrSplit[0], strArrSplit[1]);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized void c(defpackage.ajxv ajxvVar) {
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = ((defpackage.gou) obj).d;
        java.lang.String str = ajxvVar.c;
        synchronized (obj2) {
            try {
                if (((java.util.ArrayDeque) obj2).remove(str)) {
                    ((defpackage.gou) obj).a.execute(new ahts(obj, 9));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object d(tsl tslVar, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.a, new tgn(this, tslVar, (defpackage.aoln) null, 3), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [emv, java.lang.Object] */
    public final void e(defpackage.emx emxVar, defpackage.emp empVar) {
        defpackage.emq emqVarA = empVar.a();
        this.c = defpackage.ajsz.av(this.c, emqVarA);
        defpackage.gkc gkcVar = defpackage.gkc.d;
        gkcVar.a("androidx.lifecycle");
        defpackage.gjy gjyVar = defpackage.gjy.b;
        try {
            this.b.a(emxVar, empVar);
            defpackage.mni.aP(gjyVar);
            this.c = emqVarA;
        } catch (java.lang.Throwable th) {
            try {
                fsu.I(gkcVar, th);
                throw new defpackage.aoiq();
            } catch (java.lang.Throwable th2) {
                defpackage.mni.aP(gjyVar);
                throw th2;
            }
        }
    }

    public final void f(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("splitInfoList");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            gpo gpoVar = (gpo) obj;
            android.app.Activity activity = (android.app.Activity) this.a;
            if (gpoVar.a.a(activity) || gpoVar.b.a(activity)) {
                arrayList.add(obj);
            }
        }
        if (defpackage.aooh.n(arrayList, this.c)) {
            return;
        }
        this.c = arrayList;
        new defpackage.an(this, arrayList, 8, (byte[]) null).run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aoub aoubVar, defpackage.aoln aolnVar) {
        gdj gdjVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (aolnVar instanceof gdj) {
            gdjVar = (gdj) aolnVar;
            int i = gdjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gdjVar.c = i - Integer.MIN_VALUE;
            } else {
                gdjVar = new gdj(this, aolnVar);
            }
        } else {
            gdjVar = new gdj(this, aolnVar);
        }
        java.lang.Object obj3 = gdjVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gdjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj3);
            obj = this.a;
            gdjVar.a = aoubVar;
            defpackage.apdp apdpVar = (defpackage.apdp) obj;
            gdjVar.d = apdpVar;
            gdjVar.c = 1;
            if (apdpVar.b(gdjVar) == aoluVar) {
                obj2 = aoubVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = gdjVar.d;
            java.lang.Object obj4 = gdjVar.a;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            obj2 = obj4;
        }
        try {
            obj2 = aoubVar;
            if (obj2 == this.c) {
                this.c = null;
            }
            return defpackage.aojh.a;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2.n(r0) != r1) goto L24;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoub, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.aoub r7, defpackage.aoln r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gdk
            if (r0 == 0) goto L13
            r0 = r8
            gdk r0 = (defpackage.gdk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gdk r0 = new gdk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            apdp r7 = r0.d
            java.lang.Object r0 = r0.a
            defpackage.aooc.af(r8)     // Catch: java.lang.Throwable -> L82
            goto L78
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            apdp r7 = r0.d
            java.lang.Object r2 = r0.a
            defpackage.aooc.af(r8)
            r8 = r7
            r7 = r2
            goto L54
        L40:
            defpackage.aooc.af(r8)
            java.lang.Object r8 = r6.a
            r0.a = r7
            r2 = r8
            apdp r2 = (defpackage.apdp) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L8c
        L54:
            java.lang.Object r2 = r6.c     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L76
            r2.t()     // Catch: java.lang.Throwable -> L84
            gdi r4 = new gdi     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = r6.b     // Catch: java.lang.Throwable -> L84
            kaw r5 = (defpackage.kaw) r5     // Catch: java.lang.Throwable -> L84
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L84
            r2.s(r4)     // Catch: java.lang.Throwable -> L84
            r0.a = r7     // Catch: java.lang.Throwable -> L84
            r4 = r8
            apdp r4 = (defpackage.apdp) r4     // Catch: java.lang.Throwable -> L84
            r0.d = r4     // Catch: java.lang.Throwable -> L84
            r0.c = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r2.n(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == r1) goto L8c
        L76:
            r0 = r7
            r7 = r8
        L78:
            r6.c = r0     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            apdp r7 = (defpackage.apdp) r7
            r7.d()
            goto L8c
        L82:
            r6 = move-exception
            goto L86
        L84:
            r6 = move-exception
            r7 = r8
        L86:
            apdp r7 = (defpackage.apdp) r7
            r7.d()
            throw r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxw.h(aoub, aoln):java.lang.Object");
    }

    public final java.lang.Object i() {
        long id = java.lang.Thread.currentThread().getId();
        return id == defpackage.cjj.a ? this.c : ((defpackage.aaif) ((java.util.concurrent.atomic.AtomicReference) this.a).get()).g(id);
    }

    public final void j(java.lang.Object obj) {
        long id = java.lang.Thread.currentThread().getId();
        if (id == defpackage.cjj.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            java.lang.Object obj2 = this.a;
            defpackage.aaif aaifVar = (defpackage.aaif) ((java.util.concurrent.atomic.AtomicReference) obj2).get();
            if (!aaifVar.h(id, obj)) {
                ((java.util.concurrent.atomic.AtomicReference) obj2).set(aaifVar.k(id, obj));
            }
        }
    }

    public final java.lang.Object k() {
        java.lang.Object objG;
        long id = java.lang.Thread.currentThread().getId();
        if (id == defpackage.cjj.a) {
            java.lang.Object obj = this.c;
            this.c = null;
            return obj;
        }
        synchronized (this.b) {
            java.lang.Object obj2 = this.a;
            defpackage.aaif aaifVar = (defpackage.aaif) ((java.util.concurrent.atomic.AtomicReference) obj2).get();
            objG = aaifVar.g(id);
            if (!aaifVar.h(id, null)) {
                ((java.util.concurrent.atomic.AtomicReference) obj2).set(aaifVar.k(id, null));
            }
        }
        return objG;
    }

    public final void l(java.lang.Object obj) {
        long id = java.lang.Thread.currentThread().getId();
        if (id == defpackage.cjj.a) {
            if (this.c == null) {
                this.c = obj;
                return;
            }
            return;
        }
        synchronized (this.b) {
            java.lang.Object obj2 = this.a;
            defpackage.aaif aaifVar = (defpackage.aaif) ((java.util.concurrent.atomic.AtomicReference) obj2).get();
            if (aaifVar.g(id) == null && !aaifVar.h(id, obj)) {
                ((java.util.concurrent.atomic.AtomicReference) obj2).set(aaifVar.k(id, obj));
            }
        }
    }

    public final int m(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getDimensionPixelOffset(i, i2);
    }

    public final int n(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getDimensionPixelSize(i, i2);
    }

    public final int o(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getInt(i, i2);
    }

    public final int p(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getInteger(i, i2);
    }

    public final int q(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getLayoutDimension(i, i2);
    }

    public final int r(int i, int i2) {
        return ((android.content.res.TypedArray) this.b).getResourceId(i, i2);
    }

    public final android.content.res.ColorStateList s(int i) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            android.content.Context context = (android.content.Context) this.a;
            android.content.res.ColorStateList colorStateListA = defpackage.dwk.a(context.getResources(), resourceId, context.getTheme());
            if (colorStateListA != null) {
                return colorStateListA;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public final android.graphics.drawable.Drawable t(int i) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : defpackage.lg.e().c((android.content.Context) this.a, resourceId);
    }

    public final android.graphics.drawable.Drawable u(int i) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return defpackage.ho.d().g((android.content.Context) this.a, resourceId);
    }

    public final java.lang.CharSequence v(int i) {
        return ((android.content.res.TypedArray) this.b).getText(i);
    }

    public final java.lang.String w(int i) {
        return ((android.content.res.TypedArray) this.b).getString(i);
    }

    public final void x() {
        ((android.content.res.TypedArray) this.b).recycle();
    }

    public final boolean y(int i, boolean z) {
        return ((android.content.res.TypedArray) this.b).getBoolean(i, z);
    }

    public final boolean z(int i) {
        return ((android.content.res.TypedArray) this.b).hasValue(i);
    }

    public ajxw(android.app.Activity activity, defpackage.dxw dxwVar) {
        this.a = activity;
        this.b = dxwVar;
    }

    public ajxw(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    private ajxw(android.content.SharedPreferences sharedPreferences, java.util.concurrent.Executor executor) {
        this.b = executor;
        this.a = sharedPreferences;
    }

    public ajxw(him himVar, defpackage.hkh hkhVar) {
        this.b = himVar;
        this.a = hkhVar;
    }

    public ajxw(java.lang.Runnable runnable, java.util.concurrent.Executor executor, defpackage.ajxw ajxwVar) {
        this.b = runnable;
        this.a = executor;
        this.c = ajxwVar;
    }

    public ajxw(byte[] bArr) {
        this.a = new defpackage.aaaj((byte[]) null);
        this.b = new defpackage.aaaj((byte[]) null);
        this.c = new defpackage.dst[32];
    }

    public ajxw() {
        this.a = new java.util.concurrent.atomic.AtomicReference(defpackage.cji.a);
        this.b = new java.lang.Object();
    }

    public ajxw(android.content.Context context) {
        this.b = new defpackage.afew();
        defpackage.agab.ah(context != null, "Context cannot be null", new java.lang.Object[0]);
        this.a = context.getApplicationContext();
    }

    public ajxw(defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.a = aolrVar;
        this.b = new defpackage.ahda((byte[]) null);
        this.c = tsl.a;
    }

    public ajxw(defpackage.adld adldVar) {
        this.a = new defpackage.adhh();
        this.b = adldVar;
    }

    public ajxw(android.content.Context context, java.lang.String str) {
        this(new defpackage.zzd(context, str, null), str);
    }

    public ajxw(defpackage.zzd zzdVar, java.lang.String str) {
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        if (str.startsWith("STREAMZ_")) {
            this.a = zzdVar;
            this.b = str;
            return;
        }
        throw new java.lang.IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    public ajxw(defpackage.kaw kawVar) {
        this.b = kawVar;
        this.a = new defpackage.apdp();
    }
}
