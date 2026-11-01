package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amdx {
    public java.lang.Object a;

    public amdx(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = com.google.android.material.behavior.SwipeDismissBehavior.f(0.1f);
        swipeDismissBehavior.e = com.google.android.material.behavior.SwipeDismissBehavior.f(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public final amdy a() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return new amdy((amgf) obj);
        }
        throw new java.lang.IllegalStateException("Missing required properties: voiceIvrOption");
    }

    public final void b(amgf amgfVar) {
        if (amgfVar == null) {
            throw new java.lang.NullPointerException("Null voiceIvrOption");
        }
        this.a = amgfVar;
    }

    public final amdw c() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return new amdw((amgc) obj);
        }
        throw new java.lang.IllegalStateException("Missing required properties: ivrOption");
    }

    public final void d(amgc amgcVar) {
        if (amgcVar == null) {
            throw new java.lang.NullPointerException("Null ivrOption");
        }
        this.a = amgcVar;
    }

    public final amdv e() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return new amdv((amfp) obj);
        }
        throw new java.lang.IllegalStateException("Missing required properties: amInfo");
    }

    public final void f(amfp amfpVar) {
        if (amfpVar == null) {
            throw new java.lang.NullPointerException("Null amInfo");
        }
        this.a = amfpVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.Future] */
    public final void g() {
        java.lang.Object agzsVar;
        afec.c();
        ahvr.cj(this.a, "LocalSubscriptionStateReference used after free.");
        defpackage.agzr agzrVar = (defpackage.agzr) this.a;
        ahyn ahynVar = agzrVar.b;
        ahvr.bZ(ahynVar.f(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            agzsVar = new defpackage.agzt(aiql.H((java.util.concurrent.Future) ahynVar.b()));
        } catch (java.util.concurrent.ExecutionException e) {
            agzsVar = new defpackage.agzs(e.getCause());
        }
        this.a = new defpackage.agzr(agzrVar.a, ahwt.a, ahyn.h(agzsVar), agzrVar.d);
    }

    public final void h() {
        this.a = null;
    }

    public final int i(android.content.Context context) {
        if (this.a == null) {
            try {
                this.a = java.lang.Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                this.a = -1;
            }
        }
        return ((java.lang.Integer) this.a).intValue();
    }

    public final ynh j() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return new ynh((java.lang.String) obj);
        }
        throw new java.lang.IllegalStateException("Missing required properties: modelVersion");
    }

    public final void k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null modelVersion");
        }
        this.a = str;
    }

    public final void l(boolean z) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        uzxVarCu.U(z);
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void m(jxb jxbVar) {
        aooh.f(jxbVar, "data");
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        uzxVarCu.V(jxbVar);
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void n(java.lang.String str) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        if (str != null) {
            akzx akzxVar = (akzx) uzxVarCu.a;
            akzxVar.u();
            defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            zsfVar.b |= 64;
            zsfVar.h = str;
        } else {
            akzx akzxVar2 = (akzx) uzxVarCu.a;
            akzxVar2.u();
            defpackage.zsf zsfVar2 = (defpackage.zsf) akzxVar2.b;
            zsfVar2.b &= -65;
            zsfVar2.h = defpackage.zsf.a.h;
        }
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void o(defpackage.abvz abvzVar) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        if (abvzVar != null) {
            uzxVarCu.W(abvzVar);
        } else {
            akzx akzxVar = (akzx) uzxVarCu.a;
            akzxVar.u();
            defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
            zsfVar.o = null;
            zsfVar.b &= -1025;
        }
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void p(boolean z) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        uzxVarCu.Z();
        uzxVarCu.Y("android.telecom.extra.START_CALL_WITH_RTT", z);
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void q(boolean z) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        akzx akzxVar = (akzx) uzxVarCu.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        zsfVar.b |= 8;
        zsfVar.f = z;
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void r(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        if (phoneAccountHandle != null) {
            zoeVarCi.c(aehj.cg(phoneAccountHandle));
        } else {
            akzx akzxVar = (akzx) zoeVarCi.a;
            akzxVar.u();
            defpackage.zrx zrxVar = (defpackage.zrx) akzxVar.b;
            zrxVar.g = null;
            zrxVar.b &= -9;
        }
        this.a = zoeVarCi.a();
    }

    public final void s(java.lang.String str) {
        aooh.f(str, "number");
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        java.lang.String string = android.net.Uri.fromParts("tel", str, null).toString();
        aooh.e(string, "toString(...)");
        zoeVarCi.e(string);
        this.a = zoeVarCi.a();
    }

    public final void t(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        java.lang.String string = android.net.Uri.fromParts("voicemail", "", null).toString();
        aooh.e(string, "toString(...)");
        zoeVarCi.e(string);
        if (phoneAccountHandle != null) {
            zoeVarCi.c(aehj.cg(phoneAccountHandle));
        }
        this.a = zoeVarCi.a();
    }

    public final void u(int i) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        uzxVarCu.aa(i);
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public final void v(int i) {
        defpackage.zoe zoeVarCi = aehj.ci(((alad) this.a).p());
        defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
        jhw jhwVarL = hmr.l(uzxVarCu.S().p());
        jhwVarL.C(i);
        uzxVarCu.V(jhwVarL.B());
        zoeVarCi.d(uzxVarCu.T());
        this.a = zoeVarCi.a();
    }

    public amdx(defpackage.agja agjaVar) {
        this.a = agjaVar;
    }

    public amdx(java.lang.Object obj) {
        this.a = obj;
    }

    public amdx(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = "MARKER_NOT_CALLED";
    }

    public amdx(char[] cArr, byte[] bArr, byte[] bArr2) {
        defpackage.zrx zrxVar = defpackage.zrx.a;
        aooh.e(zrxVar, "getDefaultInstance(...)");
        this.a = zrxVar;
    }

    public amdx() {
    }
}
