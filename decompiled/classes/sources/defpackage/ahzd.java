package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahzd implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence a;
    final /* synthetic */ defpackage.ahzf b;

    public ahzd(defpackage.ahzf ahzfVar, java.lang.CharSequence charSequence) {
        this.a = charSequence;
        j$.util.Objects.requireNonNull(ahzfVar);
        this.b = ahzfVar;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.b.i(this.a);
    }

    public final java.lang.String toString() {
        defpackage.ahyj ahyjVar = new defpackage.ahyj(", ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        ahyjVar.h(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
