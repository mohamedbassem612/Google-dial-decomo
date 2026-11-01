package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxh implements defpackage.adxb {
    private final defpackage.adxi a;
    private final defpackage.adxb b;
    private final defpackage.aduu c;
    private final defpackage.aeey d;
    private final android.content.Context e;
    private final defpackage.aoss f;
    private final defpackage.tvn g;

    public adxh(defpackage.adxi adxiVar, defpackage.tvn tvnVar, defpackage.adxb adxbVar, defpackage.aduu aduuVar, defpackage.aeey aeeyVar, android.content.Context context, defpackage.aoss aossVar) {
        defpackage.aooh.f(adxbVar, "delegate");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aossVar, "backgroundScope");
        this.a = adxiVar;
        this.g = tvnVar;
        this.b = adxbVar;
        this.c = aduuVar;
        this.d = aeeyVar;
        this.e = context;
        this.f = aossVar;
    }

    @Override // defpackage.adxb
    public final defpackage.ajcq a(adxd adxdVar) {
        defpackage.aooh.f(adxdVar, "request");
        return defpackage.aosv.F(this.f, 0, new acju(this, adxdVar, (defpackage.aoln) null, 19), 3);
    }

    @Override // defpackage.adxb
    public final java.lang.String b() {
        return "common";
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v12, types: [aoin, java.lang.Object] */
    public final java.lang.Object c(adxd adxdVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        adxg adxgVar;
        adxd adxdVarB;
        if (aolnVar instanceof adxg) {
            adxgVar = (adxg) aolnVar;
            int i = adxgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adxgVar.c = i - Integer.MIN_VALUE;
            } else {
                adxgVar = new adxg(this, aolnVar);
            }
        } else {
            adxgVar = new adxg(this, aolnVar);
        }
        java.lang.Object objD = adxgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = adxgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.adxi adxiVar = this.a;
            defpackage.aooh.f(adxdVar, "request");
            if (angs.c().length() > 0) {
                android.content.ContentResolver contentResolver = adxiVar.a.getContentResolver();
                defpackage.aooh.e(contentResolver, "getContentResolver(...)");
                defpackage.aooh.f(contentResolver, "contentResolver");
                long jB = defpackage.aaym.b(contentResolver, 0L);
                if (jB != 0) {
                    aoux aouxVarA = adxdVar.a();
                    defpackage.adxc adxcVar = defpackage.adxc.b;
                    java.lang.String string = java.lang.Long.toString(jB, 16);
                    defpackage.aooh.e(string, "toString(...)");
                    aouxVarA.d(adxcVar, string);
                    defpackage.adxc adxcVar2 = defpackage.adxc.c;
                    defpackage.akzx akzxVarM = amtw.a.m();
                    defpackage.aooh.f(akzxVarM, "builder");
                    defpackage.akzc akzcVarW = defpackage.akzc.w(angs.c());
                    defpackage.aooh.e(akzcVarW, "copyFromUtf8(...)");
                    defpackage.aooh.f(akzcVarW, "value");
                    akzxVarM.u();
                    amtw amtwVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(akzcVarW);
                    amtwVar.b |= 8;
                    amtwVar.c = akzcVarW;
                    amtw amtwVarR = akzxVarM.r();
                    defpackage.aooh.e(amtwVarR, "build(...)");
                    aouxVarA.d(adxcVar2, defpackage.aesg.x(amtwVarR));
                    adxdVarB = aouxVarA.b();
                } else {
                    adxdVarB = adxdVar;
                }
            } else {
                adxdVarB = adxdVar;
            }
            defpackage.tvn tvnVar = this.g;
            defpackage.aooh.f(adxdVarB, "request");
            java.net.URL url = adxdVarB.a;
            defpackage.aooh.e(url, "url(...)");
            java.lang.String host = url.getHost();
            if (host != null) {
                java.lang.String lowerCase = host.toLowerCase(java.util.Locale.ROOT);
                defpackage.aooh.e(lowerCase, "toLowerCase(...)");
                if (defpackage.aoov.r(lowerCase, ".google.com", false) || defpackage.aoov.r(lowerCase, ".googleapis.com", false) || defpackage.aooh.n(lowerCase, "google.com") || defpackage.aooh.n(lowerCase, "googleapis.com")) {
                    aoux aouxVarA2 = adxdVarB.a();
                    ?? r2 = tvnVar.a;
                    defpackage.adxc adxcVar3 = defpackage.adxc.e;
                    java.lang.Object objA = r2.a();
                    defpackage.aooh.e(objA, "get(...)");
                    aouxVarA2.d(adxcVar3, defpackage.ajsz.cr((java.lang.Iterable) objA, ",", null, null, null, 62));
                    adxdVarB = aouxVarA2.b();
                }
            }
            long jA = angi.a.b().a();
            if (jA != -1) {
                java.lang.String str = java.lang.String.format(java.util.Locale.US, "%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(jA)}, 1));
                defpackage.aooh.e(str, "format(...)");
                aoux aouxVarA3 = adxdVarB.a();
                aouxVarA3.d(defpackage.adxc.d, str);
                adxdVarB = aouxVarA3.b();
            }
            defpackage.ajcq ajcqVarA = this.b.a(adxdVarB);
            defpackage.aooh.e(ajcqVarA, "executeAsync(...)");
            adxgVar.d = adxdVar;
            adxgVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarA, adxgVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adxdVar = adxgVar.d;
            defpackage.aooc.af(objD);
        }
        defpackage.aeey aeeyVar = this.d;
        android.content.Context context = this.e;
        defpackage.aduu aduuVar = this.c;
        defpackage.adxb adxbVar = this.b;
        adxe adxeVar = (adxe) objD;
        java.lang.String packageName = context.getPackageName();
        java.lang.String strB = adxbVar.b();
        int i3 = adxdVar.e;
        java.lang.String path = i3 == 2 ? adxdVar.a.getPath() : "";
        java.lang.Integer num = adxeVar.a;
        int iIntValue = num != null ? num.intValue() : -1;
        java.lang.String strU = defpackage.aesg.u(i3);
        if (i3 == 0) {
            throw null;
        }
        ((defpackage.afip) aeeyVar.d.eZ()).b(1L, packageName, aduuVar.a, strB, path, java.lang.Integer.valueOf(iIntValue), strU);
        defpackage.aooh.e(objD, "also(...)");
        return objD;
    }
}
