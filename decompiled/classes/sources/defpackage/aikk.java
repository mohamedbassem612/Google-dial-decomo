package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikk extends defpackage.aihq {
    final /* synthetic */ defpackage.aikm a;

    public aikk(defpackage.aikm aikmVar) {
        j$.util.Objects.requireNonNull(aikmVar);
        this.a = aikmVar;
    }

    @Override // defpackage.aihq
    public final java.lang.Object a(int i) {
        return this.a.b.i(i);
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }

    @Override // defpackage.aihq, defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
