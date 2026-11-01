package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigj extends aihq {
    private final aigf a;

    public aigj(aigf aigfVar) {
        this.a = aigfVar;
    }

    public final java.lang.Object a(int i) {
        return ((java.util.Map.Entry) this.a.e().g().get(i)).getKey();
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return k();
    }

    public final ailj k() {
        return this.a.fq();
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.a.size();
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aigi(this.a);
    }
}
