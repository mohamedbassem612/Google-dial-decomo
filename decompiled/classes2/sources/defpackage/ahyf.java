package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ahyf extends defpackage.ahxo implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.regex.Pattern a;

    public ahyf(java.util.regex.Pattern pattern) {
        ahvr.ci(pattern);
        this.a = pattern;
    }

    @Override // defpackage.ahxo
    public final uzx a(java.lang.CharSequence charSequence) {
        return new uzx(this.a.matcher(charSequence));
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
