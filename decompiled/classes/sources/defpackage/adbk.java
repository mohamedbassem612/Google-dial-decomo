package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adbk implements defpackage.adba {
    public final defpackage.acvl a;
    public defpackage.ahyn b = defpackage.ahwt.a;
    private final android.content.Context c;
    private final java.lang.String d;
    private final defpackage.adag e;
    private final defpackage.adae f;

    public adbk(android.content.Context context, defpackage.adae adaeVar, defpackage.adag adagVar, defpackage.acvl acvlVar) {
        this.c = context;
        this.f = adaeVar;
        this.d = context.getPackageName();
        this.e = adagVar;
        this.a = acvlVar;
    }

    private final defpackage.ajcq t(int i, defpackage.ajas ajasVar, int i2) {
        return defpackage.ahvr.I(this.e.a(i2, this.b), new tbh(this, ajasVar, i, i2, 3), defpackage.ajbm.INSTANCE);
    }

    private final void u(int i, defpackage.akzx akzxVar, long j) {
        defpackage.akzx akzxVarM = aixg.a.m();
        akzxVarM.u();
        aixg aixgVar = akzxVarM.b;
        aixgVar.b |= 1;
        aixgVar.c = false;
        r(i, akzxVar, j, (aixg) akzxVarM.r());
    }

    @Override // defpackage.adba
    public final defpackage.ajcq a(defpackage.ajas ajasVar) {
        return t(1046, new defpackage.xbw(ajasVar, 20), this.a.h());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [adbf, java.lang.Object] */
    @Override // defpackage.adba
    public final defpackage.ajcq b(java.lang.String str, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2) {
        defpackage.ajcq ajcqVarZ = defpackage.aiql.z(defpackage.ahwt.a);
        if (this.b.f()) {
            ajcqVarZ = this.b.b().c(str);
        }
        adcs adcsVarE = adcs.e(ajcqVarZ);
        adbh adbhVar = new adbh(str, ahynVar2, ahynVar, 0);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.ahvr.H(adcsVarE.f(adbhVar, ajbmVar), new aczo(this, 6), ajbmVar);
    }

    @Override // defpackage.adba
    public final defpackage.ajcq c(defpackage.ajas ajasVar) {
        return t(1058, new adbi(ajasVar, 1), this.a.l());
    }

    @Override // defpackage.adba
    public final defpackage.ajcq d(defpackage.ajas ajasVar) {
        return t(1057, new adbi(ajasVar, 0), this.a.n());
    }

    @Override // defpackage.adba
    public final void e(aiwp aiwpVar) {
        long jI = this.a.i();
        if (defpackage.adbe.a(jI)) {
            defpackage.akzx akzxVarM = aiwo.a.m();
            akzxVarM.u();
            aiwo aiwoVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(aiwpVar);
            aiwoVar.r = aiwpVar;
            aiwoVar.d |= 4;
            u(1075, akzxVarM, jI);
        }
    }

    @Override // defpackage.adba
    public final void f(aiwm aiwmVar, aiwr aiwrVar) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwrVar);
        aiwoVar.s = aiwrVar;
        aiwoVar.d |= 8;
        akzxVarM.u();
        aiwo aiwoVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwoVar2.e = aiwmVar;
        aiwoVar2.b |= 256;
        s(1082, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void g(aiwv aiwvVar) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwvVar);
        aiwoVar.t = aiwvVar;
        aiwoVar.d |= 256;
        s(1110, akzxVarM, this.a.d());
    }

    @Override // defpackage.adba
    public final void h(aiwm aiwmVar) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        defpackage.akzx akzxVarM2 = aixa.a.m();
        akzxVarM2.u();
        aixa aixaVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aixaVar.c = aiwmVar;
        aixaVar.b |= 1;
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        aixa aixaVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aixaVarR);
        aiwoVar.p = aixaVarR;
        aiwoVar.d |= 1;
        s(1071, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void i(aiwm aiwmVar, int i) {
        defpackage.akzx akzxVarM = aixb.a.m();
        akzxVarM.u();
        aixb aixbVar = akzxVarM.b;
        aixbVar.b |= 1;
        aixbVar.c = i;
        aixb aixbVarR = akzxVarM.r();
        defpackage.akzx akzxVarM2 = aiwo.a.m();
        akzxVarM2.u();
        aiwo aiwoVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aixbVarR);
        aiwoVar.v = aixbVarR;
        aiwoVar.d |= 2048;
        akzxVarM2.u();
        aiwo aiwoVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwoVar2.e = aiwmVar;
        aiwoVar2.b |= 256;
        s(1117, akzxVarM2, this.a.j());
    }

    @Override // defpackage.adba
    public final void j(aiwm aiwmVar, aixf aixfVar) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(aixfVar);
        aiwoVar.u = aixfVar;
        aiwoVar.d |= 512;
        akzxVarM.u();
        aiwo aiwoVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwoVar2.e = aiwmVar;
        aiwoVar2.b |= 256;
        s(1018, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void k(int i, int i2) {
        u(i, aiwo.a.m(), i2);
    }

    @Override // defpackage.adba
    public final void l(int i) {
        s(i, aiwo.a.m(), this.a.j());
    }

    @Override // defpackage.adba
    public final void m(int i, java.lang.String str, int i2, long j, java.lang.String str2) {
        defpackage.akzx akzxVarM = aiwm.a.m();
        akzxVarM.u();
        aiwm aiwmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        aiwmVar.b |= 1;
        aiwmVar.c = str;
        akzxVarM.u();
        aiwm aiwmVar2 = akzxVarM.b;
        aiwmVar2.b |= 2;
        aiwmVar2.d = i2;
        akzxVarM.u();
        aiwm aiwmVar3 = akzxVarM.b;
        aiwmVar3.b |= 64;
        aiwmVar3.i = j;
        akzxVarM.u();
        aiwm aiwmVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        aiwmVar4.b |= 128;
        aiwmVar4.j = str2;
        aiwm aiwmVarR = akzxVarM.r();
        defpackage.akzx akzxVarM2 = aiwo.a.m();
        akzxVarM2.u();
        aiwo aiwoVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aiwmVarR);
        aiwoVar.e = aiwmVarR;
        aiwoVar.b |= 256;
        s(i, akzxVarM2, this.a.j());
    }

    @Override // defpackage.adba
    public final void n(int i, int i2) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        defpackage.akzx akzxVarM2 = aiwt.a.m();
        akzxVarM2.u();
        aiwt aiwtVar = akzxVarM2.b;
        aiwtVar.b |= 2;
        aiwtVar.d = i2;
        akzxVarM2.u();
        aiwt aiwtVar2 = akzxVarM2.b;
        aiwtVar2.c = defpackage.a.V(i);
        aiwtVar2.b |= 1;
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        aiwt aiwtVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aiwtVarR);
        aiwoVar.k = aiwtVarR;
        aiwoVar.c |= 32768;
        s(1053, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void o(aiwm aiwmVar, int i, long j, long j2, java.lang.String str, int i2) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        defpackage.akzx akzxVarM2 = aiwx.a.m();
        akzxVarM2.u();
        aiwx aiwxVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwxVar.c = aiwmVar;
        aiwxVar.b |= 1;
        akzxVarM2.u();
        aiwx aiwxVar2 = akzxVarM2.b;
        aiwxVar2.d = defpackage.a.Q(i);
        aiwxVar2.b |= 2;
        akzxVarM2.u();
        aiwx aiwxVar3 = akzxVarM2.b;
        aiwxVar3.b |= 4;
        aiwxVar3.e = j;
        akzxVarM2.u();
        aiwx aiwxVar4 = akzxVarM2.b;
        aiwxVar4.b |= 8;
        aiwxVar4.f = j2;
        akzxVarM2.u();
        aiwx aiwxVar5 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        aiwxVar5.b |= 16;
        aiwxVar5.g = str;
        akzxVarM2.u();
        aiwx aiwxVar6 = akzxVarM2.b;
        aiwxVar6.b |= 32;
        aiwxVar6.h = i2;
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        aiwx aiwxVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aiwxVarR);
        aiwoVar.n = aiwxVarR;
        aiwoVar.c |= 4194304;
        s(1068, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void p(aiwm aiwmVar, int i) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        defpackage.akzx akzxVarM2 = aixd.a.m();
        akzxVarM2.u();
        aixd aixdVar = akzxVarM2.b;
        aixdVar.c = defpackage.a.Q(i);
        aixdVar.b |= 1;
        aixd aixdVarR = akzxVarM2.r();
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(aixdVarR);
        aiwoVar.w = aixdVarR;
        aiwoVar.d |= 16384;
        akzxVarM.u();
        aiwo aiwoVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwoVar2.e = aiwmVar;
        aiwoVar2.b |= 256;
        s(1119, akzxVarM, this.a.j());
    }

    @Override // defpackage.adba
    public final void q(int i, aiwm aiwmVar, int i2) {
        defpackage.akzx akzxVarM = aiwo.a.m();
        defpackage.akzx akzxVarM2 = aiws.a.m();
        akzxVarM2.u();
        aiws aiwsVar = akzxVarM2.b;
        aiwsVar.c = airh.i(i);
        aiwsVar.b |= 1;
        akzxVarM2.u();
        aiws aiwsVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        aiwsVar2.d = aiwmVar;
        aiwsVar2.b |= 2;
        akzxVarM2.u();
        aiws aiwsVar3 = akzxVarM2.b;
        aiwsVar3.e = defpackage.a.V(i2);
        aiwsVar3.b |= 4;
        akzxVarM2.u();
        aiws aiwsVar4 = akzxVarM2.b;
        aiwsVar4.b |= 8;
        aiwsVar4.f = 0;
        akzxVarM.u();
        aiwo aiwoVar = akzxVarM.b;
        aiws aiwsVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aiwsVarR);
        aiwoVar.o = aiwsVarR;
        aiwoVar.c |= Integer.MIN_VALUE;
        s(1070, akzxVarM, this.a.j());
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    public final void r(int i, defpackage.akzx akzxVar, long j, aixg aixgVar) {
        defpackage.akzx akzxVarM = aiwl.a.m();
        akzxVarM.u();
        aiwl aiwlVar = akzxVarM.b;
        java.lang.String str = this.d;
        j$.util.Objects.requireNonNull(str);
        aiwlVar.b |= 2;
        aiwlVar.d = str;
        akzxVarM.u();
        aiwl aiwlVar2 = akzxVarM.b;
        aiwlVar2.b |= 1;
        aiwlVar2.c = 722788935;
        akzxVar.u();
        aiwo aiwoVar = akzxVar.b;
        aiwo aiwoVar2 = aiwo.a;
        aiwoVar.b |= 524288;
        aiwoVar.f = j;
        defpackage.akzx akzxVarM2 = aiwn.a.m();
        android.os.StatFs statFs = new android.os.StatFs(this.c.getFilesDir().getAbsolutePath());
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        long blockSize2 = statFs.getBlockSize();
        double dMin = java.lang.Math.min(5.24288E8d, blockCount * blockSize * 0.05d);
        akzxVarM2.u();
        aiwn aiwnVar = akzxVarM2.b;
        aiwnVar.b |= 1;
        aiwnVar.c = ((availableBlocks * blockSize2) > dMin ? 1 : ((availableBlocks * blockSize2) == dMin ? 0 : -1)) >>> 31;
        akzxVar.u();
        aiwo aiwoVar3 = akzxVar.b;
        aiwn aiwnVarR = akzxVarM2.r();
        j$.util.Objects.requireNonNull(aiwnVarR);
        aiwoVar3.i = aiwnVarR;
        aiwoVar3.c |= 128;
        akzxVar.u();
        aiwo aiwoVar4 = akzxVar.b;
        aiwl aiwlVarR = akzxVarM.r();
        j$.util.Objects.requireNonNull(aiwlVarR);
        aiwoVar4.m = aiwlVarR;
        aiwoVar4.c |= 524288;
        akzxVar.u();
        aiwo aiwoVar5 = akzxVar.b;
        j$.util.Objects.requireNonNull(aixgVar);
        aiwoVar5.g = aixgVar;
        aiwoVar5.b |= 1048576;
        this.f.a(akzxVar.r(), i - 2);
    }

    public final void s(int i, defpackage.akzx akzxVar, long j) {
        defpackage.ahvr.J(this.e.a(j, this.b), new adbj(this, i, akzxVar, j), defpackage.ajbm.INSTANCE);
    }
}
