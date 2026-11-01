package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihi extends aify {
    final /* synthetic */ defpackage.aihj a;

    public aihi(defpackage.aihj aihjVar) {
        j$.util.Objects.requireNonNull(aihjVar);
        this.a = aihjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        defpackage.aihl aihlVar = this.a.a;
        return new java.util.AbstractMap.SimpleImmutableEntry(aihlVar.c.d.get(i), aihlVar.d.get(i));
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.a.a.size();
    }

    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
