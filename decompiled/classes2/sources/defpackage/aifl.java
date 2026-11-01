package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aifl extends aigf implements j$.util.Map, defpackage.aidh {
    private static final long serialVersionUID = 912559;

    public static defpackage.aifl a(java.lang.Iterable iterable) {
        defpackage.aifj aifjVar = new defpackage.aifj(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        aifjVar.d(iterable);
        return aifjVar.c();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public abstract defpackage.aifl b();

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aihd values() {
        return b().f();
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aifk(this);
    }
}
