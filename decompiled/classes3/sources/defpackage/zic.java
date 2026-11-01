package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zic implements zia {
    private final android.content.Context a;

    public zic(android.content.Context context) {
        this.a = context;
    }

    public final defpackage.zoe a(defpackage.zhx zhxVar) {
        if (new defpackage.zhx().equals(zhxVar)) {
            return new defpackage.zoe(this.a);
        }
        throw new java.lang.IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(zhxVar.toString()));
    }
}
