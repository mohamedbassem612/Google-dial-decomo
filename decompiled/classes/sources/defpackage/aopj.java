package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aopj extends defpackage.aopk implements java.io.Serializable {
    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return aopi.a;
    }

    @Override // defpackage.aopk
    public final long a() {
        return defpackage.aopk.b.a();
    }

    @Override // defpackage.aopk
    public final long fw() {
        return defpackage.aopk.b.fw();
    }
}
