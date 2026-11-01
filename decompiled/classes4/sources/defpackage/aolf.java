package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aolf implements java.io.Externalizable {
    private static final long serialVersionUID = 0;
    private java.util.Map a;

    public aolf(java.util.Map map) {
        this.a = map;
    }

    private final java.lang.Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.InvalidObjectException {
        aooh.f(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new java.io.InvalidObjectException(a.bj(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(a.bw((byte) 46, i, "Illegal size value: "));
        }
        aola aolaVar = new aola(i);
        for (int i2 = 0; i2 < i; i2++) {
            aolaVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = aolaVar.e();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        aooh.f(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public aolf() {
        this(aokd.a);
    }
}
