package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigo extends ailj {
    final java.util.Iterator a;
    java.lang.Object b;
    java.util.Iterator c;
    final /* synthetic */ defpackage.aigt d;

    public aigo(defpackage.aigt aigtVar) {
        j$.util.Objects.requireNonNull(aigtVar);
        this.d = aigtVar;
        this.a = aigtVar.map.e().k();
        this.b = null;
        this.c = aiid.a;
    }

    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!this.c.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((aifo) entry.getValue()).k();
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(this.b), this.c.next());
    }
}
