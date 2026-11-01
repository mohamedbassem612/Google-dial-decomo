package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aihp extends defpackage.aify {
    final /* synthetic */ defpackage.aihq a;

    public aihp(defpackage.aihq aihqVar) {
        j$.util.Objects.requireNonNull(aihqVar);
        this.a = aihqVar;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
