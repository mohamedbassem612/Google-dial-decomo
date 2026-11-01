package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tmc implements rrz {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/promo/marquee/SharpieFollowUpPromoMarquee");
    public final android.content.Context b;
    public final aoss c;
    public final rlv d;
    public final ipc e;
    public final aogc f;
    private final aoin g;
    private final aoin h;
    private final rsd i;
    private final rsb j;

    public tmc(android.content.Context context, aogc aogcVar, ipc ipcVar, aoss aossVar, rlv rlvVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aogcVar, "sharpieSettings");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMarqueeDynamicLocale");
        aooh.f(aoinVar2, "enableSharpieFollowUpPromoInclusiveBody");
        this.b = context;
        this.f = aogcVar;
        this.e = ipcVar;
        this.c = aossVar;
        this.d = rlvVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.i = rsd.a;
        this.j = new rsb(new defpackage.rsm(90));
    }

    public final rsb a() {
        return this.j;
    }

    public final rsd b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tmb tmbVar;
        defpackage.trv trvVar;
        defpackage.rsp rspVar;
        defpackage.rrx rrxVar;
        pez rsfVar;
        if (aolnVar instanceof defpackage.tmb) {
            tmbVar = (defpackage.tmb) aolnVar;
            int i = tmbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmbVar.c = i - Integer.MIN_VALUE;
            } else {
                tmbVar = new defpackage.tmb(this, aolnVar);
            }
        } else {
            tmbVar = new defpackage.tmb(this, aolnVar);
        }
        java.lang.Object objAu = tmbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tmbVar.c;
        if (i2 == 0) {
            aooc.af(objAu);
            aogc aogcVar = this.f;
            defpackage.trv trvVar2 = defpackage.trv.a;
            tmbVar.d = trvVar2;
            tmbVar.c = 1;
            objAu = aogcVar.au(tmbVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            trvVar = trvVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trvVar = tmbVar.d;
            aooc.af(objAu);
        }
        if (trvVar.a((tru) objAu)) {
            return null;
        }
        int i3 = true != ((java.lang.Boolean) this.h.a()).booleanValue() ? 2132020104 : 2132020105;
        aoin aoinVar = this.g;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rspVar = new defpackage.rsp(new defpackage.rse(2132020106, null));
        } else {
            java.lang.String string = this.b.getString(2132020106);
            aooh.e(string, "getString(...)");
            rspVar = new defpackage.rsp(new defpackage.rsf(string));
        }
        defpackage.rry rryVar = new defpackage.rry(abja.ff);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rrxVar = new defpackage.rrx(new defpackage.rse(i3, null));
        } else {
            java.lang.String string2 = this.b.getString(i3);
            aooh.e(string2, "getString(...)");
            rrxVar = new defpackage.rrx(new defpackage.rsf(string2));
        }
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar = new defpackage.rse(2132020103, null);
        } else {
            java.lang.String string3 = this.b.getString(2132020103);
            aooh.e(string3, "getString(...)");
            rsfVar = new defpackage.rsf(string3);
        }
        return new defpackage.rsk(rspVar, rryVar, rrxVar, new defpackage.rsa(rsfVar, new sky(this, 9)));
    }

    public final void f() {
        a.b().l("com/android/dialer/sharpie/impl/promo/marquee/SharpieFollowUpPromoMarquee", "onClose", 66, "SharpieFollowUpPromoMarquee.kt").v("Sharpie follow-up promo closed");
        this.d.o(rmx.tN);
    }

    public final void g() {
        a.b().l("com/android/dialer/sharpie/impl/promo/marquee/SharpieFollowUpPromoMarquee", "onShown", 61, "SharpieFollowUpPromoMarquee.kt").v("Sharpie follow-up promo shown");
        this.d.o(rmx.tL);
    }
}
