package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigp extends ailj {
    final java.util.Iterator a;
    java.util.Iterator b;
    final /* synthetic */ defpackage.aigt c;

    public aigp(defpackage.aigt aigtVar) {
        j$.util.Objects.requireNonNull(aigtVar);
        this.c = aigtVar;
        this.a = aigtVar.map.c().k();
        this.b = aiid.a;
    }

    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    public final java.lang.Object next() {
        if (!this.b.hasNext()) {
            this.b = ((aifo) this.a.next()).k();
        }
        return this.b.next();
    }
}
