package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adae {
    public final java.lang.Object a;

    public adae(int i) {
        defpackage.akzz akzzVar = (defpackage.akzz) defpackage.acmh.a.m();
        this.a = akzzVar;
        akzzVar.u();
        defpackage.acmh acmhVar = (defpackage.acmh) akzzVar.b;
        acmhVar.c = i - 1;
        acmhVar.b |= 1;
    }

    public final void A() {
        ((java.util.concurrent.atomic.AtomicReference) this.a).set(null);
    }

    public final /* synthetic */ defpackage.achw B() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.achw) aladVarR;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.absl C(defpackage.absg absgVar) {
        defpackage.absm absmVar = new defpackage.absm(absgVar);
        this.a.put(absgVar, absmVar);
        return absmVar;
    }

    public final java.util.concurrent.ThreadFactory D(final java.util.concurrent.ThreadFactory threadFactory) {
        final android.os.StrictMode.ThreadPolicy.Builder builder = new android.os.StrictMode.ThreadPolicy.Builder();
        return new java.util.concurrent.ThreadFactory() { // from class: abqb
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return threadFactory.newThread(new defpackage.gsb(this.c, builder, runnable, 6));
            }
        };
    }

    public final void E(defpackage.aazd aazdVar, int i, int i2) {
        int i3;
        defpackage.abav abavVarL = ((defpackage.acxg) this.a).l(aazdVar);
        if (abavVarL != null) {
            defpackage.akzc akzcVar = defpackage.akzc.d;
            defpackage.aooh.e(akzcVar, "EMPTY");
            defpackage.akzx akzxVarM = ykh.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            int i4 = i - 1;
            if (i4 == 0) {
                i3 = 10;
            } else if (i4 != 1) {
                i3 = i4 != 2 ? 12 : 9;
            } else {
                i3 = 11;
            }
            akzxVarM.u();
            ykh ykhVar = akzxVarM.b;
            ykhVar.c = i3 - 1;
            ykhVar.b |= 1;
            akzxVarM.u();
            ykh ykhVar2 = akzxVarM.b;
            ykhVar2.g = i2 - 1;
            ykhVar2.b |= 16;
            defpackage.alad aladVarR = akzxVarM.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            abavVarL.d(aazdVar, akzcVar, (ykh) aladVarR);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.aazf F(defpackage.aazd aazdVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aazf aazfVar = (defpackage.aazf) this.a.get(aazdVar.b);
        return aazfVar == null ? defpackage.aazf.a : aazfVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean G() {
        return ((defpackage.apnt) this.a.a()).b("com.google.android.dialer", "G__config_caller_id_enabled").e();
    }

    public final void a(defpackage.albh albhVar, int i) {
        defpackage.zzc zzcVarG = ((defpackage.zzd) this.a).g(albhVar);
        zzcVarG.m(i);
        zzcVarG.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
    public final acvo b() {
        return (acvo) this.a.eZ();
    }

    public final java.lang.String c(android.net.Uri uri) {
        return defpackage.aehj.P(uri, new defpackage.zzx(this.a, (byte[]) null)).getAbsolutePath();
    }

    public final /* synthetic */ defpackage.acuz d() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.acuz) aladVarR;
    }

    public final void e(long j) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acuz acuzVar = (defpackage.acuz) akzxVar.b;
        defpackage.acuz acuzVar2 = defpackage.acuz.a;
        acuzVar.b |= 4;
        acuzVar.e = j;
    }

    public final void f() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acuz acuzVar = (defpackage.acuz) akzxVar.b;
        defpackage.acuz acuzVar2 = defpackage.acuz.a;
        acuzVar.d = 2;
        acuzVar.b |= 2;
    }

    public final void g() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acuz acuzVar = (defpackage.acuz) akzxVar.b;
        defpackage.acuz acuzVar2 = defpackage.acuz.a;
        acuzVar.c = 0;
        acuzVar.b |= 1;
    }

    public final /* synthetic */ defpackage.acuw h() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.acuw) aladVarR;
    }

    public final void i(long j) {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.acuw acuwVar = (defpackage.acuw) ((defpackage.akzz) obj).b;
        defpackage.acuw acuwVar2 = defpackage.acuw.a;
        acuwVar.b |= 4;
        acuwVar.e = j;
    }

    public final void j(java.lang.String str) {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.acuw acuwVar = (defpackage.acuw) ((defpackage.akzz) obj).b;
        defpackage.acuw acuwVar2 = defpackage.acuw.a;
        j$.util.Objects.requireNonNull(str);
        acuwVar.b |= 16;
        acuwVar.f = str;
    }

    public final void k(java.lang.String str) {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.acuw acuwVar = (defpackage.acuw) ((defpackage.akzz) obj).b;
        defpackage.acuw acuwVar2 = defpackage.acuw.a;
        j$.util.Objects.requireNonNull(str);
        acuwVar.b |= 2;
        acuwVar.d = str;
    }

    public final void l() {
        java.lang.Object obj = this.a;
        ((defpackage.akzx) obj).u();
        defpackage.acuw acuwVar = (defpackage.acuw) ((defpackage.akzz) obj).b;
        defpackage.acuw acuwVar2 = defpackage.acuw.a;
        j$.util.Objects.requireNonNull("dobby_duplex_model");
        acuwVar.b |= 1;
        acuwVar.c = "dobby_duplex_model";
    }

    public final /* synthetic */ defpackage.acux m() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.acux) aladVarR;
    }

    public final void n(defpackage.acuz acuzVar) {
        if (acuzVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        j$.util.Objects.requireNonNull(acuzVar);
        acuxVar.g = acuzVar;
        acuxVar.b |= 2048;
    }

    public final void o(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        acuxVar.b |= 4;
        acuxVar.e = i;
    }

    public final void p(java.lang.String str) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        j$.util.Objects.requireNonNull(str);
        acuxVar.b |= 1;
        acuxVar.c = str;
    }

    public final void q(long j) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        acuxVar.b |= 512;
        acuxVar.f = j;
    }

    public final /* synthetic */ void r(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("values");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        acuxVar.c();
        defpackage.akyl.i(iterable, acuxVar.k);
    }

    public final /* synthetic */ void s(defpackage.acuw acuwVar) {
        if (acuwVar == null) {
            defpackage.aooh.i("value");
        }
        ((defpackage.akzx) this.a).ah(acuwVar);
    }

    public final /* synthetic */ void t() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.acux acuxVar = (defpackage.acux) akzxVar.b;
        defpackage.acux acuxVar2 = defpackage.acux.a;
        j$.util.Objects.requireNonNull("en-US");
        acuxVar.c();
        acuxVar.k.add("en-US");
    }

    public final /* synthetic */ void u() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.acux) ((defpackage.akzx) this.a).b).h);
        defpackage.aooh.e(listUnmodifiableList, "getFileList(...)");
        new defpackage.alct(listUnmodifiableList);
    }

    public final void v() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.acux) ((defpackage.akzx) this.a).b).k);
        defpackage.aooh.e(listUnmodifiableList, "getLocaleList(...)");
        new defpackage.alct(listUnmodifiableList);
    }

    public final defpackage.acmf w() {
        return new defpackage.acmf((defpackage.acmh) ((defpackage.akzx) this.a).r());
    }

    public final void x(defpackage.acme acmeVar) {
        java.lang.Object obj = this.a;
        defpackage.akzz akzzVar = (defpackage.akzz) obj;
        defpackage.apdi apdiVar = acmeVar.b;
        if (akzzVar.bU(apdiVar)) {
            throw new java.lang.IllegalStateException();
        }
        int iA = apdiVar.a();
        ((defpackage.akzx) obj).u();
        defpackage.acmh acmhVar = (defpackage.acmh) akzzVar.b;
        defpackage.acmh acmhVar2 = defpackage.acmh.a;
        defpackage.alak alakVar = acmhVar.d;
        if (!alakVar.c()) {
            acmhVar.d = alakVar.d(alakVar.size() << 1);
        }
        acmhVar.d.g(iA);
        akzzVar.bV(apdiVar, acmeVar.a);
    }

    public final long y() {
        j$.time.Instant.now().toEpochMilli();
        return -1L;
    }

    public final void z(defpackage.ackz ackzVar) {
        ((java.util.concurrent.atomic.AtomicReference) this.a).set(ackzVar);
    }

    public adae(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public adae(java.lang.Object obj) {
        this.a = obj;
    }

    public adae(byte[] bArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        C(new defpackage.absg("Main", 1, true, defpackage.absi.a)).d(android.os.Process.myPid());
    }

    public adae() {
        this.a = new java.util.concurrent.atomic.AtomicReference();
    }

    public adae(android.content.Context context, short[] sArr) {
        this.a = context.getApplicationContext();
    }

    public adae(defpackage.acvl acvlVar) {
        this.a = defpackage.ahvr.bI(new defpackage.rwp(acvlVar, 19));
    }

    public adae(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public adae(android.content.Context context, byte[] bArr) {
        java.util.List list = defpackage.zzd.m;
        defpackage.zza zzaVar = new defpackage.zza(context, "ICING");
        zzaVar.f = new defpackage.rma(this, 3);
        this.a = zzaVar.b();
    }
}
