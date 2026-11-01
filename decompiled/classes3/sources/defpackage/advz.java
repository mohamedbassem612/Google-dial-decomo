package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class advz {
    public static final aiof a = aiof.i("GnpSdk");

    public static final /* synthetic */ defpackage.aksh a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (defpackage.aksh) alad.B(defpackage.aksh.a, bArr, akzq.a());
        } catch (alaz e) {
            hgb.b(a.c(), "Failed to parse AndroidPayload proto.", e);
            return null;
        }
    }
}
