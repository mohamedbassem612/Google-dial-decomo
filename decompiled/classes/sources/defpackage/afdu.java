package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdu implements defpackage.afdv {
    private static final java.lang.String a = "afdv";

    @Override // defpackage.afdv
    public final void a(defpackage.ahcc ahccVar) throws java.io.IOException {
        try {
            defpackage.aato.a((android.content.Context) ahccVar.b);
        } catch (defpackage.aacl e) {
            android.util.Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            defpackage.aabx.a.i((android.content.Context) ahccVar.b, e.a);
            int i = ahccVar.a;
            throw new java.io.IOException("Blocked unpatched use of SSL stack.", e);
        } catch (defpackage.aacm e2) {
            defpackage.aabx.a.i((android.content.Context) ahccVar.b, e2.a);
            int i2 = ahccVar.a;
            throw new java.io.IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}
