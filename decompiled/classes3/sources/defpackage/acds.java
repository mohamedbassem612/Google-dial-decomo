package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acds implements defpackage.acdn {
    public static final aiof a = aiof.i("GnpSdk");
    public static final java.util.List b = ajsz.bb(new java.lang.String[]{"TooltipFragment", "PromoUiDialogFragment", "PermissionRequestFrag"});
    public final android.content.Context c;
    public final aoin d;
    public final acbd e;
    public final acal f;
    public final defpackage.acio g;
    public final defpackage.aciq h;
    public final defpackage.aciu i;

    public acds(android.content.Context context, aoin aoinVar, acbd acbdVar, acal acalVar, defpackage.acio acioVar, defpackage.aciq aciqVar, defpackage.aciu aciuVar, aazc aazcVar) {
        aooh.f(context, "context");
        aooh.f(aoinVar, "callbackManager");
        aooh.f(acbdVar, "promoEvalLogger");
        aooh.f(acalVar, "clearcutLogger");
        aooh.f(acioVar, "promoUiRenderer");
        aooh.f(aciqVar, "promotionsDisplayStateManager");
        aooh.f(aciuVar, "gnpInAppUiViewModel");
        aooh.f(aazcVar, "clock");
        this.c = context;
        this.d = aoinVar;
        this.e = acbdVar;
        this.f = acalVar;
        this.g = acioVar;
        this.h = aciqVar;
        this.i = aciuVar;
    }
}
