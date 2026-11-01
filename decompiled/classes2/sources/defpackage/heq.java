package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class heq {
    public final java.lang.Object a;

    public heq(aoss aossVar, aolr aolrVar, zjv zjvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(zjvVar, "externalsLogging");
        this.a = zjvVar;
    }

    private static java.lang.String am(java.lang.String str, int i) {
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    public static java.lang.String c(java.lang.String str, defpackage.hep hepVar, boolean z) {
        java.lang.String strConcat = z ? ".temp".concat(java.lang.String.valueOf(hepVar.d)) : hepVar.d;
        java.lang.String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = am(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    public static final void h(android.app.Notification.Builder builder, java.lang.CharSequence charSequence, int i, java.util.List list) {
        defpackage.bjz bjzVar = new defpackage.bjz();
        bjzVar.c = (java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence);
        bjzVar.a = i;
        defpackage.aao aaoVar = new defpackage.aao(bjzVar);
        aaoVar.a.addAll(list);
        j$.util.Objects.requireNonNull(builder);
        builder.getExtras().putBundle("androidx.car.app.EXTENSIONS", aaoVar.a());
    }

    public final void A() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.iek iekVar = (defpackage.iek) akzxVar.b;
        defpackage.iek iekVar2 = defpackage.iek.a;
        iekVar.h = true;
    }

    public final void B() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.iek iekVar = (defpackage.iek) akzxVar.b;
        defpackage.iek iekVar2 = defpackage.iek.a;
        iekVar.d = true;
    }

    public final void C() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.iek iekVar = (defpackage.iek) akzxVar.b;
        defpackage.iek iekVar2 = defpackage.iek.a;
        iekVar.e = true;
    }

    public final /* synthetic */ defpackage.ied D() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ied) aladVarP;
    }

    public final void E(defpackage.iec iecVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ied iedVar = (defpackage.ied) akzxVar.b;
        defpackage.ied iedVar2 = defpackage.ied.a;
        iedVar.e = iecVar.a();
    }

    public final void F(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ied iedVar = (defpackage.ied) akzxVar.b;
        defpackage.ied iedVar2 = defpackage.ied.a;
        iedVar.d = j;
    }

    public final void G(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ied iedVar = (defpackage.ied) akzxVar.b;
        defpackage.ied iedVar2 = defpackage.ied.a;
        iedVar.b |= 1;
        iedVar.f = j;
    }

    public final void H(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ied iedVar = (defpackage.ied) akzxVar.b;
        defpackage.ied iedVar2 = defpackage.ied.a;
        j$.util.Objects.requireNonNull(str);
        iedVar.c = str;
    }

    public final /* synthetic */ defpackage.idr I() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.idr) aladVarP;
    }

    public final void J(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.idr idrVar = (defpackage.idr) akzxVar.b;
        defpackage.idr idrVar2 = defpackage.idr.a;
        idrVar.b |= 4;
        idrVar.g = i;
    }

    public final void K(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.idr idrVar = (defpackage.idr) akzxVar.b;
        defpackage.idr idrVar2 = defpackage.idr.a;
        idrVar.b |= 2;
        idrVar.f = i;
    }

    public final void L(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.idr idrVar = (defpackage.idr) akzxVar.b;
        defpackage.idr idrVar2 = defpackage.idr.a;
        idrVar.b |= 1;
        idrVar.e = i;
    }

    public final void M() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.idr idrVar = (defpackage.idr) akzxVar.b;
        defpackage.idr idrVar2 = defpackage.idr.a;
        idrVar.b |= 8;
        idrVar.h = 16000;
    }

    public final /* synthetic */ owz N() {
        owz owzVarP = ((akzx) this.a).p();
        aooh.e(owzVarP, "build(...)");
        return owzVarP;
    }

    public final /* synthetic */ owl O() {
        owl owlVarP = ((akzx) this.a).p();
        aooh.e(owlVarP, "build(...)");
        return owlVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object P(aoln aolnVar) {
        owj owjVar;
        if (aolnVar instanceof owj) {
            owjVar = (owj) aolnVar;
            int i = owjVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                owjVar.b = i - Integer.MIN_VALUE;
            } else {
                owjVar = new owj(this, aolnVar);
            }
        } else {
            owjVar = new owj(this, aolnVar);
        }
        java.lang.Object objAu = owjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = owjVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.a.b();
            owjVar.b = 1;
            objAu = aoov.au(aoxhVarB, owjVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        return java.lang.Boolean.valueOf(((owl) objAu).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object Q(aoln aolnVar) {
        owk owkVar;
        if (aolnVar instanceof owk) {
            owkVar = (owk) aolnVar;
            int i = owkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                owkVar.b = i - Integer.MIN_VALUE;
            } else {
                owkVar = new owk(this, aolnVar);
            }
        } else {
            owkVar = new owk(this, aolnVar);
        }
        java.lang.Object obj = owkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = owkVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.a;
            ipv ipvVar = new ipv((aoln) null, 19, (byte[]) null, (byte[]) null);
            owkVar.b = 1;
            if (r5.a(ipvVar, owkVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final ajcq R(defpackage.oqt oqtVar) {
        akzx akzxVarM = defpackage.oqs.a.m();
        akzxVarM.u();
        defpackage.oqs oqsVar = (defpackage.oqs) akzxVarM.b;
        oqsVar.c = oqtVar.w;
        oqsVar.b |= 1;
        defpackage.oqs oqsVar2 = (defpackage.oqs) akzxVarM.p();
        java.lang.Object obj = this.a;
        oqi oqiVar = (oqi) obj;
        oqiVar.g.isPresent();
        oqiVar.f.isPresent();
        ahvr.bN(1 == (oqsVar2.b & 1), "Cannot process HaTS events with unspecified event type.");
        ahrv ahrvVarG = ahrv.g(ahvr.F(new defpackage.lly(obj, oqsVar2, 14), oqiVar.c));
        defpackage.ljp ljpVar = new defpackage.ljp(obj, oqsVar2, 17);
        ajct ajctVar = oqiVar.d;
        ajcq ajcqVarI = ahrvVarG.i(ljpVar, ajctVar);
        ajcq ajcqVarI2 = ahrv.g(ajcqVarI).i(new defpackage.ocj(obj, 6), ajctVar);
        ajcq ajcqVarI3 = ahrv.g(ajcqVarI).i(new defpackage.ocj(obj, 7), ajctVar);
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarI3, ajcqVarI2}).p(new defpackage.jsr(obj, ajcqVarI, ajcqVarI3, 12), ajctVar);
    }

    public final void S(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.oiu oiuVar = (defpackage.oiu) akzxVar.b;
        defpackage.oiu oiuVar2 = defpackage.oiu.a;
        oiuVar.b |= 4;
        oiuVar.e = z;
    }

    public final /* synthetic */ defpackage.oit T() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.oit) aladVarP;
    }

    public final /* synthetic */ defpackage.ogp U() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ogp) aladVarP;
    }

    public final android.content.Context V() {
        android.content.Context context = ((android.view.View) this.a).getContext();
        aooh.e(context, "getContext(...)");
        return context;
    }

    public final android.view.View W() {
        return ((android.view.View) this.a).findViewById(2131428537);
    }

    public final android.view.View X() {
        return ((android.view.View) this.a).findViewById(2131428538);
    }

    public final android.view.View Y() {
        return ((android.view.View) this.a).findViewById(2131428539);
    }

    public final android.widget.ImageButton Z() {
        android.view.View viewFindViewById = ((android.view.View) this.a).findViewById(2131428534);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.ImageButton) viewFindViewById;
    }

    public final java.io.File a() {
        java.io.File file = new java.io.File(((android.content.Context) ((rai) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final android.widget.TextView aa() {
        android.view.View viewFindViewById = ((android.view.View) this.a).findViewById(2131428096);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView ab() {
        android.view.View viewFindViewById = ((android.view.View) this.a).findViewById(2131428533);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView ac() {
        android.view.View viewFindViewById = ((android.view.View) this.a).findViewById(2131428535);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout ad() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = ((android.view.View) this.a).findViewById(2131427624);
        aooh.e(constraintLayoutFindViewById, "findViewById(...)");
        return constraintLayoutFindViewById;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout ae() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = ((android.view.View) this.a).findViewById(2131427744);
        aooh.e(constraintLayoutFindViewById, "findViewById(...)");
        return constraintLayoutFindViewById;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout af() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = ((android.view.View) this.a).findViewById(2131428432);
        aooh.e(constraintLayoutFindViewById, "findViewById(...)");
        return constraintLayoutFindViewById;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout ag() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = ((android.view.View) this.a).findViewById(2131428999);
        aooh.e(constraintLayoutFindViewById, "findViewById(...)");
        return constraintLayoutFindViewById;
    }

    public final com.android.dialer.calllocation.ui.LocationView ah() {
        return (com.android.dialer.calllocation.ui.LocationView) ((android.view.View) this.a).findViewById(2131428389);
    }

    public final com.google.android.material.chip.Chip ai() {
        com.google.android.material.chip.Chip chipFindViewById = ((android.view.View) this.a).findViewById(2131428097);
        aooh.e(chipFindViewById, "findViewById(...)");
        return chipFindViewById;
    }

    public final /* synthetic */ defpackage.obh aj() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.obh) aladVarP;
    }

    public final void ak(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.obh obhVar = (defpackage.obh) akzxVar.b;
        defpackage.obh obhVar2 = defpackage.obh.a;
        obhVar.b |= 2;
        obhVar.d = i;
    }

    public final void al(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.obh obhVar = (defpackage.obh) akzxVar.b;
        defpackage.obh obhVar2 = defpackage.obh.a;
        j$.util.Objects.requireNonNull(str);
        obhVar.b |= 1;
        obhVar.c = str;
    }

    public final java.io.File b(java.lang.String str, java.io.InputStream inputStream, defpackage.hep hepVar) throws java.io.IOException {
        java.io.File file = new java.io.File(a(), c(str, hepVar, true));
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (java.lang.Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void d(defpackage.hax haxVar) {
        this.a.add(haxVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void e(android.graphics.Path path) {
        ?? r5 = this.a;
        int size = r5.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.hax haxVar = (defpackage.hax) r5.get(size);
            java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
            if (haxVar != null && !haxVar.a) {
                defpackage.hgm.e(path, ((defpackage.hbh) haxVar.b).k() / 100.0f, ((defpackage.hbh) haxVar.c).k() / 100.0f, ((defpackage.hbh) haxVar.d).k() / 360.0f);
            }
        }
    }

    public final /* synthetic */ defpackage.hqf f() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.hqf) aladVarP;
    }

    public final android.net.Uri g(java.lang.String str) {
        aooh.f(str, "callBackgroundUri");
        java.lang.Object obj = this.a;
        aooh.f(obj, "context");
        aooh.f(str, "callBackgroundUri");
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.dialer.cariconprovider");
        builder.appendQueryParameter("callBackgroundUri", str);
        android.net.Uri uriBuild = builder.build();
        try {
            ((android.content.Context) obj).grantUriPermission("com.google.android.projection.gearhead", uriBuild, 1);
        } catch (java.lang.Exception e) {
            if (fh$.ExternalSyntheticApiModelOutline0.m(e) || fh$.ExternalSyntheticApiModelOutline0.m(e.getCause())) {
                com.android.dialer.androidauto.impl.caricons.CarIconContentProvider.a.b().k(e).l("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider$Companion", "getUriForCallBackground", 221, "CarIconContentProvider.kt").I("System server died while granting URI permission to %s for %s", "com.google.android.projection.gearhead", uriBuild);
            } else {
                com.android.dialer.androidauto.impl.caricons.CarIconContentProvider.a.d().k(e).l("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider$Companion", "getUriForCallBackground", 230, "CarIconContentProvider.kt").I("Unexpected error granting URI permission to %s for %s", "com.google.android.projection.gearhead", uriBuild);
            }
        }
        aooh.c(uriBuild);
        return uriBuild;
    }

    public final /* synthetic */ defpackage.hkd i() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.hkd) aladVarP;
    }

    public final void j(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.hkd hkdVar = (defpackage.hkd) akzxVar.b;
        defpackage.hkd hkdVar2 = defpackage.hkd.a;
        j$.util.Objects.requireNonNull(str);
        hkdVar.b |= 1;
        hkdVar.c = str;
    }

    public final /* synthetic */ defpackage.igp k() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igp) aladVarP;
    }

    public final /* synthetic */ void l() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.igp) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getIndividualModelAvaila…lityCheckResultsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.igo m() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igo) aladVarP;
    }

    public final void n(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igo igoVar = (defpackage.igo) akzxVar.b;
        defpackage.igo igoVar2 = defpackage.igo.a;
        igoVar.b |= 1;
        igoVar.f = z;
    }

    public final void o(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igo igoVar = (defpackage.igo) akzxVar.b;
        defpackage.igo igoVar2 = defpackage.igo.a;
        igoVar.e = z;
    }

    public final void p(defpackage.ihh ihhVar) {
        aooh.f(ihhVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igo igoVar = (defpackage.igo) akzxVar.b;
        defpackage.igo igoVar2 = defpackage.igo.a;
        igoVar.d = java.lang.Integer.valueOf(ihhVar.a());
        igoVar.c = 2;
    }

    public final void q(defpackage.iho ihoVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igo igoVar = (defpackage.igo) akzxVar.b;
        defpackage.igo igoVar2 = defpackage.igo.a;
        igoVar.d = java.lang.Integer.valueOf(ihoVar.a());
        igoVar.c = 3;
    }

    public final /* synthetic */ igj r() {
        igj igjVarP = ((akzx) this.a).p();
        aooh.e(igjVarP, "build(...)");
        return igjVarP;
    }

    public final void s() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        igj igjVar = akzxVar.b;
        igj igjVar2 = igj.a;
        igjVar.b = 4;
    }

    public final /* synthetic */ defpackage.igi t() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igi) aladVarP;
    }

    public final void u(defpackage.igh ighVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igi igiVar = (defpackage.igi) akzxVar.b;
        alal alalVar = defpackage.igi.a;
        igiVar.e = ighVar.a();
        igiVar.c |= 1;
    }

    public final void v(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igi igiVar = (defpackage.igi) akzxVar.b;
        alal alalVar = defpackage.igi.a;
        igiVar.d = z;
    }

    public final /* synthetic */ defpackage.igb w() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.igb) aladVarP;
    }

    public final void x(akzc akzcVar) {
        aooh.f(akzcVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.igb igbVar = (defpackage.igb) akzxVar.b;
        defpackage.igb igbVar2 = defpackage.igb.a;
        j$.util.Objects.requireNonNull(akzcVar);
        igbVar.b |= 1;
        igbVar.c = akzcVar;
    }

    public final /* synthetic */ defpackage.iek y() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.iek) aladVarP;
    }

    public final void z(defpackage.ied iedVar) {
        aooh.f(iedVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.iek iekVar = (defpackage.iek) akzxVar.b;
        defpackage.iek iekVar2 = defpackage.iek.a;
        j$.util.Objects.requireNonNull(iedVar);
        iekVar.c = iedVar;
        iekVar.b |= 1;
    }

    public heq(android.content.Context context, byte[] bArr) {
        aooh.f(context, "appContext");
        this.a = context;
    }

    public heq(android.hardware.input.InputManager inputManager) {
        aooh.f(inputManager, "inputManager");
        this.a = inputManager;
    }

    public heq(android.content.Context context) {
        aooh.f(context, "appContext");
        this.a = context;
    }

    public heq(ecx ecxVar) {
        aooh.f(ecxVar, "dataStore");
        this.a = ecxVar;
    }

    public heq(java.lang.Object obj) {
        this.a = obj;
    }

    public heq(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public heq() {
        this.a = new java.util.ArrayList();
    }

    public heq(byte[] bArr) {
        this.a = new java.util.LinkedList();
    }
}
