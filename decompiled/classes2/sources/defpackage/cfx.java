package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfx extends chd {
    public static final defpackage.cfx a = new defpackage.cfx();

    private cfx() {
        super(0, 4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) throws aoiq {
        defpackage.cck cckVar = (defpackage.cck) chgVar.c(2);
        defpackage.cck cckVar2 = (defpackage.cck) chgVar.c(3);
        caz cazVar = (caz) chgVar.c(1);
        defpackage.vk vkVarX = (defpackage.vk) chgVar.c(0);
        if (vkVarX == null && (vkVarX = cazVar.x(cckVar)) == null) {
            cax.a("Could not resolve state for movable content");
            throw new aoiq();
        }
        java.lang.Object obj = vkVarX.a;
        if (cfpVar.m > 0 || cfpVar.j(cfpVar.o + 1) != 1) {
            cax.b("Check failed");
        }
        int i = cfpVar.o;
        int i2 = cfpVar.h;
        int i3 = cfpVar.i;
        cfpVar.v(1);
        cfpVar.J();
        cfpVar.w();
        cfp cfpVarF = ((cfm) obj).f();
        try {
            java.util.List listY = den.Y(cfpVarF, 2, cfpVar, false, true, true);
            cfpVarF.x(true);
            cfpVar.y();
            cfpVar.V();
            cfpVar.o = i;
            cfpVar.h = i2;
            cfpVar.i = i3;
            cdh.c(cfpVar, listY, cckVar2.f);
        } catch (java.lang.Throwable th) {
            cfpVarF.x(false);
            throw th;
        }
    }
}
