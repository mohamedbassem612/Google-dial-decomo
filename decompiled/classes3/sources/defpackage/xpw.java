package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public abstract class xpw implements defpackage.xpz {
    public final java.util.Map a = new java.util.LinkedHashMap();

    public final java.lang.Boolean a(java.lang.String str, boolean z) {
        java.lang.Object objAe;
        java.lang.Object objAe2;
        try {
            objAe = b(str);
        } catch (java.lang.Throwable th) {
            objAe = aooc.ae(th);
        }
        java.lang.Boolean boolValueOf = null;
        if (aoiw.c(objAe) != null) {
            if (z) {
                objAe = null;
            } else {
                try {
                    objAe = b(str + 'L');
                } catch (java.lang.Throwable th2) {
                    objAe = aooc.ae(th2);
                }
            }
        }
        boolean z2 = true;
        if (true == (objAe instanceof aoiv)) {
            objAe = null;
        }
        java.lang.Integer num = (java.lang.Integer) objAe;
        java.lang.Boolean boolValueOf2 = num != null ? java.lang.Boolean.valueOf(num.equals(1)) : null;
        if (boolValueOf2 != null) {
            return boolValueOf2;
        }
        try {
            objAe2 = d(str);
        } catch (java.lang.Throwable th3) {
            objAe2 = aooc.ae(th3);
        }
        if (aoiw.c(objAe2) != null) {
            try {
                objAe2 = d(str + 'L');
            } catch (java.lang.Throwable th4) {
                objAe2 = aooc.ae(th4);
            }
        }
        if (true == (objAe2 instanceof aoiv)) {
            objAe2 = null;
        }
        java.lang.String str2 = (java.lang.String) objAe2;
        if (str2 != null) {
            if (!aooh.n(str2, "1") && !aoov.s(str2, "true", true) && !aoov.s(str2, "on", true)) {
                z2 = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z2);
        }
        return boolValueOf;
    }

    protected abstract java.lang.Integer b(java.lang.String str);

    protected abstract java.lang.String c(defpackage.xhu xhuVar);

    protected abstract java.lang.String d(java.lang.String str);
}
