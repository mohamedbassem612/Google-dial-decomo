package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvx {
    public final android.content.Context a;
    public final defpackage.fxr b;
    public android.app.Activity c;
    public boolean d;
    public final na e;
    public boolean f;
    public final defpackage.vk g;

    public fvx(android.content.Context context) {
        if (context == null) {
            aooh.i("context");
        }
        this.a = context;
        this.b = new defpackage.fxr(this, new defpackage.dqk(this, 9));
        java.lang.Object obj = null;
        this.g = new defpackage.vk(context, (byte[]) null);
        java.util.Iterator itA = aooc.h(context, new defpackage.fvt(2)).a();
        while (itA.hasNext()) {
            java.lang.Object next = itA.next();
            if (((android.content.Context) next) instanceof android.app.Activity) {
                obj = next;
                break;
            }
        }
        this.c = (android.app.Activity) obj;
        this.e = new defpackage.fvw(this);
        this.f = true;
        defpackage.fwo fwoVar = this.b.m;
        fwoVar.d(new defpackage.fwg(fwoVar));
        this.b.m.d(new defpackage.fvp(this.a));
        new aoiy(new defpackage.dqk(this, 10));
    }

    public final int a() {
        aojw aojwVar = this.b.f;
        int i = 0;
        if (!aojwVar.isEmpty()) {
            java.util.Iterator it = aojwVar.iterator();
            while (it.hasNext()) {
                if (!(((defpackage.fvs) it.next()).a instanceof defpackage.fwe) && (i = i + 1) < 0) {
                    ajsz.bg();
                }
            }
        }
        return i;
    }

    public final defpackage.fvu b(defpackage.fwn fwnVar) {
        aooh.f(fwnVar, "navigator");
        return new defpackage.fvu(this, fwnVar);
    }

    public final defpackage.fwc c() {
        return this.b.e();
    }

    public final defpackage.fwe d() {
        return this.b.f();
    }

    public final defpackage.fwo e() {
        return this.b.m;
    }

    public final boolean f(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        android.app.Activity activity = this.c;
        if (activity == null) {
            return true;
        }
        if (intent.hasExtra("android.intent.extra.REFERRER") || intent.hasExtra("android.intent.extra.REFERRER_NAME")) {
            return false;
        }
        java.lang.String callingPackage = activity.getCallingPackage();
        if (callingPackage == null) {
            android.net.Uri referrer = activity.getReferrer();
            callingPackage = referrer != null ? referrer.getAuthority() : null;
        }
        return aooh.n(callingPackage, this.a.getPackageName());
    }

    public final void g(defpackage.fwc fwcVar, android.os.Bundle bundle, defpackage.fwj fwjVar) {
        this.b.o(fwcVar, bundle, fwjVar);
    }

    public final void h(java.lang.String str) {
        defpackage.fxr fxrVar = this.b;
        if (fxrVar.c == null) {
            throw new java.lang.IllegalArgumentException("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + fxrVar + '.');
        }
        defpackage.fwe fweVarG = fxrVar.g();
        defpackage.fwb fwbVarP = fweVarG.p(str, true, fweVarG);
        if (fwbVarP == null) {
            throw new java.lang.IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + fxrVar.c);
        }
        defpackage.fwc fwcVar = fwbVarP.a;
        android.os.Bundle bundleC = fwcVar.c(fwbVarP.b);
        if (bundleC == null) {
            bundleC = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        }
        android.net.Uri uriT = defpackage.hgt.T(defpackage.hgt.X(fwcVar.f()));
        aooh.f(uriT, "uri");
        aooh.f(uriT, "uri");
        defpackage.fwa fwaVar = new defpackage.fwa(uriT, null, null);
        defpackage.fvx fvxVar = fxrVar.a;
        android.content.Intent intent = new android.content.Intent();
        intent.setDataAndType(fwaVar.a, fwaVar.c);
        intent.setAction(fwaVar.b);
        gij.a(bundleC, "android-support-nav:controller:deepLinkIntent", intent);
        fxrVar.o(fwcVar, bundleC, null);
    }

    public final void i() {
        defpackage.fxr fxrVar = this.b;
        if (fxrVar.f.isEmpty()) {
            return;
        }
        defpackage.fwc fwcVarE = fxrVar.e();
        aooh.c(fwcVarE);
        if (fxrVar.m(fwcVarE.b(), true, false)) {
            fxrVar.t();
        }
    }
}
