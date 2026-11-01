package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aico extends defpackage.aicm implements java.util.ListIterator {
    final /* synthetic */ defpackage.aicp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aico(defpackage.aicp aicpVar, int i) {
        super(aicpVar, aicpVar.d().listIterator(i));
        j$.util.Objects.requireNonNull(aicpVar);
        this.d = aicpVar;
    }

    private final java.util.ListIterator b() {
        a();
        return (java.util.ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        defpackage.aicp aicpVar = this.d;
        boolean zIsEmpty = aicpVar.isEmpty();
        b().add(obj);
        aicpVar.f.b++;
        if (zIsEmpty) {
            aicpVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aico(defpackage.aicp aicpVar) {
        super(aicpVar);
        j$.util.Objects.requireNonNull(aicpVar);
        this.d = aicpVar;
    }
}
