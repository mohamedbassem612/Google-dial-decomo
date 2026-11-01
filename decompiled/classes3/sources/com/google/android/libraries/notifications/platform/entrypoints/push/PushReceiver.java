package com.google.android.libraries.notifications.platform.entrypoints.push;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class PushReceiver extends defpackage.advc {
    static {
        aiof.i("GnpSdk");
    }

    @Override // defpackage.advc
    public final defpackage.advd a(android.content.Context context) {
        aooh.f(context, "context");
        aoin aoinVar = (aoin) defpackage.adxj.a(context).gY().get("push");
        defpackage.advd advdVar = aoinVar != null ? (defpackage.advd) aoinVar.a() : null;
        if (advdVar != null) {
            return advdVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.advc
    public final defpackage.adve b(android.content.Context context) {
        aooh.f(context, "context");
        aoin aoinVar = (aoin) defpackage.adxj.a(context).gZ().get("push");
        defpackage.adve adveVar = aoinVar != null ? (defpackage.adve) aoinVar.a() : null;
        if (adveVar != null) {
            return adveVar;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.advc
    public final java.lang.String c() {
        return "push";
    }

    @Override // defpackage.advc
    public final boolean e(android.content.Context context) {
        aooh.f(context, "context");
        return defpackage.adxj.a(context).ew().g || anft.c();
    }
}
