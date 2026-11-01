package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mud extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.nsl c;
    final /* synthetic */ muf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mud(defpackage.nsl nslVar, muf mufVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = nslVar;
        this.d = mufVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0133  */
    /* JADX WARN: Code duplicated, block: B:25:0x0147  */
    /* JADX WARN: Code duplicated, block: B:27:0x0164  */
    public final java.lang.Object b(java.lang.Object obj) {
        int length;
        java.lang.Object obj2;
        java.lang.Object objB;
        java.lang.Object objD;
        defpackage.idv idvVar;
        java.io.File file;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
                objD = obj;
            } else {
                obj2 = this.a;
                aooc.af(obj);
                objB = obj;
            }
            idvVar = (defpackage.idv) objD;
            if (idvVar == null) {
                muf.a.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "prepareAudioForUpload$<anonymous>", 103, "DobbyAudioDonationScottyUploader.kt").v("failed to encode audio file");
                return null;
            }
            file = new java.io.File(idvVar.c);
            java.lang.String name = file.getName();
            aooh.e(name, "getName(...)");
            defpackage.mun munVar = new defpackage.mun(name, muf.c(file));
            if (!file.delete()) {
                muf.a.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "prepareAudioForUpload$<anonymous>", 114, "DobbyAudioDonationScottyUploader.kt").y("unable to delete compressed file: %s", file.getName());
            }
            return munVar;
        }
        aooc.af(obj);
        java.io.File file2 = new java.io.File(this.c.c);
        if (file2.exists() && file2.isFile()) {
            java.lang.String name2 = file2.getName();
            aooh.e(name2, "getName(...)");
            if (aoov.ac(name2, ".") >= 0) {
                java.lang.String name3 = file2.getName();
                aooh.e(name3, "getName(...)");
                length = aoov.ac(name3, ".");
            } else {
                length = file2.getName().length();
            }
            java.lang.String parent = file2.getParent();
            if (parent == null) {
                parent = "";
            }
            java.lang.String str = java.io.File.separator;
            java.lang.String name4 = file2.getName();
            aooh.e(name4, "getName(...)");
            java.lang.String strSubstring = name4.substring(0, length);
            aooh.e(strSubstring, "substring(...)");
            obj2 = parent + str + strSubstring + "_scotty.flac";
            muf mufVar = this.d;
            java.lang.String path = file2.getPath();
            aooh.e(path, "getPath(...)");
            this.a = obj2;
            this.b = 1;
            objB = mufVar.b(path, this);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            muf.a.d().i(zct.b).l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "prepareAudioForUpload$<anonymous>", 85, "DobbyAudioDonationScottyUploader.kt").v("no audio provided, cannot upload");
        }
        return null;
        muf mufVar2 = this.d;
        defpackage.nsl nslVar = this.c;
        defpackage.hgw hgwVarH = defpackage.hgz.h(defpackage.idt.a.m());
        hgwVarH.b((java.lang.String) obj2);
        defpackage.heq heqVarU = defpackage.hgz.u(defpackage.idr.a.m());
        heqVarU.L(16000);
        heqVarU.K(nslVar.h);
        heqVarU.J(2);
        heqVarU.M();
        akzx akzxVarM = defpackage.idq.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.idq idqVar = (defpackage.idq) akzxVarM.b;
        idqVar.b |= 1;
        idqVar.c = 8;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.idq idqVar2 = (defpackage.idq) aladVarP;
        aooh.f(idqVar2, "value");
        akzx akzxVar = (akzx) heqVarU.a;
        akzxVar.u();
        defpackage.idr idrVar = (defpackage.idr) akzxVar.b;
        j$.util.Objects.requireNonNull(idqVar2);
        idrVar.d = idqVar2;
        idrVar.c = 5;
        hgwVarH.c(heqVarU.I());
        ajcq ajcqVarN = mufVar2.c.n(hgwVarH.a(), (akzc) objB);
        this.a = null;
        this.b = 2;
        objD = aosv.D(ajcqVarN, this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        idvVar = (defpackage.idv) objD;
        if (idvVar == null) {
            muf.a.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "prepareAudioForUpload$<anonymous>", 103, "DobbyAudioDonationScottyUploader.kt").v("failed to encode audio file");
            return null;
        }
        file = new java.io.File(idvVar.c);
        java.lang.String name5 = file.getName();
        aooh.e(name5, "getName(...)");
        defpackage.mun munVar2 = new defpackage.mun(name5, muf.c(file));
        if (!file.delete()) {
            muf.a.d().l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "prepareAudioForUpload$<anonymous>", 114, "DobbyAudioDonationScottyUploader.kt").y("unable to delete compressed file: %s", file.getName());
        }
        return munVar2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mud(this.c, this.d, aolnVar);
    }
}
