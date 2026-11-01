package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aihq extends defpackage.aihd {
    public abstract java.lang.Object a(int i);

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.aihd
    public final defpackage.aify h() {
        return new defpackage.aihp(this);
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public defpackage.ailj iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
