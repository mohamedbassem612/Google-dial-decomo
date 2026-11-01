package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aiiw extends aicw {
    final /* synthetic */ java.util.Map.Entry a;
    final /* synthetic */ aiiy b;

    public aiiw(java.util.Map.Entry entry, aiiy aiiyVar) {
        this.a = entry;
        this.b = aiiyVar;
    }

    public final java.lang.Object getKey() {
        return this.a.getKey();
    }

    public final java.lang.Object getValue() {
        java.util.Map.Entry entry = this.a;
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
