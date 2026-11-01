package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alda extends defpackage.alcw implements java.util.Set, j$.util.Set, aoow {
    private final java.util.Set a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alda(java.util.Set set) {
        super(set);
        aooh.f(set, "delegate");
        this.a = set;
    }

    @Override // defpackage.alcw, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return super.contains((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // defpackage.alcw, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.alcz(this.a.iterator());
    }

    @Override // defpackage.alcw, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Set.-CC.$default$spliterator(this);
    }
}
