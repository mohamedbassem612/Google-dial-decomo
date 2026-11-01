package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amwp {
    public final int a;
    public final java.lang.Object b;

    public amwp(int i) {
        this.a = i;
        this.b = new defpackage.akgg(this, ((i << 2) / 3) + 1);
    }

    public static defpackage.amwp g(int i, anqw anqwVar) {
        if (i != 4 && i != 5) {
            i = 6;
        }
        ahvr.ci(anqwVar);
        return new defpackage.amwp(i, anqwVar);
    }

    public static defpackage.amwp k(defpackage.amwp amwpVar) {
        ahvr.bM(amwpVar.a == 5);
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = ((java.nio.ByteBuffer) amwpVar.b).asReadOnlyBuffer();
        return new defpackage.amwp(hgt.aC(byteBufferAsReadOnlyBuffer), byteBufferAsReadOnlyBuffer);
    }

    public final int a() {
        int i = 0;
        int i2 = 0;
        while (true) {
            amwo[] amwoVarArr = (amwo[]) this.b;
            if (i >= amwoVarArr.length) {
                return i2;
            }
            i2 += amwoVarArr[i].a;
            i++;
        }
    }

    public final int b() {
        return this.a * a();
    }

    public final java.lang.String c() {
        java.lang.Object obj = this.b;
        java.lang.String strA = ((ammp) obj).a("X-GUploader-UploadID");
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.String strConcat = strA == null ? "\n No upload id." : "\n Upload id: ".concat(strA);
        return "HttpResponse:\n   " + this.a + "  " + strValueOf + strConcat;
    }

    public final android.os.Bundle d() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("id", (java.lang.String) this.b);
        bundle.putFloat("radius", 0.8f);
        bundle.putInt("sensitivity", 1);
        bundle.putInt("granularity", 1);
        bundle.putInt(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY, this.a);
        return bundle;
    }

    public final synchronized java.lang.Object e(java.lang.Object obj) {
        return ((java.util.LinkedHashMap) this.b).get(obj);
    }

    public final synchronized void f(java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.LinkedHashMap) this.b).put(obj, obj2);
    }

    public final akow h(int i) {
        akzx akzxVarM = akow.a.m();
        akzx akzxVarM2 = defpackage.akpc.a.m();
        akzxVarM2.u();
        defpackage.akpc akpcVar = (defpackage.akpc) akzxVarM2.b;
        akpcVar.c = this.a - 1;
        akpcVar.b |= 1;
        akzxVarM.u();
        akow akowVar = akzxVarM.b;
        defpackage.akpc akpcVar2 = (defpackage.akpc) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akpcVar2);
        akowVar.d = akpcVar2;
        akowVar.c = 2;
        ahzh ahzhVar = (ahzh) this.b;
        ahzhVar.f();
        long jA = ahzhVar.a(java.util.concurrent.TimeUnit.MICROSECONDS);
        akzxVarM.u();
        akow akowVar2 = akzxVarM.b;
        akowVar2.b |= 1;
        akowVar2.e = jA;
        akzxVarM.u();
        akow akowVar3 = akzxVarM.b;
        akowVar3.b |= 4;
        akowVar3.g = i;
        return akzxVarM.p();
    }

    public final akow i(java.lang.Throwable th) {
        akov akovVar;
        akzx akzxVarM = akow.a.m();
        akzx akzxVarM2 = defpackage.akpc.a.m();
        akzxVarM2.u();
        defpackage.akpc akpcVar = (defpackage.akpc) akzxVarM2.b;
        akpcVar.c = this.a - 1;
        akpcVar.b |= 1;
        akzxVarM.u();
        akow akowVar = akzxVarM.b;
        defpackage.akpc akpcVar2 = (defpackage.akpc) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akpcVar2);
        akowVar.d = akpcVar2;
        akowVar.c = 2;
        ahzh ahzhVar = (ahzh) this.b;
        ahzhVar.f();
        long jA = ahzhVar.a(java.util.concurrent.TimeUnit.MICROSECONDS);
        akzxVarM.u();
        akow akowVar2 = akzxVarM.b;
        akowVar2.b |= 1;
        akowVar2.e = jA;
        akov akovVar2 = afmv.a;
        if (th instanceof zwj) {
            akzx akzxVarM3 = akov.a.m();
            akzxVarM3.u();
            akov akovVar3 = akzxVarM3.b;
            akovVar3.c = 16;
            akovVar3.b |= 1;
            int i = true != defpackage.zoe.C(th) ? 7 : 6;
            akzxVarM3.u();
            akov akovVar4 = akzxVarM3.b;
            akovVar4.d = i - 1;
            akovVar4.b |= 2;
            akovVar = (akov) akzxVarM3.p();
        } else if (th instanceof anqz) {
            int iA = aknx.a(((anqz) th).a.o.r);
            if (iA != 0) {
                akzx akzxVarM4 = akov.a.m();
                akzxVarM4.u();
                akov akovVar5 = akzxVarM4.b;
                akovVar5.c = iA - 1;
                akovVar5.b |= 1;
                akovVar = (akov) akzxVarM4.p();
            } else {
                akovVar = afmv.a;
            }
        } else if (th instanceof java.io.IOException) {
            akzx akzxVarM5 = akov.a.m();
            akzxVarM5.u();
            akov akovVar6 = akzxVarM5.b;
            akovVar6.c = 14;
            akovVar6.b |= 1;
            akovVar = (akov) akzxVarM5.p();
        } else {
            akovVar = afmv.a;
        }
        akzxVarM.u();
        akow akowVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akovVar);
        akowVar3.f = akovVar;
        akowVar3.b |= 2;
        return akzxVarM.p();
    }

    public final void j() {
        ((ahzh) this.b).e();
    }

    public amwp(int i, java.lang.Object obj, byte[] bArr) {
        this.a = i;
        this.b = obj;
    }

    public amwp(int i, byte[] bArr) {
        this.b = null;
        this.a = i;
    }

    public amwp(defpackage.ahup ahupVar) {
        this.a = 3;
        this.b = ahupVar;
    }

    public amwp(android.graphics.Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public amwp(android.net.Uri uri) {
        this.b = uri;
        this.a = 1;
    }

    public amwp(aonn aonnVar, int i) {
        this.b = aonnVar;
        this.a = i;
    }

    public amwp(java.lang.Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public amwp(byte[] bArr) {
        this.b = bArr;
        this.a = 0;
    }

    public amwp(int i, java.lang.Object obj) {
        this.a = i;
        this.b = obj;
    }

    public amwp(int i, defpackage.agff agffVar) {
        this.a = i;
        this.b = agffVar;
        if (i == 4) {
            anty.aI(agffVar, "CompatService cannot be null when state is connected");
        }
    }

    public amwp(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        aais.as(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    public amwp() {
        int iQ = a.Q(4);
        this.b = "com.android.dialer.ringing.OsloAction";
        this.a = iQ;
    }
}
