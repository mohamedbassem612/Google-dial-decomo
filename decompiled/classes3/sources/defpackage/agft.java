package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agft {
    private static final xtq a = new xtq("Validations", (byte[]) null);

    public static void a(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (str == null) {
            a.z(java.lang.String.format("Input of %s cannot be null", str2));
        } else if (str.length() > i2 || str.length() < i) {
            a.z(java.lang.String.format("Length of \"%s\" should be in the range [%s-%s]", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }
}
