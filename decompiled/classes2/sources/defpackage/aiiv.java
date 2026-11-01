package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiiv extends ailj {
    final /* synthetic */ java.util.Iterator a;

    public aiiv(java.util.Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
        ahvr.ci(entry);
        return new defpackage.aiiu(entry);
    }
}
