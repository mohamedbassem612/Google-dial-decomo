package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiel extends defpackage.aiem {
    public static final defpackage.aiel a = new defpackage.aiel();
    private static final long serialVersionUID = 0;

    private aiel() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.aiem
    /* JADX INFO: renamed from: a */
    public final int compareTo(defpackage.aiem aiemVar) {
        return aiemVar == this ? 0 : -1;
    }

    @Override // defpackage.aiem, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return compareTo((defpackage.aiem) obj);
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public final java.lang.String toString() {
        return "-∞";
    }
}
