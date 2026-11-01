package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajlw extends ajsz {
    private final java.lang.String a;
    private final ajfe b;

    public ajlw(java.lang.String str, ajfe ajfeVar) {
        this.a = str;
        this.b = ajfeVar;
    }

    public final boolean dU() {
        return this.b != ajfe.d;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(typeUrl=%s, outputPrefixType=%s)", this.a, this.b.g);
    }
}
