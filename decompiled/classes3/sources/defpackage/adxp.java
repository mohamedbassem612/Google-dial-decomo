package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adxp implements defpackage.adxn {
    public static final java.security.SecureRandom a = new java.security.SecureRandom();
    public int A;
    public final java.lang.Throwable b;
    public final aduu c;
    public final adxz d;
    public final aedq e;
    public final aefe f;
    public aduy g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public defpackage.akqc k;
    public final java.util.List l;
    public long m;
    public java.lang.String n;
    public java.lang.String o;
    public java.lang.Long p;
    public java.lang.String q;
    public java.lang.String r;
    public final long s;
    public defpackage.adtm t;
    public java.lang.String u;
    public java.util.Set v;
    public final int w;
    public final int x;
    public int y;
    public final int z;

    public adxp(aazc aazcVar, int i, int i2, int i3, java.lang.Throwable th, aduu aduuVar, adxz adxzVar, aedq aedqVar, aefe aefeVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(aduuVar, "gnpConfig");
        aooh.f(adxzVar, "gnpEnvironment");
        aooh.f(aedqVar, "targetCreatorHelper");
        aooh.f(aefeVar, "requestUtil");
        this.w = i;
        this.x = i2;
        this.z = i3;
        this.b = th;
        this.c = aduuVar;
        this.d = adxzVar;
        this.e = aedqVar;
        this.f = aefeVar;
        this.l = new java.util.ArrayList();
        this.m = java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(j$.time.Instant.now().toEpochMilli());
        this.s = android.os.SystemClock.elapsedRealtime();
        this.v = aoke.a;
    }

    @Override // defpackage.adxn
    public final void a(defpackage.akqc akqcVar) {
        aooh.f(akqcVar, "gcmDeliveryMetadata");
        this.k = akqcVar;
    }

    @Override // defpackage.adxn
    public final void b(java.lang.String str) {
        aooh.f(str, "jobKey");
        this.q = str;
    }

    @Override // defpackage.adxn
    public final void c(aduy aduyVar) {
        if (aduyVar != null) {
            this.g = aduyVar;
            com.google.android.libraries.notifications.platform.registration.Gaia gaiaB = aduyVar.b();
            j$.util.Objects.checkIndex(0, 4);
            if (gaiaB instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                this.h = aduyVar.c;
                this.u = gaiaB.a;
            } else if (gaiaB instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
                this.u = aduyVar.d;
                this.i = ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) gaiaB).a;
                this.j = aduyVar.e;
            } else if (gaiaB instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
                this.p = java.lang.Long.valueOf(aduyVar.o);
            }
        }
    }

    @Override // defpackage.adxn
    public final void d(aksx aksxVar) {
        aooh.f(aksxVar, "feThread");
        java.lang.String str = aksxVar.e;
        aooh.e(str, "getIdentifier(...)");
        if (str.length() > 0) {
            java.util.List list = this.l;
            akzx akzxVarM = defpackage.akps.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.String str2 = aksxVar.e;
            aooh.e(str2, "getIdentifier(...)");
            aooh.f(str2, "value");
            akzxVarM.u();
            defpackage.akps akpsVar = (defpackage.akps) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akpsVar.b |= 1;
            akpsVar.c = str2;
            long j = aksxVar.i;
            akzxVarM.u();
            defpackage.akps akpsVar2 = (defpackage.akps) akzxVarM.b;
            akpsVar2.b |= 2;
            akpsVar2.d = j;
            long j2 = aksxVar.h;
            akzxVarM.u();
            defpackage.akps akpsVar3 = (defpackage.akps) akzxVarM.b;
            akpsVar3.b |= 4;
            akpsVar3.e = j2;
            java.lang.String str3 = (aksxVar.c == 12 ? (defpackage.aksk) aksxVar.d : defpackage.aksk.a).b;
            aooh.e(str3, "getGroupId(...)");
            aooh.f(str3, "value");
            akzxVarM.u();
            defpackage.akps akpsVar4 = (defpackage.akps) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            akpsVar4.b |= 8;
            akpsVar4.f = str3;
            defpackage.aksj aksjVar = (aksxVar.c == 12 ? (defpackage.aksk) aksxVar.d : defpackage.aksk.a).c;
            if (aksjVar == null) {
                aksjVar = defpackage.aksj.a;
            }
            java.lang.String str4 = aksjVar.b;
            aooh.e(str4, "getChannelId(...)");
            aooh.f(str4, "value");
            akzxVarM.u();
            defpackage.akps akpsVar5 = (defpackage.akps) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            akpsVar5.b |= 16;
            akpsVar5.g = str4;
            akzc akzcVar = aksxVar.n;
            aooh.e(akzcVar, "getOpaqueBackendData(...)");
            aooh.f(akzcVar, "value");
            akzxVarM.u();
            defpackage.akps akpsVar6 = (defpackage.akps) akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akpsVar6.b |= 128;
            akpsVar6.h = akzcVar;
            java.lang.String str5 = aksxVar.f;
            aooh.e(str5, "getTypeId(...)");
            if (str5.length() > 0) {
                java.lang.String str6 = aksxVar.f;
                aooh.e(str6, "getTypeId(...)");
                aooh.f(str6, "value");
                akzxVarM.u();
                defpackage.akps akpsVar7 = (defpackage.akps) akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                akpsVar7.b |= 512;
                akpsVar7.i = str6;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            list.add((defpackage.akps) aladVarP);
        }
        java.util.Set set = this.v;
        alak alakVar = aksxVar.o;
        aooh.e(alakVar, "getExperimentIdsList(...)");
        this.v = ajsz.aI(set, ajsz.cf(alakVar));
    }
}
