package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aijq extends ailc {
    final /* synthetic */ aida a;

    public aijq(aida aidaVar) {
        j$.util.Objects.requireNonNull(aidaVar);
        this.a = aidaVar;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final java.util.Iterator iterator() {
        return this.a.e();
    }

    public final boolean remove(java.lang.Object obj) {
        return this.a.d(obj, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) > 0;
    }

    public final int size() {
        return this.a.j().size();
    }
}
