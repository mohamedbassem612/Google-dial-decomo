package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lvs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/contacts/displaypreference/ContactDisplayPreferencesImpl");
    private final android.content.Context b;
    private final defpackage.ahzi c;
    private final defpackage.ahzi d;
    private final defpackage.kaw e;
    private final defpackage.kaw f;

    public lvs(android.content.Context context) {
        this.b = context;
        this.e = new defpackage.kaw(defpackage.ahvr.bI(new defpackage.hlv(context, 14)));
        this.f = new defpackage.kaw(defpackage.ahvr.bI(new defpackage.hlv(context, 15)));
        this.c = defpackage.ahvr.bI(new defpackage.hlv(context, 16));
        this.d = defpackage.ahvr.bI(new defpackage.hlv(context, 17));
    }

    private final void d() {
        defpackage.ahzi ahziVar = this.c;
        java.lang.String str = (java.lang.String) ahziVar.eZ();
        defpackage.kaw kawVar = this.f;
        if (kawVar.k(str) || kawVar.k((java.lang.String) this.d.eZ())) {
            defpackage.kaw kawVar2 = this.e;
            java.lang.String str2 = (java.lang.String) ahziVar.eZ();
            int iL = kawVar.l((java.lang.String) ahziVar.eZ());
            android.content.Context context = this.b;
            kawVar2.i(str2, iL != 2 ? defpackage.mni.bL(lvo.a, context) : defpackage.mni.bL(lvo.b, context));
            defpackage.ahzi ahziVar2 = this.d;
            java.lang.String str3 = (java.lang.String) ahziVar2.eZ();
            int iL2 = kawVar.l((java.lang.String) ahziVar2.eZ());
            android.content.Context context2 = this.b;
            kawVar2.i(str3, iL2 != 2 ? defpackage.mni.bL(lvp.a, context2) : defpackage.mni.bL(lvp.b, context2));
            kawVar.j((java.lang.String) ahziVar.eZ());
            kawVar.j((java.lang.String) ahziVar2.eZ());
        }
    }

    public final lvo a() {
        d();
        defpackage.ahzi ahziVar = this.c;
        java.lang.String str = (java.lang.String) ahziVar.eZ();
        defpackage.kaw kawVar = this.e;
        if (!kawVar.k(str)) {
            return lvo.a;
        }
        return defpackage.mni.bK(this.b, lvo.values(), kawVar.m((java.lang.String) ahziVar.eZ()));
    }

    public final lvp b() {
        d();
        defpackage.ahzi ahziVar = this.d;
        java.lang.String str = (java.lang.String) ahziVar.eZ();
        defpackage.kaw kawVar = this.e;
        if (!kawVar.k(str)) {
            return lvp.a;
        }
        return defpackage.mni.bK(this.b, lvp.values(), kawVar.m((java.lang.String) ahziVar.eZ()));
    }

    public final /* synthetic */ java.lang.String c(java.lang.String str, java.lang.String str2) {
        int iOrdinal;
        if (android.text.TextUtils.isEmpty(str2) || (iOrdinal = a().ordinal()) == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return str2;
        }
        throw new java.lang.AssertionError("exhaustive switch");
    }
}
