package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cln implements java.util.Map.Entry, aooz {
    final /* synthetic */ defpackage.clo a;
    private final java.lang.Object b;
    private java.lang.Object c;

    public cln(defpackage.clo cloVar) {
        this.a = cloVar;
        java.util.Map.Entry entry = cloVar.c;
        aooh.c(entry);
        this.b = entry.getKey();
        java.util.Map.Entry entry2 = cloVar.c;
        aooh.c(entry2);
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        defpackage.clo cloVar = this.a;
        defpackage.clg clgVar = cloVar.a;
        if (clgVar.a() != cloVar.b) {
            throw new java.util.ConcurrentModificationException();
        }
        java.lang.Object obj2 = this.c;
        clgVar.put(this.b, obj);
        this.c = obj;
        return obj2;
    }
}
