package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class sqg implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ sqg(defpackage.agyj agyjVar, defpackage.agxi agxiVar, int i) {
        this.$cid = i;
        this.b = agyjVar;
        this.a = agxiVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [agxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, sqn] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            spn spnVar = ((defpackage.spp) ((defpackage.aigf) this.b).get(((java.util.Map.Entry) obj).getKey())).c;
            if (spnVar == null) {
                spnVar = spn.a;
            }
            return this.a.f(spnVar);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new defpackage.aewg((android.content.ContentResolver) this.a, (android.net.Uri) this.b);
                }
                defpackage.agyj agyjVar = (defpackage.agyj) this.b;
                java.util.concurrent.Executor executor = agyjVar.f;
                defpackage.agtg agtgVar = agyjVar.e;
                return new defpackage.agym(this.a, agyjVar.g, agyjVar.i, agtgVar, executor);
            }
            defpackage.adnv adnvVar = (defpackage.adnv) obj;
            defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.adqo.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/TtsAudioFileProvider", "generateFile", 157, "TtsAudioFileProvider.java");
            java.lang.Object obj2 = this.b;
            aimwVar.I("Generating file '%s' for message key %s", obj2, adnvVar);
            java.io.File file = new java.io.File(java.lang.String.valueOf(java.lang.String.valueOf(obj2)).concat(".temp"));
            java.lang.String str = adnvVar.a;
            java.lang.String str2 = adnvVar.b;
            if (file.toString() == null) {
                throw new java.lang.NullPointerException("Null synthesizedAudioPath");
            }
            defpackage.adqo adqoVar = (defpackage.adqo) this.a;
            defpackage.ajck ajckVarW = defpackage.ajck.w(adqoVar.b.c());
            defpackage.vmn vmnVar = new defpackage.vmn(adnvVar, 19);
            defpackage.ajct ajctVar = adqoVar.d;
            return ajckVarW.v(defpackage.adse.class, vmnVar, ajctVar).y(new defpackage.uqd(7), ajctVar);
        }
        defpackage.ypm ypmVar = (defpackage.ypm) obj;
        defpackage.akff akffVar = (defpackage.akff) ((j$.util.Optional) this.b).orElse((java.lang.Object) null);
        java.lang.Object obj3 = this.a;
        if (akffVar == null) {
            return new defpackage.ajcm(defpackage.lje.b);
        }
        int iOrdinal = ypmVar.ordinal();
        if (iOrdinal == 1) {
            return akffVar.c().equals(defpackage.akff.d.c()) ? new defpackage.ajcm(defpackage.lje.a) : new defpackage.ajcm(defpackage.lje.b);
        }
        if (iOrdinal != 2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ljf.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "isModelSupported", (char) 209, "CallScreenModelChooser.java")).y("unrecognized model: %s", ypmVar.name());
            return new defpackage.ajcm(defpackage.lje.b);
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(300, "CallScreenModelChooser.isSodaSupported", defpackage.ahot.a, true);
        try {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.ljf.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/CallScreenModelChooser", "isSodaSupported", 223, "CallScreenModelChooser.java")).v("SODA Availability CACHE checker enabled");
            defpackage.ahrv ahrvVarH = defpackage.ahrv.g(((defpackage.ljf) obj3).d.b(akffVar)).h(new lgd(obj3, 11), ((defpackage.ljf) obj3).c);
            ahoqVarX.a(ahrvVarH);
            ahoqVarX.close();
            return ahrvVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ sqg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
