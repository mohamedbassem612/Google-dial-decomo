package com.google.android.libraries.notifications.platform.entrypoints.accountchanged;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AccountChangedReceiver extends defpackage.advc {
    @Override // defpackage.advc
    public final defpackage.advd a(android.content.Context context) {
        aooh.f(context, "context");
        aoin aoinVar = (aoin) defpackage.adxj.a(context).gY().get("accountchanged");
        defpackage.advd advdVar = aoinVar != null ? (defpackage.advd) aoinVar.a() : null;
        if (advdVar != null) {
            return advdVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.advc
    public final defpackage.adve b(android.content.Context context) {
        aooh.f(context, "context");
        aoin aoinVar = (aoin) defpackage.adxj.a(context).gZ().get("accountchanged");
        defpackage.adve adveVar = aoinVar != null ? (defpackage.adve) aoinVar.a() : null;
        if (adveVar != null) {
            return adveVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.advc
    public final java.lang.String c() {
        return "accountchanged";
    }

    @Override // defpackage.advc
    public final boolean e(android.content.Context context) {
        aooh.f(context, "context");
        return false;
    }
}
