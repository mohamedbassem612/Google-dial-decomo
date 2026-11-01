package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahyh extends defpackage.ahyj {
    final /* synthetic */ defpackage.ahyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyh(defpackage.ahyj ahyjVar, defpackage.ahyj ahyjVar2) {
        super(ahyjVar2);
        j$.util.Objects.requireNonNull(ahyjVar);
        this.a = ahyjVar;
    }

    @Override // defpackage.ahyj
    public final java.lang.String b(java.lang.Iterable iterable) {
        return e(iterable.iterator());
    }

    @Override // defpackage.ahyj
    public final void c(java.lang.Appendable appendable, java.util.Iterator it) throws java.io.IOException {
        if (it == null) {
            throw new java.lang.NullPointerException("parts");
        }
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next != null) {
                appendable.append(this.a.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            if (next2 != null) {
                defpackage.ahyj ahyjVar = this.a;
                appendable.append(ahyjVar.c);
                appendable.append(ahyjVar.a(next2));
            }
        }
    }
}
