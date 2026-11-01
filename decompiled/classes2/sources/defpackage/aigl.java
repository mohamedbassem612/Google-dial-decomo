package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigl extends aify {
    final /* synthetic */ aify a;

    public aigl(defpackage.aign aignVar, aify aifyVar) {
        this.a = aifyVar;
        j$.util.Objects.requireNonNull(aignVar);
    }

    public final java.lang.Object get(int i) {
        return ((java.util.Map.Entry) this.a.get(i)).getValue();
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.a.size();
    }

    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
