package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class upy implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ upy(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.io.Closeable, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.util.concurrent.ExecutionException {
        ahax ahaxVarU;
        aigf aigfVarC;
        int i = this.$cid;
        if (i == 0) {
            ((uqc) this.b).g((android.net.Uri) this.c, j$.util.Optional.of(java.lang.Integer.valueOf(this.a)));
            return null;
        }
        if (i == 1) {
            if (this.a != 2) {
                return null;
            }
            java.lang.Object obj = this.b;
            defpackage.uar uarVar = (defpackage.uar) this.c;
            uarVar.i = 2;
            uarVar.h = defpackage.uab.a((java.lang.String) obj);
            uarVar.j.a(ajcm.a);
            uarVar.e.b(mce.cH);
            return null;
        }
        if (i == 2) {
            android.content.Context context = ((defpackage.uxy) this.c).b;
            java.lang.String absolutePath = context.getCacheDir().getAbsolutePath();
            java.lang.Object obj2 = this.b;
            j$.nio.file.Path path = j$.nio.file.Paths.get(absolutePath, new java.lang.String[]{(java.lang.String) obj2});
            try {
                java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(this.a);
                try {
                    j$.nio.file.Files.copy(inputStreamOpenRawResource, path, new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
                    defpackage.uxy.a.b().l("com/android/dialer/util/SoundFileCreator", "createFile", 44, "SoundFileCreator.java").y("Created sound file: %s", obj2);
                    j$.util.Optional optionalOf = j$.util.Optional.of(path.toFile());
                    if (inputStreamOpenRawResource == null) {
                        return optionalOf;
                    }
                    inputStreamOpenRawResource.close();
                    return optionalOf;
                } catch (java.lang.Throwable th) {
                    if (inputStreamOpenRawResource == null) {
                        throw th;
                    }
                    try {
                        inputStreamOpenRawResource.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Exception e) {
                hgb.g(defpackage.uxy.a.c(), "Unable to create sound file: %s", obj2, "com/android/dialer/util/SoundFileCreator", "createFile", '3', "SoundFileCreator.java", e, zct.b);
                return j$.util.Optional.empty();
            }
        }
        if (i != 3) {
            ?? r2 = this.b;
            java.lang.Object obj3 = this.c;
            int i2 = this.a;
            try {
                java.util.HashMap map = new java.util.HashMap();
                for (java.util.Map.Entry entry : ((defpackage.aheo) obj3).j.entrySet()) {
                    map.put(entry.getKey(), ((aoin) entry.getValue()).a());
                }
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    java.lang.String str = (java.lang.String) entry2.getKey();
                    ahek ahekVar = (ahek) entry2.getValue();
                    java.lang.Object objA = ((defpackage.aheo) obj3).c.a();
                    aooh.e(objA, "get(...)");
                    java.lang.Iterable iterable = (java.lang.Iterable) objA;
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(iterable, 10));
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new defpackage.ahem((defpackage.ahex) it.next(), str, 0));
                    }
                    ((defpackage.aheo) obj3).k.d(new defpackage.adbi(ahekVar, 18), ahvr.bx(arrayList));
                }
                afsq.R((java.io.RandomAccessFile) r2, i2);
                ajsz.ak((java.io.Closeable) r2, (java.lang.Throwable) null);
                return null;
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    ajsz.ak((java.io.Closeable) r2, th3);
                    throw th4;
                }
            }
        }
        java.lang.Object obj4 = this.c;
        try {
            java.lang.Object objH = aiql.H((java.util.concurrent.Future) this.b);
            aooh.c(objH);
            ahaxVarU = (ahax) objH;
        } catch (java.util.concurrent.ExecutionException e2) {
            if (!(e2.getCause() instanceof java.io.IOException) || (((ahce) obj4).o && (e2.getCause() instanceof defpackage.afeo))) {
                throw e2;
            }
            ahaxVarU = agab.be(ahax.a.m()).u();
        }
        int i3 = this.a;
        akzx akzxVarM = aexe.a.m();
        akzxVarM.u();
        aexe aexeVar = akzxVarM.b;
        aexeVar.c = a.R(4);
        aexeVar.b |= 1;
        if (i3 != 0) {
            akzxVarM.u();
            aexe aexeVar2 = akzxVarM.b;
            aexeVar2.d = agab.at(i3);
            aexeVar2.b |= 2;
        }
        try {
            aigfVarC = ((ahce) obj4).c(ahaxVarU);
        } catch (java.lang.RuntimeException e3) {
            android.util.Log.e("MendelPackageState", "Failed to parse flag", e3);
            ahaxVarU = agab.be(ahax.a.m()).u();
            akzxVarM.u();
            aexe aexeVar3 = akzxVarM.b;
            aexeVar3.c = a.R(3);
            aexeVar3.b |= 1;
            akzxVarM.u();
            aexe aexeVar4 = akzxVarM.b;
            aexeVar4.d = agab.at(11);
            aexeVar4.b |= 2;
            aigfVarC = ((ahce) obj4).c(ahaxVarU);
        } catch (alaz e4) {
            android.util.Log.e("MendelPackageState", "Failed to parse flag", e4);
            ahaxVarU = agab.be(ahax.a.m()).u();
            akzxVarM.u();
            aexe aexeVar5 = akzxVarM.b;
            aexeVar5.c = a.R(3);
            aexeVar5.b |= 1;
            akzxVarM.u();
            aexe aexeVar6 = akzxVarM.b;
            aexeVar6.d = agab.at(13);
            aexeVar6.b |= 2;
            aigfVarC = ((ahce) obj4).c(ahaxVarU);
        }
        akzx akzxVarM2 = aexf.a.m();
        akzxVarM2.u();
        aexf aexfVar = akzxVarM2.b;
        aexe aexeVarP = akzxVarM.p();
        j$.util.Objects.requireNonNull(aexeVarP);
        aexfVar.d = aexeVarP;
        aexfVar.b |= 2;
        ahce ahceVar = (ahce) obj4;
        ahceVar.g(akzxVarM2);
        return (ahda) ahceVar.h.a(aigfVarC, agab.aJ(ahaxVarU, akzxVarM2, ahceVar.a()));
    }

    public /* synthetic */ upy(defpackage.uar uarVar, int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.c = uarVar;
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ upy(defpackage.uxy uxyVar, java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.c = uxyVar;
        this.b = str;
        this.a = i;
    }
}
