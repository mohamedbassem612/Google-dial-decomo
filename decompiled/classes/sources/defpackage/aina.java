package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aina extends defpackage.ainp {
    public aina(java.lang.Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.ainp
    public final void a(java.util.Iterator it, defpackage.aino ainoVar) {
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!it.hasNext()) {
                ainoVar.a(this.a, next);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            java.lang.String str = this.a;
            sb.append(']');
            ainoVar.a(str, sb.toString());
        }
    }
}
