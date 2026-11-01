package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwr {
    public java.lang.Object a;
    public final java.lang.Object b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public ajwr(defpackage.aw awVar, java.util.concurrent.Executor executor) throws afeb {
        defpackage.agtg agtgVar = new defpackage.agtg(executor, true, false, false);
        this.b = agtgVar;
        agtgVar.d();
        awVar.P().c(new defpackage.ahrs(new defpackage.agyi(this, awVar)));
    }

    public static final java.lang.String i(java.lang.String str, android.view.View view) {
        java.lang.String simpleName = (java.lang.String) view.getTag(2131429276);
        if (simpleName == null) {
            simpleName = view.getClass().getSimpleName();
        }
        return defpackage.a.bE(simpleName, (byte) 32, str);
    }

    private final synchronized android.content.Context p() {
        if (this.a == null) {
            java.lang.Object obj = this.b;
            android.content.Context contextM = aa$.ExternalSyntheticApiModelOutline1.m((android.content.Context) obj);
            if (contextM != null) {
                this.a = contextM;
            } else {
                this.a = obj;
            }
        }
        return (android.content.Context) this.a;
    }

    public final defpackage.ajwt a() {
        org.json.JSONObject jSONObject;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(b());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new org.json.JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (java.io.IOException | org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        java.lang.String strOptString2 = jSONObject.optString("AuthToken", null);
        java.lang.String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        java.lang.String strOptString4 = jSONObject.optString("FisError", null);
        defpackage.ajws ajwsVarA = defpackage.ajwt.a();
        ajwsVarA.a = strOptString;
        ajwsVarA.c(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        ajwsVarA.b = strOptString2;
        ajwsVarA.c = strOptString3;
        ajwsVarA.d(jOptLong);
        ajwsVarA.b(jOptLong2);
        ajwsVarA.d = strOptString4;
        return ajwsVarA.a();
    }

    public final java.io.File b() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    java.lang.Object obj = this.b;
                    java.lang.String str = "PersistedInstallation." + ((defpackage.ajtc) obj).f() + ".json";
                    java.io.File file = new java.io.File(((defpackage.ajtc) obj).a().getNoBackupFilesDir(), str);
                    this.a = file;
                    if (file.exists()) {
                        return (java.io.File) this.a;
                    }
                    java.io.File file2 = new java.io.File(((defpackage.ajtc) obj).a().getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((java.io.File) this.a)) {
                        android.util.Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new java.io.IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (java.io.File) this.a;
    }

    public final void c(defpackage.ajwt ajwtVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("Fid", ajwtVar.a);
            int i = ajwtVar.g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", ajwtVar.b);
            jSONObject.put("RefreshToken", ajwtVar.c);
            jSONObject.put("TokenCreationEpochInSecs", ajwtVar.e);
            jSONObject.put("ExpiresInSecs", ajwtVar.d);
            jSONObject.put("FisError", ajwtVar.f);
            java.io.File fileCreateTempFile = java.io.File.createTempFile("PersistedInstallation", "tmp", ((defpackage.ajtc) this.b).a().getFilesDir());
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(b())) {
                throw new java.io.IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
        }
    }

    public final defpackage.ajcq d(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        executor.getClass();
        return e(new defpackage.ajbr(this, callable), executor);
    }

    public final defpackage.ajcq e(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        executor.getClass();
        final defpackage.ajbt ajbtVar = new defpackage.ajbt(executor, this);
        defpackage.ahqt ahqtVar = new defpackage.ahqt(this, ajbtVar, ajasVar, 3);
        final defpackage.ajdd ajddVar = new defpackage.ajdd();
        final defpackage.ajcq ajcqVar = (defpackage.ajcq) ((java.util.concurrent.atomic.AtomicReference) this.b).getAndSet(ajddVar);
        final defpackage.ajdk ajdkVar = new defpackage.ajdk(ahqtVar);
        ajcqVar.c(ajdkVar, ajbtVar);
        final defpackage.ajcq ajcqVarA = defpackage.aiql.A(ajdkVar);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ajbq
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.ajdk ajdkVar2 = ajdkVar;
                if (ajdkVar2.isDone()) {
                    ajddVar.q(ajcqVar);
                } else if (ajcqVarA.isCancelled() && ajbtVar.a()) {
                    ajdkVar2.cancel(false);
                }
            }
        };
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        ajcqVarA.c(runnable, ajbmVar);
        ajdkVar.c(runnable, ajbmVar);
        return ajcqVarA;
    }

    @java.lang.Deprecated
    public final void f(android.view.View view, final android.view.View.OnClickListener onClickListener) {
        final defpackage.agqh agqhVar = new defpackage.agqh(8);
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: ahto
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                android.view.View.OnClickListener onClickListener2 = onClickListener;
                if (defpackage.afsq.I(view2)) {
                    defpackage.ahyc ahycVar = agqhVar;
                    defpackage.ajwr ajwrVar = this.c;
                    defpackage.ahok ahokVarC = ((defpackage.ahpz) ajwrVar.b).c(1481, defpackage.ajwr.i("Clicked", view2), (defpackage.ahou) ahycVar.apply(view2));
                    try {
                        onClickListener2.onClick(view2);
                        ahokVarC.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            ahokVarC.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        });
    }

    public final void g(android.view.View view, defpackage.ahth ahthVar) {
        f(view, new defpackage.afun(ahthVar, 3));
    }

    public final void h(android.support.v7.widget.Toolbar toolbar, defpackage.ahth ahthVar) {
        toolbar.u(new aght(this, new afrh(ahthVar, 13), 3));
    }

    public final defpackage.aihd j() {
        return defpackage.aihd.t(l(1, 2), l(1, 1), l(2, 2), l(2, 1));
    }

    public final java.io.File k(defpackage.ahkk ahkkVar) {
        return l(ahkkVar.a, ahkkVar.b);
    }

    public final java.io.File l(int i, int i2) {
        java.lang.Object objP = i2 == 1 ? p() : this.b;
        int i3 = i - 1;
        if (i3 != 0) {
            return i3 != 1 ? new java.io.File(((android.content.Context) objP).getDatabasePath("nonexistent_db").getParent()) : ((android.content.Context) objP).getCacheDir();
        }
        return ((android.content.Context) objP).getFilesDir();
    }

    public final android.net.Uri m(defpackage.ahkk ahkkVar, java.lang.String str) {
        java.lang.String strConcat;
        int i = ahkkVar.a - 1;
        java.lang.String str2 = ahkkVar.b == 1 ? "directboot-" : "";
        if (i == 0) {
            strConcat = str2.concat("files");
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("The databases directory may not be used with Mobstore.");
            }
            strConcat = str2.concat("cache");
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return new android.net.Uri.Builder().scheme("android").authority(((android.content.Context) this.b).getPackageName()).path("/" + strConcat + '/' + str).build();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void n(defpackage.agxi agxiVar, defpackage.agye agyeVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.bZ(!(agyeVar instanceof defpackage.agxf), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        ((defpackage.agtg) this.b).execute(new defpackage.gsb(this, agxiVar, agyeVar, 12));
    }

    public final void o(defpackage.agxi agxiVar, defpackage.agye agyeVar) {
        ((defpackage.agtg) this.b).execute(new acxq(this, agxiVar, agyeVar, 13));
    }

    public ajwr(java.lang.Object obj) {
        this.b = obj;
    }

    public ajwr() {
        this.b = new java.util.concurrent.atomic.AtomicReference(defpackage.ajcm.a);
        this.a = new defpackage.ajbu();
    }

    public ajwr(defpackage.ahpz ahpzVar) {
        this.b = ahpzVar;
    }
}
