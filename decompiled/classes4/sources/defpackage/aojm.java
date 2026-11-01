package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aojm extends aojl implements java.util.ListIterator, aoow {
    final /* synthetic */ aojo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aojm(aojo aojoVar, int i) {
        super(aojoVar);
        this.c = aojoVar;
        a.ak(i, aojoVar.a());
        ((aojl) this).a = i;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a.am();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((aojl) this).a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((aojl) this).a;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        aojo aojoVar = this.c;
        int i = ((aojl) this).a - 1;
        ((aojl) this).a = i;
        return aojoVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((aojl) this).a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        a.am();
    }
}
