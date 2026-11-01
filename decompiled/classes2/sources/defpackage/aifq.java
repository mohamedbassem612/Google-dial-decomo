package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aifq extends defpackage.aigd {
    private final transient java.util.EnumMap b;

    public aifq(java.util.EnumMap enumMap) {
        this.b = enumMap;
        ahvr.bM(!enumMap.isEmpty());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // defpackage.aigd
    public final ailj a() {
        return new defpackage.aiiv(this.b.entrySet().iterator());
    }

    public final boolean containsKey(java.lang.Object obj) {
        return this.b.containsKey(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aifq) {
            obj = ((defpackage.aifq) obj).b;
        }
        return this.b.equals(obj);
    }

    public final ailj fq() {
        return ahvr.aV(this.b.keySet().iterator());
    }

    public final boolean fr() {
        return false;
    }

    public final java.lang.Object get(java.lang.Object obj) {
        return this.b.get(obj);
    }

    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.aigd
    public java.lang.Object writeReplace() {
        return new defpackage.aifp(this.b);
    }
}
