package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aldc extends defpackage.alcw implements java.util.Set, j$.util.Set, aoow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldc(java.util.Collection collection) {
        super(collection);
        aooh.f(collection, "delegate");
    }

    @Override // defpackage.alcw, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Set.-CC.$default$spliterator(this);
    }
}
