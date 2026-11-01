package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class zyy implements defpackage.zzn {
    public final defpackage.zyx a;
    public boolean b;
    public aiva c;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    protected java.util.ArrayList f;
    public java.util.ArrayList g;
    public java.util.Set h;
    public java.lang.String i;
    public java.lang.String j;
    public final defpackage.zzl k;
    public final defpackage.ajcq l;
    public defpackage.zzl m;
    public boolean n;
    public int o;
    public final defpackage.akzz p;

    protected zyy(defpackage.zyx zyxVar) {
        defpackage.akzz akzzVar = (defpackage.akzz) defpackage.amua.a.m();
        this.p = akzzVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.n = false;
        this.a = zyxVar;
        this.j = zyxVar.g;
        this.i = zyxVar.d;
        java.lang.Object applicationContext = zyxVar.e.getApplicationContext();
        defpackage.zzi zziVar = applicationContext instanceof defpackage.zzi ? (defpackage.zzi) applicationContext : (defpackage.zzi) defpackage.zzk.a.get();
        defpackage.zzl zzlVarA = zziVar != null ? zziVar.a() : null;
        if (zzlVarA == null) {
            this.k = null;
        } else {
            int i = zzlVarA.b;
            if (i == 2 || i == 3) {
                this.k = zzlVarA;
            } else {
                android.util.Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + java.lang.Integer.toString(i - 1) + " is not one of the process-level expected values: 1 or 2");
                this.k = null;
            }
        }
        this.l = zziVar != null ? zziVar.b() : null;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        akzzVar.u();
        defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
        amuaVar.b |= 1;
        amuaVar.c = jCurrentTimeMillis;
        long j = ((defpackage.amua) akzzVar.b).c;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long offset = ((long) java.util.TimeZone.getDefault().getOffset(j)) / 1000;
        akzzVar.u();
        defpackage.amua amuaVar2 = (defpackage.amua) akzzVar.b;
        amuaVar2.b |= 131072;
        amuaVar2.g = offset;
        if (!defpackage.abyl.h(zyxVar.e)) {
            akzzVar.u();
            defpackage.amua amuaVar3 = (defpackage.amua) akzzVar.b;
            amuaVar3.b |= 8388608;
            amuaVar3.i = true;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            akzzVar.u();
            defpackage.amua amuaVar4 = (defpackage.amua) akzzVar.b;
            amuaVar4.b |= 2;
            amuaVar4.d = jElapsedRealtime;
        }
    }

    public final long a() {
        return ((defpackage.amua) this.p.b).c;
    }

    public final long b() {
        return ((defpackage.amua) this.p.b).d;
    }

    public abstract com.google.android.gms.clearcut.LogEventParcelable c();

    public abstract defpackage.aaum d();

    public abstract defpackage.ajcq e(zyz zyzVar);

    public final void f(defpackage.zzl zzlVar) {
        defpackage.akzz akzzVar = this.p;
        defpackage.amuc amucVar = ((defpackage.amua) akzzVar.b).m;
        if (amucVar == null) {
            amucVar = defpackage.amuc.a;
        }
        defpackage.akzz akzzVar2 = (defpackage.akzz) amucVar.L();
        int i = zzlVar.b;
        akzzVar2.u();
        defpackage.amuc amucVar2 = (defpackage.amuc) akzzVar2.b;
        amucVar2.d = i - 1;
        amucVar2.b |= 2;
        alfq alfqVar = amucVar2.c;
        if (alfqVar == null) {
            alfqVar = alfq.a;
        }
        defpackage.akzx akzxVarL = alfqVar.L();
        alfp alfpVar = akzxVarL.b.c;
        if (alfpVar == null) {
            alfpVar = alfp.a;
        }
        int i2 = zzlVar.a;
        defpackage.akzx akzxVarL2 = alfpVar.L();
        akzxVarL2.u();
        alfp alfpVar2 = akzxVarL2.b;
        alfpVar2.b |= 1;
        alfpVar2.c = i2;
        akzxVarL.u();
        alfq alfqVar2 = akzxVarL.b;
        alfp alfpVarR = akzxVarL2.r();
        j$.util.Objects.requireNonNull(alfpVarR);
        alfqVar2.c = alfpVarR;
        alfqVar2.b |= 1;
        akzzVar2.u();
        defpackage.amuc amucVar3 = (defpackage.amuc) akzzVar2.b;
        alfq alfqVarR = akzxVarL.r();
        j$.util.Objects.requireNonNull(alfqVarR);
        amucVar3.c = alfqVarR;
        amucVar3.b |= 1;
        defpackage.amuc amucVar4 = (defpackage.amuc) akzzVar2.r();
        akzzVar.u();
        defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
        j$.util.Objects.requireNonNull(amucVar4);
        amuaVar.m = amucVar4;
        amuaVar.b |= 268435456;
    }

    public final void g(int[] iArr) {
        if (this.a.d()) {
            throw new java.lang.IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.f == null) {
            this.f = new java.util.ArrayList();
        }
        for (int i : iArr) {
            this.f.add(java.lang.Integer.valueOf(i));
        }
    }

    public final void h(java.lang.String str) {
        if (this.a.d()) {
            throw new java.lang.IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        java.util.ArrayList arrayList = this.e;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.e = arrayList;
        }
        arrayList.add(str);
    }

    public abstract void i(double d);

    public final void j(long j, long j2) {
        defpackage.akzz akzzVar = this.p;
        akzzVar.u();
        defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
        defpackage.amua amuaVar2 = defpackage.amua.a;
        amuaVar.b |= 1;
        amuaVar.c = j;
        akzzVar.u();
        defpackage.amua amuaVar3 = (defpackage.amua) akzzVar.b;
        amuaVar3.b |= 2;
        amuaVar3.d = j2;
        long j3 = amuaVar3.c;
        defpackage.acxg acxgVar = defpackage.zyx.l;
        long offset = java.util.TimeZone.getDefault().getOffset(j3);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        akzzVar.u();
        defpackage.amua amuaVar4 = (defpackage.amua) akzzVar.b;
        amuaVar4.b |= 131072;
        amuaVar4.g = offset / 1000;
    }

    public final void k(java.lang.String str) {
        if (!this.a.i.a(defpackage.zzw.ACCOUNT_NAME)) {
            throw new java.lang.IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.i = str;
    }

    public final int l() {
        int i = this.o;
        return i == 0 ? this.a.k : i;
    }

    public final void m(int i) {
        defpackage.akzz akzzVar = this.p;
        akzzVar.u();
        defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
        defpackage.amua amuaVar2 = defpackage.amua.a;
        amuaVar.b |= 32;
        amuaVar.e = i;
    }

    public void n() {
        synchronized (this.a) {
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        int iL = l();
        int i = iL - 1;
        if (iL == 0) {
            throw null;
        }
        sb.append(i);
        sb.append(", veMessage: ");
        sb.append(this.c);
        sb.append(", testCodes: ");
        java.util.ArrayList arrayList = this.d;
        sb.append(arrayList != null ? defpackage.zyx.b(arrayList) : null);
        sb.append(", mendelPackages: ");
        java.util.ArrayList arrayList2 = this.e;
        sb.append(arrayList2 != null ? defpackage.zyx.b(arrayList2) : null);
        sb.append(", experimentIds: ");
        java.util.ArrayList arrayList3 = this.f;
        sb.append(arrayList3 != null ? defpackage.zyx.b(arrayList3) : null);
        sb.append(", experimentTokens: ");
        java.util.ArrayList arrayList4 = this.g;
        sb.append(arrayList4 != null ? defpackage.zyx.b(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
