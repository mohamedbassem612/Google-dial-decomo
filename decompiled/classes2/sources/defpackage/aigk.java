package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigk extends ailj {
    final ailj a;
    final /* synthetic */ defpackage.aign b;

    public aigk(defpackage.aign aignVar) {
        j$.util.Objects.requireNonNull(aignVar);
        this.b = aignVar;
        this.a = aignVar.a.e().k();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final java.lang.Object next() {
        return ((java.util.Map.Entry) this.a.next()).getValue();
    }
}
